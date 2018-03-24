package com.jy.modules.externalplatform.interfacerepository.sjt.extsjtabstractstock.service;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jodd.util.StringUtil;
import net.sf.json.JSONObject;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.jy.modules.externalplatform.interfacerepository.sjt.extsjtabstractstock.dao.ExtSjtAbstractStockDao;
import com.jy.modules.externalplatform.interfacerepository.sjt.extsjtabstractstock.dto.ExtSjtAbstractStockDTO;
import com.jy.modules.externalplatform.interfacerepository.sjt.extsjtassetsstock.dto.ExtSjtAssetsStockDTO;
import com.jy.modules.externalplatform.interfacerepository.sjt.extsjtassetsstock.service.ExtSjtAssetsStockService;
import com.jy.modules.externalplatform.interfacerepository.sjt.extsjtdetailstock.dto.ExtSjtDetailStockDTO;
import com.jy.modules.externalplatform.interfacerepository.sjt.extsjtdetailstock.service.ExtSjtDetailStockService;
import com.jy.modules.externalplatform.interfacerepository.sjt.extsjttransbehaviorstock.dto.ExtSjtTransBehaviorStockDTO;
import com.jy.modules.externalplatform.interfacerepository.sjt.extsjttransbehaviorstock.service.ExtSjtTransBehaviorStockService;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.ExtConstant;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.BaseDTO;
import com.jy.platform.core.common.JYLoggerUtil;

/**
 * @classname: ExtSjtAbstractStockService
 * @description: 定义  数据堂个人消费报告摘要信息 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.sjt.extsjtabstractstock.service.ExtSjtAbstractStockService")
public class ExtSjtAbstractStockService implements ExtSaveMessageDao {
	private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	
	@Autowired
	ExtInterfaceLogService extInterfaceLogService;
	
	@Autowired
	private ExtSjtAbstractStockDao dao;
	
	@Autowired
	private ExtSjtDetailStockService creditDetailInfoService ;
	@Autowired
	private ExtSjtAssetsStockService creditAssetsIndexService ;
	@Autowired
	private ExtSjtTransBehaviorStockService creditTransBehaviorService ;

	/**
     * @author Administrator
     * @description: 分页查询 数据堂个人消费报告摘要信息列表
     * @date 2017-06-08 11:41:50
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtSjtAbstractStockDTO> searchExtSjtAbstractStockByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtSjtAbstractStockDTO> dataList =  dao.searchExtSjtAbstractStockByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询数据堂个人消费报告摘要信息列表
     * @date 2017-06-08 11:41:50
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtSjtAbstractStockDTO> searchExtSjtAbstractStock(Map<String,Object> searchParams) throws Exception {
	    List<ExtSjtAbstractStockDTO> dataList = dao.searchExtSjtAbstractStock(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询数据堂个人消费报告摘要信息对象
     * @date 2017-06-08 11:41:50
     * @param id
     * @return
     * @throws
     */ 
	public ExtSjtAbstractStockDTO queryExtSjtAbstractStockByPrimaryKey(String id) throws Exception {
		
		ExtSjtAbstractStockDTO dto = dao.findExtSjtAbstractStockByPrimaryKey(id);
		
		if(dto == null) dto = new ExtSjtAbstractStockDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtSjtAbstractStock
     * @author Administrator
     * @description: 新增 数据堂个人消费报告摘要信息对象
     * @date 2017-06-08 11:41:50
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtSjtAbstractStock(ExtSjtAbstractStockDTO dto,ExtInterfaceLogDTO interfaceLogDto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtSjtAbstractStock(paramMap);
		dto.setRetcode(InterfaceEnum.RET_CODE_1.getKey());
	    dto.setRemark("调用数据堂个人消费报告查询接口查有");	
	    interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
		interfaceLogDto.setRetMsg("调用数据堂个人消费报告查询接口查有");
		ExtSjtAbstractStockDTO resultDto = (ExtSjtAbstractStockDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtSjtAbstractStock
     * @author Administrator
     * @description: 修改 数据堂个人消费报告摘要信息对象
     * @date 2017-06-08 11:41:50
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtSjtAbstractStock(ExtSjtAbstractStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtSjtAbstractStock(paramMap);
	}
	/**
     * @title: deleteExtSjtAbstractStockByPrimaryKey
     * @author Administrator
     * @description: 删除 数据堂个人消费报告摘要信息,按主键
     * @date 2017-06-08 11:41:50
     * @param paramMap
     * @throws
     */ 
	public void deleteExtSjtAbstractStockByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtSjtAbstractStockByPrimaryKey(paramMap);
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
		ExtSjtAbstractStockDTO dto = new ExtSjtAbstractStockDTO();
		dto.setProdCode(String.valueOf(map.get("prod")));
		dto.setOrgCode(String.valueOf(map.get("org")));
		dto.setSysCode(String.valueOf(map.get("sysCode")));
		dto.setTransNo(String.valueOf(map.get("transNo")));
		dto.setIntoId(Long.valueOf(String.valueOf(map.get("intoId"))));
		dto.setCustId(Long.valueOf(String.valueOf(map.get("custId"))));
    	JSONObject jsonObj = null;
		try {
			if(StringUtils.isNotEmpty((CharSequence) map.get("result")) && !"null".equals(map.get("result"))){
				jsonObj = JSONObject.fromObject(map.get("result"));
				if(null!=jsonObj.get("retCode") && jsonObj.get("retCode").equals("500")){
					 dto.setRetcode(InterfaceEnum.RET_CODE_6.getKey());
					 dto.setErrormsg(String.valueOf(jsonObj.get("errorDesc")));
					 dto.setRemark(String.valueOf(jsonObj.get("errorDesc")));
					 interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_6.getKey());
					 interfaceLogDto.setRetMsg(String.valueOf(jsonObj.get("errorDesc")));
					 params.put("dto", dto);
					 dao.insertExtSjtAbstractStock(params);
					 return;
				 }
				dto = JSON.parseObject(String.valueOf(map.get("result")), ExtSjtAbstractStockDTO.class);
	            if(ExtConstant.SJT_SUCCESS_CODE.equals(dto.getResCode())){	                
	            	//数据堂个人消费报告摘要信息
					Long keyId=this.insertExtSjtAbstractStock(dto,interfaceLogDto);
										
					List<ExtSjtDetailStockDTO> batchList = new ArrayList<ExtSjtDetailStockDTO>();	//批量插入的list
					//indexTransCredits	信用相关交易统计
					ExtSjtDetailStockDTO [] indexTransCredits = dto.getIndexTransCredits();
					if(indexTransCredits != null && indexTransCredits.length > 0){
						for(ExtSjtDetailStockDTO sjtCreditDetailInfo : indexTransCredits){
							sjtCreditDetailInfo.setDetailType(InterfaceEnum.type_01.getKey());
							sjtCreditDetailInfo.setTransNo(dto.getTransNo());
							sjtCreditDetailInfo.setIntoId(dto.getIntoId());
							sjtCreditDetailInfo.setFkId(keyId);
							batchList.add(sjtCreditDetailInfo);
						}
					}
					
					//indexConsumeCategories	 消费大类分布信息
					ExtSjtDetailStockDTO [] indexConsumeCategories = dto.getIndexConsumeCategories();
					if(indexConsumeCategories != null && indexConsumeCategories.length > 0){
						for(ExtSjtDetailStockDTO sjtCreditDetailInfo : indexConsumeCategories){
							sjtCreditDetailInfo.setDetailType(InterfaceEnum.type_02.getKey());
							sjtCreditDetailInfo.setTransNo(dto.getTransNo());
							sjtCreditDetailInfo.setIntoId(dto.getIntoId());
							sjtCreditDetailInfo.setFkId(keyId);
							batchList.add(sjtCreditDetailInfo);
						}
					}
					
					//indexConsumeCities	 消费地域分布信息
					ExtSjtDetailStockDTO [] indexConsumeCities = dto.getIndexConsumeCities();
					if(indexConsumeCities != null && indexConsumeCities.length > 0){
						for(ExtSjtDetailStockDTO sjtCreditDetailInfo : indexConsumeCities){
							sjtCreditDetailInfo.setDetailType(InterfaceEnum.type_03.getKey());
							sjtCreditDetailInfo.setTransNo(dto.getTransNo());
							sjtCreditDetailInfo.setIntoId(dto.getIntoId());
							sjtCreditDetailInfo.setFkId(keyId);
							batchList.add(sjtCreditDetailInfo);
						}
					}
					
					//indexMonthConsumes	 每月消费状况信息
					ExtSjtDetailStockDTO [] indexMonthConsumes = dto.getIndexMonthConsumes();
					if(indexMonthConsumes != null && indexMonthConsumes.length > 0){
						for(ExtSjtDetailStockDTO sjtCreditDetailInfo : indexMonthConsumes){
							sjtCreditDetailInfo.setDetailType(InterfaceEnum.type_04.getKey());
							sjtCreditDetailInfo.setTransNo(dto.getTransNo());
							sjtCreditDetailInfo.setIntoId(dto.getIntoId());
							//json中返回的字段是month 数据表中存入字段是name
							sjtCreditDetailInfo.setName(sjtCreditDetailInfo.getMonth());
							sjtCreditDetailInfo.setFkId(keyId);
							batchList.add(sjtCreditDetailInfo);
						}
					}
					if(null!=batchList && batchList.size()>0){
						creditDetailInfoService.batchInsertExtSjtCreditDetailInfo(batchList);
						dto.setDetailMsg(InterfaceEnum.RET_MSG.getKey());
						this.updateExtSjtAbstractStock(dto);
					}
					
					//indexProperty	资产指标
					ExtSjtAssetsStockDTO sjtCreditAssetsIndex = dto.getIndexProperty();
					if(null!=sjtCreditAssetsIndex){
						sjtCreditAssetsIndex.setTransNo(dto.getTransNo());
						sjtCreditAssetsIndex.setIntoId(dto.getIntoId());
						sjtCreditAssetsIndex.setFkId(keyId);
						creditAssetsIndexService.insertExtSjtAssetsStock(sjtCreditAssetsIndex);
						dto.setAssetsMsg(InterfaceEnum.RET_MSG.getKey());
						this.updateExtSjtAbstractStock(dto);
					}
					
					//indexTransBehavior	交易行为特征信息
					ExtSjtTransBehaviorStockDTO sjtCreditTransBehavior = dto.getIndexTransBehavior();
					if(null!=sjtCreditTransBehavior){
						sjtCreditTransBehavior.setTransNo(dto.getTransNo());
						sjtCreditTransBehavior.setIntoId(dto.getIntoId());
						sjtCreditTransBehavior.setFkId(keyId);
						creditTransBehaviorService.insertExtSjtTransBehaviorStock(sjtCreditTransBehavior);
						dto.setTransBehaviorMsg(InterfaceEnum.RET_MSG.getKey());
						this.updateExtSjtAbstractStock(dto);
					}
	               
	            }else if(ExtConstant.SJT_FALSE_CODE.equals(dto.getResCode())){
	            	dto.setRetcode(InterfaceEnum.RET_CODE_2.getKey());
				    dto.setErrormsg("调用数据堂个人消费报告接口查无");
				    dto.setRemark("调用数据堂个人消费报告接口查无");
				    interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_2.getKey());
					interfaceLogDto.setRetMsg("调用数据堂个人消费报告接口查无");
					params.put("dto", dto);
					dao.insertExtSjtAbstractStock(params);
	            }else if(ExtConstant.SJT_MORE_CODE.equals(dto.getResCode())){
	            	dto.setRetcode(InterfaceEnum.RET_CODE_2.getKey());
				    dto.setErrormsg("调用数据堂个人消费报告接口查询次数超限");
				    dto.setRemark("调用数据堂个人消费报告接口查无");
				    interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_2.getKey());
					interfaceLogDto.setRetMsg("调用数据堂个人消费报告接口查询次数超限");
					params.put("dto", dto);
					dao.insertExtSjtAbstractStock(params);
	            }else{
	            	Map resmap = JSON.parseObject(String.valueOf(map.get("result")), Map.class);
	            	dto.setRetcode(InterfaceEnum.RET_CODE_5.getKey());
				    dto.setErrormsg(resmap.get("status")+":"+resmap.get("message")+"");
				    dto.setRemark("调用数据堂个人消费报告接口返回错误信息");
				    interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_5.getKey());
					interfaceLogDto.setRetMsg("调用数据堂个人消费报告接口返回错误信息");
					params.put("dto", dto);
					dao.insertExtSjtAbstractStock(params);
	            }
			}else{				
			     dto.setRetcode(InterfaceEnum.RET_CODE_3.getKey());
			     dto.setErrormsg("调用数据堂个人消费报告接口报错");
			     dto.setRemark("调用数据堂个人消费报告接口报错");	
			     interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				 interfaceLogDto.setRetMsg("调用数据堂个人消费报告接口报错");
				 params.put("dto", dto);
				 dao.insertExtSjtAbstractStock(params);
			 }
		} catch (Exception ex) {
			  JYLoggerUtil.error(this.getClass(), "===调用数据堂个人消费报告解析回参异常===进件日志ID:"+String.valueOf(map.get("interfaceId")),ex);
			  String msg = ex.getMessage();
			  if(StringUtil.isNotEmpty(msg)){
				  if(msg.contains("A JSONObject text must begin with '{' at character 1 of")){
					  dto.setRetcode(InterfaceEnum.RET_CODE_3.getKey());
					  dto.setErrormsg("调用数据堂个人消费报告接口异常请求返回，请联系IT解决");
					  dto.setRemark("调用数据堂个人消费报告接口调用报错");	
					  interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
					  interfaceLogDto.setRetMsg("调用数据堂个人消费报告接口异常请求返回，请联系IT解决");
				 }else{
					  dto.setRetcode(InterfaceEnum.RET_CODE_4.getKey());
					  if(msg.length() > 2000){
						  dto.setErrormsg("调用数据堂个人消费报告接口返回信息解析出错:"+msg.substring(0,2000));
						  interfaceLogDto.setRetMsg("调用数据堂个人消费报告接口返回信息解析出错:"+msg.substring(0,2000));
					  }else{
						  dto.setErrormsg("调用数据堂个人消费报告接口返回信息解析出错:"+msg);
						  interfaceLogDto.setRetMsg("调用数据堂个人消费报告接口返回信息解析出错:"+msg);
					  }
					  dto.setRemark("调用数据堂个人消费报告接口返回信息解析出错");	
					     interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4.getKey());
				 }
			  }
			  params.put("dto",dto);
			  dao.insertExtSjtAbstractStock(params);
		}finally{
			try {
				interfaceLogDto.setRetBody(results);
				Long keyId =extInterfaceLogService.insertExtInterfaceLog(interfaceLogDto);
				dto.setInterfaceId(String.valueOf(keyId));
				this.updateExtSjtAbstractStock(dto);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	
}

