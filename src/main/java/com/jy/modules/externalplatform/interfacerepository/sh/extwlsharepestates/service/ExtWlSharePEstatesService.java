package com.jy.modules.externalplatform.interfacerepository.sh.extwlsharepestates.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharepestates.dto.ExtWlSharePEstatesDTO;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharepestates.dao.ExtWlSharePEstatesDao;

/**
 * @classname: ExtWlSharePEstatesService
 * @description: 定义  算话共享报告_身份信息概要(居住地址信息) 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.sh.extwlsharepestates.service.ExtWlSharePEstatesService")
public class ExtWlSharePEstatesService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlSharePEstatesDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 算话共享报告_身份信息概要(居住地址信息)列表
     * @date 2017-12-07 19:53:02
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlSharePEstatesDTO> searchExtWlSharePEstatesByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlSharePEstatesDTO> dataList =  dao.searchExtWlSharePEstatesByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话共享报告_身份信息概要(居住地址信息)列表
     * @date 2017-12-07 19:53:02
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlSharePEstatesDTO> searchExtWlSharePEstates(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlSharePEstatesDTO> dataList = dao.searchExtWlSharePEstates(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话共享报告_身份信息概要(居住地址信息)对象
     * @date 2017-12-07 19:53:02
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlSharePEstatesDTO queryExtWlSharePEstatesByPrimaryKey(String id) throws Exception {
		
		ExtWlSharePEstatesDTO dto = dao.findExtWlSharePEstatesByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlSharePEstatesDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlSharePEstates
     * @author Administrator
     * @description: 新增 算话共享报告_身份信息概要(居住地址信息)对象
     * @date 2017-12-07 19:53:02
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlSharePEstates(ExtWlSharePEstatesDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlSharePEstates(paramMap);
		
		ExtWlSharePEstatesDTO resultDto = (ExtWlSharePEstatesDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlSharePEstates
     * @author Administrator
     * @description: 修改 算话共享报告_身份信息概要(居住地址信息)对象
     * @date 2017-12-07 19:53:02
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlSharePEstates(ExtWlSharePEstatesDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlSharePEstates(paramMap);
	}
	/**
     * @title: deleteExtWlSharePEstatesByPrimaryKey
     * @author Administrator
     * @description: 删除 算话共享报告_身份信息概要(居住地址信息),按主键
     * @date 2017-12-07 19:53:02
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlSharePEstatesByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlSharePEstatesByPrimaryKey(paramMap);
	}

    /**
     * @title: insertExtWlSharePEstatesList
     * @author: dongkangning
     * @description: 批量新增 算话共享报告_居住地址信息列表
     * @date 2017年12月8日 上午10:04:46
     * @param estatesList
     * @param fkReportId
     * @return
     * @throws
     */
    public long insertExtWlSharePEstatesList(List<ExtWlSharePEstatesDTO> estatesList, Long fkReportId) {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("dtoList", estatesList);
        paramMap.put("fkReportId", fkReportId); 
        int count = dao.insertExtWlSharePEstatesList(paramMap);
        return (long) count;
    }

}

