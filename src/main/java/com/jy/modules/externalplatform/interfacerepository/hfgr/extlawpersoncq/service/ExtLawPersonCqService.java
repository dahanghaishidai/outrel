package com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersoncq.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersoncq.dao.ExtLawPersonCqDao;
import com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersoncq.dto.ExtLawPersonCqDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtLawPersonCqService
 * @description: 定义  汇法网个人催欠公告表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.hfgr.hfgr.extlawpersoncq.service.ExtLawPersonCqService")
public class ExtLawPersonCqService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtLawPersonCqDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 汇法网个人催欠公告表列表
     * @date 2017-05-31 11:10:53
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtLawPersonCqDTO> searchExtLawPersonCqByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtLawPersonCqDTO> dataList =  dao.searchExtLawPersonCqByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询汇法网个人催欠公告表列表
     * @date 2017-05-31 11:10:53
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtLawPersonCqDTO> searchExtLawPersonCq(Map<String,Object> searchParams) throws Exception {
	    List<ExtLawPersonCqDTO> dataList = dao.searchExtLawPersonCq(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询汇法网个人催欠公告表对象
     * @date 2017-05-31 11:10:53
     * @param id
     * @return
     * @throws
     */ 
	public ExtLawPersonCqDTO queryExtLawPersonCqByPrimaryKey(String id) throws Exception {
		
		ExtLawPersonCqDTO dto = dao.findExtLawPersonCqByPrimaryKey(id);
		
		if(dto == null) dto = new ExtLawPersonCqDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtLawPersonCq
     * @author Administrator
     * @description: 新增 汇法网个人催欠公告表对象
     * @date 2017-05-31 11:10:53
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtLawPersonCq(ExtLawPersonCqDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtLawPersonCq(paramMap);
		
		ExtLawPersonCqDTO resultDto = (ExtLawPersonCqDTO) paramMap.get("dto");
		Long keyId = resultDto.getKeyid();
		return keyId;
	}
	/**
     * @title: updateExtLawPersonCq
     * @author Administrator
     * @description: 修改 汇法网个人催欠公告表对象
     * @date 2017-05-31 11:10:53
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtLawPersonCq(ExtLawPersonCqDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtLawPersonCq(paramMap);
	}
	/**
     * @title: deleteExtLawPersonCqByPrimaryKey
     * @author Administrator
     * @description: 删除 汇法网个人催欠公告表,按主键
     * @date 2017-05-31 11:10:53
     * @param paramMap
     * @throws
     */ 
	public void deleteExtLawPersonCqByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtLawPersonCqByPrimaryKey(paramMap);
	}

}

