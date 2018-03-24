package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrenforcements.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrenforcements.dto.ExtWlShSrEnforcementsDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrenforcements.dao.ExtWlShSrEnforcementsDao;

/**
 * @classname: ExtWlShSrEnforcementsService
 * @description: 定义  算话人行结构化版(强制执行记录表) 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrenforcements.service.ExtWlShSrEnforcementsService")
public class ExtWlShSrEnforcementsService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlShSrEnforcementsDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 算话人行结构化版(强制执行记录表)列表
     * @date 2017-12-21 19:54:07
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlShSrEnforcementsDTO> searchExtWlShSrEnforcementsByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlShSrEnforcementsDTO> dataList =  dao.searchExtWlShSrEnforcementsByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话人行结构化版(强制执行记录表)列表
     * @date 2017-12-21 19:54:07
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlShSrEnforcementsDTO> searchExtWlShSrEnforcements(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlShSrEnforcementsDTO> dataList = dao.searchExtWlShSrEnforcements(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话人行结构化版(强制执行记录表)对象
     * @date 2017-12-21 19:54:07
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlShSrEnforcementsDTO queryExtWlShSrEnforcementsByPrimaryKey(String id) throws Exception {
		
		ExtWlShSrEnforcementsDTO dto = dao.findExtWlShSrEnforcementsByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlShSrEnforcementsDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlShSrEnforcements
     * @author Administrator
     * @description: 新增 算话人行结构化版(强制执行记录表)对象
     * @date 2017-12-21 19:54:07
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlShSrEnforcements(ExtWlShSrEnforcementsDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlShSrEnforcements(paramMap);
		
		ExtWlShSrEnforcementsDTO resultDto = (ExtWlShSrEnforcementsDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlShSrEnforcements
     * @author Administrator
     * @description: 修改 算话人行结构化版(强制执行记录表)对象
     * @date 2017-12-21 19:54:07
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlShSrEnforcements(ExtWlShSrEnforcementsDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlShSrEnforcements(paramMap);
	}
	/**
     * @title: deleteExtWlShSrEnforcementsByPrimaryKey
     * @author Administrator
     * @description: 删除 算话人行结构化版(强制执行记录表),按主键
     * @date 2017-12-21 19:54:07
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlShSrEnforcementsByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlShSrEnforcementsByPrimaryKey(paramMap);
	}

	/**
	 * @methodName: insertExtWlShSrEnforcementsList
	 * @param: [enforcementsList, fkReportId]
	 * @describe: 批量新增 算话人行结构化版(强制执行记录表)列表
	 * @auther: huangxianchao
	 * @date: 2017/12/25 0025
	 * @time: 上午 11:14
	 **/
    public void insertExtWlShSrEnforcementsList(List<ExtWlShSrEnforcementsDTO> enforcementsList, Long fkReportId) {

		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dtoList", enforcementsList);
		paramMap.put("fkReportId", fkReportId);
		dao.insertExtWlShSrEnforcementsList(paramMap);
    }
}

