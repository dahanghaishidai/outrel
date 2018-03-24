package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgbaseinfo.service;

import com.alibaba.fastjson.JSONObject;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgbaseinfo.dao.ExtWlJxlMgBaseInfoDao;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgbaseinfo.dto.*;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcongrscore.dto.ExtWlJxlMgConGrScoreDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcongrscore.service.ExtWlJxlMgConGrScoreService;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgconreladist.dto.ExtWlJxlMgConReladistDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgconreladist.service.ExtWlJxlMgConReladistService;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgconsulabel.dto.ExtWlJxlMgConsuLabelDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgconsulabel.service.ExtWlJxlMgConsuLabelService;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcontactrfm.dto.ExtWlJxlMgContactRfmDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcontactrfm.service.ExtWlJxlMgContactRfmService;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcontaquery.dto.ExtWlJxlMgContaQueryDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcontaquery.service.ExtWlJxlMgContaQueryService;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcontclosest.dto.ExtWlJxlMgContClosestDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcontclosest.service.ExtWlJxlMgContClosestService;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcontnumsta.dto.ExtWlJxlMgContNumStaDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcontnumsta.service.ExtWlJxlMgContNumStaService;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgidcardnames.dto.ExtWlJxlMgIdcardnamesDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgidcardnames.service.ExtWlJxlMgIdcardnamesService;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgidcardorgs.dto.ExtWlJxlMgIdcardorgsDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgidcardorgs.service.ExtWlJxlMgIdcardorgsService;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgidcardphones.dto.ExtWlJxlMgIdcardphonesDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgidcardphones.service.ExtWlJxlMgIdcardphonesService;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgphoneidcards.dto.ExtWlJxlMgPhoneidcardsDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgphoneidcards.service.ExtWlJxlMgPhoneidcardsService;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgphonenames.dto.ExtWlJxlMgPhonenamesDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgphonenames.service.ExtWlJxlMgPhonenamesService;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgphoneorgs.dto.ExtWlJxlMgPhoneorgsDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgphoneorgs.service.ExtWlJxlMgPhoneorgsService;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgregorgstat.dto.ExtWlJxlMgRegOrgStatDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgregorgstat.service.ExtWlJxlMgRegOrgStatService;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgseahisbyday.dto.ExtWlJxlMgSeahisBydayDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgseahisbyday.service.ExtWlJxlMgSeahisBydayService;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmguserbasic.dto.ExtWlJxlMgUserBasicDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmguserbasic.service.ExtWlJxlMgUserBasicService;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmguserblacklist.dto.ExtWlJxlMgUserBlacklistDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmguserblacklist.service.ExtWlJxlMgUserBlacklistService;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgusergray.dto.ExtWlJxlMgUserGrayDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgusergray.service.ExtWlJxlMgUserGrayService;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgusersechbyo.dto.ExtWlJxlMgUserSechByODTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgusersechbyo.service.ExtWlJxlMgUserSechByOService;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.BaseDTO;
import com.jy.platform.core.common.JYLoggerUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @classname: ExtWlJxlMgBaseInfoService
 * @description: 定义  聚信立蜜罐主表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgbaseinfo.service.ExtWlJxlMgBaseInfoService")
public class ExtWlJxlMgBaseInfoService implements Serializable, ExtSaveMessageDao {

	private static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

	@Autowired
	private ExtInterfaceLogService extInterfaceLogService;

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlJxlMgBaseInfoDao dao;
	@Autowired
	private ExtWlJxlMgIdcardnamesService idcardnamesService;

	@Autowired
	private ExtWlJxlMgIdcardorgsService idcardorgsService;
	@Autowired
	private ExtWlJxlMgIdcardphonesService idcardphonesService;
	@Autowired
	private ExtWlJxlMgPhoneidcardsService phoneidcardsService;
	@Autowired
	private ExtWlJxlMgPhonenamesService phonenamesService;
	@Autowired
	private ExtWlJxlMgPhoneorgsService phoneorgsService;
	@Autowired
	private ExtWlJxlMgRegOrgStatService regOrgStatService;
	@Autowired
	private ExtWlJxlMgUserBasicService userBasicService;
	@Autowired
	private ExtWlJxlMgUserBlacklistService userBlacklistService;
	@Autowired
	private ExtWlJxlMgUserGrayService userGrayService;
	@Autowired
	private ExtWlJxlMgUserSechByOService userSechByOService;
	@Autowired
	private ExtWlJxlBlacklistDetailsService blacklistDetailsService;

	@Autowired
	private ExtWlJxlMgConGrScoreService extWlJxlMgConGrScoreService;
	@Autowired
	private ExtWlJxlMgConReladistService extWlJxlMgConReladistService;
	@Autowired
	private ExtWlJxlMgContactRfmService extWlJxlMgContactRfmService;
	@Autowired
	private ExtWlJxlMgContaQueryService extWlJxlMgContaQueryService;
	@Autowired
	private ExtWlJxlMgContClosestService extWlJxlMgContClosestService;
	@Autowired
	private ExtWlJxlMgContNumStaService extWlJxlMgContNumStaService;
	@Autowired
	private ExtWlJxlMgConsuLabelService extWlJxlMgConsuLabelService;
	@Autowired
	private ExtWlJxlMgSeahisBydayService extWlJxlMgSeahisBydayService;



	/**
     * @author Administrator
     * @description: 分页查询 聚信立蜜罐主表列表
     * @date 2017-12-14 13:56:25
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlJxlMgBaseInfoDTO> searchExtWlJxlMgBaseInfoByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlJxlMgBaseInfoDTO> dataList =  dao.searchExtWlJxlMgBaseInfoByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询聚信立蜜罐主表列表
     * @date 2017-12-14 13:56:25
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlJxlMgBaseInfoDTO> searchExtWlJxlMgBaseInfo(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlJxlMgBaseInfoDTO> dataList = dao.searchExtWlJxlMgBaseInfo(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询聚信立蜜罐主表对象
     * @date 2017-12-14 13:56:25
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlJxlMgBaseInfoDTO queryExtWlJxlMgBaseInfoByPrimaryKey(String id) throws Exception {
		
		ExtWlJxlMgBaseInfoDTO dto = dao.findExtWlJxlMgBaseInfoByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlJxlMgBaseInfoDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlJxlMgBaseInfo
     * @author Administrator
     * @description: 新增 聚信立蜜罐主表对象
     * @date 2017-12-14 13:56:25
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlJxlMgBaseInfo(ExtWlJxlMgBaseInfoDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlJxlMgBaseInfo(paramMap);
		
		ExtWlJxlMgBaseInfoDTO resultDto = (ExtWlJxlMgBaseInfoDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlJxlMgBaseInfo
     * @author Administrator
     * @description: 修改 聚信立蜜罐主表对象
     * @date 2017-12-14 13:56:25
     * @param dto
     * @return
     * @throws
     */
	public void updateExtWlJxlMgBaseInfo(ExtWlJxlMgBaseInfoDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlJxlMgBaseInfo(paramMap);
	}
	/**
     * @title: deleteExtWlJxlMgBaseInfoByPrimaryKey
     * @author Administrator
     * @description: 删除 聚信立蜜罐主表,按主键
     * @date 2017-12-14 13:56:25
     * @param baseDto ids
     * @throws
     */ 
	public void deleteExtWlJxlMgBaseInfoByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlJxlMgBaseInfoByPrimaryKey(paramMap);
	}


	/**
	 * @methodName: saveMessage
	 * @param: map
	 * @describe: 蜜罐信息查询接口数据落地
	 * @auther: huangxianchao
	 * @date: 2017/12/14 0014
	 * @time: 下午 2:06
	 **/
	@Override
	public void saveMessage(Map<String, Object> map) {

		String isSuccess = "0";
		String retCode = "";
		String retMsg = "";
		String fkBizId = "";
		String message = "";

		JSONObject respJson;
		//日志信息
		ExtInterfaceLogDTO interfaceLogDto = (ExtInterfaceLogDTO) map.get("interfaceLogDto");
		String results = (String) map.get("result");

		try{

			if(StringUtils.isNotEmpty(results)){
				respJson = JSONObject.parseObject(results);
				JSONObject dataJSONObject =  respJson.getJSONObject("data");
				if(null != respJson.get("message")){
					message = (String) respJson.get("message");
					retMsg = (String) respJson.get("message");
				}
				if(null != respJson.get("code")){
					retCode = respJson.get("code").toString();
				}

				if(dataJSONObject != null){

					if("MIGUAN_SEARCH_SUCCESS".equals(respJson.get("code"))){//调用成功
						isSuccess = "1";
						ExtWlJxlMgBaseDataInfoDTO  baseData =  (ExtWlJxlMgBaseDataInfoDTO)JSONObject.parseObject(dataJSONObject.toString(),ExtWlJxlMgBaseDataInfoDTO.class);
						String userGridId = baseData.getUserGridId();//蜜罐ID

						ExtWlJxlMgUserGrayDTO userGray = baseData.getUserGray();//用户灰度分数信息
						makeUserGrayChilds(userGray, userGridId);//保存userGray子表信息


						ExtWlJxlMgUserSearchedStatisticDTO userSearchedStatistic =baseData.getUserSearchedStatistic();//被机构查询数量统计(去重后)

						ExtWlJxlMgRegOrgsDTO userRegOrgs = baseData.getUserRegisterOrgs();//用户注册信息情况

						List<ExtWlJxlMgRegOrgStatDTO> regorgStatistics =  userRegOrgs.getRegisterOrgsStatistics();//用户注册App统计详情//

						ExtWlJxlMgUserBlacklistDTO userBlackList =  baseData.getUserBlacklist();//黑名单信息

						List<ExtWlJxlBlacklistDetailsDTO> blacklistDetails =    userBlackList.getBlacklistDetails();//黑名单详情

						ExtWlJxlMgUserBasicDTO userBasic =   baseData.getUserBasic();//基本信息

						List<ExtWlJxlMgUserSechByODTO> userSearchedHistoryByOrgs  = baseData.getUserSearchedHistoryByOrgs();

						String auth_org = baseData.getAuthOrg();//授权查询蜜罐数据的机构账号

						ExtWlJxlUserPhoneSuspicion userPhoneSuspicion = baseData.getUserPhoneSuspicion();//手机号码存疑

						List<ExtWlJxlMgPhoneorgsDTO> phoneAppliedInOrgs  = userPhoneSuspicion.getPhoneAppliedInOrgs();//电话号码在那些类型的机构中使用过

						List<ExtWlJxlMgPhoneidcardsDTO> phoneWithOtherIdcards = userPhoneSuspicion.getPhoneWithOtherIdcards();//身用这个手机号码绑定的其他身份证

						List<ExtWlJxlMgPhonenamesDTO> phoneWithOtherNames =   userPhoneSuspicion.getPhoneWithOtherNames();//用这个手机号码绑定的其他姓名

						ExtWlJxlUserIdCardSuspicion  userIdCardSuspicion = baseData.getUserIdcardSuspicion();//身份证号码存疑

						List<ExtWlJxlMgIdcardorgsDTO>  idcardAppliedInOrgs = userIdCardSuspicion.getIdcardAppliedInOrgs();//身份证在那些类型的机构中使用过

						List<ExtWlJxlMgIdcardnamesDTO>  idcardWithOtherNames =  userIdCardSuspicion.getIdcardWithOtherNames();//用这个身份证号码绑定的其他姓名

						List<ExtWlJxlMgIdcardphonesDTO>  idcardphones = userIdCardSuspicion.getIdcardWithOtherPhones();//用这个身份证绑定的其他手机号码

						//历史查询记录
						makeSaveHistoryByDay(dataJSONObject,userGridId);

						//消费标签信息
						ExtWlJxlMgConsuLabelDTO consumerLabel = baseData.getConsumerLabel();
						if (checkObjectIsNotNull(consumerLabel)){
							consumerLabel.setUserGridId(userGridId);
							extWlJxlMgConsuLabelService.insertExtWlJxlMgConsuLabel(consumerLabel);
						}

						ExtWlJxlMgBaseInfoDTO baseInfo = new ExtWlJxlMgBaseInfoDTO();
						baseInfo.setCode((String)respJson.get("code"));
						baseInfo.setUserGridId(userGridId);
						baseInfo.setIntoid((String)map.get("intoId"));
						baseInfo.setValidState("1");
						//baseInfo.setData(results);//数据太大 得改字段属性
						baseInfo.setMessage(message);
						baseInfo.setUsername((String)map.get("name"));
						baseInfo.setIdcard((String)map.get("id_card"));
						baseInfo.setSearchedOrgCnt(userSearchedStatistic.getSearchedOrgCnt());
						baseInfo.setRegisterCnt(userRegOrgs.getRegisterCnt());
						if(null != respJson.get("spend_time")){
							baseInfo.setSpendTime(Long.parseLong(respJson.get("spend_time").toString()));
						}

						Long keyId = insertExtWlJxlMgBaseInfo(baseInfo);
						fkBizId = String.valueOf(keyId);
						//用户灰度分数信息
						userGray.setUserGridId(userGridId);
						userGrayService.insertExtWlJxlMgUserGray(userGray);

						userBlackList.setUserGridId(userGridId);
						StringBuffer strf = new StringBuffer("");
						int i = 0;
						for(String str : userBlackList.getBlacklistCategory()){
							strf.append(str);
							i++;
							if(userBlackList.getBlacklistCategory().size()>i){
								strf.append("|");
							}
						}
						userBlackList.setUpdateTimeNameIdcard(userBlackList.getBlacklistUpdateTimeNameIdcard());
						userBlackList.setUpdateTimeNamePhone(userBlackList.getBlacklistUpdateTimeNamePhone());
						userBlackList.setBlacklistCategoryStr(strf.toString());

						userBlacklistService.insertExtWlJxlMgUserBlacklist(userBlackList);

						for(ExtWlJxlBlacklistDetailsDTO blacklistDetail:blacklistDetails){
							blacklistDetail.setUserGridId(userGridId);
							blacklistDetailsService.insertExtWlJxlBlacklistDetails(blacklistDetail);
						}

						for(ExtWlJxlMgRegOrgStatDTO regorgStatistic: regorgStatistics){
							regorgStatistic.setUserGridId(userGridId);
							regorgStatistic.setPhoneNum(userRegOrgs.getPhoneNum());
							regOrgStatService.insertExtWlJxlMgRegOrgStat(regorgStatistic);
						}

						userBasic.setUserGridId(userGridId);
						userBasicService.insertExtWlJxlMgUserBasic(userBasic);
						for(ExtWlJxlMgUserSechByODTO  userSearchedHistoryByOrg: userSearchedHistoryByOrgs){

							userSearchedHistoryByOrg.setUserGridId(userGridId);
							userSechByOService.insertExtWlJxlMgUserSechByO(userSearchedHistoryByOrg);
						}


						for(ExtWlJxlMgIdcardnamesDTO idcardName : idcardWithOtherNames){
							idcardName.setUserGridId(userGridId);
							idcardnamesService.insertExtWlJxlMgIdcardnames(idcardName);
						}


						for(ExtWlJxlMgIdcardorgsDTO idcardAppliedInOrg : idcardAppliedInOrgs){
							idcardAppliedInOrg.setUserGridId(userGridId);
							idcardorgsService.insertExtWlJxlMgIdcardorgs(idcardAppliedInOrg);
						}


						for(ExtWlJxlMgIdcardphonesDTO idcardphone : idcardphones){
							idcardphone.setUserGridId(userGridId);
							idcardphonesService.insertExtWlJxlMgIdcardphones(idcardphone);
						}


						for(ExtWlJxlMgPhoneidcardsDTO phoneWithOtherIdcard : phoneWithOtherIdcards){
							phoneWithOtherIdcard.setUserGridId(userGridId);
							phoneidcardsService.insertExtWlJxlMgPhoneidcards(phoneWithOtherIdcard);
						}

						for(ExtWlJxlMgPhonenamesDTO phoneWithOtherName : phoneWithOtherNames){
							phoneWithOtherName.setUserGridId(userGridId);
							phonenamesService.insertExtWlJxlMgPhonenames(phoneWithOtherName);
						}
						for(ExtWlJxlMgPhoneorgsDTO phoneAppliedInOrg:phoneAppliedInOrgs){
							phoneAppliedInOrg.setUserGridId(userGridId);
							phoneorgsService.insertExtWlJxlMgPhoneorgs(phoneAppliedInOrg);

						}

					}else{
						interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
						interfaceLogDto.setRetMsg("调用蜜罐信息查询查无");
					}
				}

			}
		}catch (Exception e) {
			JYLoggerUtil.error(this.getClass(), "===保存蜜罐信息查询日志异常===接口日志ID:"+String.valueOf(map.get("interfaceId")), e);
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
				JYLoggerUtil.error(this.getClass(), "===保存蜜罐信息查询日志异常===接口日志ID:"+String.valueOf(map.get("interfaceId")), e);
			}
		}
	}

	/**
	 * @methodName: makeUserGrayChilds
	 * @param: [userGray, userGridId]
	 * @describe: 保存userGray子表信息
	 * @auther: huangxianchao
	 * @date: 2018/1/10 0010
	 * @time: 下午 4:41
	 **/
	private void makeUserGrayChilds(ExtWlJxlMgUserGrayDTO userGray,String userGridId) throws Exception{

		//联系人灰度分信息
		ExtWlJxlMgConGrScoreDTO contactsGrayScore = userGray.getContactsGrayScore();
		if (checkObjectIsNotNull(contactsGrayScore)){
			contactsGrayScore.setUserGridId(userGridId);
			extWlJxlMgConGrScoreService.insertExtWlJxlMgConGrScore(contactsGrayScore);
		}

		//联系人的分布
		ExtWlJxlMgConReladistDTO contactsRelationDistribution = userGray.getContactsRelationDistribution();
		if (checkObjectIsNotNull(contactsRelationDistribution)){
			contactsRelationDistribution.setUserGridId(userGridId);
			extWlJxlMgConReladistService.insertExtWlJxlMgConReladist(contactsRelationDistribution);
		}
		//与联系人的最大亲密度
		ExtWlJxlMgContClosestDTO contactsClosest = userGray.getContactsClosest();
		if (checkObjectIsNotNull(contactsClosest)){
			contactsClosest.setUserGridId(userGridId);
			extWlJxlMgContClosestService.insertExtWlJxlMgContClosest(contactsClosest);
		}
		//联系人数相关信息
		ExtWlJxlMgContNumStaDTO contactsNumberStatistic = userGray.getContactsNumberStatistic();
		if (checkObjectIsNotNull(contactsNumberStatistic)){
			contactsNumberStatistic.setUserGridId(userGridId);
			extWlJxlMgContNumStaService.insertExtWlJxlMgContNumSta(contactsNumberStatistic);
		}
		//联系人的查询历史
		ExtWlJxlMgContaQueryDTO contactsQuery = userGray.getContactsQuery();
		if (checkObjectIsNotNull(contactsQuery)){
			contactsQuery.setUserGridId(userGridId);
			extWlJxlMgContaQueryService.insertExtWlJxlMgContaQuery(contactsQuery);
		}
		//联系权重R、F、M相关字段(rfm)
		ExtWlJxlMgContactRfmDTO contactsRfm = userGray.getContactsRfm();
		if (checkObjectIsNotNull(contactsRfm)){
			contactsRfm.setUserGridId(userGridId);
			extWlJxlMgContactRfmService.insertExtWlJxlMgContactRfm(contactsRfm);
		}
	}

	/**
	 * @methodName: makeSaveHistoryByDay
	 * @param: [dataJSONObject,userGridId]
	 * @describe: 保存day历史查询记录
	 * @auther: huangxianchao
	 * @date: 2018/1/10 0010
	 * @time: 下午 4:50
	 **/
	private void makeSaveHistoryByDay(JSONObject dataJSONObject, String userGridId) throws Exception{
		JSONObject jsonByDay = dataJSONObject.getJSONObject("user_searched_history_by_day");
		if (null != jsonByDay){
			Set keyDay = jsonByDay.keySet();
			Iterator it = keyDay.iterator();
			ExtWlJxlMgSeahisBydayDTO dto = new ExtWlJxlMgSeahisBydayDTO();
			while (it.hasNext()){
				String key = (String)it.next();
				dto = JSONObject.parseObject(jsonByDay.get(key).toString(),ExtWlJxlMgSeahisBydayDTO.class);
				dto.setUserGridId(userGridId);
				dto.setDayNum(key);
				extWlJxlMgSeahisBydayService.insertExtWlJxlMgSeahisByday(dto);

			}
		}
	}

	/**
	 * @methodName: saveObjectIsNotNull
	 * @param: [t]
	 * @describe: 判断一个对象的所以属性是否都为null，都是null则不插入数据
	 * @auther: huangxianchao
	 * @date: 2018/1/10 0010
	 * @time: 下午 5:10
	 **/
	private Boolean checkObjectIsNotNull(Object t) throws Exception{

		boolean flag = false;
		if (null != t){//如果属性值都是空值的话，不该插入数据

			Field[] fields = t.getClass().getDeclaredFields();
			for (Field f : fields){
				f.setAccessible(true);
				//排除serialVersionUID
				if (f.get(t) != null){
					if ("serialVersionUID".equals(f.getName())){
						continue;
					}
					flag = true;
					break;
				}
			}

		}
		return flag;
	}


}

