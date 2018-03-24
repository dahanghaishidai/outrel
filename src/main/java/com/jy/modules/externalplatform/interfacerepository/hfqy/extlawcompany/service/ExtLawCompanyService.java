package com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompany.service;
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
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompany.dao.ExtLawCompanyDao;
import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompany.dto.ExtLawCompanyDTO;
import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanycase.dao.ExtLawCompanyCaseDao;
import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanycase.dto.ExtLawCompanyCaseDTO;
import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanycq.dao.ExtLawCompanyCqDao;
import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanycq.dto.ExtLawCompanyCqDTO;
import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanydishonesty.dao.ExtLawCompanyDishonestyDao;
import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanydishonesty.dto.ExtLawCompanyDishonestyDTO;
import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanyexe.dao.ExtLawCompanyExeDao;
import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanyexe.dto.ExtLawCompanyExeDTO;
import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanyloanoverdue.dao.ExtLawCompanyLoanoverdueDao;
import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanyloanoverdue.dto.ExtLawCompanyLoanoverdueDTO;
import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanyopencourt.dao.ExtLawCompanyOpencourtDao;
import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanyopencourt.dto.ExtLawCompanyOpencourtDTO;
import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanyother.dao.ExtLawCompanyOtherDao;
import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanyother.dto.ExtLawCompanyOtherDTO;
import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanytax.dao.ExtLawCompanyTaxDao;
import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanytax.dto.ExtLawCompanyTaxDTO;
import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawtrialprocedure.dao.ExtLawTrialProcedureDao;
import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawtrialprocedure.dto.ExtLawTrialProcedureDTO;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.ExtConstant;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.BaseDTO;
import com.jy.platform.core.common.JYLoggerUtil;

/**
 * @classname: ExtLawCompanyService
 * @description: 定义  汇法网企业信息主表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompany.service.ExtLawCompanyService")
public class ExtLawCompanyService implements ExtSaveMessageDao {
	private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	
	@Autowired
	ExtInterfaceLogService extInterfaceLogService;
	
	@Autowired
	private ExtLawCompanyDao dao;
	
	@Autowired
   	private ExtLawCompanyExeDao exeDao;
   	            
   	@Autowired   
   	private ExtLawCompanyCaseDao caseDao;
   	             
   	@Autowired    
   	private ExtLawCompanyDishonestyDao dishonestyDao;
   	             
   	@Autowired   
   	private ExtLawCompanyTaxDao taxDao;
   	              
   	@Autowired   
   	private ExtLawCompanyCqDao cqDao; 
   	             
   	@Autowired    
   	private ExtLawCompanyLoanoverdueDao netLoanDao; 
   	
   	@Autowired    
   	private ExtLawCompanyOpencourtDao opencourtDao; 
   	
	@Autowired    
   	private ExtLawCompanyOtherDao otherDao; 
	
	@Autowired    
   	private ExtLawTrialProcedureDao trialDao; 

	/**
     * @author Administrator
     * @description: 分页查询 汇法网企业信息主表列表
     * @date 2017-06-01 10:10:26
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtLawCompanyDTO> searchExtLawCompanyByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtLawCompanyDTO> dataList =  dao.searchExtLawCompanyByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询汇法网企业信息主表列表
     * @date 2017-06-01 10:10:26
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtLawCompanyDTO> searchExtLawCompany(Map<String,Object> searchParams) throws Exception {
	    List<ExtLawCompanyDTO> dataList = dao.searchExtLawCompany(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询汇法网企业信息主表对象
     * @date 2017-06-01 10:10:26
     * @param id
     * @return
     * @throws
     */ 
	public ExtLawCompanyDTO queryExtLawCompanyByPrimaryKey(String id) throws Exception {
		
		ExtLawCompanyDTO dto = dao.findExtLawCompanyByPrimaryKey(id);
		
		if(dto == null) dto = new ExtLawCompanyDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtLawCompany
     * @author Administrator
     * @description: 新增 汇法网企业信息主表对象
     * @date 2017-06-01 10:10:26
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtLawCompany(ExtLawCompanyDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtLawCompany(paramMap);
		
		ExtLawCompanyDTO resultDto = (ExtLawCompanyDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtLawCompany
     * @author Administrator
     * @description: 修改 汇法网企业信息主表对象
     * @date 2017-06-01 10:10:26
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtLawCompany(ExtLawCompanyDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtLawCompany(paramMap);
	}
	/**
     * @title: deleteExtLawCompanyByPrimaryKey
     * @author Administrator
     * @description: 删除 汇法网企业信息主表,按主键
     * @date 2017-06-01 10:10:26
     * @param paramMap
     * @throws
     */ 
	public void deleteExtLawCompanyByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtLawCompanyByPrimaryKey(paramMap);
	}

	/**
	 * 接受数据保存
	 * @param map
	 */
	public void saveMessage(Map<String,Object> map){
		String isSuccess = "0";//是否调用成功  "1":成功， "0"：失败
		String retCode = "";//接口返回码
		String retMsg = "";//接口返回信息
		String fkBizId = "";// 关联字段
		//日志信息
		ExtInterfaceLogDTO interfaceLogDto=(ExtInterfaceLogDTO) map.get("interfaceLogDto");
		String results=String.valueOf(map.get("result"));
		ExtLawCompanyDTO dtolog = new ExtLawCompanyDTO();
		try {
			if(StringUtils.isNotEmpty((CharSequence) map.get("result")) && !"null".equals(map.get("result"))){
				 JSONObject ob=JSONObject.fromObject(map.get("result"));
				 
				 /*retCode = ob.getString("retCode");//补充设置接口返回码；用于留存记录*/
				 if(null != ob.get("message")){
					 retMsg = ob.get("message").toString();//补充设置接口返回信息；用于留存信息
				 }
				 if(null != ob.get("success")){
					 retCode = ob.get("success").toString();//补充设置接口返回信息；用于留存信息
				 }
				 
				 if(null!=ob.get("retCode") && ob.get("retCode").equals("500")){
					 ExtLawCompanyDTO dto = new ExtLawCompanyDTO();
					 Map<String, Object> personalParams2=new HashMap<String,Object>();
					 dto.setProdCode(String.valueOf(map.get("prod")));
					 dto.setOrgCode(String.valueOf(map.get("org")));
					 dto.setSysCode(String.valueOf(map.get("sysCode")));
					 dto.setName(String.valueOf(map.get("n")));
					 if(null==map.get("id")){
						 dto.setCidorcode("");
					 }else{
						 dto.setCidorcode(String.valueOf(map.get("id")));
					 }
					 dto.setRetcode(InterfaceEnum.RET_CODE_6.getKey());
					 dto.setErrormsg(String.valueOf(ob.get("errorDesc")));
					 dto.setRemark(String.valueOf(ob.get("errorDesc")));
					 interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_6.getKey());
					 interfaceLogDto.setRetMsg(String.valueOf(ob.get("errorDesc")));
					 personalParams2.put("dto", dto);
					 dao.insertExtLawCompany(personalParams2);
					 BeanUtils.copyProperties(dto, dtolog);
					 personalParams2.clear();
				 }else{
					 isSuccess = "1";// 补充设置接口调用成功，用于留存记录
					 String result = String.valueOf(map.get("result")).replaceAll("date","adjudicateDate");
					 JSONObject jsonObject=JSONObject.fromObject(result);
					 JSONArray jSONArray= jsonObject.getJSONArray("models");
					 //将获取的JSONArray转化为ExtLawCompanyDTO对象列表
					 List<ExtLawCompanyDTO> list =JSONArray.toList(jSONArray,ExtLawCompanyDTO.class);
					 Map<String, Object> companyParams=new HashMap<String,Object>();
					 Map<String, Object> params=new HashMap<String,Object>();
					 if(CollectionUtils.isEmpty(list)){
						 ExtLawCompanyDTO dto = new ExtLawCompanyDTO();
						 dto.setProdCode(String.valueOf(map.get("prod")));
						 dto.setOrgCode(String.valueOf(map.get("org")));
						 dto.setSysCode(String.valueOf(map.get("sysCode")));
						 dto.setName(String.valueOf(map.get("n")));
						 if(null==map.get("id")){
							 dto.setCidorcode("");
						 }else{
							 dto.setCidorcode(String.valueOf(map.get("id")));
						 }				 
						 dto.setRetcode(InterfaceEnum.RET_CODE_2.getKey());
						 dto.setErrormsg("汇法征信企业查询接口查无！");
						 dto.setRemark("汇法征信企业查询接口查无！");
						 dto.setInterfaceId(String.valueOf(map.get("interfaceId")));
						 interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_2.getKey());
						 interfaceLogDto.setRetMsg("汇法征信企业查询接口查无!");
						 companyParams.put("dto", dto);
						 dao.insertExtLawCompany(companyParams);
						 BeanUtils.copyProperties(dto, dtolog);
						 companyParams.clear();  
					 }else if (CollectionUtils.isNotEmpty(list)) {
						 
						  //汇法网企业信息保存
						 ExtLawCompanyDTO companyDto = new ExtLawCompanyDTO();
						 companyDto.setProdCode(String.valueOf(map.get("prod")));
						 companyDto.setOrgCode(String.valueOf(map.get("org")));
						 companyDto.setSysCode(String.valueOf(map.get("sysCode")));
						 companyDto.setName(String.valueOf(map.get("n")));
						 if(null==map.get("id")){
							 companyDto.setCidorcode("");
						 }else{
							 companyDto.setCidorcode(String.valueOf(map.get("id")));
						 }
						 companyDto.setRetcode(InterfaceEnum.RET_CODE_1.getKey());
						 companyDto.setRemark("汇法征信企业查询接口查有！");
						 companyDto.setInterfaceId(String.valueOf(map.get("interfaceId")));
						 interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
						 interfaceLogDto.setRetMsg("汇法征信企业查询接口查有！");
						 companyParams.put("dto", companyDto);
						 //插入数据,并返回主键
						 /*dao.insertExtLawCompany(companyParams);*/
						 Long id = this.insertExtLawCompany(companyDto);
						 fkBizId = String.valueOf(id);//
						 
						 BeanUtils.copyProperties(companyDto, dtolog);
						 companyParams.clear();  
						  for (int i = 0; i < list.size(); i++) {
					         ExtLawCompanyDTO dto =list.get(i);					 
							 JSONObject object = (JSONObject)jSONArray.get(i);
							 String str= (String) object.get("json");
					    	 JSONObject json = new JSONObject();
					    	 if(StringUtils.isNotEmpty(str)&&str.length()>1){
					    		 json.put("json",str.substring(1,str.length()- 1)); 
					    		 json= json.getJSONObject("json");
					    	 }
					    	 if(ExtConstant.LAW_COMPANY_EXE.equals(dto.getType())){ //汇法网企业执行信息保存
					    		 companyDto.setExeMsg(InterfaceEnum.RET_MSG.getKey());
					    		 BeanUtils.copyProperties(companyDto, dtolog);
					    		 companyParams.put("dto", companyDto);
					    	 	 dao.updateExtLawCompany(companyParams);
					    	 	 
					    		 ExtLawCompanyExeDTO exe = (ExtLawCompanyExeDTO)JSONObject.toBean(json,ExtLawCompanyExeDTO.class); 
						    	 exe.setFkId(companyDto.getId());
						    	 exe.setKeyid(dto.getKeyid());
						    	 exe.setDatatime(dto.getDatatime());
						    	 params.put("dto", exe);
						    	 exeDao.insertExtLawCompanyExe(params);
						    	 params.clear(); 
					    	 }else if(ExtConstant.LAW_COMPANY_CASE.equals(dto.getType())){//汇法网企业案例信息保存
					    		 companyDto.setCaseMsg(InterfaceEnum.RET_MSG.getKey());
					    		 BeanUtils.copyProperties(companyDto, dtolog);
					    		 companyParams.put("dto", companyDto);
					    	 	 dao.updateExtLawCompany(companyParams);
					    	 	 
					    		 ExtLawCompanyCaseDTO cs= (ExtLawCompanyCaseDTO)JSONObject.toBean(json,ExtLawCompanyCaseDTO.class); 
						    	 cs.setFkId(companyDto.getId());
						    	 cs.setKeyid(dto.getKeyid());
						    	 cs.setDatatime(dto.getDatatime());
						    	 params.put("dto", cs);
						    	 caseDao.insertExtLawCompanyCase(params);
						    	 params.clear();
					    	 }else if(ExtConstant.LAW_COMPANY_DISHONESTY.equals(dto.getType())){//汇法网企业失信信息保存
					    		 companyDto.setDishonestyMsg(InterfaceEnum.RET_MSG.getKey());
					    		 BeanUtils.copyProperties(companyDto, dtolog);
					    		 companyParams.put("dto", companyDto);
					    	 	 dao.updateExtLawCompany(companyParams);
					    	 	 
					    		 ExtLawCompanyDishonestyDTO  dishonesty= (ExtLawCompanyDishonestyDTO)JSONObject.toBean(json,ExtLawCompanyDishonestyDTO.class); 
						    	 dishonesty.setFkId(companyDto.getId());
						    	 dishonesty.setKeyid(dto.getKeyid());
						    	 dishonesty.setDatatime(dto.getDatatime());
						    	 params.put("dto",dishonesty);
						    	 dishonestyDao.insertExtLawCompanyDishonesty(params);
						    	 params.clear();	 
					    	 }else if(ExtConstant.LAW_COMPANY_TAX.equals(dto.getType())){//汇法网企业税务信息保存
					    		 companyDto.setTaxMsg(InterfaceEnum.RET_MSG.getKey());
					    		 BeanUtils.copyProperties(companyDto, dtolog);
					    		 companyParams.put("dto", companyDto);
					    	 	 dao.updateExtLawCompany(companyParams);
					    	 	 
					    		 ExtLawCompanyTaxDTO  tax= (ExtLawCompanyTaxDTO)JSONObject.toBean(json,ExtLawCompanyTaxDTO.class); 
						    	 tax.setFkId(companyDto.getId());
						    	 tax.setKeyid(dto.getKeyid());
						    	 tax.setDatatime(dto.getDatatime());
						    	 params.put("dto",tax);
						    	 taxDao.insertExtLawCompanyTax(params);
						    	 params.clear();
					    	 }else if(ExtConstant.LAW_COMPANY_CQ.equals(dto.getType())){//汇法网企业催欠信息保存
					    		 companyDto.setCqMsg(InterfaceEnum.RET_MSG.getKey());
					    		 BeanUtils.copyProperties(companyDto, dtolog);
					    		 companyParams.put("dto", companyDto);
					    	 	 dao.updateExtLawCompany(companyParams);
					    	 	 
					    		 ExtLawCompanyCqDTO  cq= (ExtLawCompanyCqDTO)JSONObject.toBean(json,ExtLawCompanyCqDTO.class); 
						    	 cq.setFkId(companyDto.getId());
						    	 cq.setKeyid(dto.getKeyid());
						    	 cq.setDatatime(dto.getDatatime());
						    	 params.put("dto",cq);
						    	 cqDao.insertExtLawCompanyCq(params);
						    	 params.clear();	 
					    	 }else if(ExtConstant.LAW_COMPANY_NETLOAN.equals(dto.getType())){//汇法网企业网贷逾期信息保存
					    		 companyDto.setLoanoverdueMsg(InterfaceEnum.RET_MSG.getKey());
					    		 BeanUtils.copyProperties(companyDto, dtolog);
					    		 companyParams.put("dto", companyDto);
					    	 	 dao.updateExtLawCompany(companyParams);
					    	 	 
					    		 ExtLawCompanyLoanoverdueDTO  netLoan= (ExtLawCompanyLoanoverdueDTO)JSONObject.toBean(json,ExtLawCompanyLoanoverdueDTO.class); 
						    	 netLoan.setFkId(companyDto.getId());
						    	 netLoan.setKeyid(dto.getKeyid());
						    	 netLoan.setDatatime(dto.getDatatime());
						    	 params.put("dto",netLoan);
						    	 netLoanDao.insertExtLawCompanyLoanoverdue(params);
						    	 params.clear(); 
					    	 }else if(ExtConstant.LAW_COMPANY_OPENCOURT.equals(dto.getType())){//汇法网企业开庭公告保存
					    		 companyDto.setOpencourtMsg(InterfaceEnum.RET_MSG.getKey());
					    		 BeanUtils.copyProperties(companyDto, dtolog);
					    		 companyParams.put("dto", companyDto);
					    	 	 dao.updateExtLawCompany(companyParams);
					    	 	 
					    		 ExtLawCompanyOpencourtDTO  opencourt= (ExtLawCompanyOpencourtDTO)JSONObject.toBean(json,ExtLawCompanyOpencourtDTO.class); 
					    		 opencourt.setFkId(companyDto.getId());
					    		 opencourt.setKeyid(dto.getKeyid());
					    		 opencourt.setDatatime(dto.getDatatime());
						    	 params.put("dto",opencourt);
						    	 opencourtDao.insertExtLawCompanyOpencourt(params);
						    	 params.clear(); 
					    	 }else if(ExtConstant.LAW_COMPANY_OTHER.equals(dto.getType())){//汇法网企业其他司法公告保存
					    		 companyDto.setOtherMsg(InterfaceEnum.RET_MSG.getKey());
					    		 BeanUtils.copyProperties(companyDto, dtolog);
					    		 companyParams.put("dto", companyDto);
					    	 	 dao.updateExtLawCompany(companyParams);
					    	 	 
					    		 ExtLawCompanyOtherDTO  other= (ExtLawCompanyOtherDTO)JSONObject.toBean(json,ExtLawCompanyOtherDTO.class); 
					    		 other.setFkId(companyDto.getId());
					    		 other.setKeyid(dto.getKeyid());
					    		 other.setDatatime(dto.getDatatime());
						    	 params.put("dto",other);
						    	 otherDao.insertExtLawCompanyOther(params);
						    	 params.clear(); 
					    	 }else if(ExtConstant.LAW_TRIAL_PROCEDURE.equals(dto.getType())){//汇法网企业其他司法公告保存
					    		 companyDto.setProcedureMsg(InterfaceEnum.RET_MSG.getKey());
					    		 BeanUtils.copyProperties(companyDto, dtolog);
					    		 companyParams.put("dto", companyDto);
					    	 	 dao.updateExtLawCompany(companyParams);
					    	 	 
					    		 ExtLawTrialProcedureDTO  trial= (ExtLawTrialProcedureDTO)JSONObject.toBean(json,ExtLawTrialProcedureDTO.class); 
					    		 trial.setFkId(companyDto.getId());
					    		 trial.setKeyid(dto.getKeyid());
					    		 trial.setDatatime(dto.getDatatime());
						    	 params.put("dto",trial);
						    	 trialDao.insertExtLawTrialProcedure(params);
						    	 params.clear(); 
					    	 }    
		
						  }
					  }
				 }
			}else{
				 Map<String, Object> params=new HashMap<String,Object>();
				 ExtLawCompanyDTO dto = new ExtLawCompanyDTO();
				 dto.setProdCode(String.valueOf(map.get("prod")));
				 dto.setOrgCode(String.valueOf(map.get("org")));
				 dto.setSysCode(String.valueOf(map.get("sysCode")));
				 dto.setName(String.valueOf(map.get("n")));
				 if(null==map.get("id")){
					 dto.setCidorcode("");
				  }else{
					 dto.setCidorcode(String.valueOf(map.get("id")));
				  }
				 dto.setInterfaceId(String.valueOf(map.get("interfaceId")));				
			     dto.setRetcode(InterfaceEnum.RET_CODE_3.getKey());
			     dto.setErrormsg("汇法征信企业查询调用接口报错");
			     dto.setRemark("汇法征信企业查询调用接口报错");		
			     interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				 interfaceLogDto.setRetMsg("汇法征信企业查询调用接口报错！");
				 params.put("dto", dto);
				 dao.insertExtLawCompany(params);
				 BeanUtils.copyProperties(dto, dtolog);
			 }
		} catch (Exception ex) {
			  JYLoggerUtil.error(this.getClass(), "===汇法征信 企业查询接口异常===进件日志ID:"+String.valueOf(map.get("interfaceId")),ex);
			  Map<String, Object> params=new HashMap<String,Object>();
			  ExtLawCompanyDTO dto = new ExtLawCompanyDTO();
			  dto.setProdCode(String.valueOf(map.get("prod")));
			  dto.setOrgCode(String.valueOf(map.get("org")));
			  dto.setSysCode(String.valueOf(map.get("sysCode")));
			  dto.setName(String.valueOf(map.get("n")));
			  if(null==map.get("id")){
				 dto.setCidorcode("");
			  }else{
				 dto.setCidorcode(String.valueOf(map.get("id")));
			  }
			  dto.setInterfaceId(String.valueOf(map.get("interfaceId")));
			  String msg = ex.getMessage();
			  if(StringUtil.isNotEmpty(msg)){
				 if(msg.contains("A JSONObject text must begin with '{' at character 1 of")){
					  dto.setRetcode(InterfaceEnum.RET_CODE_3.getKey());
					  dto.setErrormsg("汇法征信企业查询接口异常请求返回，请联系IT解决");
					  dto.setRemark("汇法征信企业查询接口调用报错");
					  interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
					  interfaceLogDto.setRetMsg("汇法征信企业查询接口异常请求返回，请联系IT解决");
				 }else if(msg.length() > 2000){
					  dto.setRetcode(InterfaceEnum.RET_CODE_4.getKey());
					  dto.setErrormsg("汇法征信企业查询接口异常:"+msg.substring(0,2000));
					  dto.setRemark("汇法征信企业查询接口返回信息解析出错"); 
					  interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4.getKey());
					  interfaceLogDto.setRetMsg("汇法征信企业查询接口返回信息解析出错:"+msg.substring(0,2000));
				 }else{
					  dto.setRetcode(InterfaceEnum.RET_CODE_4.getKey());
					  dto.setErrormsg("汇法征信企业查询接口异常:"+msg);
					  dto.setRemark("汇法征信企业查询接口返回信息解析出错");
					  interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4.getKey());
					  interfaceLogDto.setRetMsg("汇法征信企业查询接口返回信息解析出错:"+msg);
				 }
			  }
			  params.put("dto",dto);
			  dao.insertExtLawCompany(params);
			  BeanUtils.copyProperties(dto, dtolog);
		}finally{
			try {
				interfaceLogDto.setRetBody(results);
				interfaceLogDto.setExt2(isSuccess);
				interfaceLogDto.setExt3(retCode);
				interfaceLogDto.setExt4(retMsg);
				interfaceLogDto.setExt5(fkBizId);//保存 主表 主键 
				Long keyId =extInterfaceLogService.insertExtInterfaceLog(interfaceLogDto);
				dtolog.setInterfaceId(String.valueOf(keyId));
				this.updateExtLawCompany(dtolog);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}

