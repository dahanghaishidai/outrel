package com.jy.modules.externalplatform.interfacerepository.sjt.extsjttrafficviostock.service;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
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
import com.jy.modules.externalplatform.interfacerepository.sjt.extsjttrafficviostock.dao.ExtSjtTrafficVioStockDao;
import com.jy.modules.externalplatform.interfacerepository.sjt.extsjttrafficviostock.dto.ExtSjtTrafficVioStockDTO;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.ExtConstant;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.BaseDTO;
import com.jy.platform.core.common.JYLoggerUtil;

/**
 * @classname: ExtSjtTrafficVioStockService
 * @description: 定义  数据堂交通违章信息 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.sjt.extsjttrafficviostock.service.ExtSjtTrafficVioStockService")
public class ExtSjtTrafficVioStockService implements ExtSaveMessageDao {
	private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	
	@Autowired
	ExtInterfaceLogService extInterfaceLogService;
    
	@Autowired
	private ExtSjtTrafficVioStockDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 数据堂交通违章信息列表
     * @date 2017-06-08 16:48:10
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtSjtTrafficVioStockDTO> searchExtSjtTrafficVioStockByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtSjtTrafficVioStockDTO> dataList =  dao.searchExtSjtTrafficVioStockByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询数据堂交通违章信息列表
     * @date 2017-06-08 16:48:10
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtSjtTrafficVioStockDTO> searchExtSjtTrafficVioStock(Map<String,Object> searchParams) throws Exception {
	    List<ExtSjtTrafficVioStockDTO> dataList = dao.searchExtSjtTrafficVioStock(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询数据堂交通违章信息对象
     * @date 2017-06-08 16:48:10
     * @param id
     * @return
     * @throws
     */ 
	public ExtSjtTrafficVioStockDTO queryExtSjtTrafficVioStockByPrimaryKey(String id) throws Exception {
		
		ExtSjtTrafficVioStockDTO dto = dao.findExtSjtTrafficVioStockByPrimaryKey(id);
		
		if(dto == null) dto = new ExtSjtTrafficVioStockDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtSjtTrafficVioStock
     * @author Administrator
     * @description: 新增 数据堂交通违章信息对象
     * @date 2017-06-08 16:48:10
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtSjtTrafficVioStock(ExtSjtTrafficVioStockDTO dto,ExtInterfaceLogDTO interfaceLogDto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		dto.setRetcode(InterfaceEnum.RET_CODE_1.getKey());
	    dto.setRemark("调用数据堂交通违章信息接口查有");
		interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
		interfaceLogDto.setRetMsg("调用数据堂交通违章信息接口查有");
		paramMap.put("dto", dto);
		
		int count = dao.insertExtSjtTrafficVioStock(paramMap);
		ExtSjtTrafficVioStockDTO resultDto = (ExtSjtTrafficVioStockDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtSjtTrafficVioStock
     * @author Administrator
     * @description: 修改 数据堂交通违章信息对象
     * @date 2017-06-08 16:48:10
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtSjtTrafficVioStock(ExtSjtTrafficVioStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtSjtTrafficVioStock(paramMap);
	}
	/**
     * @title: deleteExtSjtTrafficVioStockByPrimaryKey
     * @author Administrator
     * @description: 删除 数据堂交通违章信息,按主键
     * @date 2017-06-08 16:48:10
     * @param paramMap
     * @throws
     */ 
	public void deleteExtSjtTrafficVioStockByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtSjtTrafficVioStockByPrimaryKey(paramMap);
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
		ExtSjtTrafficVioStockDTO dto = new ExtSjtTrafficVioStockDTO();
		dto.setProdCode(String.valueOf(map.get("prod")));
		dto.setOrgCode(String.valueOf(map.get("org")));
		dto.setSysCode(String.valueOf(map.get("sysCode")));
		dto.setTransNo(String.valueOf(map.get("transNo")));
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
					 dao.insertExtSjtTrafficVioStock(params);
					 return;
				 }
				dto = JSON.parseObject(String.valueOf(map.get("result")), ExtSjtTrafficVioStockDTO.class);
	            if(ExtConstant.SJT_SUCCESS_CODE.equals(dto.getErrorCode()) && "true".equals(dto.getHasData()) 
						&& dto.getRecords() != null && dto.getRecords().length > 0){
	            	for(ExtSjtTrafficVioStockDTO violationInfo : dto.getRecords()){
						violationInfo.setTransNo(dto.getTransNo());
						this.insertExtSjtTrafficVioStock(violationInfo,interfaceLogDto);
					}	            	
	            }else if(!"true".equals(dto.getHasData())){
	            	dto.setRetcode(InterfaceEnum.RET_CODE_2.getKey());
				    dto.setErrormsg("调用数据堂交通违章信息接口查无");
				    dto.setRemark("调用数据堂交通违章信息接口查无");
				    interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_2.getKey());
					interfaceLogDto.setRetMsg("调用数据堂交通违章信息接口查无");				
					params.put("dto", dto);
					dao.insertExtSjtTrafficVioStock(params);
	            }else{
	            	Map resmap = JSON.parseObject(String.valueOf(map.get("result")), Map.class);
	            	dto.setRetcode(InterfaceEnum.RET_CODE_5.getKey());
				    dto.setErrormsg(resmap.get("status")+":"+resmap.get("message")+"");
				    dto.setRemark("调用数据堂交通违章信息接口返回错误信息");	
				    interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_5.getKey());
					interfaceLogDto.setRetMsg(resmap.get("status")+":"+resmap.get("message")+"");
					params.put("dto", dto);
					dao.insertExtSjtTrafficVioStock(params);
	            }
			}else{				
			     dto.setRetcode(InterfaceEnum.RET_CODE_3.getKey());
			     dto.setErrormsg("调用数据堂交通违章信息接口报错");
			     dto.setRemark("调用数据堂交通违章信息接口报错");	
			     interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				 interfaceLogDto.setRetMsg("调用数据堂交通违章信息接口报错");	
				 params.put("dto", dto);
				 dao.insertExtSjtTrafficVioStock(params);
			 }
		} catch (Exception ex) {
			  JYLoggerUtil.error(this.getClass(), "===调用数据堂交通违章信息解析回参异常===进件日志ID:"+String.valueOf(map.get("interfaceId")),ex);
			  String msg = ex.getMessage();
			  if(StringUtil.isNotEmpty(msg)){
				  if(msg.contains("A JSONObject text must begin with '{' at character 1 of")){
					  dto.setRetcode(InterfaceEnum.RET_CODE_3.getKey());
					  dto.setErrormsg("调用数据堂交通违章信息接口异常请求返回，请联系IT解决");
					  dto.setRemark("调用数据堂交通违章信息接口调用报错");
					  interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
					  interfaceLogDto.setRetMsg("调用数据堂交通违章信息接口异常请求返回，请联系IT解决");
				 }else{
					  dto.setRetcode(InterfaceEnum.RET_CODE_4.getKey());
					  if(msg.length() > 2000){
						  dto.setErrormsg("调用数据堂交通违章信息接口返回信息解析出错:"+msg.substring(0,2000));
						  interfaceLogDto.setRetMsg("调用数据堂交通违章信息接口返回信息解析出错:"+msg.substring(0,2000));
					  }else{
						  dto.setErrormsg("调用数据堂交通违章信息接口返回信息解析出错:"+msg);
						  interfaceLogDto.setRetMsg("调用数据堂交通违章信息接口返回信息解析出错:"+msg);
					  }
					  dto.setRemark("调用数据堂交通违章信息接口返回信息解析出错");
					  interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4.getKey());
				 }
			  }
			  params.put("dto",dto);
			  dao.insertExtSjtTrafficVioStock(params);
		}finally{
			try {
				interfaceLogDto.setRetBody(results);
				Long keyId =extInterfaceLogService.insertExtInterfaceLog(interfaceLogDto);
				dto.setInterfaceId(String.valueOf(keyId));
				this.updateExtSjtTrafficVioStock(dto);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	
}

