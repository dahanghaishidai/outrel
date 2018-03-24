package com.jy.modules.externalplatform.interfacerepository.suanhua.extshperreportstock.service;
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

import com.jy.modules.externalplatform.interfacerepository.suanhua.extshpercreloanstock.dto.ExtShPerCreLoanStockDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhua.extshpercreloanstock.service.ExtShPerCreLoanStockService;
import com.jy.modules.externalplatform.interfacerepository.suanhua.extshperdebtsstock.dto.ExtShPerDebtsStockDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhua.extshperdebtsstock.service.ExtShPerDebtsStockService;
import com.jy.modules.externalplatform.interfacerepository.suanhua.extshperloanbalstock.dto.ExtShPerLoanBalStockDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhua.extshperloanbalstock.service.ExtShPerLoanBalStockService;
import com.jy.modules.externalplatform.interfacerepository.suanhua.extshperoverduesstock.dto.ExtShPerOverduesStockDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhua.extshperoverduesstock.service.ExtShPerOverduesStockService;
import com.jy.modules.externalplatform.interfacerepository.suanhua.extshperreportstock.dao.ExtShPerReportStockDao;
import com.jy.modules.externalplatform.interfacerepository.suanhua.extshperreportstock.dto.ExtShPerReportStockDTO;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.BaseDTO;
import com.jy.platform.core.common.JYLoggerUtil;

/**
 * @classname: ExtShPerReportStockService
 * @description: 定义  人行征信报告主表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhua.extshperreportstock.service.ExtShPerReportStockService")
public class ExtShPerReportStockService implements ExtSaveMessageDao {
	private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	
	@Autowired
	ExtInterfaceLogService extInterfaceLogService;
    
	@Autowired
	private ExtShPerReportStockDao dao;

	@Autowired
	private ExtShPerOverduesStockService personOverduesService;

	@Autowired
	private ExtShPerDebtsStockService personDebtsService;
	
	
	@Autowired
	private ExtShPerLoanBalStockService personLoanBalancesService;
	
	
	@Autowired
	private ExtShPerCreLoanStockService personCreditLoanService;
	/**
     * @author Administrator
     * @description: 分页查询 人行征信报告主表列表
     * @date 2017-06-12 14:55:15
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtShPerReportStockDTO> searchExtShPerReportStockByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtShPerReportStockDTO> dataList =  dao.searchExtShPerReportStockByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询人行征信报告主表列表
     * @date 2017-06-12 14:55:15
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtShPerReportStockDTO> searchExtShPerReportStock(Map<String,Object> searchParams) throws Exception {
	    List<ExtShPerReportStockDTO> dataList = dao.searchExtShPerReportStock(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询人行征信报告主表对象
     * @date 2017-06-12 14:55:15
     * @param id
     * @return
     * @throws
     */ 
	public ExtShPerReportStockDTO queryExtShPerReportStockByPrimaryKey(String id) throws Exception {
		
		ExtShPerReportStockDTO dto = dao.findExtShPerReportStockByPrimaryKey(id);
		
		if(dto == null) dto = new ExtShPerReportStockDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtShPerReportStock
     * @author Administrator
     * @description: 新增 人行征信报告主表对象
     * @date 2017-06-12 14:55:15
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtShPerReportStock(ExtShPerReportStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtShPerReportStock(paramMap);
		
		ExtShPerReportStockDTO resultDto = (ExtShPerReportStockDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtShPerReportStock
     * @author Administrator
     * @description: 修改 人行征信报告主表对象
     * @date 2017-06-12 14:55:15
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtShPerReportStock(ExtShPerReportStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtShPerReportStock(paramMap);
	}
	/**
     * @title: deleteExtShPerReportStockByPrimaryKey
     * @author Administrator
     * @description: 删除 人行征信报告主表,按主键
     * @date 2017-06-12 14:55:15
     * @param paramMap
     * @throws
     */ 
	public void deleteExtShPerReportStockByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtShPerReportStockByPrimaryKey(paramMap);
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
		ExtShPerReportStockDTO dto = new ExtShPerReportStockDTO();
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
					 dao.insertExtShPerReportStock(params);
					 return;
				 }
				Boolean success = (Boolean)jsonObj.get("success");
				if(success){
					dto.setRetcode(InterfaceEnum.RET_CODE_1.getKey());
				    dto.setRemark("调用算话征信人行征信报告查询接口查有");	
				    interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
					interfaceLogDto.setRetMsg("调用算话征信人行征信报告查询接口查有");	
					JSONObject datas = jsonObj.getJSONObject("data");
					String str = datas.getString("report_risk");
			    	JSONObject reportRisk = JSONObject.fromObject(str.substring(1, str.length()-1));
			    	dto = makeUpPersonalReport(reportRisk,jsonObj.toString());
					//拼装并保存人行征信报告信息
			    	Long fkPersonalReportId =this.insertExtShPerReportStock(dto);  
				    //拼装并保存人行征信逾期记录
				    JSONObject overdues = reportRisk.getJSONObject("overdues");
				    if(!overdues.isEmpty()){
				    	ExtShPerOverduesStockDTO personOverduesDTO = makeUpPersonOverdues(overdues, fkPersonalReportId);
				    	personOverduesService.insertExtShPerOverduesStock(personOverduesDTO);
				    	dto.setOverduesMsg(InterfaceEnum.RET_MSG.getKey());
				    	this.updateExtShPerReportStock(dto);
				    }
				    //拼装并保存人行征信负债记录
				    JSONObject debts = reportRisk.getJSONObject("debts");
				    if(!debts.isEmpty()){
				    	ExtShPerDebtsStockDTO personDebtsDTO = makeUpPersonDebts(debts,fkPersonalReportId);
				    	personDebtsService.insertExtShPerDebtsStock(personDebtsDTO);
				    	dto.setDebtsMsg(InterfaceEnum.RET_MSG.getKey());
				    	this.updateExtShPerReportStock(dto);
				    	//拼装并保存人行征信贷款余额详列
				    	JSONArray loanBalanceInfos = debts.getJSONArray("loanBalanceInfos");
				    	if(!loanBalanceInfos.isEmpty()){
				    		List<ExtShPerLoanBalStockDTO> dataList = makeUpPersonLoanBalances(loanBalanceInfos);
				    		personLoanBalancesService.insertExtShPersonLoanBalancesList(dataList, personDebtsDTO.getId());
				    		dto.setLoanBalancesMsg(InterfaceEnum.RET_MSG.getKey());
					    	this.updateExtShPerReportStock(dto);
				    	}
				    }
				    //拼装并保存人行征信信贷信息
				    JSONObject creditLoanHis = reportRisk.getJSONObject("creditLoanHis");//信贷历史
					JSONObject creditLoanNeeds = reportRisk.getJSONObject("creditLoanNeeds");//信贷需求
					JSONObject others = reportRisk.getJSONObject("others");//其他
					if(!creditLoanHis.isEmpty()||!creditLoanNeeds.isEmpty()||!others.isEmpty()){
						personCreditLoanService.insertExtShPerCreLoanStock(makeUpPersonCreditLoan(creditLoanHis,creditLoanNeeds,others,fkPersonalReportId));
						dto.setCreditLoanMsg(InterfaceEnum.RET_MSG.getKey());
				    	this.updateExtShPerReportStock(dto);
					}					
				}else{
	            	dto.setRetcode(InterfaceEnum.RET_CODE_5.getKey());
				    dto.setErrormsg("调用算话征信人行征信报告查询接口返回错误信息");
				    dto.setRemark("调用算话征信人行征信报告查询接口返回错误信息");	
				    interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_5.getKey());
					interfaceLogDto.setRetMsg("调用算话征信人行征信报告查询接口返回错误信息");				
					params.put("dto", dto);
					dao.insertExtShPerReportStock(params);
	            }
			}else{				
			     dto.setRetcode(InterfaceEnum.RET_CODE_3.getKey());
			     dto.setErrormsg("调用算话征信人行征信报告查询接口报错");
			     dto.setRemark("调用算话征信人行征信报告查询接口报错");	
				 interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
			     interfaceLogDto.setRetMsg("调用算话征信人行征信报告查询接口报错");				
				 params.put("dto", dto);
				 dao.insertExtShPerReportStock(params);
			 }
		} catch (Exception ex) {
			  JYLoggerUtil.error(this.getClass(), "===调用算话征信人行征信报告查询解析回参异常===进件日志ID:"+String.valueOf(map.get("interfaceId")),ex);
			  String msg = ex.getMessage();
			  if(StringUtil.isNotEmpty(msg)){
				  if(msg.contains("A JSONObject text must begin with '{' at character 1 of")){
					  dto.setRetcode(InterfaceEnum.RET_CODE_3.getKey());
					  dto.setErrormsg("调用算话征信人行征信报告查询接口异常请求返回，请联系IT解决");
					  dto.setRemark("调用算话征信人行征信报告查询接口调用报错");	
					  interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
					  interfaceLogDto.setRetMsg("调用算话征信人行征信报告查询接口异常请求返回，请联系IT解决");
				 }else{
					  dto.setRetcode(InterfaceEnum.RET_CODE_4.getKey());
					  if(msg.length() > 2000){
						  dto.setErrormsg("调用算话征信人行征信报告查询接口返回信息解析出错:"+msg.substring(0,2000));
						  interfaceLogDto.setRetMsg("调用算话征信人行征信报告查询接口返回信息解析出错:"+msg.substring(0,2000));
					  }else{
						  dto.setErrormsg("调用算话征信人行征信报告查询接口返回信息解析出错:"+msg);
						  interfaceLogDto.setRetMsg("调用算话征信人行征信报告查询接口返回信息解析出错:"+msg);
					  }
					  dto.setRemark("调用算话征信人行征信报告查询接口返回信息解析出错");	
					  interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4.getKey());
				 }
			  }
			  params.put("dto",dto);
			  dao.insertExtShPerReportStock(params);
		}finally{
			try {
				interfaceLogDto.setRetBody(results);
				Long keyId =extInterfaceLogService.insertExtInterfaceLog(interfaceLogDto);
				dto.setInterfaceId(String.valueOf(keyId));
				this.updateExtShPerReportStock(dto);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	
	/**
	 * 拼装人行征信报告信息
	 * @param report
	 * @param pushMsg
	 * @return
	 */
	public ExtShPerReportStockDTO makeUpPersonalReport(JSONObject reportRisk,String data) {
		JSONObject personalReport = new JSONObject();
		JSONObject reportInfo = reportRisk.getJSONObject("reportinfo");
		JSONObject personalinfo = reportRisk.getJSONObject("personalinfo");
		personalReport.putAll(reportInfo);
		personalReport.putAll(personalinfo);
		ExtShPerReportStockDTO personalReportDTO = (ExtShPerReportStockDTO) JSONObject.toBean(personalReport, ExtShPerReportStockDTO.class);
		personalReportDTO.setPushMessage(data);
		return personalReportDTO;
	}
	
	/**
	 * 拼装人行征信逾期记录
	 * @param reportRisk
	 * @param fkPersonalReportId
	 * @return
	 */
	public ExtShPerOverduesStockDTO makeUpPersonOverdues(JSONObject overdues,Long fkPersonalReportId){
		ExtShPerOverduesStockDTO	personOverduesDTO = (ExtShPerOverduesStockDTO)JSONObject.toBean(overdues, ExtShPerOverduesStockDTO.class);
		personOverduesDTO.setFkPersonalReportId(fkPersonalReportId);
		return personOverduesDTO;
	}
	

	/**
	 * 拼装人行征信负债记录
	 * @param reportRisk
	 * @param fkPersonalReportId
	 * @return
	 */
	public ExtShPerDebtsStockDTO  makeUpPersonDebts(JSONObject debts,Long fkPersonalReportId){
		ExtShPerDebtsStockDTO	personDebtsDTO = (ExtShPerDebtsStockDTO)JSONObject.toBean(debts,ExtShPerDebtsStockDTO.class);
		personDebtsDTO.setFkPersonalReportId(fkPersonalReportId);
		return personDebtsDTO;
	}
	
   
	/**
	 * 拼装人行征信贷款余额详列
	 * @param debts
	 * @return
	 */
	public List<ExtShPerLoanBalStockDTO>  makeUpPersonLoanBalances(JSONArray loanBalanceInfos){
		List<ExtShPerLoanBalStockDTO> dataList = JSONArray.toList(loanBalanceInfos,ExtShPerLoanBalStockDTO.class);
		return dataList;	
	}
	
	/**
	 * 拼装人行征信信贷信息
	 * @param reportRisk
	 * @param fkPersonalReportId
	 * @return
	 */
	public ExtShPerCreLoanStockDTO  makeUpPersonCreditLoan(JSONObject creditLoanHis,JSONObject creditLoanNeeds,JSONObject others,Long fkPersonalReportId){
		JSONObject personCreditLoan = new JSONObject();
		personCreditLoan.putAll(creditLoanHis);
		personCreditLoan.putAll(creditLoanNeeds);
		personCreditLoan.putAll(others);
		ExtShPerCreLoanStockDTO personCreditLoanDTO = (ExtShPerCreLoanStockDTO)JSONObject.toBean(personCreditLoan,ExtShPerCreLoanStockDTO.class);
		personCreditLoanDTO.setFkPersonalReportId(fkPersonalReportId);
		return personCreditLoanDTO;
	}
}

