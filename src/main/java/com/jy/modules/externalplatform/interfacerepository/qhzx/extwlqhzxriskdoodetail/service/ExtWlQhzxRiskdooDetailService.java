package com.jy.modules.externalplatform.interfacerepository.qhzx.extwlqhzxriskdoodetail.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;
import com.jy.modules.externalplatform.interfacerepository.qhzx.extwlqhzxriskdoodetail.dto.ExtWlQhzxRiskdooDetailDTO;
import com.jy.modules.externalplatform.interfacerepository.qhzx.extwlqhzxriskdoodetail.dao.ExtWlQhzxRiskdooDetailDao;

/**
 * @classname: ExtWlQhzxRiskdooDetailService
 * @description: 定义  前海征信风险度提示明细表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.qhzx.extwlqhzxriskdoodetail.service.ExtWlQhzxRiskdooDetailService")
public class ExtWlQhzxRiskdooDetailService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlQhzxRiskdooDetailDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 前海征信风险度提示明细表列表
     * @date 2017-12-06 16:03:25
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlQhzxRiskdooDetailDTO> searchExtWlQhzxRiskdooDetailByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlQhzxRiskdooDetailDTO> dataList =  dao.searchExtWlQhzxRiskdooDetailByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询前海征信风险度提示明细表列表
     * @date 2017-12-06 16:03:25
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlQhzxRiskdooDetailDTO> searchExtWlQhzxRiskdooDetail(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlQhzxRiskdooDetailDTO> dataList = dao.searchExtWlQhzxRiskdooDetail(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询前海征信风险度提示明细表对象
     * @date 2017-12-06 16:03:25
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlQhzxRiskdooDetailDTO queryExtWlQhzxRiskdooDetailByPrimaryKey(String id) throws Exception {
		
		ExtWlQhzxRiskdooDetailDTO dto = dao.findExtWlQhzxRiskdooDetailByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlQhzxRiskdooDetailDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlQhzxRiskdooDetail
     * @author Administrator
     * @description: 新增 前海征信风险度提示明细表对象
     * @date 2017-12-06 16:03:25
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlQhzxRiskdooDetail(ExtWlQhzxRiskdooDetailDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlQhzxRiskdooDetail(paramMap);
		
		ExtWlQhzxRiskdooDetailDTO resultDto = (ExtWlQhzxRiskdooDetailDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlQhzxRiskdooDetail
     * @author Administrator
     * @description: 修改 前海征信风险度提示明细表对象
     * @date 2017-12-06 16:03:25
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlQhzxRiskdooDetail(ExtWlQhzxRiskdooDetailDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlQhzxRiskdooDetail(paramMap);
	}
	/**
     * @title: deleteExtWlQhzxRiskdooDetailByPrimaryKey
     * @author Administrator
     * @description: 删除 前海征信风险度提示明细表,按主键
     * @date 2017-12-06 16:03:25
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlQhzxRiskdooDetailByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlQhzxRiskdooDetailByPrimaryKey(paramMap);
	}
	 /**
	 * @return 
     * @title: insertExtQhzxRiskdooDetailList
     * @author dell
     * @description: 新增 前海征信风险度提示明细表列表
     * @date 2017-07-24 17:12:30
     * @param dto
     * @return
     * @throws
     */
    @SuppressWarnings("all")
    public Long insertExtWlQhzxRiskdooDetailList(List<ExtWlQhzxRiskdooDetailDTO> recordsList, Long fkRiskdooId) {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("dtoList", recordsList);
        paramMap.put("fkRiskdooId", fkRiskdooId);
        int count = dao.insertExtWlQhzxRiskdooDetailList(paramMap);
        return (long) count;
    }
    

}

