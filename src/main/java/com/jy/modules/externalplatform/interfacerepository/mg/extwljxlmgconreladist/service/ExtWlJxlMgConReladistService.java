package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgconreladist.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgconreladist.dto.ExtWlJxlMgConReladistDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgconreladist.dao.ExtWlJxlMgConReladistDao;

/**
 * @classname: ExtWlJxlMgConReladistService
 * @description: 定义  蜜罐联系人分布表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgconreladist.service.ExtWlJxlMgConReladistService")
public class ExtWlJxlMgConReladistService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlJxlMgConReladistDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 蜜罐联系人分布表列表
     * @date 2018-01-09 17:46:08
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlJxlMgConReladistDTO> searchExtWlJxlMgConReladistByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlJxlMgConReladistDTO> dataList =  dao.searchExtWlJxlMgConReladistByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询蜜罐联系人分布表列表
     * @date 2018-01-09 17:46:08
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlJxlMgConReladistDTO> searchExtWlJxlMgConReladist(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlJxlMgConReladistDTO> dataList = dao.searchExtWlJxlMgConReladist(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询蜜罐联系人分布表对象
     * @date 2018-01-09 17:46:08
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlJxlMgConReladistDTO queryExtWlJxlMgConReladistByPrimaryKey(String id) throws Exception {
		
		ExtWlJxlMgConReladistDTO dto = dao.findExtWlJxlMgConReladistByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlJxlMgConReladistDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlJxlMgConReladist
     * @author Administrator
     * @description: 新增 蜜罐联系人分布表对象
     * @date 2018-01-09 17:46:08
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlJxlMgConReladist(ExtWlJxlMgConReladistDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlJxlMgConReladist(paramMap);
		
		ExtWlJxlMgConReladistDTO resultDto = (ExtWlJxlMgConReladistDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlJxlMgConReladist
     * @author Administrator
     * @description: 修改 蜜罐联系人分布表对象
     * @date 2018-01-09 17:46:08
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlJxlMgConReladist(ExtWlJxlMgConReladistDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlJxlMgConReladist(paramMap);
	}
	/**
     * @title: deleteExtWlJxlMgConReladistByPrimaryKey
     * @author Administrator
     * @description: 删除 蜜罐联系人分布表,按主键
     * @date 2018-01-09 17:46:08
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlJxlMgConReladistByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlJxlMgConReladistByPrimaryKey(paramMap);
	}

}

