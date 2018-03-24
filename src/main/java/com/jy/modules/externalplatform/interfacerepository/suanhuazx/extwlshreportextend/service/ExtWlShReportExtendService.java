package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshreportextend.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshreportextend.dto.ExtWlShReportExtendDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshreportextend.dao.ExtWlShReportExtendDao;

/**
 * @classname: ExtWlShReportExtendService
 * @description: 定义  算话人行报告扩展字段表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshreportextend.service.ExtWlShReportExtendService")
public class ExtWlShReportExtendService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlShReportExtendDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 算话人行报告扩展字段表列表
     * @date 2017-12-21 19:52:26
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlShReportExtendDTO> searchExtWlShReportExtendByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlShReportExtendDTO> dataList =  dao.searchExtWlShReportExtendByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话人行报告扩展字段表列表
     * @date 2017-12-21 19:52:26
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlShReportExtendDTO> searchExtWlShReportExtend(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlShReportExtendDTO> dataList = dao.searchExtWlShReportExtend(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话人行报告扩展字段表对象
     * @date 2017-12-21 19:52:26
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlShReportExtendDTO queryExtWlShReportExtendByPrimaryKey(String id) throws Exception {
		
		ExtWlShReportExtendDTO dto = dao.findExtWlShReportExtendByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlShReportExtendDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlShReportExtend
     * @author Administrator
     * @description: 新增 算话人行报告扩展字段表对象
     * @date 2017-12-21 19:52:26
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlShReportExtend(ExtWlShReportExtendDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlShReportExtend(paramMap);
		
		ExtWlShReportExtendDTO resultDto = (ExtWlShReportExtendDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlShReportExtend
     * @author Administrator
     * @description: 修改 算话人行报告扩展字段表对象
     * @date 2017-12-21 19:52:26
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlShReportExtend(ExtWlShReportExtendDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlShReportExtend(paramMap);
	}
	/**
     * @title: deleteExtWlShReportExtendByPrimaryKey
     * @author Administrator
     * @description: 删除 算话人行报告扩展字段表,按主键
     * @date 2017-12-21 19:52:26
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlShReportExtendByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlShReportExtendByPrimaryKey(paramMap);
	}

}

