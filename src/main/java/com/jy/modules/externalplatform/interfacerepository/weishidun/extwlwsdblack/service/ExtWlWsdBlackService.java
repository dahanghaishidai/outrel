package com.jy.modules.externalplatform.interfacerepository.weishidun.extwlwsdblack.service;
import java.io.Serializable;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jy.modules.externalplatform.interfacerepository.br.extwlbrcusscore.dto.ExtWlBrCusScoreDTO;
import com.jy.modules.externalplatform.interfacerepository.weishidun.extwlwsdblackdetail.dto.ExtWlWsdBlackDetailDTO;
import com.jy.modules.externalplatform.interfacerepository.weishidun.extwlwsdblackdetail.service.ExtWlWsdBlackDetailService;
import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtsearch.service.ExtWlZxtSearchService;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.JYLoggerUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.weishidun.extwlwsdblack.dto.ExtWlWsdBlackDTO;
import com.jy.modules.externalplatform.interfacerepository.weishidun.extwlwsdblack.dao.ExtWlWsdBlackDao;

/**
 * @className: ExtWlWsdBlackService
 * @package: com.jy.modules.externalplatform.interfacerepository.weishidun.extwlwsdblack.service
 * @describe: 定义  维氏盾个人黑名单主表 实现类
 * @auther: 董康宁
 * @date: 2017/12/19
 * @time: 20:48
 */
@Service("com.jy.modules.externalplatform.interfacerepository.weishidun.extwlwsdblack.service.ExtWlWsdBlackService")
public class ExtWlWsdBlackService implements Serializable, ExtSaveMessageDao {

    private static final long serialVersionUID = 1L;
	private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	static Logger logger = LoggerFactory.getLogger(ExtWlZxtSearchService.class);

	@Autowired
	ExtInterfaceLogService extInterfaceLogService;

	@Autowired
	ExtWlWsdBlackDetailService extWlWsdBlackDetailService;

	@Autowired
	private ExtWlWsdBlackDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 维氏盾个人黑名单主表列表
     * @date 2017-12-19 20:14:25
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlWsdBlackDTO> searchExtWlWsdBlackByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlWsdBlackDTO> dataList =  dao.searchExtWlWsdBlackByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询维氏盾个人黑名单主表列表
     * @date 2017-12-19 20:14:25
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlWsdBlackDTO> searchExtWlWsdBlack(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlWsdBlackDTO> dataList = dao.searchExtWlWsdBlack(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询维氏盾个人黑名单主表对象
     * @date 2017-12-19 20:14:25
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlWsdBlackDTO queryExtWlWsdBlackByPrimaryKey(String id) throws Exception {
		
		ExtWlWsdBlackDTO dto = dao.findExtWlWsdBlackByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlWsdBlackDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlWsdBlack
     * @author Administrator
     * @description: 新增 维氏盾个人黑名单主表对象
     * @date 2017-12-19 20:14:25
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlWsdBlack(ExtWlWsdBlackDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlWsdBlack(paramMap);
		
		ExtWlWsdBlackDTO resultDto = (ExtWlWsdBlackDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlWsdBlack
     * @author Administrator
     * @description: 修改 维氏盾个人黑名单主表对象
     * @date 2017-12-19 20:14:25
     * @param dto
     * @return
     * @throws
     */
	public void updateExtWlWsdBlack(ExtWlWsdBlackDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlWsdBlack(paramMap);
	}
	/**
     * @title: deleteExtWlWsdBlackByPrimaryKey
     * @author Administrator
     * @description: 删除 维氏盾个人黑名单主表,按主键
     * @date 2017-12-19 20:14:25
     * @param baseDto, ids
     * @throws
     */ 
	public void deleteExtWlWsdBlackByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlWsdBlackByPrimaryKey(paramMap);
	}

	/**
	 * @methodName: saveMessage
	 * @param: [map]
	 * @describe: 维氏盾_个人黑名单 数据落地
	 * @auther: 董康宁
	 * @date: 2017/12/19
	 * @time: 20:48
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

			if(StringUtils.isEmpty(result)){
				interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				interfaceLogDto.setRetMsg("查询维氏盾_个人黑名单查询获取接口返回报文为空！");
			}else if(result.contains("Read timed out")){
				interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				interfaceLogDto.setRetMsg("查询维氏盾_个人黑名单查询获取接口 访问超时！");
			}else{

				//将返回报文转换为jsonObject 对象
				JSONObject resultJson = JSONObject.parseObject(result);

				//设置 返回码
				retCode = resultJson.getString("CODE");//调用结果代码  0 代表成功
				retMsg = resultJson.getString("MESSAGE");//调用描述信息

				//保存 维氏盾_个人黑名单信息主表
				ExtWlWsdBlackDTO dto = new ExtWlWsdBlackDTO();
				dto.setCode(retCode);
				dto.setMessage(retMsg);
				dto.setCreateBy(-1L);

				//插入 维氏盾个人黑名单主表
				Long keyId  = this.insertExtWlWsdBlack(dto);
				if(null != keyId)
					fkBizId = keyId.toString();

				//0 查询成功
				if("0".equals(retCode)){
					isSuccess = "1";

					if(null != resultJson.get("data")){
						JSONArray dataArray = resultJson.getJSONArray("data");
						for(int i = 0; i < dataArray.size(); i ++){
							JSONObject dataObj = dataArray.getJSONObject(i);

							//维氏盾个人黑名单详细信息
							ExtWlWsdBlackDetailDTO detailDTO = new ExtWlWsdBlackDetailDTO();
							detailDTO.setFkId(keyId);
							detailDTO.setOverdueDate(dataObj.getString("overdue_date"));
							detailDTO.setOverdueDays(dataObj.getString("overdue_days"));
							detailDTO.setLegalState(dataObj.getString("legal_state"));
							detailDTO.setType(dataObj.getString("type"));
							detailDTO.setOverdueAmount(dataObj.getString("overdue_amount"));
							detailDTO.setCreateBy(-1L);

							extWlWsdBlackDetailService.insertExtWlWsdBlackDetail(detailDTO);
						}

					}

					interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
					interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_1.getValue());

				}else{

					interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_5.getKey());
					interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_5.getValue());
				}
			}

		} catch (Exception ex) {
			JYLoggerUtil.error(this.getClass(), "===查询维氏盾_个人黑名单查询获取接口异常===接口交易流水号:"+interfaceLogDto.getReqTransNo(), ex);
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
				JYLoggerUtil.error(this.getClass(), "===保存维氏盾_个人黑名单查询获取日志异常===接口交易流水号:"+interfaceLogDto.getReqTransNo(), e);
			}
		}
	}
}

