package com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanyother.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanyother.dao.ExtLawCompanyOtherDao;
import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanyother.dto.ExtLawCompanyOtherDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtLawCompanyOtherService
 * @description: 定义  汇法网企业其他司法公告信息表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanyother.service.ExtLawCompanyOtherService")
public class ExtLawCompanyOtherService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtLawCompanyOtherDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 汇法网企业其他司法公告信息表列表
     * @date 2017-06-01 10:12:13
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtLawCompanyOtherDTO> searchExtLawCompanyOtherByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtLawCompanyOtherDTO> dataList =  dao.searchExtLawCompanyOtherByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询汇法网企业其他司法公告信息表列表
     * @date 2017-06-01 10:12:13
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtLawCompanyOtherDTO> searchExtLawCompanyOther(Map<String,Object> searchParams) throws Exception {
	    List<ExtLawCompanyOtherDTO> dataList = dao.searchExtLawCompanyOther(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询汇法网企业其他司法公告信息表对象
     * @date 2017-06-01 10:12:13
     * @param id
     * @return
     * @throws
     */ 
	public ExtLawCompanyOtherDTO queryExtLawCompanyOtherByPrimaryKey(String id) throws Exception {
		
		ExtLawCompanyOtherDTO dto = dao.findExtLawCompanyOtherByPrimaryKey(id);
		
		if(dto == null) dto = new ExtLawCompanyOtherDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtLawCompanyOther
     * @author Administrator
     * @description: 新增 汇法网企业其他司法公告信息表对象
     * @date 2017-06-01 10:12:13
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtLawCompanyOther(ExtLawCompanyOtherDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtLawCompanyOther(paramMap);
		
		ExtLawCompanyOtherDTO resultDto = (ExtLawCompanyOtherDTO) paramMap.get("dto");
		Long keyId = resultDto.getKeyid();
		return keyId;
	}
	/**
     * @title: updateExtLawCompanyOther
     * @author Administrator
     * @description: 修改 汇法网企业其他司法公告信息表对象
     * @date 2017-06-01 10:12:13
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtLawCompanyOther(ExtLawCompanyOtherDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtLawCompanyOther(paramMap);
	}
	/**
     * @title: deleteExtLawCompanyOtherByPrimaryKey
     * @author Administrator
     * @description: 删除 汇法网企业其他司法公告信息表,按主键
     * @date 2017-06-01 10:12:13
     * @param paramMap
     * @throws
     */ 
	public void deleteExtLawCompanyOtherByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtLawCompanyOtherByPrimaryKey(paramMap);
	}

}

