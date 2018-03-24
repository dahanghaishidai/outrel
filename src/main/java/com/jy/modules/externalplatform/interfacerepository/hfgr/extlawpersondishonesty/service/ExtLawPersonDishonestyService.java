package com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersondishonesty.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersondishonesty.dao.ExtLawPersonDishonestyDao;
import com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersondishonesty.dto.ExtLawPersonDishonestyDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtLawPersonDishonestyService
 * @description: 定义  汇法网个人失信信息表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.hfgr.hfgr.extlawpersondishonesty.service.ExtLawPersonDishonestyService")
public class ExtLawPersonDishonestyService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtLawPersonDishonestyDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 汇法网个人失信信息表列表
     * @date 2017-05-31 11:11:04
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtLawPersonDishonestyDTO> searchExtLawPersonDishonestyByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtLawPersonDishonestyDTO> dataList =  dao.searchExtLawPersonDishonestyByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询汇法网个人失信信息表列表
     * @date 2017-05-31 11:11:04
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtLawPersonDishonestyDTO> searchExtLawPersonDishonesty(Map<String,Object> searchParams) throws Exception {
	    List<ExtLawPersonDishonestyDTO> dataList = dao.searchExtLawPersonDishonesty(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询汇法网个人失信信息表对象
     * @date 2017-05-31 11:11:04
     * @param id
     * @return
     * @throws
     */ 
	public ExtLawPersonDishonestyDTO queryExtLawPersonDishonestyByPrimaryKey(String id) throws Exception {
		
		ExtLawPersonDishonestyDTO dto = dao.findExtLawPersonDishonestyByPrimaryKey(id);
		
		if(dto == null) dto = new ExtLawPersonDishonestyDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtLawPersonDishonesty
     * @author Administrator
     * @description: 新增 汇法网个人失信信息表对象
     * @date 2017-05-31 11:11:04
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtLawPersonDishonesty(ExtLawPersonDishonestyDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtLawPersonDishonesty(paramMap);
		
		ExtLawPersonDishonestyDTO resultDto = (ExtLawPersonDishonestyDTO) paramMap.get("dto");
		Long keyId = resultDto.getKeyid();
		return keyId;
	}
	/**
     * @title: updateExtLawPersonDishonesty
     * @author Administrator
     * @description: 修改 汇法网个人失信信息表对象
     * @date 2017-05-31 11:11:04
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtLawPersonDishonesty(ExtLawPersonDishonestyDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtLawPersonDishonesty(paramMap);
	}
	/**
     * @title: deleteExtLawPersonDishonestyByPrimaryKey
     * @author Administrator
     * @description: 删除 汇法网个人失信信息表,按主键
     * @date 2017-05-31 11:11:04
     * @param paramMap
     * @throws
     */ 
	public void deleteExtLawPersonDishonestyByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtLawPersonDishonestyByPrimaryKey(paramMap);
	}

}

