package com.jy.modules.externalplatform.interfacerepository.sh.extwlsharepaddresses.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharepaddresses.dto.ExtWlSharePAddressesDTO;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharepaddresses.dao.ExtWlSharePAddressesDao;

/**
 * @classname: ExtWlSharePAddressesService
 * @description: 定义  算话共享报告_身份信息概要（通讯地址信息） 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.sh.extwlsharepaddresses.service.ExtWlSharePAddressesService")
public class ExtWlSharePAddressesService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlSharePAddressesDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 算话共享报告_身份信息概要（通讯地址信息）列表
     * @date 2017-12-07 19:52:53
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlSharePAddressesDTO> searchExtWlSharePAddressesByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlSharePAddressesDTO> dataList =  dao.searchExtWlSharePAddressesByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话共享报告_身份信息概要（通讯地址信息）列表
     * @date 2017-12-07 19:52:53
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlSharePAddressesDTO> searchExtWlSharePAddresses(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlSharePAddressesDTO> dataList = dao.searchExtWlSharePAddresses(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话共享报告_身份信息概要（通讯地址信息）对象
     * @date 2017-12-07 19:52:53
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlSharePAddressesDTO queryExtWlSharePAddressesByPrimaryKey(String id) throws Exception {
		
		ExtWlSharePAddressesDTO dto = dao.findExtWlSharePAddressesByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlSharePAddressesDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlSharePAddresses
     * @author Administrator
     * @description: 新增 算话共享报告_身份信息概要（通讯地址信息）对象
     * @date 2017-12-07 19:52:53
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlSharePAddresses(ExtWlSharePAddressesDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlSharePAddresses(paramMap);
		
		ExtWlSharePAddressesDTO resultDto = (ExtWlSharePAddressesDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlSharePAddresses
     * @author Administrator
     * @description: 修改 算话共享报告_身份信息概要（通讯地址信息）对象
     * @date 2017-12-07 19:52:53
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlSharePAddresses(ExtWlSharePAddressesDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlSharePAddresses(paramMap);
	}
	/**
     * @title: deleteExtWlSharePAddressesByPrimaryKey
     * @author Administrator
     * @description: 删除 算话共享报告_身份信息概要（通讯地址信息）,按主键
     * @date 2017-12-07 19:52:53
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlSharePAddressesByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlSharePAddressesByPrimaryKey(paramMap);
	}

    /**
     * @title: insertExtWlSharePAddressesList
     * @author: dongkangning
     * @description: 批量新增 算话共享报告_身份信息概要（通讯地址信息）列表
     * @date 2017年12月8日 上午10:02:11
     * @param addressesList
     * @param fkReportId
     * @return
     * @throws
     */
    public long insertExtWlSharePAddressesList(List<ExtWlSharePAddressesDTO> addressesList, Long fkReportId) {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("dtoList", addressesList);
        paramMap.put("fkReportId", fkReportId);
        int count = dao.insertExtWlSharePAddressesList(paramMap);
        return (long) count;
    }

}

