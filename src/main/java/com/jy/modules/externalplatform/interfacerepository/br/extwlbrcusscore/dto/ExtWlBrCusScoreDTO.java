package com.jy.modules.externalplatform.interfacerepository.br.extwlbrcusscore.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:百融_客群评分
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-19 20:14:01
 */
public class ExtWlBrCusScoreDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键
*/
	private Long id;

	/**进件客户关联ID*/
	private Long intoCustRefId;

	/**返回码
*/
	private String code;

	/**每次请求返回的流水号
*/
	private String swiftNumber;

	/**线上大额现金贷客群评分输出标识
1(输出成功),0(未匹配上无输出),98(用户输入信息不足),99(系统异常)
*/
	private String flagScore;

	/**线上大额现金贷客群评分
评分取值范围[300,1000]，分数越高，客户信用越好
"*/
	private String scorelargecashv2;

    /**线下大额现金贷客群评分 评分取值范围[300,1000]，分数越高，客户信用越好*/
    private String scorelargecashv1;

	/**创建时间
*/
	private java.sql.Timestamp createTime;

	/**修改时间
*/
	private java.sql.Timestamp updateTime;

	/**创建人
*/
	private Long createBy;

	/**修改人
*/
	private Long updateBy;

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
	 *方法: 获得code
	 *@return: java.lang.String  code
	 */
	public String getCode(){
		return this.code;
	}

	/**
	 *方法: 设置code
	 *@param: java.lang.String  code
	 */
	public void setCode(String code){
		this.code = code;
	}

	/**
	 *方法: 获得swiftNumber
	 *@return: java.lang.String  swiftNumber
	 */
	public String getSwiftNumber(){
		return this.swiftNumber;
	}

	/**
	 *方法: 设置swiftNumber
	 *@param: java.lang.String  swiftNumber
	 */
	public void setSwiftNumber(String swiftNumber){
		this.swiftNumber = swiftNumber;
	}

	/**
	 *方法: 获得flagScore
	 *@return: java.lang.String  flagScore
	 */
	public String getFlagScore(){
		return this.flagScore;
	}

	/**
	 *方法: 设置flagScore
	 *@param: java.lang.String  flagScore
	 */
	public void setFlagScore(String flagScore){
		this.flagScore = flagScore;
	}

	/**
	 *方法: 获得scorelargecashv2
	 *@return: java.lang.String  scorelargecashv2
	 */
	public String getScorelargecashv2(){
		return this.scorelargecashv2;
	}

	/**
	 *方法: 设置scorelargecashv2
	 *@param: java.lang.String  scorelargecashv2
	 */
	public void setScorelargecashv2(String scorelargecashv2){
		this.scorelargecashv2 = scorelargecashv2;
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
	 *方法: 获得updateTime
	 *@return: java.sql.Timestamp  updateTime
	 */
	public java.sql.Timestamp getUpdateTime(){
		return this.updateTime;
	}

	/**
	 *方法: 设置updateTime
	 *@param: java.sql.Timestamp  updateTime
	 */
	public void setUpdateTime(java.sql.Timestamp updateTime){
		this.updateTime = updateTime;
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
	 *方法: 获得updateBy
	 *@return: java.lang.Long  updateBy
	 */
	public Long getUpdateBy(){
		return this.updateBy;
	}

	/**
	 *方法: 设置updateBy
	 *@param: java.lang.Long  updateBy
	 */
	public void setUpdateBy(Long updateBy){
		this.updateBy = updateBy;
	}

	public Long getIntoCustRefId() {
		return intoCustRefId;
	}

	public void setIntoCustRefId(Long intoCustRefId) {
		this.intoCustRefId = intoCustRefId;
	}

    public String getScorelargecashv1() {
        return scorelargecashv1;
    }

    public void setScorelargecashv1(String scorelargecashv1) {
        this.scorelargecashv1 = scorelargecashv1;
    }
}