package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpersonoverd.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpersonoverd.dto.ExtWlShPersonOverdDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpersonoverd.dao.ExtWlShPersonOverdDao;

/**
 * @classname: ExtWlShPersonOverdService
 * @description: 定义  人行征信逾期情况 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpersonoverd.service.ExtWlShPersonOverdService")
public class ExtWlShPersonOverdService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlShPersonOverdDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 人行征信逾期情况列表
     * @date 2017-12-21 19:48:55
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlShPersonOverdDTO> searchExtWlShPersonOverdByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlShPersonOverdDTO> dataList =  dao.searchExtWlShPersonOverdByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询人行征信逾期情况列表
     * @date 2017-12-21 19:48:55
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlShPersonOverdDTO> searchExtWlShPersonOverd(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlShPersonOverdDTO> dataList = dao.searchExtWlShPersonOverd(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询人行征信逾期情况对象
     * @date 2017-12-21 19:48:55
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlShPersonOverdDTO queryExtWlShPersonOverdByPrimaryKey(String id) throws Exception {
		
		ExtWlShPersonOverdDTO dto = dao.findExtWlShPersonOverdByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlShPersonOverdDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlShPersonOverd
     * @author Administrator
     * @description: 新增 人行征信逾期情况对象
     * @date 2017-12-21 19:48:55
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlShPersonOverd(ExtWlShPersonOverdDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlShPersonOverd(paramMap);
		
		ExtWlShPersonOverdDTO resultDto = (ExtWlShPersonOverdDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlShPersonOverd
     * @author Administrator
     * @description: 修改 人行征信逾期情况对象
     * @date 2017-12-21 19:48:55
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlShPersonOverd(ExtWlShPersonOverdDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlShPersonOverd(paramMap);
	}
	/**
     * @title: deleteExtWlShPersonOverdByPrimaryKey
     * @author Administrator
     * @description: 删除 人行征信逾期情况,按主键
     * @date 2017-12-21 19:48:55
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlShPersonOverdByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlShPersonOverdByPrimaryKey(paramMap);
	}

}

