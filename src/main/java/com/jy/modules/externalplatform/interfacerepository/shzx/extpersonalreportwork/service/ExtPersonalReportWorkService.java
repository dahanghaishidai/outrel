package com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportwork.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportwork.dao.ExtPersonalReportWorkDao;
import com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportwork.dto.ExtPersonalReportWorkDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtPersonalReportWorkService
 * @description: 定义  网络金融版个人信用报告-工作 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportwork.service.ExtPersonalReportWorkService")
public class ExtPersonalReportWorkService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtPersonalReportWorkDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 网络金融版个人信用报告-工作列表
     * @date 2017-06-05 10:09:01
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtPersonalReportWorkDTO> searchExtPersonalReportWorkByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtPersonalReportWorkDTO> dataList =  dao.searchExtPersonalReportWorkByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询网络金融版个人信用报告-工作列表
     * @date 2017-06-05 10:09:01
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtPersonalReportWorkDTO> searchExtPersonalReportWork(Map<String,Object> searchParams) throws Exception {
	    List<ExtPersonalReportWorkDTO> dataList = dao.searchExtPersonalReportWork(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询网络金融版个人信用报告-工作对象
     * @date 2017-06-05 10:09:01
     * @param id
     * @return
     * @throws
     */ 
	public ExtPersonalReportWorkDTO queryExtPersonalReportWorkByPrimaryKey(String id) throws Exception {
		
		ExtPersonalReportWorkDTO dto = dao.findExtPersonalReportWorkByPrimaryKey(id);
		
		if(dto == null) dto = new ExtPersonalReportWorkDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtPersonalReportWork
     * @author Administrator
     * @description: 新增 网络金融版个人信用报告-工作对象
     * @date 2017-06-05 10:09:01
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtPersonalReportWork(ExtPersonalReportWorkDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtPersonalReportWork(paramMap);
		
		ExtPersonalReportWorkDTO resultDto = (ExtPersonalReportWorkDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtPersonalReportWork
     * @author Administrator
     * @description: 修改 网络金融版个人信用报告-工作对象
     * @date 2017-06-05 10:09:01
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtPersonalReportWork(ExtPersonalReportWorkDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtPersonalReportWork(paramMap);
	}
	/**
     * @title: deleteExtPersonalReportWorkByPrimaryKey
     * @author Administrator
     * @description: 删除 网络金融版个人信用报告-工作,按主键
     * @date 2017-06-05 10:09:01
     * @param paramMap
     * @throws
     */ 
	public void deleteExtPersonalReportWorkByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtPersonalReportWorkByPrimaryKey(paramMap);
	}

}

