package com.jy.modules.externalplatform.interfacerepository.hfgr.extlawxppersonalinfo.service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jodd.util.StringUtil;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersoncase.dao.ExtLawPersonCaseDao;
import com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersoncase.dto.ExtLawPersonCaseDTO;
import com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersoncq.dao.ExtLawPersonCqDao;
import com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersoncq.dto.ExtLawPersonCqDTO;
import com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersondishonesty.dao.ExtLawPersonDishonestyDao;
import com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersondishonesty.dto.ExtLawPersonDishonestyDTO;
import com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersonexe.dao.ExtLawPersonExeDao;
import com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersonexe.dto.ExtLawPersonExeDTO;
import com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersonloanoverdue.dao.ExtLawPersonLoanoverdueDao;
import com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersonloanoverdue.dto.ExtLawPersonLoanoverdueDTO;
import com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersontax.dao.ExtLawPersonTaxDao;
import com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersontax.dto.ExtLawPersonTaxDTO;
import com.jy.modules.externalplatform.interfacerepository.hfgr.extlawxppersonalinfo.dao.ExtLawxpPersonalInfoDao;
import com.jy.modules.externalplatform.interfacerepository.hfgr.extlawxppersonalinfo.dto.ExtLawxpPersonalInfoDTO;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.ExtConstant;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.BaseDTO;
import com.jy.platform.core.common.JYLoggerUtil;

/**
 * @classname: ExtLawxpPersonalInfoService
 * @description: 定义 汇法网个人信息主表 实现类
 * @author: Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.hfgr.extlawxppersonalinfo.service.ExtLawxpPersonalInfoService")
public class ExtLawxpPersonalInfoService implements ExtSaveMessageDao {
	private static SimpleDateFormat format = new SimpleDateFormat(
			"yyyy-MM-dd hh:mm:ss");

	@Autowired
	ExtInterfaceLogService extInterfaceLogService;

	@Autowired
	private ExtLawxpPersonalInfoDao dao;

	@Autowired
	private ExtLawPersonExeDao exeDao;

	@Autowired
	private ExtLawPersonCaseDao caseDao;

	@Autowired
	private ExtLawPersonDishonestyDao dishonestyDao;

	@Autowired
	private ExtLawPersonTaxDao taxDao;

	@Autowired
	private ExtLawPersonCqDao cqDao;

	@Autowired
	private ExtLawPersonLoanoverdueDao netLoanDao;

	/**
	 * @author Administrator
	 * @description: 分页查询 汇法网个人信息主表列表
	 * @date 2017-05-31 11:09:16
	 * @param searchParams
	 *            条件
	 * @return
	 * @throws
	 */
	public List<ExtLawxpPersonalInfoDTO> searchExtLawxpPersonalInfoByPaging(
			Map<String, Object> searchParams) throws Exception {
		List<ExtLawxpPersonalInfoDTO> dataList = dao.searchExtLawxpPersonalInfoByPaging(searchParams);
		return dataList;
	}

	/**
	 * @author Administrator
	 * @description: 按条件查询汇法网个人信息主表列表
	 * @date 2017-05-31 11:09:16
	 * @param searchParams
	 *            条件
	 * @return
	 * @throws
	 */
	public List<ExtLawxpPersonalInfoDTO> searchExtLawxpPersonalInfo(
			Map<String, Object> searchParams) throws Exception {
		List<ExtLawxpPersonalInfoDTO> dataList = dao.searchExtLawxpPersonalInfo(searchParams);
		return dataList;
	}

	/**
	 * @author Administrator
	 * @description: 查询汇法网个人信息主表对象
	 * @date 2017-05-31 11:09:16
	 * @param id
	 * @return
	 * @throws
	 */
	public ExtLawxpPersonalInfoDTO queryExtLawxpPersonalInfoByPrimaryKey(
			String id) throws Exception {

		ExtLawxpPersonalInfoDTO dto = dao.findExtLawxpPersonalInfoByPrimaryKey(id);

		if (dto == null)
			dto = new ExtLawxpPersonalInfoDTO();

		return dto;

	}

	/**
	 * @title: insertExtLawxpPersonalInfo
	 * @author Administrator
	 * @description: 新增 汇法网个人信息主表对象
	 * @date 2017-05-31 11:09:16
	 * @param dto
	 * @return
	 * @throws
	 */
	@SuppressWarnings("all")
	public Long insertExtLawxpPersonalInfo(ExtLawxpPersonalInfoDTO dto)
			throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);

		int count = dao.insertExtLawxpPersonalInfo(paramMap);

		ExtLawxpPersonalInfoDTO resultDto = (ExtLawxpPersonalInfoDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}

	/**
	 * @title: updateExtLawxpPersonalInfo
	 * @author Administrator
	 * @description: 修改 汇法网个人信息主表对象
	 * @date 2017-05-31 11:09:16
	 * @param paramMap
	 * @return
	 * @throws
	 */
	public void updateExtLawxpPersonalInfo(ExtLawxpPersonalInfoDTO dto)
			throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);

		dao.updateExtLawxpPersonalInfo(paramMap);
	}

	/**
	 * @title: deleteExtLawxpPersonalInfoByPrimaryKey
	 * @author Administrator
	 * @description: 删除 汇法网个人信息主表,按主键
	 * @date 2017-05-31 11:09:16
	 * @param paramMap
	 * @throws
	 */
	public void deleteExtLawxpPersonalInfoByPrimaryKey(BaseDTO baseDto,
			String ids) throws Exception {
		if (StringUtils.isEmpty(ids))
			throw new Exception("删除失败！传入的参数主键为null");

		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtLawxpPersonalInfoByPrimaryKey(paramMap);
	}

	/**
	 * 接口返回数据保存
	 * 
	 * @param interfaceId
	 * @param productCode
	 * @param orgCode
	 * @param sysCode
	 * @param paramsMap
	 * @param result
	 */
	public void saveMessage(Map<String, Object> map) {
		
		String isSuccess = "0"; // 设置接口是否调用成功 "1"：成功 ， "0"：失败
		String retCode = ""; //接口返回码
		String retMsg = ""; //接口返回信息
		String fkBizId = "";// 关联字段
		// 日志信息
		ExtInterfaceLogDTO interfaceLogDto = (ExtInterfaceLogDTO) map.get("interfaceLogDto");
		String results = String.valueOf(map.get("result"));
		ExtLawxpPersonalInfoDTO dtolog = new ExtLawxpPersonalInfoDTO();
		try {
			if (StringUtils.isNotEmpty((CharSequence) map.get("result"))
					&& !"null".equals(map.get("result"))) {
				JSONObject ob = JSONObject.fromObject(map.get("result"));
				
				if(null != ob.get("message")){
					retMsg = ob.get("message").toString(); //补充设置返回信息，用于留存记录
				}
				if(null != ob.get("success")){
					retCode = ob.get("success").toString(); //补充设置返回信息，用于留存记录
				}
				
				if (null != ob.get("retCode")
						&& ob.get("retCode").equals("500")) {
					ExtLawxpPersonalInfoDTO dto = new ExtLawxpPersonalInfoDTO();
					Map<String, Object> personalParams2 = new HashMap<String, Object>();
					dto.setProdCode(String.valueOf(map.get("prod")));
					dto.setOrgCode(String.valueOf(map.get("org")));
					dto.setSysCode(String.valueOf(map.get("sysCode")));
					dto.setName(String.valueOf(map.get("n")));
					dto.setCidorcode(String.valueOf(map.get("id")));
					dto.setRetcode(InterfaceEnum.RET_CODE_6.getKey());
					dto.setErrormsg(String.valueOf(ob.get("errorDesc")));
					dto.setRemark(String.valueOf(ob.get("errorDesc")));
					interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_6
							.getKey());
					interfaceLogDto.setRetMsg(String.valueOf(ob
							.get("errorDesc")));
					personalParams2.put("dto", dto);
					dao.insertExtLawxpPersonalInfo(personalParams2);
					BeanUtils.copyProperties(dto, dtolog);
					personalParams2.clear();
				} else {
					isSuccess = "1";// 补充设置接口调用成功，用于留存记录
					String result = String.valueOf(map.get("result"))
							.replaceAll("date", "adjudicateDate");
					JSONObject jsonObject = JSONObject.fromObject(result);
					JSONArray jSONArray = jsonObject.getJSONArray("models");
					// 将获取的JSONArray转化为LbtLawxpPersonalInfoDTO对象列表
					List<ExtLawxpPersonalInfoDTO> list = JSONArray.toList(
							jSONArray, ExtLawxpPersonalInfoDTO.class);
					Map<String, Object> personalParams = new HashMap<String, Object>();
					Map<String, Object> params = new HashMap<String, Object>();
					if (CollectionUtils.isEmpty(list)) {
						ExtLawxpPersonalInfoDTO dto = new ExtLawxpPersonalInfoDTO();
						dto.setProdCode(String.valueOf(map.get("prod")));
						dto.setOrgCode(String.valueOf(map.get("org")));
						dto.setSysCode(String.valueOf(map.get("sysCode")));
						dto.setName(String.valueOf(map.get("n")));
						dto.setCidorcode(String.valueOf(map.get("id")));
						dto.setRetcode(InterfaceEnum.RET_CODE_2.getKey());
						dto.setErrormsg(jsonObject.getString("message"));
						dto.setRemark("汇法征信个人查询接口查无！");
						dto.setInterfaceId(String.valueOf(map
								.get("interfaceId")));
						interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_2
								.getKey());
						interfaceLogDto.setRetMsg("汇法征信个人查询接口查无！");
						personalParams.put("dto", dto);
						dao.insertExtLawxpPersonalInfo(personalParams);
						BeanUtils.copyProperties(dto, dtolog);
						personalParams.clear();
					} else if (CollectionUtils.isNotEmpty(list)) {
						
						// 汇法网个人信息保存
						ExtLawxpPersonalInfoDTO personalDto = new ExtLawxpPersonalInfoDTO();
						personalDto
								.setProdCode(String.valueOf(map.get("prod")));
						personalDto.setOrgCode(String.valueOf(map.get("org")));
						personalDto.setSysCode(String.valueOf(map
								.get("sysCode")));
						personalDto.setName(String.valueOf(map.get("n")));
						personalDto.setCidorcode(String.valueOf(map.get("id")));
						personalDto.setRetcode(InterfaceEnum.RET_CODE_1
								.getKey());
						personalDto.setRemark("汇法征信个人查询接口查有！");
						personalDto.setInterfaceId(String.valueOf(map
								.get("interfaceId")));
						interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1
								.getKey());
						interfaceLogDto.setRetMsg("汇法征信个人查询接口查有！");
						personalParams.put("dto", personalDto);
						//插入数据 并返回数据
						/*dao.insertExtLawxpPersonalInfo(personalParams);*/
						Long id = this.insertExtLawxpPersonalInfo(personalDto);
						if(null != id){
							fkBizId = String.valueOf(id);
						}
						BeanUtils.copyProperties(personalDto, dtolog);
						personalParams.clear();
						for (int i = 0; i < list.size(); i++) {
							ExtLawxpPersonalInfoDTO dto = list.get(i);
							JSONObject object = (JSONObject) jSONArray.get(i);
							String str = (String) object.get("json");
							JSONObject json = new JSONObject();
							if (StringUtils.isNotEmpty(str) && str.length() > 1) {
								json.put("json",
										str.substring(1, str.length() - 1));
								json = json.getJSONObject("json");
							}
							if (ExtConstant.LAW_PERSON_EXE
									.equals(dto.getType())) { // 汇法网个人执行信息保存
																// ，同时更新主表信息
								personalDto.setExeMsg(InterfaceEnum.RET_MSG
										.getKey());
								BeanUtils.copyProperties(personalDto, dtolog);
								personalParams.put("dto", personalDto);
								dao.updateExtLawxpPersonalInfo(personalParams);

								ExtLawPersonExeDTO exe = (ExtLawPersonExeDTO) JSONObject
										.toBean(json, ExtLawPersonExeDTO.class);
								exe.setFkId(personalDto.getId());
								exe.setKeyid(dto.getKeyid());
								exe.setDatatime(dto.getDatatime());
								params.put("dto", exe);
								exeDao.insertExtLawPersonExe(params);
								params.clear();
							} else if (ExtConstant.LAW_PERSON_CASE.equals(dto
									.getType())) {// 汇法网个人案例信息保存，同时更新主表信息
								personalDto.setCaseMsg(InterfaceEnum.RET_MSG
										.getKey());
								BeanUtils.copyProperties(personalDto, dtolog);
								personalParams.put("dto", personalDto);
								dao.updateExtLawxpPersonalInfo(personalParams);

								ExtLawPersonCaseDTO cs = (ExtLawPersonCaseDTO) JSONObject
										.toBean(json, ExtLawPersonCaseDTO.class);
								cs.setFkId(personalDto.getId());
								cs.setKeyid(dto.getKeyid());
								cs.setDatatime(dto.getDatatime());
								params.put("dto", cs);
								caseDao.insertExtLawPersonCase(params);
								params.clear();
							} else if (ExtConstant.LAW_PERSON_DISHONESTY
									.equals(dto.getType())) {// 汇法网个人失信信息保存，同时更新主表信息
								personalDto
										.setDishonestyMsg(InterfaceEnum.RET_MSG
												.getKey());
								BeanUtils.copyProperties(personalDto, dtolog);
								personalParams.put("dto", personalDto);
								dao.updateExtLawxpPersonalInfo(personalParams);

								ExtLawPersonDishonestyDTO dishonesty = (ExtLawPersonDishonestyDTO) JSONObject
										.toBean(json,
												ExtLawPersonDishonestyDTO.class);
								dishonesty.setFkId(personalDto.getId());
								dishonesty.setKeyid(dto.getKeyid());
								dishonesty.setDatatime(dto.getDatatime());
								params.put("dto", dishonesty);
								dishonestyDao
										.insertExtLawPersonDishonesty(params);
								params.clear();
							} else if (ExtConstant.LAW_PERSON_TAX.equals(dto
									.getType())) {// 汇法网个人税务信息保存，同时更新主表信息
								personalDto.setTaxMsg(InterfaceEnum.RET_MSG
										.getKey());
								BeanUtils.copyProperties(personalDto, dtolog);
								personalParams.put("dto", personalDto);
								dao.updateExtLawxpPersonalInfo(personalParams);

								ExtLawPersonTaxDTO tax = (ExtLawPersonTaxDTO) JSONObject
										.toBean(json, ExtLawPersonTaxDTO.class);
								tax.setFkId(personalDto.getId());
								tax.setKeyid(dto.getKeyid());
								tax.setDatatime(dto.getDatatime());
								params.put("dto", tax);
								taxDao.insertExtLawPersonTax(params);
								params.clear();
							} else if (ExtConstant.LAW_PERSON_CQ.equals(dto
									.getType())) {// 汇法网个人催欠信息保存，同时更新主表信息
								personalDto.setCqMsg(InterfaceEnum.RET_MSG
										.getKey());
								BeanUtils.copyProperties(personalDto, dtolog);
								personalParams.put("dto", personalDto);
								dao.updateExtLawxpPersonalInfo(personalParams);

								ExtLawPersonCqDTO cq = (ExtLawPersonCqDTO) JSONObject
										.toBean(json, ExtLawPersonCqDTO.class);
								cq.setFkId(personalDto.getId());
								cq.setKeyid(dto.getKeyid());
								cq.setDatatime(dto.getDatatime());
								params.put("dto", cq);
								cqDao.insertExtLawPersonCq(params);
								params.clear();
							} else if (ExtConstant.LAW_PERSON_NETLOAN
									.equals(dto.getType())) {// 汇法网个人网贷逾期信息保存，同时更新主表信息
								personalDto
										.setLoanoverdueMsg(InterfaceEnum.RET_MSG
												.getKey());
								BeanUtils.copyProperties(personalDto, dtolog);
								personalParams.put("dto", personalDto);
								dao.updateExtLawxpPersonalInfo(personalParams);

								ExtLawPersonLoanoverdueDTO netLoan = (ExtLawPersonLoanoverdueDTO) JSONObject
										.toBean(json,
												ExtLawPersonLoanoverdueDTO.class);
								netLoan.setFkId(personalDto.getId());
								netLoan.setKeyid(dto.getKeyid());
								netLoan.setDatatime(dto.getDatatime());
								params.put("dto", netLoan);
								netLoanDao
										.insertExtLawPersonLoanoverdue(params);
								params.clear();
							}

						}
					}
				}
			} else {
				Map<String, Object> params = new HashMap<String, Object>();
				ExtLawxpPersonalInfoDTO dto = new ExtLawxpPersonalInfoDTO();
				dto.setProdCode(String.valueOf(map.get("prod")));
				dto.setOrgCode(String.valueOf(map.get("org")));
				dto.setSysCode(String.valueOf(map.get("sysCode")));
				dto.setName(String.valueOf(map.get("n")));
				dto.setCidorcode(String.valueOf(map.get("id")));
				dto.setInterfaceId(String.valueOf(map.get("interfaceId")));
				dto.setRetcode(InterfaceEnum.RET_CODE_3.getKey());
				dto.setErrormsg("汇法征信个人查询调用接口报错");
				dto.setRemark("汇法征信个人查询调用接口报错");
				interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				interfaceLogDto.setRetMsg("汇法征信个人查询调用接口报错！");
				params.put("dto", dto);
				dao.insertExtLawxpPersonalInfo(params);
				BeanUtils.copyProperties(dto, dtolog);
			}

		} catch (Exception ex) {
			JYLoggerUtil.error(this.getClass(), "===汇法征信个人查询接口异常===接口日志ID:"
					+ String.valueOf(map.get("interfaceId")), ex);
			Map<String, Object> params = new HashMap<String, Object>();
			ExtLawxpPersonalInfoDTO dto = new ExtLawxpPersonalInfoDTO();
			dto.setProdCode(String.valueOf(map.get("prod")));
			dto.setOrgCode(String.valueOf(map.get("org")));
			dto.setSysCode(String.valueOf(map.get("sysCode")));
			dto.setName(String.valueOf(map.get("n")));
			dto.setCidorcode(String.valueOf(map.get("id")));
			dto.setInterfaceId(String.valueOf(map.get("interfaceId")));
			String msg = ex.getMessage();
			if (StringUtil.isNotEmpty(msg)) {
				if (msg.contains("A JSONObject text must begin with '{' at character 1 of")) {
					dto.setRetcode(InterfaceEnum.RET_CODE_3.getKey());
					dto.setErrormsg("汇法征信个人查询接口异常请求返回，请联系IT解决");
					dto.setRemark("汇法征信个人查询接口调用报错");
					interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3
							.getKey());
					interfaceLogDto.setRetMsg("汇法征信个人查询接口异常请求返回，请联系IT解决");
				} else if (msg.length() > 2000) {
					dto.setRetcode(InterfaceEnum.RET_CODE_4.getKey());
					dto.setErrormsg("汇法征信个人查询接口异常:" + msg.substring(0, 2000));
					dto.setRemark("汇法征信个人查询接口调用报错");
					interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4
							.getKey());
					interfaceLogDto.setRetMsg("汇法征信个人查询接口返回信息解析出错:"
							+ msg.substring(0, 2000));
				} else {
					dto.setRetcode(InterfaceEnum.RET_CODE_4.getKey());
					dto.setErrormsg("汇法征信个人查询接口异常:" + msg);
					dto.setRemark("汇法征信个人查询接口返回信息解析出错");
					interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4
							.getKey());
					interfaceLogDto.setRetMsg("汇法征信个人查询接口返回信息解析出错:" + msg);
				}
			}
			params.put("dto", dto);
			dao.insertExtLawxpPersonalInfo(params);
			BeanUtils.copyProperties(dto, dtolog);
		} finally {
			try {
				interfaceLogDto.setRetBody(results);
				interfaceLogDto.setExt2(isSuccess);
				interfaceLogDto.setExt3(retCode);
				interfaceLogDto.setExt4(retMsg);
				interfaceLogDto.setExt5(fkBizId);//保存 主表 主键 用于关联查询
				Long keyId = extInterfaceLogService.insertExtInterfaceLog(interfaceLogDto);
				dtolog.setInterfaceId(String.valueOf(keyId));
				this.updateExtLawxpPersonalInfo(dtolog);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

	}
}
