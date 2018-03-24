package com.jy.modules.externalplatform.interfacerepository.suanhua.extshcreqryacctstock.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:算话征信贷款信息查询_合同信息
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-09 10:01:36
 */
public class ExtShCreqryAcctStockDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private java.lang.Long id;

	/**查询报告主键*/
	private java.lang.Long reportId;

	/**姓名*/
	private java.lang.String sname;

	/**证件类型*/
	private java.lang.String scerttype;

	/**证件号码*/
	private java.lang.String scertno;

	/**业务合同号*/
	private java.lang.String saccount;

	/**上报机构*/
	private java.lang.String org;

	/**信贷业务类型*/
	private java.lang.String scredittype;

	/**信贷业务用途*/
	private java.lang.String spurpose;

	/**合同金额*/
	private java.lang.Long icreditlimit;

	/**币种*/
	private java.lang.String scurrency;

	/**还款频率*/
	private java.lang.String stermsfreq;

	/**生效日期*/
	private java.lang.String ddateopened;

	/**终止日期*/
	private java.lang.String ddateclosed;

	/**担保方式*/
	private java.lang.String iguaranteeway;

	/**发生地点名称*/
	private java.lang.String sareaname;

	/**性别*/
	private java.lang.Long igender;

	/**出生日期*/
	private java.lang.String dbirthday;

	/**婚姻状态*/
	private java.lang.Long imarriage;

	/**最高学历*/
	private java.lang.Long iedulevel;

	/**联系手机*/
	private java.lang.String smobiletel;

	/**通讯地址*/
	private java.lang.String scontactaddress;

	/**居住地址*/
	private java.lang.String saddress;

	/**居住状态*/
	private java.lang.String scondition;

	/**职业性质*/
	private java.lang.String sestatus;

	/**单位名称*/
	private java.lang.String scompany;

	/**单位地址*/
	private java.lang.String scompanyaddress;

	/**职务*/
	private java.lang.Long iposition;

	/**年收入*/
	private java.lang.Long iannualincome;

	/**第一联系人姓名*/
	private java.lang.String sfirstcontactname;

	/**第一联系人关系*/
	private java.lang.String sfirstcontactrelation;

	/**第一联系人电话*/
	private java.lang.String sfirstcontacttel;

	/**CREATE_TIME*/
	private java.sql.Timestamp createTime;

	/**MODIFY_TIME*/
	private java.sql.Timestamp modifyTime;

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
	 *方法: 获得reportId
	 *@return: java.lang.Long  reportId
	 */
	public java.lang.Long getReportId(){
		return this.reportId;
	}

	/**
	 *方法: 设置reportId
	 *@param: java.lang.Long  reportId
	 */
	public void setReportId(java.lang.Long reportId){
		this.reportId = reportId;
	}

	/**
	 *方法: 获得sname
	 *@return: java.lang.String  sname
	 */
	public java.lang.String getSname(){
		return this.sname;
	}

	/**
	 *方法: 设置sname
	 *@param: java.lang.String  sname
	 */
	public void setSname(java.lang.String sname){
		this.sname = sname;
	}

	/**
	 *方法: 获得scerttype
	 *@return: java.lang.String  scerttype
	 */
	public java.lang.String getScerttype(){
		return this.scerttype;
	}

	/**
	 *方法: 设置scerttype
	 *@param: java.lang.String  scerttype
	 */
	public void setScerttype(java.lang.String scerttype){
		this.scerttype = scerttype;
	}

	/**
	 *方法: 获得scertno
	 *@return: java.lang.String  scertno
	 */
	public java.lang.String getScertno(){
		return this.scertno;
	}

	/**
	 *方法: 设置scertno
	 *@param: java.lang.String  scertno
	 */
	public void setScertno(java.lang.String scertno){
		this.scertno = scertno;
	}

	/**
	 *方法: 获得saccount
	 *@return: java.lang.String  saccount
	 */
	public java.lang.String getSaccount(){
		return this.saccount;
	}

	/**
	 *方法: 设置saccount
	 *@param: java.lang.String  saccount
	 */
	public void setSaccount(java.lang.String saccount){
		this.saccount = saccount;
	}

	/**
	 *方法: 获得org
	 *@return: java.lang.String  org
	 */
	public java.lang.String getOrg(){
		return this.org;
	}

	/**
	 *方法: 设置org
	 *@param: java.lang.String  org
	 */
	public void setOrg(java.lang.String org){
		this.org = org;
	}

	/**
	 *方法: 获得scredittype
	 *@return: java.lang.String  scredittype
	 */
	public java.lang.String getScredittype(){
		return this.scredittype;
	}

	/**
	 *方法: 设置scredittype
	 *@param: java.lang.String  scredittype
	 */
	public void setScredittype(java.lang.String scredittype){
		this.scredittype = scredittype;
	}

	/**
	 *方法: 获得spurpose
	 *@return: java.lang.String  spurpose
	 */
	public java.lang.String getSpurpose(){
		return this.spurpose;
	}

	/**
	 *方法: 设置spurpose
	 *@param: java.lang.String  spurpose
	 */
	public void setSpurpose(java.lang.String spurpose){
		this.spurpose = spurpose;
	}

	/**
	 *方法: 获得icreditlimit
	 *@return: java.lang.Long  icreditlimit
	 */
	public java.lang.Long getIcreditlimit(){
		return this.icreditlimit;
	}

	/**
	 *方法: 设置icreditlimit
	 *@param: java.lang.Long  icreditlimit
	 */
	public void setIcreditlimit(java.lang.Long icreditlimit){
		this.icreditlimit = icreditlimit;
	}

	/**
	 *方法: 获得scurrency
	 *@return: java.lang.String  scurrency
	 */
	public java.lang.String getScurrency(){
		return this.scurrency;
	}

	/**
	 *方法: 设置scurrency
	 *@param: java.lang.String  scurrency
	 */
	public void setScurrency(java.lang.String scurrency){
		this.scurrency = scurrency;
	}

	/**
	 *方法: 获得stermsfreq
	 *@return: java.lang.String  stermsfreq
	 */
	public java.lang.String getStermsfreq(){
		return this.stermsfreq;
	}

	/**
	 *方法: 设置stermsfreq
	 *@param: java.lang.String  stermsfreq
	 */
	public void setStermsfreq(java.lang.String stermsfreq){
		this.stermsfreq = stermsfreq;
	}

	/**
	 *方法: 获得ddateopened
	 *@return: java.lang.String  ddateopened
	 */
	public java.lang.String getDdateopened(){
		return this.ddateopened;
	}

	/**
	 *方法: 设置ddateopened
	 *@param: java.lang.String  ddateopened
	 */
	public void setDdateopened(java.lang.String ddateopened){
		this.ddateopened = ddateopened;
	}

	/**
	 *方法: 获得ddateclosed
	 *@return: java.lang.String  ddateclosed
	 */
	public java.lang.String getDdateclosed(){
		return this.ddateclosed;
	}

	/**
	 *方法: 设置ddateclosed
	 *@param: java.lang.String  ddateclosed
	 */
	public void setDdateclosed(java.lang.String ddateclosed){
		this.ddateclosed = ddateclosed;
	}

	/**
	 *方法: 获得iguaranteeway
	 *@return: java.lang.String  iguaranteeway
	 */
	public java.lang.String getIguaranteeway(){
		return this.iguaranteeway;
	}

	/**
	 *方法: 设置iguaranteeway
	 *@param: java.lang.String  iguaranteeway
	 */
	public void setIguaranteeway(java.lang.String iguaranteeway){
		this.iguaranteeway = iguaranteeway;
	}

	/**
	 *方法: 获得sareaname
	 *@return: java.lang.String  sareaname
	 */
	public java.lang.String getSareaname(){
		return this.sareaname;
	}

	/**
	 *方法: 设置sareaname
	 *@param: java.lang.String  sareaname
	 */
	public void setSareaname(java.lang.String sareaname){
		this.sareaname = sareaname;
	}

	/**
	 *方法: 获得igender
	 *@return: java.lang.Long  igender
	 */
	public java.lang.Long getIgender(){
		return this.igender;
	}

	/**
	 *方法: 设置igender
	 *@param: java.lang.Long  igender
	 */
	public void setIgender(java.lang.Long igender){
		this.igender = igender;
	}

	/**
	 *方法: 获得dbirthday
	 *@return: java.lang.String  dbirthday
	 */
	public java.lang.String getDbirthday(){
		return this.dbirthday;
	}

	/**
	 *方法: 设置dbirthday
	 *@param: java.lang.String  dbirthday
	 */
	public void setDbirthday(java.lang.String dbirthday){
		this.dbirthday = dbirthday;
	}

	/**
	 *方法: 获得imarriage
	 *@return: java.lang.Long  imarriage
	 */
	public java.lang.Long getImarriage(){
		return this.imarriage;
	}

	/**
	 *方法: 设置imarriage
	 *@param: java.lang.Long  imarriage
	 */
	public void setImarriage(java.lang.Long imarriage){
		this.imarriage = imarriage;
	}

	/**
	 *方法: 获得iedulevel
	 *@return: java.lang.Long  iedulevel
	 */
	public java.lang.Long getIedulevel(){
		return this.iedulevel;
	}

	/**
	 *方法: 设置iedulevel
	 *@param: java.lang.Long  iedulevel
	 */
	public void setIedulevel(java.lang.Long iedulevel){
		this.iedulevel = iedulevel;
	}

	/**
	 *方法: 获得smobiletel
	 *@return: java.lang.String  smobiletel
	 */
	public java.lang.String getSmobiletel(){
		return this.smobiletel;
	}

	/**
	 *方法: 设置smobiletel
	 *@param: java.lang.String  smobiletel
	 */
	public void setSmobiletel(java.lang.String smobiletel){
		this.smobiletel = smobiletel;
	}

	/**
	 *方法: 获得scontactaddress
	 *@return: java.lang.String  scontactaddress
	 */
	public java.lang.String getScontactaddress(){
		return this.scontactaddress;
	}

	/**
	 *方法: 设置scontactaddress
	 *@param: java.lang.String  scontactaddress
	 */
	public void setScontactaddress(java.lang.String scontactaddress){
		this.scontactaddress = scontactaddress;
	}

	/**
	 *方法: 获得saddress
	 *@return: java.lang.String  saddress
	 */
	public java.lang.String getSaddress(){
		return this.saddress;
	}

	/**
	 *方法: 设置saddress
	 *@param: java.lang.String  saddress
	 */
	public void setSaddress(java.lang.String saddress){
		this.saddress = saddress;
	}

	/**
	 *方法: 获得scondition
	 *@return: java.lang.String  scondition
	 */
	public java.lang.String getScondition(){
		return this.scondition;
	}

	/**
	 *方法: 设置scondition
	 *@param: java.lang.String  scondition
	 */
	public void setScondition(java.lang.String scondition){
		this.scondition = scondition;
	}

	/**
	 *方法: 获得sestatus
	 *@return: java.lang.String  sestatus
	 */
	public java.lang.String getSestatus(){
		return this.sestatus;
	}

	/**
	 *方法: 设置sestatus
	 *@param: java.lang.String  sestatus
	 */
	public void setSestatus(java.lang.String sestatus){
		this.sestatus = sestatus;
	}

	/**
	 *方法: 获得scompany
	 *@return: java.lang.String  scompany
	 */
	public java.lang.String getScompany(){
		return this.scompany;
	}

	/**
	 *方法: 设置scompany
	 *@param: java.lang.String  scompany
	 */
	public void setScompany(java.lang.String scompany){
		this.scompany = scompany;
	}

	/**
	 *方法: 获得scompanyaddress
	 *@return: java.lang.String  scompanyaddress
	 */
	public java.lang.String getScompanyaddress(){
		return this.scompanyaddress;
	}

	/**
	 *方法: 设置scompanyaddress
	 *@param: java.lang.String  scompanyaddress
	 */
	public void setScompanyaddress(java.lang.String scompanyaddress){
		this.scompanyaddress = scompanyaddress;
	}

	/**
	 *方法: 获得iposition
	 *@return: java.lang.Long  iposition
	 */
	public java.lang.Long getIposition(){
		return this.iposition;
	}

	/**
	 *方法: 设置iposition
	 *@param: java.lang.Long  iposition
	 */
	public void setIposition(java.lang.Long iposition){
		this.iposition = iposition;
	}

	/**
	 *方法: 获得iannualincome
	 *@return: java.lang.Long  iannualincome
	 */
	public java.lang.Long getIannualincome(){
		return this.iannualincome;
	}

	/**
	 *方法: 设置iannualincome
	 *@param: java.lang.Long  iannualincome
	 */
	public void setIannualincome(java.lang.Long iannualincome){
		this.iannualincome = iannualincome;
	}

	/**
	 *方法: 获得sfirstcontactname
	 *@return: java.lang.String  sfirstcontactname
	 */
	public java.lang.String getSfirstcontactname(){
		return this.sfirstcontactname;
	}

	/**
	 *方法: 设置sfirstcontactname
	 *@param: java.lang.String  sfirstcontactname
	 */
	public void setSfirstcontactname(java.lang.String sfirstcontactname){
		this.sfirstcontactname = sfirstcontactname;
	}

	/**
	 *方法: 获得sfirstcontactrelation
	 *@return: java.lang.String  sfirstcontactrelation
	 */
	public java.lang.String getSfirstcontactrelation(){
		return this.sfirstcontactrelation;
	}

	/**
	 *方法: 设置sfirstcontactrelation
	 *@param: java.lang.String  sfirstcontactrelation
	 */
	public void setSfirstcontactrelation(java.lang.String sfirstcontactrelation){
		this.sfirstcontactrelation = sfirstcontactrelation;
	}

	/**
	 *方法: 获得sfirstcontacttel
	 *@return: java.lang.String  sfirstcontacttel
	 */
	public java.lang.String getSfirstcontacttel(){
		return this.sfirstcontacttel;
	}

	/**
	 *方法: 设置sfirstcontacttel
	 *@param: java.lang.String  sfirstcontacttel
	 */
	public void setSfirstcontacttel(java.lang.String sfirstcontacttel){
		this.sfirstcontacttel = sfirstcontacttel;
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

}