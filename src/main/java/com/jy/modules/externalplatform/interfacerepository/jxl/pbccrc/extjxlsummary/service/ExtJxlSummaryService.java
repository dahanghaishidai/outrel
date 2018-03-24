package com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlsummary.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlsummary.dao.ExtJxlSummaryDao;
import com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlsummary.dto.ExtJxlSummaryDTO;

/**
 * @classname: ExtJxlSummaryService
 * @description: 定义  聚信立央行征信报告（汇总信息表） 实现类
 * @author:  dell
 */
@Service("com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlsummary.service.ExtJxlSummaryService")
public class ExtJxlSummaryService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtJxlSummaryDao dao;

	/**
     * @author dell
     * @description: 按条件查询聚信立央行征信报告（汇总信息表）列表
     * @date 2017-08-24 21:00:37
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtJxlSummaryDTO> searchExtJxlSummary(Map<String,Object> searchParams) throws Exception {
	    List<ExtJxlSummaryDTO> dataList = dao.searchExtJxlSummary(searchParams);
        return dataList;
    }

	/**
	* @title: insertExtJxlSummaryList
	* @description: 批量新增 聚信立央行征信报告（汇总信息表）对象
	* @date 2017年8月31日 上午10:32:56
	* @param dataList
	* @param fkReportId
	* @throws Exception
	* @throws 
	*/ 
	@SuppressWarnings("all")
	public void insertExtJxlSummaryList(List<ExtJxlSummaryDTO> dataList ,Long fkReportId) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dtoList", dataList);
		paramMap.put("fkReportId", fkReportId);
		dao.insertExtJxlSummaryList(paramMap);
	}

}

