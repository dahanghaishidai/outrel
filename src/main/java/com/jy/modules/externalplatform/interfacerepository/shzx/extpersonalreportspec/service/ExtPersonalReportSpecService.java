package com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportspec.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportspec.dao.ExtPersonalReportSpecDao;
import com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportspec.dto.ExtPersonalReportSpecDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtPersonalReportSpecService
 * @description: 定义  网络金融版个人信用报告-特殊交易信息 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportspec.service.ExtPersonalReportSpecService")
public class ExtPersonalReportSpecService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtPersonalReportSpecDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 网络金融版个人信用报告-特殊交易信息列表
     * @date 2017-06-05 10:08:39
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtPersonalReportSpecDTO> searchExtPersonalReportSpecByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtPersonalReportSpecDTO> dataList =  dao.searchExtPersonalReportSpecByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询网络金融版个人信用报告-特殊交易信息列表
     * @date 2017-06-05 10:08:39
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtPersonalReportSpecDTO> searchExtPersonalReportSpec(Map<String,Object> searchParams) throws Exception {
	    List<ExtPersonalReportSpecDTO> dataList = dao.searchExtPersonalReportSpec(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询网络金融版个人信用报告-特殊交易信息对象
     * @date 2017-06-05 10:08:39
     * @param id
     * @return
     * @throws
     */ 
	public ExtPersonalReportSpecDTO queryExtPersonalReportSpecByPrimaryKey(String id) throws Exception {
		
		ExtPersonalReportSpecDTO dto = dao.findExtPersonalReportSpecByPrimaryKey(id);
		
		if(dto == null) dto = new ExtPersonalReportSpecDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtPersonalReportSpec
     * @author Administrator
     * @description: 新增 网络金融版个人信用报告-特殊交易信息对象
     * @date 2017-06-05 10:08:39
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtPersonalReportSpec(ExtPersonalReportSpecDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtPersonalReportSpec(paramMap);
		
		ExtPersonalReportSpecDTO resultDto = (ExtPersonalReportSpecDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtPersonalReportSpec
     * @author Administrator
     * @description: 修改 网络金融版个人信用报告-特殊交易信息对象
     * @date 2017-06-05 10:08:39
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtPersonalReportSpec(ExtPersonalReportSpecDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtPersonalReportSpec(paramMap);
	}
	/**
     * @title: deleteExtPersonalReportSpecByPrimaryKey
     * @author Administrator
     * @description: 删除 网络金融版个人信用报告-特殊交易信息,按主键
     * @date 2017-06-05 10:08:39
     * @param paramMap
     * @throws
     */ 
	public void deleteExtPersonalReportSpecByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtPersonalReportSpecByPrimaryKey(paramMap);
	}

}

