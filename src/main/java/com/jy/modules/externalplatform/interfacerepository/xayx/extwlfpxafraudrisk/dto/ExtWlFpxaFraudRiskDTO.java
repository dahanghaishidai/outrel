package com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxafraudrisk.dto;

import com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxablack.dto.ExtWlFpxaBlackDTO;
import com.jy.platform.core.common.BaseDTO;

import java.util.List;

/**
 * @className: ExtWlFpxaFraudRiskDTO
 * @package: com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxafraudrisk.dto
 * @describe: EXT_WL_FPXA_FRAUD_RISK
 * @auther: huangxianchao
 * @date: 2018/1/16 0016
 * @time: 上午 9:46
 **/
public class ExtWlFpxaFraudRiskDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	/**创建人*/
	private Long createBy;

	/**修改人*/
	private Long modifyBy;

	/**小爱有信基本信息表主键*/
	private Long fkId;

	/**是否有欺诈风险 1:有/2:无/3:未知(-)/4:疑似负面信息*/
	private String isCheat;

	/**入黑时间 */
	private String beBlackDate;

	/**触碰危名单时间*/
	private String touchRiskDate;

	/**风险分数*/
	private String riskScore;

	//欺诈风险黑名单
    List<ExtWlFpxaBlackDTO> blackList;

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
	 *方法: 获得fkId
	 *@return: java.lang.Long  fkId
	 */
	public Long getFkId(){
		return this.fkId;
	}

	/**
	 *方法: 设置fkId
	 *@param: java.lang.Long  fkId
	 */
	public void setFkId(Long fkId){
		this.fkId = fkId;
	}

	/**
	 *方法: 获得isCheat
	 *@return: java.lang.String  isCheat
	 */
	public String getIsCheat(){
		return this.isCheat;
	}

	/**
	 *方法: 设置isCheat
	 *@param: java.lang.String  isCheat
	 */
	public void setIsCheat(String isCheat){
		this.isCheat = isCheat;
	}

	/**
	 *方法: 获得beBlackDate
	 *@return: java.lang.String  beBlackDate
	 */
	public String getBeBlackDate(){
		return this.beBlackDate;
	}

	/**
	 *方法: 设置beBlackDate
	 *@param: java.lang.String  beBlackDate
	 */
	public void setBeBlackDate(String beBlackDate){
		this.beBlackDate = beBlackDate;
	}

	/**
	 *方法: 获得touchRiskDate
	 *@return: java.lang.String  touchRiskDate
	 */
	public String getTouchRiskDate(){
		return this.touchRiskDate;
	}

	/**
	 *方法: 设置touchRiskDate
	 *@param: java.lang.String  touchRiskDate
	 */
	public void setTouchRiskDate(String touchRiskDate){
		this.touchRiskDate = touchRiskDate;
	}

	/**
	 *方法: 获得riskScore
	 *@return: java.lang.String  riskScore
	 */
	public String getRiskScore(){
		return this.riskScore;
	}

	/**
	 *方法: 设置riskScore
	 *@param: java.lang.String  riskScore
	 */
	public void setRiskScore(String riskScore){
		this.riskScore = riskScore;
	}

	/**
	 * @methodName: getBlackList
	 * @param: []
	 * @describe: 获得blackList
	 * @auther: huangxianchao
	 * @date: 2018/1/15 0015
	 * @time: 下午 4:50
	 **/
    public List<ExtWlFpxaBlackDTO> getBlackList() {
        return blackList;
    }

    /**
     * @methodName: setBlackList
     * @param: [blackList]
     * @describe: 设置blackList
     * @auther: huangxianchao
     * @date: 2018/1/15 0015
     * @time: 下午 4:50
     **/
    public void setBlackList(List<ExtWlFpxaBlackDTO> blackList) {
        this.blackList = blackList;
    }
}