package com.jy.modules.externalplatform.interfacerepository.suanhua.extshqrecordstock.service;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jodd.util.StringUtil;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.suanhua.extshqrdetailstock.dto.ExtShQrDetailStockDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhua.extshqrdetailstock.service.ExtShQrDetailStockService;
import com.jy.modules.externalplatform.interfacerepository.suanhua.extshqrecordstock.dao.ExtShQrecordStockDao;
import com.jy.modules.externalplatform.interfacerepository.suanhua.extshqrecordstock.dto.ExtShQrecordStockDTO;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.BaseDTO;
import com.jy.platform.core.common.JYLoggerUtil;

/**
 * @classname: ExtShQrecordStockService
 * @description: 定义  算话征信查询记录查询报告 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhua.extshqrecordstock.service.ExtShQrecordStockService")
public class ExtShQrecordStockService implements ExtSaveMessageDao {
	private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	
	@Autowired
	ExtInterfaceLogService extInterfaceLogService;
    
	@Autowired
	private ExtShQrecordStockDao dao;

	@Autowired
	private ExtShQrDetailStockService extShQrecordDetailService ;
	/**
     * @author Administrator
     * @description: 分页查询 算话征信查询记录查询报告列表
     * @date 2017-06-08 18:04:56
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtShQrecordStockDTO> searchExtShQrecordStockByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtShQrecordStockDTO> dataList =  dao.searchExtShQrecordStockByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话征信查询记录查询报告列表
     * @date 2017-06-08 18:04:56
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtShQrecordStockDTO> searchExtShQrecordStock(Map<String,Object> searchParams) throws Exception {
	    List<ExtShQrecordStockDTO> dataList = dao.searchExtShQrecordStock(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话征信查询记录查询报告对象
     * @date 2017-06-08 18:04:56
     * @param id
     * @return
     * @throws
     */ 
	public ExtShQrecordStockDTO queryExtShQrecordStockByPrimaryKey(String id) throws Exception {
		
		ExtShQrecordStockDTO dto = dao.findExtShQrecordStockByPrimaryKey(id);
		
		if(dto == null) dto = new ExtShQrecordStockDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtShQrecordStock
     * @author Administrator
     * @description: 新增 算话征信查询记录查询报告对象
     * @date 2017-06-08 18:04:56
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtShQrecordStock(ExtShQrecordStockDTO dto,ExtInterfaceLogDTO interfaceLogDto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		dto.setRetcode(InterfaceEnum.RET_CODE_1.getKey());
	    dto.setRemark("调用算话征信查询记录查询报告接口查有");	
	    interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
	    interfaceLogDto.setRetMsg("调用算话征信查询记录查询报告接口查有");
		paramMap.put("dto", dto);
		
		int count = dao.insertExtShQrecordStock(paramMap);
		
		ExtShQrecordStockDTO resultDto = (ExtShQrecordStockDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtShQrecordStock
     * @author Administrator
     * @description: 修改 算话征信查询记录查询报告对象
     * @date 2017-06-08 18:04:56
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtShQrecordStock(ExtShQrecordStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtShQrecordStock(paramMap);
	}
	/**
     * @title: deleteExtShQrecordStockByPrimaryKey
     * @author Administrator
     * @description: 删除 算话征信查询记录查询报告,按主键
     * @date 2017-06-08 18:04:56
     * @param paramMap
     * @throws
     */ 
	public void deleteExtShQrecordStockByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtShQrecordStockByPrimaryKey(paramMap);
	}

	/**
	 * 接收数据保存
	 * @param map
	 */
	@SuppressWarnings("unchecked")
	public void saveMessage(Map<String,Object> map){
		//日志信息
		ExtInterfaceLogDTO interfaceLogDto=(ExtInterfaceLogDTO) map.get("interfaceLogDto");
		String results=String.valueOf(map.get("result"));
		Map<String, Object> params=new HashMap<String,Object>();
		ExtShQrecordStockDTO dto = new ExtShQrecordStockDTO();
		dto.setProdCode(String.valueOf(map.get("prod")));
		dto.setOrgCode(String.valueOf(map.get("org")));
		dto.setSysCode(String.valueOf(map.get("sysCode")));
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
					 dao.insertExtShQrecordStock(params);
					 return;
				 }
				//返回报文业务主体数据
				JSONObject dataJson = jsonObj.getJSONObject("data");
				dto = (ExtShQrecordStockDTO)JSONObject.toBean(dataJson, ExtShQrecordStockDTO.class);
				//交易成功标识
				boolean success = jsonObj.getBoolean("success");
				if(success){
					Long reportId = this.insertExtShQrecordStock(dto,interfaceLogDto);
					JSONArray details = dataJson.getJSONArray("details");
					if((!details.isEmpty()) && details.size()>0){
						List<ExtShQrDetailStockDTO> detailsList = JSONArray.toList(details,ExtShQrDetailStockDTO.class);
						if(CollectionUtils.isNotEmpty(detailsList)){
							//批量插入算话征信查询记录详细信息
							extShQrecordDetailService.insertExtShQrDetailStockList(detailsList, reportId);
							dto.setDetailMsg(InterfaceEnum.RET_MSG.getKey());
							this.updateExtShQrecordStock(dto);	
						}
					}
				}else{
	            	dto.setRetcode(InterfaceEnum.RET_CODE_5.getKey());
				    dto.setErrormsg("调用算话征信查询记录信息查询接口返回错误信息");
				    dto.setRemark("调用算话征信查询记录信息查询接口返回错误信息");	
				    interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_5.getKey());
					interfaceLogDto.setRetMsg("调用算话征信查询记录信息查询接口返回错误信息");
					params.put("dto", dto);
					dao.insertExtShQrecordStock(params);
	            }
			}else{				
			     dto.setRetcode(InterfaceEnum.RET_CODE_3.getKey());
			     dto.setErrormsg("调用算话征信查询记录信息查询接口报错");
			     dto.setRemark("调用算话征信查询记录信息查询接口报错");	
			     interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				 interfaceLogDto.setRetMsg("调用算话征信查询记录信息查询接口报错");
				 params.put("dto", dto);
				 dao.insertExtShQrecordStock(params);
			 }
		} catch (Exception ex) {
			  JYLoggerUtil.error(this.getClass(), "===调用算话征信查询记录信息查询解析回参异常===进件日志ID:"+String.valueOf(map.get("interfaceId")),ex);
			  String msg = ex.getMessage();
			  if(StringUtil.isNotEmpty(msg)){
				  if(msg.contains("A JSONObject text must begin with '{' at character 1 of")){
					  dto.setRetcode(InterfaceEnum.RET_CODE_3.getKey());
					  dto.setErrormsg("调用算话征信查询记录信息查询接口异常请求返回，请联系IT解决");
					  dto.setRemark("调用算话征信查询记录信息查询接口调用报错");	
					  interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
					  interfaceLogDto.setRetMsg("调用算话征信查询记录信息查询接口异常请求返回，请联系IT解决");
				 }else{
					  dto.setRetcode(InterfaceEnum.RET_CODE_4.getKey());
					  if(msg.length() > 2000){
						  dto.setErrormsg("调用算话征信查询记录信息查询接口返回信息解析出错:"+msg.substring(0,2000));
						  interfaceLogDto.setRetMsg("调用算话征信查询记录信息查询接口返回信息解析出错:"+msg.substring(0,2000));
					  }else{
						  dto.setErrormsg("调用算话征信查询记录信息查询接口返回信息解析出错:"+msg);
						  interfaceLogDto.setRetMsg("调用算话征信查询记录信息查询接口返回信息解析出错:"+msg);
					  }
					  dto.setRemark("调用算话征信查询记录信息查询接口返回信息解析出错");	
					  interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4.getKey());
					  
				 }
			  }
			  params.put("dto",dto);
			  dao.insertExtShQrecordStock(params);
		}finally{
			try {
				interfaceLogDto.setRetBody(results);
				Long keyId =extInterfaceLogService.insertExtInterfaceLog(interfaceLogDto);
				dto.setInterfaceId(String.valueOf(keyId));
				this.updateExtShQrecordStock(dto);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	
}

