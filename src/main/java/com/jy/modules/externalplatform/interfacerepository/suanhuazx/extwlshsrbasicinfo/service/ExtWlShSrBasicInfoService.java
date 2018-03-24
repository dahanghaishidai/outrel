package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrbasicinfo.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import com.jy.modules.common.util.JsonTool;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrassets.dto.ExtWlShSrAssetsDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrassets.service.ExtWlShSrAssetsService;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrcompensates.dto.ExtWlShSrCompensatesDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrcompensates.service.ExtWlShSrCompensatesService;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrcredits.dto.ExtWlShSrCreditsDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrcredits.service.ExtWlShSrCreditsService;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrenforcements.dto.ExtWlShSrEnforcementsDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrenforcements.service.ExtWlShSrEnforcementsService;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrgeneralinfo.dto.ExtWlShSrGeneralInfoDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrgeneralinfo.service.ExtWlShSrGeneralInfoService;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrguarantees.dto.ExtWlShSrGuaranteesDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrguarantees.service.ExtWlShSrGuaranteesService;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrjudgments.dto.ExtWlShSrJudgmentsDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrjudgments.service.ExtWlShSrJudgmentsService;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrloans.dto.ExtWlShSrLoansDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrloans.service.ExtWlShSrLoansService;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrpunishments.dto.ExtWlShSrPunishmentsDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrpunishments.service.ExtWlShSrPunishmentsService;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrtaxs.dto.ExtWlShSrTaxsDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrtaxs.service.ExtWlShSrTaxsService;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrtelecoms.dto.ExtWlShSrTelecomsDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrtelecoms.service.ExtWlShSrTelecomsService;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrtraces.dto.ExtWlShSrTracesDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrtraces.service.ExtWlShSrTracesService;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.utils.SuanhuaConstant;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrbasicinfo.dto.ExtWlShSrBasicInfoDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrbasicinfo.dao.ExtWlShSrBasicInfoDao;

/**
 * @classname: ExtWlShSrBasicInfoService
 * @description: 定义  算话人行结构化版(征信主表) 实现类
 * @author: Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrbasicinfo.service.ExtWlShSrBasicInfoService")
public class ExtWlShSrBasicInfoService implements Serializable {

    private static final long serialVersionUID = 1L;

    @Autowired
    private ExtWlShSrBasicInfoDao dao;

    @Autowired
    private ExtWlShSrGeneralInfoService generalInfoService;
    @Autowired
    private ExtWlShSrAssetsService assetsService;

    @Autowired
    private ExtWlShSrCompensatesService compensatesService;

    @Autowired
    private ExtWlShSrGuaranteesService guaranteesService;

    @Autowired
    private ExtWlShSrCreditsService creditsService;

    @Autowired
    private ExtWlShSrLoansService loansService;

    @Autowired
    private ExtWlShSrTaxsService taxsService;

    @Autowired
    private ExtWlShSrJudgmentsService judgmentsService;

    @Autowired
    private ExtWlShSrEnforcementsService enforcementsService;

    @Autowired
    private ExtWlShSrPunishmentsService punishmentsService;

    @Autowired
    private ExtWlShSrTelecomsService telecomsService;

    @Autowired
    private ExtWlShSrTracesService tracesService;

    /**
     * @param searchParams 条件
     * @return
     * @throws
     * @author Administrator
     * @description: 分页查询 算话人行结构化版(征信主表)列表
     * @date 2017-12-21 19:53:07
     */
    public List<ExtWlShSrBasicInfoDTO> searchExtWlShSrBasicInfoByPaging(Map<String, Object> searchParams) throws Exception {
        List<ExtWlShSrBasicInfoDTO> dataList = dao.searchExtWlShSrBasicInfoByPaging(searchParams);
        return dataList;
    }

    /**
     * @param searchParams 条件
     * @return
     * @throws
     * @author Administrator
     * @description: 按条件查询算话人行结构化版(征信主表)列表
     * @date 2017-12-21 19:53:07
     */
    public List<ExtWlShSrBasicInfoDTO> searchExtWlShSrBasicInfo(Map<String, Object> searchParams) throws Exception {
        List<ExtWlShSrBasicInfoDTO> dataList = dao.searchExtWlShSrBasicInfo(searchParams);
        return dataList;
    }

    /**
     * @param id
     * @return
     * @throws
     * @author Administrator
     * @description: 查询算话人行结构化版(征信主表)对象
     * @date 2017-12-21 19:53:07
     */
    public ExtWlShSrBasicInfoDTO queryExtWlShSrBasicInfoByPrimaryKey(String id) throws Exception {

        ExtWlShSrBasicInfoDTO dto = dao.findExtWlShSrBasicInfoByPrimaryKey(id);

        if (dto == null) dto = new ExtWlShSrBasicInfoDTO();

        return dto;

    }

    /**
     * @param dto
     * @return
     * @throws
     * @title: insertExtWlShSrBasicInfo
     * @author Administrator
     * @description: 新增 算话人行结构化版(征信主表)对象
     * @date 2017-12-21 19:53:07
     */
    @SuppressWarnings("all")
    public Long insertExtWlShSrBasicInfo(ExtWlShSrBasicInfoDTO dto) throws Exception {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("dto", dto);

        int count = dao.insertExtWlShSrBasicInfo(paramMap);

        ExtWlShSrBasicInfoDTO resultDto = (ExtWlShSrBasicInfoDTO) paramMap.get("dto");
        Long keyId = resultDto.getId();
        return keyId;
    }

    /**
     * @param paramMap
     * @return
     * @throws
     * @title: updateExtWlShSrBasicInfo
     * @author Administrator
     * @description: 修改 算话人行结构化版(征信主表)对象
     * @date 2017-12-21 19:53:07
     */
    public void updateExtWlShSrBasicInfo(ExtWlShSrBasicInfoDTO dto) throws Exception {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("dto", dto);

        dao.updateExtWlShSrBasicInfo(paramMap);
    }

    /**
     * @param paramMap
     * @throws
     * @title: deleteExtWlShSrBasicInfoByPrimaryKey
     * @author Administrator
     * @description: 删除 算话人行结构化版(征信主表),按主键
     * @date 2017-12-21 19:53:07
     */
    public void deleteExtWlShSrBasicInfoByPrimaryKey(BaseDTO baseDto, String ids) throws Exception {
        if (StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");

        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("dto", baseDto);
        paramMap.put("ids", ids);
        dao.deleteExtWlShSrBasicInfoByPrimaryKey(paramMap);
    }


    /**
     * @methodName: analyzeAndSaveReportStructure
     * @param: [reportStructureJson, dataMsg, fkTrailId]
     * @describe: 解析并保存算话人行个人信用报告(结构化报告)
     * @auther: huangxianchao
     * @date: 2017/12/22 0022
     * @time: 上午 10:50
     **/
    @SuppressWarnings("unchecked")
    public void analyzeAndSaveReportStructure(JSONObject reportStructureJson, String dataMsg, Long fkTrailId) throws Exception {
        //解析并保存算话人行结构化版(征信主表)
        ExtWlShSrBasicInfoDTO basicInfoDTO = new ExtWlShSrBasicInfoDTO();
        JSONObject basicJson = reportStructureJson.getJSONObject(SuanhuaConstant.BASIC);
        if (JsonTool.isJSONObjectNotEmpty(basicJson)) {
            basicInfoDTO = (ExtWlShSrBasicInfoDTO) JSONObject.toBean(basicJson, ExtWlShSrBasicInfoDTO.class);
            basicInfoDTO.setFkTrailId(fkTrailId);
            basicInfoDTO.setRespMsg(dataMsg);
            Long fkReportId = this.insertExtWlShSrBasicInfo(basicInfoDTO);
            if (fkReportId != null) {
                //解析并保存算话人行结构化版(汇总信息表)
                JSONObject generalJson = reportStructureJson.getJSONObject(SuanhuaConstant.GENERAL);
                if (JsonTool.isJSONObjectNotEmpty(generalJson)) {
                    ExtWlShSrGeneralInfoDTO generalInfoDTO = (ExtWlShSrGeneralInfoDTO) JSONObject.toBean(generalJson, ExtWlShSrGeneralInfoDTO.class);
                    generalInfoDTO.setFkReportId(fkReportId);
                    generalInfoService.insertExtWlShSrGeneralInfo(generalInfoDTO);
                }
                //解析并保存 算话人行结构化版(资产处置信息列表)
                JSONArray assetsJsonArr = reportStructureJson.getJSONArray(SuanhuaConstant.ASSETS);
                if (JsonTool.isJSONArrayNotEmpty(assetsJsonArr)) {
                    List<ExtWlShSrAssetsDTO> assetsList = JSONArray.toList(assetsJsonArr, ExtWlShSrAssetsDTO.class);
                    if (CollectionUtils.isNotEmpty(assetsList)) {
                        assetsService.insertExtWlShSrAssetsList(assetsList, fkReportId);
                    }
                }
                //解析并保存算话人行结构化版(保证人代偿信息列表)
                JSONArray compensatesJsonArr = reportStructureJson.getJSONArray(SuanhuaConstant.COMPENSATES);
                if (JsonTool.isJSONArrayNotEmpty(compensatesJsonArr)) {
                    List<ExtWlShSrCompensatesDTO> compensatesList = JSONArray.toList(compensatesJsonArr, ExtWlShSrCompensatesDTO.class);
                    if (CollectionUtils.isNotEmpty(compensatesList)) {
                        compensatesService.insertExtWlShSrCompensatesList(compensatesJsonArr, fkReportId);
                    }
                }
                //解析并保存算话人行结构化版(为他人担保信息列表)
                JSONArray guaranteesJsonArr = reportStructureJson.getJSONArray(SuanhuaConstant.GUARANTEES);
                if (JsonTool.isJSONArrayNotEmpty(guaranteesJsonArr)) {
                    List<ExtWlShSrGuaranteesDTO> guaranteesList = JSONArray.toList(guaranteesJsonArr, ExtWlShSrGuaranteesDTO.class);
                    if (CollectionUtils.isNotEmpty(guaranteesList)) {
                        guaranteesService.insertExtWlShSrGuaranteesList(guaranteesList, fkReportId);
                    }
                }
                //解析并保存算话人行结构化版(信用卡列表)
                JSONArray creditsJsonArr = reportStructureJson.getJSONArray(SuanhuaConstant.CREDITS);
                if (JsonTool.isJSONArrayNotEmpty(creditsJsonArr)) {
                    List<ExtWlShSrCreditsDTO> creditsList = JSONArray.toList(creditsJsonArr, ExtWlShSrCreditsDTO.class);
                    if (CollectionUtils.isNotEmpty(creditsList)) {
                        creditsService.insertExtWlShSrCreditsList(creditsList, fkReportId);
                    }
                }
                //解析并保存算话人行结构化版(贷款列表)
                JSONArray loansJsonArr = reportStructureJson.getJSONArray(SuanhuaConstant.LOANS);
                if (JsonTool.isJSONArrayNotEmpty(loansJsonArr)) {
                    List<ExtWlShSrLoansDTO> loansList = JSONArray.toList(loansJsonArr, ExtWlShSrLoansDTO.class);
                    if (CollectionUtils.isNotEmpty(loansList)) {
                        loansService.insertExtWlShSrLoansList(loansList, fkReportId);
                    }
                }
                //解析并保存算话人行结构化版(欠税记录列表)
                JSONArray taxsJsonArr = reportStructureJson.getJSONArray(SuanhuaConstant.TAXS);
                if (JsonTool.isJSONArrayNotEmpty(taxsJsonArr)) {
                    List<ExtWlShSrTaxsDTO> taxsList = JSONArray.toList(taxsJsonArr, ExtWlShSrTaxsDTO.class);
                    if (CollectionUtils.isNotEmpty(taxsList)) {
                        taxsService.insertExtWlShSrTaxsList(taxsList, fkReportId);
                    }
                }
                //解析并保存算话人行结构化版(民事判决记录列表)
                JSONArray judgmentsJsonArr = reportStructureJson.getJSONArray(SuanhuaConstant.JUDGMENTS);
                if (JsonTool.isJSONArrayNotEmpty(judgmentsJsonArr)) {
                    List<ExtWlShSrJudgmentsDTO> judgmentsList = JSONArray.toList(judgmentsJsonArr, ExtWlShSrJudgmentsDTO.class);
                    if (CollectionUtils.isNotEmpty(judgmentsList)) {
                        judgmentsService.insertExtWlShSrJudgmentsList(judgmentsList, fkReportId);
                    }
                }
                //解析并保存算话人行结构化版(强制执行记录表)
                JSONArray enforcementsJsonArr = reportStructureJson.getJSONArray(SuanhuaConstant.ENFORCEMENTS);
                if (JsonTool.isJSONArrayNotEmpty(enforcementsJsonArr)) {
                    List<ExtWlShSrEnforcementsDTO> enforcementsList = JSONArray.toList(enforcementsJsonArr, ExtWlShSrEnforcementsDTO.class);
                    if (CollectionUtils.isNotEmpty(enforcementsList)) {
                        enforcementsService.insertExtWlShSrEnforcementsList(enforcementsList, fkReportId);
                    }
                }
                //解析并保存算话人行结构化版(行政处罚记录表)
                JSONArray punishmentsJsonArr = reportStructureJson.getJSONArray(SuanhuaConstant.PUNISHMENTS);
                if (JsonTool.isJSONArrayNotEmpty(punishmentsJsonArr)) {
                    List<ExtWlShSrPunishmentsDTO> punishmentsList = JSONArray.toList(punishmentsJsonArr, ExtWlShSrPunishmentsDTO.class);
                    if (CollectionUtils.isNotEmpty(punishmentsList)) {
                        punishmentsService.insertExtWlShSrPunishmentsList(punishmentsList, fkReportId);
                    }
                }
                //解析并保存算话人行结构化版(电信欠费信息表)
                JSONArray telecomsJsonArr = reportStructureJson.getJSONArray(SuanhuaConstant.TELECOMS);
                if (JsonTool.isJSONArrayNotEmpty(telecomsJsonArr)) {
                    List<ExtWlShSrTelecomsDTO> telecomsList = JSONArray.toList(telecomsJsonArr, ExtWlShSrTelecomsDTO.class);
                    if (CollectionUtils.isNotEmpty(telecomsList)) {
                        telecomsService.insertExtWlShSrTelecomsList(telecomsList, fkReportId);
                    }
                }
                //解析并保存算话人行结构化版(查询记录表)
                JSONArray tracesJsonArr = reportStructureJson.getJSONArray(SuanhuaConstant.TRACES);
                if (JsonTool.isJSONArrayNotEmpty(tracesJsonArr)) {
                    List<ExtWlShSrTracesDTO> tracesList = JSONArray.toList(tracesJsonArr, ExtWlShSrTracesDTO.class);
                    if (CollectionUtils.isNotEmpty(tracesList)) {
                        tracesService.insertExtWlShSrTracesList(tracesList, fkReportId);
                    }
                }

            }
        }
    }

}

