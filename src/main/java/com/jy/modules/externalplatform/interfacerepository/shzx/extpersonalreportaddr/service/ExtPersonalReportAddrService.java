package com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportaddr.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportaddr.dao.ExtPersonalReportAddrDao;
import com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportaddr.dto.ExtPersonalReportAddrDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtPersonalReportAddrService
 * @description: 定义  网络金融版个人信用报告-地址 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportaddr.service.ExtPersonalReportAddrService")
public class ExtPersonalReportAddrService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtPersonalReportAddrDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 网络金融版个人信用报告-地址列表
     * @date 2017-06-05 10:08:24
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtPersonalReportAddrDTO> searchExtPersonalReportAddrByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtPersonalReportAddrDTO> dataList =  dao.searchExtPersonalReportAddrByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询网络金融版个人信用报告-地址列表
     * @date 2017-06-05 10:08:24
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtPersonalReportAddrDTO> searchExtPersonalReportAddr(Map<String,Object> searchParams) throws Exception {
	    List<ExtPersonalReportAddrDTO> dataList = dao.searchExtPersonalReportAddr(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询网络金融版个人信用报告-地址对象
     * @date 2017-06-05 10:08:24
     * @param id
     * @return
     * @throws
     */ 
	public ExtPersonalReportAddrDTO queryExtPersonalReportAddrByPrimaryKey(String id) throws Exception {
		
		ExtPersonalReportAddrDTO dto = dao.findExtPersonalReportAddrByPrimaryKey(id);
		
		if(dto == null) dto = new ExtPersonalReportAddrDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtPersonalReportAddr
     * @author Administrator
     * @description: 新增 网络金融版个人信用报告-地址对象
     * @date 2017-06-05 10:08:24
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtPersonalReportAddr(ExtPersonalReportAddrDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtPersonalReportAddr(paramMap);
		
		ExtPersonalReportAddrDTO resultDto = (ExtPersonalReportAddrDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtPersonalReportAddr
     * @author Administrator
     * @description: 修改 网络金融版个人信用报告-地址对象
     * @date 2017-06-05 10:08:24
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtPersonalReportAddr(ExtPersonalReportAddrDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtPersonalReportAddr(paramMap);
	}
	/**
     * @title: deleteExtPersonalReportAddrByPrimaryKey
     * @author Administrator
     * @description: 删除 网络金融版个人信用报告-地址,按主键
     * @date 2017-06-05 10:08:24
     * @param paramMap
     * @throws
     */ 
	public void deleteExtPersonalReportAddrByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtPersonalReportAddrByPrimaryKey(paramMap);
	}

}

