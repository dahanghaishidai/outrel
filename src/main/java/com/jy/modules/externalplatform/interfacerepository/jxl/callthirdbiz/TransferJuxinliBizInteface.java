package com.jy.modules.externalplatform.interfacerepository.jxl.callthirdbiz;


import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;

import javax.servlet.ServletContext;

import net.sf.json.JSONObject;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.jy.modules.externalplatform.application.exttransferlog.dto.ExtTransferLogDTO;
import com.jy.modules.externalplatform.application.exttransferlog.service.ExtTransferLogService;
import com.jy.platform.api.sysconfig.SysConfigAPI;

/**
* @description: 调用三方征信接口ESB服务
*/ 
@Component("com.jy.modules.extbiz.in.junxinli.callthirdbiz.TransferJuxinliBizInteface")
public class TransferJuxinliBizInteface {
	private static int REQUEST_TIMEOUT = 30 * 1000; // 设置请求超时30秒钟
    private static int TIMEOUT         = 60 * 1000; // 连接超时时间
    private static int SO_TIMEOUT      = 60 * 1000; // 数据传输超时
    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

	
	
	/**
	* @title: executeHttpPostEsb
	* @description: post方式 请求esb
	* @date 2017年9月6日 上午9:21:46
	* @param url
	* @param reqMsg
	* @param ext01
	* @param ext02
	* @param interfaceType 接口类型
	* @param businessCode 业务编码
	* @return
	* @throws 
	*/ 
	public static String executeHttpPostEsb(String url,String reqMsg,String ext01, String ext02, String interfaceType, String interfaceCode) {
		String result = "";
		String retBody = "";
    	String retCode = "";
    	String errorDesc = "";
    	ExtTransferLogDTO transferLogDTO = new ExtTransferLogDTO();
		Timestamp startTime = new Timestamp(System.currentTimeMillis());
		try {
			HttpClient client = HttpClients.createDefault();
			HttpPost httpPost = new HttpPost(url);
			httpPost.setHeader("Content-type","application/json; charset=utf-8");
			WebApplicationContext webApplicationContext = ContextLoader.getCurrentWebApplicationContext();    
            ServletContext servletContext = webApplicationContext.getServletContext();
            ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(servletContext);
            SysConfigAPI sysConf = (SysConfigAPI) context.getBean("sysConfigAPI");
			if(null!=sysConf.getValue("JXL_REQUEST_TIMEOUT")){//请求超时时间
                REQUEST_TIMEOUT = Integer.valueOf(sysConf.getValue("JXL_REQUEST_TIMEOUT"));
            }
            if(null!=sysConf.getValue("JXL_TIMEOUT")){// 连接超时时间
                TIMEOUT = Integer.valueOf(sysConf.getValue("JXL_TIMEOUT"));
            }
            if(null!=sysConf.getValue("JXL_SO_TIMEOUT")){// 数据传输超时
                SO_TIMEOUT = Integer.valueOf(sysConf.getValue("JXL_SO_TIMEOUT"));
            }
			RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(SO_TIMEOUT).setConnectTimeout(TIMEOUT).setConnectionRequestTimeout(REQUEST_TIMEOUT).setExpectContinueEnabled(false).build();
			httpPost.setConfig(requestConfig);
			httpPost.setEntity(new StringEntity(reqMsg, "utf-8"));
			HttpResponse response = client.execute(httpPost);
			HttpEntity entity = response.getEntity();
			result = EntityUtils.toString(entity, "utf-8");
			if (StringUtils.isNotEmpty(result)) {
				JSONObject resultJson = JSONObject.fromObject(result);
				retCode = "200";
				errorDesc = (String) resultJson.get("errors");
			} else {
				retCode = "400";
				errorDesc = "请求接口返回报文为空";
			}
		} catch (Exception e) {
			retCode = "400";
			errorDesc = "接口请求异常："+e.getMessage();
			transferLogDTO.setRetTime(new Timestamp(System.currentTimeMillis()));
			e.printStackTrace();
		} finally {
			try {
				String transNo = interfaceType + UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
				transferLogDTO.setReqTransNo(transNo);
				transferLogDTO.setInterfaceType(interfaceType);
				transferLogDTO.setInterfaceCode(interfaceCode);
				transferLogDTO.setReqTime(startTime);
				String reqBody = url + "请求参数：" + JSONObject.fromObject(reqMsg).toString();// 请求报文体
				if (reqBody.length() > 2000) {
					reqBody = reqBody.substring(0, 2000);
				}
				transferLogDTO.setReqBody(reqBody);
				retBody = result;
				if (StringUtils.isNotEmpty(result) && result.length() > 2000) {
					retBody = retBody.substring(0, 2000);
				}
				transferLogDTO.setRetBody(retBody);// 返回报文体
				transferLogDTO.setRetTime(new Timestamp(System.currentTimeMillis()));// 返回时间
				transferLogDTO.setRetCode(retCode);//返回状态码
				//返回错误信息
				if (StringUtils.isNotEmpty(errorDesc) && errorDesc.length() > 2000) {
					errorDesc = errorDesc.substring(0, 2000);
				}
				transferLogDTO.setRetMsg(errorDesc);
				transferLogDTO.setExt01(ext01);
				transferLogDTO.setExt02(ext02);
				WebApplicationContext webApplicationContext = ContextLoader.getCurrentWebApplicationContext();
				ServletContext servletContext = webApplicationContext.getServletContext();
				ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(servletContext);
				ExtTransferLogService extTransferLogService = (ExtTransferLogService) context.getBean("com.jy.modules.externalplatform.application.exttransferlog.service.ExtTransferLogService");
				extTransferLogService.insertExtTransferLog(transferLogDTO);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	

    
	/**
	* @title: executeHttpGet
	* @author:陈东栋
	* @description:
	* @date 2017年9月6日 上午9:24:05
	* @param url
	* @param params
	* @param ext01
	* @param ext02
	* @param interfaceType 接口类型
	* @param businessCode 业务编码
	* @return
	* @throws 
	*/ 
    public static String executeHttpGet(String url, Map<String, String> params,String ext01, String ext02, String interfaceType, String businessCode) {
    	String result = "";
		String retBody = "";
    	String retCode = "";
    	String errorDesc = "";
    	ExtTransferLogDTO transferLogDTO = new ExtTransferLogDTO();
    	Timestamp startTime = new Timestamp(System.currentTimeMillis());
    	try {
	    	if(params != null && !params.isEmpty()) {
				url += "?";
				Set<Entry<String, String>> set = params.entrySet();
				List<Entry<String, String>> list = new ArrayList<Entry<String, String>>();
				list.addAll(set);
				for(int i = 0; i < list.size(); i++) {
					Entry<String, String> en = list.get(i);
					if(i == list.size() - 1) {
						url += en.getKey()+"="+en.getValue();
					} else {
						url += en.getKey()+"="+en.getValue()+"&";
					}
				}
			}
	    	HttpClient client = HttpClients.createDefault();
	    	HttpGet httpGet = new HttpGet(url);
	    	httpGet.setHeader("Content-type", "application/json; charset=utf-8");
	    	RequestConfig requestConfig = RequestConfig.custom()
					.setSocketTimeout(SO_TIMEOUT).setConnectTimeout(TIMEOUT)
					.setConnectionRequestTimeout(REQUEST_TIMEOUT)
					.setExpectContinueEnabled(false).build();
	    	httpGet.setConfig(requestConfig);
	    	HttpResponse response = client.execute(httpGet);  
	        HttpEntity entity = response.getEntity();
	        result = EntityUtils.toString(entity, "utf-8");
	        transferLogDTO.setRetTime(new Timestamp(System.currentTimeMillis()));
    	} catch(Exception e) {
    		retCode = "400";
			errorDesc = "接口请求异常："+e.getMessage();
			transferLogDTO.setRetTime(new Timestamp(System.currentTimeMillis()));
			e.printStackTrace();
    	} finally {
    		try {
				String transNo = interfaceType + UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
				transferLogDTO.setReqTransNo(transNo);
				transferLogDTO.setInterfaceType(interfaceType);
				transferLogDTO.setInterfaceCode(businessCode);
				transferLogDTO.setReqTime(startTime);
				String reqBody = url + "请求参数：" + JSONObject.fromObject(params).toString();// 请求报文体
				if (reqBody.length() > 2000) {
					reqBody = reqBody.substring(0, 2000);
				}
				transferLogDTO.setReqBody(reqBody);
				retBody = result;
				if (StringUtils.isNotEmpty(result) && result.length() > 2000) {
					retBody = retBody.substring(0, 2000);
				}
				transferLogDTO.setRetBody(retBody);// 返回报文体
				transferLogDTO.setRetTime(new Timestamp(System.currentTimeMillis()));// 返回时间
				transferLogDTO.setRetCode(retCode);//返回状态码
				//返回错误信息
				if (StringUtils.isNotEmpty(errorDesc) && errorDesc.length() > 2000) {
					errorDesc = errorDesc.substring(0, 2000);
				}
				transferLogDTO.setRetMsg(errorDesc);
				transferLogDTO.setExt01(ext01);
				transferLogDTO.setExt02(ext02);
				WebApplicationContext webApplicationContext = ContextLoader.getCurrentWebApplicationContext();
				ServletContext servletContext = webApplicationContext.getServletContext();
				ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(servletContext);
				ExtTransferLogService extTransferLogService = (ExtTransferLogService) context.getBean("com.jy.modules.externalplatform.application.exttransferlog.service.ExtTransferLogService");
				extTransferLogService.insertExtTransferLog(transferLogDTO);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}
    	return result;
    }
}
