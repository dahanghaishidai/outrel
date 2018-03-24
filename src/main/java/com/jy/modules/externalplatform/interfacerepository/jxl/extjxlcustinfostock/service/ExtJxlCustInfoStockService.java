package com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcustinfostock.service;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcallinfostock.dto.ExtJxlCallInfoStockDTO;
import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcallinfostock.service.ExtJxlCallInfoStockService;
import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcellbehaviorstock.dto.ExtJxlCellBehaviorStockDTO;
import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcellbehaviorstock.service.ExtJxlCellBehaviorStockService;
import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcheckinfostock.dto.ExtJxlCheckInfoStockDTO;
import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcheckinfostock.service.ExtJxlCheckInfoStockService;
import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcontactinfostock.dto.ExtJxlContactInfoStockDTO;
import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcontactinfostock.service.ExtJxlContactInfoStockService;
import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcontactliststock.dto.ExtJxlContactListStockDTO;
import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcontactliststock.service.ExtJxlContactListStockService;
import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcontactregionstock.dto.ExtJxlContactRegionStockDTO;
import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcontactregionstock.service.ExtJxlContactRegionStockService;
import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcustinfostock.dao.ExtJxlCustInfoStockDao;
import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcustinfostock.dto.ExtJxlCustInfoStockDTO;
import com.jy.modules.externalplatform.interfacerepository.jxl.extjxldatasourcestock.dto.ExtJxlDataSourceStockDTO;
import com.jy.modules.externalplatform.interfacerepository.jxl.extjxldatasourcestock.service.ExtJxlDataSourceStockService;
import com.jy.modules.externalplatform.interfacerepository.jxl.extjxldeliveraddressstock.dto.ExtJxlDeliverAddressStockDTO;
import com.jy.modules.externalplatform.interfacerepository.jxl.extjxldeliveraddressstock.service.ExtJxlDeliverAddressStockService;
import com.jy.modules.externalplatform.interfacerepository.jxl.extjxldemandsinfostock.dto.ExtJxlDemandsInfoStockDTO;
import com.jy.modules.externalplatform.interfacerepository.jxl.extjxldemandsinfostock.service.ExtJxlDemandsInfoStockService;
import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlebusiexpstock.dto.ExtJxlEbusiExpStockDTO;
import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlebusiexpstock.service.ExtJxlEbusiExpStockService;
import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlreceiverstock.dto.ExtJxlReceiverStockDTO;
import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlreceiverstock.service.ExtJxlReceiverStockService;
import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlrecentneedstock.dto.ExtJxlRecentNeedStockDTO;
import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlrecentneedstock.service.ExtJxlRecentNeedStockService;
import com.jy.modules.externalplatform.interfacerepository.jxl.extjxltripinfostock.dto.ExtJxlTripInfoStockDTO;
import com.jy.modules.externalplatform.interfacerepository.jxl.extjxltripinfostock.service.ExtJxlTripInfoStockService;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.BaseDTO;
import com.jy.platform.core.common.JYLoggerUtil;

/**
 * @classname: ExtJxlCustInfoStockService
 * @description: 定义  申请人信息 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcustinfostock.service.ExtJxlCustInfoStockService")
public class ExtJxlCustInfoStockService implements ExtSaveMessageDao {
	private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	
	@Autowired
	ExtInterfaceLogService extInterfaceLogService;
    
	@Autowired
	private ExtJxlCustInfoStockDao dao;

	@Autowired
    private ExtJxlCallInfoStockService extJxlCallInfoStockService;
    
    @Autowired
    private ExtJxlCellBehaviorStockService extJxlCellBehaviorStockService;
    
    @Autowired
    private ExtJxlCheckInfoStockService extJxlCheckInfoStockService;
    
    @Autowired
    private ExtJxlContactInfoStockService extJxlContactInfoStockService;
    
    @Autowired
    private ExtJxlContactListStockService extJxlContactListStockService;
    
    @Autowired
    private ExtJxlContactRegionStockService extJxlContactRegionStockService;
    
    @Autowired
    private ExtJxlDataSourceStockService extJxlDataSourceStockService;
    
    @Autowired
    private ExtJxlDeliverAddressStockService extJxlDeliverAddressStockService;
    
    @Autowired
    private ExtJxlDemandsInfoStockService extJxlDemandsInfoStockService;
    
    @Autowired
    private ExtJxlEbusiExpStockService extJxlEbusiExpStockService;
    
    @Autowired
    private ExtJxlReceiverStockService extJxlReceiverStockService;
    
    @Autowired
    private ExtJxlRecentNeedStockService extJxlRecentNeedStockService;
    
    @Autowired
    private ExtJxlTripInfoStockService extJxlTripInfoStockService;
    
	/**
     * @author Administrator
     * @description: 分页查询 申请人信息列表
     * @date 2017-06-01 16:23:38
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtJxlCustInfoStockDTO> searchExtJxlCustInfoStockByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtJxlCustInfoStockDTO> dataList =  dao.searchExtJxlCustInfoStockByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询申请人信息列表
     * @date 2017-06-01 16:23:38
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtJxlCustInfoStockDTO> searchExtJxlCustInfoStock(Map<String,Object> searchParams) throws Exception {
	    List<ExtJxlCustInfoStockDTO> dataList = dao.searchExtJxlCustInfoStock(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询申请人信息对象
     * @date 2017-06-01 16:23:38
     * @param id
     * @return
     * @throws
     */ 
	public ExtJxlCustInfoStockDTO queryExtJxlCustInfoStockByPrimaryKey(String id) throws Exception {
		
		ExtJxlCustInfoStockDTO dto = dao.findExtJxlCustInfoStockByPrimaryKey(id);
		
		if(dto == null) dto = new ExtJxlCustInfoStockDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtJxlCustInfoStock
     * @author Administrator
     * @description: 新增 申请人信息对象
     * @date 2017-06-01 16:23:38
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtJxlCustInfoStock(ExtJxlCustInfoStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtJxlCustInfoStock(paramMap);
		
		ExtJxlCustInfoStockDTO resultDto = (ExtJxlCustInfoStockDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtJxlCustInfoStock
     * @author Administrator
     * @description: 修改 申请人信息对象
     * @date 2017-06-01 16:23:38
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtJxlCustInfoStock(ExtJxlCustInfoStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtJxlCustInfoStock(paramMap);
	}
	/**
     * @title: deleteExtJxlCustInfoStockByPrimaryKey
     * @author Administrator
     * @description: 删除 申请人信息,按主键
     * @date 2017-06-01 16:23:38
     * @param paramMap
     * @throws
     */ 
	public void deleteExtJxlCustInfoStockByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtJxlCustInfoStockByPrimaryKey(paramMap);
	}

	/**
	 * 接受数据保存
	 * @param map
	 * @throws Exception 
	 */
	public void saveMessage(Map<String,Object> map){
		//日志信息
		ExtInterfaceLogDTO interfaceLogDto=(ExtInterfaceLogDTO) map.get("interfaceLogDto");
		String results=String.valueOf(map.get("result"));
		ExtJxlCustInfoStockDTO dto = new ExtJxlCustInfoStockDTO();
		 dto.setProdCode(String.valueOf(map.get("prod")));
		 dto.setOrgCode(String.valueOf(map.get("org")));
		 dto.setSysCode(String.valueOf(map.get("sysCode")));
		try {
			if(StringUtils.isNotEmpty((CharSequence) map.get("result")) && !"null".equals(map.get("result"))) {
				JSONObject jsonObject = JSONObject.fromObject(map.get("result"));
				if(null!=jsonObject.get("retCode") && jsonObject.get("retCode").equals("500")){
					 Map<String, Object> personalParams2=new HashMap<String,Object>();;
					 dto.setRetcode(InterfaceEnum.RET_CODE_6.getKey());
					 dto.setErrormsg(String.valueOf(jsonObject.get("errorDesc")));
					 dto.setRemark(String.valueOf(jsonObject.get("errorDesc")));
					 interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_6.getKey());
					 interfaceLogDto.setRetMsg(String.valueOf(jsonObject.get("errorDesc")));
					 personalParams2.put("dto", dto);
					 dao.insertExtJxlCustInfoStock(personalParams2);
					 personalParams2.clear();
				 }else{
					if(jsonObject.getString("success").equals("true")) {
						JSONObject reportData = jsonObject.getJSONObject("report_data");
						//保存申请人信息
						dto = saveExtJxlCustInfo(reportData,map,interfaceLogDto);
						//保存数据源信息
						saveExtJxlDataSource(reportData, dto);
						//保存数据检查项信息
						saveExtJxlCheckInfo(reportData, dto);
						//保存联系人区域汇总信息
						saveExtJxlContactRegion(reportData, dto);
						//保存运营商联系人列表信息
						saveExtJxlContactList(reportData, dto);
						//保存送货地址列表信息
						saveExtJxlDeliverAddress(reportData, dto);
						//保存电商月消费列表信息
						saveExtJxlEbusinessExpense(reportData, dto);
						//保存通话行为分析
						saveCellBehavior(reportData, dto);
						//保存近期需求信息
						saveExtJxlRecentNeed(reportData, dto);
						//保存联系人信息
						saveExtJxlContactInfo(reportData, dto);
						//保存出行分析信息
						saveExtJxlTripInfo(reportData, dto);						
					}else{
						dto.setRetcode(InterfaceEnum.RET_CODE_2.getKey());
						dto.setRemark("聚信立接口查无！");
						dto.setErrormsg("聚信立接口查无！");
				    	interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_2.getKey());
						interfaceLogDto.setRetMsg("聚信立接口查无！");
				    	this.insertExtJxlCustInfoStock(dto);
					}
				 }
			}else{
				Map<String, Object> paramMap = new HashMap<String, Object>();
				dto.setRetcode(InterfaceEnum.RET_CODE_3.getKey());
				dto.setErrormsg("聚信立查询接口调用报错");
				dto.setRemark("聚信立查询接口调用报错");
				 interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				 interfaceLogDto.setRetMsg("聚信立查询接口调用报错！");
				 paramMap.put("dto", dto);
				 dao.insertExtJxlCustInfoStock(paramMap);
			}
		} catch (Exception ex) {
		     JYLoggerUtil.error(this.getClass(), "===聚信立查询接口异常===进件日志ID:"+String.valueOf(map.get("interfaceId")),ex);
		     Map<String, Object> paramMap = new HashMap<String, Object>();
			 String msg = ex.getMessage();
			 if(StringUtil.isNotEmpty(msg)){
				 if(msg.contains("A JSONObject text must begin with '{' at character 1 of")){
					 dto.setRetcode(InterfaceEnum.RET_CODE_3.getKey());
					 dto.setErrormsg("聚信立查询接口调用报错");
					 dto.setRemark("聚信立查询接口异常请求返回，请联系IT解决");
					 interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
					 interfaceLogDto.setRetMsg("聚信立查询接口异常请求返回，请联系IT解决");
				 }else if(msg.length() > 2000){
					 dto.setRetcode(InterfaceEnum.RET_CODE_4.getKey());
					 dto.setErrormsg("聚信立查询接口调用报错");
					 dto.setRemark("聚信立查询接口异常:"+msg.substring(0,2000)); 
					 interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4.getKey());
					 interfaceLogDto.setRetMsg("聚信立查询接口调用报错:"+msg.substring(0,2000));
				 }else{
					 dto.setRetcode(InterfaceEnum.RET_CODE_4.getKey());
					 dto.setErrormsg("聚信立查询接口返回信息解析出错");
					 dto.setRemark("聚信立查询接口异常:"+msg);
					 interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4.getKey());
					 interfaceLogDto.setRetMsg("聚信立查询接口调用报错:"+msg);
				 }
			  }
			 paramMap.put("dto", dto);
			 dao.insertExtJxlCustInfoStock(paramMap);
		}finally{
			try {
				interfaceLogDto.setRetBody(results);
				Long keyId =extInterfaceLogService.insertExtInterfaceLog(interfaceLogDto);
				dto.setInterfaceId(String.valueOf(keyId));
				this.updateExtJxlCustInfoStock(dto);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	
    /**
     * @author 豆永亮
     * @description: 保存申请人信息
     * @param reportData
     * @param map 
     * @param intoId
     * @param custCode
     * @return
     * @throws Exception
     */
    private ExtJxlCustInfoStockDTO saveExtJxlCustInfo(JSONObject reportData, Map<String, Object> map,ExtInterfaceLogDTO interfaceLogDto) throws Exception {
    	ExtJxlCustInfoStockDTO extJxlCustInfoStockDTO = (ExtJxlCustInfoStockDTO) parseJsonStr(reportData.getJSONObject("person"), ExtJxlCustInfoStockDTO.class);   	
    	extJxlCustInfoStockDTO.setProdCode(String.valueOf(map.get("prod")));
    	extJxlCustInfoStockDTO.setOrgCode(String.valueOf(map.get("org")));
    	extJxlCustInfoStockDTO.setSysCode(String.valueOf(map.get("sysCode")));
    	extJxlCustInfoStockDTO.setRetcode(InterfaceEnum.RET_CODE_1.getKey());
    	extJxlCustInfoStockDTO.setRemark("聚信立接口查有！");
    	interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
		interfaceLogDto.setRetMsg("聚信立接口查有！");
    	extJxlCustInfoStockDTO.setInterfaceId(String.valueOf(map.get("interfaceId")));
    	Long keyId = this.insertExtJxlCustInfoStock(extJxlCustInfoStockDTO);
    	extJxlCustInfoStockDTO.setId(keyId);
    	return extJxlCustInfoStockDTO;
    }
    
    /**
     * @author 豆永亮
     * @description: 保存数据源信息
     * @param reportData
     * @param extJxlCustInfoStockDTO
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	private void saveExtJxlDataSource(JSONObject reportData, ExtJxlCustInfoStockDTO extJxlCustInfoStockDTO) throws Exception {
    	List<ExtJxlDataSourceStockDTO> list = (List<ExtJxlDataSourceStockDTO>) parseJsonStr(reportData, "data_source", ExtJxlDataSourceStockDTO.class);
    	for(ExtJxlDataSourceStockDTO dataSource : list) {
    		dataSource.setFkJxlCustInfoId(extJxlCustInfoStockDTO.getId());
    		extJxlDataSourceStockService.insertExtJxlDataSourceStock(dataSource);
    		extJxlCustInfoStockDTO.setDataSourceMsg(InterfaceEnum.RET_MSG.getKey());
    		this.updateExtJxlCustInfoStock(extJxlCustInfoStockDTO);
    	}
    	
    }
    
    /**
     * @author 豆永亮
     * @description: 保存数据检查项信息
     * @param reportData
     * @param fkJxlCustInfoId
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	private void saveExtJxlCheckInfo(JSONObject reportData, ExtJxlCustInfoStockDTO extJxlCustInfoStockDTO) throws Exception {
    	List<ExtJxlCheckInfoStockDTO> behaviorList = (List<ExtJxlCheckInfoStockDTO>)parseJsonStr(reportData, "behavior_check", ExtJxlCheckInfoStockDTO.class);
    	List<ExtJxlCheckInfoStockDTO> applicationList = (List<ExtJxlCheckInfoStockDTO>)parseJsonStr(reportData, "application_check", ExtJxlCheckInfoStockDTO.class);
    	for(ExtJxlCheckInfoStockDTO check : behaviorList) {
    		check.setFkJxlCustInfoId(extJxlCustInfoStockDTO.getId());
    		check.setIsApplicationBehavior("1");
    		extJxlCheckInfoStockService.insertExtJxlCheckInfoStock(check);
    		extJxlCustInfoStockDTO.setCheckInfoMsg(InterfaceEnum.RET_MSG.getKey());
    		this.updateExtJxlCustInfoStock(extJxlCustInfoStockDTO);
    	}
    	for(ExtJxlCheckInfoStockDTO check : applicationList) {
    		check.setFkJxlCustInfoId(extJxlCustInfoStockDTO.getId());
    		check.setIsApplicationBehavior("0");
    		extJxlCheckInfoStockService.insertExtJxlCheckInfoStock(check);
    		extJxlCustInfoStockDTO.setCheckInfoMsg(InterfaceEnum.RET_MSG.getKey());
    		this.updateExtJxlCustInfoStock(extJxlCustInfoStockDTO);
    	}
    }
    
    /**
     * @author 豆永亮
     * @description: 保存联系人区域汇总信息
     * @param reportData
     * @param fkJxlCustInfoId
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	private void saveExtJxlContactRegion(JSONObject reportData, ExtJxlCustInfoStockDTO extJxlCustInfoStockDTO) throws Exception {
    	List<ExtJxlContactRegionStockDTO> list = (List<ExtJxlContactRegionStockDTO>) parseJsonStr(reportData, "contact_region", ExtJxlContactRegionStockDTO.class);
    	for(ExtJxlContactRegionStockDTO contactRegion : list) {
    		contactRegion.setFkJxlCustInfoId(extJxlCustInfoStockDTO.getId());
    		extJxlContactRegionStockService.insertExtJxlContactRegionStock(contactRegion);
    		extJxlCustInfoStockDTO.setContactRegionMsg(InterfaceEnum.RET_MSG.getKey());
    		this.updateExtJxlCustInfoStock(extJxlCustInfoStockDTO);
    	}
    }
    
    /**
     * @author 豆永亮
     * @description: 保存运营商联系人列表信息
     * @param reportData
     * @param fkJxlCustInfoId
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	private void saveExtJxlContactList(JSONObject reportData, ExtJxlCustInfoStockDTO extJxlCustInfoStockDTO) throws Exception {
    	List<ExtJxlContactListStockDTO> list = (List<ExtJxlContactListStockDTO>) parseJsonStr(reportData, "contact_list", ExtJxlContactListStockDTO.class);
    	for(ExtJxlContactListStockDTO contactList : list) {
    		contactList.setFkJxlCustInfoId(extJxlCustInfoStockDTO.getId());
    		extJxlContactListStockService.insertExtJxlContactListStock(contactList);
    		extJxlCustInfoStockDTO.setContactListMsg(InterfaceEnum.RET_MSG.getKey());
    		this.updateExtJxlCustInfoStock(extJxlCustInfoStockDTO);
    	}
    }
    
    /**
     * @author 豆永亮
     * @description: 保存送货地址列表信息
     * @param reportData
     * @param fkJxlCustInfoId
     * @throws Exception
     */
	private void saveExtJxlDeliverAddress(JSONObject reportData, ExtJxlCustInfoStockDTO extJxlCustInfoStockDTO) throws Exception {
    	JSONArray beanArray = reportData.getJSONArray("deliver_address");
    	for(int i=0;i<beanArray.size();i++){
    		JSONObject beanObj = beanArray.getJSONObject(i);
    		Map<String, Class<?>> classMap = new HashMap<String, Class<?>>();
			classMap.put("receiver", ExtJxlReceiverStockDTO.class);
    		ExtJxlDeliverAddressStockDTO deliverAddress = (ExtJxlDeliverAddressStockDTO) JSONObject.toBean(beanObj, ExtJxlDeliverAddressStockDTO.class, classMap);
    		deliverAddress.setFkJxlCustInfoId(extJxlCustInfoStockDTO.getId());
    		Long fkDeliverAddressId = extJxlDeliverAddressStockService.insertExtJxlDeliverAddressStock(deliverAddress);
    		extJxlCustInfoStockDTO.setDeliverAddressMsg(InterfaceEnum.RET_MSG.getKey());
    		this.updateExtJxlCustInfoStock(extJxlCustInfoStockDTO);
    		//保存收货人列表信息
    		for(ExtJxlReceiverStockDTO receiver : deliverAddress.getReceiver()) {
    			receiver.setFkDeliverAddressId(fkDeliverAddressId);
    			if(receiver.getPhone_num_list() != null && receiver.getPhone_num_list().size() > 0) {
    				String phone_num_list = receiver.getPhone_num_list().toString();
    				receiver.setPhone_num_list1(phone_num_list.substring(1, phone_num_list.length() - 1));
    			}
        		extJxlReceiverStockService.insertExtJxlReceiverStock(receiver);
    		}
    	}
    }
	
	/**
     * @author 豆永亮
     * @description: 保存电商月消费列表信息
     * @param reportData
     * @param fkJxlCustInfoId
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
	private void saveExtJxlEbusinessExpense(JSONObject reportData, ExtJxlCustInfoStockDTO extJxlCustInfoStockDTO) throws Exception {
    	List<ExtJxlEbusiExpStockDTO> list = (List<ExtJxlEbusiExpStockDTO>) parseJsonStr(reportData, "ebusiness_expense", ExtJxlEbusiExpStockDTO.class);
    	for(ExtJxlEbusiExpStockDTO ebusinessExpense : list) {
    		ebusinessExpense.setFkJxlCustInfoId(extJxlCustInfoStockDTO.getId());
    		extJxlEbusiExpStockService.insertExtJxlEbusiExpStock(ebusinessExpense);
    		extJxlCustInfoStockDTO.setEbusinessExpenseMsg(InterfaceEnum.RET_MSG.getKey());
    		this.updateExtJxlCustInfoStock(extJxlCustInfoStockDTO);
    	}
    }
    
    /**
     * 保存通话行为分析
     * @param reportData
     * @param fkJxlCustInfoId
     * @throws Exception
     */
    private void saveCellBehavior(JSONObject reportData, ExtJxlCustInfoStockDTO extJxlCustInfoStockDTO) throws Exception {
    	JSONArray beanArray = reportData.getJSONArray("cell_behavior");
    	for(int i=0;i<beanArray.size();i++){
    		JSONObject beanObj = beanArray.getJSONObject(i);
    		JSONArray behaviorArray = beanObj.getJSONArray("behavior");
    		for(int j = 0;j < behaviorArray.size();j++) {
    			JSONObject behavior = behaviorArray.getJSONObject(j);
    			ExtJxlCellBehaviorStockDTO cellBehavior = (ExtJxlCellBehaviorStockDTO)JSONObject.toBean(behavior, ExtJxlCellBehaviorStockDTO.class);
    			cellBehavior.setFkJxlCustInfoId(extJxlCustInfoStockDTO.getId());
    			extJxlCellBehaviorStockService.insertExtJxlCellBehaviorStock(cellBehavior);
    			extJxlCustInfoStockDTO.setCellBehaviorMsg(InterfaceEnum.RET_MSG.getKey());
        		this.updateExtJxlCustInfoStock(extJxlCustInfoStockDTO);
    		}
    	}
    }
    
    /**
     * @author 豆永亮
     * @description: 保存近期需求信息
     * @param reportData
     * @param fkJxlCustInfoId
     * @throws Exception
     */
    private void saveExtJxlRecentNeed(JSONObject reportData, ExtJxlCustInfoStockDTO extJxlCustInfoStockDTO) throws Exception {
    	JSONArray beanArray = reportData.getJSONArray("recent_need");
    	for(int i=0;i<beanArray.size();i++){
			JSONObject beanObj = beanArray.getJSONObject(i);
			Map<String, Class<?>> classMap = new HashMap<String, Class<?>>();
			classMap.put("demands_info", ExtJxlDemandsInfoStockDTO.class);
			classMap.put("req_call_min", Map.class);
			classMap.put("req_call_cnt", Map.class);
			ExtJxlRecentNeedStockDTO recentNeed = (ExtJxlRecentNeedStockDTO) JSONObject.toBean(beanObj, ExtJxlRecentNeedStockDTO.class, classMap);
			recentNeed.setFkJxlCustInfoId(extJxlCustInfoStockDTO.getId());
			if(recentNeed.getReq_call_min() != null) {
				if(recentNeed.getReq_call_min().get("call_in_time") != null && !"".equals(recentNeed.getReq_call_min().get("call_in_time"))){
					recentNeed.setCall_in_time(Long.parseLong(recentNeed.getReq_call_min().get("call_in_time").toString()));
				}
				if(recentNeed.getReq_call_min().get("call_out_time") != null && !"".equals(recentNeed.getReq_call_min().get("call_out_time"))){
					recentNeed.setCall_out_time(Long.parseLong(recentNeed.getReq_call_min().get("call_out_time").toString()));
				}
			}
			if(recentNeed.getReq_call_cnt() != null) {
				if(recentNeed.getReq_call_cnt().get("call_out_cnt") != null && !"".equals(recentNeed.getReq_call_cnt().get("call_out_cnt"))){
					recentNeed.setCall_out_cnt(Long.parseLong(recentNeed.getReq_call_cnt().get("call_out_cnt").toString()));
				}
				if(recentNeed.getReq_call_cnt().get("call_in_cnt") != null && !"".equals(recentNeed.getReq_call_cnt().get("call_in_cnt"))){
					recentNeed.setCall_in_cnt(Long.parseLong(recentNeed.getReq_call_cnt().get("call_in_cnt").toString()));
				}
			}
			Long fkRecentNeedId = extJxlRecentNeedStockService.insertExtJxlRecentNeedStock(recentNeed);
			extJxlCustInfoStockDTO.setRecentNeedMsg(InterfaceEnum.RET_MSG.getKey());
    		this.updateExtJxlCustInfoStock(extJxlCustInfoStockDTO);
			//保存需求信息
			for(ExtJxlDemandsInfoStockDTO demandsInfo : recentNeed.getDemands_info()) {
				demandsInfo.setFkRecentNeedId(fkRecentNeedId);
	    		extJxlDemandsInfoStockService.insertExtJxlDemandsInfoStock(demandsInfo);
			}
		}
    }
    
    /**
     * @author 豆永亮
     * @description: 保存联系人信息
     * @param reportData
     * @param fkJxlCustInfoId
     * @throws Exception
     */
    private void saveExtJxlContactInfo(JSONObject reportData, ExtJxlCustInfoStockDTO extJxlCustInfoStockDTO) throws Exception {
    	JSONArray beanArray = reportData.getJSONArray("collection_contact");
    	for(int i=0;i<beanArray.size();i++){
    		JSONObject beanObj = beanArray.getJSONObject(i);
    		Map<String, Class<?>> classMap = new HashMap<String, Class<?>>();
			classMap.put("contact_details", ExtJxlCallInfoStockDTO.class);
    		ExtJxlContactInfoStockDTO contactInfo = (ExtJxlContactInfoStockDTO) JSONObject.toBean(beanObj, ExtJxlContactInfoStockDTO.class, classMap);
    		contactInfo.setFkJxlCustInfoId(extJxlCustInfoStockDTO.getId());
    		Long fkContactInfoId = extJxlContactInfoStockService.insertExtJxlContactInfoStock(contactInfo);
    		extJxlCustInfoStockDTO.setContactInfoMsg(InterfaceEnum.RET_MSG.getKey());
    		this.updateExtJxlCustInfoStock(extJxlCustInfoStockDTO);
    		//保存呼叫信息
    		for(ExtJxlCallInfoStockDTO contactDetail : contactInfo.getContact_details()) {
    			contactDetail.setFkContactInfoId(fkContactInfoId);
        		extJxlCallInfoStockService.insertExtJxlCallInfoStock(contactDetail);
    		}
    	}
    }
    
    /**
     * @author 豆永亮
     * @description: 保存出行分析信息
     * @param reportData
     * @param fkJxlCustInfoId
     * @throws Exception
     */
    private void saveExtJxlTripInfo(JSONObject reportData, ExtJxlCustInfoStockDTO extJxlCustInfoStockDTO) throws Exception {
    	JSONArray beanArray = reportData.getJSONArray("trip_info");
    	for(int i=0;i<beanArray.size();i++){
    		JSONObject beanObj = beanArray.getJSONObject(i);
    		ExtJxlTripInfoStockDTO tripInfo = (ExtJxlTripInfoStockDTO) JSONObject.toBean(beanObj, ExtJxlTripInfoStockDTO.class);
    		tripInfo.setFkJxlCustInfoId(extJxlCustInfoStockDTO.getId());
    		//保存出行工具信息
    		List<String> transportatioList = tripInfo.getTrip_transportation();
    		if(transportatioList != null && transportatioList.size() > 0) {
    			String transportations = transportatioList.toString();
	    		tripInfo.setTripTransportation(transportations.substring(1, transportations.length() - 1));
    		}
    		//保存同行人信息
    		List<String> personList = tripInfo.getTrip_person();
    		if(personList != null && personList.size() > 0) {
    			String persons = personList.toString();
    			tripInfo.setTripPerson(persons.substring(1, persons.length() - 1));
    		}
    		//保存是通过哪些数据源分析出来的信息
    		List<String> dataSourceList = tripInfo.getTrip_data_source();
    		if(dataSourceList != null && dataSourceList.size() > 0) {
    			String dataSources = dataSourceList.toString();
    			tripInfo.setTripDataSource(dataSources.substring(1, dataSources.length() - 1));
    		}
    		extJxlTripInfoStockService.insertExtJxlTripInfoStock(tripInfo);
    		extJxlCustInfoStockDTO.setTripInfoMsg(InterfaceEnum.RET_MSG.getKey());
    		this.updateExtJxlCustInfoStock(extJxlCustInfoStockDTO);
    	}
    }
    
    /**
     * @author 豆永亮
     * @description: json对象转bean对象
     * @param JSONObject jsonObj
     * @param clazz
     * @return
     */
    private Object parseJsonStr(JSONObject jsonObj, Class<?> clazz){
		return JSONObject.toBean(jsonObj, clazz);
	}
    
    /**
     * @author 豆永亮
     * @description: 获取json对象里的json数组转list<bean>对象
     * @param JSONObject jsonObj
     * @param key
     * @param clazz
     * @return
     */
    private Object parseJsonStr(JSONObject jsonObj, String key, Class<?> clazz){
		List<Object> list = new ArrayList<Object>();
		JSONArray beanArray = jsonObj.getJSONArray(key);
		for(int i=0;i<beanArray.size();i++){
			JSONObject beanObj = beanArray.getJSONObject(i);
			list.add(JSONObject.toBean(beanObj, clazz));
		}
		return list;
	}
	
}

