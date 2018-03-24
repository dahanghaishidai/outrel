package com.jy.modules.externalplatform.interfacerepository.yszx.extyszxhdinfo.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @description: 华道信贷信息
 * @author: sun
 */
public class ExtHdCreditInfoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5346707949643577676L;
	private Long id;
	private String type;
	private String intoAppId;
	private String intoCustRefId;
	private String registerNum; // 注册总数
	private String loannum;// 申请次数
	private String resultnum;// 记录总条数
	private String passes;// 申请通过次数
	private String rejected;// 申请被拒次数
	private String loanlendersnum;// 贷款放款次数
	private String loanrejectionnum;// 贷款驳回次数
	private String counts;// 逾期数量
	private String money;// 逾期/欠款金额区间
	private String loanPlantDetail;// 信贷平台注册详情
	private String loanApplyDetail;// 贷款申请详情
	private String loanGrantDetail;// 贷款放款详情
	private String loanRegectDetail;// 贷款驳回详情
	private String loanOverdueDetail;// 逾期平台详情查询
	private String loanDebatDetail;// 欠款查询
	private String validateState;
	private Date createTime;
	private Date modifyTime;
	private String createBy;
	private String modifyBy;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRegisterNum() {
		return registerNum;
	}

	public void setRegisterNum(String registerNum) {
		this.registerNum = registerNum;
	}

	public String getLoannum() {
		return loannum;
	}

	public void setLoannum(String loannum) {
		this.loannum = loannum;
	}

	public String getResultnum() {
		return resultnum;
	}

	public void setResultnum(String resultnum) {
		this.resultnum = resultnum;
	}

	public String getPasses() {
		return passes;
	}

	public void setPasses(String passes) {
		this.passes = passes;
	}

	public String getRejected() {
		return rejected;
	}

	public void setRejected(String rejected) {
		this.rejected = rejected;
	}

	public String getLoanlendersnum() {
		return loanlendersnum;
	}

	public void setLoanlendersnum(String loanlendersnum) {
		this.loanlendersnum = loanlendersnum;
	}

	public String getLoanrejectionnum() {
		return loanrejectionnum;
	}

	public void setLoanrejectionnum(String loanrejectionnum) {
		this.loanrejectionnum = loanrejectionnum;
	}

	public String getCounts() {
		return counts;
	}

	public void setCounts(String counts) {
		this.counts = counts;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getValidateState() {
		return validateState;
	}

	public void setValidateState(String validateState) {
		this.validateState = validateState;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	public String getIntoAppId() {
		return intoAppId;
	}

	public void setIntoAppId(String intoAppId) {
		this.intoAppId = intoAppId;
	}

	public String getIntoCustRefId() {
		return intoCustRefId;
	}

	public void setIntoCustRefId(String intoCustRefId) {
		this.intoCustRefId = intoCustRefId;
	}

	public String getLoanPlantDetail() {
		return loanPlantDetail;
	}

	public void setLoanPlantDetail(String loanPlantDetail) {
		this.loanPlantDetail = loanPlantDetail;
	}

	public String getLoanApplyDetail() {
		return loanApplyDetail;
	}

	public void setLoanApplyDetail(String loanApplyDetail) {
		this.loanApplyDetail = loanApplyDetail;
	}

	public String getLoanGrantDetail() {
		return loanGrantDetail;
	}

	public void setLoanGrantDetail(String loanGrantDetail) {
		this.loanGrantDetail = loanGrantDetail;
	}

	public String getLoanRegectDetail() {
		return loanRegectDetail;
	}

	public void setLoanRegectDetail(String loanRegectDetail) {
		this.loanRegectDetail = loanRegectDetail;
	}

	public String getLoanOverdueDetail() {
		return loanOverdueDetail;
	}

	public void setLoanOverdueDetail(String loanOverdueDetail) {
		this.loanOverdueDetail = loanOverdueDetail;
	}

	public String getLoanDebatDetail() {
		return loanDebatDetail;
	}

	public void setLoanDebatDetail(String loanDebatDetail) {
		this.loanDebatDetail = loanDebatDetail;
	}

}
