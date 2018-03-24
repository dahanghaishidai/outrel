package com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportsech.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportsech.dao.ExtPersonalReportSechDao;
import com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportsech.dto.ExtPersonalReportSechDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtPersonalReportSechService
 * @description: 定义  网络金融版个人信用报告-查询记录 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportsech.service.ExtPersonalReportSechService")
public class ExtPersonalReportSechService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtPersonalReportSechDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 网络金融版个人信用报告-查询记录列表
     * @date 2017-06-05 10:07:55
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtPersonalReportSechDTO> searchExtPersonalReportSechByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtPersonalReportSechDTO> dataList =  dao.searchExtPersonalReportSechByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询网络金融版个人信用报告-查询记录列表
     * @date 2017-06-05 10:07:55
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtPersonalReportSechDTO> searchExtPersonalReportSech(Map<String,Object> searchParams) throws Exception {
	    List<ExtPersonalReportSechDTO> dataList = dao.searchExtPersonalReportSech(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询网络金融版个人信用报告-查询记录对象
     * @date 2017-06-05 10:07:55
     * @param id
     * @return
     * @throws
     */ 
	public ExtPersonalReportSechDTO queryExtPersonalReportSechByPrimaryKey(String id) throws Exception {
		
		ExtPersonalReportSechDTO dto = dao.findExtPersonalReportSechByPrimaryKey(id);
		
		if(dto == null) dto = new ExtPersonalReportSechDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtPersonalReportSech
     * @author Administrator
     * @description: 新增 网络金融版个人信用报告-查询记录对象
     * @date 2017-06-05 10:07:55
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtPersonalReportSech(ExtPersonalReportSechDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtPersonalReportSech(paramMap);
		
		ExtPersonalReportSechDTO resultDto = (ExtPersonalReportSechDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtPersonalReportSech
     * @author Administrator
     * @description: 修改 网络金融版个人信用报告-查询记录对象
     * @date 2017-06-05 10:07:55
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtPersonalReportSech(ExtPersonalReportSechDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtPersonalReportSech(paramMap);
	}
	/**
     * @title: deleteExtPersonalReportSechByPrimaryKey
     * @author Administrator
     * @description: 删除 网络金融版个人信用报告-查询记录,按主键
     * @date 2017-06-05 10:07:55
     * @param paramMap
     * @throws
     */ 
	public void deleteExtPersonalReportSechByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtPersonalReportSechByPrimaryKey(paramMap);
	}

}

