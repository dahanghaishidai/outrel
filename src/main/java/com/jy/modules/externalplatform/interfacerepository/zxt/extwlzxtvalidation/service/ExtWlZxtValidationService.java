package com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtvalidation.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jy.modules.common.ARIConstant;
import com.jy.modules.externalplatform.interfacerepository.qhzx.extwlqhzxriskdootip.service.ExtWlQhzxRiskdooTipService;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcqueryinfo.dto.RequestMesDto;
import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtquestions.dto.ExtWlZxtQuestionsDTO;
import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtquestions.service.ExtWlZxtQuestionsService;
import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtvalidation.dao.ExtWlZxtValidationDao;
import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtvalidation.dto.ExtWlZxtValidationDTO;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.BaseDTO;
import com.jy.platform.core.common.JYLoggerUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alibaba.fastjson.JSONArray;

import java.io.Serializable;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @classname: ExtWlZxtValidationService
 * @description: 定义  核身问答信息获取主表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtvalidation.service.ExtWlZxtValidationService")
public class ExtWlZxtValidationService implements Serializable, ExtSaveMessageDao {

    private static final long serialVersionUID = 1L;
	private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	static Logger logger = LoggerFactory.getLogger(ExtWlQhzxRiskdooTipService.class);

	@Autowired
	ExtInterfaceLogService extInterfaceLogService;

	@Autowired
	ExtWlZxtQuestionsService extWlZxtQuestionsService;

	@Autowired
	private ExtWlZxtValidationDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 核身问答信息获取主表列表
     * @date 2017-12-12 20:13:53
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlZxtValidationDTO> searchExtWlZxtValidationByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlZxtValidationDTO> dataList =  dao.searchExtWlZxtValidationByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询核身问答信息获取主表列表
     * @date 2017-12-12 20:13:53
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlZxtValidationDTO> searchExtWlZxtValidation(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlZxtValidationDTO> dataList = dao.searchExtWlZxtValidation(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询核身问答信息获取主表对象
     * @date 2017-12-12 20:13:53
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlZxtValidationDTO queryExtWlZxtValidationByPrimaryKey(String id) throws Exception {
		
		ExtWlZxtValidationDTO dto = dao.findExtWlZxtValidationByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlZxtValidationDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlZxtValidation
     * @author Administrator
     * @description: 新增 核身问答信息获取主表对象
     * @date 2017-12-12 20:13:53
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlZxtValidation(ExtWlZxtValidationDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlZxtValidation(paramMap);
		
		ExtWlZxtValidationDTO resultDto = (ExtWlZxtValidationDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlZxtValidation
     * @author Administrator
     * @description: 修改 核身问答信息获取主表对象
     * @date 2017-12-12 20:13:53
     * @param dto
     * @return
     * @throws
     */
	public void updateExtWlZxtValidation(ExtWlZxtValidationDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlZxtValidation(paramMap);
	}
	/**
     * @title: deleteExtWlZxtValidationByPrimaryKey
     * @author Administrator
     * @description: 删除 核身问答信息获取主表,按主键
     * @date 2017-12-12 20:13:53
     * @param baseDto, ids
     * @throws
     */ 
	public void deleteExtWlZxtValidationByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlZxtValidationByPrimaryKey(paramMap);
	}
	/**
	 * @title: saveMessage
	 * @author dongkannging
	 * @description: 增信通闪电核 核身问答信息获取接口 数据落库
	 * @date 2017-12-13 20:13:53
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

			String intoCustomerRefId = "";
			if(null != map.get("intoCustomerRefId"))
				intoCustomerRefId = (String)map.get("intoCustomerRefId");

			if(StringUtils.isEmpty(result)){
				interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				interfaceLogDto.setRetMsg("查询增信通_核身问答信息获取接口返回报文为空！");
			}else if(result.contains("Read timed out")){
				interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				interfaceLogDto.setRetMsg("查询增信通_核身问答信息获取接口 访问超时！");
			}else{

				Map resultMap = JSON.parseObject(result);

				//设置核身结果代码、核身结果信息
				retCode = (String)resultMap.get("result");//核身结果代码
				retMsg = (String)resultMap.get("message");//核身结果信息

				//200 查询成功 201 查询陈功——返回超过一半的核身问答集合
				if("200".equals(retCode) || "201".equals(retCode)){
					isSuccess = "1";

					//1、核身问答信息获取主表
					//保存 核身问答信息获取主表
					String verId = (String)resultMap.get("verId");//核身ID号，32位随机数
					ExtWlZxtValidationDTO validationDTO = new ExtWlZxtValidationDTO();
					if(StringUtils.isNotEmpty(intoCustomerRefId))
						validationDTO.setIntoCustRefId(Long.parseLong(intoCustomerRefId));
					validationDTO.setVerId(verId);
					validationDTO.setResult(retCode);
					validationDTO.setMessage(retMsg);
					validationDTO.setCreateBy(-1L);

					//插入 核身问答信息获取主表
					Long keyId  = this.insertExtWlZxtValidation(validationDTO);
					if(null != keyId)
						fkBizId = keyId.toString();

					//2、保存核身问题答案信息
					String [] dataTypes = {"data", "contactData", "basicData"};
					//data: 核身借款人的答案信息;  contactData: 核身借款人的答案信息;  basicData: 基本问题的答案信息;
					//遍历保存答案信息
					for(int i = 0; i < dataTypes.length; i ++){
						String dataType = dataTypes[i];

						//获取相应类型的问题答案信息，并保存
                        JSONArray dataArray = (JSONArray)resultMap.get(dataType); //数据类别 data: 核身借款人的答案信息;  contactData: 核身借款人的答案信息;  basicData: 基本问题的答案信息;
						Iterator i1 = dataArray.iterator();
						while(i1.hasNext()){
                            JSONObject jsonObject = (JSONObject) i1.next();
							ExtWlZxtQuestionsDTO questionsDTO = new ExtWlZxtQuestionsDTO();
							questionsDTO.setVerId(verId);//核身问题ID
							questionsDTO.setDataType(dataType);//数据类别 data: 核身借款人的答案信息;  contactData: 核身借款人的答案信息;  basicData: 基本问题的答案信息;
							questionsDTO.setAnswerId((String)jsonObject.get("answerId"));//问题的ID号
							questionsDTO.setQuestion((String)jsonObject.get("question"));//问题题干
							questionsDTO.setQueStyle((String)jsonObject.get("queStyle"));//问题类型： 1：问答题 ； 2：选择题
                            if(null != jsonObject.get("answerResults"))
							    questionsDTO.setAnswers(jsonObject.get("answerResults").toString());//答案JSON数据的List
							questionsDTO.setCreateBy(-1L);

							extWlZxtQuestionsService.insertExtWlZxtQuestions(questionsDTO);
						}
					}

					interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
					interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_1.getValue());
				}else{

					interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_5.getKey());
					interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_5.getValue());
				}
			}

		} catch (Exception ex) {
			JYLoggerUtil.error(this.getClass(), "===查询增信通_核身问答信息获取接口异常===接口交易流水号:"+interfaceLogDto.getReqTransNo(), ex);
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
				JYLoggerUtil.error(this.getClass(), "===保存增信通_核身问答信息获取日志异常===接口交易流水号:"+interfaceLogDto.getReqTransNo(), e);
			}
		}
	}
}

