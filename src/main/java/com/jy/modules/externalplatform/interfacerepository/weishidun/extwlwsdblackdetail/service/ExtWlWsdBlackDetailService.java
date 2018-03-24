package com.jy.modules.externalplatform.interfacerepository.weishidun.extwlwsdblackdetail.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.weishidun.extwlwsdblackdetail.dto.ExtWlWsdBlackDetailDTO;
import com.jy.modules.externalplatform.interfacerepository.weishidun.extwlwsdblackdetail.dao.ExtWlWsdBlackDetailDao;

/**
 * @classname: ExtWlWsdBlackDetailService
 * @description: 定义  维氏盾个人黑名单详细信息 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.weishidun.extwlwsdblackdetail.service.ExtWlWsdBlackDetailService")
public class ExtWlWsdBlackDetailService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlWsdBlackDetailDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 维氏盾个人黑名单详细信息列表
     * @date 2017-12-19 20:14:33
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlWsdBlackDetailDTO> searchExtWlWsdBlackDetailByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlWsdBlackDetailDTO> dataList =  dao.searchExtWlWsdBlackDetailByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询维氏盾个人黑名单详细信息列表
     * @date 2017-12-19 20:14:33
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlWsdBlackDetailDTO> searchExtWlWsdBlackDetail(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlWsdBlackDetailDTO> dataList = dao.searchExtWlWsdBlackDetail(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询维氏盾个人黑名单详细信息对象
     * @date 2017-12-19 20:14:33
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlWsdBlackDetailDTO queryExtWlWsdBlackDetailByPrimaryKey(String id) throws Exception {
		
		ExtWlWsdBlackDetailDTO dto = dao.findExtWlWsdBlackDetailByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlWsdBlackDetailDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlWsdBlackDetail
     * @author Administrator
     * @description: 新增 维氏盾个人黑名单详细信息对象
     * @date 2017-12-19 20:14:33
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlWsdBlackDetail(ExtWlWsdBlackDetailDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlWsdBlackDetail(paramMap);
		
		ExtWlWsdBlackDetailDTO resultDto = (ExtWlWsdBlackDetailDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlWsdBlackDetail
     * @author Administrator
     * @description: 修改 维氏盾个人黑名单详细信息对象
     * @date 2017-12-19 20:14:33
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlWsdBlackDetail(ExtWlWsdBlackDetailDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlWsdBlackDetail(paramMap);
	}
	/**
     * @title: deleteExtWlWsdBlackDetailByPrimaryKey
     * @author Administrator
     * @description: 删除 维氏盾个人黑名单详细信息,按主键
     * @date 2017-12-19 20:14:33
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlWsdBlackDetailByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlWsdBlackDetailByPrimaryKey(paramMap);
	}

}

