package com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreport.service;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import jodd.util.StringUtil;

import org.apache.commons.lang3.StringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.common.util.DateUtil;
import com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreport.dao.ExtPersonalReportDao;
import com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreport.dto.ExtPersonalReportDTO;
import com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportaddr.dto.ExtPersonalReportAddrDTO;
import com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportaddr.service.ExtPersonalReportAddrService;
import com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportcred.dto.ExtPersonalReportCredDTO;
import com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportcred.service.ExtPersonalReportCredService;
import com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportoter.dto.ExtPersonalReportOterDTO;
import com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportoter.service.ExtPersonalReportOterService;
import com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportsech.dto.ExtPersonalReportSechDTO;
import com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportsech.service.ExtPersonalReportSechService;
import com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportspec.dto.ExtPersonalReportSpecDTO;
import com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportspec.service.ExtPersonalReportSpecService;
import com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportwork.dto.ExtPersonalReportWorkDTO;
import com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportwork.service.ExtPersonalReportWorkService;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.JYLoggerUtil;

/**
 * @className: ExtPersonalReportService
 * @package: com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreport.service
 * @describe: 上海资信数据落地
 * @auther: huangxianchao
 * @date: 2018/1/15 0015
 * @time: 下午 2:04
 **/
@Service("com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreport.service.ExtPersonalReportService")
public class ExtPersonalReportService implements ExtSaveMessageDao {

	@Autowired
	ExtInterfaceLogService extInterfaceLogService;
    
	@Autowired
	private ExtPersonalReportDao dao;
	
	@Autowired
	private ExtPersonalReportAddrService nfcsAddrService;

	@Autowired
    private ExtPersonalReportWorkService nfcsWorkService;
	
	@Autowired
    private ExtPersonalReportSpecService nfcsSpecService;
	
	@Autowired
    private ExtPersonalReportSechService nfcsSechService;
	
	@Autowired
    private ExtPersonalReportOterService nfcsOterService;
	
	@Autowired
    private ExtPersonalReportCredService nfcsCredService;


	/**
	 * @methodName: insertExtPersonalReport
	 * @param: [dto]
	 * @describe: 新增 网络金融版个人信用报告对象
	 * @auther: huangxianchao
	 * @date: 2018/1/15 0015
	 * @time: 下午 2:06
	 **/
	@SuppressWarnings("all")
	public Long insertExtPersonalReport(ExtPersonalReportDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtPersonalReport(paramMap);
		
		ExtPersonalReportDTO resultDto = (ExtPersonalReportDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	
    /**
     * @methodName: updateExtPersonalReport
     * @param: dto
     * @describe: 修改 网络金融版个人信用报告对象
     * @auther: huangxianchao
     * @date: 2018/1/15 0015
     * @time: 下午 2:08
     **/
	public void updateExtPersonalReport(ExtPersonalReportDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtPersonalReport(paramMap);
	}


    /**
     * @methodName: saveMessage
     * @param: map
     * @describe: 上海资信数据落地
     * @auther: huangxianchao
     * @date: 2018/1/15 0015
     * @time: 下午 2:11
     **/
    public void saveMessage(Map<String,Object> map){
		 String isSuccess = "0";//是否调用成功  1：成功 0：失败
	     String retCode = "";//接口返回码
	     String retMsg = "";//接口返回信息
	     String fkBizId = "";
		//日志信息
		ExtInterfaceLogDTO interfaceLogDto=(ExtInterfaceLogDTO) map.get("interfaceLogDto");
		String results=String.valueOf(map.get("result"));
		Map<String, Object> params=new HashMap<String,Object>();
        ExtPersonalReportDTO nfcs = new ExtPersonalReportDTO();
        nfcs.setProdCode(String.valueOf(map.get("prod")));
        nfcs.setOrgCode(String.valueOf(map.get("org")));
        nfcs.setSysCode(String.valueOf(map.get("sysCode")));
        nfcs.setCertificatesNumber(String.valueOf(map.get("certno")));
        nfcs.setCertificatesType(String.valueOf(map.get("certno")));
        nfcs.setName(String.valueOf(map.get("name")));
		try{
			if(StringUtils.isNotEmpty((CharSequence) map.get("result")) && !"null".equals(map.get("result"))){
				Document doc = null;
                //判断返回报文是否符合xml格式
                if (results.endsWith(">")){
                    doc = DocumentHelper.parseText(results);// 将字符串转为XML
                }else{
                    doc = DocumentHelper.parseText(results.substring(0,results.lastIndexOf(">")+1)); // 将字符串转为XML

                }
		        Element rootElt = doc.getRootElement(); // 获取根节点
		        
		        //信用报告头
		        Iterator<?> iter = rootElt.elementIterator("信用报告头"); // 获取根节点下的子节点
		        
		        // 遍历节点
		        if (iter.hasNext()) {
		        	//有信用报告头标签 表示调用成功
		        	isSuccess = "1";
		            Element itemEle = (Element) iter.next();
		            String queryCauses = itemEle.elementTextTrim("查询原因"); 
		            String reportNumber = itemEle.elementTextTrim("报告编号");
		            String reportTime = itemEle.elementTextTrim("报告时间");
		            
		            nfcs.setQueryCauses(queryCauses);
		            nfcs.setReportNumber(reportNumber);
		            nfcs.setReportTime(reportTime);
		            nfcs.setRetcode(InterfaceEnum.RET_CODE_1.getKey());
		            nfcs.setRemark("调用上海资信ESB服务查有");
		            interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
					interfaceLogDto.setRetMsg("调用上海资信ESB服务查有");
		        }else{
		        	Iterator<?> iterError = rootElt.elementIterator("message");
		            if(iterError.hasNext()){
		                Element itemEle = (Element) iterError.next();
		                nfcs.setError(itemEle.getText());
		                nfcs.setRetcode(InterfaceEnum.RET_CODE_2.getKey());
			            nfcs.setErrormsg("调用上海资信ESB服务个人身份信息查无");
			            nfcs.setRemark("调用上海资信ESB服务个人身份信息查无");
			            interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_2.getKey());
						interfaceLogDto.setRetMsg("调用上海资信ESB服务个人身份信息查无");
		            }else{
		                nfcs.setError("上海资信ESB服务异常，信用报告头空message空，请联系管理员！");
			            nfcs.setRetcode(InterfaceEnum.RET_CODE_5.getKey());
			            nfcs.setErrormsg("调用上海资信ESB服务返回错误信息");
			            nfcs.setRemark("调用上海资信ESB服务返回错误信息");
			            interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_5.getKey());
						interfaceLogDto.setRetMsg("上海资信ESB服务异常，信用报告头空message空，请联系管理员！");
		            }
		            nfcs.setReportTime(DateUtil.getDateToStringInfo(new Date()));
		            insertExtPersonalReport(nfcs);
		            return;
		        }
		        
		        //个人身份信息
		        Iterator<?> iter1 = rootElt.elementIterator("个人身份信息"); // 获取根节点下的子节点
		        if(iter1.hasNext() == false){
		        	nfcs.setRetcode(InterfaceEnum.RET_CODE_2.getKey());
		            nfcs.setErrormsg("调用上海资信ESB服务个人身份信息查无");
		            nfcs.setRemark("调用上海资信ESB服务个人身份信息查无");
		            interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_2.getKey());
					interfaceLogDto.setRetMsg("调用上海资信ESB服务个人身份信息查无");
		            nfcs.setReportTime(DateUtil.getDateToStringInfo(new Date()));
		            insertExtPersonalReport(nfcs);
		            return;
		        }
		        List<ExtPersonalReportAddrDTO> personalCreditReportAddrList = new ArrayList<ExtPersonalReportAddrDTO>();
		        List<ExtPersonalReportWorkDTO> personalCreditReportWorkList = new ArrayList<ExtPersonalReportWorkDTO>();
		        List<ExtPersonalReportCredDTO> personalCreditReportCredList = new ArrayList<ExtPersonalReportCredDTO>();
		        List<ExtPersonalReportOterDTO> personalCreditReportOterList = new ArrayList<ExtPersonalReportOterDTO>();
		        List<ExtPersonalReportSpecDTO> personalCreditReportSpecList = new ArrayList<ExtPersonalReportSpecDTO>();
		        List<ExtPersonalReportSechDTO> personalCreditReportSechList = new ArrayList<ExtPersonalReportSechDTO>();
		        // 遍历节点
		        while (iter1.hasNext()) {
		
		            Element itemEle = (Element) iter1.next();
		            String name = itemEle.elementTextTrim("姓名"); 
		            String certificatesType = itemEle.elementTextTrim("证件类型");
		            String certificatesNumber = itemEle.elementTextTrim("证件号码");
		            String sex = itemEle.elementTextTrim("性别");
		            String birthDate = itemEle.elementTextTrim("出生日期");
		            String wifeName = itemEle.elementTextTrim("配偶姓名");
		            String wifeCertificatesType = itemEle.elementTextTrim("配偶证件类型");
		            String wifeCertificatesNumber = itemEle.elementTextTrim("配偶证件号码");
		            String wifeSex = itemEle.elementTextTrim("配偶性别");
		            String wifeBirthDate = itemEle.elementTextTrim("配偶出生日期");
		            
		            nfcs.setName(name);
		            nfcs.setCertificatesType(certificatesType);
		            nfcs.setCertificatesNumber(certificatesNumber);
		            nfcs.setSex(sex);
		            nfcs.setBirthDate(birthDate);
		            nfcs.setWifeName(wifeName);
		            nfcs.setWifeCertificatesType(wifeCertificatesType);
		            nfcs.setWifeCertificatesNumber(wifeCertificatesNumber);
		            nfcs.setWifeSex(wifeSex);
		            nfcs.setWifeBirthDate(wifeBirthDate);
		            
		            Iterator<?> iter2 = itemEle.elementIterator("婚姻状况");
		            while (iter2.hasNext()) {
		                Element itemEles = (Element) iter2.next();
		                String marriage = itemEles.elementTextTrim("婚姻明细"); 
		                String marriageObtainDate = itemEles.elementTextTrim("信息获取日期"); 
		                
		                nfcs.setMarriage(marriage);
		                nfcs.setMarriageObtainDate(marriageObtainDate);
		            }
		            
		            Iterator<?> iter4 = itemEle.elementIterator("最高学历");
		            while (iter4.hasNext()) {
		                Element itemEles = (Element) iter4.next();
		                String education = itemEles.elementTextTrim("学历明细"); 
		                String educationObtainDate = itemEles.elementTextTrim("信息获取日期"); 
		                
		                nfcs.setEducation(education);
		                nfcs.setEducationObtainDate(educationObtainDate);
		            }
		            
		            Iterator<?> iter5 = itemEle.elementIterator("职称");
		            while (iter5.hasNext()) {
		                Element itemEles = (Element) iter5.next();
		                String title = itemEles.elementTextTrim("职称明细"); 
		                String titleObtainDate = itemEles.elementTextTrim("信息获取日期"); 
		                
		                nfcs.setTitle(title);
		                nfcs.setTitleObtainDate(titleObtainDate);
		            }
		            
		            Iterator<?> iter6 = itemEle.elementIterator("住宅电话");
		            while (iter6.hasNext()) {
		                Element itemEles = (Element) iter6.next();
		                String telephone = itemEles.elementTextTrim("住宅电话明细"); 
		                String telephoneObtainDate = itemEles.elementTextTrim("信息获取日期"); 
		                
		                nfcs.setTelephone(telephone);
		                nfcs.setTelephoneObtainDate(telephoneObtainDate);
		            }
		            
		            Iterator<?> iter7 = itemEle.elementIterator("手机号码");
		            while (iter7.hasNext()) {
		                Element itemEles = (Element) iter7.next();
		                String phoneNumber = itemEles.elementTextTrim("手机号码明细"); 
		                String phoneNumberObtainDate = itemEles.elementTextTrim("信息获取日期"); 
		                
		                nfcs.setPhoneNumber(phoneNumber);
		                nfcs.setPhoneNumberObtainDate(phoneNumberObtainDate);
		            }
		            
		            Iterator<?> iter8 = itemEle.elementIterator("电子邮箱");
		            while (iter8.hasNext()) {
		                Element itemEles = (Element) iter8.next();
		                String email = itemEles.elementTextTrim("电子邮箱明细"); 
		                String emailObtainDate = itemEles.elementTextTrim("信息获取日期"); 
		                
		                nfcs.setEmail(email);
		                nfcs.setEmailObtainDate(emailObtainDate);
		            }
		            
		            Iterator<?> iter9 = itemEle.elementIterator("地址");
		            while (iter9.hasNext()) {
		                Element itemEles = (Element) iter9.next();
		                String addressNumber = itemEles.elementTextTrim("地址序号"); 
		                String addressInfo = itemEles.elementTextTrim("地址明细"); 
		                String infoDate = itemEles.elementTextTrim("信息获取日期"); 
		                
		                ExtPersonalReportAddrDTO personalCreditReportAddr = new ExtPersonalReportAddrDTO();
		                personalCreditReportAddr.setAddressNumber(addressNumber);
		                personalCreditReportAddr.setAddressInfo(addressInfo);
		                personalCreditReportAddr.setInfoDate(infoDate);
		                personalCreditReportAddrList.add(personalCreditReportAddr);
		            }
		
		            
		            Iterator<?> iter10 = itemEle.elementIterator("工作单位");
		            while (iter10.hasNext()) {
		                Element itemEles = (Element) iter10.next();
		                String workNumber = itemEles.elementTextTrim("工作序号"); 
		                String workInfo = itemEles.elementTextTrim("工作明细"); 
		                String career = itemEles.elementTextTrim("职业"); 
		                String infoDate = itemEles.elementTextTrim("信息获取日期"); 
		                
		                ExtPersonalReportWorkDTO personalCreditReportWork = new ExtPersonalReportWorkDTO();
		                personalCreditReportWork.setWorkNumber(workNumber);
		                personalCreditReportWork.setWorkInfo(workInfo);
		                personalCreditReportWork.setCareer(career);
		                personalCreditReportWork.setInfoDate(infoDate);
		                personalCreditReportWorkList.add(personalCreditReportWork);
		            }
		
		            
		            Iterator<?> iter11 = itemEle.elementIterator("配偶工作单位");
		            while (iter11.hasNext()) {
		                Element itemEles = (Element) iter11.next();
		                String wifeWorkInfo = itemEles.elementTextTrim("配偶工作单位明细"); 
		                String wifeWorkInfoDate = itemEles.elementTextTrim("信息获取日期"); 
		                
		                nfcs.setWifeWorkInfo(wifeWorkInfo);
		                nfcs.setWifeWorkInfoDate(wifeWorkInfoDate);
		            }
		            
		            Iterator<?> iter12 = itemEle.elementIterator("配偶联系电话");
		            while (iter12.hasNext()) {
		                Element itemEles = (Element) iter12.next();
		                String wifeTel = itemEles.elementTextTrim("配偶联系电话明细"); 
		                String wifeTelDate = itemEles.elementTextTrim("信息获取日期"); 
		                
		                nfcs.setWifeTel(wifeTel);
		                nfcs.setWifeTelDate(wifeTelDate);
		            }
		            
		            Iterator<?> iter13 = itemEle.elementIterator("第一联系人信息");
		            if (iter13.hasNext()) {
		                Element itemEles = (Element) iter13.next();
		                String contactsNameFirest = itemEles.elementTextTrim("联系人姓名"); 
		                String contactsRelationFirest = itemEles.elementTextTrim("联系人关系"); 
		                String contactsPhoneNumberFirest = itemEles.elementTextTrim("联系电话"); 
		                String contactsObtainDateFirest = itemEles.elementTextTrim("信息获取日期"); 
		                
		                nfcs.setContactsNameFirest(contactsNameFirest);
		                nfcs.setContactsRelationFirest(contactsRelationFirest);
		                nfcs.setContactsPhoneNumberFirest(contactsPhoneNumberFirest);
		                nfcs.setContactsObtainDateFirest(contactsObtainDateFirest);
		            }
		            
		            Iterator<?> iter14 = itemEle.elementIterator("第二联系人信息");
		            if (iter14.hasNext()) {
		                Element itemEles = (Element) iter14.next();
		                String contactsNameSecond = itemEles.elementTextTrim("联系人姓名"); 
		                String contactsRelationSecond = itemEles.elementTextTrim("联系人关系"); 
		                String contactsPhoneNumberSecond = itemEles.elementTextTrim("联系电话"); 
		                String contactsObtainDateSecond = itemEles.elementTextTrim("信息获取日期"); 
		                
		                nfcs.setContactsNameSecond(contactsNameSecond);
		                nfcs.setContactsRelationSecond(contactsRelationSecond);
		                nfcs.setContactsPhoneNumberSecond(contactsPhoneNumberSecond);
		                nfcs.setContactsObtainDateSecond(contactsObtainDateSecond);
		            }
		        }
		        
		        
		        //贷款交易信息
		        Iterator<?> iter15 = rootElt.elementIterator("贷款交易信息"); // 获取根节点下的子节点
		        // 遍历节点
		        while (iter15.hasNext()) {
		
		            Element itemEle = (Element) iter15.next();
		            Iterator<?> iter4 = itemEle.elementIterator("信息概要");
		            while (iter4.hasNext()) {
		                Element itemEles = (Element) iter4.next();
		                String loanCount = itemEles.elementTextTrim("贷款笔数"); 
		                String loanFirstDate = itemEles.elementTextTrim("首贷日"); 
		                String creditMax = itemEles.elementTextTrim("最大授信额度"); 
		                String loanTotal = itemEles.elementTextTrim("贷款总额"); 
		                String loanOver = itemEles.elementTextTrim("贷款余额"); 
		                String repaymentMonth = itemEles.elementTextTrim("协定月还款"); 
		                String overdueTotal = itemEles.elementTextTrim("当前逾期总额"); 
		                String overdueMax = itemEles.elementTextTrim("最高逾期金额"); 
		                String overdueIssue = itemEles.elementTextTrim("最高逾期期数"); 
		                
		                nfcs.setLoanCount(loanCount);
		                nfcs.setLoanFirstDate(loanFirstDate);
		                nfcs.setCreditMax(creditMax);
		                nfcs.setLoanTotal(loanTotal);
		                nfcs.setLoanOver(loanOver);
		                nfcs.setRepaymentMonth(repaymentMonth);
		                nfcs.setOverdueTotal(overdueTotal);
		                nfcs.setOverdueMax(overdueMax);
		                nfcs.setOverdueIssue(overdueIssue);
		            }
		            
		            Iterator<?> iter5 = itemEle.elementIterator("贷款");
		
		            while (iter5.hasNext()) {
		                Element itemEles = (Element) iter5.next();
		                String loanProject = itemEles.elementTextTrim("贷款项目"); 
		                String orgName = itemEles.elementTextTrim("机构名称"); 
		                String creditQuota = itemEles.elementTextTrim("授信额度"); 
		                String guaranteeWay = itemEles.elementTextTrim("担保方式"); 
		                String accountOpeningDate = itemEles.elementTextTrim("开户日期"); 
		                String currency = itemEles.elementTextTrim("币种"); 
		                String place = itemEles.elementTextTrim("发生地"); 
		                String sharedCreditQuota = itemEles.elementTextTrim("共享授信额度"); 
		                String maxLiabilitiesQuota = itemEles.elementTextTrim("最大负债额"); 
		                String paymentFrequency = itemEles.elementTextTrim("还款频率"); 
		                String endLoanBalance = itemEles.elementTextTrim("期末贷款余额"); 
		                String remainingRepaymentMonths = itemEles.elementTextTrim("剩余还款月数"); 
		                String monthRepaymentDate = itemEles.elementTextTrim("本月应还款日期"); 
		                String monthRepaymentAmount = itemEles.elementTextTrim("本月应还款金额"); 
		                String accountStatus = itemEles.elementTextTrim("帐户状态"); 
		                String actualRepaymentDate = itemEles.elementTextTrim("实际还款日期"); 
		                String actualRepaymentAmount = itemEles.elementTextTrim("实际还款金额"); 
		                String currentOverdueTotal = itemEles.elementTextTrim("当前逾期总额");
		                String currentOverdueNumber = itemEles.elementTextTrim("当前逾期期数"); 
		                String accumulatedOverdueNumber = itemEles.elementTextTrim("累计逾期期数"); 
		                String maxOverdueNumber = itemEles.elementTextTrim("最高逾期期数"); 
		                String monthlyRepaymentConditions = itemEles.elementTextTrim("二十四月内各月还款状况"); 
		                String overduePrincipal2months = itemEles.elementTextTrim("逾期31-60天未归还贷款本金"); 
		                String overduePrincipal3months = itemEles.elementTextTrim("逾期61-90天未归还贷款本金"); 
		                String overduePrincipal6months = itemEles.elementTextTrim("逾期91-180天未归还贷款本金"); 
		                String overduePrincipal180days = itemEles.elementTextTrim("逾期180天以上未归还贷款本金"); 
		                String loanObtainDate = itemEles.elementTextTrim("信息获取日期"); 
		                
		                
		                ExtPersonalReportCredDTO personalCreditReportCred = new ExtPersonalReportCredDTO();
		                personalCreditReportCred.setLoanProject(loanProject);
		                personalCreditReportCred.setOrgName(orgName);
		                personalCreditReportCred.setCreditQuota(creditQuota);
		                personalCreditReportCred.setGuaranteeWay(guaranteeWay);
		                personalCreditReportCred.setAccountOpeningDate(accountOpeningDate);
		                personalCreditReportCred.setCurrency(currency);
		                personalCreditReportCred.setPlace(place);
		                personalCreditReportCred.setSharedCreditQuota(sharedCreditQuota);
		                personalCreditReportCred.setMaxLiabilitiesQuota(maxLiabilitiesQuota);
		                personalCreditReportCred.setPaymentFrequency(paymentFrequency);
		                personalCreditReportCred.setEndLoanBalance(endLoanBalance);
		                personalCreditReportCred.setRemainingRepaymentMonths(remainingRepaymentMonths);
		                personalCreditReportCred.setMonthRepaymentDate(monthRepaymentDate);
		                personalCreditReportCred.setMonthlyRepaymentConditions(monthlyRepaymentConditions);
		                personalCreditReportCred.setMonthRepaymentAmount(monthRepaymentAmount);
		                personalCreditReportCred.setAccountStatus(accountStatus);
		                personalCreditReportCred.setActualRepaymentDate(actualRepaymentDate);
		                personalCreditReportCred.setActualRepaymentAmount(actualRepaymentAmount);
		                personalCreditReportCred.setCurrentOverdueTotal(currentOverdueTotal);
		                personalCreditReportCred.setCurrentOverdueNumber(currentOverdueNumber);
		                personalCreditReportCred.setAccumulatedOverdueNumber(accumulatedOverdueNumber);
		                personalCreditReportCred.setMaxOverdueNumber(maxOverdueNumber);
		                personalCreditReportCred.setOverduePrincipalMonths2(overduePrincipal2months);
		                personalCreditReportCred.setOverduePrincipalMonths3(overduePrincipal3months);
		                personalCreditReportCred.setOverduePrincipalMonths6(overduePrincipal6months);
		                personalCreditReportCred.setOverduePrincipalDays180(overduePrincipal180days);
		                personalCreditReportCred.setLoanObtainDate(loanObtainDate);
		                personalCreditReportCredList.add(personalCreditReportCred);
		            }
		        }
		        
		        
		        //为他人担保信息
		        Iterator<?> iter16 = rootElt.elementIterator("为他人担保信息"); // 获取根节点下的子节点
		        // 遍历节点
		        while (iter16.hasNext()) {
		
		            Element itemEle = (Element) iter16.next();
		            Iterator<?> iter4 = itemEle.elementIterator("担保信息记录");
		            while (iter4.hasNext()) {
		                Element itemEles = (Element) iter4.next();
		                String guaranteeProject = itemEles.elementTextTrim("担保项目"); 
		                String guaranteeDate = itemEles.elementTextTrim("担保日期"); 
		                String guaranteeAmount = itemEles.elementTextTrim("担保金额"); 
		                String guaranteeRelations = itemEles.elementTextTrim("担保关系"); 
		                String infoDate = itemEles.elementTextTrim("信息获取日期"); 
		                
		                
		                ExtPersonalReportOterDTO personalCreditReportOter = new ExtPersonalReportOterDTO();
		                personalCreditReportOter.setGuaranteeProject(guaranteeProject);
		                personalCreditReportOter.setGuaranteeDate(guaranteeDate);
		                personalCreditReportOter.setGuaranteeAmount(guaranteeAmount);
		                personalCreditReportOter.setGuaranteeRelations(guaranteeRelations);
		                personalCreditReportOter.setInfoDate(infoDate);
		                personalCreditReportOterList.add(personalCreditReportOter);
		            }
		
		        }
		        
		        //特殊交易信息
		        Iterator<?> iter17 = rootElt.elementIterator("特殊交易信息"); // 获取根节点下的子节点
		        // 遍历节点
		        while (iter17.hasNext()) {
		
		            Element itemEle = (Element) iter17.next();
		            Iterator<?> iter4 = itemEle.elementIterator("详细记录");
		            while (iter4.hasNext()) {
		                Element itemEles = (Element) iter4.next();
		                String recordSource = itemEles.elementTextTrim("记录来源"); 
		                String recordType = itemEles.elementTextTrim("记录类型"); 
		                String happenDate = itemEles.elementTextTrim("发生日期"); 
		                String changeDate = itemEles.elementTextTrim("变更月数"); 
		                String happenAmount = itemEles.elementTextTrim("发生金额"); 
		                String info = itemEles.elementTextTrim("明细信息"); 
		                String infoDate = itemEles.elementTextTrim("信息获取日期"); 
		                
		                
		                ExtPersonalReportSpecDTO personalCreditReportSpec = new ExtPersonalReportSpecDTO();
		                personalCreditReportSpec.setRecordSource(recordSource);
		                personalCreditReportSpec.setRecordType(recordType);
		                personalCreditReportSpec.setHappenDate(happenDate);
		                personalCreditReportSpec.setChangeDate(changeDate);
		                personalCreditReportSpec.setHappenAmount(happenAmount);
		                personalCreditReportSpec.setInfo(info);
		                personalCreditReportSpec.setInfoDate(infoDate);
		                personalCreditReportSpecList.add(personalCreditReportSpec);
		            }
		
		        }     
		        
		        //个人身份信息
		        Iterator<?> iter3 = rootElt.elementIterator("查询信息"); // 获取根节点下的子节点
		        // 遍历节点
		        while (iter3.hasNext()) {
		
		            Element itemEle = (Element) iter3.next();
		            Iterator<?> iter4 = itemEle.elementIterator("查询记录");
		            while (iter4.hasNext()) {
		                Element itemEles = (Element) iter4.next();
		                String searchType = itemEles.elementTextTrim("查询者类型"); 
		                String searchBecause = itemEles.elementTextTrim("查询原因"); 
		                String searchDate = itemEles.elementTextTrim("查询日期"); 
		                
		                ExtPersonalReportSechDTO personalCreditReportSech = new ExtPersonalReportSechDTO();
		                personalCreditReportSech.setSearchType(searchType);
		                personalCreditReportSech.setSearchBecause(searchBecause);
		                personalCreditReportSech.setSearchDate(searchDate);
		                personalCreditReportSechList.add(personalCreditReportSech);
		            }
		
		        }
		        Long nfcsId = insertExtPersonalReport(nfcs);
		        //设置返回主键
		        if(null != nfcsId){
		        	fkBizId = String.valueOf(nfcsId);
		        }
		        if(personalCreditReportAddrList.size() > 0){
		            for(ExtPersonalReportAddrDTO personalCreditReportAddr : personalCreditReportAddrList){
		                personalCreditReportAddr.setPersonalCreditReport(nfcsId);
		                nfcsAddrService.insertExtPersonalReportAddr(personalCreditReportAddr);
		            }
		            nfcs.setAddrMsg(InterfaceEnum.RET_MSG.getKey());
		            nfcs.setId(nfcsId);
		            this.updateExtPersonalReport(nfcs);
		        }
		        if(personalCreditReportWorkList.size() > 0){
		            for(ExtPersonalReportWorkDTO personalCreditReportWork : personalCreditReportWorkList){
		                personalCreditReportWork.setPersonalCreditReport(nfcsId);
		                nfcsWorkService.insertExtPersonalReportWork(personalCreditReportWork);
		            }
		            nfcs.setWorkMsg(InterfaceEnum.RET_MSG.getKey());
		            nfcs.setId(nfcsId);
		            this.updateExtPersonalReport(nfcs);
		        }
		        if(personalCreditReportCredList.size() > 0){
		            for(ExtPersonalReportCredDTO personalCreditReportCred : personalCreditReportCredList){
		                personalCreditReportCred.setPersonalCreditReport(nfcsId);
		                nfcsCredService.insertExtPersonalReportCred(personalCreditReportCred);
		            }
		            nfcs.setCredMsg(InterfaceEnum.RET_MSG.getKey());
		            nfcs.setId(nfcsId);
		            this.updateExtPersonalReport(nfcs);
		        }
		        if(personalCreditReportOterList.size() > 0){
		            for(ExtPersonalReportOterDTO personalCreditReportOter : personalCreditReportOterList){
		                personalCreditReportOter.setPersonalCreditReport(nfcsId);
		                nfcsOterService.insertExtPersonalReportOter(personalCreditReportOter);
		            }
		            nfcs.setOterMsg(InterfaceEnum.RET_MSG.getKey());
		            nfcs.setId(nfcsId);
		            this.updateExtPersonalReport(nfcs);
		        }
		        if(personalCreditReportSpecList.size() > 0){
		            for(ExtPersonalReportSpecDTO personalCreditReportSpec : personalCreditReportSpecList){
		                personalCreditReportSpec.setPersonalCreditReport(nfcsId);
		                nfcsSpecService.insertExtPersonalReportSpec(personalCreditReportSpec);
		            }
		            nfcs.setSpelMsg(InterfaceEnum.RET_MSG.getKey());
		            nfcs.setId(nfcsId);
		            this.updateExtPersonalReport(nfcs);
		        }
		        if(personalCreditReportSechList.size() > 0){
		            for(ExtPersonalReportSechDTO personalCreditReportSech : personalCreditReportSechList){
		                personalCreditReportSech.setPersonalCreditReport(nfcsId);
		                nfcsSechService.insertExtPersonalReportSech(personalCreditReportSech);
		            }
		            nfcs.setSechMsg(InterfaceEnum.RET_MSG.getKey());
		            nfcs.setId(nfcsId);
		            this.updateExtPersonalReport(nfcs);
		        }
			}else{
				nfcs.setRetcode(InterfaceEnum.RET_CODE_3.getKey());
				nfcs.setErrormsg("调用上海资信ESB服务报错");
				nfcs.setRemark("调用上海资信ESB服务报错");	
				interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				interfaceLogDto.setRetMsg("调用上海资信ESB服务报错");
				params.put("dto", nfcs);
				dao.insertExtPersonalReport(params);
				params.clear();
			}
	    } catch (Exception ex) {
	        JYLoggerUtil.error(this.getClass(), "===调用同盾黑名单解析回参异常===进件日志ID:"+String.valueOf(map.get("interfaceId")),ex);
			String msg = ex.getMessage();
			if(StringUtil.isNotEmpty(msg)){
			   if(msg.contains("A JSONObject text must begin with '{' at character 1 of")){
				   nfcs.setRetcode(InterfaceEnum.RET_CODE_3.getKey());
				   nfcs.setErrormsg("上海资信ESB服务异常请求返回，请联系IT解决");
				   nfcs.setRemark("上海资信ESB服务调用报错");
				   interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				   interfaceLogDto.setRetMsg("上海资信ESB服务异常请求返回，请联系IT解决");
			   }else{
				   nfcs.setRetcode(InterfaceEnum.RET_CODE_4.getKey());
				   if(msg.length() > 2000){
					  nfcs.setErrormsg("上海资信ESB服务返回信息解析出错:"+msg.substring(0,2000));
					  interfaceLogDto.setRetMsg("上海资信ESB服务返回信息解析出错:"+msg.substring(0,2000));
				   }else{
					  nfcs.setErrormsg("上海资信ESB服务返回信息解析出错:"+msg);
					  interfaceLogDto.setRetMsg("上海资信ESB服务返回信息解析出错:"+msg);
				   }
				  nfcs.setRemark("上海资信ESB服务返回信息解析出错");
				  interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4.getKey());
			   }
		    }
	        nfcs.setReportTime(DateUtil.getDateToStringInfo(new Date()));
		    params.put("dto",nfcs);
		    dao.insertExtPersonalReport(params);
		    params.clear();
	    }finally{
			try {
				interfaceLogDto.setRetBody(results);
				interfaceLogDto.setExt2(isSuccess);
                interfaceLogDto.setExt3(retCode);
                interfaceLogDto.setExt4(retMsg);
                interfaceLogDto.setExt5(fkBizId);

				Long keyId =extInterfaceLogService.insertExtInterfaceLog(interfaceLogDto);
				nfcs.setInterfaceId(String.valueOf(keyId));
				this.updateExtPersonalReport(nfcs);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}

