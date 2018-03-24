package com.jy.modules.externalplatform.interfacerepository.qhzx.extqhzxblackstock.service;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jodd.util.StringUtil;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.qhzx.extqhzxblackstock.dao.ExtQhzxBlackStockDao;
import com.jy.modules.externalplatform.interfacerepository.qhzx.extqhzxblackstock.dto.ExtQhzxBlackStockDTO;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.ExtConstant;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.BaseDTO;
import com.jy.platform.core.common.JYLoggerUtil;

/**
 * @classname: ExtQhzxBlackStockService
 * @description: 定义  前海征信黑名单查询结果表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.qhzx.extqhzxblackstock.service.ExtQhzxBlackStockService")
public class ExtQhzxBlackStockService implements ExtSaveMessageDao {
	private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	
	@Autowired
	ExtInterfaceLogService extInterfaceLogService;
    
	@Autowired
	private ExtQhzxBlackStockDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 前海征信黑名单查询结果表列表
     * @date 2017-06-07 17:28:40
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtQhzxBlackStockDTO> searchExtQhzxBlackStockByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtQhzxBlackStockDTO> dataList =  dao.searchExtQhzxBlackStockByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询前海征信黑名单查询结果表列表
     * @date 2017-06-07 17:28:40
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtQhzxBlackStockDTO> searchExtQhzxBlackStock(Map<String,Object> searchParams) throws Exception {
	    List<ExtQhzxBlackStockDTO> dataList = dao.searchExtQhzxBlackStock(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询前海征信黑名单查询结果表对象
     * @date 2017-06-07 17:28:40
     * @param id
     * @return
     * @throws
     */ 
	public ExtQhzxBlackStockDTO queryExtQhzxBlackStockByPrimaryKey(String id) throws Exception {
		
		ExtQhzxBlackStockDTO dto = dao.findExtQhzxBlackStockByPrimaryKey(id);
		
		if(dto == null) dto = new ExtQhzxBlackStockDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtQhzxBlackStock
     * @author Administrator
     * @description: 新增 前海征信黑名单查询结果表对象
     * @date 2017-06-07 17:28:40
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtQhzxBlackStock(ExtQhzxBlackStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtQhzxBlackStock(paramMap);
		
		ExtQhzxBlackStockDTO resultDto = (ExtQhzxBlackStockDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtQhzxBlackStock
     * @author Administrator
     * @description: 修改 前海征信黑名单查询结果表对象
     * @date 2017-06-07 17:28:40
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtQhzxBlackStock(ExtQhzxBlackStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtQhzxBlackStock(paramMap);
	}
	/**
     * @title: deleteExtQhzxBlackStockByPrimaryKey
     * @author Administrator
     * @description: 删除 前海征信黑名单查询结果表,按主键
     * @date 2017-06-07 17:28:40
     * @param paramMap
     * @throws
     */ 
	public void deleteExtQhzxBlackStockByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtQhzxBlackStockByPrimaryKey(paramMap);
	}

	/**
	 * 接收数据保存
	 * @param map
	 */
	public void saveMessage(Map<String,Object> map){
		//日志信息
		ExtInterfaceLogDTO interfaceLogDto=(ExtInterfaceLogDTO) map.get("interfaceLogDto");
		String results=String.valueOf(map.get("result"));
		Map<String, Object> params=new HashMap<String,Object>();
		ExtQhzxBlackStockDTO dto = new ExtQhzxBlackStockDTO();
		dto.setProdCode(String.valueOf(map.get("prod")));
		dto.setOrgCode(String.valueOf(map.get("org")));
		dto.setSysCode(String.valueOf(map.get("sysCode")));
		dto.setCardType(String.valueOf(map.get("idType")));
    	dto.setCardId(String.valueOf(map.get("idNo")));
    	dto.setCustName(String.valueOf(map.get("name")));
    	dto.setReasonCode(String.valueOf(map.get("reasonCode")));
    	dto.setTransNo(String.valueOf(map.get("transNo")));
    	JSONObject respJson = null;
		try {
			if(StringUtils.isNotEmpty((CharSequence) map.get("result")) && !"null".equals(map.get("result"))){
				respJson = JSONObject.fromObject(map.get("result"));
				if(null!=respJson.get("retCode") && respJson.get("retCode").equals("500")){
					 dto.setRetcode(InterfaceEnum.RET_CODE_6.getKey());
					 dto.setErrormsg(String.valueOf(respJson.get("errorDesc")));
					 dto.setRemark(String.valueOf(respJson.get("errorDesc")));
					 interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_6.getKey());
					 interfaceLogDto.setRetMsg(String.valueOf(respJson.get("errorDesc")));
					 params.put("dto", dto);
					 dao.insertExtQhzxBlackStock(params);
					 return;
				 }
				String rtnCode = respJson.getJSONObject("header").getString("rtCode");
	            if(ExtConstant.QHZX_RET_CODE_SUCESS.equals(rtnCode)){	                
	            	JSONObject busiDataJson = respJson.getJSONObject("busiDataInfo");					
					JSONArray records = busiDataJson.getJSONArray("records");
					if(records!=null&&records.size()>0) {
						JSONObject record = records.getJSONObject(0);						
						String errorCode = record.getString("erCode");						
						if(!ExtConstant.QHZX_RET_CODE_SUCESS.equals(errorCode)&&!ExtConstant.QHZX_RET_CODE_FALSE.equals(errorCode)) {
							if(record.has("erMsg")) {
							    dto.setErrormsg(record.getString("erMsg"));
							}
							dto.setRetcode(InterfaceEnum.RET_CODE_5.getKey());
						    dto.setRemark("调用前海征信黑名单查询接口返回错误信息");	
						    interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_5.getKey());
							interfaceLogDto.setRetMsg("调用前海征信黑名单查询接口返回错误信息");
							params.put("dto", dto);
							dao.insertExtQhzxBlackStock(params);
						}else{						
							dto.setRtnCode(rtnCode);
							dto.setGradeQuery(record.getString("gradeQuery"));
							dto.setMoneybound(record.getString("moneyBound"));
							dto.setDataStatus(record.getString("dataStatus"));
							dto.setBizErrorCode(errorCode);
							dto.setRetcode(InterfaceEnum.RET_CODE_1.getKey());
						    dto.setRemark("调用前海征信黑名单查询接口查有");	
						    interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
							interfaceLogDto.setRetMsg("调用前海征信黑名单查询接口查有");
							this.insertExtQhzxBlackStock(dto);
						}
					}
	               
	            }else if(ExtConstant.QHZX_RET_CODE_FALSE.equals(rtnCode)){
	            	dto.setRetcode(InterfaceEnum.RET_CODE_2.getKey());
				    dto.setErrormsg("调用前海征信黑名单查询接口查无");
				    dto.setRemark("调用前海征信黑名单查询接口查无");
				    interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_2.getKey());
					interfaceLogDto.setRetMsg("调用前海征信黑名单查询接口查无");
					params.put("dto", dto);
					dao.insertExtQhzxBlackStock(params);
	            }
			}else{				
			     dto.setRetcode(InterfaceEnum.RET_CODE_3.getKey());
			     dto.setErrormsg("调用前海征信黑名单查询接口报错");
			     dto.setRemark("调用前海征信黑名单查询接口报错");	
			     interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				 interfaceLogDto.setRetMsg("调用前海征信黑名单查询接口报错");
				 params.put("dto", dto);
				 dao.insertExtQhzxBlackStock(params);
			 }
		} catch (Exception ex) {
			  JYLoggerUtil.error(this.getClass(), "===调用前海征信黑名单查询解析回参异常===进件日志ID:"+String.valueOf(map.get("interfaceId")),ex);
			  String msg = ex.getMessage();
			  if(StringUtil.isNotEmpty(msg)){
				  if(msg.contains("A JSONObject text must begin with '{' at character 1 of")){
					  dto.setRetcode(InterfaceEnum.RET_CODE_3.getKey());
					  dto.setErrormsg("调用前海征信黑名单查询接口异常请求返回，请联系IT解决");
					  dto.setRemark("调用前海征信黑名单查询接口调用报错");
					  interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
					  interfaceLogDto.setRetMsg("调用前海征信黑名单查询接口异常请求返回，请联系IT解决");
				 }else{
					  dto.setRetcode(InterfaceEnum.RET_CODE_4.getKey());
					  if(msg.length() > 2000){
						  dto.setErrormsg("调用前海征信黑名单查询接口返回信息解析出错:"+msg.substring(0,2000));
						  interfaceLogDto.setRetMsg("调用前海征信黑名单查询接口返回信息解析出错:"+msg.substring(0,2000));
					  }else{
						  dto.setErrormsg("调用前海征信黑名单查询接口返回信息解析出错:"+msg);
						  interfaceLogDto.setRetMsg("调用前海征信黑名单查询接口返回信息解析出错:"+msg);
					  }
					  dto.setRemark("调用前海征信黑名单查询接口返回信息解析出错");
					  interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4.getKey());
				 }
			  }
			  params.put("dto",dto);
			  dao.insertExtQhzxBlackStock(params);
		}finally{
			try {
				interfaceLogDto.setRetBody(results);
				Long keyId =extInterfaceLogService.insertExtInterfaceLog(interfaceLogDto);
				dto.setInterfaceId(String.valueOf(keyId));
				this.updateExtQhzxBlackStock(dto);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	
	
}

