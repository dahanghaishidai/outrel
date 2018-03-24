package com.jy.modules.externalplatform.interfacerepository.qhzx.extwlqhzxriskdootip.service;
import java.io.Serializable;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;
import com.jy.platform.core.common.JYLoggerUtil;
import com.jy.modules.common.util.JsonTool;
import com.jy.modules.externalplatform.interfacerepository.qhzx.extwlqhzxriskdoodetail.dto.ExtWlQhzxRiskdooDetailDTO;
import com.jy.modules.externalplatform.interfacerepository.qhzx.extwlqhzxriskdoodetail.service.ExtWlQhzxRiskdooDetailService;
import com.jy.modules.externalplatform.interfacerepository.qhzx.extwlqhzxriskdootip.dto.ExtWlQhzxRiskdooTipDTO;
import com.jy.modules.externalplatform.interfacerepository.qhzx.extwlqhzxriskdootip.dao.ExtWlQhzxRiskdooTipDao;
import com.jy.modules.externalplatform.interfacerepository.yszx.extyszxreportinfo.dto.ExtYszxReportInfoDTO;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;

import freemarker.template.utility.StringUtil;

/**
 * @classname: ExtWlQhzxRiskdooTipService
 * @description: 定义  前海征信风险度提示表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.qhzx.extwlqhzxriskdootip.service.ExtWlQhzxRiskdooTipService")
public class ExtWlQhzxRiskdooTipService implements Serializable, ExtSaveMessageDao {

    private static final long serialVersionUID = 1L;
    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    static Logger logger = LoggerFactory.getLogger(ExtWlQhzxRiskdooTipService.class);
    
	@Autowired
	private ExtWlQhzxRiskdooTipDao dao;

    @Autowired
    ExtInterfaceLogService extInterfaceLogService;

    @Autowired
    ExtWlQhzxRiskdooDetailService  riskdooDetailService; 
    
	/**
     * @author Administrator
     * @description: 分页查询 前海征信风险度提示表列表
     * @date 2017-12-06 16:03:13
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlQhzxRiskdooTipDTO> searchExtWlQhzxRiskdooTipByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlQhzxRiskdooTipDTO> dataList =  dao.searchExtWlQhzxRiskdooTipByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询前海征信风险度提示表列表
     * @date 2017-12-06 16:03:13
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlQhzxRiskdooTipDTO> searchExtWlQhzxRiskdooTip(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlQhzxRiskdooTipDTO> dataList = dao.searchExtWlQhzxRiskdooTip(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询前海征信风险度提示表对象
     * @date 2017-12-06 16:03:13
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlQhzxRiskdooTipDTO queryExtWlQhzxRiskdooTipByPrimaryKey(String id) throws Exception {
		
		ExtWlQhzxRiskdooTipDTO dto = dao.findExtWlQhzxRiskdooTipByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlQhzxRiskdooTipDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlQhzxRiskdooTip
     * @author Administrator
     * @description: 新增 前海征信风险度提示表对象
     * @date 2017-12-06 16:03:13
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlQhzxRiskdooTip(ExtWlQhzxRiskdooTipDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlQhzxRiskdooTip(paramMap);
		
		ExtWlQhzxRiskdooTipDTO resultDto = (ExtWlQhzxRiskdooTipDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlQhzxRiskdooTip
     * @author Administrator
     * @description: 修改 前海征信风险度提示表对象
     * @date 2017-12-06 16:03:13
     * @param dto
     * @return
     * @throws
     */
	public void updateExtWlQhzxRiskdooTip(ExtWlQhzxRiskdooTipDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlQhzxRiskdooTip(paramMap);
	}
	/**
     * @title: deleteExtWlQhzxRiskdooTipByPrimaryKey
     * @author Administrator
     * @description: 删除 前海征信风险度提示表,按主键
     * @date 2017-12-06 16:03:13
     * @param baseDto,ids
     * @throws
     */ 
	public void deleteExtWlQhzxRiskdooTipByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlQhzxRiskdooTipByPrimaryKey(paramMap);
	}
	
	/**
	 * 前海征信风险度提示 接口数据落地
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

        Map<String, Object> paramsMap=new HashMap<String,Object>();
        
        try {
            String intoId = "";
            if(null != map.get("intoId"))
                intoId = (String)map.get("intoId");
            String cardId = (String)map.get("idNo");//接口入参必传参数
            String custName = (String)map.get("name");//接口入参必传参数
            String mobileNos = (String)map.get("mobileNos");//接口入参参数，可以是空串，但肯定有
            String bankAccount = (String)map.get("cardNos");//接口入参参数，可以是空串，但肯定有
            String reqMsg = "";
            try {
                reqMsg = makeupRiskdooTipReport(map);//组装请求报文
            }
            catch (Exception e) {
                logger.error(e.getMessage());
            }
            
            
            ExtWlQhzxRiskdooTipDTO riskdooTipDTO = new ExtWlQhzxRiskdooTipDTO();
            if(StringUtils.isEmpty(result)){
                interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
                interfaceLogDto.setRetMsg("前海征信风险度提示查询接口返回报文为空！");
            }else if(result.contains("Read timed out")){
                interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
                interfaceLogDto.setRetMsg("前海征信风险度提示查询接口 访问超时！");
            }else{
                JSONObject jsonObject=JSONObject.fromObject(result);
                JSONObject header = jsonObject.getJSONObject("header");
                String rtCode = String.valueOf(header.get("rtCode"));
                retCode = rtCode;
                if(null != header.get("rtMsg"))
                    retMsg =  header.get("rtMsg").toString();
                isSuccess = "1";
                //保存 前海征信风险度提示主表信息
                if(StringUtils.isNotEmpty(intoId))
                    riskdooTipDTO.setFkIntoAppId(Long.valueOf(intoId));
                riskdooTipDTO.setCardId(cardId);
                riskdooTipDTO.setCardType("0");
                riskdooTipDTO.setCustName(custName);
                riskdooTipDTO.setReasonCode("01");
                riskdooTipDTO.setBankAccount(bankAccount);
                riskdooTipDTO.setMobileNo(mobileNos);
                riskdooTipDTO.setReqMsg(reqMsg);
                riskdooTipDTO.setRespMsg(result);
                riskdooTipDTO.setTransNo(String.valueOf(header.get("transNo")));
                riskdooTipDTO.setTransDate(String.valueOf(header.get("transDate")));
                riskdooTipDTO.setRtCode(rtCode);
                paramsMap.put("dto",riskdooTipDTO); 
                dao.insertExtWlQhzxRiskdooTip(paramsMap);
                Long fkRiskdooId = riskdooTipDTO.getId();
                if(null != fkRiskdooId)
                    fkBizId = fkRiskdooId.toString();
                //交易成功，保存  前海征信风险度提示明细信息
                if("E000000".equals(rtCode)){
                     JSONObject busiDataJson = jsonObject.getJSONObject("busiDataInfo");
                     if(JsonTool.isJSONObjectNotEmpty(busiDataJson)){
                         JSONArray recordsJsons = busiDataJson.getJSONArray("records");
                         if(JsonTool.isJSONArrayNotEmpty(recordsJsons)){
                              List<ExtWlQhzxRiskdooDetailDTO> recordsList = JSONArray.toList(recordsJsons, ExtWlQhzxRiskdooDetailDTO.class);
                              if(CollectionUtils.isNotEmpty(recordsList)){
                                  riskdooDetailService.insertExtWlQhzxRiskdooDetailList(recordsList, fkRiskdooId);
                              }
                         }
                     }
                }
                interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
                interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_1.getValue());
            }
        } catch (Exception ex) {
            JYLoggerUtil.error(this.getClass(), "===前海征信风险度提示查询接口异常===接口交易流水号:"+interfaceLogDto.getReqTransNo(), ex);
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
                JYLoggerUtil.error(this.getClass(), "===保存前海征信风险度提示信息日志异常===接口交易流水号:"+interfaceLogDto.getReqTransNo(), e);
            }
        }
    }
    /**
     * 将原来的前海征信请求报文重组
	* @title: makeupRiskdooTipReport
	* @author: dongkangning
	* @description:
	* @date 2017年12月6日 下午4:35:04
	* @param map
	* @return
	* @throws
     */
    public String makeupRiskdooTipReport(Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        Map resultMap = new HashMap();
        try {
            
            Map headerMap = new HashMap();
            Map busiDataInfoMap = new HashMap();
            
            headerMap.put("transNo", map.get("transNo"));
            headerMap.put("transDate", map.get("transDate"));
            headerMap.put("authDate", map.get("authDate"));
            
            List records = new ArrayList();
            Map record = new HashMap();
            record.put("idNo", map.get("idNo"));
            record.put("idType", map.get("idType"));
            record.put("ips", "");
            record.put("name", map.get("name"));
            record.put("mobileNos", map.get("mobileNos"));
            record.put("cardNos", map.get("cardNos"));
            record.put("reasonCode", map.get("reasonCode"));
            record.put("seqNo", map.get("seqNo"));
            record.put("entityAuthCode", "P2P0643XX");
            record.put("idType", map.get("idType"));
            record.put("entityAuthDate", "entityAuthDate");
            records.add(record);
            
            busiDataInfoMap.put("batchNo", map.get("batchNo"));
            busiDataInfoMap.put("records", records);

            
            resultMap.put("header", headerMap);
            resultMap.put("busiDataInfo",busiDataInfoMap);
            
        } catch (Exception e) {
            logger.error("组装<前海征信风险度提示信息>请求报文(外联平台匹配数据库字段落表用，请求不用该报文，无需关注)异常:", e);
        }
        return JSONObject.fromObject(resultMap).toString();
    }
}

