package com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlguarantee.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlguarantee.dao.ExtJxlGuaranteeDao;
import com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlguarantee.dto.ExtJxlGuaranteeDTO;

/**
 * @classname: ExtJxlGuaranteeService
 * @description: 定义  聚信立央行征信报告（担保信息表） 实现类
 * @author:  dell
 */
@Service("com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlguarantee.service.ExtJxlGuaranteeService")
public class ExtJxlGuaranteeService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtJxlGuaranteeDao dao;

	/**
     * @author dell
     * @description: 按条件查询聚信立央行征信报告（担保信息表）列表
     * @date 2017-08-24 21:00:10
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtJxlGuaranteeDTO> searchExtJxlGuarantee(Map<String,Object> searchParams) throws Exception {
	    List<ExtJxlGuaranteeDTO> dataList = dao.searchExtJxlGuarantee(searchParams);
        return dataList;
    }

	/**
	* @title: insertExtJxlGuaranteeList
	* @description: 批量新增 聚信立央行征信报告（担保信息表）对象
	* @date 2017年8月31日 上午9:31:00
	* @param dataList
	* @param fkReportId
	* @throws Exception
	* @throws 
	*/ 
	@SuppressWarnings("all")
	public void insertExtJxlGuaranteeList(List<ExtJxlGuaranteeDTO> dataList,Long fkReportId) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dtoList", dataList);
		paramMap.put("fkReportId", fkReportId);
		dao.insertExtJxlGuaranteeList(paramMap);
	}
}

