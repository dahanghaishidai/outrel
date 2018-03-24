package com.jy.modules.externalplatform.interfacerepository.br.extbrreportlastweek.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.br.extbrreportlastweek.dao.ExtBrReportLastweekDao;
import com.jy.modules.externalplatform.interfacerepository.br.extbrreportlastweek.dto.ExtBrReportLastweekDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtBrReportLastweekService
 * @description: 定义  记录百融个人过去一周数据 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.br.extbrreportlastweek.service.ExtBrReportLastweekService")
public class ExtBrReportLastweekService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtBrReportLastweekDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 记录百融个人过去一周数据列表
     * @date 2017-06-07 15:56:44
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtBrReportLastweekDTO> searchExtBrReportLastweekByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtBrReportLastweekDTO> dataList =  dao.searchExtBrReportLastweekByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询记录百融个人过去一周数据列表
     * @date 2017-06-07 15:56:44
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtBrReportLastweekDTO> searchExtBrReportLastweek(Map<String,Object> searchParams) throws Exception {
	    List<ExtBrReportLastweekDTO> dataList = dao.searchExtBrReportLastweek(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询记录百融个人过去一周数据对象
     * @date 2017-06-07 15:56:44
     * @param id
     * @return
     * @throws
     */ 
	public ExtBrReportLastweekDTO queryExtBrReportLastweekByPrimaryKey(String id) throws Exception {
		
		ExtBrReportLastweekDTO dto = dao.findExtBrReportLastweekByPrimaryKey(id);
		
		if(dto == null) dto = new ExtBrReportLastweekDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtBrReportLastweek
     * @author Administrator
     * @description: 新增 记录百融个人过去一周数据对象
     * @date 2017-06-07 15:56:44
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtBrReportLastweek(ExtBrReportLastweekDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtBrReportLastweek(paramMap);
		
		ExtBrReportLastweekDTO resultDto = (ExtBrReportLastweekDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtBrReportLastweek
     * @author Administrator
     * @description: 修改 记录百融个人过去一周数据对象
     * @date 2017-06-07 15:56:44
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtBrReportLastweek(ExtBrReportLastweekDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtBrReportLastweek(paramMap);
	}
	/**
     * @title: deleteExtBrReportLastweekByPrimaryKey
     * @author Administrator
     * @description: 删除 记录百融个人过去一周数据,按主键
     * @date 2017-06-07 15:56:44
     * @param paramMap
     * @throws
     */ 
	public void deleteExtBrReportLastweekByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtBrReportLastweekByPrimaryKey(paramMap);
	}

}

