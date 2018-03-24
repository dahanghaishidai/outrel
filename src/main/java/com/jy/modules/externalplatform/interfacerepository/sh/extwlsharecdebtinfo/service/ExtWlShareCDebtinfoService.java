package com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecdebtinfo.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecdebtinfo.dto.ExtWlShareCDebtinfoDTO;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecdebtinfo.dao.ExtWlShareCDebtinfoDao;

/**
 * @classname: ExtWlShareCDebtinfoService
 * @description: 定义  算话共享报告_信贷信息概要（授信及负债信息概要） 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecdebtinfo.service.ExtWlShareCDebtinfoService")
public class ExtWlShareCDebtinfoService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlShareCDebtinfoDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 算话共享报告_信贷信息概要（授信及负债信息概要）列表
     * @date 2017-12-07 19:53:17
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlShareCDebtinfoDTO> searchExtWlShareCDebtinfoByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlShareCDebtinfoDTO> dataList =  dao.searchExtWlShareCDebtinfoByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话共享报告_信贷信息概要（授信及负债信息概要）列表
     * @date 2017-12-07 19:53:17
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlShareCDebtinfoDTO> searchExtWlShareCDebtinfo(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlShareCDebtinfoDTO> dataList = dao.searchExtWlShareCDebtinfo(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话共享报告_信贷信息概要（授信及负债信息概要）对象
     * @date 2017-12-07 19:53:17
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlShareCDebtinfoDTO queryExtWlShareCDebtinfoByPrimaryKey(String id) throws Exception {
		
		ExtWlShareCDebtinfoDTO dto = dao.findExtWlShareCDebtinfoByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlShareCDebtinfoDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlShareCDebtinfo
     * @author Administrator
     * @description: 新增 算话共享报告_信贷信息概要（授信及负债信息概要）对象
     * @date 2017-12-07 19:53:17
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlShareCDebtinfo(ExtWlShareCDebtinfoDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlShareCDebtinfo(paramMap);
		
		ExtWlShareCDebtinfoDTO resultDto = (ExtWlShareCDebtinfoDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlShareCDebtinfo
     * @author Administrator
     * @description: 修改 算话共享报告_信贷信息概要（授信及负债信息概要）对象
     * @date 2017-12-07 19:53:17
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlShareCDebtinfo(ExtWlShareCDebtinfoDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlShareCDebtinfo(paramMap);
	}
	/**
     * @title: deleteExtWlShareCDebtinfoByPrimaryKey
     * @author Administrator
     * @description: 删除 算话共享报告_信贷信息概要（授信及负债信息概要）,按主键
     * @date 2017-12-07 19:53:17
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlShareCDebtinfoByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlShareCDebtinfoByPrimaryKey(paramMap);
	}

    /**
     * @title: insertExtWlShareCDebtinfoList
     * @author: dongkangning
     * @description: 批量新增 算话共享报告_信贷信息概要（未结清贷款信息汇总）列表
     * @date 2017年12月8日 上午10:45:31
     * @param debtInfoList
     * @param fkReportId
     * @return
     * @throws
     */
    public long insertExtWlShareCDebtinfoList(List<ExtWlShareCDebtinfoDTO> debtInfoList, Long fkReportId) {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("dtoList", debtInfoList);
        paramMap.put("fkReportId", fkReportId);
        int count = dao.insertExtWlShareCDebtinfoList(paramMap);
        return (long) count;
    }

}

