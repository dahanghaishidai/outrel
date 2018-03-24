package com.jy.modules.externalplatform.interfacerepository.txsk.extwltxskmultiple.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jy.modules.externalplatform.interfacerepository.txsk.extwltxsklenddetail.dto.ExtWlTxskLendDetailDTO;
import com.jy.modules.externalplatform.interfacerepository.txsk.extwltxsklenddetail.service.ExtWlTxskLendDetailService;
import com.jy.modules.externalplatform.interfacerepository.txsk.extwltxsklendmulti.dto.ExtWlTxskLendMultiDTO;
import com.jy.modules.externalplatform.interfacerepository.txsk.extwltxsklendmulti.service.ExtWlTxskLendMultiService;
import com.jy.modules.externalplatform.interfacerepository.txsk.extwltxskmultiple.dao.ExtWlTxskMultipleDao;
import com.jy.modules.externalplatform.interfacerepository.txsk.extwltxskmultiple.dto.ExtWlTxskMultipleDTO;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcqueryinfo.dto.RequestMesDto;
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
 * @className: ExtWlTxskMultipleService
 * @package: com.jy.modules.externalplatform.interfacerepository.txsk.extwltxskmultiple.service
 * @describe: 定义  多重借贷查询主表 实现类
 * @auther: 董康宁
 * @date: 2018/1/12
 * @time: 17:04
 */
@Service("com.jy.modules.externalplatform.interfacerepository.txsk.extwltxskmultiple.service.ExtWlTxskMultipleService")
public class ExtWlTxskMultipleService implements Serializable, ExtSaveMessageDao {

	private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	static Logger logger = LoggerFactory.getLogger(ExtWlTxskMultipleService.class);

	@Autowired
	ExtInterfaceLogService extInterfaceLogService;
    @Autowired
    ExtWlTxskLendMultiService extWlTxskLendMultiService;
    @Autowired
    ExtWlTxskLendDetailService extWlTxskLendDetailService;
	@Autowired
	private ExtWlTxskMultipleDao dao;


	/**
	 * @methodName: insertExtWlTxskMultiple
	 * @param: [dto]
	 * @describe: 新增 多重借贷查询主表对象
	 * @auther: 董康宁
	 * @date: 2018/1/12
	 * @time: 17:04
	 */
	@SuppressWarnings("all")
	public Long insertExtWlTxskMultiple(ExtWlTxskMultipleDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlTxskMultiple(paramMap);
		
		ExtWlTxskMultipleDTO resultDto = (ExtWlTxskMultipleDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}

	/**
	 * @methodName: saveMessage
	 * @param: [map]
	 * @describe: 天行数科_多重借贷查询 数据落地
	 * @auther: 董康宁
	 * @date: 2018/1/12
	 * @time: 17:17
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


        ExtWlTxskMultipleDTO multipleDTO = new ExtWlTxskMultipleDTO();
        ExtWlTxskLendMultiDTO lendMultiDTO = new ExtWlTxskLendMultiDTO();

		try {

			String intoCustomerRefId  = "";
			if(null != map.get("intoCustomerRefId"))
				intoCustomerRefId = String.valueOf(map.get("intoCustomerRefId"));

			if(StringUtils.isEmpty(result)){
				interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				interfaceLogDto.setRetMsg("天行数科_多重借贷查询接口业务接口返回报文为空！");
			}else if(result.contains("Read timed out")){
				interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				interfaceLogDto.setRetMsg("天行数科_多重借贷查询接口业务接口 访问超时！");
			}else{

                JSONObject resultObj = JSON.parseObject(result);//转换json 对象

                //多重借贷查询主表
				if(StringUtils.isNotEmpty(intoCustomerRefId))
                    multipleDTO.setIntoCustRefId(Long.parseLong(intoCustomerRefId));
                multipleDTO.setSuccess(resultObj.getString("success"));
                multipleDTO.setCode(resultObj.getString("code"));
                multipleDTO.setError(resultObj.getString("error"));
                multipleDTO.setErrorDesc(resultObj.getString("errorDesc"));
                multipleDTO.setCreateBy(-1L);
                Long keyId = this.insertExtWlTxskMultiple(multipleDTO);
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

                    //多重借贷查询数据表
                    lendMultiDTO.setFkId(keyId);
                    lendMultiDTO.setStatus(dataObj.getString("status"));
                    lendMultiDTO.setStatusDesc(dataObj.getString("statusDesc"));
                    lendMultiDTO.setPhone(dataObj.getString("phone"));
                    lendMultiDTO.setProvince(dataObj.getString("province"));
                    lendMultiDTO.setCity(dataObj.getString("city"));
                    lendMultiDTO.setCycle(dataObj.getString("cycle"));
                    lendMultiDTO.setCreateBy(-1L);

                    Long keyMultiId = extWlTxskLendMultiService.insertExtWlTxskLendMulti(lendMultiDTO);

					if(null != dataObj.getString("status") && "SUCCESS".equals(dataObj.getString("status"))){//查询成功，有结果

                        //信贷平台注册详情
                        String detailType = "creditPlatformRegistrationDetails";
                        if(null != dataObj.get(detailType)){
                            JSONArray detailsArray = dataObj.getJSONArray(detailType);

                            //循环 插入 多重借贷查询数据详情
                            for(int i = 0; i < detailsArray.size(); i ++){

                                JSONObject lendDetailObj = detailsArray.getJSONObject(i);

                                //多重借贷查询数据详情
                                ExtWlTxskLendDetailDTO lendDetailDTO = new ExtWlTxskLendDetailDTO();
                                lendDetailDTO.setFkMultiId(keyMultiId);
                                lendDetailDTO.setDetailType(detailType);//详情类型 信贷平台注册详情
                                lendDetailDTO.setType(lendDetailObj.getString("type"));//平台类型
                                lendDetailDTO.setCode(lendDetailObj.getString("code"));//平台代码
                                lendDetailDTO.setTime(lendDetailObj.getString("time"));//注册时间
                                lendDetailDTO.setCreateBy(-1L);

                                extWlTxskLendDetailService.insertExtWlTxskLendDetail(lendDetailDTO);
                            }

                        }
                        //贷款申请详情 loanApplicationDetails
                        detailType = "loanApplicationDetails";
                        if(null != dataObj.get(detailType)){
                            JSONArray detailsArray = dataObj.getJSONArray(detailType);

                            //循环 插入 贷款申请详情
                            for(int i = 0; i < detailsArray.size(); i ++){

                                JSONObject lendDetailObj = detailsArray.getJSONObject(i);

                                //多重借贷查询数据详情
                                ExtWlTxskLendDetailDTO lendDetailDTO = new ExtWlTxskLendDetailDTO();
                                lendDetailDTO.setFkMultiId(keyMultiId);
                                lendDetailDTO.setDetailType(detailType);//详情类型 贷款申请详情
                                lendDetailDTO.setType(lendDetailObj.getString("type"));//平台类型
                                lendDetailDTO.setCode(lendDetailObj.getString("code"));//平台代码
                                lendDetailDTO.setTime(lendDetailObj.getString("time"));//申请时间
                                lendDetailDTO.setAppLoanAmount(lendDetailObj.getString("applicationAmountut"));//申请金额
                                lendDetailDTO.setAppResult(lendDetailObj.getString("applicationResult"));//申请结果
                                lendDetailDTO.setCreateBy(-1L);

                                extWlTxskLendDetailService.insertExtWlTxskLendDetail(lendDetailDTO);
                            }
                        }
                        //贷款放款详情 loanDetails
                        detailType = "loanDetails";
                        if(null != dataObj.get(detailType)){
                            JSONArray detailsArray = dataObj.getJSONArray(detailType);

                            //循环 插入 贷款放款详情
                            for(int i = 0; i < detailsArray.size(); i ++){

                                JSONObject lendDetailObj = detailsArray.getJSONObject(i);

                                //多重借贷查询数据详情
                                ExtWlTxskLendDetailDTO lendDetailDTO = new ExtWlTxskLendDetailDTO();
                                lendDetailDTO.setFkMultiId(keyMultiId);
                                lendDetailDTO.setDetailType(detailType);//详情类型 贷款放款详情
                                lendDetailDTO.setType(lendDetailObj.getString("type"));//平台类型
                                lendDetailDTO.setCode(lendDetailObj.getString("code"));//平台代码
                                lendDetailDTO.setTime(lendDetailObj.getString("time"));//放款时间
                                lendDetailDTO.setAppLoanAmount(lendDetailObj.getString("loanlendersAmount"));//放款金额
                                lendDetailDTO.setCreateBy(-1L);

                                extWlTxskLendDetailService.insertExtWlTxskLendDetail(lendDetailDTO);
                            }
                        }
                        //贷款驳回详情 loanRejectDetails
                        detailType = "loanRejectDetails";
                        if(null != dataObj.get(detailType)){
                            JSONArray detailsArray = dataObj.getJSONArray(detailType);

                            //循环 插入 贷款驳回详情
                            for(int i = 0; i < detailsArray.size(); i ++){

                                JSONObject lendDetailObj = detailsArray.getJSONObject(i);

                                //多重借贷查询数据详情
                                ExtWlTxskLendDetailDTO lendDetailDTO = new ExtWlTxskLendDetailDTO();
                                lendDetailDTO.setFkMultiId(keyMultiId);
                                lendDetailDTO.setDetailType(detailType);//详情类型 贷款驳回详情
                                lendDetailDTO.setType(lendDetailObj.getString("type"));//平台类型
                                lendDetailDTO.setCode(lendDetailObj.getString("code"));//平台代码
                                lendDetailDTO.setTime(lendDetailObj.getString("time"));//驳回时间
                                lendDetailDTO.setCreateBy(-1L);

                                extWlTxskLendDetailService.insertExtWlTxskLendDetail(lendDetailDTO);
                            }
                        }
                        //逾期平台详情查询 overduePlatformDetails
                        detailType = "overduePlatformDetails";
                        if(null != dataObj.get(detailType)){
                            JSONArray detailsArray = dataObj.getJSONArray(detailType);

                            //循环 插入 逾期平台详情查询
                            for(int i = 0; i < detailsArray.size(); i ++){

                                JSONObject lendDetailObj = detailsArray.getJSONObject(i);

                                //多重借贷查询数据详情
                                ExtWlTxskLendDetailDTO lendDetailDTO = new ExtWlTxskLendDetailDTO();
                                lendDetailDTO.setFkMultiId(keyMultiId);
                                lendDetailDTO.setDetailType(detailType);//详情类型 逾期平台详情查询
                                lendDetailDTO.setCode(lendDetailObj.getString("code"));//平台代码
                                lendDetailDTO.setCounts(lendDetailObj.getString("counts"));//逾期次数
                                lendDetailDTO.setMoney(lendDetailObj.getString("money"));//逾期/欠款金额区间
                                lendDetailDTO.setCreateBy(-1L);

                                extWlTxskLendDetailService.insertExtWlTxskLendDetail(lendDetailDTO);
                            }
                        }
                        //欠款查询  arrearsInquiry
                        detailType = "arrearsInquiry";
                        if(null != dataObj.get(detailType)){
                            JSONArray detailsArray = dataObj.getJSONArray(detailType);

                            //循环 插入 欠款查询
                            for(int i = 0; i < detailsArray.size(); i ++){

                                JSONObject lendDetailObj = detailsArray.getJSONObject(i);

                                //多重借贷查询数据详情
                                ExtWlTxskLendDetailDTO lendDetailDTO = new ExtWlTxskLendDetailDTO();
                                lendDetailDTO.setFkMultiId(keyMultiId);
                                lendDetailDTO.setDetailType(detailType);//详情类型 欠款查询
                                lendDetailDTO.setCode(lendDetailObj.getString("code"));//平台代码
                                lendDetailDTO.setMoney(lendDetailObj.getString("money"));//欠款金额区间
                                lendDetailDTO.setCreateBy(-1L);

                                extWlTxskLendDetailService.insertExtWlTxskLendDetail(lendDetailDTO);
                            }
                        }


                        interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
                        interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_1.getValue());
					}else{

						logger.info("天行数科_多重借贷查询异常" + dataObj.getString("statusDesc"));

                        //设置返回码和返回信息
                        retCode = resultObj.getString("status");
                        retMsg = resultObj.getString("statusDesc");

                        interfaceLogDto.setRetCode(retCode);
                        interfaceLogDto.setRetMsg(retMsg);
					}



				}else{

                    //设置返回码和返回信息
                    retCode = resultObj.getString("success") + ":" + resultObj.getString("code");
                    retMsg = resultObj.getString("error") + ":" + resultObj.getString("errorDesc");

					interfaceLogDto.setRetCode(retCode);
					interfaceLogDto.setRetMsg(retMsg);
					logger.info("天行数科_多重借贷查询查询失败：" + retMsg);
				}

			}

		} catch (Exception ex) {
			JYLoggerUtil.error(this.getClass(), "===天行数科_多重借贷查询接口业务接口异常===接口交易流水号:"+interfaceLogDto.getReqTransNo(), ex);
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
				JYLoggerUtil.error(this.getClass(), "===保存天行数科_多重借贷查询信息日志异常===接口交易流水号:"+interfaceLogDto.getReqTransNo(), e);
			}
		}

	}
}

