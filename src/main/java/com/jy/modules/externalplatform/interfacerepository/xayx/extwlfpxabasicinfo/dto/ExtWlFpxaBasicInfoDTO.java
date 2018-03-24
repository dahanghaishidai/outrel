package com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxabasicinfo.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 * @className: ExtWlFpxaBasicInfoDTO
 * @package: com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxabasicinfo.dto
 * @describe: EXT_WL_FPXA_BASIC_INFO
 * @auther: huangxianchao
 * @date: 2018/1/16 0016
 * @time: 上午 10:07
 **/
public class ExtWlFpxaBasicInfoDTO extends BaseDTO{

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

	/**进件客户关联ID*/
	private Long intoCustRefId;

	/**报告编号*/
	private String reportNo;

	/**申请查询时间*/
	private String applyTime;

	/**生成报告时间*/
	private String reportTime;

	/**姓名*/
	private String name;

	/**身份证号*/
	private String idNo;

	/**手机号*/
	private String mobile;

	/**出生日期*/
	private String birthDay;

	/**性别*/
	private String sex;

	/**年龄*/
	private Long age;

	/**户籍*/
	private String registAddr;

	/**其他手机号数量*/
	private Long otherMobileNum;

	/**居住地址 多个地址以','隔开*/
	private String liveaddr;

	/**居住地址有效时间*/
	private String liveaddrreporttime;

	/**工作地址 多个地址以','隔开*/
	private String workAddr;

	/**工作地址有效时间*/
	private String workAddrReportTime;

	/**历史被查询记录*/
	private String queryedByHisOperate;

	/**返回状态码*/
	private String msgCode;

	/**返回信息*/
	private String msg;

	//申请是所在城市
	private String applyCity;

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
	 *方法: 获得reportNo
	 *@return: java.lang.String  reportNo
	 */
	public String getReportNo(){
		return this.reportNo;
	}

	/**
	 *方法: 设置reportNo
	 *@param: java.lang.String  reportNo
	 */
	public void setReportNo(String reportNo){
		this.reportNo = reportNo;
	}

	/**
	 *方法: 获得applyTime
	 *@return: java.lang.String  applyTime
	 */
	public String getApplyTime(){
		return this.applyTime;
	}

	/**
	 *方法: 设置applyTime
	 *@param: java.lang.String  applyTime
	 */
	public void setApplyTime(String applyTime){
		this.applyTime = applyTime;
	}

	/**
	 *方法: 获得reportTime
	 *@return: java.lang.String  reportTime
	 */
	public String getReportTime(){
		return this.reportTime;
	}

	/**
	 *方法: 设置reportTime
	 *@param: java.lang.String  reportTime
	 */
	public void setReportTime(String reportTime){
		this.reportTime = reportTime;
	}

	/**
	 *方法: 获得name
	 *@return: java.lang.String  name
	 */
	public String getName(){
		return this.name;
	}

	/**
	 *方法: 设置name
	 *@param: java.lang.String  name
	 */
	public void setName(String name){
		this.name = name;
	}

	/**
	 *方法: 获得idNo
	 *@return: java.lang.String  idNo
	 */
	public String getIdNo(){
		return this.idNo;
	}

	/**
	 *方法: 设置idNo
	 *@param: java.lang.String  idNo
	 */
	public void setIdNo(String idNo){
		this.idNo = idNo;
	}

	/**
	 *方法: 获得mobile
	 *@return: java.lang.String  mobile
	 */
	public String getMobile(){
		return this.mobile;
	}

	/**
	 *方法: 设置mobile
	 *@param: java.lang.String  mobile
	 */
	public void setMobile(String mobile){
		this.mobile = mobile;
	}

	/**
	 *方法: 获得birthDay
	 *@return: java.lang.String  birthDay
	 */
	public String getBirthDay(){
		return this.birthDay;
	}

	/**
	 *方法: 设置birthDay
	 *@param: java.lang.String  birthDay
	 */
	public void setBirthDay(String birthDay){
		this.birthDay = birthDay;
	}

	/**
	 *方法: 获得sex
	 *@return: java.lang.String  sex
	 */
	public String getSex(){
		return this.sex;
	}

	/**
	 *方法: 设置sex
	 *@param: java.lang.String  sex
	 */
	public void setSex(String sex){
		this.sex = sex;
	}

	/**
	 *方法: 获得age
	 *@return: java.lang.Long  age
	 */
	public Long getAge(){
		return this.age;
	}

	/**
	 *方法: 设置age
	 *@param: java.lang.Long  age
	 */
	public void setAge(Long age){
		this.age = age;
	}

	/**
	 *方法: 获得registAddr
	 *@return: java.lang.String  registAddr
	 */
	public String getRegistAddr(){
		return this.registAddr;
	}

	/**
	 *方法: 设置registAddr
	 *@param: java.lang.String  registAddr
	 */
	public void setRegistAddr(String registAddr){
		this.registAddr = registAddr;
	}

	/**
	 *方法: 获得otherMobileNum
	 *@return: java.lang.Long  otherMobileNum
	 */
	public Long getOtherMobileNum(){
		return this.otherMobileNum;
	}

	/**
	 *方法: 设置otherMobileNum
	 *@param: java.lang.Long  otherMobileNum
	 */
	public void setOtherMobileNum(Long otherMobileNum){
		this.otherMobileNum = otherMobileNum;
	}

	/**
	 *方法: 获得liveaddr
	 *@return: java.lang.String  liveaddr
	 */
	public String getLiveaddr(){
		return this.liveaddr;
	}

	/**
	 *方法: 设置liveaddr
	 *@param: java.lang.String  liveaddr
	 */
	public void setLiveaddr(String liveaddr){
		this.liveaddr = liveaddr;
	}

	/**
	 *方法: 获得liveaddrreporttime
	 *@return: java.lang.String  liveaddrreporttime
	 */
	public String getLiveaddrreporttime(){
		return this.liveaddrreporttime;
	}

	/**
	 *方法: 设置liveaddrreporttime
	 *@param: java.lang.String  liveaddrreporttime
	 */
	public void setLiveaddrreporttime(String liveaddrreporttime){
		this.liveaddrreporttime = liveaddrreporttime;
	}

	/**
	 *方法: 获得workAddr
	 *@return: java.lang.String  workAddr
	 */
	public String getWorkAddr(){
		return this.workAddr;
	}

	/**
	 *方法: 设置workAddr
	 *@param: java.lang.String  workAddr
	 */
	public void setWorkAddr(String workAddr){
		this.workAddr = workAddr;
	}

	/**
	 *方法: 获得workAddrReportTime
	 *@return: java.lang.String  workAddrReportTime
	 */
	public String getWorkAddrReportTime(){
		return this.workAddrReportTime;
	}

	/**
	 *方法: 设置workAddrReportTime
	 *@param: java.lang.String  workAddrReportTime
	 */
	public void setWorkAddrReportTime(String workAddrReportTime){
		this.workAddrReportTime = workAddrReportTime;
	}

	/**
	 *方法: 获得queryedByHisOperate
	 *@return: java.lang.String  queryedByHisOperate
	 */
	public String getQueryedByHisOperate(){
		return this.queryedByHisOperate;
	}

	/**
	 *方法: 设置queryedByHisOperate
	 *@param: java.lang.String  queryedByHisOperate
	 */
	public void setQueryedByHisOperate(String queryedByHisOperate){
		this.queryedByHisOperate = queryedByHisOperate;
	}

	/**
	 *方法: 获得msgCode
	 *@return: java.lang.String  msgCode
	 */
	public String getMsgCode(){
		return this.msgCode;
	}

	/**
	 *方法: 设置msgCode
	 *@param: java.lang.String  msgCode
	 */
	public void setMsgCode(String msgCode){
		this.msgCode = msgCode;
	}

	/**
	 *方法: 获得msg
	 *@return: java.lang.String  msg
	 */
	public String getMsg(){
		return this.msg;
	}

	/**
	 *方法: 设置msg
	 *@param: java.lang.String  msg
	 */
	public void setMsg(String msg){
		this.msg = msg;
	}

    /**
     *方法: 获取applyCity
     *@param: java.lang.String  applyCity
     */
    public String getApplyCity() {
        return applyCity;
    }

    /**
     *方法: 设置applyCity
     *@param: java.lang.String  applyCity
     */
    public void setApplyCity(String applyCity) {
        this.applyCity = applyCity;
    }
}