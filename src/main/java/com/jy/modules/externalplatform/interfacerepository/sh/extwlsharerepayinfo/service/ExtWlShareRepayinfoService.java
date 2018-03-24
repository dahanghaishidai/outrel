package com.jy.modules.externalplatform.interfacerepository.sh.extwlsharerepayinfo.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharerepayinfo.dto.ExtWlShareRepayinfoDTO;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharerepayinfo.dao.ExtWlShareRepayinfoDao;

/**
 * @classname: ExtWlShareRepayinfoService
 * @description: 定义  算话共享报告_近24期还款记录 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.sh.extwlsharerepayinfo.service.ExtWlShareRepayinfoService")
public class ExtWlShareRepayinfoService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlShareRepayinfoDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 算话共享报告_近24期还款记录列表
     * @date 2017-12-07 19:53:32
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlShareRepayinfoDTO> searchExtWlShareRepayinfoByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlShareRepayinfoDTO> dataList =  dao.searchExtWlShareRepayinfoByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话共享报告_近24期还款记录列表
     * @date 2017-12-07 19:53:32
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlShareRepayinfoDTO> searchExtWlShareRepayinfo(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlShareRepayinfoDTO> dataList = dao.searchExtWlShareRepayinfo(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话共享报告_近24期还款记录对象
     * @date 2017-12-07 19:53:32
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlShareRepayinfoDTO queryExtWlShareRepayinfoByPrimaryKey(String id) throws Exception {
		
		ExtWlShareRepayinfoDTO dto = dao.findExtWlShareRepayinfoByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlShareRepayinfoDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlShareRepayinfo
     * @author Administrator
     * @description: 新增 算话共享报告_近24期还款记录对象
     * @date 2017-12-07 19:53:32
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlShareRepayinfo(ExtWlShareRepayinfoDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlShareRepayinfo(paramMap);
		
		ExtWlShareRepayinfoDTO resultDto = (ExtWlShareRepayinfoDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlShareRepayinfo
     * @author Administrator
     * @description: 修改 算话共享报告_近24期还款记录对象
     * @date 2017-12-07 19:53:32
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlShareRepayinfo(ExtWlShareRepayinfoDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlShareRepayinfo(paramMap);
	}
	/**
     * @title: deleteExtWlShareRepayinfoByPrimaryKey
     * @author Administrator
     * @description: 删除 算话共享报告_近24期还款记录,按主键
     * @date 2017-12-07 19:53:32
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlShareRepayinfoByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlShareRepayinfoByPrimaryKey(paramMap);
	}

}

