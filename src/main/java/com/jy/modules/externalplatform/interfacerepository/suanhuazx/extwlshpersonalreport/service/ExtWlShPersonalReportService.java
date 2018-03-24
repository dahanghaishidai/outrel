package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpersonalreport.service;

import com.jy.modules.common.util.JsonTool;
import com.jy.modules.extbiz.in.shzx.utils.MD5EncodeUtil;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshcreditinvest.dto.ExtWlShCreditInvestDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshcreditinvest.service.ExtWlShCreditInvestService;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshcreditquerytrail.dto.ExtWlShCreditQueryTrailDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshcreditquerytrail.service.ExtWlShCreditQueryTrailService;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshcreditrecdsumma.dto.ExtWlShCreditRecdSummaDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshcreditrecdsumma.service.ExtWlShCreditRecdSummaService;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshcreditrecordintro.dto.ExtWlShCreditRecordIntroDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshcreditrecordintro.service.ExtWlShCreditRecordIntroService;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshcredtreddetail.dto.ExtWlShCredtRedDetailDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshcredtreddetail.service.ExtWlShCredtRedDetailService;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpercreditloan.dto.ExtWlShPerCreditLoanDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpercreditloan.service.ExtWlShPerCreditLoanService;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpersonalreport.dao.ExtWlShPersonalReportDao;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpersonalreport.dto.ExtWlShPersonalReportDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpersondebts.dto.ExtWlShPersonDebtsDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpersondebts.service.ExtWlShPersonDebtsService;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpersonloanbala.dto.ExtWlShPersonLoanBalaDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpersonloanbala.service.ExtWlShPersonLoanBalaService;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpersonoverd.dto.ExtWlShPersonOverdDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpersonoverd.service.ExtWlShPersonOverdService;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshprecordenforcem.dto.ExtWlShPrecordEnforcemDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshprecordenforcem.service.ExtWlShPrecordEnforcemService;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshprecordjudgment.dto.ExtWlShPrecordJudgmentDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshprecordjudgment.service.ExtWlShPrecordJudgmentService;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshprecordpunishm.dto.ExtWlShPrecordPunishmDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshprecordpunishm.service.ExtWlShPrecordPunishmService;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshprecordtax.dto.ExtWlShPrecordTaxDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshprecordtax.service.ExtWlShPrecordTaxService;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshprecordtele.dto.ExtWlShPrecordTeleDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshprecordtele.service.ExtWlShPrecordTeleService;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpublicrecdsumm.dto.ExtWlShPublicRecdSummDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpublicrecdsumm.service.ExtWlShPublicRecdSummService;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshqrecordlist.dto.ExtWlShQrecordListDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshqrecordlist.service.ExtWlShQrecordListService;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshqrecordsumm.dto.ExtWlShQrecordSummDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshqrecordsumm.service.ExtWlShQrecordSummService;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshreportextend.dto.ExtWlShReportExtendDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshreportextend.service.ExtWlShReportExtendService;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrbasicinfo.service.ExtWlShSrBasicInfoService;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.utils.CreditType;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.utils.CreditVersionType;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.utils.OverdueStatus;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.utils.SuanhuaConstant;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.api.sysconfig.SysConfigAPI;
import com.jy.platform.core.common.BaseDTO;
import com.jy.platform.core.common.JYLoggerUtil;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @classname: ExtWlShPersonalReportService
 * @description: 定义  算话人行征信报告主表 实现类
 * @author: Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpersonalreport.service.ExtWlShPersonalReportService")
public class ExtWlShPersonalReportService implements Serializable, ExtSaveMessageDao {

    private static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    @Autowired
    private SysConfigAPI sysConfigAPI;

    @Autowired
    private ExtInterfaceLogService extInterfaceLogService;

    @Autowired
    private ExtWlShReportExtendService reportExtendService;

    @Autowired
    private ExtWlShCreditInvestService creditInvestService;
    @Autowired
    private ExtWlShCreditQueryTrailService creditQueryTrailService;

    @Autowired
    private ExtWlShSrBasicInfoService srBasicInfoService;
    @Autowired
    private ExtWlShPersonOverdService personOverdService;
    @Autowired
    private ExtWlShPersonDebtsService personDebtsService;
    @Autowired
    private ExtWlShPersonLoanBalaService personLoanBalaService;

    @Autowired
    private ExtWlShPerCreditLoanService personCreditLoanService;

    @Autowired
    private ExtWlShCreditRecdSummaService creditRecordSummaryService;

    @Autowired
    private ExtWlShCreditRecordIntroService creditRecordIntroService;

    @Autowired
    private ExtWlShCredtRedDetailService creditRecordDetailService;

    @Autowired
    private ExtWlShPublicRecdSummService publicRecordSummaryService;

    @Autowired
    private ExtWlShPrecordTaxService precordTaxService;

    @Autowired
    private ExtWlShPrecordJudgmentService precordJudgmentService;

    @Autowired
    private ExtWlShPrecordEnforcemService precordEnforcementService;

    @Autowired
    private ExtWlShPrecordPunishmService precordPunishmentService;

    @Autowired
    private ExtWlShPrecordTeleService precordTelecomService;

    @Autowired
    private ExtWlShQrecordSummService qrecordSummaryService;

    @Autowired
    private ExtWlShQrecordListService qrecordListService;

    private static final long serialVersionUID = 1L;

    @Autowired
    private ExtWlShPersonalReportDao dao;

    /**
     * @param searchParams 条件
     * @return
     * @throws
     * @author Administrator
     * @description: 分页查询 算话人行征信报告主表列表
     * @date 2017-12-21 19:47:29
     */
    public List<ExtWlShPersonalReportDTO> searchExtWlShPersonalReportByPaging(Map<String, Object> searchParams) throws Exception {
        List<ExtWlShPersonalReportDTO> dataList = dao.searchExtWlShPersonalReportByPaging(searchParams);
        return dataList;
    }

    /**
     * @param searchParams 条件
     * @return
     * @throws
     * @author Administrator
     * @description: 按条件查询算话人行征信报告主表列表
     * @date 2017-12-21 19:47:29
     */
    public List<ExtWlShPersonalReportDTO> searchExtWlShPersonalReport(Map<String, Object> searchParams) throws Exception {
        List<ExtWlShPersonalReportDTO> dataList = dao.searchExtWlShPersonalReport(searchParams);
        return dataList;
    }

    /**
     * @param id
     * @return
     * @throws
     * @author Administrator
     * @description: 查询算话人行征信报告主表对象
     * @date 2017-12-21 19:47:29
     */
    public ExtWlShPersonalReportDTO queryExtWlShPersonalReportByPrimaryKey(String id) throws Exception {

        ExtWlShPersonalReportDTO dto = dao.findExtWlShPersonalReportByPrimaryKey(id);

        if (dto == null) dto = new ExtWlShPersonalReportDTO();

        return dto;

    }

    /**
     * @param dto
     * @return
     * @throws
     * @title: insertExtWlShPersonalReport
     * @author Administrator
     * @description: 新增 算话人行征信报告主表对象
     * @date 2017-12-21 19:47:29
     */
    @SuppressWarnings("all")
    public Long insertExtWlShPersonalReport(ExtWlShPersonalReportDTO dto) throws Exception {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("dto", dto);

        int count = dao.insertExtWlShPersonalReport(paramMap);

        ExtWlShPersonalReportDTO resultDto = (ExtWlShPersonalReportDTO) paramMap.get("dto");
        Long keyId = resultDto.getId();
        return keyId;
    }

    /**
     * @param paramMap
     * @return
     * @throws
     * @title: updateExtWlShPersonalReport
     * @author Administrator
     * @description: 修改 算话人行征信报告主表对象
     * @date 2017-12-21 19:47:29
     */
    public void updateExtWlShPersonalReport(ExtWlShPersonalReportDTO dto) throws Exception {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("dto", dto);

        dao.updateExtWlShPersonalReport(paramMap);
    }

    /**
     * @param paramMap
     * @throws
     * @title: deleteExtWlShPersonalReportByPrimaryKey
     * @author Administrator
     * @description: 删除 算话人行征信报告主表,按主键
     * @date 2017-12-21 19:47:29
     */
    public void deleteExtWlShPersonalReportByPrimaryKey(BaseDTO baseDto, String ids) throws Exception {
        if (StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");

        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("dto", baseDto);
        paramMap.put("ids", ids);
        dao.deleteExtWlShPersonalReportByPrimaryKey(paramMap);
    }

    /**
     * @methodName: analyzeAndSaveReport
     * @param: [reportJson, dataMsg, fkTrailId]
     * @describe: 解析并保存算话人行个人信用报告(原始报告)
     * @auther: huangxianchao
     * @date: 2017/12/22 0022
     * @time: 上午 10:40
     **/
    private void analyzeAndSaveReport(JSONObject reportJson, String dataMsg, Long fkTrailId) throws Exception {

        ExtWlShPersonalReportDTO personalReportDTO = makeUpPersonalReport(reportJson, dataMsg);
        personalReportDTO.setFkTrailId(fkTrailId);
        personalReportDTO.setCreditVersionType(CreditVersionType.REPORT.getKey());
        Long fkReportId = insertExtWlShPersonalReport(personalReportDTO);
        if (fkReportId != null) {
            //解析并保存算话人行原版信贷记录信息
            JSONObject creditRecordJson = reportJson.getJSONObject(SuanhuaConstant.CREDIT_RECORD);
            if (JsonTool.isJSONObjectNotEmpty(creditRecordJson)) {
                analyzeAndSaveCreditRecordInfo(creditRecordJson, fkReportId);
            }
            //解析并保存算话人行原版公共记录信息
            JSONObject publicRecordJson = reportJson.getJSONObject(SuanhuaConstant.PUBLIC_RECORD);
            if (JsonTool.isJSONObjectNotEmpty(publicRecordJson)) {
                analyzeAndSavePublicRecordInfo(publicRecordJson, fkReportId);
            }
            //解析并保存算话人行原版查询记录信息
            JSONObject queryRecordJson = reportJson.getJSONObject(SuanhuaConstant.QUERY_RECORD);
            if (JsonTool.isJSONObjectNotEmpty(queryRecordJson)) {
                analyzeAndSaveQueryRecordInfo(queryRecordJson, fkReportId);
            }
        }
    }

    /**
     * @methodName: analyzeAndSaveCreditRecordInfo
     * @param: [creditRecordJson, fkReportId]
     * @describe: 解析并保存算话人行原版信贷记录信息
     * @auther: huangxianchao
     * @date: 2017/12/22 0022
     * @time: 上午 11:08
     **/
    private void analyzeAndSaveCreditRecordInfo(JSONObject creditRecordJson, Long fkReportId) throws Exception {
        //算话人行原版(信贷记录解释文字与资产相关汇总信息)
        ExtWlShCreditRecordIntroDTO creditRecordIntroDTO = new ExtWlShCreditRecordIntroDTO();
        String intro = (String) creditRecordJson.get(SuanhuaConstant.INTRO);//信贷记录解释文字
        creditRecordIntroDTO.setFkReportId(fkReportId);
        creditRecordIntroDTO.setIntro(intro);
        //算话人行原版(信贷记录概要)
        JSONObject creditRecordSumJson = creditRecordJson.getJSONObject(SuanhuaConstant.SUMMARY);
        //涉及信用卡、购房贷款和其他贷款
        String basicOption[] = {CreditType.CREDIT_CARD.getKey(), CreditType.MORTGAGE.getKey(), CreditType.OTHER_LOAN.getKey()};
        //涉及资产处置信息、保证人代偿信息和为他人担保信息
        String otherOption[] = {CreditType.ASSET_DISPOSAL.getKey(), CreditType.COMPENSATE.getKey(),
                CreditType.GUARANTEE.getKey()};
        if (JsonTool.isJSONObjectNotEmpty(creditRecordSumJson)) {
            List<ExtWlShCreditRecdSummaDTO> creditRecordSummaryList = new ArrayList<ExtWlShCreditRecdSummaDTO>();
            for (int i = 0; i < basicOption.length; i++) {
                String creditType = basicOption[i];
                JSONObject creditRecordSum = creditRecordSumJson.getJSONObject(creditType);
                ExtWlShCreditRecdSummaDTO creditRecordSummaryDTO = (ExtWlShCreditRecdSummaDTO) JSONObject.toBean(creditRecordSum, ExtWlShCreditRecdSummaDTO.class);
                creditRecordSummaryDTO.setCreditType(CreditType.getValueByKey(creditType));
                creditRecordSummaryList.add(creditRecordSummaryDTO);
            }
            for (int i = 0; i < otherOption.length; i++) {
                String creditType = otherOption[i];
                String otherCreditRecord = String.valueOf((Integer) creditRecordSumJson.get(creditType));
                if (CreditType.ASSET_DISPOSAL.getKey().equals(creditType)) {
                    creditRecordIntroDTO.setAssetDisposal(otherCreditRecord);
                } else if (CreditType.COMPENSATE.getKey().equals(creditType)) {
                    creditRecordIntroDTO.setCompensate(otherCreditRecord);
                }
            }
            if (CollectionUtils.isNotEmpty(creditRecordSummaryList)) {
                //算话人行原版(信贷记录概要)列表
                creditRecordSummaryService.insertExtWLShCreditRecordSummaryList(creditRecordSummaryList, fkReportId);
            }
            //保存算话人行原版(信贷记录解释文字与资产相关汇总信息)
            creditRecordIntroService.insertExtWlShCreditRecordIntro(creditRecordIntroDTO);
        }
        //算话人行原版(信贷记录详情)
        JSONObject creditRecordDetailsJson = creditRecordJson.getJSONObject(SuanhuaConstant.DETAIL);
        //解析并保存算话人行原版(信贷记录详情)
        if (JsonTool.isJSONObjectNotEmpty(creditRecordDetailsJson)) {
            analyzeAndSaveCreditRecordDetail(basicOption, otherOption, creditRecordDetailsJson, fkReportId);
        }
    }

    /**
     * @methodName: analyzeAndSaveCreditRecordDetail
     * @param: [basicOption, otherOption, creditRecordDetailsJson, fkReportId]
     * @describe: 解析并保存算话人行原版(信贷记录详情)
     * @auther: huangxianchao
     * @date: 2017/12/25 0025
     * @time: 上午 9:18
     **/
    @SuppressWarnings("unchecked")
    public void analyzeAndSaveCreditRecordDetail(String basicOption[], String otherOption[],
                                                 JSONObject creditRecordDetailsJson, Long fkReportId) throws Exception {
        List<ExtWlShCredtRedDetailDTO> creditRecordDetailList = new ArrayList<ExtWlShCredtRedDetailDTO>();
        for (int i = 0; i < basicOption.length; i++) {
            String creditType = basicOption[i];
            JSONObject creditRecordDetail = creditRecordDetailsJson.getJSONObject(creditType);
            if (JsonTool.isJSONObjectNotEmpty(creditRecordDetail)) {
                for (OverdueStatus overdueStatusEnum : OverdueStatus.values()) {
                    String overdueStatusKey = overdueStatusEnum.getKey();
                    String overdueStatusValue = overdueStatusEnum.getValue();
                    JSONArray creditRecordDetailJsonArr = creditRecordDetail.getJSONArray(overdueStatusKey);
                    if (JsonTool.isJSONArrayNotEmpty(creditRecordDetailJsonArr)) {
                        for (Iterator<String> iterator = creditRecordDetailJsonArr.iterator(); iterator.hasNext(); ) {
                            ExtWlShCredtRedDetailDTO creditRecordDetailDTO = new ExtWlShCredtRedDetailDTO();
                            String orginalContent = (String) iterator.next();
                            creditRecordDetailDTO.setFkReportId(fkReportId);
                            creditRecordDetailDTO.setOrginalContent(orginalContent);
                            creditRecordDetailDTO.setCreditType(CreditType.getValueByKey(creditType));
                            creditRecordDetailDTO.setOverdueStatus(overdueStatusValue);
                            creditRecordDetailList.add(creditRecordDetailDTO);
                        }
                    }
                }
            }
        }
        for (int i = 0; i < otherOption.length; i++) {
            String creditType = otherOption[i];
            JSONArray creditRecordDetailJsonArr = creditRecordDetailsJson.getJSONArray(creditType);
            if (JsonTool.isJSONArrayNotEmpty(creditRecordDetailJsonArr)) {
                for (Iterator<String> iterator = creditRecordDetailJsonArr.iterator(); iterator.hasNext(); ) {
                    ExtWlShCredtRedDetailDTO creditRecordDetailDTO = new ExtWlShCredtRedDetailDTO();
                    String orginalContent = (String) iterator.next();
                    creditRecordDetailDTO.setFkReportId(fkReportId);
                    creditRecordDetailDTO.setOrginalContent(orginalContent);
                    creditRecordDetailDTO.setCreditType(CreditType.getValueByKey(creditType));
                    creditRecordDetailList.add(creditRecordDetailDTO);
                }
            }
        }
        if (CollectionUtils.isNotEmpty(creditRecordDetailList)) {
            creditRecordDetailService.insertExtWlShCreditRecordDetailList(creditRecordDetailList, fkReportId);
        }
    }


    /**
     * @methodName: analyzeAndSavePublicRecordInfo
     * @param: [publicRecordJson, fkReportId]
     * @describe: 解析并保存算话人行原版公共记录信息
     * @auther: huangxianchao
     * @date: 2017/12/22 0022
     * @time: 上午 11:10
     **/
    @SuppressWarnings("unchecked")
    private void analyzeAndSavePublicRecordInfo(JSONObject publicRecordJson, Long fkReportId) throws Exception {

        //算话人行原版(公共记录概要)
        ExtWlShPublicRecdSummDTO publicRecordSummaryDTO = new ExtWlShPublicRecdSummDTO();
        JSONObject publicRecordSumJson = publicRecordJson.getJSONObject(SuanhuaConstant.SUMMARY);
        if (JsonTool.isJSONObjectNotEmpty(publicRecordSumJson)) {
            publicRecordSummaryDTO = (ExtWlShPublicRecdSummDTO) JSONObject.toBean(
                    publicRecordSumJson, ExtWlShPublicRecdSummDTO.class);
            String intro = (String) publicRecordJson.get(SuanhuaConstant.INTRO);//公共记录解释文字
            publicRecordSummaryDTO.setFkReportId(fkReportId);
            publicRecordSummaryDTO.setIntro(intro);
            publicRecordSummaryService.insertExtWlShPublicRecdSumm(publicRecordSummaryDTO);
        }
        //算话人行原版(公共记录详情)
        JSONObject publicRecordJsonDetail = publicRecordJson.getJSONObject(SuanhuaConstant.DETAIL);
        if (JsonTool.isJSONObjectNotEmpty(publicRecordJsonDetail)) {
            //算话人行原版(公共记录_欠税记录表)
            JSONArray taxJsonArr = publicRecordJsonDetail.getJSONArray(SuanhuaConstant.TAX);
            if (JsonTool.isJSONArrayNotEmpty(taxJsonArr)) {
                List<ExtWlShPrecordTaxDTO> precordTaxList = JSONArray.toList(taxJsonArr, ExtWlShPrecordTaxDTO.class);
                if (CollectionUtils.isNotEmpty(precordTaxList)) {
                    precordTaxService.insertExtWlShPrecordTaxList(precordTaxList, fkReportId);
                }
            }
            //算话人行原版(公共记录_民事判决记录表)
            JSONArray judgmentJsonArr = publicRecordJsonDetail.getJSONArray(SuanhuaConstant.JUDGMENT);
            if (JsonTool.isJSONArrayNotEmpty(judgmentJsonArr)) {
                List<ExtWlShPrecordJudgmentDTO> precordJudgmentList = JSONArray.toList(
                        judgmentJsonArr, ExtWlShPrecordJudgmentDTO.class);
                if (CollectionUtils.isNotEmpty(precordJudgmentList)) {
                    precordJudgmentService.insertExtWlShPrecordJudgmentList(precordJudgmentList, fkReportId);
                }
            }
            //算话人行原版(公共记录_强制执行记录表)
            JSONArray enforcementJsonArr = publicRecordJsonDetail.getJSONArray(SuanhuaConstant.ENFORCEMENT);
            if (JsonTool.isJSONArrayNotEmpty(enforcementJsonArr)) {
                List<ExtWlShPrecordEnforcemDTO> precordEnforcementList = JSONArray.toList(
                        enforcementJsonArr, ExtWlShPrecordEnforcemDTO.class);
                if (CollectionUtils.isNotEmpty(precordEnforcementList)) {
                    precordEnforcementService.insertExtWlShPrecordEnforcementList(
                            precordEnforcementList, fkReportId);
                }
            }
            //算话人行原版(公共记录_行政处罚记录表)
            JSONArray punishmentJsonArr = publicRecordJsonDetail.getJSONArray(SuanhuaConstant.PUNISHMENT);
            if (JsonTool.isJSONArrayNotEmpty(punishmentJsonArr)) {
                List<ExtWlShPrecordPunishmDTO> precordPunishmentList = JSONArray.toList(
                        punishmentJsonArr, ExtWlShPrecordPunishmDTO.class);
                if (CollectionUtils.isNotEmpty(precordPunishmentList)) {
                    precordPunishmentService.insertExtWlShPrecordPunishmentList(precordPunishmentList, fkReportId);
                }
            }
            //算话人行原版(公共记录_电信欠费信息表)
            JSONArray telecomJsonArr = publicRecordJsonDetail.getJSONArray(SuanhuaConstant.TELECOM);
            if (JsonTool.isJSONArrayNotEmpty(telecomJsonArr)) {
                List<ExtWlShPrecordTeleDTO> precordTelecomList = JSONArray.toList(telecomJsonArr, ExtWlShPrecordTeleDTO.class);
                if (CollectionUtils.isNotEmpty(precordTelecomList)) {
                    precordTelecomService.insertExtWlShPrecordTelecomList(precordTelecomList, fkReportId);
                }
            }
        }
    }

    /**
     * @methodName: analyzeAndSaveQueryRecordInfo
     * @param: [queryRecordJson, fkReportId]
     * @describe: 解析并保存算话人行原版查询记录信息
     * @auther: huangxianchao
     * @date: 2017/12/22 0022
     * @time: 上午 11:11
     **/
    private void analyzeAndSaveQueryRecordInfo(JSONObject queryRecordJson, Long fkReportId) throws Exception {

        //算话人行原版(查询记录信息概要表)
        ExtWlShQrecordSummDTO qrecordSummaryDTO = new ExtWlShQrecordSummDTO();
        JSONObject qrecordSummaryJson = queryRecordJson.getJSONObject(SuanhuaConstant.SUMMARY);
        if (JsonTool.isJSONObjectNotEmpty(qrecordSummaryJson)) {
            qrecordSummaryDTO = (ExtWlShQrecordSummDTO) JSONObject.toBean(qrecordSummaryJson, ExtWlShQrecordSummDTO.class);
            String intro = (String) queryRecordJson.get(SuanhuaConstant.INTRO);
            qrecordSummaryDTO.setFkReportId(fkReportId);
            qrecordSummaryDTO.setIntro(intro);
            qrecordSummaryService.insertExtWlShQrecordSumm(qrecordSummaryDTO);
        }
        //算话人行原版(查询记录详单)
        List<ExtWlShQrecordListDTO> qrecordList = new ArrayList<ExtWlShQrecordListDTO>();
        JSONObject qrecordDetailJson = queryRecordJson.getJSONObject(SuanhuaConstant.DETAIL);
        //获取机构查询记录明细
        JSONArray organizationJsonArr = qrecordDetailJson.getJSONArray(SuanhuaConstant.ORGANIZATION);
        if (JsonTool.isJSONArrayNotEmpty(organizationJsonArr)) {
            String queryType = SuanhuaConstant.ORGANIZATION_QUERY;
            for (int i = 0; i < organizationJsonArr.size(); i++) {
                JSONObject organizationQueryJson = organizationJsonArr.getJSONObject(i);
                ExtWlShQrecordListDTO qrecordDTO = (ExtWlShQrecordListDTO) JSONObject.toBean(
                        organizationQueryJson, ExtWlShQrecordListDTO.class);
                qrecordDTO.setQueryType(queryType);
                qrecordList.add(qrecordDTO);
            }
        }
        //获取个人查询记录明细
        JSONArray individualJsonArr = qrecordDetailJson.getJSONArray(SuanhuaConstant.INDIVIDUAL);
        if (JsonTool.isJSONArrayNotEmpty(individualJsonArr)) {
            String queryType = SuanhuaConstant.INDIVIDUAL_QUERY;
            for (int i = 0; i < individualJsonArr.size(); i++) {
                JSONObject individualQueryJson = individualJsonArr.getJSONObject(i);
                ExtWlShQrecordListDTO qrecordDTO = (ExtWlShQrecordListDTO) JSONObject.toBean(
                        individualQueryJson, ExtWlShQrecordListDTO.class);
                qrecordDTO.setQueryType(queryType);
                qrecordList.add(qrecordDTO);
            }
        }
        if (CollectionUtils.isNotEmpty(qrecordList)) {
            qrecordListService.insertExtWlShQrecordList1(qrecordList, fkReportId);
        }
    }


    /**
     * @methodName: analyzeAndSaveReportRisk
     * @param: [reportRiskJson, dataMsg, fkTrailId]
     * @describe: 解析并保存算话人行个人信用报告(风险报告)
     * @auther: huangxianchao
     * @date: 2017/12/22 0022
     * @time: 上午 10:46
     **/
    private void analyzeAndSaveReportRisk(JSONObject reportRiskJson, String dataMsg, Long fkTrailId) throws Exception {

        ExtWlShPersonalReportDTO personalReportDTO = makeUpPersonalReport(reportRiskJson, dataMsg);
        personalReportDTO.setFkTrailId(fkTrailId);
        personalReportDTO.setCreditVersionType(CreditVersionType.REPORT_RISK.getKey());
        Long fkReportId = insertExtWlShPersonalReport(personalReportDTO);
        if (fkReportId != null) {
            // 拼装并保存人行征信逾期记录
            JSONObject overduesJson = reportRiskJson.getJSONObject("overdues");
            if (JsonTool.isJSONObjectNotEmpty(overduesJson)) {
                ExtWlShPersonOverdDTO personOverduesDTO = makeUpPersonOverd(overduesJson, fkReportId);
                personOverdService.insertExtWlShPersonOverd(personOverduesDTO);
            }
            // 拼装并保存人行征信负债记录
            JSONObject debtsJson = reportRiskJson.getJSONObject("debts");
            if (JsonTool.isJSONObjectNotEmpty(debtsJson)) {
                ExtWlShPersonDebtsDTO personDebtsDTO = makeUpPersonDebts(debtsJson, fkReportId);
                personDebtsService.insertExtWlShPersonDebts(personDebtsDTO);
                // 拼装并保存人行征信贷款余额详列
                JSONArray loanBalanceInfos = debtsJson.getJSONArray("loanBalanceInfos");
                if (!loanBalanceInfos.isEmpty()) {
                    List<ExtWlShPersonLoanBalaDTO> dataList = makeUpPersonLoanBalances(loanBalanceInfos);
                    personLoanBalaService.insertExtWlShPersonLoanBalancesList(dataList, personDebtsDTO.getId());
                }
            }
            // 拼装并保存人行征信信贷信息
            JSONObject creditLoanHisJson = reportRiskJson.getJSONObject("creditLoanHis");// 信贷历史
            JSONObject creditLoanNeedsJson = reportRiskJson.getJSONObject("creditLoanNeeds");// 信贷需求
            JSONObject othersJson = reportRiskJson.getJSONObject("others");// 其他
            if (JsonTool.isJSONObjectNotEmpty(creditLoanHisJson) || JsonTool.isJSONObjectNotEmpty(creditLoanNeedsJson)
                    || JsonTool.isJSONObjectNotEmpty(othersJson)) {
                personCreditLoanService.insertExtWlShPersonCreditLoan(makeUpPersonCreditLoan(
                        creditLoanHisJson, creditLoanNeedsJson, othersJson, fkReportId));
            }
        }

    }

    /**
     * @methodName: makeUpPersonCreditLoan
     * @param: [creditLoanHis, creditLoanNeeds, others, fkPersonalReportId]
     * @describe: 拼装人行征信信贷信息
     * @auther: huangxianchao
     * @date: 2017/12/25 0025
     * @time: 上午 10:14
     **/
    public ExtWlShPerCreditLoanDTO makeUpPersonCreditLoan(JSONObject creditLoanHis, JSONObject creditLoanNeeds,
                                                          JSONObject others, Long fkPersonalReportId) {
        JSONObject personCreditLoan = new JSONObject();
        personCreditLoan.putAll(creditLoanHis);
        personCreditLoan.putAll(creditLoanNeeds);
        personCreditLoan.putAll(others);
        ExtWlShPerCreditLoanDTO personCreditLoanDTO = (ExtWlShPerCreditLoanDTO) JSONObject.toBean(
                personCreditLoan, ExtWlShPerCreditLoanDTO.class);
        personCreditLoanDTO.setFkPersonalReportId(fkPersonalReportId);
        return personCreditLoanDTO;

    }


    /**
     * @methodName: makeUpPersonLoanBalances
     * @param: [loanBalanceInfos]
     * @describe: 拼装人行征信贷款余额详列
     * @auther: huangxianchao
     * @date: 2017/12/22 0022
     * @time: 上午 11:26
     **/
    public List<ExtWlShPersonLoanBalaDTO> makeUpPersonLoanBalances(JSONArray loanBalanceInfos) {

        List<ExtWlShPersonLoanBalaDTO> dataList = JSONArray.toList(loanBalanceInfos, ExtWlShPersonLoanBalaDTO.class);
        return dataList;
    }

    /**
     * @methodName: makeUpPersonOverd
     * @param: overdues fkPersonalReportId
     * @describe: 拼装人行征信逾期记录
     * @auther: huangxianchao
     * @date: 2017/12/22 0022
     * @time: 上午 11:16
     **/
    public ExtWlShPersonOverdDTO makeUpPersonOverd(JSONObject overdues, Long fkPersonalReportId) {

        ExtWlShPersonOverdDTO personOverduesDTO = (ExtWlShPersonOverdDTO) JSONObject.toBean(overdues,
                ExtWlShPersonOverdDTO.class);
        personOverduesDTO.setFkPersonalReportId(fkPersonalReportId);
        return personOverduesDTO;
    }

    /**
     * @methodName: makeUpPersonDebts
     * @param: [debts, fkPersonalReportId]
     * @describe: 拼装人行征信负债记录
     * @auther: huangxianchao
     * @date: 2017/12/22 0022
     * @time: 上午 11:19
     **/
    public ExtWlShPersonDebtsDTO makeUpPersonDebts(JSONObject debts, Long fkPersonalReportId) {

        ExtWlShPersonDebtsDTO personDebtsDTO = (ExtWlShPersonDebtsDTO) JSONObject.toBean(debts, ExtWlShPersonDebtsDTO.class);
        personDebtsDTO.setFkPersonalReportId(fkPersonalReportId);
        return personDebtsDTO;
    }


    /**
     * @methodName: analyzeAndSaveReportExtend
     * @param: [reportExtendJson, dataMsg, fkTrailId]
     * @describe: 解析并保存算话人行报告扩展字段
     * @auther: huangxianchao
     * @date: 2017/12/22 0022
     * @time: 上午 10:52
     **/
    private void analyzeAndSaveReportExtend(JSONObject reportExtendJson, String dataMsg, Long fkTrailId) throws Exception {
        ExtWlShReportExtendDTO reportExtendDTO = (ExtWlShReportExtendDTO) JSONObject.toBean(
                reportExtendJson, ExtWlShReportExtendDTO.class);
        reportExtendDTO.setFkTrailId(fkTrailId);
        reportExtendDTO.setRespMsg(dataMsg);
        reportExtendService.insertExtWlShReportExtend(reportExtendDTO);

    }

    /**
     * @methodName: makeupQueryParams
     * @param: [idCard, name]
     * @describe: 拼装算话征信央行报告查询参数
     * @auther: huangxianchao
     * @date: 2017/12/22 0022
     * @time: 上午 11:00
     **/
    public String makeupQueryParams(String idCard, String name) {

        String reqMsg = "";
        String orgcode = sysConfigAPI.getValue("SHZX_ORG_CODE");//机构号
        String orgkey = sysConfigAPI.getValue("SHZX_ORG_KEY");//机构私钥
        Map<String, String> param = new TreeMap<String, String>();
        param.put("orgcode", orgcode);
        param.put("name", name);
        param.put("idCard", idCard);
        MD5EncodeUtil.hash(param, orgkey);
        reqMsg = JSONObject.fromObject(param).toString();
        return reqMsg;
    }

    /**
     * @methodName: makeUpPersonalReport
     * @param: [reportRisk, data]
     * @describe: 拼装人行征信报告信息
     * @auther: huangxianchao
     * @date: 2017/12/22 0022
     * @time: 上午 11:05
     **/
    public ExtWlShPersonalReportDTO makeUpPersonalReport(JSONObject reportRisk, String data) {

        JSONObject personalReport = new JSONObject();
        JSONObject reportInfo = reportRisk.getJSONObject(SuanhuaConstant.REPORTINFO);
        JSONObject personalinfo = reportRisk.getJSONObject(SuanhuaConstant.PERSONALINFO);
        personalReport.putAll(reportInfo);
        personalReport.putAll(personalinfo);
        ExtWlShPersonalReportDTO personalReportDTO = (ExtWlShPersonalReportDTO) JSONObject.toBean(
                personalReport, ExtWlShPersonalReportDTO.class);
        personalReportDTO.setPushMessage(data);
        return personalReportDTO;
    }

    /**
     * @methodName: saveMessage
     * @param: [map]
     * @describe: 算话人行征信报告主表  数据落地
     * @auther: huangxianchao
     * @date: 2017/12/22 0022
     * @time: 上午 9:38
     **/
    @Override
    public void saveMessage(Map<String, Object> map) {

        String isSuccess = "0";
        String retCode = "";
        String retMsg = "";
        String fkBizId = "";

        String sysSource = "1";//系统来源 本司贷款
        //查询结果
        Boolean success = false;
        //错误消息
        String errors = "";
        //日志信息
        ExtInterfaceLogDTO interfaceLogDto = (ExtInterfaceLogDTO) map.get("interfaceLogDto");
        String results = String.valueOf(map.get("result"));

        try {

            ExtWlShCreditQueryTrailDTO creditQueryTrailDTO = new ExtWlShCreditQueryTrailDTO();

            if (StringUtils.isNotEmpty(results)) {
                JSONObject jsonObject = JSONObject.fromObject(results);
                if (null != jsonObject.get(SuanhuaConstant.SUCCESS)) {
                    success = (Boolean) jsonObject.get(SuanhuaConstant.SUCCESS);
                }

                retCode = String.valueOf(success);

                if (success == null) {
                    success = false;
                } else {
                    if (null != jsonObject.get(SuanhuaConstant.ERRORS)) {
                        errors = (String) jsonObject.get(SuanhuaConstant.ERRORS);
                        retMsg = String.valueOf(jsonObject.get(SuanhuaConstant.ERRORS));
                    }

                    if (success) {

                        isSuccess = "1";//调用成功
                        interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
                        interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_1.getValue());


                        String custCode = (String) map.get("custCode");
                        String name = (String) map.get("name");
                        String cardType = (String) map.get("idCardType");
                        String idCard = (String) map.get("idCard");
                        String phoneNumber = (String) map.get("phoneNumber");
                        String intoId = (String) map.get("intoId");
                        Long orgId = (Long) map.get("orgId");
                        String ownerId = (String) map.get("ownerId");


                        //插入 申请表 creditInvestDTO 对象
                        ExtWlShCreditInvestDTO creditInvestDTO = new ExtWlShCreditInvestDTO();
                        creditInvestDTO.setCustName(name);
                        creditInvestDTO.setCellPhoneNum(phoneNumber);
                        creditInvestDTO.setIdCardNum(idCard);
                        creditInvestDTO.setSuccess("true");
                        creditInvestDTO.setSysSource(sysSource);
                        creditInvestDTO.setState("1");//1-待调用   这里用来表示未落地成功，后面数据成功保存后，会更新此状态 为 2-已完成
                        creditInvestDTO.setProcessCode("00");
                        if (null != intoId) {
                            creditInvestDTO.setFkConsultId(Long.parseLong(intoId));
                        }

                        Long fkInvestId = creditInvestService.insertExtWlShCreditInvest(creditInvestDTO);//申请表ID  fkInvestId


                        //重组请求报文，保存记录
                        String reqMsg = makeupQueryParams(idCard, name);


                        JSONObject dataJson = jsonObject.getJSONObject("data");//获取报文主体信息

                        if (JsonTool.isJSONObjectNotEmpty(dataJson)) {
                            //保存算话人行个人信用报告查询轨迹信息
                            creditQueryTrailDTO.setCustName(name);
                            creditQueryTrailDTO.setIdCard(idCard);
                            creditQueryTrailDTO.setFkInvestId(fkInvestId);
                            creditQueryTrailDTO.setSysSource(sysSource);
                            creditQueryTrailDTO.setSuccess(String.valueOf(success));
                            creditQueryTrailDTO.setErrorMsg(errors);
                            creditQueryTrailDTO.setReqMsg(reqMsg);
                            creditQueryTrailDTO.setRespMsg(results);
                            Long fkTrailId = creditQueryTrailService.insertExtWlShCreditQueryTrail(creditQueryTrailDTO);

                            if (null != fkTrailId) {
                                fkBizId = String.valueOf(fkTrailId);
                            }

                            //算话人行个人信用报告(原始报告)
                            String reportStr  = (String) dataJson.get(SuanhuaConstant.REPORT);
                            if(fkTrailId != null && StringUtils.isNotEmpty(reportStr)){
								JSONObject reportJson = JSONObject.fromObject(reportStr.substring(1, reportStr.length()-1));
								if (JsonTool.isJSONObjectNotEmpty(reportJson)) {
									//解析并保存算话人行个人信用报告(原始报告)
									analyzeAndSaveReport(reportJson,reportJson.toString(),fkTrailId);
								}
							}
							//算话人行个人信用报告(风险报告)
							String reportRiskStr  = (String) dataJson.get(SuanhuaConstant.REPORT_RISK);
							if (fkTrailId != null && StringUtils.isNotEmpty(reportRiskStr)){
								JSONObject reportRiskJson = JSONObject.fromObject(reportRiskStr.substring(1,
                                        reportRiskStr.length()-1));
								if (JsonTool.isJSONObjectNotEmpty(reportRiskJson)) {
									//解析并保存算话人行个人信用报告(风险报告)
									analyzeAndSaveReportRisk(reportRiskJson,reportRiskJson.toString(),fkTrailId);
								}
							}
							//算话人行个人信用报告(结构化报告)
							String reportStructureStr  = (String) dataJson.get(SuanhuaConstant.REPORT_STRUCTURE);
							if (fkTrailId != null && StringUtils.isNotEmpty(reportStructureStr)){
								JSONObject reportStructureJson = JSONObject.fromObject(
								        reportStructureStr.substring(1, reportStructureStr.length()-1));
								if (JsonTool.isJSONObjectNotEmpty(reportStructureJson)) {
									//解析并保存算话人行个人信用报告(结构化报告)
									srBasicInfoService.analyzeAndSaveReportStructure(reportStructureJson,
                                            reportStructureJson.toString(),fkTrailId);
								}
							}
							//算话人行个人信用报告(人行扩展字段)
							String reportExtendstr  = (String) dataJson.get(SuanhuaConstant.REPORT_EXTEND);
							if (fkTrailId != null && StringUtils.isNotEmpty(reportExtendstr)){
								JSONObject reportExtendJson = JSONObject.fromObject(
								        reportExtendstr.substring(1, reportExtendstr.length()-1));
								if(JsonTool.isJSONObjectNotEmpty(reportExtendJson)){
									//解析并保存算话人行报告扩展字段
									analyzeAndSaveReportExtend(reportExtendJson,reportExtendJson.toString(),fkTrailId);
								}
							}
                            //修改[算话央行征信采集申请表]调用状态为已完成
                            creditInvestService.updateExtWlShCreditInvestState(creditInvestDTO,
                                    SuanhuaConstant.INVOKE_SUCCESS_STATE);
                        }
                    }
                }
            } else {
                errors = "请求接口返回报文为空";
                interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
                interfaceLogDto.setRetMsg("调用算话人行征信报告接口返回报文为空");
            }

        } catch (Exception e) {
            JYLoggerUtil.error(this.getClass(), "===保存算话人行征信报告日志异常===接口日志ID:" + String.valueOf(
                    map.get("interfaceId")), e);
            interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4.getKey());//解析回参出错
            interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_4.getValue());

        } finally {
            try {

                interfaceLogDto.setRetBody(results);
                interfaceLogDto.setExt2(isSuccess);
                interfaceLogDto.setExt3(retCode);
                interfaceLogDto.setExt4(retMsg);
                interfaceLogDto.setExt5(fkBizId);//管理主表ID
                extInterfaceLogService.insertExtInterfaceLog(interfaceLogDto);

            } catch (Exception e) {
                JYLoggerUtil.error(this.getClass(), "===保存算话人行征信报告日志异常===接口日志ID:" + String.valueOf(
                        map.get("interfaceId")), e);
            }
        }

    }
}

