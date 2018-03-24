package com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtoverduectc.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtoverduectc.dto.ExtWlZxtOverdueCtCDTO;
import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtoverduectc.dao.ExtWlZxtOverdueCtCDao;

/**
 * @classname: ExtWlZxtOverdueCtCService
 * @description: 定义  关联人-出现逾期黑名单次数 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtoverduectc.service.ExtWlZxtOverdueCtCService")
public class ExtWlZxtOverdueCtCService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlZxtOverdueCtCDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 关联人-出现逾期黑名单次数列表
     * @date 2017-12-18 11:34:10
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlZxtOverdueCtCDTO> searchExtWlZxtOverdueCtCByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlZxtOverdueCtCDTO> dataList =  dao.searchExtWlZxtOverdueCtCByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询关联人-出现逾期黑名单次数列表
     * @date 2017-12-18 11:34:10
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlZxtOverdueCtCDTO> searchExtWlZxtOverdueCtC(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlZxtOverdueCtCDTO> dataList = dao.searchExtWlZxtOverdueCtC(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询关联人-出现逾期黑名单次数对象
     * @date 2017-12-18 11:34:10
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlZxtOverdueCtCDTO queryExtWlZxtOverdueCtCByPrimaryKey(String id) throws Exception {
		
		ExtWlZxtOverdueCtCDTO dto = dao.findExtWlZxtOverdueCtCByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlZxtOverdueCtCDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlZxtOverdueCtC
     * @author Administrator
     * @description: 新增 关联人-出现逾期黑名单次数对象
     * @date 2017-12-18 11:34:10
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlZxtOverdueCtC(ExtWlZxtOverdueCtCDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlZxtOverdueCtC(paramMap);
		
		ExtWlZxtOverdueCtCDTO resultDto = (ExtWlZxtOverdueCtCDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlZxtOverdueCtC
     * @author Administrator
     * @description: 修改 关联人-出现逾期黑名单次数对象
     * @date 2017-12-18 11:34:10
     * @param dto
     * @return
     * @throws
     */
	public void updateExtWlZxtOverdueCtC(ExtWlZxtOverdueCtCDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlZxtOverdueCtC(paramMap);
	}
	/**
     * @title: deleteExtWlZxtOverdueCtCByPrimaryKey
     * @author Administrator
     * @description: 删除 关联人-出现逾期黑名单次数,按主键
     * @date 2017-12-18 11:34:10
     * @param baseDto, ids
     * @throws
     */ 
	public void deleteExtWlZxtOverdueCtCByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlZxtOverdueCtCByPrimaryKey(paramMap);
	}

}

