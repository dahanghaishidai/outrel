package com.jy.modules.externalplatform.interfacerepository.zc.extwlzcloanrecords.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcloanrecords.dto.ExtWlZcLoanRecordsDTO;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcloanrecords.dao.ExtWlZcLoanRecordsDao;

/**
 * @classname: ExtWlZcLoanRecordsService
 * @description: 定义  致诚借款记录历史表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.zc.extwlzcloanrecords.service.ExtWlZcLoanRecordsService")
public class ExtWlZcLoanRecordsService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlZcLoanRecordsDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 致诚借款记录历史表列表
     * @date 2017-12-07 13:40:21
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlZcLoanRecordsDTO> searchExtWlZcLoanRecordsByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlZcLoanRecordsDTO> dataList =  dao.searchExtWlZcLoanRecordsByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询致诚借款记录历史表列表
     * @date 2017-12-07 13:40:21
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlZcLoanRecordsDTO> searchExtWlZcLoanRecords(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlZcLoanRecordsDTO> dataList = dao.searchExtWlZcLoanRecords(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询致诚借款记录历史表对象
     * @date 2017-12-07 13:40:21
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlZcLoanRecordsDTO queryExtWlZcLoanRecordsByPrimaryKey(String id) throws Exception {
		
		ExtWlZcLoanRecordsDTO dto = dao.findExtWlZcLoanRecordsByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlZcLoanRecordsDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlZcLoanRecords
     * @author Administrator
     * @description: 新增 致诚借款记录历史表对象
     * @date 2017-12-07 13:40:21
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlZcLoanRecords(ExtWlZcLoanRecordsDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlZcLoanRecords(paramMap);
		
		ExtWlZcLoanRecordsDTO resultDto = (ExtWlZcLoanRecordsDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlZcLoanRecords
     * @author Administrator
     * @description: 修改 致诚借款记录历史表对象
     * @date 2017-12-07 13:40:21
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlZcLoanRecords(ExtWlZcLoanRecordsDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlZcLoanRecords(paramMap);
	}
	/**
     * @title: deleteExtWlZcLoanRecordsByPrimaryKey
     * @author Administrator
     * @description: 删除 致诚借款记录历史表,按主键
     * @date 2017-12-07 13:40:21
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlZcLoanRecordsByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlZcLoanRecordsByPrimaryKey(paramMap);
	}
    public void batchInsertLoanRecords(List<ExtWlZcLoanRecordsDTO> loanRecordsList) {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("loanRecordsList", loanRecordsList);       
        dao.batchInsertLoanRecords(paramMap);
    }

}

