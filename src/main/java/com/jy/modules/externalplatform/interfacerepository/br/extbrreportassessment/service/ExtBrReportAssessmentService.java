package com.jy.modules.externalplatform.interfacerepository.br.extbrreportassessment.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.br.extbrreportassessment.dao.ExtBrReportAssessmentDao;
import com.jy.modules.externalplatform.interfacerepository.br.extbrreportassessment.dto.ExtBrReportAssessmentDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtBrReportAssessmentService
 * @description: 定义  百融风险评估 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.br.extbrreportassessment.service.ExtBrReportAssessmentService")
public class ExtBrReportAssessmentService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtBrReportAssessmentDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 百融风险评估列表
     * @date 2017-06-07 15:57:03
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtBrReportAssessmentDTO> searchExtBrReportAssessmentByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtBrReportAssessmentDTO> dataList =  dao.searchExtBrReportAssessmentByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询百融风险评估列表
     * @date 2017-06-07 15:57:03
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtBrReportAssessmentDTO> searchExtBrReportAssessment(Map<String,Object> searchParams) throws Exception {
	    List<ExtBrReportAssessmentDTO> dataList = dao.searchExtBrReportAssessment(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询百融风险评估对象
     * @date 2017-06-07 15:57:03
     * @param id
     * @return
     * @throws
     */ 
	public ExtBrReportAssessmentDTO queryExtBrReportAssessmentByPrimaryKey(String id) throws Exception {
		
		ExtBrReportAssessmentDTO dto = dao.findExtBrReportAssessmentByPrimaryKey(id);
		
		if(dto == null) dto = new ExtBrReportAssessmentDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtBrReportAssessment
     * @author Administrator
     * @description: 新增 百融风险评估对象
     * @date 2017-06-07 15:57:03
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtBrReportAssessment(ExtBrReportAssessmentDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtBrReportAssessment(paramMap);
		
		ExtBrReportAssessmentDTO resultDto = (ExtBrReportAssessmentDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtBrReportAssessment
     * @author Administrator
     * @description: 修改 百融风险评估对象
     * @date 2017-06-07 15:57:03
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtBrReportAssessment(ExtBrReportAssessmentDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtBrReportAssessment(paramMap);
	}
	/**
     * @title: deleteExtBrReportAssessmentByPrimaryKey
     * @author Administrator
     * @description: 删除 百融风险评估,按主键
     * @date 2017-06-07 15:57:03
     * @param paramMap
     * @throws
     */ 
	public void deleteExtBrReportAssessmentByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtBrReportAssessmentByPrimaryKey(paramMap);
	}

}

