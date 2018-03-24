package com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanyopencourt.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanyopencourt.dao.ExtLawCompanyOpencourtDao;
import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanyopencourt.dto.ExtLawCompanyOpencourtDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtLawCompanyOpencourtService
 * @description: 定义  汇法网企业开庭公告信息表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanyopencourt.service.ExtLawCompanyOpencourtService")
public class ExtLawCompanyOpencourtService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtLawCompanyOpencourtDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 汇法网企业开庭公告信息表列表
     * @date 2017-06-01 10:11:56
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtLawCompanyOpencourtDTO> searchExtLawCompanyOpencourtByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtLawCompanyOpencourtDTO> dataList =  dao.searchExtLawCompanyOpencourtByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询汇法网企业开庭公告信息表列表
     * @date 2017-06-01 10:11:56
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtLawCompanyOpencourtDTO> searchExtLawCompanyOpencourt(Map<String,Object> searchParams) throws Exception {
	    List<ExtLawCompanyOpencourtDTO> dataList = dao.searchExtLawCompanyOpencourt(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询汇法网企业开庭公告信息表对象
     * @date 2017-06-01 10:11:56
     * @param id
     * @return
     * @throws
     */ 
	public ExtLawCompanyOpencourtDTO queryExtLawCompanyOpencourtByPrimaryKey(String id) throws Exception {
		
		ExtLawCompanyOpencourtDTO dto = dao.findExtLawCompanyOpencourtByPrimaryKey(id);
		
		if(dto == null) dto = new ExtLawCompanyOpencourtDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtLawCompanyOpencourt
     * @author Administrator
     * @description: 新增 汇法网企业开庭公告信息表对象
     * @date 2017-06-01 10:11:56
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtLawCompanyOpencourt(ExtLawCompanyOpencourtDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtLawCompanyOpencourt(paramMap);
		
		ExtLawCompanyOpencourtDTO resultDto = (ExtLawCompanyOpencourtDTO) paramMap.get("dto");
		Long keyId = resultDto.getKeyid();
		return keyId;
	}
	/**
     * @title: updateExtLawCompanyOpencourt
     * @author Administrator
     * @description: 修改 汇法网企业开庭公告信息表对象
     * @date 2017-06-01 10:11:56
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtLawCompanyOpencourt(ExtLawCompanyOpencourtDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtLawCompanyOpencourt(paramMap);
	}
	/**
     * @title: deleteExtLawCompanyOpencourtByPrimaryKey
     * @author Administrator
     * @description: 删除 汇法网企业开庭公告信息表,按主键
     * @date 2017-06-01 10:11:56
     * @param paramMap
     * @throws
     */ 
	public void deleteExtLawCompanyOpencourtByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtLawCompanyOpencourtByPrimaryKey(paramMap);
	}

}

