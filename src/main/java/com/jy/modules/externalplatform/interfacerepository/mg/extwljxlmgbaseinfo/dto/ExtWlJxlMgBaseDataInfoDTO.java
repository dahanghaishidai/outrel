package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgbaseinfo.dto;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgconsulabel.dto.ExtWlJxlMgConsuLabelDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgregorgstat.dto.ExtWlJxlMgRegOrgStatDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmguserbasic.dto.ExtWlJxlMgUserBasicDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmguserblacklist.dto.ExtWlJxlMgUserBlacklistDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgusergray.dto.ExtWlJxlMgUserGrayDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgusersechbyo.dto.ExtWlJxlMgUserSechByODTO;
import com.jy.platform.core.common.BaseDTO;

import java.util.List;

/**
 * @className: ExtWlJxlMgBaseDataInfoDTO
 * @package: com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgbaseinfo.dto
 * @describe: 聚信立蜜罐主表
 * @auther: huangxianchao
 * @date: 2017/12/14 0014
 * @time: 下午 2:46
 **/
public class ExtWlJxlMgBaseDataInfoDTO extends BaseDTO{
    private static final long serialVersionUID = 1L;

    /**主键id*/
    private java.lang.Long id;

    /**蜜罐id*/
    private java.lang.String userGridId;

    /**响应信息*/
    private java.lang.String message;
    //用户灰度分数信息
    private ExtWlJxlMgUserGrayDTO userGray;

    private String updateTime;
    //被机构查询数量统计(去重后)
    private ExtWlJxlMgUserSearchedStatisticDTO userSearchedStatistic;
    //用户注册信息情况
    private ExtWlJxlMgRegOrgsDTO userRegisterOrgs;
    //黑名单信息
    private ExtWlJxlMgUserBlacklistDTO userBlacklist;
    //基本信息
    private ExtWlJxlMgUserBasicDTO userBasic;
    //授权查询蜜罐数据的机构账号
    private String authOrg;
    //身份证号码存疑
    private ExtWlJxlUserIdCardSuspicion userIdcardSuspicion ;
    //手机号码存疑
    private ExtWlJxlUserPhoneSuspicion  userPhoneSuspicion;

    //历史机构
    private List<ExtWlJxlMgUserSechByODTO> userSearchedHistoryByOrgs;

    //消费标签信息
    private ExtWlJxlMgConsuLabelDTO consumerLabel;




    public java.lang.Long getId() {
        return id;
    }

    public void setId(java.lang.Long id) {
        this.id = id;
    }

    public java.lang.String getUserGridId() {
        return userGridId;
    }

    public void setUserGridId(java.lang.String userGridId) {
        this.userGridId = userGridId;
    }

    public java.lang.String getMessage() {
        return message;
    }

    public void setMessage(java.lang.String message) {
        this.message = message;
    }

    public ExtWlJxlMgUserGrayDTO getUserGray() {
        return userGray;
    }

    public void setUserGray(ExtWlJxlMgUserGrayDTO userGray) {
        this.userGray = userGray;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }



    public ExtWlJxlMgUserBlacklistDTO getUserBlacklist() {
        return userBlacklist;
    }

    public void setUserBlacklist(ExtWlJxlMgUserBlacklistDTO userBlacklist) {
        this.userBlacklist = userBlacklist;
    }

    public ExtWlJxlMgUserBasicDTO getUserBasic() {
        return userBasic;
    }

    public void setUserBasic(ExtWlJxlMgUserBasicDTO userBasic) {
        this.userBasic = userBasic;
    }

    public String getAuthOrg() {
        return authOrg;
    }

    public void setAuthOrg(String authOrg) {
        this.authOrg = authOrg;
    }


    public ExtWlJxlMgRegOrgsDTO getUserRegisterOrgs() {
        return userRegisterOrgs;
    }

    public void setUserRegisterOrgs(ExtWlJxlMgRegOrgsDTO userRegisterOrgs) {
        this.userRegisterOrgs = userRegisterOrgs;
    }

    public ExtWlJxlMgUserSearchedStatisticDTO getUserSearchedStatistic() {
        return userSearchedStatistic;
    }

    public void setUserSearchedStatistic(
            ExtWlJxlMgUserSearchedStatisticDTO userSearchedStatistic) {
        this.userSearchedStatistic = userSearchedStatistic;
    }

    public ExtWlJxlUserIdCardSuspicion getUserIdcardSuspicion() {
        return userIdcardSuspicion;
    }

    public void setUserIdcardSuspicion(ExtWlJxlUserIdCardSuspicion userIdcardSuspicion) {
        this.userIdcardSuspicion = userIdcardSuspicion;
    }

    public ExtWlJxlUserPhoneSuspicion getUserPhoneSuspicion() {
        return userPhoneSuspicion;
    }

    public void setUserPhoneSuspicion(ExtWlJxlUserPhoneSuspicion userPhoneSuspicion) {
        this.userPhoneSuspicion = userPhoneSuspicion;
    }

    public List<ExtWlJxlMgUserSechByODTO> getUserSearchedHistoryByOrgs() {
        return userSearchedHistoryByOrgs;
    }

    public void setUserSearchedHistoryByOrgs(
            List<ExtWlJxlMgUserSechByODTO> userSearchedHistoryByOrgs) {
        this.userSearchedHistoryByOrgs = userSearchedHistoryByOrgs;
    }

    public ExtWlJxlMgConsuLabelDTO getConsumerLabel() {
        return consumerLabel;
    }

    public void setConsumerLabel(ExtWlJxlMgConsuLabelDTO consumerLabel) {
        this.consumerLabel = consumerLabel;
    }
}
