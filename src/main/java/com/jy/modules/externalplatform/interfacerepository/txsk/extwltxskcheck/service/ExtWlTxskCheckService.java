package com.jy.modules.externalplatform.interfacerepository.txsk.extwltxskcheck.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jy.modules.externalplatform.interfacerepository.txsk.extwltxskcheck.dao.ExtWlTxskCheckDao;
import com.jy.modules.externalplatform.interfacerepository.txsk.extwltxskcheck.dto.ExtWlTxskCheckDTO;
import com.jy.modules.externalplatform.interfacerepository.txsk.extwltxskcheckd.dto.ExtWlTxskCheckDDTO;
import com.jy.modules.externalplatform.interfacerepository.txsk.extwltxskcheckd.service.ExtWlTxskCheckDService;
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
 * @className: ExtWlTxskCheckService
 * @package: com.jy.modules.externalplatform.interfacerepository.txsk.extwltxskcheck.service
 * @describe: 定义  个人信用验证主表 实现类
 * @auther: 董康宁
 * @date: 2018/1/15
 * @time: 10:53
 */
@Service("com.jy.modules.externalplatform.interfacerepository.txsk.extwltxskcheck.service.ExtWlTxskCheckService")
public class ExtWlTxskCheckService implements Serializable, ExtSaveMessageDao {

    private static final long serialVersionUID = 1L;
	private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	static Logger logger = LoggerFactory.getLogger(ExtWlTxskCheckService.class);

	@Autowired
	ExtInterfaceLogService extInterfaceLogService;

	@Autowired
	ExtWlTxskCheckDService extWlTxskCheckDService;

	@Autowired
	private ExtWlTxskCheckDao dao;


	/**
	 * @methodName: insertExtWlTxskCheck
	 * @param: [dto]
	 * @describe: 新增 个人信用验证主表对象
	 * @auther: 董康宁
	 * @date: 2018/1/15
	 * @time: 11:20
	 */
	@SuppressWarnings("all")
	public Long insertExtWlTxskCheck(ExtWlTxskCheckDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlTxskCheck(paramMap);
		
		ExtWlTxskCheckDTO resultDto = (ExtWlTxskCheckDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}

	/**
	 * @methodName: saveMessage
	 * @param: [map]
	 * @describe: 天行数科_个人信用验证 数据落地
	 * @auther: 董康宁
	 * @date: 2018/1/15
	 * @time: 17:43
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


		ExtWlTxskCheckDTO checkDTO = new ExtWlTxskCheckDTO();
		ExtWlTxskCheckDDTO checkDetailDto = new ExtWlTxskCheckDDTO();

		try {

			String intoCustomerRefId  = "";
			if(null != map.get("intoCustomerRefId"))
				intoCustomerRefId = String.valueOf(map.get("intoCustomerRefId"));

			if(StringUtils.isEmpty(result)){
				interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				interfaceLogDto.setRetMsg("天行数科_个人信用验证接口业务接口返回报文为空！");
			}else if(result.contains("Read timed out")){
				interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				interfaceLogDto.setRetMsg("天行数科_个人信用验证接口业务接口 访问超时！");
			}else{

				JSONObject resultObj = JSON.parseObject(result);//转换json 对象

				//个人信用验证主表
				if(StringUtils.isNotEmpty(intoCustomerRefId))
                    checkDTO.setIntoCustRefId(Long.parseLong(intoCustomerRefId));
                checkDTO.setSuccess(resultObj.getString("success"));
                checkDTO.setCode(resultObj.getString("code"));
                checkDTO.setError(resultObj.getString("error"));
                checkDTO.setErrorDesc(resultObj.getString("errorDesc"));
                checkDTO.setCreateBy(-1L);
				Long keyId = this.insertExtWlTxskCheck(checkDTO);
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

					//个人信用验证详情表
                    checkDetailDto.setFkId(keyId);
                    checkDetailDto.setIdCard(dataObj.getString("idCard"));//身份证号
                    checkDetailDto.setName(dataObj.getString("name"));//姓名
                    checkDetailDto.setStatus(dataObj.getString("status"));//结果状态 SUCCESS、 NO_DATA、 FAIL
                    checkDetailDto.setStatusDesc(dataObj.getString("statusDesc"));//结果状态 查询成功、查询无数据、查询失败
                    checkDetailDto.setCreateBy(-1L);

					//保存数据
					extWlTxskCheckDService.insertExtWlTxskCheckD(checkDetailDto);
				}else{

					//设置返回码和返回信息
					retCode = resultObj.getString("success") + ":" + resultObj.getString("code");
					retMsg = resultObj.getString("error") + ":" + resultObj.getString("errorDesc");

					interfaceLogDto.setRetCode(retCode);
					interfaceLogDto.setRetMsg(retMsg);
					logger.info("天行数科_个人信用验证查询失败：" + retMsg);
				}

			}

		} catch (Exception ex) {
			JYLoggerUtil.error(this.getClass(), "===天行数科_个人信用验证接口业务接口异常===接口交易流水号:"+interfaceLogDto.getReqTransNo(), ex);
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
				JYLoggerUtil.error(this.getClass(), "===保存天行数科_个人信用验证信息日志异常===接口交易流水号:"+interfaceLogDto.getReqTransNo(), e);
			}
		}

	}
}

