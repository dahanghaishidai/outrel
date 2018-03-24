package com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlcreditinvest.rest;

import javax.validation.ConstraintViolationException;
import javax.validation.Validator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springside.modules.beanvalidator.BeanValidators;

import com.jy.modules.externalplatform.interfacerepository.jxl.common.pojo.ResponseCollectReqDTO;
import com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlcreditinvest.dto.RequestCreditInvestDTO;
import com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlcreditinvest.service.ExtJxlCreditInvestService;
import com.jy.platform.restservice.web.base.BaseRest;
/**
 * @classname: ExtJxlCreditInvestRest
 * @description:定义 聚信立央行征信采集申请表 rest服务
 * @author dell
 * @date:2014年10月11日下午2:39:22
 */
@Controller
@RequestMapping(value = "/api/externalplatform/juxinli")
public class ExtJxlCreditInvestRest extends BaseRest{

	private static Logger logger = LoggerFactory.getLogger(ExtJxlCreditInvestRest.class);

	@Autowired
    @Qualifier("com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlcreditinvest.service.ExtJxlCreditInvestService")
    private ExtJxlCreditInvestService service;

	@Autowired
	private Validator validator;

	/**
	 * 聚信立提交央行征信采集申请接口
	 * @param user
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/creditInvestigation/v2",method=RequestMethod.POST)
	public ResponseCollectReqDTO creditInvestigation(@RequestBody RequestCreditInvestDTO requestBody) throws Exception{
		Boolean success = false;
		ResponseCollectReqDTO  responseBody = new ResponseCollectReqDTO();
		try {
			//请求参数完整性校验
			BeanValidators.validateWithException(validator, requestBody, new Class[0]);
			//提交央行征信采集申请
			responseBody = service.submitCreditApplyInfo(requestBody);
			//接口调用是否成功
			success = responseBody.isSuccess();
		}catch (ConstraintViolationException e) {
			responseBody.setMessage(BeanValidators.extractMessage(e).toString());
		}catch (Exception e) {
			responseBody.setMessage("聚信立[提交央行征信采集申请]接口调用异常");
			logger.error("调用聚信立[提交央行征信采集申请]接口异常", e);
		}finally{
			responseBody.setSuccess(success);
		}
		return responseBody;
	 }
}
