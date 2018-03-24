package com.jy.modules.externalplatform.interfacerepository.yszx.extyszxreportinfo.service;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.yszx.extyszxcorporateinfo.dto.ExtYszxCorporateInfoDTO;
import com.jy.modules.externalplatform.interfacerepository.yszx.extyszxcorporateinfo.service.ExtYszxCorporateInfoService;
import com.jy.modules.externalplatform.interfacerepository.yszx.extyszxreportinfo.dao.ExtYszxReportInfoDao;
import com.jy.modules.externalplatform.interfacerepository.yszx.extyszxreportinfo.dto.ExtYszxReportInfoDTO;
import com.jy.modules.externalplatform.interfacerepository.yszx.extyszxshareholderinfo.dto.ExtYszxShareholderInfoDTO;
import com.jy.modules.externalplatform.interfacerepository.yszx.extyszxshareholderinfo.service.ExtYszxShareholderInfoService;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.BaseDTO;
import com.jy.platform.core.common.JYLoggerUtil;

/**
 * @classname: ExtYszxReportInfoService
 * @description: 定义  元素征信主表信息 实现类
 * @author:  dell
 */
@Service("com.jy.modules.externalplatform.interfacerepository.yszx.extyszxreportinfo.service.ExtYszxReportInfoService")
public class ExtYszxReportInfoService implements ExtSaveMessageDao {
	private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	
	@Autowired
	ExtInterfaceLogService extInterfaceLogService;
    
	@Autowired
	private ExtYszxReportInfoDao dao;
	
	@Autowired
    @Qualifier("com.jy.modules.externalplatform.interfacerepository.yszx.extyszxcorporateinfo.service.ExtYszxCorporateInfoService")
    private ExtYszxCorporateInfoService extRyposfrInfoService;
	
	@Autowired
    @Qualifier("com.jy.modules.externalplatform.interfacerepository.yszx.extyszxshareholderinfo.service.ExtYszxShareholderInfoService")
    private ExtYszxShareholderInfoService extRyposshaInfoService;
    

	/**
     * @author dell
     * @description: 分页查询 元素征信主表信息列表
     * @date 2017-06-01 18:02:29
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtYszxReportInfoDTO> searchExtYszxReportInfoByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtYszxReportInfoDTO> dataList =  dao.searchExtYszxReportInfoByPaging(searchParams);
		return dataList;
	}
	/**
     * @author dell
     * @description: 按条件查询元素征信主表信息列表
     * @date 2017-06-01 18:02:29
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtYszxReportInfoDTO> searchExtYszxReportInfo(Map<String,Object> searchParams) throws Exception {
	    List<ExtYszxReportInfoDTO> dataList = dao.searchExtYszxReportInfo(searchParams);
        return dataList;
    }
	/**
     * @author dell
     * @description: 查询元素征信主表信息对象
     * @date 2017-06-01 18:02:29
     * @param id
     * @return
     * @throws
     */ 
	public ExtYszxReportInfoDTO queryExtYszxReportInfoByPrimaryKey(String id) throws Exception {
		
		ExtYszxReportInfoDTO dto = dao.findExtYszxReportInfoByPrimaryKey(id);
		
		if(dto == null) dto = new ExtYszxReportInfoDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtYszxReportInfo
     * @author dell
     * @description: 新增 元素征信主表信息对象
     * @date 2017-06-01 18:02:29
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtYszxReportInfo(ExtYszxReportInfoDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtYszxReportInfo(paramMap);
		
		ExtYszxReportInfoDTO resultDto = (ExtYszxReportInfoDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtYszxReportInfo
     * @author dell
     * @description: 修改 元素征信主表信息对象
     * @date 2017-06-01 18:02:29
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtYszxReportInfo(ExtYszxReportInfoDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtYszxReportInfo(paramMap);
	}
	/**
     * @title: deleteExtYszxReportInfoByPrimaryKey
     * @author dell
     * @description: 删除 元素征信主表信息,按主键
     * @date 2017-06-01 18:02:29
     * @param paramMap
     * @throws
     */ 
	public void deleteExtYszxReportInfoByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtYszxReportInfoByPrimaryKey(paramMap);
	}
	
	
	/**
	* @title: saveMessage
	* @author:陈东栋
	* @description: 解析保存元素征信返回报文信息
	* @date 2017年6月2日 上午10:53:51
	* @param map
	* @throws 
	*/ 
	public void saveMessage(Map<String, Object> map) {
	    String isSuccess = "0";//是否调用成功  1：成功 0：失败
        String retCode = "";//接口返回码
        String retMsg = "";//接口返回信息
        String fkBizId = "";//接口落地数据主表ID
		//日志信息
		ExtInterfaceLogDTO interfaceLogDto=(ExtInterfaceLogDTO) map.get("interfaceLogDto");
		String result = String.valueOf(map.get("result"));
		String errorMsg = "";
		Map<String, Object> paramMap=new HashMap<String,Object>();
		ExtYszxReportInfoDTO  reportInfo = new ExtYszxReportInfoDTO();
		reportInfo.setProdCode(String.valueOf(map.get("prod")));
		reportInfo.setOrgCode(String.valueOf(map.get("org")));
		reportInfo.setSysCode(String.valueOf(map.get("sysCode")));
		try {
			if(StringUtils.isEmpty(result)||"null".equals(result)){
				reportInfo.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				reportInfo.setRemark(InterfaceEnum.RET_CODE_3.getValue());
				reportInfo.setErrorMsg("元素征信查询返回报文为空！");
				interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				interfaceLogDto.setRetMsg("元素征信查询返回报文为空！");
				paramMap.put("dto", reportInfo);
				dao.insertExtYszxReportInfo(paramMap);
				paramMap.clear();
			}else if(StringUtils.isNotEmpty(result)){
				reportInfo.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
				reportInfo.setRemark(InterfaceEnum.RET_CODE_1.getValue());
				interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
				interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_1.getValue());
				Document dom = DocumentHelper.parseText(result);
				Element root = dom.getRootElement();
				Element meta = root.element("meta");
				Element code = meta.element("code");
				Element message = meta.element("message");
                retCode = code.getText();//补充设置接口返回码，用于留存记录
                retMsg = message.getText();//补充设置接口返回信息，用于留存记录
				if("100".equals(code.getText())) {
				    isSuccess = "1";//补充设置接口调用成功，用于留存记录
					Element data = root.element("data");
					Element ryposfr = data.element("RYPOSFR");
					List<Element> ryposfrItems = ryposfr.elements("ITEM");
					if(CollectionUtils.isNotEmpty(ryposfrItems)) {//法人信息
						reportInfo.setCorporateMsg(InterfaceEnum.RET_MSG.getKey());
					}
					Element rypossha = data.element("RYPOSSHA");
					List<Element> ryposshaItems = rypossha.elements("ITEM");
					if(CollectionUtils.isNotEmpty(ryposshaItems)) {//股东信息
						reportInfo.setShareholderMsg(InterfaceEnum.RET_MSG.getKey());
					}
					paramMap.put("dto", reportInfo);
					dao.insertExtYszxReportInfo(paramMap);//保存元素征信主表信息
					paramMap.clear();
					Long fkReportId = reportInfo.getId();//元素征信主表ID
					fkBizId = fkReportId.toString();
					//插入"元素征信-法人信息"
					if(CollectionUtils.isNotEmpty(ryposfrItems)) {
						for(Element e : ryposfrItems) {
							insertExtRyposfrInfoDTO(e, fkReportId);
						}
					}
					//插入"元素征信-股东信息"
					if(CollectionUtils.isNotEmpty(ryposshaItems)) {
						for(Element e : ryposshaItems) {
							insertExtRyposshaInfoDTO(e, fkReportId);
						}
					}
				}else{
					reportInfo.setRetCode(InterfaceEnum.RET_CODE_5.getKey());
					reportInfo.setRemark(InterfaceEnum.RET_CODE_5.getValue());
					interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_5.getKey());
					interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_5.getValue());
					errorMsg = "返回错误编码:"+code.getText()+";返回错误信息："+message.getText(); 
					if(errorMsg.length() > 2000){
						errorMsg = errorMsg.substring(0,2000);
					}
					reportInfo.setErrorMsg(errorMsg);
					paramMap.put("dto", reportInfo);
					dao.insertExtYszxReportInfo(paramMap);//保存元素征信主表信息
					paramMap.clear();
				}
			}
		} catch (Exception ex) {
			 JYLoggerUtil.error(this.getClass(), "===元素征信查询接口异常===接口日志ID:"+String.valueOf(map.get("interfaceId")), ex);
			 reportInfo.setRetCode(InterfaceEnum.RET_CODE_4.getKey());
		     reportInfo.setRemark(InterfaceEnum.RET_CODE_4.getValue());
		     interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4.getKey());
			 interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_4.getValue());
		     String msg = ex.getMessage();
			 if(StringUtils.isNotEmpty(msg)){
				 if(msg.length() > 2000){
					 errorMsg ="元素征信查询接口异常:"+msg.substring(0,2000); 
				 }else{ 
					 errorMsg ="元素征信查询接口异常:"+msg; 
				 }
			 }
			 reportInfo.setErrorMsg(errorMsg);
			 paramMap.put("dto", reportInfo);
			 try {
				dao.insertExtYszxReportInfo(paramMap);//保存元素征信主表信息
			 } catch (Exception e) {
				JYLoggerUtil.error(this.getClass(), "===保存元素征信查询信息异常===接口日志ID:"+String.valueOf(map.get("interfaceId")), e);
			 }
			paramMap.clear();
		} finally{
		    try {
		    	interfaceLogDto.setRetBody(result);
				interfaceLogDto.setExt2(isSuccess);
                interfaceLogDto.setExt3(retCode);
                interfaceLogDto.setExt4(retMsg);
                interfaceLogDto.setExt5(fkBizId);
				Long keyId =extInterfaceLogService.insertExtInterfaceLog(interfaceLogDto);
				reportInfo.setInterfaceId(String.valueOf(keyId));
				this.updateExtYszxReportInfo(reportInfo);
			} catch (Exception e) {
				JYLoggerUtil.error(this.getClass(), "===保存元素征信查询信息日志异常===接口日志ID:"+String.valueOf(map.get("interfaceId")), e);
			}
		}
	}
	
	/**
     * 插入法人信息
     * @param e
     * @param intoId
     * @throws Exception
     */
    private void insertExtRyposfrInfoDTO(Element e, Long fkReportId) throws Exception{
    	ExtYszxCorporateInfoDTO extRyposfrInfoDTO = new ExtYszxCorporateInfoDTO();
    	extRyposfrInfoDTO.setFkReportId(fkReportId);
    	extRyposfrInfoDTO.setRyname(e.elementTextTrim("RYNAME"));
    	extRyposfrInfoDTO.setEntname(e.elementTextTrim("ENTNAME"));
    	extRyposfrInfoDTO.setRegno(e.elementTextTrim("REGNO"));
    	extRyposfrInfoDTO.setEnttype(e.elementTextTrim("ENTTYPE"));
    	extRyposfrInfoDTO.setRegcap(e.elementTextTrim("REGCAP"));
    	extRyposfrInfoDTO.setRegcapcur(e.elementTextTrim("REGCAPCUR"));
    	extRyposfrInfoDTO.setEntstatus(e.elementTextTrim("ENTSTATUS"));
    	extRyposfrInfoService.insertExtYszxCorporateInfo(extRyposfrInfoDTO);
    }
    
    /**
     * 插入股东信息
     * @param e
     * @param intoId
     * @throws Exception
     */
    private void insertExtRyposshaInfoDTO(Element e, Long fkReportId) throws Exception{
    	ExtYszxShareholderInfoDTO extRyposshaInfoDTO = new ExtYszxShareholderInfoDTO();
    	extRyposshaInfoDTO.setFkReportId(fkReportId);
    	extRyposshaInfoDTO.setRyname(e.elementTextTrim("RYNAME"));
    	extRyposshaInfoDTO.setEntname(e.elementTextTrim("ENTNAME"));
    	extRyposshaInfoDTO.setRegno(e.elementTextTrim("REGNO"));
    	extRyposshaInfoDTO.setEnttype(e.elementTextTrim("ENTTYPE"));
    	extRyposshaInfoDTO.setRegcap(e.elementTextTrim("REGCAP"));
    	extRyposshaInfoDTO.setRegcapcur(e.elementTextTrim("REGCAPCUR"));
    	extRyposshaInfoDTO.setEntstatus(e.elementTextTrim("ENTSTATUS"));
    	extRyposshaInfoDTO.setSubconam(e.elementTextTrim("SUBCONAM"));
    	extRyposshaInfoDTO.setCurrency(e.elementTextTrim("CURRENCY"));
    	extRyposshaInfoDTO.setConform(e.elementTextTrim("CONFORM"));
    	extRyposshaInfoDTO.setFundedratio(e.elementTextTrim("FUNDEDRATIO"));
    	extRyposshaInfoService.insertExtYszxShareholderInfo(extRyposshaInfoDTO);
    }
}

