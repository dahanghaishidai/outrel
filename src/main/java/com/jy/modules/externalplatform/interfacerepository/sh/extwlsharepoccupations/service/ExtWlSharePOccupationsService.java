package com.jy.modules.externalplatform.interfacerepository.sh.extwlsharepoccupations.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharepoccupations.dto.ExtWlSharePOccupationsDTO;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharepoccupations.dao.ExtWlSharePOccupationsDao;

/**
 * @classname: ExtWlSharePOccupationsService
 * @description: 定义  算话共享报告_身份信息概要（职业信息） 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.sh.extwlsharepoccupations.service.ExtWlSharePOccupationsService")
public class ExtWlSharePOccupationsService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlSharePOccupationsDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 算话共享报告_身份信息概要（职业信息）列表
     * @date 2017-12-07 19:52:57
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlSharePOccupationsDTO> searchExtWlSharePOccupationsByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlSharePOccupationsDTO> dataList =  dao.searchExtWlSharePOccupationsByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话共享报告_身份信息概要（职业信息）列表
     * @date 2017-12-07 19:52:57
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlSharePOccupationsDTO> searchExtWlSharePOccupations(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlSharePOccupationsDTO> dataList = dao.searchExtWlSharePOccupations(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话共享报告_身份信息概要（职业信息）对象
     * @date 2017-12-07 19:52:57
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlSharePOccupationsDTO queryExtWlSharePOccupationsByPrimaryKey(String id) throws Exception {
		
		ExtWlSharePOccupationsDTO dto = dao.findExtWlSharePOccupationsByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlSharePOccupationsDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlSharePOccupations
     * @author Administrator
     * @description: 新增 算话共享报告_身份信息概要（职业信息）对象
     * @date 2017-12-07 19:52:57
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlSharePOccupations(ExtWlSharePOccupationsDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlSharePOccupations(paramMap);
		
		ExtWlSharePOccupationsDTO resultDto = (ExtWlSharePOccupationsDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlSharePOccupations
     * @author Administrator
     * @description: 修改 算话共享报告_身份信息概要（职业信息）对象
     * @date 2017-12-07 19:52:57
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlSharePOccupations(ExtWlSharePOccupationsDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlSharePOccupations(paramMap);
	}
	/**
     * @title: deleteExtWlSharePOccupationsByPrimaryKey
     * @author Administrator
     * @description: 删除 算话共享报告_身份信息概要（职业信息）,按主键
     * @date 2017-12-07 19:52:57
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlSharePOccupationsByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlSharePOccupationsByPrimaryKey(paramMap);
	}

    /**
     * @title: insertExtWlSharePOccupationsList
     * @author: dongkangning
     * @description:批量新增 算话共享报告_身份信息概要（职业信息）列表
     * @date 2017年12月8日 上午10:01:25
     * @param occupationsList
     * @param fkReportId
     * @return
     * @throws
     */
    public Long insertExtWlSharePOccupationsList(List<ExtWlSharePOccupationsDTO> occupationsList, Long fkReportId) {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("dtoList", occupationsList);
        paramMap.put("fkReportId", fkReportId);
        int count = dao.insertExtWlSharePOccupationsList(paramMap);
        return (long) count;
    }

}

