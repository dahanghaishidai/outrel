package com.jy.modules.externalplatform.interfacerepository.zc.extwlzcmixedriskinfo.service;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.jy.platform.core.common.BaseDTO;
import com.jy.platform.core.common.JYLoggerUtil;
import com.jy.modules.common.ARIConstant;
import com.jy.modules.externalplatform.interfacerepository.qhzx.extwlqhzxriskdootip.service.ExtWlQhzxRiskdooTipService;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcloanrecords.dto.ExtWlZcLoanRecordsDTO;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcmixedriskinfo.dto.ExtWlZcMixedRiskInfoDTO;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcmixedriskinfo.dto.ResponseMixedRiskDTO;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcmixedriskinfo.dao.ExtWlZcMixedRiskInfoDao;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcmobileverification.dto.ExtWlZcMobileVerificationDTO;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcmobileverification.service.ExtWlZcMobileVerificationService;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcnetworkanalysis.dto.ExtWlZcNetworkAnalysisDTO;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcnetworkanalysis.service.ExtWlZcNetworkAnalysisService;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcqueryhistory.dto.ExtWlZcQueryHistoryDTO;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcqueryinfo.dto.ExtWlZcqueryInfoDTO;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcqueryinfo.dto.RequestMes2Dto;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcqueryinfo.dto.RequestMesDto;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcrisklist.dto.ExtWlZcRiskListDTO;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcrisklist.service.ExtWlZcRiskListService;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcriskresults.dto.ExtWlZcRiskResultsDTO;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcstatistics.dto.ExtWlZcStatisticsDTO;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;

/**
 * @classname: ExtWlZcMixedRiskInfoService
 * @description: 定义  致诚查询反欺诈信息主表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.zc.extwlzcmixedriskinfo.service.ExtWlZcMixedRiskInfoService")
public class ExtWlZcMixedRiskInfoService implements Serializable, ExtSaveMessageDao {

    private static final long serialVersionUID = 1L;
    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    static Logger logger = LoggerFactory.getLogger(ExtWlQhzxRiskdooTipService.class);
    
    @Autowired
    ExtInterfaceLogService extInterfaceLogService;

    @Autowired
    private ExtWlZcNetworkAnalysisService extWlZcNetworkAnalysisService;
    
    @Autowired
    private ExtWlZcMobileVerificationService extWlZcMobileVerificationService;

    @Autowired
    private ExtWlZcRiskListService extWlZcRiskListService;
    
	@Autowired
	private ExtWlZcMixedRiskInfoDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 致诚查询反欺诈信息主表列表
     * @date 2017-12-07 13:39:29
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlZcMixedRiskInfoDTO> searchExtWlZcMixedRiskInfoByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlZcMixedRiskInfoDTO> dataList =  dao.searchExtWlZcMixedRiskInfoByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询致诚查询反欺诈信息主表列表
     * @date 2017-12-07 13:39:29
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlZcMixedRiskInfoDTO> searchExtWlZcMixedRiskInfo(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlZcMixedRiskInfoDTO> dataList = dao.searchExtWlZcMixedRiskInfo(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询致诚查询反欺诈信息主表对象
     * @date 2017-12-07 13:39:29
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlZcMixedRiskInfoDTO queryExtWlZcMixedRiskInfoByPrimaryKey(String id) throws Exception {
		
		ExtWlZcMixedRiskInfoDTO dto = dao.findExtWlZcMixedRiskInfoByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlZcMixedRiskInfoDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlZcMixedRiskInfo
     * @author Administrator
     * @description: 新增 致诚查询反欺诈信息主表对象
     * @date 2017-12-07 13:39:29
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlZcMixedRiskInfo(ExtWlZcMixedRiskInfoDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlZcMixedRiskInfo(paramMap);
		
		ExtWlZcMixedRiskInfoDTO resultDto = (ExtWlZcMixedRiskInfoDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlZcMixedRiskInfo
     * @author Administrator
     * @description: 修改 致诚查询反欺诈信息主表对象
     * @date 2017-12-07 13:39:29
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlZcMixedRiskInfo(ExtWlZcMixedRiskInfoDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlZcMixedRiskInfo(paramMap);
	}
	/**
     * @title: deleteExtWlZcMixedRiskInfoByPrimaryKey
     * @author Administrator
     * @description: 删除 致诚查询反欺诈信息主表,按主键
     * @date 2017-12-07 13:39:29
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlZcMixedRiskInfoByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlZcMixedRiskInfoByPrimaryKey(paramMap);
	}

    /**
     * @title: saveMessage
     * @author: dongkangning
     * @description:致诚查询反欺诈信息接口 外联平台数据落地
     * @date 2017年12月7日 下午3:35:17
     * @param baseDto
     * @param ids
     * @throws Exception
     * @throws
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
            ResponseMixedRiskDTO requestMes=new ResponseMixedRiskDTO();
            
            String intoId = "";
            if(null != map.get("intoId"))
                intoId = (String)map.get("intoId");
            String idNo = (String)map.get("idNo");//接口入参必传参数
            String name = (String)map.get("name");//接口入参必传参数
        
            if(StringUtils.isEmpty(result)){
                interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
                interfaceLogDto.setRetMsg("致诚查询反欺诈信息接口返回报文为空！");
            }else if(result.contains("Read timed out")){
                interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
                interfaceLogDto.setRetMsg("致诚查询反欺诈信息接口 访问超时！");
            }else{
                requestMes=JSON.parseObject(result, ResponseMixedRiskDTO.class);
                retCode = requestMes.getErrorCode();
                retMsg = requestMes.getMessage();
                if(ARIConstant.ERROR_CODE_SUC.equals(requestMes.getErrorCode())){
                    isSuccess = "1";
                    // 1、保存主表信息
                    ExtWlZcMixedRiskInfoDTO dto = requestMes.getData();
                    dto.setErrorCode(requestMes.getErrorCode());
                    dto.setMessage(requestMes.getMessage());
                    dto.setIntoId(intoId);
                    dto.setCardId(idNo);
                    dto.setCustName(name);
                    dto.setBankCheckAuth3(requestMes.getData().getBankCheckAuth3());
                    dto.setBankCheckAuth3Code(requestMes.getData().getBankCheckAuth3Code());
                    dto.setBankCheckAuth4(requestMes.getData().getBankCheckAuth4());
                    dto.setBankCheckAuth4Code(requestMes.getData().getBankCheckAuth4Code());
                    dto.setIdentityVerify(requestMes.getData().getIdentityVerify());
                    dto.setIdentityVerifyCode(requestMes.getData().getIdentityVerifyCode());
                    dto.setZcFraudScore(requestMes.getData().getZcFraudScore());
                    Long keyId = this.insertExtWlZcMixedRiskInfo(dto);
                    if(null != keyId)
                        fkBizId = keyId.toString();
                    // 2、保存社交关系信息(对象)
                    ExtWlZcNetworkAnalysisDTO extWlZcNetworkAnalysisDTO = dto.getBehaviorFeatures();
                    if (extWlZcNetworkAnalysisDTO != null) {
                        // 判断是否所有属性都为空(如果都为空不执行插入操作)
                        boolean flag = false;
                        for (Field f : extWlZcNetworkAnalysisDTO.getClass().getDeclaredFields()) {
                            f.setAccessible(true);
                            if (f.get(extWlZcNetworkAnalysisDTO) != null) {
                                if ("serialVersionUID".equals(f.getName())) {
                                    continue;
                                }
                                flag = true;
                                break;
                            }
                        }
                        if (flag) {
                            extWlZcNetworkAnalysisDTO.setKeyId(keyId.toString());
                            extWlZcNetworkAnalysisDTO.setCreateBy(-1L);
                            extWlZcNetworkAnalysisService.insertExtWlZcNetworkAnalysis(extWlZcNetworkAnalysisDTO);
                        }
                    }
                    // 3、保存手机验证信息(集合)
                    List<ExtWlZcMobileVerificationDTO> mobileVerificationList = new ArrayList<ExtWlZcMobileVerificationDTO>();
                    ExtWlZcMobileVerificationDTO[] mobileVerifications = dto.getMobileVerifyList();
                    if (mobileVerifications != null && mobileVerifications.length > 0) {
                        for (ExtWlZcMobileVerificationDTO extZcMobileVerificationDTO : mobileVerifications) {
                            extZcMobileVerificationDTO.setKeyId(keyId.toString());
                            extZcMobileVerificationDTO.setCreateBy(-1L);
                            mobileVerificationList.add(extZcMobileVerificationDTO);
                        }
                        extWlZcMobileVerificationService.batchInsertVerification(mobileVerificationList);
                    }
                    // 4、保存风险名单信息(集合)
                    List<ExtWlZcRiskListDTO> resultList = new ArrayList<ExtWlZcRiskListDTO>();
                    ExtWlZcRiskListDTO[] results = dto.getResultList();
                    if (results != null && results.length > 0) {
                        for (ExtWlZcRiskListDTO extZcRiskListDTO : results) {
                            extZcRiskListDTO.setKeyId(keyId.toString());
                            extZcRiskListDTO.setCreateBy(-1L);
                            resultList.add(extZcRiskListDTO);
                        }
                        extWlZcRiskListService.batchInsertResults(resultList);
                    }
                    interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
                    interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_1.getValue());
                } else {
                    ExtWlZcMixedRiskInfoDTO dto = new ExtWlZcMixedRiskInfoDTO();
                    dto.setErrorCode(requestMes.getErrorCode());
                    dto.setMessage(requestMes.getMessage());
                    dto.setIntoId(intoId);
                    dto.setCardId(idNo);
                    dto.setCustName(name);

                    this.insertExtWlZcMixedRiskInfo(dto);

                    interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_5.getKey());
                    interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_5.getValue());
                }
            }
            
        } catch (Exception ex) {
            JYLoggerUtil.error(this.getClass(), "===致诚查询反欺诈信息接口异常===接口交易流水号:"+interfaceLogDto.getReqTransNo(), ex);
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

}

