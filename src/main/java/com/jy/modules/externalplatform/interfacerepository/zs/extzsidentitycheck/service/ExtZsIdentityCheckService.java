package com.jy.modules.externalplatform.interfacerepository.zs.extzsidentitycheck.service;
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

import com.jy.modules.externalplatform.interfacerepository.zs.extzsidentitycheck.dao.ExtZsIdentityCheckDao;
import com.jy.modules.externalplatform.interfacerepository.zs.extzsidentitycheck.dto.ExtZsIdentityCheckDTO;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.BaseDTO;
import com.jy.platform.core.common.JYLoggerUtil;

/**
 * @classname: ExtZsIdentityCheckService
 * @description: 定义  中胜身份校验查询结果 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.zs.extzsidentitycheck.service.ExtZsIdentityCheckService")
public class ExtZsIdentityCheckService implements ExtSaveMessageDao {
	private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	
	@Autowired
	ExtInterfaceLogService extInterfaceLogService;
	@Autowired
	private ExtZsIdentityCheckDao dao;
	
	/**
     * @author Administrator
     * @description: 分页查询 中胜身份校验查询结果列表
     * @date 2017-06-02 14:13:34
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtZsIdentityCheckDTO> searchExtZsIdentityCheckByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtZsIdentityCheckDTO> dataList =  dao.searchExtZsIdentityCheckByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询中胜身份校验查询结果列表
     * @date 2017-06-02 14:13:34
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtZsIdentityCheckDTO> searchExtZsIdentityCheck(Map<String,Object> searchParams) throws Exception {
	    List<ExtZsIdentityCheckDTO> dataList = dao.searchExtZsIdentityCheck(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询中胜身份校验查询结果对象
     * @date 2017-06-02 14:13:34
     * @param id
     * @return
     * @throws
     */ 
	public ExtZsIdentityCheckDTO queryExtZsIdentityCheckByPrimaryKey(String id) throws Exception {
		
		ExtZsIdentityCheckDTO dto = dao.findExtZsIdentityCheckByPrimaryKey(id);
		
		if(dto == null) dto = new ExtZsIdentityCheckDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtZsIdentityCheck
     * @author Administrator
     * @description: 新增 中胜身份校验查询结果对象
     * @date 2017-06-02 14:13:34
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtZsIdentityCheck(ExtZsIdentityCheckDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtZsIdentityCheck(paramMap);
		
		ExtZsIdentityCheckDTO resultDto = (ExtZsIdentityCheckDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtZsIdentityCheck
     * @author Administrator
     * @description: 修改 中胜身份校验查询结果对象
     * @date 2017-06-02 14:13:34
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtZsIdentityCheck(ExtZsIdentityCheckDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtZsIdentityCheck(paramMap);
	}
	/**
     * @title: deleteExtZsIdentityCheckByPrimaryKey
     * @author Administrator
     * @description: 删除 中胜身份校验查询结果,按主键
     * @date 2017-06-02 14:13:34
     * @param paramMap
     * @throws
     */ 
	public void deleteExtZsIdentityCheckByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtZsIdentityCheckByPrimaryKey(paramMap);
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
		ExtZsIdentityCheckDTO dto = new ExtZsIdentityCheckDTO();
		dto.setProdCode(String.valueOf(map.get("prod")));
		dto.setOrgCode(String.valueOf(map.get("org")));
		dto.setSysCode(String.valueOf(map.get("sysCode")));
		dto.setCustName(String.valueOf(map.get("xm")));
		dto.setCardId(String.valueOf(map.get("gmsfhm")));
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
					 dao.insertExtZsIdentityCheck(params);
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
						if("1100".equals(bizRtnCode)) {
							dto.setRetcode(InterfaceEnum.RET_CODE_1.getKey());
						    dto.setRemark("结果一致");	
						    dto.setBizRtnDesc("结果一致");
						    interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
							interfaceLogDto.setRetMsg("结果一致");
						} else if("1101".equals(bizRtnCode)) {
							dto.setRetcode(InterfaceEnum.RET_CODE_1.getKey());
						    dto.setRemark("结果不一致：身份证号码不一致");
						    dto.setBizRtnDesc("结果不一致：身份证号码不一致");
						    interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
							interfaceLogDto.setRetMsg("结果不一致：身份证号码不一致");
						} else if("1102".equals(bizRtnCode)) {
							dto.setRetcode(InterfaceEnum.RET_CODE_2.getKey());
						    dto.setRemark("结果不一致：身份证姓名不一致");	
						    dto.setBizRtnDesc("结果不一致：身份证姓名不一致");
						    interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_2.getKey());
							interfaceLogDto.setRetMsg("结果不一致：身份证姓名不一致");
						} else {
							dto.setRetcode(InterfaceEnum.RET_CODE_5.getKey());
							dto.setErrormsg("调用ZS身份验证接口返回错误信息！");
						    dto.setRemark("调用ZS身份验证接口返回错误信息！");
						    dto.setBizRtnDesc("调用ZS身份验证接口返回错误信息！");
						    interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_5.getKey());
							interfaceLogDto.setRetMsg("调用ZS身份验证接口返回错误信息！");
						}											    
						dto.setTransRtnCode(transRtnCode);
						dto.setTransRtnDesc(transRtnDesc);
						dto.setBizRtnCode(bizRtnCode);
						dto.setRepMessage("");
						dto.setRespMessage(String.valueOf(map.get("result")));
						params.put("dto", dto);
						dao.insertExtZsIdentityCheck(params);
						params.clear();
					}else{									
					     dto.setRetcode(InterfaceEnum.RET_CODE_5.getKey());
					     dto.setErrormsg("调用ZS身份验证接口，未成功返回！");
					     dto.setRemark("调用ZS身份验证接口，未成功返回！");	
					     interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_5.getKey());
						 interfaceLogDto.setRetMsg("调用ZS身份验证接口，未成功返回！");
						 params.put("dto", dto);
						 dao.insertExtZsIdentityCheck(params);
						 params.clear();
					}
				 }
			}else{				
			     dto.setRetcode(InterfaceEnum.RET_CODE_3.getKey());
			     dto.setErrormsg("调用ZS身份验证接口报错");
			     dto.setRemark("调用ZS身份验证接口报错");
			     interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				 interfaceLogDto.setRetMsg("调用ZS身份验证接口报错！");
				 params.put("dto", dto);
				 dao.insertExtZsIdentityCheck(params);
				 params.clear();
			 }
		} catch (Exception ex) {
			  JYLoggerUtil.error(this.getClass(), "===ZS身份验证接口异常===进件日志ID:"+String.valueOf(map.get("interfaceId")),ex);
			  String msg = ex.getMessage();
			  if(StringUtil.isNotEmpty(msg)){
				 if(msg.contains("A JSONObject text must begin with '{' at character 1 of")){
					  dto.setRetcode(InterfaceEnum.RET_CODE_5.getKey());
					  dto.setErrormsg("调用ZS身份验证接口异常请求返回，请联系IT解决");
					  dto.setRemark("调用ZS身份验证接口调用报错");
					  interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
					  interfaceLogDto.setRetMsg("调用ZS身份验证接口异常请求返回，请联系IT解决");
				 }else{
					  dto.setRetcode(InterfaceEnum.RET_CODE_4.getKey());
					  if(msg.length() > 2000){
						  dto.setErrormsg("调用ZS身份验证接口异常:"+msg.substring(0,2000));
						  interfaceLogDto.setRetMsg("调用ZS身份验证接口异常:"+msg.substring(0,2000));
					  }else{
						  dto.setErrormsg("调用ZS身份验证接口异常:"+msg);
						  interfaceLogDto.setRetMsg("调用ZS身份验证接口异常:"+msg);
					  }
					  dto.setRemark("调用ZS身份验证接口返回信息解析出错");
					  interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4.getKey());
				 }
			  }
			  params.put("dto",dto);
			  dao.insertExtZsIdentityCheck(params);
			  params.clear();
		}finally{
			try {
				interfaceLogDto.setRetBody(results);
				Long keyId =extInterfaceLogService.insertExtInterfaceLog(interfaceLogDto);
				dto.setInterfaceId(String.valueOf(keyId));
				this.updateExtZsIdentityCheck(dto);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}

