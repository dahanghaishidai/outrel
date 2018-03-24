package com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidulbsresult.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:百度金融LBS地址校验结果表
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-08 15:27:42
 */
public class ExtWlBaiduLbsResultDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键id*/
	private Long id;

	/**关联主表ID*/
	private String keyId;

	/**与百度定位距离*/
	private String distance;

	/**距离等级*/
	private String verifyResult;

	/**置信度等级*/
	private String confidence;

	/**地址有效性*/
	private String validity;

	/**结构化分级验证结果*/
	private String matchLevel;
	
	/**与百度定位距离*/
    private String hDistance;

    /**距离等级*/
    private String hVerifyResult;

    /**置信度等级*/
    private String hConfidence;

    /**地址有效性*/
    private String hValidity;

    /**结构化分级验证结果*/
    private String hMatchLevel;
    
    /**与百度定位距离*/
    private String cDistance;

    /**距离等级*/
    private String cVerifyResult;

    /**置信度等级*/
    private String cConfidence;

    /**地址有效性*/
    private String cValidity;

    /**结构化分级验证结果*/
    private String cMatchLevel;

    /**固定地址是否是常访地*/
    private String visitFrequencyLevel;

	/**过去180天出现次数*/
	private String frequency;

	/**不活跃天数，最后一次采样点距今天数*/
	private String inactiveDay;

	/**结果类型（1、家庭地址验证结果集 2、家庭地址同百度挖掘公司比较结果集 3、公司地址验证结果集 4、公司地址同百度挖掘家庭地址比较结果集 5、收货地址验证结果集 6、家庭与公司地址验证结果集 7、家庭与业务门店地址验证结果集 8、工作地址与业务门店地址验证结果集 ）*/
	private String resultType;

	/**创建人*/
	private Long createBy;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改人*/
	private Long modifyBy;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	/**数据有效性(1：有效，0：无效)*/
	private String validateState;

	/**
	 *方法: 获得id
	 *@return: java.lang.Long  id
	 */
	public Long getId(){
		return this.id;
	}

	/**
	 *方法: 设置id
	 *@param: java.lang.Long  id
	 */
	public void setId(Long id){
		this.id = id;
	}

	/**
	 *方法: 获得keyId
	 *@return: java.lang.String  keyId
	 */
	public String getKeyId(){
		return this.keyId;
	}

	/**
	 *方法: 设置keyId
	 *@param: java.lang.String  keyId
	 */
	public void setKeyId(String keyId){
		this.keyId = keyId;
	}

	/**
	 *方法: 获得distance
	 *@return: java.lang.String  distance
	 */
	public String getDistance(){
		return this.distance;
	}

	/**
	 *方法: 设置distance
	 *@param: java.lang.String  distance
	 */
	public void setDistance(String distance){
		this.distance = distance;
	}

	/**
	 *方法: 获得verifyResult
	 *@return: java.lang.String  verifyResult
	 */
	public String getVerifyResult(){
		return this.verifyResult;
	}

	/**
	 *方法: 设置verifyResult
	 *@param: java.lang.String  verifyResult
	 */
	public void setVerifyResult(String verifyResult){
		this.verifyResult = verifyResult;
	}

	/**
	 *方法: 获得confidence
	 *@return: java.lang.String  confidence
	 */
	public String getConfidence(){
		return this.confidence;
	}

	/**
	 *方法: 设置confidence
	 *@param: java.lang.String  confidence
	 */
	public void setConfidence(String confidence){
		this.confidence = confidence;
	}

	/**
	 *方法: 获得validity
	 *@return: java.lang.String  validity
	 */
	public String getValidity(){
		return this.validity;
	}

	/**
	 *方法: 设置validity
	 *@param: java.lang.String  validity
	 */
	public void setValidity(String validity){
		this.validity = validity;
	}

	/**
	 *方法: 获得matchLevel
	 *@return: java.lang.String  matchLevel
	 */
	public String getMatchLevel(){
		return this.matchLevel;
	}

	/**
	 *方法: 设置matchLevel
	 *@param: java.lang.String  matchLevel
	 */
	public void setMatchLevel(String matchLevel){
		this.matchLevel = matchLevel;
	}

	/**
	 *方法: 获得frequency
	 *@return: java.lang.String  frequency
	 */
	public String getFrequency(){
		return this.frequency;
	}

	/**
	 *方法: 设置frequency
	 *@param: java.lang.String  frequency
	 */
	public void setFrequency(String frequency){
		this.frequency = frequency;
	}

	/**
	 *方法: 获得inactiveDay
	 *@return: java.lang.String  inactiveDay
	 */
	public String getInactiveDay(){
		return this.inactiveDay;
	}

	/**
	 *方法: 设置inactiveDay
	 *@param: java.lang.String  inactiveDay
	 */
	public void setInactiveDay(String inactiveDay){
		this.inactiveDay = inactiveDay;
	}

	/**
	 *方法: 获得resultType
	 *@return: java.lang.String  resultType
	 */
	public String getResultType(){
		return this.resultType;
	}

	/**
	 *方法: 设置resultType
	 *@param: java.lang.String  resultType
	 */
	public void setResultType(String resultType){
		this.resultType = resultType;
	}

	/**
	 *方法: 获得createBy
	 *@return: java.lang.Long  createBy
	 */
	public Long getCreateBy(){
		return this.createBy;
	}

	/**
	 *方法: 设置createBy
	 *@param: java.lang.Long  createBy
	 */
	public void setCreateBy(Long createBy){
		this.createBy = createBy;
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
	 *方法: 获得modifyBy
	 *@return: java.lang.Long  modifyBy
	 */
	public Long getModifyBy(){
		return this.modifyBy;
	}

	/**
	 *方法: 设置modifyBy
	 *@param: java.lang.Long  modifyBy
	 */
	public void setModifyBy(Long modifyBy){
		this.modifyBy = modifyBy;
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
	 *方法: 获得validateState
	 *@return: java.lang.String  validateState
	 */
	public String getValidateState(){
		return this.validateState;
	}

	/**
	 *方法: 设置validateState
	 *@param: java.lang.String  validateState
	 */
	public void setValidateState(String validateState){
		this.validateState = validateState;
	}

    
    public String gethDistance() {
        return hDistance;
    }

    
    public void sethDistance(String hDistance) {
        this.hDistance = hDistance;
    }

    
    public String gethVerifyResult() {
        return hVerifyResult;
    }

    
    public void sethVerifyResult(String hVerifyResult) {
        this.hVerifyResult = hVerifyResult;
    }

    
    public String gethConfidence() {
        return hConfidence;
    }

    
    public void sethConfidence(String hConfidence) {
        this.hConfidence = hConfidence;
    }

    
    public String gethValidity() {
        return hValidity;
    }

    
    public void sethValidity(String hValidity) {
        this.hValidity = hValidity;
    }

    
    public String gethMatchLevel() {
        return hMatchLevel;
    }

    
    public void sethMatchLevel(String hMatchLevel) {
        this.hMatchLevel = hMatchLevel;
    }

    
    public String getcDistance() {
        return cDistance;
    }

    
    public void setcDistance(String cDistance) {
        this.cDistance = cDistance;
    }

    
    public String getcVerifyResult() {
        return cVerifyResult;
    }

    
    public void setcVerifyResult(String cVerifyResult) {
        this.cVerifyResult = cVerifyResult;
    }

    
    public String getcConfidence() {
        return cConfidence;
    }

    
    public void setcConfidence(String cConfidence) {
        this.cConfidence = cConfidence;
    }

    
    public String getcValidity() {
        return cValidity;
    }

    
    public void setcValidity(String cValidity) {
        this.cValidity = cValidity;
    }

    
    public String getcMatchLevel() {
        return cMatchLevel;
    }

    
    public void setcMatchLevel(String cMatchLevel) {
        this.cMatchLevel = cMatchLevel;
    }

    
    public String getVisitFrequencyLevel() {
        return visitFrequencyLevel;
    }

    
    public void setVisitFrequencyLevel(String visitFrequencyLevel) {
        this.visitFrequencyLevel = visitFrequencyLevel;
    }

}