package com.jy.modules.externalplatform.interfacerepository.sh.extwlshareoverdues.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlshareoverdues.dto.ExtWlShareOverduesDTO;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlshareoverdues.dao.ExtWlShareOverduesDao;

/**
 * @classname: ExtWlShareOverduesService
 * @description: 定义  算话共享报告_近5年逾期信息记录 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.sh.extwlshareoverdues.service.ExtWlShareOverduesService")
public class ExtWlShareOverduesService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlShareOverduesDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 算话共享报告_近5年逾期信息记录列表
     * @date 2017-12-07 19:53:36
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlShareOverduesDTO> searchExtWlShareOverduesByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlShareOverduesDTO> dataList =  dao.searchExtWlShareOverduesByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话共享报告_近5年逾期信息记录列表
     * @date 2017-12-07 19:53:36
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlShareOverduesDTO> searchExtWlShareOverdues(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlShareOverduesDTO> dataList = dao.searchExtWlShareOverdues(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话共享报告_近5年逾期信息记录对象
     * @date 2017-12-07 19:53:36
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlShareOverduesDTO queryExtWlShareOverduesByPrimaryKey(String id) throws Exception {
		
		ExtWlShareOverduesDTO dto = dao.findExtWlShareOverduesByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlShareOverduesDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlShareOverdues
     * @author Administrator
     * @description: 新增 算话共享报告_近5年逾期信息记录对象
     * @date 2017-12-07 19:53:36
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlShareOverdues(ExtWlShareOverduesDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlShareOverdues(paramMap);
		
		ExtWlShareOverduesDTO resultDto = (ExtWlShareOverduesDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlShareOverdues
     * @author Administrator
     * @description: 修改 算话共享报告_近5年逾期信息记录对象
     * @date 2017-12-07 19:53:36
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlShareOverdues(ExtWlShareOverduesDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlShareOverdues(paramMap);
	}
	/**
     * @title: deleteExtWlShareOverduesByPrimaryKey
     * @author Administrator
     * @description: 删除 算话共享报告_近5年逾期信息记录,按主键
     * @date 2017-12-07 19:53:36
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlShareOverduesByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlShareOverduesByPrimaryKey(paramMap);
	}

    /**
     * @title: insertExtWlShareOverduesList
     * @author: dongkangning
     * @description: 批量新增 算话共享报告_近5年逾期信息记录列表
     * @date 2017年12月8日 上午11:56:43
     * @param overduesList
     * @param start5StatisDate
     * @param endStatisDate
     * @param fkCreditDetailId
     * @throws
     */
    public long insertExtWlShareOverduesList(List<ExtWlShareOverduesDTO> overduesList, String start5StatisDate,
            String endStatisDate, Long fkCreditDetailId) {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("dtoList", overduesList);
        paramMap.put("fkCreditDetailId", fkCreditDetailId);
        paramMap.put("startStatisDate", start5StatisDate);
        paramMap.put("endStatisDate", endStatisDate);
        int count = dao.insertExtWlShareOverduesList(paramMap);
        return (long) count;
    }

}

