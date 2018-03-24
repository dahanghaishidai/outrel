package com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtloancountp.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtloancountp.dto.ExtWlZxtLoanCountPDTO;
import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtloancountp.dao.ExtWlZxtLoanCountPDao;

/**
 * @classname: ExtWlZxtLoanCountPService
 * @description: 定义  同业借贷申请次数(A501/A502/A503/B202) 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtloancountp.service.ExtWlZxtLoanCountPService")
public class ExtWlZxtLoanCountPService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlZxtLoanCountPDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 同业借贷申请次数(A501/A502/A503/B202)列表
     * @date 2017-12-18 16:03:04
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlZxtLoanCountPDTO> searchExtWlZxtLoanCountPByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlZxtLoanCountPDTO> dataList =  dao.searchExtWlZxtLoanCountPByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询同业借贷申请次数(A501/A502/A503/B202)列表
     * @date 2017-12-18 16:03:04
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlZxtLoanCountPDTO> searchExtWlZxtLoanCountP(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlZxtLoanCountPDTO> dataList = dao.searchExtWlZxtLoanCountP(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询同业借贷申请次数(A501/A502/A503/B202)对象
     * @date 2017-12-18 16:03:04
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlZxtLoanCountPDTO queryExtWlZxtLoanCountPByPrimaryKey(String id) throws Exception {
		
		ExtWlZxtLoanCountPDTO dto = dao.findExtWlZxtLoanCountPByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlZxtLoanCountPDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlZxtLoanCountP
     * @author Administrator
     * @description: 新增 同业借贷申请次数(A501/A502/A503/B202)对象
     * @date 2017-12-18 16:03:04
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlZxtLoanCountP(ExtWlZxtLoanCountPDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlZxtLoanCountP(paramMap);
		
		ExtWlZxtLoanCountPDTO resultDto = (ExtWlZxtLoanCountPDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlZxtLoanCountP
     * @author Administrator
     * @description: 修改 同业借贷申请次数(A501/A502/A503/B202)对象
     * @date 2017-12-18 16:03:04
     * @param dto
     * @return
     * @throws
     */
	public void updateExtWlZxtLoanCountP(ExtWlZxtLoanCountPDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlZxtLoanCountP(paramMap);
	}
	/**
     * @title: deleteExtWlZxtLoanCountPByPrimaryKey
     * @author Administrator
     * @description: 删除 同业借贷申请次数(A501/A502/A503/B202),按主键
     * @date 2017-12-18 16:03:04
     * @param baseDto, ids
     * @throws
     */ 
	public void deleteExtWlZxtLoanCountPByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlZxtLoanCountPByPrimaryKey(paramMap);
	}

}

