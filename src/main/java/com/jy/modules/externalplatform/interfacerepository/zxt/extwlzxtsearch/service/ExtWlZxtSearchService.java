package com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtsearch.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtblack.dto.ExtWlZxtBlackDTO;
import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtblack.service.ExtWlZxtBlackService;
import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtcourt.dto.ExtWlZxtCourtDTO;
import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtcourt.service.ExtWlZxtCourtService;
import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtcourtnoprom.dto.ExtWlZxtCourtNoPromDTO;
import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtcourtnoprom.service.ExtWlZxtCourtNoPromService;
import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtidentifyloss.dto.ExtWlZxtIdentifyLossDTO;
import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtidentifyloss.service.ExtWlZxtIdentifyLossService;
import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtloancountp.dto.ExtWlZxtLoanCountPDTO;
import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtloancountp.service.ExtWlZxtLoanCountPService;
import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtmodule.dto.ExtWlZxtModuleDTO;
import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtmodule.service.ExtWlZxtModuleService;
import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtnetbadp.dto.ExtWlZxtNetBadPDTO;
import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtnetbadp.service.ExtWlZxtNetBadPService;
import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtoverduectc.dto.ExtWlZxtOverdueCtCDTO;
import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtoverduectc.service.ExtWlZxtOverdueCtCService;
import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtphonebad.dto.ExtWlZxtPhoneBadDTO;
import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtphonebad.service.ExtWlZxtPhoneBadService;
import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtsearch.dao.ExtWlZxtSearchDao;
import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtsearch.dto.ExtWlZxtSearchDTO;
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

import java.io.Serializable;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @classname: ExtWlZxtSearchService
 * @description: 定义  增信通信贷信息搜索主表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtsearch.service.ExtWlZxtSearchService")
public class ExtWlZxtSearchService implements Serializable, ExtSaveMessageDao {

    private static final long serialVersionUID = 1L;
	private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	static Logger logger = LoggerFactory.getLogger(ExtWlZxtSearchService.class);

	@Autowired
	ExtInterfaceLogService extInterfaceLogService;

	@Autowired
	ExtWlZxtModuleService extWlZxtModuleService;

	@Autowired
	ExtWlZxtBlackService extWlZxtBlackService;

	@Autowired
	ExtWlZxtCourtService extWlZxtCourtService;

	@Autowired
	ExtWlZxtCourtNoPromService extWlZxtCourtNoPromService;

	@Autowired
	ExtWlZxtPhoneBadService extWlZxtPhoneBadService;

	@Autowired
	ExtWlZxtNetBadPService extWlZxtNetBadPService;

	@Autowired
	ExtWlZxtIdentifyLossService extWlZxtIdentifyLossService;

	@Autowired
	ExtWlZxtLoanCountPService extWlZxtLoanCountPService;

	@Autowired
	ExtWlZxtOverdueCtCService extWlZxtOverdueCtCService;

	@Autowired
	private ExtWlZxtSearchDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 增信通信贷信息搜索主表列表
     * @date 2017-12-14 19:05:48
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlZxtSearchDTO> searchExtWlZxtSearchByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlZxtSearchDTO> dataList =  dao.searchExtWlZxtSearchByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询增信通信贷信息搜索主表列表
     * @date 2017-12-14 19:05:48
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlZxtSearchDTO> searchExtWlZxtSearch(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlZxtSearchDTO> dataList = dao.searchExtWlZxtSearch(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询增信通信贷信息搜索主表对象
     * @date 2017-12-14 19:05:48
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlZxtSearchDTO queryExtWlZxtSearchByPrimaryKey(String id) throws Exception {
		
		ExtWlZxtSearchDTO dto = dao.findExtWlZxtSearchByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlZxtSearchDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlZxtSearch
     * @author Administrator
     * @description: 新增 增信通信贷信息搜索主表对象
     * @date 2017-12-14 19:05:48
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlZxtSearch(ExtWlZxtSearchDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlZxtSearch(paramMap);
		
		ExtWlZxtSearchDTO resultDto = (ExtWlZxtSearchDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlZxtSearch
     * @author Administrator
     * @description: 修改 增信通信贷信息搜索主表对象
     * @date 2017-12-14 19:05:48
     * @param dto
     * @return
     * @throws
     */
	public void updateExtWlZxtSearch(ExtWlZxtSearchDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlZxtSearch(paramMap);
	}
	/**
     * @title: deleteExtWlZxtSearchByPrimaryKey
     * @author Administrator
     * @description: 删除 增信通信贷信息搜索主表,按主键
     * @date 2017-12-14 19:05:48
     * @param baseDto, ids
     * @throws
     */ 
	public void deleteExtWlZxtSearchByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlZxtSearchByPrimaryKey(paramMap);
	}

	/**
	 * @methodName: saveMessage
	 * @param: [map]
	 * @describe: 增信通信用搜索主接口 返回信息数据落地
	 * @auther: 董康宁
	 * @date: 2017/12/14
	 * @time: 19:42
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

				//将返回报文转换为jsonObject 对象
				JSONObject resultJson = JSONObject.parseObject(result);

				//设置状态码、状态消息
				retCode = resultJson.getString("status");//状态码
				retMsg = resultJson.getString("msg");//状态消息

				//获取请求参数  获取模块编号，用于保存
				String paramsStr = map.get("params").toString();
				JSONObject paramsJson = JSONObject.parseObject(paramsStr);


				//200 查询成功
				if("200".equals(retCode)){
					isSuccess = "1";

					//1、增信通信贷信息搜索主表
					//保存 增信通信贷信息搜索主表
					ExtWlZxtSearchDTO searchDTO = new ExtWlZxtSearchDTO();
					if(StringUtils.isNotEmpty(intoCustomerRefId))
						searchDTO.setIntoCustRefId(Long.parseLong(intoCustomerRefId));
					searchDTO.setModuleNo(paramsJson.getString("module_no"));//json字符串 可以为多个
					searchDTO.setStatus(retCode);
					searchDTO.setMsg(retMsg);
					if(null != resultJson.get("data"))
						searchDTO.setData(resultJson.getString("data"));
					searchDTO.setCreateBy(-1L);

					//插入 增信通信贷信息搜索主表
					Long keyId  = this.insertExtWlZxtSearch(searchDTO);
					if(null != keyId)
						fkBizId = keyId.toString();

					//2、处理模块编号对应的接口数据
					JSONObject dataObj = resultJson.getJSONObject("data");
					//遍历 moduleNoArray 模块编码，按照模块编码 module_no 从paramsJson【data】中取出相应模块的接口返回信息
					JSONArray moduleNoArray = JSONObject.parseArray(paramsJson.get("module_no").toString());
					for(int i = 0; i < moduleNoArray.size(); i ++){
						String moduleNo = moduleNoArray.getString(i);//模块编码

						if(null != dataObj.get(moduleNo)){

							JSONObject moduleSingleJson = dataObj.getJSONObject(moduleNo);

							//2.1、模块查询状态表
							ExtWlZxtModuleDTO moduleDTO = new ExtWlZxtModuleDTO();
							moduleDTO.setSearchFkId(keyId);
							moduleDTO.setModuleNo(moduleNo);
							moduleDTO.setStatus(moduleSingleJson.getString("status"));
							moduleDTO.setMsg(moduleSingleJson.getString("msg"));
							moduleDTO.setCreateBy(-1L);

							Long moduleKeyId = extWlZxtModuleService.insertExtWlZxtModule(moduleDTO);

							//2.2、具体模块对应产品的接口信息表的处理
							if(moduleNo.equals("A102")){//A102:个人-黑名单
								this.dealBlackPerson(moduleSingleJson, moduleKeyId);
							}else if(moduleNo.equals("A301") || moduleNo.equals("B402")){//【A301】个人-法院被执行信息 【B402】单位-法院被执行信息
								this.dealCourt(moduleSingleJson, moduleKeyId);
							}else if(moduleNo.equals("A302") || moduleNo.equals("B403")){//【A302】个人-法院失信被执行信息 【B403】单位-法院失信被执行信息
								this.dealCourtNoProm(moduleSingleJson, moduleKeyId);
							}else if(moduleNo.equals("A401") || moduleNo.equals("B301")){//【A401】个人-手机号码负面标注信息 【B301】关联人-手机号码负面标注信息
								this.dealPhoneBad(moduleSingleJson, moduleKeyId);
							}else if(moduleNo.equals("A402") || moduleNo.equals("B302") || moduleNo.equals("B501")){//【A402】个人-网络负面舆情信息接口 【B302】关联人-网络负面舆情信息 【B501】单位-网络负面舆情信息
								this.dealNetBadP(moduleSingleJson, moduleKeyId);
							}else if(moduleNo.equals("A403")){//【A403】身份证挂失信息
								this.dealIdentifyLoss(moduleSingleJson, moduleKeyId);
							}else if(moduleNo.equals("A501") || moduleNo.equals("B202")){//【A501】个人-同业借贷申请次数【B202】关联人-同业借贷申请次数
								this.dealLoanCountPArray(moduleSingleJson, moduleKeyId);
							}else if(moduleNo.equals("A502") || moduleNo.equals("A503")){//【A502】个人-同业借贷申请对应不同手机号码次数【A503】个人-同业借贷申请对应不同单位次数
								this.dealLoanCountPSigle(moduleSingleJson, moduleKeyId);
							}else if(moduleNo.equals("B101")){//【B101】关联人-出现逾期黑名单次数
								this.dealOverdueCtC(moduleSingleJson, moduleKeyId);
							}

							interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
							interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_1.getValue());
						}else{

							logger.info("模块编号：" + moduleNo + "-对应的接口信息未获取");

							interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_2.getKey());
							interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_2.getValue());
						}

					}

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

	/**
	 * @methodName: dealBlackPerson
	 * @param: [moduleSingleJson, moduleKeyId]
	 * @describe: 个人-黑名单 数据保存
	 * @auther: 董康宁
	 * @date: 2017/12/15
	 * @time: 16:53
	 */
	private void dealBlackPerson(JSONObject moduleSingleJson, Long moduleKeyId) throws Exception {
		JSONObject moduleDataObj = moduleSingleJson.getJSONObject("data");//获取数据
		//获取数组
		if(null != moduleDataObj.get("black_summary")){
			JSONArray blackSummaryArray = moduleDataObj.getJSONArray("black_summary");

			//循环处理数组数据
			for(int j = 0; j < blackSummaryArray.size(); j ++){

				JSONObject blackObj = blackSummaryArray.getJSONObject(j);

				ExtWlZxtBlackDTO blackDTO = new ExtWlZxtBlackDTO();
				blackDTO.setModuleFkId(moduleKeyId);
				blackDTO.setBlackType(blackObj.getString("black_type"));//风险分类类型
				blackDTO.setItemName(blackObj.getString("item_name"));//风险分类项标签
				blackDTO.setLabel(blackObj.getString("label"));//风险分类项标签
				blackDTO.setItemValue(blackObj.getString("item_value"));//风险分类项值
				blackDTO.setRemarks(blackObj.getString("remarks"));
				blackDTO.setCreateBy(-1L);
				blackDTO.setCreateTime(new Timestamp(System.currentTimeMillis()));

				extWlZxtBlackService.insertExtWlZxtBlack(blackDTO);
			}
		}
	}
	/**
	 * @methodName: dealCourt
	 * @param: [moduleSingleJson, moduleKeyId]
	 * @describe: 法院被执行信息（包括单位、个人） 数据落地
	 * @auther: 董康宁
	 * @date: 2017/12/15
	 * @time: 16:55
	 */
	private void dealCourt(JSONObject moduleSingleJson, Long moduleKeyId) throws Exception {
		if(null != moduleSingleJson.get("data")){
			JSONArray moduleDataArray = moduleSingleJson.getJSONArray("data");//获取数据
			//循环处理数组数据
			for(int j = 0; j < moduleDataArray.size(); j ++){

				JSONObject jsonObj = moduleDataArray.getJSONObject(j);

				ExtWlZxtCourtDTO dto = new ExtWlZxtCourtDTO();
				dto.setModuleFkId(moduleKeyId);
				dto.setPersonName(jsonObj.getString("person_name"));//被执行人姓名
				dto.setIdNo(jsonObj.getString("id_no"));//身份证号码
				dto.setCorpNo(jsonObj.getString("corp_no"));//组织机构代码
				dto.setCaseNo(jsonObj.getString("case_no"));//案号
				dto.setCourt(jsonObj.getString("court"));//执行法院
				dto.setTime(jsonObj.getString("time"));//立案时间
				dto.setTitle(jsonObj.getString("title"));//标题
				dto.setObjective(jsonObj.getString("objective"));//执行标的
				dto.setContent(jsonObj.getString("content"));//内容
				dto.setApplicant(jsonObj.getString("applicant"));//申请人
				dto.setCaseStatus(jsonObj.getString("case_status"));//案件状态
				dto.setCreateBy(-1L);

				extWlZxtCourtService.insertExtWlZxtCourt(dto);
			}
		}else{
			logger.info("无法院被执行信息： moduleKeyId = " + moduleKeyId);
		}
	}


	/**
	 * @methodName: dealCourtNoProm
	 * @param: [moduleSingleJson, moduleKeyId]
	 * @describe: 法院失信被执行信息（包括单位、个人） 数据落地
	 * @auther: 董康宁
	 * @date: 2017/12/18
	 * @time: 13:36
	 */
	private void dealCourtNoProm(JSONObject moduleSingleJson, Long moduleKeyId) throws Exception {
		if(null != moduleSingleJson.get("data")){
			JSONArray moduleDataArray = moduleSingleJson.getJSONArray("data");//获取数据
			//循环处理数组数据
			for(int j = 0; j < moduleDataArray.size(); j ++){

				JSONObject jsonObj = moduleDataArray.getJSONObject(j);

				ExtWlZxtCourtNoPromDTO dto = new ExtWlZxtCourtNoPromDTO();
				dto.setModuleFkId(moduleKeyId);
				dto.setTime(jsonObj.getString("time"));//立案时间
				dto.setSex(jsonObj.getString("sex"));//被执行人性别
				dto.setExecution(jsonObj.getString("execution"));//被执行人的履行情况
				dto.setDocumentNo(jsonObj.getString("document_no"));//执行依据文号
				dto.setPersonConcerned(jsonObj.getString("person_concerned"));//相关当事人
				dto.setCourt(jsonObj.getString("court"));//执行法院
				dto.setIdNo(jsonObj.getString("id_no"));//身份证号码
				dto.setCorpNo(jsonObj.getString("corp_no"));//组织机构代码
				dto.setExecutionUnit(jsonObj.getString("execution_unit"));//做出执行依据单位
				dto.setReason(jsonObj.getString("reason"));//失信被执行人行为具体情形
				dto.setObligation(jsonObj.getString("obligation"));//生效法律文书确定的义务
				dto.setAge(jsonObj.getString("age"));//被执行人年龄
				dto.setPersonName(jsonObj.getString("person_name"));//被执行人姓名
				dto.setProvince(jsonObj.getString("province"));//法院所属省份
				dto.setCaseNo(jsonObj.getString("case_no"));//案号
				dto.setPublishTime(jsonObj.getString("publish_time"));//发布时间
				dto.setCreateBy(-1L);

				extWlZxtCourtNoPromService.insertExtWlZxtCourtNoProm(dto);
			}
		}else{
			logger.info("无法院失信被执行信息： moduleKeyId = " + moduleKeyId);
		}
	}

	/**
	 * @methodName: dealPhoneBad
	 * @param: [moduleSingleJson, moduleKeyId]
	 * @describe: 手机号码负面标注信息 数据落地
	 * @auther: 董康宁
	 * @date: 2017/12/18
	 * @time: 13:49
	 */
	private void dealPhoneBad(JSONObject moduleSingleJson, Long moduleKeyId) throws Exception {
		if(null != moduleSingleJson.get("data")){
			JSONArray moduleDataArray = moduleSingleJson.getJSONArray("data");//获取数据
			//循环处理数组数据
			for(int j = 0; j < moduleDataArray.size(); j ++){

				JSONObject jsonObj = moduleDataArray.getJSONObject(j);

				ExtWlZxtPhoneBadDTO dto = new ExtWlZxtPhoneBadDTO();
				dto.setModuleFkId(moduleKeyId);
				dto.setTitle(jsonObj.getString("title"));//标题
				dto.setAbstract_(jsonObj.getString("abstract"));//摘要
				dto.setMobileNo(jsonObj.getString("mobile_no"));//关联人手机号
				dto.setUrl(jsonObj.getString("url"));//链接
				dto.setNegKeyWord(jsonObj.getString("neg_key_word"));//负面词
				dto.setTime(jsonObj.getString("time"));//时间戳
				dto.setCreateBy(-1L);

				extWlZxtPhoneBadService.insertExtWlZxtPhoneBad(dto);
			}
		}else{
			logger.info("无手机号码负面标注信息： moduleKeyId = " + moduleKeyId);
		}
	}


	/**
	 * @methodName: dealPhoneBad
	 * @param: [moduleSingleJson, moduleKeyId]
	 * @describe: 网络负面舆情信息 数据落地
	 * @auther: 董康宁
	 * @date: 2017/12/18
	 * @time: 13:49
	 */
	private void dealNetBadP(JSONObject moduleSingleJson, Long moduleKeyId) throws Exception {
		if(null != moduleSingleJson.get("data")){
			JSONArray moduleDataArray = moduleSingleJson.getJSONArray("data");//获取数据
			//循环处理数组数据
			for(int j = 0; j < moduleDataArray.size(); j ++){

				JSONObject jsonObj = moduleDataArray.getJSONObject(j);

				ExtWlZxtNetBadPDTO dto = new ExtWlZxtNetBadPDTO();
				dto.setModuleFkId(moduleKeyId);
				dto.setTitle(jsonObj.getString("title"));//标题
				dto.setMobileNo(jsonObj.getString("mobile_no"));//关联人手机号
				dto.setAbstract_(jsonObj.getString("abstract"));//摘要
				dto.setUrl(jsonObj.getString("url"));//链接
				dto.setNegKeyWord(jsonObj.getString("neg_key_word"));//负面词
				dto.setSearchKey(jsonObj.getString("search_key"));//匹配字段
				dto.setTime(jsonObj.getString("time"));//时间戳
				dto.setCreateBy(-1L);

				extWlZxtNetBadPService.insertExtWlZxtNetBadP(dto);
			}
		}else{
			logger.info("无网络负面舆情信息： moduleKeyId = " + moduleKeyId);
		}
	}


	/**
	 * @methodName: dealNetBadP
	 * @param: [moduleSingleJson, moduleKeyId]
	 * @describe: 【A403】身份证挂失信息 数据落地
	 * @auther: 董康宁
	 * @date: 2017/12/18
	 * @time: 15:17
	 */
	private void dealIdentifyLoss(JSONObject moduleSingleJson, Long moduleKeyId) throws Exception {
		if(null != moduleSingleJson.get("data")){
			JSONArray moduleDataArray = moduleSingleJson.getJSONArray("data");//获取数据
			//循环处理数组数据
			for(int j = 0; j < moduleDataArray.size(); j ++){

				JSONObject jsonObj = moduleDataArray.getJSONObject(j);

				ExtWlZxtIdentifyLossDTO dto = new ExtWlZxtIdentifyLossDTO();
				dto.setModuleFkId(moduleKeyId);
				dto.setIdNo(jsonObj.getString("id_no"));//身份证号
				dto.setName(jsonObj.getString("name"));//姓名
				dto.setLostDate(jsonObj.getString("lost_date"));//挂失时间
				dto.setUrl(jsonObj.getString("url"));//链接
				dto.setMatchType(jsonObj.getString("match_type"));//匹配类型 0=模糊匹配，1=精准匹配
				dto.setCreateBy(-1L);

				extWlZxtIdentifyLossService.insertExtWlZxtIdentifyLoss(dto);
			}
		}else{
			logger.info("无身份证挂失信息： moduleKeyId = " + moduleKeyId);
		}
	}
	/**
	 * @methodName: dealLoanCountPArray
	 * @param: [moduleSingleJson, moduleKeyId]
	 * @describe: 【A501】个人-同业借贷申请次数 【B202】关联人-同业借贷申请次数接口 数据落地
	 * @auther: 董康宁
	 * @date: 2017/12/18
	 * @time: 15:17
	 */
	private void dealLoanCountPArray(JSONObject moduleSingleJson, Long moduleKeyId) throws Exception {
		if(null != moduleSingleJson.get("data")){
			JSONArray moduleDataArray = moduleSingleJson.getJSONArray("data");//获取数据
			//循环处理数组数据
			for(int j = 0; j < moduleDataArray.size(); j ++){

				JSONObject jsonObj = moduleDataArray.getJSONObject(j);

				ExtWlZxtLoanCountPDTO dto = new ExtWlZxtLoanCountPDTO();
				dto.setModuleFkId(moduleKeyId);
				dto.setOrgBizType(jsonObj.getString("org_biz_type"));//机构类型
				dto.setMobileNo(jsonObj.getString("mobile_no"));//关联人手机号
				dto.setInLatest7Dates(jsonObj.getString("in_latest_7_dates"));//近 7 天申请次数
				dto.setInLatest30Dates(jsonObj.getString("in_latest_30_dates"));//近 30 天申请次数
				dto.setInLatest90Dates(jsonObj.getString("in_latest_90_dates"));//近 90 天申请次数
				dto.setInLatest180Dates(jsonObj.getString("in_latest_180_dates"));//近 180 天申请次数
				dto.setRecentlyDate(jsonObj.getString("recently_date"));//最近一次申请时间
				dto.setCreateBy(-1L);

				extWlZxtLoanCountPService.insertExtWlZxtLoanCountP(dto);
			}
		}else{
			logger.info("无身份证挂失信息： moduleKeyId = " + moduleKeyId);
		}
	}
	/**
	 * @methodName: dealLoanCountPSigle
	 * @param: [moduleSingleJson, moduleKeyId]
	 * @describe: 【A501】个人-同业借贷申请次数 【B202】关联人-同业借贷申请次数接口 数据落地
	 * @auther: 董康宁
	 * @date: 2017/12/18
	 * @time: 15:17
	 */
	private void dealLoanCountPSigle(JSONObject moduleSingleJson, Long moduleKeyId) throws Exception {
		if(null != moduleSingleJson.get("data")){
			JSONObject moduleDataObject = moduleSingleJson.getJSONObject("data");//获取数据

			ExtWlZxtLoanCountPDTO dto = new ExtWlZxtLoanCountPDTO();
			dto.setModuleFkId(moduleKeyId);
			dto.setInLatest7Dates(moduleDataObject.getString("in_latest_7_dates"));//近 7 天申请次数
			dto.setInLatest30Dates(moduleDataObject.getString("in_latest_30_dates"));//近 30 天申请次数
			dto.setInLatest90Dates(moduleDataObject.getString("in_latest_90_dates"));//近 90 天申请次数
			dto.setInLatest180Dates(moduleDataObject.getString("in_latest_180_dates"));//近 180 天申请次数
			dto.setCreateBy(-1L);

			extWlZxtLoanCountPService.insertExtWlZxtLoanCountP(dto);
		}else{
			logger.info("无身份证挂失信息： moduleKeyId = " + moduleKeyId);
		}
	}


	
	/**
	 * @methodName: dealOverdueCtC
	 * @param: [moduleSingleJson, moduleKeyId]
	 * @describe: 【B101】关联人-出现逾期黑名单次数 数据落地
	 * @auther: 董康宁
	 * @date: 2017/12/18
	 * @time: 16:14
	 */
	private void dealOverdueCtC(JSONObject moduleSingleJson, Long moduleKeyId) throws Exception {
		if(null != moduleSingleJson.get("data")){
			JSONArray moduleDataArray = moduleSingleJson.getJSONArray("data");//获取数据
			//循环处理数组数据
			for(int j = 0; j < moduleDataArray.size(); j ++){

				JSONObject jsonObj = moduleDataArray.getJSONObject(j);

				ExtWlZxtOverdueCtCDTO dto = new ExtWlZxtOverdueCtCDTO();
				dto.setModuleFkId(moduleKeyId);
				dto.setMobileNo(jsonObj.getString("mobile_no"));//关联人手机号
				dto.setCount(jsonObj.getString("count"));//次数
				dto.setCreateBy(-1L);

				extWlZxtOverdueCtCService.insertExtWlZxtOverdueCtC(dto);
			}
		}else{
			logger.info("无身份证挂失信息： moduleKeyId = " + moduleKeyId);
		}
	}
}

