package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgbaseinfo.dto;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgregorgstat.dto.ExtWlJxlMgRegOrgStatDTO;
import com.jy.platform.core.common.BaseDTO;

import java.util.List;

public class ExtWlJxlMgRegOrgsDTO extends BaseDTO {
    private static final long serialVersionUID = 1L;

    /**主键*/
    private java.lang.Long id;

    /**蜜罐ID*/
    private java.lang.String userGridId;
    /**蜜罐ID*/
    private java.lang.Long registerCnt;

    /**蜜罐ID*/
    private java.lang.String phoneNum;

    /**蜜罐ID*/
    private List<String> registerOrgs;

    /**蜜罐ID*/
    private List<ExtWlJxlMgRegOrgStatDTO> registerOrgsStatistics;

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

    public java.lang.Long getRegisterCnt() {
        return registerCnt;
    }

    public void setRegisterCnt(java.lang.Long registerCnt) {
        this.registerCnt = registerCnt;
    }

    public java.lang.String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(java.lang.String phoneNum) {
        this.phoneNum = phoneNum;
    }



    public List<ExtWlJxlMgRegOrgStatDTO> getRegisterOrgsStatistics() {
        return registerOrgsStatistics;
    }

    public void setRegisterOrgsStatistics(
            List<ExtWlJxlMgRegOrgStatDTO> registerOrgsStatistics) {
        this.registerOrgsStatistics = registerOrgsStatistics;
    }

    public List<String> getRegisterOrgs() {
        return registerOrgs;
    }

    public void setRegisterOrgs(List<String> registerOrgs) {
        this.registerOrgs = registerOrgs;
    }

}
