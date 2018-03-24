package com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportcred.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportcred.dao.ExtPersonalReportCredDao;
import com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportcred.dto.ExtPersonalReportCredDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtPersonalReportCredService
 * @description: 定义  网络金融版个人信用报告-贷款 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportcred.service.ExtPersonalReportCredService")
public class ExtPersonalReportCredService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtPersonalReportCredDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 网络金融版个人信用报告-贷款列表
     * @date 2017-06-05 10:08:09
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtPersonalReportCredDTO> searchExtPersonalReportCredByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtPersonalReportCredDTO> dataList =  dao.searchExtPersonalReportCredByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询网络金融版个人信用报告-贷款列表
     * @date 2017-06-05 10:08:09
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtPersonalReportCredDTO> searchExtPersonalReportCred(Map<String,Object> searchParams) throws Exception {
	    List<ExtPersonalReportCredDTO> dataList = dao.searchExtPersonalReportCred(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询网络金融版个人信用报告-贷款对象
     * @date 2017-06-05 10:08:09
     * @param id
     * @return
     * @throws
     */ 
	public ExtPersonalReportCredDTO queryExtPersonalReportCredByPrimaryKey(String id) throws Exception {
		
		ExtPersonalReportCredDTO dto = dao.findExtPersonalReportCredByPrimaryKey(id);
		
		if(dto == null) dto = new ExtPersonalReportCredDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtPersonalReportCred
     * @author Administrator
     * @description: 新增 网络金融版个人信用报告-贷款对象
     * @date 2017-06-05 10:08:09
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtPersonalReportCred(ExtPersonalReportCredDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtPersonalReportCred(paramMap);
		
		ExtPersonalReportCredDTO resultDto = (ExtPersonalReportCredDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtPersonalReportCred
     * @author Administrator
     * @description: 修改 网络金融版个人信用报告-贷款对象
     * @date 2017-06-05 10:08:09
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtPersonalReportCred(ExtPersonalReportCredDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtPersonalReportCred(paramMap);
	}
	/**
     * @title: deleteExtPersonalReportCredByPrimaryKey
     * @author Administrator
     * @description: 删除 网络金融版个人信用报告-贷款,按主键
     * @date 2017-06-05 10:08:09
     * @param paramMap
     * @throws
     */ 
	public void deleteExtPersonalReportCredByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtPersonalReportCredByPrimaryKey(paramMap);
	}

}

