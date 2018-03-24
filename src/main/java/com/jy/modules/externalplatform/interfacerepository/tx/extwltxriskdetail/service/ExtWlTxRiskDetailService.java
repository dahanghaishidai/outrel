package com.jy.modules.externalplatform.interfacerepository.tx.extwltxriskdetail.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.tx.extwltxriskdetail.dto.ExtWlTxRiskDetailDTO;
import com.jy.modules.externalplatform.interfacerepository.tx.extwltxriskdetail.dao.ExtWlTxRiskDetailDao;

/**
 * @classname: ExtWlTxRiskDetailService
 * @description: 定义  腾讯_反欺诈服务_风险类型详情 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.tx.extwltxriskdetail.service.ExtWlTxRiskDetailService")
public class ExtWlTxRiskDetailService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlTxRiskDetailDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 腾讯_反欺诈服务_风险类型详情列表
     * @date 2017-12-18 15:24:26
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlTxRiskDetailDTO> searchExtWlTxRiskDetailByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlTxRiskDetailDTO> dataList =  dao.searchExtWlTxRiskDetailByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询腾讯_反欺诈服务_风险类型详情列表
     * @date 2017-12-18 15:24:26
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlTxRiskDetailDTO> searchExtWlTxRiskDetail(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlTxRiskDetailDTO> dataList = dao.searchExtWlTxRiskDetail(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询腾讯_反欺诈服务_风险类型详情对象
     * @date 2017-12-18 15:24:26
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlTxRiskDetailDTO queryExtWlTxRiskDetailByPrimaryKey(String id) throws Exception {
		
		ExtWlTxRiskDetailDTO dto = dao.findExtWlTxRiskDetailByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlTxRiskDetailDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlTxRiskDetail
     * @author Administrator
     * @description: 新增 腾讯_反欺诈服务_风险类型详情对象
     * @date 2017-12-18 15:24:26
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlTxRiskDetail(ExtWlTxRiskDetailDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlTxRiskDetail(paramMap);
		
		ExtWlTxRiskDetailDTO resultDto = (ExtWlTxRiskDetailDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlTxRiskDetail
     * @author Administrator
     * @description: 修改 腾讯_反欺诈服务_风险类型详情对象
     * @date 2017-12-18 15:24:26
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlTxRiskDetail(ExtWlTxRiskDetailDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlTxRiskDetail(paramMap);
	}
	/**
     * @title: deleteExtWlTxRiskDetailByPrimaryKey
     * @author Administrator
     * @description: 删除 腾讯_反欺诈服务_风险类型详情,按主键
     * @date 2017-12-18 15:24:26
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlTxRiskDetailByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlTxRiskDetailByPrimaryKey(paramMap);
	}

}

