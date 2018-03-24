package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcontnumsta.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcontnumsta.dto.ExtWlJxlMgContNumStaDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcontnumsta.dao.ExtWlJxlMgContNumStaDao;

/**
 * @classname: ExtWlJxlMgContNumStaService
 * @description: 定义  蜜罐联系人数表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcontnumsta.service.ExtWlJxlMgContNumStaService")
public class ExtWlJxlMgContNumStaService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlJxlMgContNumStaDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 蜜罐联系人数表列表
     * @date 2018-01-09 17:44:13
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlJxlMgContNumStaDTO> searchExtWlJxlMgContNumStaByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlJxlMgContNumStaDTO> dataList =  dao.searchExtWlJxlMgContNumStaByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询蜜罐联系人数表列表
     * @date 2018-01-09 17:44:13
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlJxlMgContNumStaDTO> searchExtWlJxlMgContNumSta(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlJxlMgContNumStaDTO> dataList = dao.searchExtWlJxlMgContNumSta(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询蜜罐联系人数表对象
     * @date 2018-01-09 17:44:13
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlJxlMgContNumStaDTO queryExtWlJxlMgContNumStaByPrimaryKey(String id) throws Exception {
		
		ExtWlJxlMgContNumStaDTO dto = dao.findExtWlJxlMgContNumStaByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlJxlMgContNumStaDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlJxlMgContNumSta
     * @author Administrator
     * @description: 新增 蜜罐联系人数表对象
     * @date 2018-01-09 17:44:13
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlJxlMgContNumSta(ExtWlJxlMgContNumStaDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlJxlMgContNumSta(paramMap);
		
		ExtWlJxlMgContNumStaDTO resultDto = (ExtWlJxlMgContNumStaDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlJxlMgContNumSta
     * @author Administrator
     * @description: 修改 蜜罐联系人数表对象
     * @date 2018-01-09 17:44:13
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlJxlMgContNumSta(ExtWlJxlMgContNumStaDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlJxlMgContNumSta(paramMap);
	}
	/**
     * @title: deleteExtWlJxlMgContNumStaByPrimaryKey
     * @author Administrator
     * @description: 删除 蜜罐联系人数表,按主键
     * @date 2018-01-09 17:44:13
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlJxlMgContNumStaByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlJxlMgContNumStaByPrimaryKey(paramMap);
	}

}

