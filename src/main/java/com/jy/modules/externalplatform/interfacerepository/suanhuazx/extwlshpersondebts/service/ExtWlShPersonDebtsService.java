package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpersondebts.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpersondebts.dto.ExtWlShPersonDebtsDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpersondebts.dao.ExtWlShPersonDebtsDao;

/**
 * @classname: ExtWlShPersonDebtsService
 * @description: 定义  人行征信负债情况 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpersondebts.service.ExtWlShPersonDebtsService")
public class ExtWlShPersonDebtsService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlShPersonDebtsDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 人行征信负债情况列表
     * @date 2017-12-21 19:48:03
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlShPersonDebtsDTO> searchExtWlShPersonDebtsByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlShPersonDebtsDTO> dataList =  dao.searchExtWlShPersonDebtsByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询人行征信负债情况列表
     * @date 2017-12-21 19:48:03
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlShPersonDebtsDTO> searchExtWlShPersonDebts(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlShPersonDebtsDTO> dataList = dao.searchExtWlShPersonDebts(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询人行征信负债情况对象
     * @date 2017-12-21 19:48:03
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlShPersonDebtsDTO queryExtWlShPersonDebtsByPrimaryKey(String id) throws Exception {
		
		ExtWlShPersonDebtsDTO dto = dao.findExtWlShPersonDebtsByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlShPersonDebtsDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlShPersonDebts
     * @author Administrator
     * @description: 新增 人行征信负债情况对象
     * @date 2017-12-21 19:48:03
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlShPersonDebts(ExtWlShPersonDebtsDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlShPersonDebts(paramMap);
		
		ExtWlShPersonDebtsDTO resultDto = (ExtWlShPersonDebtsDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlShPersonDebts
     * @author Administrator
     * @description: 修改 人行征信负债情况对象
     * @date 2017-12-21 19:48:03
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlShPersonDebts(ExtWlShPersonDebtsDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlShPersonDebts(paramMap);
	}
	/**
     * @title: deleteExtWlShPersonDebtsByPrimaryKey
     * @author Administrator
     * @description: 删除 人行征信负债情况,按主键
     * @date 2017-12-21 19:48:03
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlShPersonDebtsByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlShPersonDebtsByPrimaryKey(paramMap);
	}

}

