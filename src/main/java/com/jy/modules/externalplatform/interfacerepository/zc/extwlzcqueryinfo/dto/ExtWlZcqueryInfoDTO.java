package com.jy.modules.externalplatform.interfacerepository.zc.extwlzcqueryinfo.dto;

import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcloanrecords.dto.ExtWlZcLoanRecordsDTO;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcqueryhistory.dto.ExtWlZcQueryHistoryDTO;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcriskresults.dto.ExtWlZcRiskResultsDTO;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcstatistics.dto.ExtWlZcStatisticsDTO;
import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:致诚查询贷款信息主表
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-07 13:40:03
 */
public class ExtWlZcqueryInfoDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**ID*/
	private Long id;

	/**进件编号*/
	private String intoId;

	/**身份证号码*/
	private String cardId;

	/**姓名*/
	private String custName;

	/**流水号*/
	private String flowId;

	/**致诚信用分数*/
	private String zcCreditScore;

	/**违约概率*/
	private String contractBreakRate;

	/**返回信息*/
	private String message;

	/**返回编码*/
	private String errorCode;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

    private ExtWlZcLoanRecordsDTO[] loanRecords;
    
    private ExtWlZcQueryHistoryDTO[] queryHistory;
    
    private ExtWlZcRiskResultsDTO[] riskResults;
    
    private ExtWlZcStatisticsDTO queryStatistics;
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
	 *方法: 获得flowId
	 *@return: java.lang.String  flowId
	 */
	public String getFlowId(){
		return this.flowId;
	}

	/**
	 *方法: 设置flowId
	 *@param: java.lang.String  flowId
	 */
	public void setFlowId(String flowId){
		this.flowId = flowId;
	}

	/**
	 *方法: 获得zcCreditScore
	 *@return: java.lang.String  zcCreditScore
	 */
	public String getZcCreditScore(){
		return this.zcCreditScore;
	}

	/**
	 *方法: 设置zcCreditScore
	 *@param: java.lang.String  zcCreditScore
	 */
	public void setZcCreditScore(String zcCreditScore){
		this.zcCreditScore = zcCreditScore;
	}

	/**
	 *方法: 获得contractBreakRate
	 *@return: java.lang.String  contractBreakRate
	 */
	public String getContractBreakRate(){
		return this.contractBreakRate;
	}

	/**
	 *方法: 设置contractBreakRate
	 *@param: java.lang.String  contractBreakRate
	 */
	public void setContractBreakRate(String contractBreakRate){
		this.contractBreakRate = contractBreakRate;
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

    
    public ExtWlZcLoanRecordsDTO[] getLoanRecords() {
        return loanRecords;
    }

    
    public void setLoanRecords(ExtWlZcLoanRecordsDTO[] loanRecords) {
        this.loanRecords = loanRecords;
    }

    
    public ExtWlZcQueryHistoryDTO[] getQueryHistory() {
        return queryHistory;
    }

    
    public void setQueryHistory(ExtWlZcQueryHistoryDTO[] queryHistory) {
        this.queryHistory = queryHistory;
    }

    
    public ExtWlZcRiskResultsDTO[] getRiskResults() {
        return riskResults;
    }

    
    public void setRiskResults(ExtWlZcRiskResultsDTO[] riskResults) {
        this.riskResults = riskResults;
    }

    
    public ExtWlZcStatisticsDTO getQueryStatistics() {
        return queryStatistics;
    }

    
    public void setQueryStatistics(ExtWlZcStatisticsDTO queryStatistics) {
        this.queryStatistics = queryStatistics;
    }

}