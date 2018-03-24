package com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersontax.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersontax.dao.ExtLawPersonTaxDao;
import com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersontax.dto.ExtLawPersonTaxDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtLawPersonTaxService
 * @description: 定义  汇法网个人税务信息表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersontax.service.ExtLawPersonTaxService")
public class ExtLawPersonTaxService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtLawPersonTaxDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 汇法网个人税务信息表列表
     * @date 2017-05-31 11:10:18
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtLawPersonTaxDTO> searchExtLawPersonTaxByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtLawPersonTaxDTO> dataList =  dao.searchExtLawPersonTaxByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询汇法网个人税务信息表列表
     * @date 2017-05-31 11:10:18
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtLawPersonTaxDTO> searchExtLawPersonTax(Map<String,Object> searchParams) throws Exception {
	    List<ExtLawPersonTaxDTO> dataList = dao.searchExtLawPersonTax(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询汇法网个人税务信息表对象
     * @date 2017-05-31 11:10:18
     * @param id
     * @return
     * @throws
     */ 
	public ExtLawPersonTaxDTO queryExtLawPersonTaxByPrimaryKey(String id) throws Exception {
		
		ExtLawPersonTaxDTO dto = dao.findExtLawPersonTaxByPrimaryKey(id);
		
		if(dto == null) dto = new ExtLawPersonTaxDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtLawPersonTax
     * @author Administrator
     * @description: 新增 汇法网个人税务信息表对象
     * @date 2017-05-31 11:10:18
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtLawPersonTax(ExtLawPersonTaxDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtLawPersonTax(paramMap);
		
		ExtLawPersonTaxDTO resultDto = (ExtLawPersonTaxDTO) paramMap.get("dto");
		Long keyId = resultDto.getKeyid();
		return keyId;
	}
	/**
     * @title: updateExtLawPersonTax
     * @author Administrator
     * @description: 修改 汇法网个人税务信息表对象
     * @date 2017-05-31 11:10:18
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtLawPersonTax(ExtLawPersonTaxDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtLawPersonTax(paramMap);
	}
	/**
     * @title: deleteExtLawPersonTaxByPrimaryKey
     * @author Administrator
     * @description: 删除 汇法网个人税务信息表,按主键
     * @date 2017-05-31 11:10:18
     * @param paramMap
     * @throws
     */ 
	public void deleteExtLawPersonTaxByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtLawPersonTaxByPrimaryKey(paramMap);
	}

}

