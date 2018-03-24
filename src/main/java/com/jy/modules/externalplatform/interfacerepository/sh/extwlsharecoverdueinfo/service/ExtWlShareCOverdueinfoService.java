package com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecoverdueinfo.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecoverdueinfo.dto.ExtWlShareCOverdueinfoDTO;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecoverdueinfo.dao.ExtWlShareCOverdueinfoDao;

/**
 * @classname: ExtWlShareCOverdueinfoService
 * @description: 定义  算话共享报告_信贷信息概要（逾期及违约信息概要） 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecoverdueinfo.service.ExtWlShareCOverdueinfoService")
public class ExtWlShareCOverdueinfoService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlShareCOverdueinfoDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 算话共享报告_信贷信息概要（逾期及违约信息概要）列表
     * @date 2017-12-07 19:53:12
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlShareCOverdueinfoDTO> searchExtWlShareCOverdueinfoByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlShareCOverdueinfoDTO> dataList =  dao.searchExtWlShareCOverdueinfoByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话共享报告_信贷信息概要（逾期及违约信息概要）列表
     * @date 2017-12-07 19:53:12
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlShareCOverdueinfoDTO> searchExtWlShareCOverdueinfo(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlShareCOverdueinfoDTO> dataList = dao.searchExtWlShareCOverdueinfo(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话共享报告_信贷信息概要（逾期及违约信息概要）对象
     * @date 2017-12-07 19:53:12
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlShareCOverdueinfoDTO queryExtWlShareCOverdueinfoByPrimaryKey(String id) throws Exception {
		
		ExtWlShareCOverdueinfoDTO dto = dao.findExtWlShareCOverdueinfoByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlShareCOverdueinfoDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlShareCOverdueinfo
     * @author Administrator
     * @description: 新增 算话共享报告_信贷信息概要（逾期及违约信息概要）对象
     * @date 2017-12-07 19:53:12
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlShareCOverdueinfo(ExtWlShareCOverdueinfoDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlShareCOverdueinfo(paramMap);
		
		ExtWlShareCOverdueinfoDTO resultDto = (ExtWlShareCOverdueinfoDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlShareCOverdueinfo
     * @author Administrator
     * @description: 修改 算话共享报告_信贷信息概要（逾期及违约信息概要）对象
     * @date 2017-12-07 19:53:12
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlShareCOverdueinfo(ExtWlShareCOverdueinfoDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlShareCOverdueinfo(paramMap);
	}
	/**
     * @title: deleteExtWlShareCOverdueinfoByPrimaryKey
     * @author Administrator
     * @description: 删除 算话共享报告_信贷信息概要（逾期及违约信息概要）,按主键
     * @date 2017-12-07 19:53:12
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlShareCOverdueinfoByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlShareCOverdueinfoByPrimaryKey(paramMap);
	}

}

