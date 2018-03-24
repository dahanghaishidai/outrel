package com.jy.modules.externalplatform.interfacerepository.sh.extwlsharemainreport.service;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.jy.platform.api.sysconfig.SysConfigAPI;
import com.jy.platform.core.common.BaseDTO;
import com.jy.platform.core.common.JYLoggerUtil;
import com.jy.modules.common.ARIConstant;
import com.jy.modules.common.util.JsonTool;
import com.jy.modules.externalplatform.interfacerepository.qhzx.extwlqhzxriskdootip.service.ExtWlQhzxRiskdooTipService;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecdebtinfo.dto.ExtWlShareCDebtinfoDTO;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecdebtinfo.service.ExtWlShareCDebtinfoService;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecindicator.dto.ExtWlShareCIndicatorDTO;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecindicator.service.ExtWlShareCIndicatorService;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecoverdueinfo.dto.ExtWlShareCOverdueinfoDTO;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecoverdueinfo.service.ExtWlShareCOverdueinfoService;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecreditdetail.dto.ExtWlShareCreditDetailDTO;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecreditdetail.service.ExtWlShareCreditDetailService;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecremote.dto.ExtWlShareCRemoteDTO;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecremote.service.ExtWlShareCRemoteService;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlshareguarantees.dto.ExtWlShareGuaranteesDTO;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlshareguarantees.service.ExtWlShareGuaranteesService;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharemainreport.dto.ExtWlShareMainReportDTO;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharemainreport.dao.ExtWlShareMainReportDao;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharemainreport.enumdef.ScreditType;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharemainreport.enumdef.SpecTradeType;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharemainreport.utils.ExtShShareUtil;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlshareoverdues.dto.ExtWlShareOverduesDTO;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlshareoverdues.service.ExtWlShareOverduesService;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharepaddresses.dto.ExtWlSharePAddressesDTO;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharepaddresses.service.ExtWlSharePAddressesService;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharepestates.dto.ExtWlSharePEstatesDTO;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharepestates.service.ExtWlSharePEstatesService;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharepidentification.dto.ExtWlSharePIdentificationDTO;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharepidentification.service.ExtWlSharePIdentificationService;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharepoccupations.dto.ExtWlSharePOccupationsDTO;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharepoccupations.service.ExtWlSharePOccupationsService;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharerepayinfo.dto.ExtWlShareRepayinfoDTO;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharerepayinfo.service.ExtWlShareRepayinfoService;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharespectrade.dto.ExtWlShareSpectradeDTO;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharespectrade.service.ExtWlShareSpectradeService;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcmixedriskinfo.dto.ExtWlZcMixedRiskInfoDTO;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcmixedriskinfo.dto.ResponseMixedRiskDTO;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcmobileverification.dto.ExtWlZcMobileVerificationDTO;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcnetworkanalysis.dto.ExtWlZcNetworkAnalysisDTO;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcrisklist.dto.ExtWlZcRiskListDTO;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;

/**
 * @className: ExtWlShareMainReportService
 * @package: com.jy.modules.externalplatform.interfacerepository.sh.extwlsharemainreport.service
 * @describe: 定义  算话共享报告_主表信息 实现类
 * @auther: 董康宁
 * @date: 2017/12/26
 * @time: 16:02
 */
@Service("com.jy.modules.externalplatform.interfacerepository.sh.extwlsharemainreport.service.ExtWlShareMainReportService")
public class ExtWlShareMainReportService implements Serializable, ExtSaveMessageDao {

    private static final long serialVersionUID = 1L;
    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    static Logger logger = LoggerFactory.getLogger(ExtWlQhzxRiskdooTipService.class);

    @Autowired
    private SysConfigAPI sysConfigAPI;
    
    @Autowired
    ExtInterfaceLogService extInterfaceLogService;

    @Autowired
    private ExtWlSharePIdentificationService identificationService;
    
    @Autowired
    private ExtWlSharePOccupationsService  occupationsService;
    
    @Autowired
    private ExtWlSharePAddressesService  addressesService;
    
    @Autowired
    private ExtWlSharePEstatesService estatesService; 

    @Autowired
    private ExtWlShareCIndicatorService  indicatorService;
    
    @Autowired
    private ExtWlShareCOverdueinfoService overdueinfoService;
    
    @Autowired
    private ExtWlShareCDebtinfoService debtinfoService;
    
    @Autowired
    private ExtWlShareCRemoteService remoteService;

    @Autowired
    private ExtWlShareSpectradeService spectradeService;
    
    @Autowired
    private ExtWlShareCreditDetailService  creditDetailService;
    
    @Autowired
    private ExtWlShareRepayinfoService  repayinfoService;
    
    @Autowired
    private ExtWlShareOverduesService  overduesService;
    
    @Autowired
    private ExtWlShareGuaranteesService  guaranteesService;
    

	@Autowired
	private ExtWlShareMainReportDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 算话共享报告_主表信息列表
     * @date 2017-12-07 19:52:36
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlShareMainReportDTO> searchExtWlShareMainReportByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlShareMainReportDTO> dataList =  dao.searchExtWlShareMainReportByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话共享报告_主表信息列表
     * @date 2017-12-07 19:52:36
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlShareMainReportDTO> searchExtWlShareMainReport(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlShareMainReportDTO> dataList = dao.searchExtWlShareMainReport(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话共享报告_主表信息对象
     * @date 2017-12-07 19:52:36
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlShareMainReportDTO queryExtWlShareMainReportByPrimaryKey(String id) throws Exception {
		
		ExtWlShareMainReportDTO dto = dao.findExtWlShareMainReportByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlShareMainReportDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlShareMainReport
     * @author Administrator
     * @description: 新增 算话共享报告_主表信息对象
     * @date 2017-12-07 19:52:36
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlShareMainReport(ExtWlShareMainReportDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlShareMainReport(paramMap);
		
		ExtWlShareMainReportDTO resultDto = (ExtWlShareMainReportDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlShareMainReport
     * @author Administrator
     * @description: 修改 算话共享报告_主表信息对象
     * @date 2017-12-07 19:52:36
     * @param dto
     * @return
     * @throws
     */
	public void updateExtWlShareMainReport(ExtWlShareMainReportDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlShareMainReport(paramMap);
	}
	/**
     * @title: deleteExtWlShareMainReportByPrimaryKey
     * @author Administrator
     * @description: 删除 算话共享报告_主表信息,按主键
     * @date 2017-12-07 19:52:36
     * @param baseDto, ids
     * @throws
     */ 
	public void deleteExtWlShareMainReportByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlShareMainReportByPrimaryKey(paramMap);
	}

    /**
     * @methodName: saveMessage
     * @param: [map]
     * @describe: 算话共享报告查询 外联平台  数据落表
     * @auther: 董康宁
     * @date: 2017/12/26
     * @time: 16:06
     */
    @Override
    public void saveMessage(Map<String, Object> map) {
        String isSuccess = "0";//是否调用成功  1：成功 0：失败
        String retCode = "";//接口返回码
        String retMsg = "";//接口返回信息
        String fkBizId = "";//接口落地数据主表ID
        //日志信息
        ExtInterfaceLogDTO interfaceLogDto=(ExtInterfaceLogDTO) map.get("interfaceLogDto");
        String result = String.valueOf(map.get("result"));

        try {
            
            String intoId = "";
            if(null != map.get("intoId"))
                intoId = (String)map.get("intoId");
            String custId = "";
            if(null != map.get("custId"))
                custId = map.get("custId").toString();
            String idType = (String)map.get("idType");//接口入参必传参数
            String idCard = (String)map.get("idCard");//接口入参必传参数
            String name = (String)map.get("name");//接口入参必传参数
            String sreason = (String)map.get("sreason");//接口入参必传参数
            String sorgseq = (String)map.get("sorgseq");//接口入参必传参数
            String reqMsg = "";
            try {
                reqMsg = makeupShShareReport(map);
            }
            catch (Exception e) {
                logger.error(e.getMessage());
            }
        
            if(StringUtils.isEmpty(result)){
                interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
                interfaceLogDto.setRetMsg("算话共享报告查询接口返回报文为空！");
            }else if(result.contains("Read timed out")){
                interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
                interfaceLogDto.setRetMsg("算话共享报告查询接口 访问超时！");
            }else{
                JSONObject jsonObject=JSONObject.fromObject(result);
                Boolean success = (Boolean)jsonObject.get("success");
                String errors = (String)jsonObject.get("errors");
                
                retCode = success.toString();
                retMsg = errors;
                
                //保存算话共享报告_主表信息
                ExtWlShareMainReportDTO  shareMainReportDTO = new ExtWlShareMainReportDTO();
                shareMainReportDTO.setCustName(name);//客户姓名
                shareMainReportDTO.setIdType(idType);//证件类型
                shareMainReportDTO.setIdCard(idCard);//证件号码
                shareMainReportDTO.setSreason(sreason);//查询原因
                shareMainReportDTO.setSuccess(String.valueOf(success));//成功标识：true-成功  false-失败
                shareMainReportDTO.setError(errors);//错误描述信息
                shareMainReportDTO.setReqMsg(reqMsg);//请求报文
                shareMainReportDTO.setRespMsg(result);//返回报文
                if(StringUtils.isNotEmpty(intoId))
                    shareMainReportDTO.setFkIntoId(Long.parseLong(intoId));//进件ID
                if(StringUtils.isNotEmpty(custId))
                    shareMainReportDTO.setFkCustId(Long.parseLong(custId));//客户ID
                shareMainReportDTO.setSorgseq(sorgseq);//查询编号
                shareMainReportDTO.setQueryDate(new Date());//查询时间
                Long fkReportId = this.insertExtWlShareMainReport(shareMainReportDTO);
                fkBizId = fkReportId.toString();
                if (success!=null && success) {//成功查得，解析并保存报文信息
                    
                    isSuccess = "1";
                    
                     try {
                        analyzeAndSaveShShareReport(jsonObject, fkReportId);

                        interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
                        interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_1.getValue());
                        
                    } catch (Exception e) {

                        interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4.getKey());
                        interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_4.getValue());
                        
                        logger.error("===解析进件["+ interfaceLogDto.getReqTransNo() +"]算话共享报告返回报文异常",e);
                    }
                }else{
                    interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_5.getKey());
                    interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_5.getValue());
                }
            
               
            }
            
        } catch (Exception ex) {
            JYLoggerUtil.error(this.getClass(), "===算话共享报告查询接口异常===接口交易流水号:"+interfaceLogDto.getReqTransNo(), ex);
            interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4.getKey());
            interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_4.getValue());
            
        } finally{
            try {
                interfaceLogDto.setRetBody(result);
                interfaceLogDto.setExt2(isSuccess);
                interfaceLogDto.setExt3(retCode);
                interfaceLogDto.setExt4(retMsg);
                interfaceLogDto.setExt5(fkBizId);
                Long keyId = extInterfaceLogService.insertExtInterfaceLog(interfaceLogDto);
            } catch (Exception e) {
                JYLoggerUtil.error(this.getClass(), "===保存致诚查询反欺诈信息日志异常===接口交易流水号:"+interfaceLogDto.getReqTransNo(), e);
            }
        }
    }

    /**
     * @methodName: analyzeAndSaveShShareReport
     * @param: [jsonObject, fkReportId]
     * @describe: 解析并保存算话共享报告信息
     * @auther: 董康宁
     * @date: 2017/12/26
     * @time: 16:05
     */
    public void analyzeAndSaveShShareReport(JSONObject jsonObject ,Long fkReportId) throws Exception{
        logger.info("执行方法 analyzeAndSaveShShareReport()，解析并保存算话共享报告信息 开始");
        JSONObject dataJson = jsonObject.getJSONObject("data");//获取报文主体信息
        if (JsonTool.isJSONObjectNotEmpty(dataJson)) {
             //1.解析保存"身份信息概要"
             JSONObject personJson = dataJson.getJSONObject("Person");
             analyzeAndSavePerson(personJson ,fkReportId);
             //2.解析保存"信贷信息概要"
             JSONObject creditJson = dataJson.getJSONObject("Credit");
             analyzeAndSaveCredit(creditJson ,fkReportId);
             //3.解析保存"信贷明细信息"
             analyzeAndSaveCreditInfos(creditJson ,fkReportId);
             //4.解析保存"对外担保信息明细"
             analyzeAndSaveGuaranteeInfos(creditJson ,fkReportId);
             //5.解析保存"特殊及异常交易信息"
             JSONObject specTradeJson = dataJson.getJSONObject("SpecTrade");
             analyzeAndSaveSpecTrade(specTradeJson ,fkReportId);
        }
        logger.info("执行方法 analyzeAndSaveShShareReport()，解析并保存算话共享报告信息 结束");
    }

    /**
     * @methodName: analyzeAndSavePerson
     * @param: [personJson, fkReportId]
     * @describe: 解析保存"身份信息概要"
     * @auther: 董康宁
     * @date: 2017/12/26
     * @time: 16:05
     */
    @SuppressWarnings("unchecked")
    public void analyzeAndSavePerson(JSONObject personJson ,Long fkReportId) throws Exception{
        logger.info("执行方法analyzeAndSavePerson()，解析保存\"身份信息概要\"开始");
        if (JsonTool.isJSONObjectNotEmpty(personJson)) {
             //获取"身份信息"
             JSONObject identificationJson = personJson.getJSONObject("identification");
             if (JsonTool.isJSONObjectNotEmpty(identificationJson)){
                 ExtWlSharePIdentificationDTO identificationDTO = (ExtWlSharePIdentificationDTO)JSONObject.toBean(identificationJson,ExtWlSharePIdentificationDTO.class);
                 identificationDTO.setFkReportId(fkReportId); 
                 identificationService.insertExtWlSharePIdentification(identificationDTO);
             }
             //获取"职业信息"
             JSONArray occupationsJsons = personJson.getJSONArray("occupations");
             if(JsonTool.isJSONArrayNotEmpty(occupationsJsons)){
                 List<ExtWlSharePOccupationsDTO> occupationsList = JSONArray.toList(occupationsJsons,ExtWlSharePOccupationsDTO.class);
                 occupationsService.insertExtWlSharePOccupationsList(occupationsList, fkReportId);
             }
             //获取"通讯地址信息"
             JSONArray addressesJsons = personJson.getJSONArray("contactAddresses");
             if (JsonTool.isJSONArrayNotEmpty(addressesJsons)){
                 List<ExtWlSharePAddressesDTO> addressesList = JSONArray.toList(addressesJsons,ExtWlSharePAddressesDTO.class);
                 addressesService.insertExtWlSharePAddressesList(addressesList, fkReportId);
             }
             //获取"居住地址信息" 
             JSONArray estatesJsons = personJson.getJSONArray("estates");
             if (JsonTool.isJSONArrayNotEmpty(estatesJsons)){
                 List<ExtWlSharePEstatesDTO> estatesList = JSONArray.toList(estatesJsons,ExtWlSharePEstatesDTO.class);
                 estatesService.insertExtWlSharePEstatesList(estatesList, fkReportId);
             } 
       }
        logger.info("执行方法analyzeAndSavePerson()，解析保存\"身份信息概要\"结束");
    }
    
    /**
     * @methodName: analyzeAndSaveCredit
     * @param: [creditJson, fkReportId]
     * @describe: 解析保存"信贷信息概要"
     * @auther: 董康宁
     * @date: 2017/12/26
     * @time: 16:05
     */
    public void analyzeAndSaveCredit(JSONObject creditJson, Long fkReportId) throws Exception {
        logger.info("执行方法 analyzeAndSaveCredit()，解析保存\"信贷信息概要\" 开始");
        if (JsonTool.isJSONObjectNotEmpty(creditJson)){
            //获取"信用提示"
            JSONObject indicatorJsons = creditJson.getJSONObject("indicator"); 
            List<ExtWlShareCIndicatorDTO>  indicatorList = new ArrayList<ExtWlShareCIndicatorDTO>();
            if (JsonTool.isJSONObjectNotEmpty(indicatorJsons)){
                 for(ScreditType indicatorScreditType : ScreditType.values()){
                     String screditType = indicatorScreditType.getKey();
                     JSONObject indicatorJson = indicatorJsons.getJSONObject(screditType);
                     ExtWlShareCIndicatorDTO indicatorDTO = (ExtWlShareCIndicatorDTO)JSONObject.toBean(indicatorJson,ExtWlShareCIndicatorDTO.class);
                     indicatorDTO.setScredittype(screditType);
                     indicatorList.add(indicatorDTO);
                 }
                 indicatorService.insertExtWlShareCIndicatorList(indicatorList,fkReportId); 
             } 
             //获取"逾期及违约信息概要"
             JSONObject overdueInfoJson = creditJson.getJSONObject("overdueInfo");
             if (JsonTool.isJSONObjectNotEmpty(overdueInfoJson)) {
                 ExtWlShareCOverdueinfoDTO  overdueinfoDTO = (ExtWlShareCOverdueinfoDTO)JSONObject.toBean(overdueInfoJson,ExtWlShareCOverdueinfoDTO.class); 
                 overdueinfoDTO.setFkReportId(fkReportId);
                 overdueinfoService.insertExtWlShareCOverdueinfo(overdueinfoDTO);
             }
             //获取"授信及负债信息概要"
             JSONObject debtInfoJson = creditJson.getJSONObject("debtInfo");
             if (JsonTool.isJSONObjectNotEmpty(debtInfoJson)){
                 JSONObject unSettledJsons = debtInfoJson.getJSONObject("unSettled");//未结清贷款信息汇总
                 List<ExtWlShareCDebtinfoDTO>  debtInfoList = new ArrayList<ExtWlShareCDebtinfoDTO>();
                 if(JsonTool.isJSONObjectNotEmpty(unSettledJsons)){
                     for(ScreditType unSettledScreditType : ScreditType.values()){
                         String screditType = unSettledScreditType.getKey();
                         JSONObject unSettledJson = unSettledJsons.getJSONObject(screditType);
                         if(JsonTool.isJSONObjectNotEmpty(unSettledJson)){
                             ExtWlShareCDebtinfoDTO debtinfoDTO = (ExtWlShareCDebtinfoDTO)JSONObject.toBean(unSettledJson,ExtWlShareCDebtinfoDTO.class);
                             debtinfoDTO.setScerttypeModule("unSettled");
                             debtinfoDTO.setScerttype(screditType);
                             debtInfoList.add(debtinfoDTO); 
                         } 
                     } 
                 } 
                 JSONObject guaranteeJsons = debtInfoJson.getJSONObject("guarantee");//对外担保信息汇总
                 if (JsonTool.isJSONObjectNotEmpty(guaranteeJsons)) {
                     ExtWlShareCDebtinfoDTO debtinfoDTO = (ExtWlShareCDebtinfoDTO)JSONObject.toBean(guaranteeJsons,ExtWlShareCDebtinfoDTO.class);
                     debtinfoDTO.setScerttypeModule("guarantee");
                     debtinfoDTO.setScerttype("guarantee");
                     debtInfoList.add(debtinfoDTO);
                 }
                 if(CollectionUtils.isNotEmpty(debtInfoList)){
                     debtinfoService.insertExtWlShareCDebtinfoList(debtInfoList ,fkReportId);  
                 }
             }
             //获取"长期未更新信贷信息概要"
             JSONObject remoteCreditInfoJson = creditJson.getJSONObject("remoteCreditInfo"); 
             if (JsonTool.isJSONObjectNotEmpty(remoteCreditInfoJson)){
                 ExtWlShareCRemoteDTO remoteDTO = (ExtWlShareCRemoteDTO)JSONObject.toBean(remoteCreditInfoJson, ExtWlShareCRemoteDTO.class);
                 remoteDTO.setFkReportId(fkReportId);
                 remoteService.insertExtWlShareCRemote(remoteDTO);
             } 
          }
        logger.info("执行方法 analyzeAndSaveCredit()，解析保存\"信贷信息概要\" 结束");
    }

    /**
     * @methodName: analyzeAndSaveCreditInfos
     * @param: [creditJson, fkReportId]
     * @describe: 解析保存"信贷信息明细"
     * @auther: 董康宁
     * @date: 2017/12/26
     * @time: 16:04
     */
    @SuppressWarnings("unchecked")
    @Autowired(required = false)
    public void analyzeAndSaveCreditInfos(JSONObject creditJson,Long fkReportId) throws Exception {
        logger.info("执行方法 analyzeAndSaveCreditInfos()，解析保存\"信贷信息明细\" 开始");
        if (JsonTool.isJSONObjectNotEmpty(creditJson)){
            String start5StatisDate = ExtShShareUtil.getFormatDate(Calendar.YEAR,-5);//5年之前的日期
            String endStatisDate = ExtShShareUtil.getFormatDate(Calendar.YEAR,0);
            JSONArray creditInfosJsons = creditJson.getJSONArray("creditInfos");
            Iterator<Object> it = creditInfosJsons.iterator();
            while (it.hasNext()) {
               JSONObject creditInfosJson = (JSONObject) it.next();
               //获取"信贷信息明细"
               JSONObject creditDetailJson = creditInfosJson.getJSONObject("creditDetail");
                if (JsonTool.isJSONObjectNotEmpty(creditDetailJson)){
                    ExtWlShareCreditDetailDTO creditDetailDTO = (ExtWlShareCreditDetailDTO) JSONObject.toBean(creditDetailJson, ExtWlShareCreditDetailDTO.class);
                    creditDetailDTO.setFkReportId(fkReportId);
                    Long fkCreditDetailId = creditDetailService.insertExtWlShareCreditDetail(creditDetailDTO);
                    if(fkCreditDetailId != null){
                          //获取"近24期还款记录"
                          JSONObject repayStatusJson = creditInfosJson.getJSONObject("repayStatus");
                          if (JsonTool.isJSONObjectNotEmpty(repayStatusJson)) {
                              ExtWlShareRepayinfoDTO  repayinfoDTO  = (ExtWlShareRepayinfoDTO)JSONObject.toBean(ExtShShareUtil.lowJSONKey(repayStatusJson), ExtWlShareRepayinfoDTO.class);
                              repayinfoDTO.setFkCreditDetailId(fkCreditDetailId);
                              repayinfoService.insertExtWlShareRepayinfo(repayinfoDTO);
                          } 
                          //获取"近5年逾期信息记录" 
                          JSONArray  overduesJsons = creditInfosJson.getJSONArray("overdues");
                          if (JsonTool.isJSONArrayNotEmpty(overduesJsons)) {
                               List<ExtWlShareOverduesDTO> overduesList = JSONArray.toList(overduesJsons,ExtWlShareOverduesDTO.class);
                               overduesService.insertExtWlShareOverduesList(overduesList,start5StatisDate,endStatisDate,fkCreditDetailId);
                          }
                    }
               }  
            }
         }
        logger.info("执行方法 analyzeAndSaveCreditInfos()，解析保存\"信贷信息明细\" 结束");
    }

    /**
     * @methodName: analyzeAndSaveGuaranteeInfos
     * @param: [creditJson, fkReportId]
     * @describe: 解析保存"对外担保信息明细"
     * @auther: 董康宁
     * @date: 2017/12/26
     * @time: 16:03
     */
     @SuppressWarnings("unchecked")
     public void analyzeAndSaveGuaranteeInfos(JSONObject creditJson, Long fkReportId) throws Exception {
         logger.info("执行方法 analyzeAndSaveGuaranteeInfos()，解析保存\"对外担保信息明细\" 开始");
         if(JsonTool.isJSONObjectNotEmpty(creditJson)){
             JSONArray guaranteeInfosJsons = creditJson.getJSONArray("guaranteeInfos");
             if (JsonTool.isJSONArrayNotEmpty(guaranteeInfosJsons)) {
                 List<ExtWlShareGuaranteesDTO> guaranteesList = JSONArray.toList(guaranteeInfosJsons, ExtWlShareGuaranteesDTO.class);
                 guaranteesService.insertExtWlShareGuaranteesList(guaranteesList, fkReportId);
             }
         }
         logger.info("执行方法 analyzeAndSaveGuaranteeInfos()，解析保存\"对外担保信息明细\" 结束");
     }
     
    /**
     * @methodName: analyzeAndSaveSpecTrade
     * @param: [specTradeJson, fkReportId]
     * @describe: 解析保存"特殊及异常交易信息"
     * @auther: 董康宁
     * @date: 2017/12/26
     * @time: 16:03
     */
     @SuppressWarnings({ "unchecked", "static-access" })
     public void analyzeAndSaveSpecTrade(JSONObject specTradeJson, Long fkReportId) throws Exception {
         logger.info("执行方法 analyzeAndSaveSpecTrade()，解析保存\"特殊及异常交易信息\" 开始");
         if (JsonTool.isJSONObjectNotEmpty(specTradeJson)) {
             for(SpecTradeType specTradeType : SpecTradeType.values()){
                 String tradeType = specTradeType.getKey();
                 JSONArray specTradeJsons = specTradeJson.getJSONArray(tradeType);
                 if(JsonTool.isJSONArrayNotEmpty(specTradeJsons)){
                     List<ExtWlShareSpectradeDTO> specTradeList = specTradeJsons.toList(specTradeJsons, ExtWlShareSpectradeDTO.class);
                     spectradeService.insertExtWlShareSpectradeList(specTradeList, tradeType, fkReportId);
                 }
             } 
         }
         logger.info("执行方法 analyzeAndSaveSpecTrade()，解析保存\"特殊及异常交易信息\" 结束");
     }
     
    /**
     * @methodName: makeupShShareReport
     * @param: [map]
     * @describe: 重组 查询时的报文，为了保存留底，无实际意义，外联平台用自己的方式访问
     * @auther: 董康宁
     * @date: 2017/12/26
     * @time: 16:03
     */
    private String makeupShShareReport(Map<String, Object> map) {
        String reqMsg = "";
        Map<String, String> param = new TreeMap<String, String>();
        String orgcode = sysConfigAPI.getValue("SHZX_ORG_CODE");// 算话分配的机构代码
        param.put("sorgcode", orgcode);
        param.put("sorgseq", (String)map.get("sorgseq"));
        param.put("name",   (String)map.get("name"));
        param.put("idType", (String)map.get("idType"));
        param.put("idCard", (String)map.get("idCard"));
        param.put("sreason", (String)map.get("sreason"));
        reqMsg= JSONObject.fromObject(param).toString();
        return reqMsg;
    }

}

