package com.jy.modules.externalplatform.interfacerepository.suanhua.extshcreqryreportstock.service;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jodd.util.StringUtil;
import net.sf.json.JSONObject;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.jy.modules.externalplatform.interfacerepository.suanhua.extshcreqryacctstock.dto.ExtShCreqryAcctStockDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhua.extshcreqryacctstock.service.ExtShCreqryAcctStockService;
import com.jy.modules.externalplatform.interfacerepository.suanhua.extshcreqryguarstock.dto.ExtShCreqryGuarStockDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhua.extshcreqryguarstock.service.ExtShCreqryGuarStockService;
import com.jy.modules.externalplatform.interfacerepository.suanhua.extshcreqryrepaystock.dto.ExtShCreqryRepayStockDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhua.extshcreqryrepaystock.service.ExtShCreqryRepayStockService;
import com.jy.modules.externalplatform.interfacerepository.suanhua.extshcreqryreportstock.dao.ExtShCreqryReportStockDao;
import com.jy.modules.externalplatform.interfacerepository.suanhua.extshcreqryreportstock.dto.ExtShCreqryReportStockDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhua.extshcreqryreportstock.dto.RespQueryQreQueryData;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.BaseDTO;
import com.jy.platform.core.common.JYLoggerUtil;

/**
 * @classname: ExtShCreqryReportStockService
 * @description: 定义  算话征信贷款信息查询报告 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhua.extshcreqryreportstock.service.ExtShCreqryReportStockService")
public class ExtShCreqryReportStockService implements ExtSaveMessageDao {
	private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	
	@Autowired
	ExtInterfaceLogService extInterfaceLogService;
    
	@Autowired
	private ExtShCreqryReportStockDao dao;

	@Autowired
	private ExtShCreqryAcctStockService extShCreqryAcctinfoService ;
	
	@Autowired
	private ExtShCreqryGuarStockService extShCreqryGuarenteeinfoService ;
	
	@Autowired
	private ExtShCreqryRepayStockService extShCreqryRepayinfoService ;
	/**
     * @author Administrator
     * @description: 分页查询 算话征信贷款信息查询报告列表
     * @date 2017-06-09 10:01:20
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtShCreqryReportStockDTO> searchExtShCreqryReportStockByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtShCreqryReportStockDTO> dataList =  dao.searchExtShCreqryReportStockByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话征信贷款信息查询报告列表
     * @date 2017-06-09 10:01:20
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtShCreqryReportStockDTO> searchExtShCreqryReportStock(Map<String,Object> searchParams) throws Exception {
	    List<ExtShCreqryReportStockDTO> dataList = dao.searchExtShCreqryReportStock(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话征信贷款信息查询报告对象
     * @date 2017-06-09 10:01:20
     * @param id
     * @return
     * @throws
     */ 
	public ExtShCreqryReportStockDTO queryExtShCreqryReportStockByPrimaryKey(String id) throws Exception {
		
		ExtShCreqryReportStockDTO dto = dao.findExtShCreqryReportStockByPrimaryKey(id);
		
		if(dto == null) dto = new ExtShCreqryReportStockDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtShCreqryReportStock
     * @author Administrator
     * @description: 新增 算话征信贷款信息查询报告对象
     * @date 2017-06-09 10:01:20
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtShCreqryReportStock(ExtShCreqryReportStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtShCreqryReportStock(paramMap);
		
		ExtShCreqryReportStockDTO resultDto = (ExtShCreqryReportStockDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtShCreqryReportStock
     * @author Administrator
     * @description: 修改 算话征信贷款信息查询报告对象
     * @date 2017-06-09 10:01:20
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtShCreqryReportStock(ExtShCreqryReportStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtShCreqryReportStock(paramMap);
	}
	/**
     * @title: deleteExtShCreqryReportStockByPrimaryKey
     * @author Administrator
     * @description: 删除 算话征信贷款信息查询报告,按主键
     * @date 2017-06-09 10:01:20
     * @param paramMap
     * @throws
     */ 
	public void deleteExtShCreqryReportStockByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtShCreqryReportStockByPrimaryKey(paramMap);
	}

	/**
	 * 接收数据保存
	 * @param map
	 */
	public void saveMessage(Map<String,Object> map){
		//日志信息
		ExtInterfaceLogDTO interfaceLogDto=(ExtInterfaceLogDTO) map.get("interfaceLogDto");
		String results=String.valueOf(map.get("result"));
		Map<String, Object> params=new HashMap<String,Object>();
		ExtShCreqryReportStockDTO dto = new ExtShCreqryReportStockDTO();
		dto.setProdCode(String.valueOf(map.get("prod")));
		dto.setOrgCode(String.valueOf(map.get("org")));
		dto.setSysCode(String.valueOf(map.get("sysCode")));
    	JSONObject jsonObj = null;
		try {
			if(StringUtils.isNotEmpty((CharSequence) map.get("result")) && !"null".equals(map.get("result"))){
				jsonObj = JSONObject.fromObject(map.get("result"));
				if(null!=jsonObj.get("retCode") && jsonObj.get("retCode").equals("500")){
					 dto.setRetcode(InterfaceEnum.RET_CODE_6.getKey());
					 dto.setErrormsg(String.valueOf(jsonObj.get("errorDesc")));
					 dto.setRemark(String.valueOf(jsonObj.get("errorDesc")));
					 interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_6.getKey());
					 interfaceLogDto.setRetMsg(String.valueOf(jsonObj.get("errorDesc")));
					 params.put("dto", dto);
					 dao.insertExtShCreqryReportStock(params);
					 return;
				 }
				dto = JSON.parseObject(String.valueOf(map.get("result")), ExtShCreqryReportStockDTO.class);
				if(dto.isSuccess()){
					//保存主信息
					dto.setRetcode(InterfaceEnum.RET_CODE_1.getKey());
				    dto.setRemark("调用算话征信贷款信息查询接口查有");	
				    interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
					interfaceLogDto.setRetMsg("调用算话征信贷款信息查询接口查有");	
					Long reportId = this.insertExtShCreqryReportStock(dto);
					
					List<RespQueryQreQueryData> retList = dto.getData();
					if(retList != null && retList.size() > 0){
						//遍历保存详细信息
						for(RespQueryQreQueryData dataInfo : retList){
							//合同信息
							ExtShCreqryAcctStockDTO acctInfo =  dataInfo.getAcctInfo() ;
							if(null!=acctInfo){
								acctInfo.setReportId(reportId);
								extShCreqryAcctinfoService.insertExtShCreqryAcctStock(acctInfo);
								dto.setAcctMsg(InterfaceEnum.RET_MSG.getKey());
								this.updateExtShCreqryReportStock(dto);
							}
							//担保信息
							List<ExtShCreqryGuarStockDTO> guarenteeinfos = dataInfo.getGuarenteeInfo() ;
							if(guarenteeinfos != null && guarenteeinfos.size() > 0){
								for(ExtShCreqryGuarStockDTO guarenteeinfo:guarenteeinfos){
									guarenteeinfo.setReportId(reportId);
									guarenteeinfo.setSaccount(acctInfo.getSaccount());
									extShCreqryGuarenteeinfoService.insertExtShCreqryGuarStock(guarenteeinfo);
								}
								dto.setGuarMsg(InterfaceEnum.RET_MSG.getKey());
								this.updateExtShCreqryReportStock(dto);
							}
							//还款信息列表
							List<ExtShCreqryRepayStockDTO> repayinfos = dataInfo.getRepayInfo() ;
							if(repayinfos != null && repayinfos.size() > 0){
								for(ExtShCreqryRepayStockDTO repayinfo :repayinfos){
									repayinfo.setReportId(reportId);
									repayinfo.setSaccount(acctInfo.getSaccount());
									extShCreqryRepayinfoService.insertExtShCreqryRepayStock(repayinfo);
								}
								dto.setRepayMsg(InterfaceEnum.RET_MSG.getKey());
								this.updateExtShCreqryReportStock(dto);
							}
						}
						
					}
					
				}else{
	            	dto.setRetcode(InterfaceEnum.RET_CODE_5.getKey());
				    dto.setErrormsg("调用算话征信贷款信息查询接口返回错误信息");
				    dto.setRemark("调用算话征信贷款信息查询接口返回错误信息");	
				    interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_5.getKey());
					interfaceLogDto.setRetMsg("调用算话征信贷款信息查询接口返回错误信息");				
					params.put("dto", dto);
					dao.insertExtShCreqryReportStock(params);
	            }
			}else{				
			     dto.setRetcode(InterfaceEnum.RET_CODE_3.getKey());
			     dto.setErrormsg("调用算话征信贷款信息查询接口报错");
			     dto.setRemark("调用算话征信贷款信息查询接口报错");	
				 interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
			     interfaceLogDto.setRetMsg("调用算话征信贷款信息查询接口报错");				
				 params.put("dto", dto);
				 dao.insertExtShCreqryReportStock(params);
			 }
		} catch (Exception ex) {
			  JYLoggerUtil.error(this.getClass(), "===调用算话征信贷款信息查询解析回参异常===进件日志ID:"+String.valueOf(map.get("interfaceId")),ex);
			  String msg = ex.getMessage();
			  if(StringUtil.isNotEmpty(msg)){
				  if(msg.contains("A JSONObject text must begin with '{' at character 1 of")){
					  dto.setRetcode(InterfaceEnum.RET_CODE_3.getKey());
					  dto.setErrormsg("调用算话征信贷款信息查询接口异常请求返回，请联系IT解决");
					  dto.setRemark("调用算话征信贷款信息查询接口调用报错");	
					  interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
					  interfaceLogDto.setRetMsg("调用算话征信贷款信息查询接口异常请求返回，请联系IT解决");
				 }else{
					  dto.setRetcode(InterfaceEnum.RET_CODE_4.getKey());
					  if(msg.length() > 2000){
						  dto.setErrormsg("调用算话征信贷款信息查询接口返回信息解析出错:"+msg.substring(0,2000));
						  interfaceLogDto.setRetMsg("调用算话征信贷款信息查询接口返回信息解析出错:"+msg.substring(0,2000));
					  }else{
						  dto.setErrormsg("调用算话征信贷款信息查询接口返回信息解析出错:"+msg);
						  interfaceLogDto.setRetMsg("调用算话征信贷款信息查询接口返回信息解析出错:"+msg);
					  }
					  dto.setRemark("调用算话征信贷款信息查询接口返回信息解析出错");	
					  interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4.getKey());
				 }
			  }
			  params.put("dto",dto);
			  dao.insertExtShCreqryReportStock(params);
		}finally{
			try {
				interfaceLogDto.setRetBody(results);
				Long keyId =extInterfaceLogService.insertExtInterfaceLog(interfaceLogDto);
				dto.setInterfaceId(String.valueOf(keyId));
				this.updateExtShCreqryReportStock(dto);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	
}

