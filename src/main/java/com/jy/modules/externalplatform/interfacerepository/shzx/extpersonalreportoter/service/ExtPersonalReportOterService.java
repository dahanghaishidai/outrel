package com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportoter.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportoter.dao.ExtPersonalReportOterDao;
import com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportoter.dto.ExtPersonalReportOterDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtPersonalReportOterService
 * @description: 定义  网络金融版个人信用报告-为他人担保 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportoter.service.ExtPersonalReportOterService")
public class ExtPersonalReportOterService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtPersonalReportOterDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 网络金融版个人信用报告-为他人担保列表
     * @date 2017-06-05 10:08:51
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtPersonalReportOterDTO> searchExtPersonalReportOterByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtPersonalReportOterDTO> dataList =  dao.searchExtPersonalReportOterByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询网络金融版个人信用报告-为他人担保列表
     * @date 2017-06-05 10:08:51
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtPersonalReportOterDTO> searchExtPersonalReportOter(Map<String,Object> searchParams) throws Exception {
	    List<ExtPersonalReportOterDTO> dataList = dao.searchExtPersonalReportOter(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询网络金融版个人信用报告-为他人担保对象
     * @date 2017-06-05 10:08:51
     * @param id
     * @return
     * @throws
     */ 
	public ExtPersonalReportOterDTO queryExtPersonalReportOterByPrimaryKey(String id) throws Exception {
		
		ExtPersonalReportOterDTO dto = dao.findExtPersonalReportOterByPrimaryKey(id);
		
		if(dto == null) dto = new ExtPersonalReportOterDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtPersonalReportOter
     * @author Administrator
     * @description: 新增 网络金融版个人信用报告-为他人担保对象
     * @date 2017-06-05 10:08:51
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtPersonalReportOter(ExtPersonalReportOterDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtPersonalReportOter(paramMap);
		
		ExtPersonalReportOterDTO resultDto = (ExtPersonalReportOterDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtPersonalReportOter
     * @author Administrator
     * @description: 修改 网络金融版个人信用报告-为他人担保对象
     * @date 2017-06-05 10:08:51
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtPersonalReportOter(ExtPersonalReportOterDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtPersonalReportOter(paramMap);
	}
	/**
     * @title: deleteExtPersonalReportOterByPrimaryKey
     * @author Administrator
     * @description: 删除 网络金融版个人信用报告-为他人担保,按主键
     * @date 2017-06-05 10:08:51
     * @param paramMap
     * @throws
     */ 
	public void deleteExtPersonalReportOterByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtPersonalReportOterByPrimaryKey(paramMap);
	}

}

