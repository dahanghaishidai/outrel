package com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersoncase.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersoncase.dao.ExtLawPersonCaseDao;
import com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersoncase.dto.ExtLawPersonCaseDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtLawPersonCaseService
 * @description: 定义  汇法网个人案例信息表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersoncase.service.ExtLawPersonCaseService")
public class ExtLawPersonCaseService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtLawPersonCaseDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 汇法网个人案例信息表列表
     * @date 2017-05-31 11:10:01
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtLawPersonCaseDTO> searchExtLawPersonCaseByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtLawPersonCaseDTO> dataList =  dao.searchExtLawPersonCaseByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询汇法网个人案例信息表列表
     * @date 2017-05-31 11:10:01
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtLawPersonCaseDTO> searchExtLawPersonCase(Map<String,Object> searchParams) throws Exception {
	    List<ExtLawPersonCaseDTO> dataList = dao.searchExtLawPersonCase(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询汇法网个人案例信息表对象
     * @date 2017-05-31 11:10:01
     * @param id
     * @return
     * @throws
     */ 
	public ExtLawPersonCaseDTO queryExtLawPersonCaseByPrimaryKey(String id) throws Exception {
		
		ExtLawPersonCaseDTO dto = dao.findExtLawPersonCaseByPrimaryKey(id);
		
		if(dto == null) dto = new ExtLawPersonCaseDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtLawPersonCase
     * @author Administrator
     * @description: 新增 汇法网个人案例信息表对象
     * @date 2017-05-31 11:10:01
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtLawPersonCase(ExtLawPersonCaseDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtLawPersonCase(paramMap);
		
		ExtLawPersonCaseDTO resultDto = (ExtLawPersonCaseDTO) paramMap.get("dto");
		Long keyId = resultDto.getKeyid();
		return keyId;
	}
	/**
     * @title: updateExtLawPersonCase
     * @author Administrator
     * @description: 修改 汇法网个人案例信息表对象
     * @date 2017-05-31 11:10:01
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtLawPersonCase(ExtLawPersonCaseDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtLawPersonCase(paramMap);
	}
	/**
     * @title: deleteExtLawPersonCaseByPrimaryKey
     * @author Administrator
     * @description: 删除 汇法网个人案例信息表,按主键
     * @date 2017-05-31 11:10:01
     * @param paramMap
     * @throws
     */ 
	public void deleteExtLawPersonCaseByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtLawPersonCaseByPrimaryKey(paramMap);
	}

}

