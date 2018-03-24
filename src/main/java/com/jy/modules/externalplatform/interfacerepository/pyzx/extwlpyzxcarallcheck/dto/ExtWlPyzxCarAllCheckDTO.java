package com.jy.modules.externalplatform.interfacerepository.pyzx.extwlpyzxcarallcheck.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:鹏元征信(车辆核查结果表)
 *@author Administrator
 *@version 1.0,
 *@date 2018-01-10 13:52:05
 */
public class ExtWlPyzxCarAllCheckDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**进件客户关联主键*/
	private Long fkIntoCustId;

	/**姓名*/
	private String name;

	/**证件号码*/
	private String documentNo;

	/**车牌号码*/
	private String licenseNo;

	/**号牌种类*/
	private String carType;

	/**车架号*/
	private String vin;

	/**初次登记日期 格式：yyyy-MM-dd*/
	private String registTime;

	/**姓名核查结果，有一致、不一致、无法核查*/
	private String nameCheckResult;

	/**证件号码核查结果，有：一致、不一致、无法核查*/
	private String documentNoCheckResult;

	/**车牌号码核查结果，有：一致、不一致*/
	private String licenseNoCheckResult;

	/**车架号核查结果，有：一致、不一致*/
	private String carCodeCheckResult;

	/**号牌种类核查结果，有：一致、不一致*/
	private String carTypeCheckResult;

	/**初次登记日期核查结果，有：一致、不一致、无法核查*/
	private String registTimeCheckResult;

	/**车辆状态信息*/
	private String carStatusDesc;

	/**厂家。如：一汽大众*/
	private String cj;

	/**品牌。如：大众*/
	private String pp;

	/**车系。如：迈腾*/
	private String cx;

	/**车型。如：迈腾*/
	private String chex;

	/**销售名称。如：1.4TSI 双离合 精英版*/
	private String xsmc;

	/**年款。如：2012;2013*/
	private String nk;

	/**上市年份。如：2012;2013*/
	private String ssnf;

	/**车辆类别。如：轿车*/
	private String cllb;

	/**车辆级别。如：中型车*/
	private String cljb;

	/**新车指导价格（单位万）。如：20.38;30.25*/
	private String zdjg;

	/**生产状态。如：停产*/
	private String sczt;

	/**国别。如：中国*/
	private String gb;

	/**产地类别。如：合资、国产、进口*/
	private String gchzjk;

	/**排放标准。如：国4*/
	private String pfbz;

	/**排量（升）。如：3.0*/
	private String pl;

	/**工信部综合油耗（L）。如：11.5*/
	private String gxbzhyh;

	/**变速箱类型。如：自动*/
	private String bsxlx;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	/**创建人*/
	private Long createBy;

	/**修改人*/
	private Long modifyBy;

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
	 *方法: 获得fkIntoCustId
	 *@return: java.lang.Long  fkIntoCustId
	 */
	public Long getFkIntoCustId(){
		return this.fkIntoCustId;
	}

	/**
	 *方法: 设置fkIntoCustId
	 *@param: java.lang.Long  fkIntoCustId
	 */
	public void setFkIntoCustId(Long fkIntoCustId){
		this.fkIntoCustId = fkIntoCustId;
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
	 *方法: 获得documentNo
	 *@return: java.lang.String  documentNo
	 */
	public String getDocumentNo(){
		return this.documentNo;
	}

	/**
	 *方法: 设置documentNo
	 *@param: java.lang.String  documentNo
	 */
	public void setDocumentNo(String documentNo){
		this.documentNo = documentNo;
	}

	/**
	 *方法: 获得licenseNo
	 *@return: java.lang.String  licenseNo
	 */
	public String getLicenseNo(){
		return this.licenseNo;
	}

	/**
	 *方法: 设置licenseNo
	 *@param: java.lang.String  licenseNo
	 */
	public void setLicenseNo(String licenseNo){
		this.licenseNo = licenseNo;
	}

	/**
	 *方法: 获得carType
	 *@return: java.lang.String  carType
	 */
	public String getCarType(){
		return this.carType;
	}

	/**
	 *方法: 设置carType
	 *@param: java.lang.String  carType
	 */
	public void setCarType(String carType){
		this.carType = carType;
	}

	/**
	 *方法: 获得vin
	 *@return: java.lang.String  vin
	 */
	public String getVin(){
		return this.vin;
	}

	/**
	 *方法: 设置vin
	 *@param: java.lang.String  vin
	 */
	public void setVin(String vin){
		this.vin = vin;
	}

	/**
	 *方法: 获得registTime
	 *@return: java.lang.String  registTime
	 */
	public String getRegistTime(){
		return this.registTime;
	}

	/**
	 *方法: 设置registTime
	 *@param: java.lang.String  registTime
	 */
	public void setRegistTime(String registTime){
		this.registTime = registTime;
	}

	/**
	 *方法: 获得nameCheckResult
	 *@return: java.lang.String  nameCheckResult
	 */
	public String getNameCheckResult(){
		return this.nameCheckResult;
	}

	/**
	 *方法: 设置nameCheckResult
	 *@param: java.lang.String  nameCheckResult
	 */
	public void setNameCheckResult(String nameCheckResult){
		this.nameCheckResult = nameCheckResult;
	}

	/**
	 *方法: 获得documentNoCheckResult
	 *@return: java.lang.String  documentNoCheckResult
	 */
	public String getDocumentNoCheckResult(){
		return this.documentNoCheckResult;
	}

	/**
	 *方法: 设置documentNoCheckResult
	 *@param: java.lang.String  documentNoCheckResult
	 */
	public void setDocumentNoCheckResult(String documentNoCheckResult){
		this.documentNoCheckResult = documentNoCheckResult;
	}

	/**
	 *方法: 获得licenseNoCheckResult
	 *@return: java.lang.String  licenseNoCheckResult
	 */
	public String getLicenseNoCheckResult(){
		return this.licenseNoCheckResult;
	}

	/**
	 *方法: 设置licenseNoCheckResult
	 *@param: java.lang.String  licenseNoCheckResult
	 */
	public void setLicenseNoCheckResult(String licenseNoCheckResult){
		this.licenseNoCheckResult = licenseNoCheckResult;
	}

	/**
	 *方法: 获得carCodeCheckResult
	 *@return: java.lang.String  carCodeCheckResult
	 */
	public String getCarCodeCheckResult(){
		return this.carCodeCheckResult;
	}

	/**
	 *方法: 设置carCodeCheckResult
	 *@param: java.lang.String  carCodeCheckResult
	 */
	public void setCarCodeCheckResult(String carCodeCheckResult){
		this.carCodeCheckResult = carCodeCheckResult;
	}

	/**
	 *方法: 获得carTypeCheckResult
	 *@return: java.lang.String  carTypeCheckResult
	 */
	public String getCarTypeCheckResult(){
		return this.carTypeCheckResult;
	}

	/**
	 *方法: 设置carTypeCheckResult
	 *@param: java.lang.String  carTypeCheckResult
	 */
	public void setCarTypeCheckResult(String carTypeCheckResult){
		this.carTypeCheckResult = carTypeCheckResult;
	}

	/**
	 *方法: 获得registTimeCheckResult
	 *@return: java.lang.String  registTimeCheckResult
	 */
	public String getRegistTimeCheckResult(){
		return this.registTimeCheckResult;
	}

	/**
	 *方法: 设置registTimeCheckResult
	 *@param: java.lang.String  registTimeCheckResult
	 */
	public void setRegistTimeCheckResult(String registTimeCheckResult){
		this.registTimeCheckResult = registTimeCheckResult;
	}

	/**
	 *方法: 获得carStatusDesc
	 *@return: java.lang.String  carStatusDesc
	 */
	public String getCarStatusDesc(){
		return this.carStatusDesc;
	}

	/**
	 *方法: 设置carStatusDesc
	 *@param: java.lang.String  carStatusDesc
	 */
	public void setCarStatusDesc(String carStatusDesc){
		this.carStatusDesc = carStatusDesc;
	}

	/**
	 *方法: 获得cj
	 *@return: java.lang.String  cj
	 */
	public String getCj(){
		return this.cj;
	}

	/**
	 *方法: 设置cj
	 *@param: java.lang.String  cj
	 */
	public void setCj(String cj){
		this.cj = cj;
	}

	/**
	 *方法: 获得pp
	 *@return: java.lang.String  pp
	 */
	public String getPp(){
		return this.pp;
	}

	/**
	 *方法: 设置pp
	 *@param: java.lang.String  pp
	 */
	public void setPp(String pp){
		this.pp = pp;
	}

	/**
	 *方法: 获得cx
	 *@return: java.lang.String  cx
	 */
	public String getCx(){
		return this.cx;
	}

	/**
	 *方法: 设置cx
	 *@param: java.lang.String  cx
	 */
	public void setCx(String cx){
		this.cx = cx;
	}

	/**
	 *方法: 获得chex
	 *@return: java.lang.String  chex
	 */
	public String getChex(){
		return this.chex;
	}

	/**
	 *方法: 设置chex
	 *@param: java.lang.String  chex
	 */
	public void setChex(String chex){
		this.chex = chex;
	}

	/**
	 *方法: 获得xsmc
	 *@return: java.lang.String  xsmc
	 */
	public String getXsmc(){
		return this.xsmc;
	}

	/**
	 *方法: 设置xsmc
	 *@param: java.lang.String  xsmc
	 */
	public void setXsmc(String xsmc){
		this.xsmc = xsmc;
	}

	/**
	 *方法: 获得nk
	 *@return: java.lang.String  nk
	 */
	public String getNk(){
		return this.nk;
	}

	/**
	 *方法: 设置nk
	 *@param: java.lang.String  nk
	 */
	public void setNk(String nk){
		this.nk = nk;
	}

	/**
	 *方法: 获得ssnf
	 *@return: java.lang.String  ssnf
	 */
	public String getSsnf(){
		return this.ssnf;
	}

	/**
	 *方法: 设置ssnf
	 *@param: java.lang.String  ssnf
	 */
	public void setSsnf(String ssnf){
		this.ssnf = ssnf;
	}

	/**
	 *方法: 获得cllb
	 *@return: java.lang.String  cllb
	 */
	public String getCllb(){
		return this.cllb;
	}

	/**
	 *方法: 设置cllb
	 *@param: java.lang.String  cllb
	 */
	public void setCllb(String cllb){
		this.cllb = cllb;
	}

	/**
	 *方法: 获得cljb
	 *@return: java.lang.String  cljb
	 */
	public String getCljb(){
		return this.cljb;
	}

	/**
	 *方法: 设置cljb
	 *@param: java.lang.String  cljb
	 */
	public void setCljb(String cljb){
		this.cljb = cljb;
	}

	/**
	 *方法: 获得zdjg
	 *@return: java.lang.String  zdjg
	 */
	public String getZdjg(){
		return this.zdjg;
	}

	/**
	 *方法: 设置zdjg
	 *@param: java.lang.String  zdjg
	 */
	public void setZdjg(String zdjg){
		this.zdjg = zdjg;
	}

	/**
	 *方法: 获得sczt
	 *@return: java.lang.String  sczt
	 */
	public String getSczt(){
		return this.sczt;
	}

	/**
	 *方法: 设置sczt
	 *@param: java.lang.String  sczt
	 */
	public void setSczt(String sczt){
		this.sczt = sczt;
	}

	/**
	 *方法: 获得gb
	 *@return: java.lang.String  gb
	 */
	public String getGb(){
		return this.gb;
	}

	/**
	 *方法: 设置gb
	 *@param: java.lang.String  gb
	 */
	public void setGb(String gb){
		this.gb = gb;
	}

	/**
	 *方法: 获得gchzjk
	 *@return: java.lang.String  gchzjk
	 */
	public String getGchzjk(){
		return this.gchzjk;
	}

	/**
	 *方法: 设置gchzjk
	 *@param: java.lang.String  gchzjk
	 */
	public void setGchzjk(String gchzjk){
		this.gchzjk = gchzjk;
	}

	/**
	 *方法: 获得pfbz
	 *@return: java.lang.String  pfbz
	 */
	public String getPfbz(){
		return this.pfbz;
	}

	/**
	 *方法: 设置pfbz
	 *@param: java.lang.String  pfbz
	 */
	public void setPfbz(String pfbz){
		this.pfbz = pfbz;
	}

	/**
	 *方法: 获得pl
	 *@return: java.lang.String  pl
	 */
	public String getPl(){
		return this.pl;
	}

	/**
	 *方法: 设置pl
	 *@param: java.lang.String  pl
	 */
	public void setPl(String pl){
		this.pl = pl;
	}

	/**
	 *方法: 获得gxbzhyh
	 *@return: java.lang.String  gxbzhyh
	 */
	public String getGxbzhyh(){
		return this.gxbzhyh;
	}

	/**
	 *方法: 设置gxbzhyh
	 *@param: java.lang.String  gxbzhyh
	 */
	public void setGxbzhyh(String gxbzhyh){
		this.gxbzhyh = gxbzhyh;
	}

	/**
	 *方法: 获得bsxlx
	 *@return: java.lang.String  bsxlx
	 */
	public String getBsxlx(){
		return this.bsxlx;
	}

	/**
	 *方法: 设置bsxlx
	 *@param: java.lang.String  bsxlx
	 */
	public void setBsxlx(String bsxlx){
		this.bsxlx = bsxlx;
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

}