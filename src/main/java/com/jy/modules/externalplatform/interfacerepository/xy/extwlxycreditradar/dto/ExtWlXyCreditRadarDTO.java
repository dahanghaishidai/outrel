package com.jy.modules.externalplatform.interfacerepository.xy.extwlxycreditradar.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:新颜征信雷达报告表
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-06 16:36:40
 */
public class ExtWlXyCreditRadarDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键id*/
	private Long id;

	/**进件客户关联主键*/
	private Long intoCustRefId;

	/**申请准入分(0-1000)*/
	private String col21160001;

	/**申请准入置信度(1-100)*/
	private String col21160002;

	/**申请命中查询机构数*/
	private String col21160003;

	/**申请命中消费金融类机构数*/
	private String col21160004;

	/**申请命中网络贷款类机构数*/
	private String col21160005;

	/**机构总查询次数*/
	private String col21160006;

	/**最近一次机构查询时间*/
	private String col21160007;

	/**近1个月贷款类机构总查询笔数*/
	private String col21160008;

	/**近3个月贷款类机构总查询笔数*/
	private String col21160009;

	/**近6个月贷款类机构总查询笔数*/
	private String col21160010;

	/**贷款行为分(0-1000)*/
	private String col21170001;

	/**贷款行为置信度(0-100)*/
	private String col21170002;

	/**贷款放款总订单数*/
	private String col21170003;

	/**贷款已结清订单数*/
	private String col21170004;

	/**贷款逾期订单数（ M1）*/
	private String col21170005;

	/**命中贷款放款机构数*/
	private String col21170006;

	/**命中消费金融类机构数*/
	private String col21170007;

	/**命中网络贷款类机构数*/
	private String col21170008;

	/**近1个月贷款机构放款笔数*/
	private String col21170009;

	/**近3个月贷款机构放款笔数*/
	private String col21170010;

	/**近6个月贷款机构放款笔数*/
	private String col21170011;

	/**历史贷款机构成功扣款笔数*/
	private String col21170012;

	/**历史贷款机构失败扣款笔数*/
	private String col21170013;

	/**近1个月贷款机构成功扣款笔数*/
	private String col21170014;

	/**近1个月贷款机构失败扣款笔数*/
	private String col21170015;

	/**信用贷款时长(天)*/
	private String col21170016;

	/**最近一次贷款放款时间*/
	private String col21170017;

	/**建议授信额度*/
	private String col21180001;

	/**建议额度置信度(0-100)*/
	private String col21180002;

	/**命中在用的网络贷款类机构数*/
	private String col21180003;

	/**命中在用的网络贷款类产品数*/
	private String col21180004;

	/**网络贷款机构最大授信额度*/
	private String col21180005;

	/**网络贷款机构平均授信额度*/
	private String col21180006;

	/**命中在用的消费金融类机构数*/
	private String col21180007;

	/**命中在用的消费金融类产品数*/
	private String col21180008;

	/**消费金融类机构最大授信额度*/
	private String col21180009;

	/**消费金融类机构平均授信额度*/
	private String col21180010;

	/**消金建议授信额度*/
	private String col21180011;

	/**消金建议额度置信度(0-100)*/
	private String col21180012;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	/**创建人*/
	private Long createBy;

	/**修改人*/
	private Long modifyBy;

	/**证件号码*/
	private String cardNo;

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
	 *方法: 获得intoCustRefId
	 *@return: java.lang.Long  intoCustRefId
	 */
	public Long getIntoCustRefId(){
		return this.intoCustRefId;
	}

	/**
	 *方法: 设置intoCustRefId
	 *@param: java.lang.Long  intoCustRefId
	 */
	public void setIntoCustRefId(Long intoCustRefId){
		this.intoCustRefId = intoCustRefId;
	}

	/**
	 *方法: 获得col21160001
	 *@return: java.lang.String  col21160001
	 */
	public String getCol21160001(){
		return this.col21160001;
	}

	/**
	 *方法: 设置col21160001
	 *@param: java.lang.String  col21160001
	 */
	public void setCol21160001(String col21160001){
		this.col21160001 = col21160001;
	}

	/**
	 *方法: 获得col21160002
	 *@return: java.lang.String  col21160002
	 */
	public String getCol21160002(){
		return this.col21160002;
	}

	/**
	 *方法: 设置col21160002
	 *@param: java.lang.String  col21160002
	 */
	public void setCol21160002(String col21160002){
		this.col21160002 = col21160002;
	}

	/**
	 *方法: 获得col21160003
	 *@return: java.lang.String  col21160003
	 */
	public String getCol21160003(){
		return this.col21160003;
	}

	/**
	 *方法: 设置col21160003
	 *@param: java.lang.String  col21160003
	 */
	public void setCol21160003(String col21160003){
		this.col21160003 = col21160003;
	}

	/**
	 *方法: 获得col21160004
	 *@return: java.lang.String  col21160004
	 */
	public String getCol21160004(){
		return this.col21160004;
	}

	/**
	 *方法: 设置col21160004
	 *@param: java.lang.String  col21160004
	 */
	public void setCol21160004(String col21160004){
		this.col21160004 = col21160004;
	}

	/**
	 *方法: 获得col21160005
	 *@return: java.lang.String  col21160005
	 */
	public String getCol21160005(){
		return this.col21160005;
	}

	/**
	 *方法: 设置col21160005
	 *@param: java.lang.String  col21160005
	 */
	public void setCol21160005(String col21160005){
		this.col21160005 = col21160005;
	}

	/**
	 *方法: 获得col21160006
	 *@return: java.lang.String  col21160006
	 */
	public String getCol21160006(){
		return this.col21160006;
	}

	/**
	 *方法: 设置col21160006
	 *@param: java.lang.String  col21160006
	 */
	public void setCol21160006(String col21160006){
		this.col21160006 = col21160006;
	}

	/**
	 *方法: 获得col21160007
	 *@return: java.lang.String  col21160007
	 */
	public String getCol21160007(){
		return this.col21160007;
	}

	/**
	 *方法: 设置col21160007
	 *@param: java.lang.String  col21160007
	 */
	public void setCol21160007(String col21160007){
		this.col21160007 = col21160007;
	}

	/**
	 *方法: 获得col21160008
	 *@return: java.lang.String  col21160008
	 */
	public String getCol21160008(){
		return this.col21160008;
	}

	/**
	 *方法: 设置col21160008
	 *@param: java.lang.String  col21160008
	 */
	public void setCol21160008(String col21160008){
		this.col21160008 = col21160008;
	}

	/**
	 *方法: 获得col21160009
	 *@return: java.lang.String  col21160009
	 */
	public String getCol21160009(){
		return this.col21160009;
	}

	/**
	 *方法: 设置col21160009
	 *@param: java.lang.String  col21160009
	 */
	public void setCol21160009(String col21160009){
		this.col21160009 = col21160009;
	}

	/**
	 *方法: 获得col21160010
	 *@return: java.lang.String  col21160010
	 */
	public String getCol21160010(){
		return this.col21160010;
	}

	/**
	 *方法: 设置col21160010
	 *@param: java.lang.String  col21160010
	 */
	public void setCol21160010(String col21160010){
		this.col21160010 = col21160010;
	}

	/**
	 *方法: 获得col21170001
	 *@return: java.lang.String  col21170001
	 */
	public String getCol21170001(){
		return this.col21170001;
	}

	/**
	 *方法: 设置col21170001
	 *@param: java.lang.String  col21170001
	 */
	public void setCol21170001(String col21170001){
		this.col21170001 = col21170001;
	}

	/**
	 *方法: 获得col21170002
	 *@return: java.lang.String  col21170002
	 */
	public String getCol21170002(){
		return this.col21170002;
	}

	/**
	 *方法: 设置col21170002
	 *@param: java.lang.String  col21170002
	 */
	public void setCol21170002(String col21170002){
		this.col21170002 = col21170002;
	}

	/**
	 *方法: 获得col21170003
	 *@return: java.lang.String  col21170003
	 */
	public String getCol21170003(){
		return this.col21170003;
	}

	/**
	 *方法: 设置col21170003
	 *@param: java.lang.String  col21170003
	 */
	public void setCol21170003(String col21170003){
		this.col21170003 = col21170003;
	}

	/**
	 *方法: 获得col21170004
	 *@return: java.lang.String  col21170004
	 */
	public String getCol21170004(){
		return this.col21170004;
	}

	/**
	 *方法: 设置col21170004
	 *@param: java.lang.String  col21170004
	 */
	public void setCol21170004(String col21170004){
		this.col21170004 = col21170004;
	}

	/**
	 *方法: 获得col21170005
	 *@return: java.lang.String  col21170005
	 */
	public String getCol21170005(){
		return this.col21170005;
	}

	/**
	 *方法: 设置col21170005
	 *@param: java.lang.String  col21170005
	 */
	public void setCol21170005(String col21170005){
		this.col21170005 = col21170005;
	}

	/**
	 *方法: 获得col21170006
	 *@return: java.lang.String  col21170006
	 */
	public String getCol21170006(){
		return this.col21170006;
	}

	/**
	 *方法: 设置col21170006
	 *@param: java.lang.String  col21170006
	 */
	public void setCol21170006(String col21170006){
		this.col21170006 = col21170006;
	}

	/**
	 *方法: 获得col21170007
	 *@return: java.lang.String  col21170007
	 */
	public String getCol21170007(){
		return this.col21170007;
	}

	/**
	 *方法: 设置col21170007
	 *@param: java.lang.String  col21170007
	 */
	public void setCol21170007(String col21170007){
		this.col21170007 = col21170007;
	}

	/**
	 *方法: 获得col21170008
	 *@return: java.lang.String  col21170008
	 */
	public String getCol21170008(){
		return this.col21170008;
	}

	/**
	 *方法: 设置col21170008
	 *@param: java.lang.String  col21170008
	 */
	public void setCol21170008(String col21170008){
		this.col21170008 = col21170008;
	}

	/**
	 *方法: 获得col21170009
	 *@return: java.lang.String  col21170009
	 */
	public String getCol21170009(){
		return this.col21170009;
	}

	/**
	 *方法: 设置col21170009
	 *@param: java.lang.String  col21170009
	 */
	public void setCol21170009(String col21170009){
		this.col21170009 = col21170009;
	}

	/**
	 *方法: 获得col21170010
	 *@return: java.lang.String  col21170010
	 */
	public String getCol21170010(){
		return this.col21170010;
	}

	/**
	 *方法: 设置col21170010
	 *@param: java.lang.String  col21170010
	 */
	public void setCol21170010(String col21170010){
		this.col21170010 = col21170010;
	}

	/**
	 *方法: 获得col21170011
	 *@return: java.lang.String  col21170011
	 */
	public String getCol21170011(){
		return this.col21170011;
	}

	/**
	 *方法: 设置col21170011
	 *@param: java.lang.String  col21170011
	 */
	public void setCol21170011(String col21170011){
		this.col21170011 = col21170011;
	}

	/**
	 *方法: 获得col21170012
	 *@return: java.lang.String  col21170012
	 */
	public String getCol21170012(){
		return this.col21170012;
	}

	/**
	 *方法: 设置col21170012
	 *@param: java.lang.String  col21170012
	 */
	public void setCol21170012(String col21170012){
		this.col21170012 = col21170012;
	}

	/**
	 *方法: 获得col21170013
	 *@return: java.lang.String  col21170013
	 */
	public String getCol21170013(){
		return this.col21170013;
	}

	/**
	 *方法: 设置col21170013
	 *@param: java.lang.String  col21170013
	 */
	public void setCol21170013(String col21170013){
		this.col21170013 = col21170013;
	}

	/**
	 *方法: 获得col21170014
	 *@return: java.lang.String  col21170014
	 */
	public String getCol21170014(){
		return this.col21170014;
	}

	/**
	 *方法: 设置col21170014
	 *@param: java.lang.String  col21170014
	 */
	public void setCol21170014(String col21170014){
		this.col21170014 = col21170014;
	}

	/**
	 *方法: 获得col21170015
	 *@return: java.lang.String  col21170015
	 */
	public String getCol21170015(){
		return this.col21170015;
	}

	/**
	 *方法: 设置col21170015
	 *@param: java.lang.String  col21170015
	 */
	public void setCol21170015(String col21170015){
		this.col21170015 = col21170015;
	}

	/**
	 *方法: 获得col21170016
	 *@return: java.lang.String  col21170016
	 */
	public String getCol21170016(){
		return this.col21170016;
	}

	/**
	 *方法: 设置col21170016
	 *@param: java.lang.String  col21170016
	 */
	public void setCol21170016(String col21170016){
		this.col21170016 = col21170016;
	}

	/**
	 *方法: 获得col21170017
	 *@return: java.lang.String  col21170017
	 */
	public String getCol21170017(){
		return this.col21170017;
	}

	/**
	 *方法: 设置col21170017
	 *@param: java.lang.String  col21170017
	 */
	public void setCol21170017(String col21170017){
		this.col21170017 = col21170017;
	}

	/**
	 *方法: 获得col21180001
	 *@return: java.lang.String  col21180001
	 */
	public String getCol21180001(){
		return this.col21180001;
	}

	/**
	 *方法: 设置col21180001
	 *@param: java.lang.String  col21180001
	 */
	public void setCol21180001(String col21180001){
		this.col21180001 = col21180001;
	}

	/**
	 *方法: 获得col21180002
	 *@return: java.lang.String  col21180002
	 */
	public String getCol21180002(){
		return this.col21180002;
	}

	/**
	 *方法: 设置col21180002
	 *@param: java.lang.String  col21180002
	 */
	public void setCol21180002(String col21180002){
		this.col21180002 = col21180002;
	}

	/**
	 *方法: 获得col21180003
	 *@return: java.lang.String  col21180003
	 */
	public String getCol21180003(){
		return this.col21180003;
	}

	/**
	 *方法: 设置col21180003
	 *@param: java.lang.String  col21180003
	 */
	public void setCol21180003(String col21180003){
		this.col21180003 = col21180003;
	}

	/**
	 *方法: 获得col21180004
	 *@return: java.lang.String  col21180004
	 */
	public String getCol21180004(){
		return this.col21180004;
	}

	/**
	 *方法: 设置col21180004
	 *@param: java.lang.String  col21180004
	 */
	public void setCol21180004(String col21180004){
		this.col21180004 = col21180004;
	}

	/**
	 *方法: 获得col21180005
	 *@return: java.lang.String  col21180005
	 */
	public String getCol21180005(){
		return this.col21180005;
	}

	/**
	 *方法: 设置col21180005
	 *@param: java.lang.String  col21180005
	 */
	public void setCol21180005(String col21180005){
		this.col21180005 = col21180005;
	}

	/**
	 *方法: 获得col21180006
	 *@return: java.lang.String  col21180006
	 */
	public String getCol21180006(){
		return this.col21180006;
	}

	/**
	 *方法: 设置col21180006
	 *@param: java.lang.String  col21180006
	 */
	public void setCol21180006(String col21180006){
		this.col21180006 = col21180006;
	}

	/**
	 *方法: 获得col21180007
	 *@return: java.lang.String  col21180007
	 */
	public String getCol21180007(){
		return this.col21180007;
	}

	/**
	 *方法: 设置col21180007
	 *@param: java.lang.String  col21180007
	 */
	public void setCol21180007(String col21180007){
		this.col21180007 = col21180007;
	}

	/**
	 *方法: 获得col21180008
	 *@return: java.lang.String  col21180008
	 */
	public String getCol21180008(){
		return this.col21180008;
	}

	/**
	 *方法: 设置col21180008
	 *@param: java.lang.String  col21180008
	 */
	public void setCol21180008(String col21180008){
		this.col21180008 = col21180008;
	}

	/**
	 *方法: 获得col21180009
	 *@return: java.lang.String  col21180009
	 */
	public String getCol21180009(){
		return this.col21180009;
	}

	/**
	 *方法: 设置col21180009
	 *@param: java.lang.String  col21180009
	 */
	public void setCol21180009(String col21180009){
		this.col21180009 = col21180009;
	}

	/**
	 *方法: 获得col21180010
	 *@return: java.lang.String  col21180010
	 */
	public String getCol21180010(){
		return this.col21180010;
	}

	/**
	 *方法: 设置col21180010
	 *@param: java.lang.String  col21180010
	 */
	public void setCol21180010(String col21180010){
		this.col21180010 = col21180010;
	}

	/**
	 *方法: 获得col21180011
	 *@return: java.lang.String  col21180011
	 */
	public String getCol21180011(){
		return this.col21180011;
	}

	/**
	 *方法: 设置col21180011
	 *@param: java.lang.String  col21180011
	 */
	public void setCol21180011(String col21180011){
		this.col21180011 = col21180011;
	}

	/**
	 *方法: 获得col21180012
	 *@return: java.lang.String  col21180012
	 */
	public String getCol21180012(){
		return this.col21180012;
	}

	/**
	 *方法: 设置col21180012
	 *@param: java.lang.String  col21180012
	 */
	public void setCol21180012(String col21180012){
		this.col21180012 = col21180012;
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
	 *方法: 获得cardNo
	 *@return: java.lang.String  cardNo
	 */
	public String getCardNo(){
		return this.cardNo;
	}

	/**
	 *方法: 设置cardNo
	 *@param: java.lang.String  cardNo
	 */
	public void setCardNo(String cardNo){
		this.cardNo = cardNo;
	}

}