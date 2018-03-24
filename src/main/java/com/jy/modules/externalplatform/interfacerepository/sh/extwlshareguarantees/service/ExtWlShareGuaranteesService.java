package com.jy.modules.externalplatform.interfacerepository.sh.extwlshareguarantees.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlshareguarantees.dto.ExtWlShareGuaranteesDTO;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlshareguarantees.dao.ExtWlShareGuaranteesDao;

/**
 * @classname: ExtWlShareGuaranteesService
 * @description: 定义  算话共享报告_对外担保信息明细 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.sh.extwlshareguarantees.service.ExtWlShareGuaranteesService")
public class ExtWlShareGuaranteesService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlShareGuaranteesDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 算话共享报告_对外担保信息明细列表
     * @date 2017-12-08 11:03:18
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlShareGuaranteesDTO> searchExtWlShareGuaranteesByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlShareGuaranteesDTO> dataList =  dao.searchExtWlShareGuaranteesByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话共享报告_对外担保信息明细列表
     * @date 2017-12-08 11:03:18
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlShareGuaranteesDTO> searchExtWlShareGuarantees(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlShareGuaranteesDTO> dataList = dao.searchExtWlShareGuarantees(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话共享报告_对外担保信息明细对象
     * @date 2017-12-08 11:03:18
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlShareGuaranteesDTO queryExtWlShareGuaranteesByPrimaryKey(String id) throws Exception {
		
		ExtWlShareGuaranteesDTO dto = dao.findExtWlShareGuaranteesByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlShareGuaranteesDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlShareGuarantees
     * @author Administrator
     * @description: 新增 算话共享报告_对外担保信息明细对象
     * @date 2017-12-08 11:03:18
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlShareGuarantees(ExtWlShareGuaranteesDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlShareGuarantees(paramMap);
		
		ExtWlShareGuaranteesDTO resultDto = (ExtWlShareGuaranteesDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlShareGuarantees
     * @author Administrator
     * @description: 修改 算话共享报告_对外担保信息明细对象
     * @date 2017-12-08 11:03:18
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlShareGuarantees(ExtWlShareGuaranteesDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlShareGuarantees(paramMap);
	}
	/**
     * @title: deleteExtWlShareGuaranteesByPrimaryKey
     * @author Administrator
     * @description: 删除 算话共享报告_对外担保信息明细,按主键
     * @date 2017-12-08 11:03:18
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlShareGuaranteesByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlShareGuaranteesByPrimaryKey(paramMap);
	}

    /**
     * @title: insertExtWlShareGuaranteesList
     * @author: dongkangning
     * @description: 批量新增 算话共享报告_对外担保信息明细列表
     * @date 2017年12月8日 上午11:59:46
     * @param guaranteesList
     * @param fkReportId
     * @throws
     */
    public long insertExtWlShareGuaranteesList(List<ExtWlShareGuaranteesDTO> guaranteesList, Long fkReportId) {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("dtoList", guaranteesList);
        paramMap.put("fkReportId", fkReportId);
        int count = dao.insertExtWlShareGuaranteesList(paramMap);
        return (long) count;
    }

}

