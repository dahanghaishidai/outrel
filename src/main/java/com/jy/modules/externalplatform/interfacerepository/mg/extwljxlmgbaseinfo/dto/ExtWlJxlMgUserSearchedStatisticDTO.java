package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgbaseinfo.dto;

import com.jy.platform.core.common.BaseDTO;

/**
 * @className: ExtWlJxlMgUserSearchedStatisticDTO
 * @package: com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgbaseinfo.dto
 * @describe: 聚信立蜜罐用户注册信息情况
 * @auther: huangxianchao
 * @date: 2017/12/14 0014
 * @time: 下午 3:09
 **/
public class ExtWlJxlMgUserSearchedStatisticDTO extends BaseDTO {
    private static final long serialVersionUID = 1L;

    /**主键*/
    private java.lang.Long id;

    /**蜜罐ID*/
    private java.lang.String userGridId;

    private Long searchedOrgCnt;

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

    public Long getSearchedOrgCnt() {
        return searchedOrgCnt;
    }

    public void setSearchedOrgCnt(Long searchedOrgCnt) {
        this.searchedOrgCnt = searchedOrgCnt;
    }

}
