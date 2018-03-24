package com.jy.modules.externalplatform.interfacerepository.xy.extwlxyoverdue.service;
import java.io.Serializable;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.jy.modules.externalplatform.interfacerepository.qhzx.extwlqhzxriskdootip.service.ExtWlQhzxRiskdooTipService;
import com.jy.modules.externalplatform.interfacerepository.xy.extwlxyoverdue.dao.ExtWlXyOverdueDao;
import com.jy.modules.externalplatform.interfacerepository.xy.extwlxyoverdue.dto.ExtWlXyOverdueDTO;
import com.jy.modules.externalplatform.interfacerepository.xy.extwlxyoverduedetail.dto.ExtWlXyOverdueDetailDTO;
import com.jy.modules.externalplatform.interfacerepository.xy.extwlxyoverduedetail.service.ExtWlXyOverdueDetailService;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcqueryinfo.dto.RequestMesDto;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.BaseDTO;
import com.jy.platform.core.common.JYLoggerUtil;

/**
 * @classname: ExtWlXyOverdueService
 * @description: 定义  新颜逾期信息表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.xy.extwlxyoverdue.service.ExtWlXyOverdueService")
public class ExtWlXyOverdueService implements Serializable, ExtSaveMessageDao {

    private static final long serialVersionUID = 1L;
    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    static Logger logger = LoggerFactory.getLogger(ExtWlXyOverdueService.class);

    @Autowired
    ExtInterfaceLogService extInterfaceLogService;

	@Autowired
	private ExtWlXyOverdueDao dao;

	@Autowired
    private ExtWlXyOverdueDetailService extWlXyOverdueDetailService;
    
	/**
     * @author Administrator
     * @description: 分页查询 新颜逾期信息表列表
     * @date 2017-12-12 16:16:58
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlXyOverdueDTO> searchExtWlXyOverdueByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlXyOverdueDTO> dataList =  dao.searchExtWlXyOverdueByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询新颜逾期信息表列表
     * @date 2017-12-12 16:16:58
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlXyOverdueDTO> searchExtWlXyOverdue(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlXyOverdueDTO> dataList = dao.searchExtWlXyOverdue(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询新颜逾期信息表对象
     * @date 2017-12-12 16:16:58
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlXyOverdueDTO queryExtWlXyOverdueByPrimaryKey(String id) throws Exception {
		
		ExtWlXyOverdueDTO dto = dao.findExtWlXyOverdueByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlXyOverdueDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlXyOverdue
     * @author Administrator
     * @description: 新增 新颜逾期信息表对象
     * @date 2017-12-12 16:16:58
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlXyOverdue(ExtWlXyOverdueDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlXyOverdue(paramMap);
		
		ExtWlXyOverdueDTO resultDto = (ExtWlXyOverdueDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlXyOverdue
     * @author Administrator
     * @description: 修改 新颜逾期信息表对象
     * @date 2017-12-12 16:16:58
     * @param dto
     * @return
     * @throws
     */
	public void updateExtWlXyOverdue(ExtWlXyOverdueDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlXyOverdue(paramMap);
	}
	/**
     * @title: deleteExtWlXyOverdueByPrimaryKey
     * @author Administrator
     * @description: 删除 新颜逾期信息表,按主键
     * @date 2017-12-12 16:16:58
     * @param baseDto, ids
     * @throws
     */ 
	public void deleteExtWlXyOverdueByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlXyOverdueByPrimaryKey(paramMap);
	}
	/**
     * @title: saveMessage
     * @author dongkangning
     * @description: 新颜逾期档案外联平台数据落地
     * @date 2017-12-12 16:16:58
     * @param map
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

            String intoCustomerRefId  = "";
            if(null != map.get("intoCustomerRefId"))
                intoCustomerRefId = String.valueOf(map.get("intoCustomerRefId"));
        
            if(StringUtils.isEmpty(result)){
                interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
                interfaceLogDto.setRetMsg("新颜逾期档案接口业务接口返回报文为空！");
            }else if(result.contains("Read timed out")){
                interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
                interfaceLogDto.setRetMsg("新颜逾期档案接口业务接口 访问超时！");
            }else{
                
                ExtWlXyOverdueDTO overdueDTO = new ExtWlXyOverdueDTO();
                if(StringUtils.isNotEmpty(intoCustomerRefId))
                    overdueDTO.setIntoCustRefId(Long.parseLong(intoCustomerRefId));
                
                Map resultMap = JSON.parseObject(result); 
                boolean success = (Boolean) resultMap.get("success");
                if(success){//成功
                    isSuccess = "1";//设置成功
                    
                    Map dataMap = (Map) resultMap.get("data");
                    
                    //以下项目信息项都是约定有值
                    String code = (String) dataMap.get("code");//查询结果码
                    String desc = (String) dataMap.get("desc");//查询结果描述
                    String transId = (String) dataMap.get("trans_id");//商户订单号
                    String tradeNo = (String) dataMap.get("trade_no");//交易流⽔号
                    String fee = (String) dataMap.get("fee"); //是否收费
                    String idNo = (String) dataMap.get("id_no");//被查询⼈身份证号
                    String idName = (String) dataMap.get("id_name");//被查询⼈姓名
                    
                    //设置返回码和返回信息
                    retCode = code;
                    retMsg = desc;
                    
                    //设置到 对象DTO中
                    overdueDTO.setCode(code);
                    overdueDTO.setRetDesc(desc);
                    overdueDTO.setTransId(transId);
                    overdueDTO.setTradeNo(tradeNo);
                    overdueDTO.setFee(fee);
                    overdueDTO.setIdNo(idNo);
                    overdueDTO.setIdName(idName);
                    overdueDTO.setCreateBy(-1L);
                    
                    if(null != code && "0".equals(code)){//查询成功，有结果
                        if(null != dataMap.get("member_count")) //逾期机构数
                            overdueDTO.setMemberCount((String)dataMap.get("member_count"));
                        if(null != dataMap.get("order_count")) //逾期订单数
                            overdueDTO.setOrderCount((String)dataMap.get("order_count"));
                        if(null != dataMap.get("debt_amount")) //负债金额
                            overdueDTO.setDebtAmount((String)dataMap.get("debt_amount"));

                        Long keyId = this.insertExtWlXyOverdue(overdueDTO);
                        if(null != keyId)
                            fkBizId = keyId.toString();
                        
                        
                        List details = (List)dataMap.get("details");
                        if(null != details && details.size() > 0){
                            for(int i = 0; i < details.size(); i ++){
                                
                                ExtWlXyOverdueDetailDTO detailDto = new ExtWlXyOverdueDetailDTO();
                                detailDto.setFkId(keyId);
                                detailDto.setCreateBy(-1L);
                                
                                Map detailMap = (Map)details.get(i);
                                
                                if(null != detailMap.get("date")){
                                    detailDto.setOverdueDate((String)detailMap.get("date"));
                                }
                                if(null != detailMap.get("count")){
                                    detailDto.setOverdueCount((String)detailMap.get("count"));
                                }
                                if(null != detailMap.get("amount")){
                                    detailDto.setAmount((String)detailMap.get("amount"));
                                }
                                if(null != detailMap.get("settlement")){
                                    detailDto.setSettlement((String)detailMap.get("settlement"));
                                }
                                
                                extWlXyOverdueDetailService.insertExtWlXyOverdueDetail(detailDto);
                            }
                        }
                    }else{
                        logger.info("新颜逾期档案返回信息" + desc);
                    }

                    interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
                    interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_1.getValue());
                    
                }else{

                    interfaceLogDto.setRetCode((String) resultMap.get("errorCode"));
                    interfaceLogDto.setRetMsg((String) resultMap.get("errorMsg"));
                    logger.info("新颜逾期档案查询失败：" + (String) resultMap.get("errorMsg"));
                }
                
            
                
               
            }
            
        } catch (Exception ex) {
            JYLoggerUtil.error(this.getClass(), "===新颜逾期档案接口业务接口异常===接口交易流水号:"+interfaceLogDto.getReqTransNo(), ex);
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
                JYLoggerUtil.error(this.getClass(), "===保存新颜逾期档案信息日志异常===接口交易流水号:"+interfaceLogDto.getReqTransNo(), e);
            }
        }
    }

}

