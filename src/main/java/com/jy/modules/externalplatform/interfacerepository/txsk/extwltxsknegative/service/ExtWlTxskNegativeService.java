package com.jy.modules.externalplatform.interfacerepository.txsk.extwltxsknegative.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jy.modules.externalplatform.interfacerepository.txsk.extwltxsklenddetail.dto.ExtWlTxskLendDetailDTO;
import com.jy.modules.externalplatform.interfacerepository.txsk.extwltxsklendmulti.dto.ExtWlTxskLendMultiDTO;
import com.jy.modules.externalplatform.interfacerepository.txsk.extwltxskmultiple.dto.ExtWlTxskMultipleDTO;
import com.jy.modules.externalplatform.interfacerepository.txsk.extwltxskmultiple.service.ExtWlTxskMultipleService;
import com.jy.modules.externalplatform.interfacerepository.txsk.extwltxsknegative.dao.ExtWlTxskNegativeDao;
import com.jy.modules.externalplatform.interfacerepository.txsk.extwltxsknegative.dto.ExtWlTxskNegativeDTO;
import com.jy.modules.externalplatform.interfacerepository.txsk.extwltxsknegatived.dto.ExtWlTxskNegativeDDTO;
import com.jy.modules.externalplatform.interfacerepository.txsk.extwltxsknegatived.service.ExtWlTxskNegativeDService;
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

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * @className: ExtWlTxskNegativeService
 * @package: com.jy.modules.externalplatform.interfacerepository.txsk.extwltxsknegative.service
 * @describe: 定义  负面信息查询主表 实现类
 * @auther: 董康宁
 * @date: 2018/1/15
 * @time: 10:35
 */
@Service("com.jy.modules.externalplatform.interfacerepository.txsk.extwltxsknegative.service.ExtWlTxskNegativeService")
public class ExtWlTxskNegativeService implements Serializable, ExtSaveMessageDao {

    private static final long serialVersionUID = 1L;
    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    static Logger logger = LoggerFactory.getLogger(ExtWlTxskNegativeService.class);

    @Autowired
    ExtInterfaceLogService extInterfaceLogService;

    @Autowired
    ExtWlTxskNegativeDService extWlTxskNegativeDService;

	@Autowired
	private ExtWlTxskNegativeDao dao;


	/**
	 * @methodName: insertExtWlTxskNegative
	 * @param: [dto]
	 * @describe: 新增 负面信息查询主表对象
	 * @auther: 董康宁
	 * @date: 2018/1/15
	 * @time: 10:36
	 */
	@SuppressWarnings("all")
	public Long insertExtWlTxskNegative(ExtWlTxskNegativeDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlTxskNegative(paramMap);
		
		ExtWlTxskNegativeDTO resultDto = (ExtWlTxskNegativeDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}

	/**
	 * @methodName: saveMessage
	 * @param: [map]
	 * @describe: 天行数科_负面信息查询 数据落地
	 * @auther: 董康宁
	 * @date: 2018/1/15
	 * @time: 15:45
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


		ExtWlTxskNegativeDTO negativeDTO = new ExtWlTxskNegativeDTO();
		ExtWlTxskNegativeDDTO negativeDetailDTO = new ExtWlTxskNegativeDDTO();

		try {

			String intoCustomerRefId  = "";
			if(null != map.get("intoCustomerRefId"))
				intoCustomerRefId = String.valueOf(map.get("intoCustomerRefId"));

			if(StringUtils.isEmpty(result)){
				interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				interfaceLogDto.setRetMsg("天行数科_负面信息查询接口业务接口返回报文为空！");
			}else if(result.contains("Read timed out")){
				interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				interfaceLogDto.setRetMsg("天行数科_负面信息查询接口业务接口 访问超时！");
			}else{

				JSONObject resultObj = JSON.parseObject(result);//转换json 对象

				//负面信息查询主表
                if(StringUtils.isNotEmpty(intoCustomerRefId))
                    negativeDTO.setIntoCustRefId(Long.parseLong(intoCustomerRefId));
                negativeDTO.setSuccess(resultObj.getString("success"));
                negativeDTO.setCode(resultObj.getString("code"));
                negativeDTO.setError(resultObj.getString("error"));
                negativeDTO.setErrorDesc(resultObj.getString("errorDesc"));
                negativeDTO.setCreateBy(-1L);
				Long keyId = this.insertExtWlTxskNegative(negativeDTO);
				if(null != keyId)
					fkBizId = keyId.toString();

				//处理报文明细
				boolean success = (Boolean) resultObj.get("success");
				if(success){//成功
					isSuccess = "1";//设置成功

					//设置返回码和返回信息
					retCode = resultObj.getString("success");
					retMsg = "成功";

					JSONObject dataObj = resultObj.getJSONObject("data");//成功 必有
                    String status = dataObj.getString("status");//查询数据状态 EXIST、 NO_DATA
                    negativeDetailDTO.setIdCard(dataObj.getString("idCard"));//身份证号
                    negativeDetailDTO.setName(dataObj.getString("name"));//姓名

					//负面信息查询详情表
					negativeDetailDTO.setFkId(keyId);
                    negativeDetailDTO.setStatus(status);
                    negativeDetailDTO.setCreateBy(-1L);
					negativeDetailDTO.setEscape(dataObj.getString("escape"));//是否在逃
					negativeDetailDTO.setCrime(dataObj.getString("crime"));//是否有前科
					negativeDetailDTO.setDrug(dataObj.getString("drug"));//是否吸毒
					negativeDetailDTO.setDrugRelated(dataObj.getString("drugRelated"));//是否涉毒
					negativeDetailDTO.setEscapeCompared(dataObj.getString("escapeCompared"));//在逃比对结果 一致，不一致
					negativeDetailDTO.setCrimeCompared(dataObj.getString("crimeCompared"));//前科比对结果
					negativeDetailDTO.setDrugCompared(dataObj.getString("drugCompared"));//吸毒比对结果
					negativeDetailDTO.setDrugRelatedCompared(dataObj.getString("drugRelatedCompared"));//涉毒比对结果
					negativeDetailDTO.setCaseTime(dataObj.getString("caseTime"));//案发时间
					negativeDetailDTO.setCheckCount(dataObj.getString("checkCount"));//前科事件数量
					negativeDetailDTO.setCaseType(dataObj.getString("caseType"));//事件类别
                    //保存数据
                    extWlTxskNegativeDService.insertExtWlTxskNegativeD(negativeDetailDTO);


                    if(null != status && "EXIST".equals(status)){//正常有数据

                        interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
                        interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_1.getValue());
                    }else{ //NO_DATA 无数据

                        //设置返回码和返回信息
                        retCode = retCode + ";" + status;
                        retMsg = retMsg + ";"  + "查无";

                        interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_2.getKey());
                        interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_2.getKey());
                    }


				}else{

					//设置返回码和返回信息
					retCode = resultObj.getString("success") + ":" + resultObj.getString("code");
					retMsg = resultObj.getString("error") + ":" + resultObj.getString("errorDesc");

					interfaceLogDto.setRetCode(retCode);
					interfaceLogDto.setRetMsg(retMsg);
					logger.info("天行数科_负面信息查询查询失败：" + retMsg);
				}

			}

		} catch (Exception ex) {
			JYLoggerUtil.error(this.getClass(), "===天行数科_负面信息查询接口业务接口异常===接口交易流水号:"+interfaceLogDto.getReqTransNo(), ex);
			interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4.getKey());
			interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_4.getValue());

		} finally{
			try {
				interfaceLogDto.setRetBody(result);
				interfaceLogDto.setExt2(isSuccess);
				interfaceLogDto.setExt3(retCode);
				interfaceLogDto.setExt4(retMsg);
				interfaceLogDto.setExt5(fkBizId);
				extInterfaceLogService.insertExtInterfaceLog(interfaceLogDto);

			} catch (Exception e) {
				JYLoggerUtil.error(this.getClass(), "===保存天行数科_负面信息查询信息日志异常===接口交易流水号:"+interfaceLogDto.getReqTransNo(), e);
			}
		}

	}
}

