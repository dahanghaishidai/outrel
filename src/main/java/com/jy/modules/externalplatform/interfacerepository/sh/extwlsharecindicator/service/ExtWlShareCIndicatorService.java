package com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecindicator.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecindicator.dto.ExtWlShareCIndicatorDTO;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecindicator.dao.ExtWlShareCIndicatorDao;

/**
 * @classname: ExtWlShareCIndicatorService
 * @description: 定义  算话共享报告_信贷信息概要（信用提示） 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecindicator.service.ExtWlShareCIndicatorService")
public class ExtWlShareCIndicatorService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlShareCIndicatorDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 算话共享报告_信贷信息概要（信用提示）列表
     * @date 2017-12-07 19:53:07
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlShareCIndicatorDTO> searchExtWlShareCIndicatorByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlShareCIndicatorDTO> dataList =  dao.searchExtWlShareCIndicatorByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话共享报告_信贷信息概要（信用提示）列表
     * @date 2017-12-07 19:53:07
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlShareCIndicatorDTO> searchExtWlShareCIndicator(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlShareCIndicatorDTO> dataList = dao.searchExtWlShareCIndicator(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话共享报告_信贷信息概要（信用提示）对象
     * @date 2017-12-07 19:53:07
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlShareCIndicatorDTO queryExtWlShareCIndicatorByPrimaryKey(String id) throws Exception {
		
		ExtWlShareCIndicatorDTO dto = dao.findExtWlShareCIndicatorByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlShareCIndicatorDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlShareCIndicator
     * @author Administrator
     * @description: 新增 算话共享报告_信贷信息概要（信用提示）对象
     * @date 2017-12-07 19:53:07
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlShareCIndicator(ExtWlShareCIndicatorDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlShareCIndicator(paramMap);
		
		ExtWlShareCIndicatorDTO resultDto = (ExtWlShareCIndicatorDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlShareCIndicator
     * @author Administrator
     * @description: 修改 算话共享报告_信贷信息概要（信用提示）对象
     * @date 2017-12-07 19:53:07
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlShareCIndicator(ExtWlShareCIndicatorDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlShareCIndicator(paramMap);
	}
	/**
     * @title: deleteExtWlShareCIndicatorByPrimaryKey
     * @author Administrator
     * @description: 删除 算话共享报告_信贷信息概要（信用提示）,按主键
     * @date 2017-12-07 19:53:07
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlShareCIndicatorByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlShareCIndicatorByPrimaryKey(paramMap);
	}

    /**
     * @title: insertExtWlShareCIndicatorList
     * @author: dongkangning
     * @description: 批量新增 算话共享报告_信贷信息概要（信用提示）列表
     * @date 2017年12月8日 上午10:33:23
     * @param indicatorList
     * @param fkReportId
     * @return
     * @throws
     */
    public long insertExtWlShareCIndicatorList(List<ExtWlShareCIndicatorDTO> indicatorList, Long fkReportId) {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("dtoList", indicatorList);
        paramMap.put("fkReportId", fkReportId);
        int count = dao.insertExtWlShareCIndicatorList(paramMap);
        return (long) count;
        
    }

}

