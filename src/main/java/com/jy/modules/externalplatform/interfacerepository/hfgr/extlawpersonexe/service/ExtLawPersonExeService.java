package com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersonexe.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersonexe.dao.ExtLawPersonExeDao;
import com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersonexe.dto.ExtLawPersonExeDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtLawPersonExeService
 * @description: 定义  汇法网个人执行信息表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersonexe.service.ExtLawPersonExeService")
public class ExtLawPersonExeService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtLawPersonExeDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 汇法网个人执行信息表列表
     * @date 2017-05-31 11:10:35
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtLawPersonExeDTO> searchExtLawPersonExeByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtLawPersonExeDTO> dataList =  dao.searchExtLawPersonExeByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询汇法网个人执行信息表列表
     * @date 2017-05-31 11:10:35
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtLawPersonExeDTO> searchExtLawPersonExe(Map<String,Object> searchParams) throws Exception {
	    List<ExtLawPersonExeDTO> dataList = dao.searchExtLawPersonExe(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询汇法网个人执行信息表对象
     * @date 2017-05-31 11:10:35
     * @param id
     * @return
     * @throws
     */ 
	public ExtLawPersonExeDTO queryExtLawPersonExeByPrimaryKey(String id) throws Exception {
		
		ExtLawPersonExeDTO dto = dao.findExtLawPersonExeByPrimaryKey(id);
		
		if(dto == null) dto = new ExtLawPersonExeDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtLawPersonExe
     * @author Administrator
     * @description: 新增 汇法网个人执行信息表对象
     * @date 2017-05-31 11:10:35
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtLawPersonExe(ExtLawPersonExeDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtLawPersonExe(paramMap);
		
		ExtLawPersonExeDTO resultDto = (ExtLawPersonExeDTO) paramMap.get("dto");
		Long keyId = resultDto.getKeyid();
		return keyId;
	}
	/**
     * @title: updateExtLawPersonExe
     * @author Administrator
     * @description: 修改 汇法网个人执行信息表对象
     * @date 2017-05-31 11:10:35
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtLawPersonExe(ExtLawPersonExeDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtLawPersonExe(paramMap);
	}
	/**
     * @title: deleteExtLawPersonExeByPrimaryKey
     * @author Administrator
     * @description: 删除 汇法网个人执行信息表,按主键
     * @date 2017-05-31 11:10:35
     * @param paramMap
     * @throws
     */ 
	public void deleteExtLawPersonExeByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtLawPersonExeByPrimaryKey(paramMap);
	}

}

