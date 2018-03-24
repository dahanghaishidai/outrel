package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshprecordenforcem.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshprecordenforcem.dto.ExtWlShPrecordEnforcemDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshprecordenforcem.dao.ExtWlShPrecordEnforcemDao;

/**
 * @classname: ExtWlShPrecordEnforcemService
 * @description: 定义  算话人行原版(公共记录_强制执行记录表) 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshprecordenforcem.service.ExtWlShPrecordEnforcemService")
public class ExtWlShPrecordEnforcemService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlShPrecordEnforcemDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 算话人行原版(公共记录_强制执行记录表)列表
     * @date 2017-12-21 19:59:26
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlShPrecordEnforcemDTO> searchExtWlShPrecordEnforcemByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlShPrecordEnforcemDTO> dataList =  dao.searchExtWlShPrecordEnforcemByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话人行原版(公共记录_强制执行记录表)列表
     * @date 2017-12-21 19:59:26
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlShPrecordEnforcemDTO> searchExtWlShPrecordEnforcem(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlShPrecordEnforcemDTO> dataList = dao.searchExtWlShPrecordEnforcem(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话人行原版(公共记录_强制执行记录表)对象
     * @date 2017-12-21 19:59:26
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlShPrecordEnforcemDTO queryExtWlShPrecordEnforcemByPrimaryKey(String id) throws Exception {
		
		ExtWlShPrecordEnforcemDTO dto = dao.findExtWlShPrecordEnforcemByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlShPrecordEnforcemDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlShPrecordEnforcem
     * @author Administrator
     * @description: 新增 算话人行原版(公共记录_强制执行记录表)对象
     * @date 2017-12-21 19:59:26
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlShPrecordEnforcem(ExtWlShPrecordEnforcemDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlShPrecordEnforcem(paramMap);
		
		ExtWlShPrecordEnforcemDTO resultDto = (ExtWlShPrecordEnforcemDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlShPrecordEnforcem
     * @author Administrator
     * @description: 修改 算话人行原版(公共记录_强制执行记录表)对象
     * @date 2017-12-21 19:59:26
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlShPrecordEnforcem(ExtWlShPrecordEnforcemDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlShPrecordEnforcem(paramMap);
	}
	/**
     * @title: deleteExtWlShPrecordEnforcemByPrimaryKey
     * @author Administrator
     * @description: 删除 算话人行原版(公共记录_强制执行记录表),按主键
     * @date 2017-12-21 19:59:26
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlShPrecordEnforcemByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlShPrecordEnforcemByPrimaryKey(paramMap);
	}

	/**
	 * @methodName: insertExtWlShPrecordEnforcementList
	 * @param: [precordEnforcementList, fkReportId]
	 * @describe: 批量新增 算话人行原版(公共记录_强制执行记录表)列表
	 * @auther: huangxianchao
	 * @date: 2017/12/25 0025
	 * @time: 上午 9:44
	 **/
    public void insertExtWlShPrecordEnforcementList(List<ExtWlShPrecordEnforcemDTO> precordEnforcementList, Long fkReportId) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dtoList", precordEnforcementList);
		paramMap.put("fkReportId", fkReportId);
		dao.insertExtWlShPrecordEnforcementList(paramMap);

	}
}

