package com.jy.modules.externalplatform.interfacerepository.qhzx.extqhzxcredoostock.service;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.qhzx.extqhzxcredoostock.dao.ExtQhzxCredooStockDao;
import com.jy.modules.externalplatform.interfacerepository.qhzx.extqhzxcredoostock.dto.ExtQhzxCredooStockDTO;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.ExtHttpStatus;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.JYLoggerUtil;
/**
 * @classname: ExtQhzxCredooStockService
 * @description: 定义  好信度数据表 实现类
 * @author:  dell
 */
@Service("com.jy.modules.externalplatform.interfacerepository.qhzx.extqhzxcredoostock.service.ExtQhzxCredooStockService")
public class ExtQhzxCredooStockService implements ExtSaveMessageDao {
	private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	
	@Autowired
	ExtInterfaceLogService extInterfaceLogService;	
	@Autowired
	private ExtQhzxCredooStockDao dao;

	/**
     * @author dell
     * @description: 分页查询 好信度数据表列表
     * @date 2017-06-05 10:36:40
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtQhzxCredooStockDTO> searchExtQhzxCredooStockByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtQhzxCredooStockDTO> dataList =  dao.searchExtQhzxCredooStockByPaging(searchParams);
		return dataList;
	}
	/**
     * @author dell
     * @description: 按条件查询好信度数据表列表
     * @date 2017-06-05 10:36:40
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtQhzxCredooStockDTO> searchExtQhzxCredooStock(Map<String,Object> searchParams) throws Exception {
	    List<ExtQhzxCredooStockDTO> dataList = dao.searchExtQhzxCredooStock(searchParams);
        return dataList;
    }
	/**
     * @author dell
     * @description: 查询好信度数据表对象
     * @date 2017-06-05 10:36:40
     * @param id
     * @return
     * @throws
     */ 
	public ExtQhzxCredooStockDTO queryExtQhzxCredooStockByPrimaryKey(String id) throws Exception {
		
		ExtQhzxCredooStockDTO dto = dao.findExtQhzxCredooStockByPrimaryKey(id);
		
		if(dto == null) dto = new ExtQhzxCredooStockDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtQhzxCredooStock
     * @author dell
     * @description: 新增 好信度数据表对象
     * @date 2017-06-05 10:36:40
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtQhzxCredooStock(ExtQhzxCredooStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtQhzxCredooStock(paramMap);
		
		ExtQhzxCredooStockDTO resultDto = (ExtQhzxCredooStockDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	
	/**
	* @title: saveMessage
	* @author:陈东栋
	* @description: 解析保存好信度征信返回报文信息
	* @date 2017年6月2日 上午10:53:51
	* @param map
	* @throws 
	*/ 
	@SuppressWarnings("unchecked")
	@Override
	public void saveMessage(Map<String, Object> map) {
		
		String isSuccess = "0"; //接口是否调用成功 "1"：成功 ， "0"：失败
		String retCode1 = ""; //接口返回码
		String retMsg = ""; //接口返回信息
		String fkBizId = "";// 关联字段
		//日志信息
		ExtInterfaceLogDTO interfaceLogDto=(ExtInterfaceLogDTO) map.get("interfaceLogDto");
		String result = String.valueOf(map.get("result"));
		String.valueOf(map.get("prod"));
		String batchNo = "";
		String retCode = "";
		String remark = "";
		String errorMsg = "";
		Map<String, Object> paramMap=new HashMap<String,Object>();
		ExtQhzxCredooStockDTO  credooStockDTO = new ExtQhzxCredooStockDTO();
		try {
			if(StringUtils.isEmpty(result)||"null".equals(result)){
				retCode = InterfaceEnum.RET_CODE_3.getKey();
				remark = InterfaceEnum.RET_CODE_3.getValue();
				interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				interfaceLogDto.setRetMsg("好信度征信查询返回报文为空");
				errorMsg = "好信度征信查询返回报文为空";
			}else{
				JSONObject jsonObject=JSONObject.fromObject(result);
				retCode1 = jsonObject.getJSONObject("header").get("rtCode").toString();
				retMsg = jsonObject.getJSONObject("header").get("rtMsg").toString();
				if(jsonObject.containsKey("retCode") && ExtHttpStatus.RET_CODE_FAIL6.equals(jsonObject.getString("retCode"))){
					retCode = InterfaceEnum.RET_CODE_6.getKey();
					remark = InterfaceEnum.RET_CODE_6.getValue();
				}else{
					JSONObject header = jsonObject.getJSONObject("header");
					//返回结果没有这个键
					/*batchNo =  jsonObject.getJSONObject("busiDataInfo").getString("batchNo");*/
					String rtCode = header.get("rtCode").toString();
					String rtMsg = header.get("rtMsg").toString();
					if("E000000".equals(rtCode)){
						 isSuccess = "1";
						 JSONArray jSONArray = jsonObject.getJSONObject("busiDataInfo").getJSONArray("records");
						 List<ExtQhzxCredooStockDTO> list =JSONArray.toList(jSONArray,ExtQhzxCredooStockDTO.class);
						 if(CollectionUtils.isNotEmpty(list)){
							 credooStockDTO = list.get(0);
							 retCode = InterfaceEnum.RET_CODE_1.getKey();
							 remark = InterfaceEnum.RET_CODE_1.getValue();
							 interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
							 interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_1.getValue());
						 }else{
							 retCode = InterfaceEnum.RET_CODE_2.getKey();
							 remark = InterfaceEnum.RET_CODE_2.getValue();
							 interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_2.getKey());
							 interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_2.getValue());
						 } 
					}else{
						retCode = InterfaceEnum.RET_CODE_5.getKey();
						remark = InterfaceEnum.RET_CODE_5.getValue();
						interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_5.getKey());
						interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_5.getValue());
						errorMsg = "返回错误编码:"+rtCode+";返回错误信息："+rtMsg; 
					}
					credooStockDTO.setTransNo(header.get("transNo").toString());
					credooStockDTO.setTransDate(header.get("transDate").toString());
					credooStockDTO.setRtCode(rtCode);
				}	
			}
		} catch (Exception ex) {
			JYLoggerUtil.error(this.getClass(), "===好信度征信查询接口异常===接口日志ID:"+String.valueOf(map.get("interfaceId")), ex);
			retCode = InterfaceEnum.RET_CODE_4.getKey();
			remark = InterfaceEnum.RET_CODE_4.getValue();
			interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4.getKey());
			interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_4.getValue());
			String msg = ex.getMessage();
			if(StringUtils.isNotEmpty(msg)){
				 if(msg.length() > 2000){
					 errorMsg ="好信度征信查询接口异常:"+msg.substring(0,2000); 
				 }else{ 
					 errorMsg ="好信度征信查询接口异常:"+msg; 
				 }
			}
		}finally{
			credooStockDTO.setProdCode(String.valueOf(map.get("prod")));
			credooStockDTO.setOrgCode(String.valueOf(map.get("org")));
			credooStockDTO.setSysCode(String.valueOf(map.get("sysCode")));
			credooStockDTO.setInterfaceId(String.valueOf(map.get("interfaceId")));
			credooStockDTO.setBatchNo(batchNo);
			credooStockDTO.setName(String.valueOf(map.get("name")));//客户姓名
			credooStockDTO.setIdNo(String.valueOf(map.get("idNo")));//证件号码
			credooStockDTO.setIdType("0");//证件类型
			credooStockDTO.setMobileNo(String.valueOf(map.get("mobileNo")));//手机号码
			credooStockDTO.setCardNo(String.valueOf(map.get("cardNo")));//银行卡账号
			credooStockDTO.setReasonNo("01");//查询原因
			credooStockDTO.setErMsg(errorMsg);
			credooStockDTO.setRetCode(retCode);
			credooStockDTO.setRemark(remark);
			paramMap.put("dto", credooStockDTO);
			try {
				Long id = this.insertExtQhzxCredooStock(credooStockDTO);
				/*dao.insertExtQhzxCredooStock(paramMap);//保存好信度征信信息*/
				if(null != id){
					fkBizId = String.valueOf(id);
				}
			    interfaceLogDto.setRetBody(result);
				interfaceLogDto.setExt2(isSuccess);
				interfaceLogDto.setExt3(retCode1);
				interfaceLogDto.setExt4(retMsg);
				interfaceLogDto.setExt5(fkBizId);//保存关联字段
				extInterfaceLogService.insertExtInterfaceLog(interfaceLogDto);
				
			} catch (Exception e) {
				JYLoggerUtil.error(this.getClass(), "===保存好信度征信查询信息异常===接口日志ID:"+String.valueOf(map.get("interfaceId")), e);
			}
		}
	}

}

