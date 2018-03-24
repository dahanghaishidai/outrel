package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgbaseinfo.dto;

import com.jy.platform.core.common.BaseDTO;

/**
 * @className: ExtWlJxlBlacklistDetailsDTO
 * @package: com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgbaseinfo.dto
 * @describe: 聚信立蜜罐黑名单详情
 * @auther: huangxianchao
 * @date: 2017/12/14 0014
 * @time: 下午 3:22
 **/
public class ExtWlJxlBlacklistDetailsDTO extends BaseDTO {

    private static final long serialVersionUID = 1L;

    /**主键*/
    private java.lang.Long id;

    /**蜜罐ID*/
    private java.lang.String userGridId;

    /**详情名称*/
    private java.lang.String detailsKey;

    /**详情内容*/
    private java.lang.String detailsValue;

    /**创建时间*/
    private java.sql.Timestamp createTime;

    /**创建人*/
    private java.lang.Long createBy;

    /**修改时间*/
    private java.sql.Timestamp modifyTime;

    /**修改人*/
    private java.lang.Long modifyBy;

    /**
     *方法: 获得id
     *@return: java.lang.Long  id
     */
    public java.lang.Long getId(){
        return this.id;
    }

    /**
     *方法: 设置id
     *@param: java.lang.Long  id
     */
    public void setId(java.lang.Long id){
        this.id = id;
    }

    /**
     *方法: 获得userGridId
     *@return: java.lang.String  userGridId
     */
    public java.lang.String getUserGridId(){
        return this.userGridId;
    }

    /**
     *方法: 设置userGridId
     *@param: java.lang.String  userGridId
     */
    public void setUserGridId(java.lang.String userGridId){
        this.userGridId = userGridId;
    }

    /**
     *方法: 获得detailsKey
     *@return: java.lang.String  detailsKey
     */
    public java.lang.String getDetailsKey(){
        return this.detailsKey;
    }

    /**
     *方法: 设置detailsKey
     *@param: java.lang.String  detailsKey
     */
    public void setDetailsKey(java.lang.String detailsKey){
        this.detailsKey = detailsKey;
    }

    /**
     *方法: 获得detailsValue
     *@return: java.lang.String  detailsValue
     */
    public java.lang.String getDetailsValue(){
        return this.detailsValue;
    }

    /**
     *方法: 设置detailsValue
     *@param: java.lang.String  detailsValue
     */
    public void setDetailsValue(java.lang.String detailsValue){
        this.detailsValue = detailsValue;
    }

    /**
     *方法: 获得createTime
     *@return: java.sql.Timestamp  createTime
     */
    public java.sql.Timestamp getCreateTime(){
        return this.createTime;
    }

    /**
     *方法: 设置createTime
     *@param: java.sql.Timestamp  createTime
     */
    public void setCreateTime(java.sql.Timestamp createTime){
        this.createTime = createTime;
    }

    /**
     *方法: 获得createBy
     *@return: java.lang.Long  createBy
     */
    public java.lang.Long getCreateBy(){
        return this.createBy;
    }

    /**
     *方法: 设置createBy
     *@param: java.lang.Long  createBy
     */
    public void setCreateBy(java.lang.Long createBy){
        this.createBy = createBy;
    }

    /**
     *方法: 获得modifyTime
     *@return: java.sql.Timestamp  modifyTime
     */
    public java.sql.Timestamp getModifyTime(){
        return this.modifyTime;
    }

    /**
     *方法: 设置modifyTime
     *@param: java.sql.Timestamp  modifyTime
     */
    public void setModifyTime(java.sql.Timestamp modifyTime){
        this.modifyTime = modifyTime;
    }

    /**
     *方法: 获得modifyBy
     *@return: java.lang.Long  modifyBy
     */
    public java.lang.Long getModifyBy(){
        return this.modifyBy;
    }

    /**
     *方法: 设置modifyBy
     *@param: java.lang.Long  modifyBy
     */
    public void setModifyBy(java.lang.Long modifyBy){
        this.modifyBy = modifyBy;
    }

}
