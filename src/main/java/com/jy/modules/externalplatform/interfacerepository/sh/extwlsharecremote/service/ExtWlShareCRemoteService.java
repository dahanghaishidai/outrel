package com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecremote.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecremote.dto.ExtWlShareCRemoteDTO;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecremote.dao.ExtWlShareCRemoteDao;

/**
 * @classname: ExtWlShareCRemoteService
 * @description: 定义  算话共享报告_信贷信息概要（长期未更新信贷信息概要） 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecremote.service.ExtWlShareCRemoteService")
public class ExtWlShareCRemoteService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlShareCRemoteDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 算话共享报告_信贷信息概要（长期未更新信贷信息概要）列表
     * @date 2017-12-07 19:53:22
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlShareCRemoteDTO> searchExtWlShareCRemoteByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlShareCRemoteDTO> dataList =  dao.searchExtWlShareCRemoteByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话共享报告_信贷信息概要（长期未更新信贷信息概要）列表
     * @date 2017-12-07 19:53:22
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlShareCRemoteDTO> searchExtWlShareCRemote(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlShareCRemoteDTO> dataList = dao.searchExtWlShareCRemote(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话共享报告_信贷信息概要（长期未更新信贷信息概要）对象
     * @date 2017-12-07 19:53:22
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlShareCRemoteDTO queryExtWlShareCRemoteByPrimaryKey(String id) throws Exception {
		
		ExtWlShareCRemoteDTO dto = dao.findExtWlShareCRemoteByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlShareCRemoteDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlShareCRemote
     * @author Administrator
     * @description: 新增 算话共享报告_信贷信息概要（长期未更新信贷信息概要）对象
     * @date 2017-12-07 19:53:22
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlShareCRemote(ExtWlShareCRemoteDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlShareCRemote(paramMap);
		
		ExtWlShareCRemoteDTO resultDto = (ExtWlShareCRemoteDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlShareCRemote
     * @author Administrator
     * @description: 修改 算话共享报告_信贷信息概要（长期未更新信贷信息概要）对象
     * @date 2017-12-07 19:53:22
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlShareCRemote(ExtWlShareCRemoteDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlShareCRemote(paramMap);
	}
	/**
     * @title: deleteExtWlShareCRemoteByPrimaryKey
     * @author Administrator
     * @description: 删除 算话共享报告_信贷信息概要（长期未更新信贷信息概要）,按主键
     * @date 2017-12-07 19:53:22
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlShareCRemoteByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlShareCRemoteByPrimaryKey(paramMap);
	}

}

