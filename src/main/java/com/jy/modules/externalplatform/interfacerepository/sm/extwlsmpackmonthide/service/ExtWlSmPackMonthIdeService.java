package com.jy.modules.externalplatform.interfacerepository.sm.extwlsmpackmonthide.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.sm.extwlsmpackmonthide.dto.ExtWlSmPackMonthIdeDTO;
import com.jy.modules.externalplatform.interfacerepository.sm.extwlsmpackmonthide.dao.ExtWlSmPackMonthIdeDao;

/**
 * @classname: ExtWlSmPackMonthIdeService
 * @description: 定义  数美中介包装风险识别服务逐月统计（副表） 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.sm.extwlsmpackmonthide.service.ExtWlSmPackMonthIdeService")
public class ExtWlSmPackMonthIdeService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlSmPackMonthIdeDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 数美中介包装风险识别服务逐月统计（副表）列表
     * @date 2017-12-19 14:21:37
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlSmPackMonthIdeDTO> searchExtWlSmPackMonthIdeByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlSmPackMonthIdeDTO> dataList =  dao.searchExtWlSmPackMonthIdeByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询数美中介包装风险识别服务逐月统计（副表）列表
     * @date 2017-12-19 14:21:37
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlSmPackMonthIdeDTO> searchExtWlSmPackMonthIde(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlSmPackMonthIdeDTO> dataList = dao.searchExtWlSmPackMonthIde(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询数美中介包装风险识别服务逐月统计（副表）对象
     * @date 2017-12-19 14:21:37
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlSmPackMonthIdeDTO queryExtWlSmPackMonthIdeByPrimaryKey(String id) throws Exception {
		
		ExtWlSmPackMonthIdeDTO dto = dao.findExtWlSmPackMonthIdeByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlSmPackMonthIdeDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlSmPackMonthIde
     * @author Administrator
     * @description: 新增 数美中介包装风险识别服务逐月统计（副表）对象
     * @date 2017-12-19 14:21:37
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlSmPackMonthIde(ExtWlSmPackMonthIdeDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlSmPackMonthIde(paramMap);
		
		ExtWlSmPackMonthIdeDTO resultDto = (ExtWlSmPackMonthIdeDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlSmPackMonthIde
     * @author Administrator
     * @description: 修改 数美中介包装风险识别服务逐月统计（副表）对象
     * @date 2017-12-19 14:21:37
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlSmPackMonthIde(ExtWlSmPackMonthIdeDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlSmPackMonthIde(paramMap);
	}
	/**
     * @title: deleteExtWlSmPackMonthIdeByPrimaryKey
     * @author Administrator
     * @description: 删除 数美中介包装风险识别服务逐月统计（副表）,按主键
     * @date 2017-12-19 14:21:37
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlSmPackMonthIdeByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlSmPackMonthIdeByPrimaryKey(paramMap);
	}

}

