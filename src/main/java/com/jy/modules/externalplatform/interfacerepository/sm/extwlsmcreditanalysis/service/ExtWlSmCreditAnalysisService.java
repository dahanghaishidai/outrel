package com.jy.modules.externalplatform.interfacerepository.sm.extwlsmcreditanalysis.service;
import java.io.Serializable;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import com.alibaba.fastjson.JSONObject;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.JYLoggerUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.sm.extwlsmcreditanalysis.dto.ExtWlSmCreditAnalysisDTO;
import com.jy.modules.externalplatform.interfacerepository.sm.extwlsmcreditanalysis.dao.ExtWlSmCreditAnalysisDao;

/**
 * @classname: ExtWlSmCreditAnalysisService
 * @description: 定义  数美文本信用分析服务 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.sm.extwlsmcreditanalysis.service.ExtWlSmCreditAnalysisService")
public class ExtWlSmCreditAnalysisService implements Serializable, ExtSaveMessageDao {

	private static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

	@Autowired
	private ExtInterfaceLogService extInterfaceLogService;

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlSmCreditAnalysisDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 数美文本信用分析服务列表
     * @date 2017-12-19 16:27:15
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlSmCreditAnalysisDTO> searchExtWlSmCreditAnalysisByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlSmCreditAnalysisDTO> dataList =  dao.searchExtWlSmCreditAnalysisByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询数美文本信用分析服务列表
     * @date 2017-12-19 16:27:15
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlSmCreditAnalysisDTO> searchExtWlSmCreditAnalysis(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlSmCreditAnalysisDTO> dataList = dao.searchExtWlSmCreditAnalysis(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询数美文本信用分析服务对象
     * @date 2017-12-19 16:27:15
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlSmCreditAnalysisDTO queryExtWlSmCreditAnalysisByPrimaryKey(String id) throws Exception {
		
		ExtWlSmCreditAnalysisDTO dto = dao.findExtWlSmCreditAnalysisByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlSmCreditAnalysisDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlSmCreditAnalysis
     * @author Administrator
     * @description: 新增 数美文本信用分析服务对象
     * @date 2017-12-19 16:27:15
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlSmCreditAnalysis(ExtWlSmCreditAnalysisDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlSmCreditAnalysis(paramMap);
		
		ExtWlSmCreditAnalysisDTO resultDto = (ExtWlSmCreditAnalysisDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlSmCreditAnalysis
     * @author Administrator
     * @description: 修改 数美文本信用分析服务对象
     * @date 2017-12-19 16:27:15
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlSmCreditAnalysis(ExtWlSmCreditAnalysisDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlSmCreditAnalysis(paramMap);
	}
	/**
     * @title: deleteExtWlSmCreditAnalysisByPrimaryKey
     * @author Administrator
     * @description: 删除 数美文本信用分析服务,按主键
     * @date 2017-12-19 16:27:15
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlSmCreditAnalysisByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlSmCreditAnalysisByPrimaryKey(paramMap);
	}

	/**
	 * @methodName: saveMessage
	 * @param: [map]
	 * @describe: 数美文本信用分析服务 接口数据落地
	 * @auther: huangxianchao
	 * @date: 2017/12/19 0019
	 * @time: 下午 4:31
	 **/
	@Override
	public void saveMessage(Map<String, Object> map) {

		String isSuccess = "0";
		String retCode = "";
		String retMsg = "";
		String fkBizId = "";

		//日志信息
		ExtInterfaceLogDTO interfaceLogDto = (ExtInterfaceLogDTO) map.get("interfaceLogDto");
		String results = (String)map.get("result");

		try{
			if(null == map.get("intoCustomerRefId")){
				map.put("intoCustomerRefId", "");//非贷款系统调用，这个没有值
			}

			//有报文结果
			if (StringUtils.isNotEmpty(results)){
				ExtWlSmCreditAnalysisDTO dto = new ExtWlSmCreditAnalysisDTO();
				if (null != map.get("intoCustomerRefId") && !"".equals(map.get("intoCustomerRefId"))){
					dto.setIntoCustRefId(Long.parseLong(map.get("intoCustomerRefId").toString()));
				}

				JSONObject ob = JSONObject.parseObject(results);
				if (null != ob.get("code")){
					retCode = ob.get("code").toString();
					dto.setCode(ob.getLong("code"));
				}

				if ("1100".equals(retCode)){
					isSuccess = "1";
					interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
					interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_1.getValue());
					if (null != ob.get("detail")){

						dto = JSONObject.parseObject(ob.get("detail").toString(), ExtWlSmCreditAnalysisDTO.class);
					}

				}else {
					interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_5.getKey());
					interfaceLogDto.setRetMsg("调用数美文本信用分析服务返回错误信息");
				}
				if (null != ob.get("code")){
					dto.setCode(ob.getLong("code"));
				}

				if (null != ob.get("message")){
					retMsg = ob.get("message").toString();
					dto.setMessage(retMsg);
				}
				if (null != ob.get("requestId")){
					dto.setRequestId(ob.get("requestId").toString());
				}
				Long keyId = this.insertExtWlSmCreditAnalysis(dto);
				if (null != keyId){
					fkBizId = String.valueOf(keyId);
				}

			}else{
				interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				interfaceLogDto.setRetMsg("调用数美文本信用分析服务查无");
			}

		}catch (Exception e){
			JYLoggerUtil.error(this.getClass(), "===保存数美文本信用分析服务日志异常===接口日志ID:"+String.valueOf(map.get("interfaceId")), e);
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
				JYLoggerUtil.error(this.getClass(), "===保存数美文本信用分析服务日志异常===接口日志ID:"+String.valueOf(map.get("interfaceId")), e);
			}
		}

	}
}

