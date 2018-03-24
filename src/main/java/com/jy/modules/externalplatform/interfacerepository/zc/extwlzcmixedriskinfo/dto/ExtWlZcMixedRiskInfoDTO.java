package com.jy.modules.externalplatform.interfacerepository.zc.extwlzcmixedriskinfo.dto;

import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcmobileverification.dto.ExtWlZcMobileVerificationDTO;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcnetworkanalysis.dto.ExtWlZcNetworkAnalysisDTO;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcrisklist.dto.ExtWlZcRiskListDTO;
import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:致诚查询反欺诈信息主表
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-07 13:39:29
 */
public class ExtWlZcMixedRiskInfoDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键id*/
	private Long id;

	/**进件编号*/
	private String intoId;

	/**身份证号码*/
	private String cardId;

	/**姓名*/
	private String custName;

	/**返回信息*/
	private String message;

	/**返回编码*/
	private String errorCode;

	/**银行卡验证3要素*/
	private String bankCheckAuth3;

	/**银行卡验证3要素码*/
	private String bankCheckAuth3Code;

	/**银行卡验证4要素*/
	private String bankCheckAuth4;

	/**银行卡验证4要素码*/
	private String bankCheckAuth4Code;

	/**个人身份验证结果*/
	private String identityVerify;

	/**个人身份验证结果码*/
	private String identityVerifyCode;

	/**致诚欺诈评分*/
	private String zcFraudScore;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	/**数据有效性(1：有效，0：无效)*/
	private String validateState;

    /**社交关系数据*/
    private ExtWlZcNetworkAnalysisDTO behaviorFeatures;
    
    /**手机验证数据*/
    private ExtWlZcMobileVerificationDTO[] mobileVerifyList;
    
    /**风险名单数据*/
    private ExtWlZcRiskListDTO[] resultList;

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
	 *方法: 获得intoId
	 *@return: java.lang.String  intoId
	 */
	public String getIntoId(){
		return this.intoId;
	}

	/**
	 *方法: 设置intoId
	 *@param: java.lang.String  intoId
	 */
	public void setIntoId(String intoId){
		this.intoId = intoId;
	}

	/**
	 *方法: 获得cardId
	 *@return: java.lang.String  cardId
	 */
	public String getCardId(){
		return this.cardId;
	}

	/**
	 *方法: 设置cardId
	 *@param: java.lang.String  cardId
	 */
	public void setCardId(String cardId){
		this.cardId = cardId;
	}

	/**
	 *方法: 获得custName
	 *@return: java.lang.String  custName
	 */
	public String getCustName(){
		return this.custName;
	}

	/**
	 *方法: 设置custName
	 *@param: java.lang.String  custName
	 */
	public void setCustName(String custName){
		this.custName = custName;
	}

	/**
	 *方法: 获得message
	 *@return: java.lang.String  message
	 */
	public String getMessage(){
		return this.message;
	}

	/**
	 *方法: 设置message
	 *@param: java.lang.String  message
	 */
	public void setMessage(String message){
		this.message = message;
	}

	/**
	 *方法: 获得errorCode
	 *@return: java.lang.String  errorCode
	 */
	public String getErrorCode(){
		return this.errorCode;
	}

	/**
	 *方法: 设置errorCode
	 *@param: java.lang.String  errorCode
	 */
	public void setErrorCode(String errorCode){
		this.errorCode = errorCode;
	}

	/**
	 *方法: 获得bankCheckAuth3
	 *@return: java.lang.String  bankCheckAuth3
	 */
	public String getBankCheckAuth3(){
		return this.bankCheckAuth3;
	}

	/**
	 *方法: 设置bankCheckAuth3
	 *@param: java.lang.String  bankCheckAuth3
	 */
	public void setBankCheckAuth3(String bankCheckAuth3){
		this.bankCheckAuth3 = bankCheckAuth3;
	}

	/**
	 *方法: 获得bankCheckAuth3Code
	 *@return: java.lang.String  bankCheckAuth3Code
	 */
	public String getBankCheckAuth3Code(){
		return this.bankCheckAuth3Code;
	}

	/**
	 *方法: 设置bankCheckAuth3Code
	 *@param: java.lang.String  bankCheckAuth3Code
	 */
	public void setBankCheckAuth3Code(String bankCheckAuth3Code){
		this.bankCheckAuth3Code = bankCheckAuth3Code;
	}

	/**
	 *方法: 获得bankCheckAuth4
	 *@return: java.lang.String  bankCheckAuth4
	 */
	public String getBankCheckAuth4(){
		return this.bankCheckAuth4;
	}

	/**
	 *方法: 设置bankCheckAuth4
	 *@param: java.lang.String  bankCheckAuth4
	 */
	public void setBankCheckAuth4(String bankCheckAuth4){
		this.bankCheckAuth4 = bankCheckAuth4;
	}

	/**
	 *方法: 获得bankCheckAuth4Code
	 *@return: java.lang.String  bankCheckAuth4Code
	 */
	public String getBankCheckAuth4Code(){
		return this.bankCheckAuth4Code;
	}

	/**
	 *方法: 设置bankCheckAuth4Code
	 *@param: java.lang.String  bankCheckAuth4Code
	 */
	public void setBankCheckAuth4Code(String bankCheckAuth4Code){
		this.bankCheckAuth4Code = bankCheckAuth4Code;
	}

	/**
	 *方法: 获得identityVerify
	 *@return: java.lang.String  identityVerify
	 */
	public String getIdentityVerify(){
		return this.identityVerify;
	}

	/**
	 *方法: 设置identityVerify
	 *@param: java.lang.String  identityVerify
	 */
	public void setIdentityVerify(String identityVerify){
		this.identityVerify = identityVerify;
	}

	/**
	 *方法: 获得identityVerifyCode
	 *@return: java.lang.String  identityVerifyCode
	 */
	public String getIdentityVerifyCode(){
		return this.identityVerifyCode;
	}

	/**
	 *方法: 设置identityVerifyCode
	 *@param: java.lang.String  identityVerifyCode
	 */
	public void setIdentityVerifyCode(String identityVerifyCode){
		this.identityVerifyCode = identityVerifyCode;
	}

	/**
	 *方法: 获得zcFraudScore
	 *@return: java.lang.String  zcFraudScore
	 */
	public String getZcFraudScore(){
		return this.zcFraudScore;
	}

	/**
	 *方法: 设置zcFraudScore
	 *@param: java.lang.String  zcFraudScore
	 */
	public void setZcFraudScore(String zcFraudScore){
		this.zcFraudScore = zcFraudScore;
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

    
    public ExtWlZcNetworkAnalysisDTO getBehaviorFeatures() {
        return behaviorFeatures;
    }

    
    public void setBehaviorFeatures(ExtWlZcNetworkAnalysisDTO behaviorFeatures) {
        this.behaviorFeatures = behaviorFeatures;
    }

    
    public ExtWlZcMobileVerificationDTO[] getMobileVerifyList() {
        return mobileVerifyList;
    }

    
    public void setMobileVerifyList(ExtWlZcMobileVerificationDTO[] mobileVerifyList) {
        this.mobileVerifyList = mobileVerifyList;
    }

    
    public ExtWlZcRiskListDTO[] getResultList() {
        return resultList;
    }

    
    public void setResultList(ExtWlZcRiskListDTO[] resultList) {
        this.resultList = resultList;
    }

}