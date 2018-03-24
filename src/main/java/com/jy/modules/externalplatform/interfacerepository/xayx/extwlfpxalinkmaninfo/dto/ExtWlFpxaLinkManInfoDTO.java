package com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxalinkmaninfo.dto;

import com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxablack.dto.ExtWlFpxaBlackDTO;
import com.jy.platform.core.common.BaseDTO;

import java.util.List;
/**
 * @className: ExtWlFpxaLinkManInfoDTO
 * @package: com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxalinkmaninfo.dto
 * @describe: EXT_WL_FPXA_LINK_MAN_INFO
 * @auther: huangxianchao
 * @date: 2018/1/16 0016
 * @time: 上午 9:52
 **/
public class ExtWlFpxaLinkManInfoDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**小爱有信基本信息表主键*/
	private Long fkId;

	/**联系人 1:一致/2:部分一致/3:未查得*/
	private String linkMan;

	/**联系人数据有效时间 YYYY-MM*/
	private String linkManValidTime;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp updateTime;

	/**创建人*/
	private Long createBy;

	/**修改人*/
	private Long updateBy;

	//联系人黑名单信息
	private List<ExtWlFpxaBlackDTO> blackList;


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
	 *方法: 获得linkMan
	 *@return: java.lang.String  linkMan
	 */
	public String getLinkMan(){
		return this.linkMan;
	}

	/**
	 *方法: 设置linkMan
	 *@param: java.lang.String  linkMan
	 */
	public void setLinkMan(String linkMan){
		this.linkMan = linkMan;
	}

	/**
	 *方法: 获得linkManValidTime
	 *@return: java.lang.String  linkManValidTime
	 */
	public String getLinkManValidTime(){
		return this.linkManValidTime;
	}

	/**
	 *方法: 设置linkManValidTime
	 *@param: java.lang.String  linkManValidTime
	 */
	public void setLinkManValidTime(String linkManValidTime){
		this.linkManValidTime = linkManValidTime;
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

	/**
	 * @methodName: getBlackList
	 * @param: []
	 * @describe: 获得blackList
	 * @auther: huangxianchao
	 * @date: 2018/1/15 0015
	 * @time: 下午 5:05
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
     * @time: 下午 5:06
     **/
    public void setBlackList(List<ExtWlFpxaBlackDTO> blackList) {
        this.blackList = blackList;
    }
}