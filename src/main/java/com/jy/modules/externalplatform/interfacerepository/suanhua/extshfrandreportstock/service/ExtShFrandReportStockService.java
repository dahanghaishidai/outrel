package com.jy.modules.externalplatform.interfacerepository.suanhua.extshfrandreportstock.service;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.suanhua.extshfranddetailstock.dto.ExtShFrandDetailStockDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhua.extshfranddetailstock.service.ExtShFrandDetailStockService;
import com.jy.modules.externalplatform.interfacerepository.suanhua.extshfrandreportstock.dao.ExtShFrandReportStockDao;
import com.jy.modules.externalplatform.interfacerepository.suanhua.extshfrandreportstock.dto.ExtShFrandReportStockDTO;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.ExtHttpStatus;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.modules.externalplatform.interfacerest.utils.JsonUtil;
import com.jy.modules.externalplatform.interfacerest.utils.ObjectUtil;
import com.jy.platform.core.common.BaseDTO;
import com.jy.platform.core.common.JYLoggerUtil;

/**
 * @classname: ExtShFrandReportStockService
 * @description: 定义  算话反欺诈报告 实现类
 * @author:  dell
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhua.extshfrandreportstock.service.ExtShFrandReportStockService")
public class ExtShFrandReportStockService implements ExtSaveMessageDao {
	private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	
	@Autowired
	ExtInterfaceLogService extInterfaceLogService;
    
	@Autowired
	private ExtShFrandReportStockDao dao;
	
	@Autowired
	private ExtShFrandDetailStockService detailService;
	
	

	/**
     * @author dell
     * @description: 分页查询 算话反欺诈报告列表
     * @date 2017-06-12 11:31:37
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtShFrandReportStockDTO> searchExtShFrandReportStockByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtShFrandReportStockDTO> dataList =  dao.searchExtShFrandReportStockByPaging(searchParams);
		return dataList;
	}
	/**
     * @author dell
     * @description: 按条件查询算话反欺诈报告列表
     * @date 2017-06-12 11:31:37
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtShFrandReportStockDTO> searchExtShFrandReportStock(Map<String,Object> searchParams) throws Exception {
	    List<ExtShFrandReportStockDTO> dataList = dao.searchExtShFrandReportStock(searchParams);
        return dataList;
    }
	/**
     * @author dell
     * @description: 查询算话反欺诈报告对象
     * @date 2017-06-12 11:31:37
     * @param id
     * @return
     * @throws
     */ 
	public ExtShFrandReportStockDTO queryExtShFrandReportStockByPrimaryKey(String id) throws Exception {
		
		ExtShFrandReportStockDTO dto = dao.findExtShFrandReportStockByPrimaryKey(id);
		
		if(dto == null) dto = new ExtShFrandReportStockDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtShFrandReportStock
     * @author dell
     * @description: 新增 算话反欺诈报告对象
     * @date 2017-06-12 11:31:37
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtShFrandReportStock(ExtShFrandReportStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtShFrandReportStock(paramMap);
		
		ExtShFrandReportStockDTO resultDto = (ExtShFrandReportStockDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtShFrandReportStock
     * @author dell
     * @description: 修改 算话反欺诈报告对象
     * @date 2017-06-12 11:31:37
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtShFrandReportStock(ExtShFrandReportStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtShFrandReportStock(paramMap);
	}
	/**
     * @title: deleteExtShFrandReportStockByPrimaryKey
     * @author dell
     * @description: 删除 算话反欺诈报告,按主键
     * @date 2017-06-12 11:31:37
     * @param paramMap
     * @throws
     */ 
	public void deleteExtShFrandReportStockByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtShFrandReportStockByPrimaryKey(paramMap);
	}
	
	/**
	* @title: saveMessage
	* @author:陈东栋
	* @description: 解析保存算话反欺诈返回报文信息
	* @date 2017年6月2日 上午10:53:51
	* @param map
	* @throws 
	*/ 
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
		String retCode = "";
		String remark = "";
		String errorMsg = "";
		Map<String, Object> paramMap=new HashMap<String,Object>();
		ExtShFrandReportStockDTO  extShFrandReportDTO = new ExtShFrandReportStockDTO();
		ExtShFrandDetailStockDTO  extShFrandDetailDTO = new ExtShFrandDetailStockDTO();
		try {
			if(StringUtils.isEmpty(result)||"null".equals(result)){
				retCode = InterfaceEnum.RET_CODE_3.getKey();
				remark = InterfaceEnum.RET_CODE_3.getValue();
				interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				interfaceLogDto.setRetMsg("算话反欺诈信息查询返回报文为空");
				errorMsg = "算话反欺诈信息查询返回报文为空";
			}else{
				 
				JSONObject jsonObject=JSONObject.fromObject(result);
				retCode1 = jsonObject.getString("RET_CODE");
				if(null != jsonObject.get("RET_MSG"))
				    retMsg = jsonObject.getString("RET_MSG");
				//返回的报文中没有 RET_MSG这个键
	            /*retMsg = jsonObject.getString("RET_MSG");*/
				if(jsonObject.containsKey("retCode") && ExtHttpStatus.RET_CODE_FAIL6.equals(jsonObject.getString("retCode"))){
					retCode = InterfaceEnum.RET_CODE_6.getKey();
					remark = String.valueOf(jsonObject.get("errorDesc"));
					interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_6.getKey());
					interfaceLogDto.setRetMsg(String.valueOf(jsonObject.get("errorDesc")));
				}else{
					String rtCode = jsonObject.getString("RET_CODE");
					if("00".equals(rtCode)) {
						isSuccess = "1";
						 JSONObject retData = jsonObject.getJSONObject("DATA");
						 JSONObject gObject = retData.getJSONObject("G1");
						 extShFrandReportDTO = (ExtShFrandReportStockDTO)ObjectUtil.convertToBean(ExtShFrandReportStockDTO.class,JsonUtil.convertJson(retData));
						 extShFrandReportDTO.setAppDate(new Date());
						 if(null != gObject){
							 extShFrandDetailDTO = (ExtShFrandDetailStockDTO)ObjectUtil.convertToBean(ExtShFrandDetailStockDTO.class,JsonUtil.convertJson(gObject));
							 extShFrandReportDTO.setG1Msg(InterfaceEnum.RET_MSG.getKey());
						 }
						 retCode = InterfaceEnum.RET_CODE_1.getKey();
						 remark = InterfaceEnum.RET_CODE_1.getValue();
						 interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
						 interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_1.getValue());
					}else{
						retCode = InterfaceEnum.RET_CODE_5.getKey();
						remark = InterfaceEnum.RET_CODE_5.getValue();
						interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_5.getKey());
						interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_5.getValue());
						errorMsg = "返回错误编码:"+rtCode; 
					}
				}
			}
		} catch (Exception ex) {
			JYLoggerUtil.error(this.getClass(), "===算话征信反欺诈信息查询接口异常===接口日志ID:"+String.valueOf(map.get("interfaceId")), ex);
			retCode = InterfaceEnum.RET_CODE_4.getKey();
			remark = InterfaceEnum.RET_CODE_4.getValue();
			interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4.getKey());
			interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_4.getValue());
			String msg = ex.getMessage();
			if(StringUtils.isNotEmpty(msg)){
				 if(msg.length() > 2000){
					 errorMsg ="算话反欺诈信息查询接口异常:"+msg.substring(0,2000); 
				 }else{ 
					 errorMsg ="算话反欺诈信息查询接口:"+msg; 
				 }
			}
		} finally{
			extShFrandReportDTO.setProdCode(String.valueOf(map.get("prod")));
			extShFrandReportDTO.setOrgCode(String.valueOf(map.get("org")));
			extShFrandReportDTO.setSysCode(String.valueOf(map.get("sysCode")));
			extShFrandReportDTO.setInterfaceId(String.valueOf(map.get("interfaceId")));
			extShFrandReportDTO.setRetCode(retCode);
			extShFrandReportDTO.setRemark(remark);
			extShFrandReportDTO.setErrorMsg(errorMsg);
			paramMap.put("dto", extShFrandReportDTO);
			//将查询结果信息记录到结果表中
		    try {
		    	Long frandReportId  = insertExtShFrandReportStock(extShFrandReportDTO);
		    	//设置主表ID
		    	if(null != frandReportId){
		    		fkBizId = String.valueOf(frandReportId);
		    	}
		    	
		    	if (null != frandReportId && InterfaceEnum.RET_MSG.getKey().equals(extShFrandReportDTO.getG1Msg())) {
		    		extShFrandDetailDTO.setFkFrandReportId(frandReportId);
		    		detailService.insertExtShFrandDetailStock(extShFrandDetailDTO);
		    	}
		    	interfaceLogDto.setRetBody(result);
				interfaceLogDto.setExt2(isSuccess);
				interfaceLogDto.setExt3(retCode1);
				interfaceLogDto.setExt4(retMsg);
				interfaceLogDto.setExt5(fkBizId);//保存关联
				extInterfaceLogService.insertExtInterfaceLog(interfaceLogDto);
			} catch (Exception e) {
				JYLoggerUtil.error(this.getClass(), "===保存算话反欺诈查询信息异常===接口日志ID:"+String.valueOf(map.get("interfaceId")), e);
			}
		}
	}
}