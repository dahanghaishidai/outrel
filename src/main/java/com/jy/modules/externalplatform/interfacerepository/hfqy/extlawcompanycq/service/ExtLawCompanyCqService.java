package com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanycq.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanycq.dao.ExtLawCompanyCqDao;
import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanycq.dto.ExtLawCompanyCqDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtLawCompanyCqService
 * @description: 定义  汇法网企业催欠公告表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanycq.service.ExtLawCompanyCqService")
public class ExtLawCompanyCqService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtLawCompanyCqDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 汇法网企业催欠公告表列表
     * @date 2017-06-01 10:11:27
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtLawCompanyCqDTO> searchExtLawCompanyCqByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtLawCompanyCqDTO> dataList =  dao.searchExtLawCompanyCqByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询汇法网企业催欠公告表列表
     * @date 2017-06-01 10:11:27
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtLawCompanyCqDTO> searchExtLawCompanyCq(Map<String,Object> searchParams) throws Exception {
	    List<ExtLawCompanyCqDTO> dataList = dao.searchExtLawCompanyCq(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询汇法网企业催欠公告表对象
     * @date 2017-06-01 10:11:27
     * @param id
     * @return
     * @throws
     */ 
	public ExtLawCompanyCqDTO queryExtLawCompanyCqByPrimaryKey(String id) throws Exception {
		
		ExtLawCompanyCqDTO dto = dao.findExtLawCompanyCqByPrimaryKey(id);
		
		if(dto == null) dto = new ExtLawCompanyCqDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtLawCompanyCq
     * @author Administrator
     * @description: 新增 汇法网企业催欠公告表对象
     * @date 2017-06-01 10:11:27
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtLawCompanyCq(ExtLawCompanyCqDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtLawCompanyCq(paramMap);
		
		ExtLawCompanyCqDTO resultDto = (ExtLawCompanyCqDTO) paramMap.get("dto");
		Long keyId = resultDto.getKeyid();
		return keyId;
	}
	/**
     * @title: updateExtLawCompanyCq
     * @author Administrator
     * @description: 修改 汇法网企业催欠公告表对象
     * @date 2017-06-01 10:11:27
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtLawCompanyCq(ExtLawCompanyCqDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtLawCompanyCq(paramMap);
	}
	/**
     * @title: deleteExtLawCompanyCqByPrimaryKey
     * @author Administrator
     * @description: 删除 汇法网企业催欠公告表,按主键
     * @date 2017-06-01 10:11:27
     * @param paramMap
     * @throws
     */ 
	public void deleteExtLawCompanyCqByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtLawCompanyCqByPrimaryKey(paramMap);
	}

}

