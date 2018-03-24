package com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtblack.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtblack.dto.ExtWlZxtBlackDTO;
import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtblack.dao.ExtWlZxtBlackDao;

/**
 * @classname: ExtWlZxtBlackService
 * @description: 定义  个人-黑名单 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtblack.service.ExtWlZxtBlackService")
public class ExtWlZxtBlackService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlZxtBlackDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 个人-黑名单列表
     * @date 2017-12-14 19:06:08
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlZxtBlackDTO> searchExtWlZxtBlackByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlZxtBlackDTO> dataList =  dao.searchExtWlZxtBlackByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询个人-黑名单列表
     * @date 2017-12-14 19:06:08
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlZxtBlackDTO> searchExtWlZxtBlack(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlZxtBlackDTO> dataList = dao.searchExtWlZxtBlack(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询个人-黑名单对象
     * @date 2017-12-14 19:06:08
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlZxtBlackDTO queryExtWlZxtBlackByPrimaryKey(String id) throws Exception {
		
		ExtWlZxtBlackDTO dto = dao.findExtWlZxtBlackByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlZxtBlackDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlZxtBlack
     * @author Administrator
     * @description: 新增 个人-黑名单对象
     * @date 2017-12-14 19:06:08
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlZxtBlack(ExtWlZxtBlackDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlZxtBlack(paramMap);
		
		ExtWlZxtBlackDTO resultDto = (ExtWlZxtBlackDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlZxtBlack
     * @author Administrator
     * @description: 修改 个人-黑名单对象
     * @date 2017-12-14 19:06:08
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlZxtBlack(ExtWlZxtBlackDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlZxtBlack(paramMap);
	}
	/**
     * @title: deleteExtWlZxtBlackByPrimaryKey
     * @author Administrator
     * @description: 删除 个人-黑名单,按主键
     * @date 2017-12-14 19:06:08
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlZxtBlackByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlZxtBlackByPrimaryKey(paramMap);
	}

}

