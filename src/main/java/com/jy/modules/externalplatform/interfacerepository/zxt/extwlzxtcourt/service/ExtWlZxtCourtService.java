package com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtcourt.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtcourt.dto.ExtWlZxtCourtDTO;
import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtcourt.dao.ExtWlZxtCourtDao;

/**
 * @classname: ExtWlZxtCourtService
 * @description: 定义  个人/单位-法院被执行信息 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtcourt.service.ExtWlZxtCourtService")
public class ExtWlZxtCourtService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlZxtCourtDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 个人/单位-法院被执行信息列表
     * @date 2017-12-15 18:07:47
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlZxtCourtDTO> searchExtWlZxtCourtByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlZxtCourtDTO> dataList =  dao.searchExtWlZxtCourtByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询个人/单位-法院被执行信息列表
     * @date 2017-12-15 18:07:47
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlZxtCourtDTO> searchExtWlZxtCourt(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlZxtCourtDTO> dataList = dao.searchExtWlZxtCourt(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询个人/单位-法院被执行信息对象
     * @date 2017-12-15 18:07:47
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlZxtCourtDTO queryExtWlZxtCourtByPrimaryKey(String id) throws Exception {
		
		ExtWlZxtCourtDTO dto = dao.findExtWlZxtCourtByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlZxtCourtDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlZxtCourt
     * @author Administrator
     * @description: 新增 个人/单位-法院被执行信息对象
     * @date 2017-12-15 18:07:47
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlZxtCourt(ExtWlZxtCourtDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlZxtCourt(paramMap);
		
		ExtWlZxtCourtDTO resultDto = (ExtWlZxtCourtDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlZxtCourt
     * @author Administrator
     * @description: 修改 个人/单位-法院被执行信息对象
     * @date 2017-12-15 18:07:47
     * @param dto
     * @return
     * @throws
     */
	public void updateExtWlZxtCourt(ExtWlZxtCourtDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlZxtCourt(paramMap);
	}
	/**
     * @title: deleteExtWlZxtCourtByPrimaryKey
     * @author Administrator
     * @description: 删除 个人/单位-法院被执行信息,按主键
     * @date 2017-12-15 18:07:47
     * @param baseDto, ids
     * @throws
     */ 
	public void deleteExtWlZxtCourtByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlZxtCourtByPrimaryKey(paramMap);
	}

}

