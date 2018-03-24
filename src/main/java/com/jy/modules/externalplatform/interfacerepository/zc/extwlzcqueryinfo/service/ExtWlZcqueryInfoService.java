package com.jy.modules.externalplatform.interfacerepository.zc.extwlzcqueryinfo.service;
import java.io.Serializable;
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
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcloanrecords.service.ExtWlZcLoanRecordsService;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcqueryhistory.dto.ExtWlZcQueryHistoryDTO;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcqueryhistory.service.ExtWlZcQueryHistoryService;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcqueryinfo.dto.ExtWlZcqueryInfoDTO;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcqueryinfo.dto.RequestMes2Dto;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcqueryinfo.dto.RequestMesDto;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcqueryinfo.dao.ExtWlZcqueryInfoDao;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcriskresults.dto.ExtWlZcRiskResultsDTO;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcriskresults.service.ExtWlZcRiskResultsService;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcstatistics.dto.ExtWlZcStatisticsDTO;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcstatistics.service.ExtWlZcStatisticsService;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;

/**
 * @classname: ExtWlZcqueryInfoService
 * @description: 定义  致诚查询贷款信息主表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.zc.extwlzcqueryinfo.service.ExtWlZcqueryInfoService")
public class ExtWlZcqueryInfoService implements Serializable, ExtSaveMessageDao {

    private static final long serialVersionUID = 1L;
    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    static Logger logger = LoggerFactory.getLogger(ExtWlQhzxRiskdooTipService.class);
    
    @Autowired
    ExtInterfaceLogService extInterfaceLogService;

    @Autowired
    private ExtWlZcStatisticsService extWlZcStatisticsService;

    @Autowired
    private ExtWlZcQueryHistoryService extWlZcQueryHistoryService;

    @Autowired
    private ExtWlZcLoanRecordsService extWlZcLoanRecordsService;

    @Autowired
    private ExtWlZcRiskResultsService extWlZcRiskResultsService;
    
	@Autowired
	private ExtWlZcqueryInfoDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 致诚查询贷款信息主表列表
     * @date 2017-12-07 13:40:03
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlZcqueryInfoDTO> searchExtWlZcqueryInfoByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlZcqueryInfoDTO> dataList =  dao.searchExtWlZcqueryInfoByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询致诚查询贷款信息主表列表
     * @date 2017-12-07 13:40:03
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlZcqueryInfoDTO> searchExtWlZcqueryInfo(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlZcqueryInfoDTO> dataList = dao.searchExtWlZcqueryInfo(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询致诚查询贷款信息主表对象
     * @date 2017-12-07 13:40:03
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlZcqueryInfoDTO queryExtWlZcqueryInfoByPrimaryKey(String id) throws Exception {
		
		ExtWlZcqueryInfoDTO dto = dao.findExtWlZcqueryInfoByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlZcqueryInfoDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlZcqueryInfo
     * @author Administrator
     * @description: 新增 致诚查询贷款信息主表对象
     * @date 2017-12-07 13:40:03
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlZcqueryInfo(ExtWlZcqueryInfoDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlZcqueryInfo(paramMap);
		
		ExtWlZcqueryInfoDTO resultDto = (ExtWlZcqueryInfoDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlZcqueryInfo
     * @author Administrator
     * @description: 修改 致诚查询贷款信息主表对象
     * @date 2017-12-07 13:40:03
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlZcqueryInfo(ExtWlZcqueryInfoDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlZcqueryInfo(paramMap);
	}
	/**
     * @title: deleteExtWlZcqueryInfoByPrimaryKey
     * @author Administrator
     * @description: 删除 致诚查询贷款信息主表,按主键
     * @date 2017-12-07 13:40:03
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlZcqueryInfoByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlZcqueryInfoByPrimaryKey(paramMap);
	}
	
    /**
     * @title: saveMessage
     * @author: dongkangning
     * @description: 查询致诚阿福信息接口业务(福网) 外联平台数据落地
     * @date 2017年12月7日 下午2:27:09
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
            RequestMesDto requestMes=new RequestMesDto(); 
            
            String intoId = "";
            if(null != map.get("intoId"))
                intoId = (String)map.get("intoId");
            String idNo = (String)map.get("idNo");//接口入参必传参数
            String name = (String)map.get("name");//接口入参必传参数
        
            if(StringUtils.isEmpty(result)){
                interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
                interfaceLogDto.setRetMsg("查询致诚阿福信息接口业务接口返回报文为空！");
            }else if(result.contains("Read timed out")){
                interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
                interfaceLogDto.setRetMsg("查询致诚阿福信息接口业务接口 访问超时！");
            }else{
               
                requestMes=JSON.parseObject(result, RequestMesDto.class);
                retCode = requestMes.getErrorCode();
                retMsg = requestMes.getMessage();
                if(ARIConstant.ERROR_CODE_SUC.equals(requestMes.getErrorCode())){
                    isSuccess = "1";
                    //1、保存主表信息
                    RequestMes2Dto requestMes2=requestMes.getParams();
                    ExtWlZcqueryInfoDTO dto = requestMes2.getData();
                    dto.setErrorCode(requestMes.getErrorCode());
                    dto.setMessage(requestMes.getMessage());
                    dto.setIntoId(intoId);
                    dto.setCardId(idNo);
                    dto.setCustName(name);
                    Long keyId=this.insertExtWlZcqueryInfo(dto);
                    if(null != keyId){
                        fkBizId = keyId.toString();
                    }
                    //2、保存查询统计次数信息
                    ExtWlZcStatisticsDTO extWlZcStatisticsDTO = dto.getQueryStatistics();
                    extWlZcStatisticsDTO.setKeyId(keyId.toString());
                    extWlZcStatisticsService.insertExtWlZcStatistics(extWlZcStatisticsDTO);
                    //3、保存查询历史信息
                    List<ExtWlZcQueryHistoryDTO> historyList=new ArrayList<ExtWlZcQueryHistoryDTO>();
                    ExtWlZcQueryHistoryDTO[] historys = dto.getQueryHistory();
                    if(historys!=null && historys.length>0){
                        for(ExtWlZcQueryHistoryDTO extWlZcQueryHistoryDTO : historys){
                            extWlZcQueryHistoryDTO.setKeyId(keyId.toString());
                            historyList.add(extWlZcQueryHistoryDTO);
                        }
                        extWlZcQueryHistoryService.batchInsertHistory(historyList);
                    }               
                    //4、保存借款记录信息
                    List<ExtWlZcLoanRecordsDTO> loanRecordsList = new ArrayList<ExtWlZcLoanRecordsDTO>();
                    ExtWlZcLoanRecordsDTO[] loanRecords = dto.getLoanRecords();
                    if(loanRecords != null && loanRecords.length > 0){
                        for(ExtWlZcLoanRecordsDTO extWlZcLoanRecordsDTO : loanRecords){
                            extWlZcLoanRecordsDTO.setKeyId(keyId.toString());
                            loanRecordsList.add(extWlZcLoanRecordsDTO);
                        }
                        extWlZcLoanRecordsService.batchInsertLoanRecords(loanRecordsList);
                    }
                    //5、保存风险项记录信息
                    List<ExtWlZcRiskResultsDTO> riskResultsList = new ArrayList<ExtWlZcRiskResultsDTO>();
                    ExtWlZcRiskResultsDTO[] riskResults = dto.getRiskResults();
                    if(riskResults != null && riskResults.length > 0){
                        for(ExtWlZcRiskResultsDTO extWlZcRiskResultsDTO :riskResults){
                            extWlZcRiskResultsDTO.setKeyId(keyId.toString());
                            riskResultsList.add(extWlZcRiskResultsDTO);
                        }
                        extWlZcRiskResultsService.batchInsertRiskResults(riskResultsList);
                    }
                    interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
                    interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_1.getValue());
                }else{
                    ExtWlZcqueryInfoDTO dto=new ExtWlZcqueryInfoDTO();
                    dto.setErrorCode(requestMes.getErrorCode());
                    dto.setMessage(requestMes.getMessage());
                    this.insertExtWlZcqueryInfo(dto);
                    
                    interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_5.getKey());
                    interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_5.getValue());
                }
            }
            
        } catch (Exception ex) {
            JYLoggerUtil.error(this.getClass(), "===查询致诚阿福信息接口业务接口异常===接口交易流水号:"+interfaceLogDto.getReqTransNo(), ex);
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
                JYLoggerUtil.error(this.getClass(), "===保存致诚阿福信息日志异常===接口交易流水号:"+interfaceLogDto.getReqTransNo(), e);
            }
        }
    }

}

