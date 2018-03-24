package com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecreditdetail.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecreditdetail.dto.ExtWlShareCreditDetailDTO;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecreditdetail.dao.ExtWlShareCreditDetailDao;

/**
 * @classname: ExtWlShareCreditDetailService
 * @description: 定义  算话共享报告_信贷信息明细 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecreditdetail.service.ExtWlShareCreditDetailService")
public class ExtWlShareCreditDetailService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlShareCreditDetailDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 算话共享报告_信贷信息明细列表
     * @date 2017-12-07 19:53:26
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlShareCreditDetailDTO> searchExtWlShareCreditDetailByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlShareCreditDetailDTO> dataList =  dao.searchExtWlShareCreditDetailByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话共享报告_信贷信息明细列表
     * @date 2017-12-07 19:53:26
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlShareCreditDetailDTO> searchExtWlShareCreditDetail(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlShareCreditDetailDTO> dataList = dao.searchExtWlShareCreditDetail(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话共享报告_信贷信息明细对象
     * @date 2017-12-07 19:53:26
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlShareCreditDetailDTO queryExtWlShareCreditDetailByPrimaryKey(String id) throws Exception {
		
		ExtWlShareCreditDetailDTO dto = dao.findExtWlShareCreditDetailByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlShareCreditDetailDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlShareCreditDetail
     * @author Administrator
     * @description: 新增 算话共享报告_信贷信息明细对象
     * @date 2017-12-07 19:53:26
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlShareCreditDetail(ExtWlShareCreditDetailDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlShareCreditDetail(paramMap);
		
		ExtWlShareCreditDetailDTO resultDto = (ExtWlShareCreditDetailDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlShareCreditDetail
     * @author Administrator
     * @description: 修改 算话共享报告_信贷信息明细对象
     * @date 2017-12-07 19:53:26
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlShareCreditDetail(ExtWlShareCreditDetailDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlShareCreditDetail(paramMap);
	}
	/**
     * @title: deleteExtWlShareCreditDetailByPrimaryKey
     * @author Administrator
     * @description: 删除 算话共享报告_信贷信息明细,按主键
     * @date 2017-12-07 19:53:26
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlShareCreditDetailByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlShareCreditDetailByPrimaryKey(paramMap);
	}

}

