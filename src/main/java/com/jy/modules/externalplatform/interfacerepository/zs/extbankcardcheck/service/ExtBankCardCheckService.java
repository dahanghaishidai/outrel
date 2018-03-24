package com.jy.modules.externalplatform.interfacerepository.zs.extbankcardcheck.service;
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

import com.jy.modules.externalplatform.interfacerepository.zs.extbankcardcheck.dao.ExtBankCardCheckDao;
import com.jy.modules.externalplatform.interfacerepository.zs.extbankcardcheck.dto.ExtBankCardCheckDTO;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.BaseDTO;
import com.jy.platform.core.common.JYLoggerUtil;

/**
 * @classname: ExtBankCardCheckService
 * @description: 定义  银行卡验证表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.zs.extbankcardcheck.service.ExtBankCardCheckService")
public class ExtBankCardCheckService implements ExtSaveMessageDao {
	private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	
	@Autowired
	ExtInterfaceLogService extInterfaceLogService;
    
	@Autowired
	private ExtBankCardCheckDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 银行卡验证表列表
     * @date 2017-06-14 11:35:32
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtBankCardCheckDTO> searchExtBankCardCheckByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtBankCardCheckDTO> dataList =  dao.searchExtBankCardCheckByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询银行卡验证表列表
     * @date 2017-06-14 11:35:32
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtBankCardCheckDTO> searchExtBankCardCheck(Map<String,Object> searchParams) throws Exception {
	    List<ExtBankCardCheckDTO> dataList = dao.searchExtBankCardCheck(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询银行卡验证表对象
     * @date 2017-06-14 11:35:32
     * @param id
     * @return
     * @throws
     */ 
	public ExtBankCardCheckDTO queryExtBankCardCheckByPrimaryKey(String id) throws Exception {
		
		ExtBankCardCheckDTO dto = dao.findExtBankCardCheckByPrimaryKey(id);
		
		if(dto == null) dto = new ExtBankCardCheckDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtBankCardCheck
     * @author Administrator
     * @description: 新增 银行卡验证表对象
     * @date 2017-06-14 11:35:32
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtBankCardCheck(ExtBankCardCheckDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtBankCardCheck(paramMap);
		
		ExtBankCardCheckDTO resultDto = (ExtBankCardCheckDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtBankCardCheck
     * @author Administrator
     * @description: 修改 银行卡验证表对象
     * @date 2017-06-14 11:35:32
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtBankCardCheck(ExtBankCardCheckDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtBankCardCheck(paramMap);
	}
	/**
     * @title: deleteExtBankCardCheckByPrimaryKey
     * @author Administrator
     * @description: 删除 银行卡验证表,按主键
     * @date 2017-06-14 11:35:32
     * @param paramMap
     * @throws
     */ 
	public void deleteExtBankCardCheckByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtBankCardCheckByPrimaryKey(paramMap);
	}

	/**
	 * 接受数据保存
	 * @param map
	 */
	public void saveMessage(Map<String,Object> map){
		//日志信息
		ExtInterfaceLogDTO interfaceLogDto=(ExtInterfaceLogDTO) map.get("interfaceLogDto");
		String results=String.valueOf(map.get("result"));
		
		String transRtnCode = null;
		String transRtnDesc = null;
		String bizRtnCode = null;
		String bizRtnDesc = null;
		Map<String, Object> params=new HashMap<String,Object>();
		ExtBankCardCheckDTO dto = new ExtBankCardCheckDTO();
		dto.setProdCode(String.valueOf(map.get("prod")));
		dto.setOrgCode(String.valueOf(map.get("org")));
		dto.setSysCode(String.valueOf(map.get("sysCode")));
		dto.setBankcardNum(String.valueOf(map.get("bankCardNum")));
		dto.setIdcard(String.valueOf(map.get("idCard")));
		dto.setName(String.valueOf(map.get("idCardName")));
		dto.setMobile(String.valueOf(map.get("mobile")));
		dto.setIdcardType("1");
		dto.setValidateState("1");
		dto.setBankcardType("1");
		try {
			if(StringUtils.isNotEmpty((CharSequence) map.get("result")) && !"null".equals(map.get("result"))){
				 JSONObject jsonObj = JSONObject.fromObject(map.get("result"));
				 if(null!=jsonObj.get("retCode") && jsonObj.get("retCode").equals("500")){
					 dto.setRetcode(InterfaceEnum.RET_CODE_6.getKey());
					 dto.setErrormsg(String.valueOf(jsonObj.get("errorDesc")));
					 dto.setRemark(String.valueOf(jsonObj.get("errorDesc")));
					 interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_6.getKey());
					 interfaceLogDto.setRetMsg(String.valueOf(jsonObj.get("errorDesc")));
					 params.put("dto", dto);
					 dao.insertExtBankCardCheck(params);
					 params.clear();
				 }else{
					 transRtnCode = jsonObj.getString("statcode");
					 transRtnDesc = jsonObj.getString("state");
					if("100".equals(transRtnCode) && jsonObj.has("msg")) {
						String msg=jsonObj.getString("msg");
						if(msg.indexOf("{")>-1){
							msg = msg.substring(msg.indexOf("{"), msg.lastIndexOf("}")+1);					
						}
						JSONObject cardJson = JSONObject.fromObject(msg).getJSONObject(String.valueOf(map.get("gmsfhm")));
						
						bizRtnCode = cardJson.getString("statcode");
						if("1200".equals(bizRtnCode) || "1203".equals(bizRtnCode)) {
							dto.setRetcode(InterfaceEnum.RET_CODE_1.getKey());
						    dto.setRemark("银行卡核查一致!");	
						    interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
							interfaceLogDto.setRetMsg("银行卡核查一致!");
						} else if("1201".equals(bizRtnCode) ||"1903".equals(bizRtnCode)|| "1920".equals(bizRtnCode)) {
							dto.setRetcode(InterfaceEnum.RET_CODE_1.getKey());
						    dto.setRemark("银行卡核查不一致!");
						    interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
							interfaceLogDto.setRetMsg("银行卡核查不一致!");
						}  else {
							dto.setRetcode(InterfaceEnum.RET_CODE_5.getKey());
							dto.setErrormsg("调用ZS银行卡证接口返回错误信息！");
						    dto.setRemark("调用ZS银行卡证接口返回错误信息！");
						    interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_5.getKey());
							interfaceLogDto.setRetMsg("调用ZS银行卡证接口返回错误信息！");
						}	
						dto.setCode(bizRtnCode);
						params.put("dto", dto);
						dao.insertExtBankCardCheck(params);
						params.clear();
					}else{									
					     dto.setRetcode(InterfaceEnum.RET_CODE_5.getKey());
					     dto.setErrormsg("调用ZS银行卡证接口，未成功返回！");
					     dto.setRemark("调用ZS银行卡证接口，未成功返回！");	
					     interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_5.getKey());
						 interfaceLogDto.setRetMsg("调用ZS银行卡证接口，未成功返回！");
						 params.put("dto", dto);
						 dao.insertExtBankCardCheck(params);
						 params.clear();
					}
				 }
			}else{				
			     dto.setRetcode(InterfaceEnum.RET_CODE_3.getKey());
			     dto.setErrormsg("调用ZS银行卡证接口报错");
			     dto.setRemark("调用ZS银行卡证接口报错");
			     interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				 interfaceLogDto.setRetMsg("调用ZS银行卡证接口报错！");
				 params.put("dto", dto);
				 dao.insertExtBankCardCheck(params);
				 params.clear();
			 }
		} catch (Exception ex) {
			  JYLoggerUtil.error(this.getClass(), "===ZS银行卡证接口异常===进件日志ID:"+String.valueOf(map.get("interfaceId")),ex);
			  String msg = ex.getMessage();
			  if(StringUtil.isNotEmpty(msg)){
				 if(msg.contains("A JSONObject text must begin with '{' at character 1 of")){
					  dto.setRetcode(InterfaceEnum.RET_CODE_5.getKey());
					  dto.setErrormsg("调用ZS银行卡证接口异常请求返回，请联系IT解决");
					  dto.setRemark("调用ZS银行卡证接口调用报错");
					  interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
					  interfaceLogDto.setRetMsg("调用ZS银行卡证接口异常请求返回，请联系IT解决");
				 }else{
					  dto.setRetcode(InterfaceEnum.RET_CODE_4.getKey());
					  if(msg.length() > 2000){
						  dto.setErrormsg("调用ZS银行卡证接口异常:"+msg.substring(0,2000));
						  interfaceLogDto.setRetMsg("调用ZS银行卡证接口异常:"+msg.substring(0,2000));
					  }else{
						  dto.setErrormsg("调用ZS银行卡证接口异常:"+msg);
						  interfaceLogDto.setRetMsg("调用ZS银行卡证接口异常:"+msg);
					  }
					  dto.setRemark("调用ZS银行卡证接口返回信息解析出错");
					  interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4.getKey());
				 }
			  }
			  params.put("dto",dto);
			  dao.insertExtBankCardCheck(params);
			  params.clear();
		}finally{
			try {
				interfaceLogDto.setRetBody(results);
				Long keyId =extInterfaceLogService.insertExtInterfaceLog(interfaceLogDto);
				dto.setInterfaceId(String.valueOf(keyId));
				this.updateExtBankCardCheck(dto);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}

