package com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxabasicinfo.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxabasicinfo.dao.ExtWlFpxaBasicInfoDao;
import com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxabasicinfo.dto.ExtWlFpxaBasicInfoDTO;
import com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxablack.dto.ExtWlFpxaBlackDTO;
import com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxablack.service.ExtWlFpxaBlackService;
import com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxacollection.dto.ExtWlFpxaCollectionDTO;
import com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxacollection.service.ExtWlFpxaCollectionService;
import com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxacontrctstatus.dto.ExtWlFpxaContrctStatusDTO;
import com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxacontrctstatus.service.ExtWlFpxaContrctStatusService;
import com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxafraudrisk.dto.ExtWlFpxaFraudRiskDTO;
import com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxafraudrisk.service.ExtWlFpxaFraudRiskService;
import com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxalendinfo.dto.ExtWlFpxaLendInfoDTO;
import com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxalendinfo.service.ExtWlFpxaLendInfoService;
import com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxalinkmaninfo.dto.ExtWlFpxaLinkManInfoDTO;
import com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxalinkmaninfo.service.ExtWlFpxaLinkManInfoService;
import com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxastrategy.dto.ExtWlFpxaStrategyDTO;
import com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxastrategy.service.ExtWlFpxaStrategyService;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.JYLoggerUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @className: ExtWlFpxaBasicInfoService
 * @package: com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxabasicinfo.service
 * @describe: 小爱有信数据落地实现类
 * @auther: huangxianchao
 * @date: 2018/1/15 0015
 * @time: 下午 5:12
 **/
@Service("com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxabasicinfo.service.ExtWlFpxaBasicInfoService")
public class ExtWlFpxaBasicInfoService implements Serializable,ExtSaveMessageDao {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlFpxaBasicInfoDao dao;
	@Autowired
	private ExtWlFpxaCollectionService extWlFpxaCollectionService;
    @Autowired
    private ExtWlFpxaContrctStatusService extWlFpxaContrctStatusService;
    @Autowired
    private ExtWlFpxaFraudRiskService extWlFpxaFraudRiskService;
    @Autowired
    private ExtWlFpxaBlackService extWlFpxaBlackService;
    @Autowired
    private ExtWlFpxaLendInfoService extWlFpxaLendInfoService;
    @Autowired
    private ExtWlFpxaLinkManInfoService extWlFpxaLinkManInfoService;
    @Autowired
    private ExtWlFpxaStrategyService extWlFpxaStrategyService;
    @Autowired
    private ExtInterfaceLogService extInterfaceLogService;


	/**
     * @title: insertExtWlFpxaBasicInfo
     * @author Administrator
     * @description: 新增 EXT_WL_FPXA_BASIC_INFO对象
     * @date 2018-01-15 15:22:21
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlFpxaBasicInfo(ExtWlFpxaBasicInfoDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlFpxaBasicInfo(paramMap);
		
		ExtWlFpxaBasicInfoDTO resultDto = (ExtWlFpxaBasicInfoDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}


    /**
     * @methodName: saveMessage
     * @param: [map]
     * @describe: 小爱有信数据落地
     * @auther: huangxianchao
     * @date: 2018/1/15 0015
     * @time: 下午 3:35
     **/
    @Override
	public void saveMessage(Map<String, Object> map) {
        String isSuccess = "0";
        String retCode = "";
        String retMsg = "";
        String fkBizId = "";
        if(null == map.get("intoCustomerRefId")){
            map.put("intoCustomerRefId", "");//非贷款系统调用，这个没有值
        }

        JSONObject respJson;
        //日志信息
        ExtInterfaceLogDTO interfaceLogDto = (ExtInterfaceLogDTO) map.get("interfaceLogDto");
        String results = (String) map.get("result");
        try {
            if (StringUtils.isNotEmpty(results)){//接口调用正常
                respJson = JSONObject.parseObject(results);
                if (null != respJson.get("msgCode")){
                    retCode = respJson.get("msgCode").toString();
                }
                if (null != respJson.get("msg")){
                    retMsg = respJson.get("msg").toString();
                }

                    isSuccess = "1";
                    interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
                    interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_1.getValue());
                    //小爱有信基本信息主
                    if (null != respJson.get("basicInfoVO")){
                        ExtWlFpxaBasicInfoDTO basicInfoDTO = JSONObject.parseObject(respJson.get("basicInfoVO").toString(), ExtWlFpxaBasicInfoDTO.class);

                        if (null != respJson.get("reportNo")){
                            basicInfoDTO.setReportNo(respJson.get("reportNo").toString());
                        }
                        basicInfoDTO.setMsg(retMsg);
                        basicInfoDTO.setMsgCode(retCode);
                        if (!"".equals(map.get("intoCustomerRefId").toString())){
                            basicInfoDTO.setIntoCustRefId(Long.valueOf(map.get("intoCustomerRefId").toString()));
                        }

                        //保存小爱有信基本信息
                        Long keyId = this.insertExtWlFpxaBasicInfo(basicInfoDTO);
                        if (null != keyId){
                            fkBizId = String.valueOf(keyId);
                        }

                    }

                    //催收平台名单
                    if (null != respJson.get("collectionListVO")){
                        JSONObject collectionJSONObject = JSONObject.parseObject(respJson.get("collectionListVO").toString());
                        ExtWlFpxaCollectionDTO collectionDTO = new ExtWlFpxaCollectionDTO();

                        if (null != collectionJSONObject.get("existCollectionList")){
                            collectionDTO.setExistCollection(collectionJSONObject.get("existCollectionList").toString());

                        }
                        if (null != collectionJSONObject.get("loanTimeByCollectionCase")){
                            collectionDTO.setLoanTime(collectionJSONObject.get("loanTimeByCollectionCase").toString());

                        }
                        if (null != collectionJSONObject.get("overdueAmountByCollectionCase")){
                            collectionDTO.setOverdueAmount(collectionJSONObject.get("overdueAmountByCollectionCase").toString());

                        }
                        if (null != collectionJSONObject.get("overdueMonthByCollectionCase")){
                            collectionDTO.setOverdueMonth(collectionJSONObject.get("overdueMonthByCollectionCase").toString());

                        }
                        collectionDTO.setFkId(Long.valueOf(fkBizId));
                        //保存催收平台名单
                        extWlFpxaCollectionService.insertExtWlFpxaCollection(collectionDTO);

                    }

                    //最近一次合同状态
                    if (null != respJson.get("contractStatusVO")){
                        ExtWlFpxaContrctStatusDTO contrctStatusDTO = JSONObject.parseObject(respJson.get("contractStatusVO").toString(),ExtWlFpxaContrctStatusDTO.class);
                        contrctStatusDTO.setFkId(Long.valueOf(fkBizId));
                        //保存
                        extWlFpxaContrctStatusService.insertExtWlFpxaContrctStatus(contrctStatusDTO);
                    }
                    //借款信息
                    if (null != respJson.get("lendInfoVO")){
                        ExtWlFpxaLendInfoDTO lendInfoDTO = JSONObject.parseObject(respJson.get("lendInfoVO").toString(), ExtWlFpxaLendInfoDTO.class);
                        lendInfoDTO.setFkId(Long.valueOf(fkBizId));
                        //保存
                        extWlFpxaLendInfoService.insertExtWlFpxaLendInfo(lendInfoDTO);
                    }
                    //策略集指标
                    if (null != respJson.get("strategySet")){
                        List<ExtWlFpxaStrategyDTO> strategySetDTOList = JSONArray.parseArray(respJson.get("strategySet").toString(), ExtWlFpxaStrategyDTO.class);
                        if (null != strategySetDTOList && strategySetDTOList.size()>0){
                            for (ExtWlFpxaStrategyDTO dto : strategySetDTOList) {
                                dto.setFkId(Long.valueOf(fkBizId));
                                //保存
                                extWlFpxaStrategyService.insertExtWlFpxaStrategy(dto);
                            }
                        }
                    }

                    //欺诈风险
                    if (null != respJson.get("fraudRiskVO")){
                        ExtWlFpxaFraudRiskDTO fraudRiskDTO = JSONObject.parseObject(respJson.get("fraudRiskVO").toString(), ExtWlFpxaFraudRiskDTO.class);
                        fraudRiskDTO.setFkId(Long.valueOf(fkBizId));
                        //保存  欺诈风险
                        Long riskId = extWlFpxaFraudRiskService.insertExtWlFpxaFraudRisk(fraudRiskDTO);
                        //保存欺诈风险黑名单信息
                        List<ExtWlFpxaBlackDTO> blackDTOList = fraudRiskDTO.getBlackList();
                        if (null != blackDTOList && blackDTOList.size()>0){
                            for (ExtWlFpxaBlackDTO blackDto : blackDTOList) {
                                blackDto.setFkRisklinkId(riskId);
                                blackDto.setLinkType("risk");//表示其主表为 欺诈风险表
                                //保存数据
                                extWlFpxaBlackService.insertExtWlFpxaBlack(blackDto);
                            }
                        }

                    }

                    //联系人信息
                    if (null != respJson.get("linkManInfoVO")){
                        ExtWlFpxaLinkManInfoDTO linkManInfoDto = JSONObject.parseObject(respJson.get("linkManInfoVO").toString(), ExtWlFpxaLinkManInfoDTO.class);
                        linkManInfoDto.setFkId(Long.valueOf(fkBizId));
                        //保存联系人信息
                        Long linkManid = extWlFpxaLinkManInfoService.insertExtWlFpxaLinkManInfo(linkManInfoDto);

                        //保存联系人信息黑名单信息
                        List<ExtWlFpxaBlackDTO> blackDTOList = linkManInfoDto.getBlackList();
                        if (null != blackDTOList && blackDTOList.size()>0){
                            for (ExtWlFpxaBlackDTO blackDto : blackDTOList) {
                                blackDto.setFkRisklinkId(linkManid);
                                blackDto.setLinkType("linkMan");//表示其主表为 联系人信息表
                                //保存数据
                                extWlFpxaBlackService.insertExtWlFpxaBlack(blackDto);
                            }
                        }

                    }




            }
        }catch (Exception e){
            JYLoggerUtil.error(this.getClass(), "===保存小爱有信日志异常===接口日志ID:"+String.valueOf(map.get("interfaceId")), e);
            interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4.getKey());//解析回参出错
            interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_4.getValue());

        }finally {

            try {
                interfaceLogDto.setRetBody(results);
                interfaceLogDto.setExt2(isSuccess);
                interfaceLogDto.setExt3(retCode);
                interfaceLogDto.setExt4(retMsg);
                interfaceLogDto.setExt5(fkBizId);//管理主表ID
                extInterfaceLogService.insertExtInterfaceLog(interfaceLogDto);

            } catch (Exception e) {
                JYLoggerUtil.error(this.getClass(), "===保存小爱有信日志异常===接口日志ID:"+String.valueOf(map.get("interfaceId")), e);
            }
        }

	    
	}
}

