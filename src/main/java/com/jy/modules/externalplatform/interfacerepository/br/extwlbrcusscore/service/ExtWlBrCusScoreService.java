package com.jy.modules.externalplatform.interfacerepository.br.extwlbrcusscore.service;

import com.alibaba.fastjson.JSONObject;
import com.jy.modules.externalplatform.interfacerepository.br.extwlbrcusscore.dao.ExtWlBrCusScoreDao;
import com.jy.modules.externalplatform.interfacerepository.br.extwlbrcusscore.dto.BrCusScoreEnum;
import com.jy.modules.externalplatform.interfacerepository.br.extwlbrcusscore.dto.ExtWlBrCusScoreDTO;
import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtsearch.service.ExtWlZxtSearchService;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.BaseDTO;
import com.jy.platform.core.common.JYLoggerUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @className: ExtWlBrCusScoreService
 * @package: com.jy.modules.externalplatform.interfacerepository.br.extwlbrcusscore.service
 * @describe: 定义  百融_客群评分 实现类
 * @auther: 董康宁
 * @date: 2017/12/19
 * @time: 20:38
 */
@Service("com.jy.modules.externalplatform.interfacerepository.br.extwlbrcusscore.service.ExtWlBrCusScoreService")
public class ExtWlBrCusScoreService implements Serializable, ExtSaveMessageDao {

    private static final long serialVersionUID = 1L;
	private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	static Logger logger = LoggerFactory.getLogger(ExtWlZxtSearchService.class);

	@Autowired
	ExtInterfaceLogService extInterfaceLogService;
    
	@Autowired
	private ExtWlBrCusScoreDao dao;


	/**
	 * @methodName: insertExtWlBrCusScore
	 * @param: [dto]
	 * @describe: 新增 百融_客群评分对象
	 * @auther: 董康宁
	 * @date: 2018/1/24
	 * @time: 16:04
	 */
	@SuppressWarnings("all")
	public Long insertExtWlBrCusScore(ExtWlBrCusScoreDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlBrCusScore(paramMap);
		
		ExtWlBrCusScoreDTO resultDto = (ExtWlBrCusScoreDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}

	/**
	 * @methodName: saveMessage
	 * @param: [map]
	 * @describe: 百融_客群评分 数据落地
	 * @auther: 董康宁
	 * @date: 2017/12/19
	 * @time: 20:39
	 */
	@Override
	public void saveMessage(Map<String, Object> map) {
		String isSuccess = "0";//是否调用成功  1：成功 0：失败
		String retCode = "";//接口返回码
		String retMsg = "";//接口返回信息
		String fkBizId = "";//接口落地数据主表ID
		//日志信息
		ExtInterfaceLogDTO interfaceLogDto=(ExtInterfaceLogDTO) map.get("interfaceLogDto");
		String result = String.valueOf(map.get("result"));

		try {
			String intoCustomerRefId  = "";
			if(null != map.get("intoCustomerRefId"))
				intoCustomerRefId = String.valueOf(map.get("intoCustomerRefId"));

			if(StringUtils.isEmpty(result)){
				interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				interfaceLogDto.setRetMsg("查询百融_客群评分查询获取接口返回报文为空！");
			}else if(result.contains("Read timed out")){
				interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				interfaceLogDto.setRetMsg("查询百融_客群评分查询获取接口 访问超时！");
			}else{

				//将返回报文转换为jsonObject 对象
				JSONObject resultJson = JSONObject.parseObject(result);

				//设置 返回码
				retCode = resultJson.getString("code");//返回码
                retMsg = BrCusScoreEnum.getValueByKey(retCode);

				//保存 百融_评分
				ExtWlBrCusScoreDTO dto = new ExtWlBrCusScoreDTO();
				if(StringUtils.isNotEmpty(intoCustomerRefId))
					dto.setIntoCustRefId(Long.parseLong(intoCustomerRefId));
				dto.setCode(resultJson.getString("code"));
				dto.setSwiftNumber(resultJson.getString("swift_number"));
				dto.setFlagScore(resultJson.getString("flag_score"));
                dto.setScorelargecashv1(resultJson.getString("scorelargecashv1"));
				dto.setScorelargecashv2(resultJson.getString("scorelargecashv2"));
				dto.setCreateBy(-1L);

				//插入 百度_PREA信用分表
				Long keyId  = this.insertExtWlBrCusScore(dto);
				if(null != keyId)
					fkBizId = keyId.toString();

				//00 查询成功  100002 匹配结果为空
				if("00".equals(retCode)){
					isSuccess = "1";

					interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
					interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_1.getValue());

				}else if("100002".equals(retCode)){//匹配结果为空

					interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_2.getKey());
					interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_2.getValue());

				}else{

					interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_5.getKey());
					interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_5.getValue());
				}
			}

		} catch (Exception ex) {
			JYLoggerUtil.error(this.getClass(), "===查询百融_客群评分查询获取接口异常===接口交易流水号:"+interfaceLogDto.getReqTransNo(), ex);
			interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4.getKey());
			interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_4.getValue());

		} finally{
			try {
				interfaceLogDto.setRetBody(result);
				interfaceLogDto.setExt2(isSuccess);
				interfaceLogDto.setExt3(retCode);
				interfaceLogDto.setExt4(retMsg);
				interfaceLogDto.setExt5(fkBizId);
				Long keyId = extInterfaceLogService.insertExtInterfaceLog(interfaceLogDto);
			} catch (Exception e) {
				JYLoggerUtil.error(this.getClass(), "===保存百融_客群评分查询获取日志异常===接口交易流水号:"+interfaceLogDto.getReqTransNo(), e);
			}
		}
	}
}

