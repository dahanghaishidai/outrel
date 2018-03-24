package com.jy.modules.externalplatform.interfacerepository.xy.extwlxyoverduedetail.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.xy.extwlxyoverduedetail.dto.ExtWlXyOverdueDetailDTO;
import com.jy.modules.externalplatform.interfacerepository.xy.extwlxyoverduedetail.dao.ExtWlXyOverdueDetailDao;

/**
 * @classname: ExtWlXyOverdueDetailService
 * @description: 定义  新颜逾期信息详情表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.xy.extwlxyoverduedetail.service.ExtWlXyOverdueDetailService")
public class ExtWlXyOverdueDetailService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlXyOverdueDetailDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 新颜逾期信息详情表列表
     * @date 2017-12-12 16:17:24
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlXyOverdueDetailDTO> searchExtWlXyOverdueDetailByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlXyOverdueDetailDTO> dataList =  dao.searchExtWlXyOverdueDetailByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询新颜逾期信息详情表列表
     * @date 2017-12-12 16:17:24
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlXyOverdueDetailDTO> searchExtWlXyOverdueDetail(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlXyOverdueDetailDTO> dataList = dao.searchExtWlXyOverdueDetail(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询新颜逾期信息详情表对象
     * @date 2017-12-12 16:17:24
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlXyOverdueDetailDTO queryExtWlXyOverdueDetailByPrimaryKey(String id) throws Exception {
		
		ExtWlXyOverdueDetailDTO dto = dao.findExtWlXyOverdueDetailByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlXyOverdueDetailDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlXyOverdueDetail
     * @author Administrator
     * @description: 新增 新颜逾期信息详情表对象
     * @date 2017-12-12 16:17:24
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlXyOverdueDetail(ExtWlXyOverdueDetailDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlXyOverdueDetail(paramMap);
		
		ExtWlXyOverdueDetailDTO resultDto = (ExtWlXyOverdueDetailDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlXyOverdueDetail
     * @author Administrator
     * @description: 修改 新颜逾期信息详情表对象
     * @date 2017-12-12 16:17:24
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlXyOverdueDetail(ExtWlXyOverdueDetailDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlXyOverdueDetail(paramMap);
	}
	/**
     * @title: deleteExtWlXyOverdueDetailByPrimaryKey
     * @author Administrator
     * @description: 删除 新颜逾期信息详情表,按主键
     * @date 2017-12-12 16:17:24
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlXyOverdueDetailByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlXyOverdueDetailByPrimaryKey(paramMap);
	}

}

