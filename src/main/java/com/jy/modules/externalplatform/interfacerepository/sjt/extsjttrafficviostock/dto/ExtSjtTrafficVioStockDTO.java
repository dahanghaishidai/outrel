package com.jy.modules.externalplatform.interfacerepository.sjt.extsjttrafficviostock.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:数据堂交通违章信息
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-08 16:48:10
 */
public class ExtSjtTrafficVioStockDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private java.lang.Long id;

	/**违章时间*/
	private java.lang.String time;

	/**违章地点*/
	private java.lang.String location;

	/**违章原因*/
	private java.lang.String reason;

	/**罚款金额*/
	private java.lang.String count;

	/**状态 0-未处理 1已处理*/
	private java.lang.String status;

	/**违章采集机关*/
	private java.lang.String department;

	/**扣分*/
	private java.lang.String degree;

	/**违章代码*/
	private java.lang.String code;

	/**违章项文书编号*/
	private java.lang.String archive;

	/**联系电话*/
	private java.lang.String telephone;

	/**违章处理地址*/
	private java.lang.String executeLocation;

	/**执行部门*/
	private java.lang.String executeDepartment;

	/**违章分类类别*/
	private java.lang.String category;

	/**滞纳金*/
	private java.lang.String latefine;

	/**处罚依据*/
	private java.lang.String punishmentAccordin;

	/**违法条款*/
	private java.lang.String illegalEntry;

	/**违章归属地ID*/
	private java.lang.String locationId;

	/**违章地点*/
	private java.lang.String locationName;

	/**查询数据源ID*/
	private java.lang.String dataSourceId;

	/**实时数据/历史数据*/
	private java.lang.String recordType;

	/**手续费*/
	private java.lang.String poundage;

	/**是否可以代办  0-不可以 1-可以*/
	private java.lang.String canProcess;

	/**违章记录id，用于下单*/
	private java.lang.String secondaryUniqueCode;

	/**违章信息的特征码*/
	private java.lang.String uniqueCode;

	/**扣分手续费*/
	private java.lang.String degreePoundage;

	/**是否代办原因*/
	private java.lang.String canProcessMsg;

	/**预留*/
	private java.lang.String other;

	/**校验流水号*/
	private java.lang.String transNo;

	/**数据有效性*/
	private java.lang.String validateState;

	/**CREATE_TIME*/
	private java.sql.Timestamp createTime;

	/**创建人*/
	private java.lang.String createBy;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	/**修改人*/
	private java.lang.String modifyBy;

	/**产品编码*/
	private java.lang.String prodCode;

	/**机构编码*/
	private java.lang.String orgCode;

	/**系统编码*/
	private java.lang.String sysCode;

	/**返回码 1：查有 2：查无 3：查询报错 4：解析错误 5:返回错误信息*/
	private java.lang.String retcode;

	/**返回错误信息*/
	private java.lang.String errormsg;

	/**接口日志ID*/
	private java.lang.String interfaceId;

	/**备注*/
	private java.lang.String remark;

	private String success ;
	private String errorCode ;
	private String errMessage ;
	
	private String hasData ;
	private String lastSearchTime ;
	private ExtSjtTrafficVioStockDTO[] records ;
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
	 *方法: 获得time
	 *@return: java.lang.String  time
	 */
	public java.lang.String getTime(){
		return this.time;
	}

	/**
	 *方法: 设置time
	 *@param: java.lang.String  time
	 */
	public void setTime(java.lang.String time){
		this.time = time;
	}

	/**
	 *方法: 获得location
	 *@return: java.lang.String  location
	 */
	public java.lang.String getLocation(){
		return this.location;
	}

	/**
	 *方法: 设置location
	 *@param: java.lang.String  location
	 */
	public void setLocation(java.lang.String location){
		this.location = location;
	}

	/**
	 *方法: 获得reason
	 *@return: java.lang.String  reason
	 */
	public java.lang.String getReason(){
		return this.reason;
	}

	/**
	 *方法: 设置reason
	 *@param: java.lang.String  reason
	 */
	public void setReason(java.lang.String reason){
		this.reason = reason;
	}

	/**
	 *方法: 获得count
	 *@return: java.lang.String  count
	 */
	public java.lang.String getCount(){
		return this.count;
	}

	/**
	 *方法: 设置count
	 *@param: java.lang.String  count
	 */
	public void setCount(java.lang.String count){
		this.count = count;
	}

	/**
	 *方法: 获得status
	 *@return: java.lang.String  status
	 */
	public java.lang.String getStatus(){
		return this.status;
	}

	/**
	 *方法: 设置status
	 *@param: java.lang.String  status
	 */
	public void setStatus(java.lang.String status){
		this.status = status;
	}

	/**
	 *方法: 获得department
	 *@return: java.lang.String  department
	 */
	public java.lang.String getDepartment(){
		return this.department;
	}

	/**
	 *方法: 设置department
	 *@param: java.lang.String  department
	 */
	public void setDepartment(java.lang.String department){
		this.department = department;
	}

	/**
	 *方法: 获得degree
	 *@return: java.lang.String  degree
	 */
	public java.lang.String getDegree(){
		return this.degree;
	}

	/**
	 *方法: 设置degree
	 *@param: java.lang.String  degree
	 */
	public void setDegree(java.lang.String degree){
		this.degree = degree;
	}

	/**
	 *方法: 获得code
	 *@return: java.lang.String  code
	 */
	public java.lang.String getCode(){
		return this.code;
	}

	/**
	 *方法: 设置code
	 *@param: java.lang.String  code
	 */
	public void setCode(java.lang.String code){
		this.code = code;
	}

	/**
	 *方法: 获得archive
	 *@return: java.lang.String  archive
	 */
	public java.lang.String getArchive(){
		return this.archive;
	}

	/**
	 *方法: 设置archive
	 *@param: java.lang.String  archive
	 */
	public void setArchive(java.lang.String archive){
		this.archive = archive;
	}

	/**
	 *方法: 获得telephone
	 *@return: java.lang.String  telephone
	 */
	public java.lang.String getTelephone(){
		return this.telephone;
	}

	/**
	 *方法: 设置telephone
	 *@param: java.lang.String  telephone
	 */
	public void setTelephone(java.lang.String telephone){
		this.telephone = telephone;
	}

	/**
	 *方法: 获得executeLocation
	 *@return: java.lang.String  executeLocation
	 */
	public java.lang.String getExecuteLocation(){
		return this.executeLocation;
	}

	/**
	 *方法: 设置executeLocation
	 *@param: java.lang.String  executeLocation
	 */
	public void setExecuteLocation(java.lang.String executeLocation){
		this.executeLocation = executeLocation;
	}

	/**
	 *方法: 获得executeDepartment
	 *@return: java.lang.String  executeDepartment
	 */
	public java.lang.String getExecuteDepartment(){
		return this.executeDepartment;
	}

	/**
	 *方法: 设置executeDepartment
	 *@param: java.lang.String  executeDepartment
	 */
	public void setExecuteDepartment(java.lang.String executeDepartment){
		this.executeDepartment = executeDepartment;
	}

	/**
	 *方法: 获得category
	 *@return: java.lang.String  category
	 */
	public java.lang.String getCategory(){
		return this.category;
	}

	/**
	 *方法: 设置category
	 *@param: java.lang.String  category
	 */
	public void setCategory(java.lang.String category){
		this.category = category;
	}

	/**
	 *方法: 获得latefine
	 *@return: java.lang.String  latefine
	 */
	public java.lang.String getLatefine(){
		return this.latefine;
	}

	/**
	 *方法: 设置latefine
	 *@param: java.lang.String  latefine
	 */
	public void setLatefine(java.lang.String latefine){
		this.latefine = latefine;
	}

	/**
	 *方法: 获得punishmentAccordin
	 *@return: java.lang.String  punishmentAccordin
	 */
	public java.lang.String getPunishmentAccordin(){
		return this.punishmentAccordin;
	}

	/**
	 *方法: 设置punishmentAccordin
	 *@param: java.lang.String  punishmentAccordin
	 */
	public void setPunishmentAccordin(java.lang.String punishmentAccordin){
		this.punishmentAccordin = punishmentAccordin;
	}

	/**
	 *方法: 获得illegalEntry
	 *@return: java.lang.String  illegalEntry
	 */
	public java.lang.String getIllegalEntry(){
		return this.illegalEntry;
	}

	/**
	 *方法: 设置illegalEntry
	 *@param: java.lang.String  illegalEntry
	 */
	public void setIllegalEntry(java.lang.String illegalEntry){
		this.illegalEntry = illegalEntry;
	}

	/**
	 *方法: 获得locationId
	 *@return: java.lang.String  locationId
	 */
	public java.lang.String getLocationId(){
		return this.locationId;
	}

	/**
	 *方法: 设置locationId
	 *@param: java.lang.String  locationId
	 */
	public void setLocationId(java.lang.String locationId){
		this.locationId = locationId;
	}

	/**
	 *方法: 获得locationName
	 *@return: java.lang.String  locationName
	 */
	public java.lang.String getLocationName(){
		return this.locationName;
	}

	/**
	 *方法: 设置locationName
	 *@param: java.lang.String  locationName
	 */
	public void setLocationName(java.lang.String locationName){
		this.locationName = locationName;
	}

	/**
	 *方法: 获得dataSourceId
	 *@return: java.lang.String  dataSourceId
	 */
	public java.lang.String getDataSourceId(){
		return this.dataSourceId;
	}

	/**
	 *方法: 设置dataSourceId
	 *@param: java.lang.String  dataSourceId
	 */
	public void setDataSourceId(java.lang.String dataSourceId){
		this.dataSourceId = dataSourceId;
	}

	/**
	 *方法: 获得recordType
	 *@return: java.lang.String  recordType
	 */
	public java.lang.String getRecordType(){
		return this.recordType;
	}

	/**
	 *方法: 设置recordType
	 *@param: java.lang.String  recordType
	 */
	public void setRecordType(java.lang.String recordType){
		this.recordType = recordType;
	}

	/**
	 *方法: 获得poundage
	 *@return: java.lang.String  poundage
	 */
	public java.lang.String getPoundage(){
		return this.poundage;
	}

	/**
	 *方法: 设置poundage
	 *@param: java.lang.String  poundage
	 */
	public void setPoundage(java.lang.String poundage){
		this.poundage = poundage;
	}

	/**
	 *方法: 获得canProcess
	 *@return: java.lang.String  canProcess
	 */
	public java.lang.String getCanProcess(){
		return this.canProcess;
	}

	/**
	 *方法: 设置canProcess
	 *@param: java.lang.String  canProcess
	 */
	public void setCanProcess(java.lang.String canProcess){
		this.canProcess = canProcess;
	}

	/**
	 *方法: 获得secondaryUniqueCode
	 *@return: java.lang.String  secondaryUniqueCode
	 */
	public java.lang.String getSecondaryUniqueCode(){
		return this.secondaryUniqueCode;
	}

	/**
	 *方法: 设置secondaryUniqueCode
	 *@param: java.lang.String  secondaryUniqueCode
	 */
	public void setSecondaryUniqueCode(java.lang.String secondaryUniqueCode){
		this.secondaryUniqueCode = secondaryUniqueCode;
	}

	/**
	 *方法: 获得uniqueCode
	 *@return: java.lang.String  uniqueCode
	 */
	public java.lang.String getUniqueCode(){
		return this.uniqueCode;
	}

	/**
	 *方法: 设置uniqueCode
	 *@param: java.lang.String  uniqueCode
	 */
	public void setUniqueCode(java.lang.String uniqueCode){
		this.uniqueCode = uniqueCode;
	}

	/**
	 *方法: 获得degreePoundage
	 *@return: java.lang.String  degreePoundage
	 */
	public java.lang.String getDegreePoundage(){
		return this.degreePoundage;
	}

	/**
	 *方法: 设置degreePoundage
	 *@param: java.lang.String  degreePoundage
	 */
	public void setDegreePoundage(java.lang.String degreePoundage){
		this.degreePoundage = degreePoundage;
	}

	/**
	 *方法: 获得canProcessMsg
	 *@return: java.lang.String  canProcessMsg
	 */
	public java.lang.String getCanProcessMsg(){
		return this.canProcessMsg;
	}

	/**
	 *方法: 设置canProcessMsg
	 *@param: java.lang.String  canProcessMsg
	 */
	public void setCanProcessMsg(java.lang.String canProcessMsg){
		this.canProcessMsg = canProcessMsg;
	}

	/**
	 *方法: 获得other
	 *@return: java.lang.String  other
	 */
	public java.lang.String getOther(){
		return this.other;
	}

	/**
	 *方法: 设置other
	 *@param: java.lang.String  other
	 */
	public void setOther(java.lang.String other){
		this.other = other;
	}

	/**
	 *方法: 获得transNo
	 *@return: java.lang.String  transNo
	 */
	public java.lang.String getTransNo(){
		return this.transNo;
	}

	/**
	 *方法: 设置transNo
	 *@param: java.lang.String  transNo
	 */
	public void setTransNo(java.lang.String transNo){
		this.transNo = transNo;
	}

	/**
	 *方法: 获得validateState
	 *@return: java.lang.String  validateState
	 */
	public java.lang.String getValidateState(){
		return this.validateState;
	}

	/**
	 *方法: 设置validateState
	 *@param: java.lang.String  validateState
	 */
	public void setValidateState(java.lang.String validateState){
		this.validateState = validateState;
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
	 *@return: java.lang.String  createBy
	 */
	public java.lang.String getCreateBy(){
		return this.createBy;
	}

	/**
	 *方法: 设置createBy
	 *@param: java.lang.String  createBy
	 */
	public void setCreateBy(java.lang.String createBy){
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
	 *@return: java.lang.String  modifyBy
	 */
	public java.lang.String getModifyBy(){
		return this.modifyBy;
	}

	/**
	 *方法: 设置modifyBy
	 *@param: java.lang.String  modifyBy
	 */
	public void setModifyBy(java.lang.String modifyBy){
		this.modifyBy = modifyBy;
	}

	/**
	 *方法: 获得prodCode
	 *@return: java.lang.String  prodCode
	 */
	public java.lang.String getProdCode(){
		return this.prodCode;
	}

	/**
	 *方法: 设置prodCode
	 *@param: java.lang.String  prodCode
	 */
	public void setProdCode(java.lang.String prodCode){
		this.prodCode = prodCode;
	}

	/**
	 *方法: 获得orgCode
	 *@return: java.lang.String  orgCode
	 */
	public java.lang.String getOrgCode(){
		return this.orgCode;
	}

	/**
	 *方法: 设置orgCode
	 *@param: java.lang.String  orgCode
	 */
	public void setOrgCode(java.lang.String orgCode){
		this.orgCode = orgCode;
	}

	/**
	 *方法: 获得sysCode
	 *@return: java.lang.String  sysCode
	 */
	public java.lang.String getSysCode(){
		return this.sysCode;
	}

	/**
	 *方法: 设置sysCode
	 *@param: java.lang.String  sysCode
	 */
	public void setSysCode(java.lang.String sysCode){
		this.sysCode = sysCode;
	}

	/**
	 *方法: 获得retcode
	 *@return: java.lang.String  retcode
	 */
	public java.lang.String getRetcode(){
		return this.retcode;
	}

	/**
	 *方法: 设置retcode
	 *@param: java.lang.String  retcode
	 */
	public void setRetcode(java.lang.String retcode){
		this.retcode = retcode;
	}

	/**
	 *方法: 获得errormsg
	 *@return: java.lang.String  errormsg
	 */
	public java.lang.String getErrormsg(){
		return this.errormsg;
	}

	/**
	 *方法: 设置errormsg
	 *@param: java.lang.String  errormsg
	 */
	public void setErrormsg(java.lang.String errormsg){
		this.errormsg = errormsg;
	}

	/**
	 *方法: 获得interfaceId
	 *@return: java.lang.String  interfaceId
	 */
	public java.lang.String getInterfaceId(){
		return this.interfaceId;
	}

	/**
	 *方法: 设置interfaceId
	 *@param: java.lang.String  interfaceId
	 */
	public void setInterfaceId(java.lang.String interfaceId){
		this.interfaceId = interfaceId;
	}

	/**
	 *方法: 获得remark
	 *@return: java.lang.String  remark
	 */
	public java.lang.String getRemark(){
		return this.remark;
	}

	/**
	 *方法: 设置remark
	 *@param: java.lang.String  remark
	 */
	public void setRemark(java.lang.String remark){
		this.remark = remark;
	}

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrMessage() {
		return errMessage;
	}

	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}

	public String getHasData() {
		return hasData;
	}

	public void setHasData(String hasData) {
		this.hasData = hasData;
	}

	public String getLastSearchTime() {
		return lastSearchTime;
	}

	public void setLastSearchTime(String lastSearchTime) {
		this.lastSearchTime = lastSearchTime;
	}

	public ExtSjtTrafficVioStockDTO[] getRecords() {
		return records;
	}

	public void setRecords(ExtSjtTrafficVioStockDTO[] records) {
		this.records = records;
	}

}