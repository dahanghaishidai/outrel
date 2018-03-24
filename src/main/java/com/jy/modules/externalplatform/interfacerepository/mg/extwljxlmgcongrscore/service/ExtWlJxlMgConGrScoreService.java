package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcongrscore.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcongrscore.dto.ExtWlJxlMgConGrScoreDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcongrscore.dao.ExtWlJxlMgConGrScoreDao;

/**
 * @classname: ExtWlJxlMgConGrScoreService
 * @description: 定义  蜜罐联系人灰度分信息 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcongrscore.service.ExtWlJxlMgConGrScoreService")
public class ExtWlJxlMgConGrScoreService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlJxlMgConGrScoreDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 蜜罐联系人灰度分信息列表
     * @date 2018-01-09 17:45:51
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlJxlMgConGrScoreDTO> searchExtWlJxlMgConGrScoreByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlJxlMgConGrScoreDTO> dataList =  dao.searchExtWlJxlMgConGrScoreByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询蜜罐联系人灰度分信息列表
     * @date 2018-01-09 17:45:51
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlJxlMgConGrScoreDTO> searchExtWlJxlMgConGrScore(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlJxlMgConGrScoreDTO> dataList = dao.searchExtWlJxlMgConGrScore(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询蜜罐联系人灰度分信息对象
     * @date 2018-01-09 17:45:51
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlJxlMgConGrScoreDTO queryExtWlJxlMgConGrScoreByPrimaryKey(String id) throws Exception {
		
		ExtWlJxlMgConGrScoreDTO dto = dao.findExtWlJxlMgConGrScoreByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlJxlMgConGrScoreDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlJxlMgConGrScore
     * @author Administrator
     * @description: 新增 蜜罐联系人灰度分信息对象
     * @date 2018-01-09 17:45:51
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlJxlMgConGrScore(ExtWlJxlMgConGrScoreDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlJxlMgConGrScore(paramMap);
		
		ExtWlJxlMgConGrScoreDTO resultDto = (ExtWlJxlMgConGrScoreDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlJxlMgConGrScore
     * @author Administrator
     * @description: 修改 蜜罐联系人灰度分信息对象
     * @date 2018-01-09 17:45:51
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlJxlMgConGrScore(ExtWlJxlMgConGrScoreDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlJxlMgConGrScore(paramMap);
	}
	/**
     * @title: deleteExtWlJxlMgConGrScoreByPrimaryKey
     * @author Administrator
     * @description: 删除 蜜罐联系人灰度分信息,按主键
     * @date 2018-01-09 17:45:51
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlJxlMgConGrScoreByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlJxlMgConGrScoreByPrimaryKey(paramMap);
	}

}

