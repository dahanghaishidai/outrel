package com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlqrecord.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlqrecord.dao.ExtJxlQrecordDao;
import com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlqrecord.dto.ExtJxlQrecordDTO;

/**
 * @classname: ExtJxlQrecordService
 * @description: 定义  聚信立央行征信报告（查询记录信息表） 实现类
 * @author:  dell
 */
@Service("com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlqrecord.service.ExtJxlQrecordService")
public class ExtJxlQrecordService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtJxlQrecordDao dao;

	/**
     * @author dell
     * @description: 按条件查询聚信立央行征信报告（查询记录信息表）列表
     * @date 2017-08-24 21:00:21
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtJxlQrecordDTO> searchExtJxlQrecord(Map<String,Object> searchParams) throws Exception {
	    List<ExtJxlQrecordDTO> dataList = dao.searchExtJxlQrecord(searchParams);
        return dataList;
    }


	/**
	* @title: insertExtJxlQrecordList
	* @description: 批量新增 聚信立央行征信报告（查询记录信息表）列表
	* @date 2017年8月31日 上午11:19:46
	* @param dataList
	* @param fkReportId
	* @throws Exception
	* @throws 
	*/ 
	@SuppressWarnings("all")
	public void insertExtJxlQrecordList(List<ExtJxlQrecordDTO> dataList,Long fkReportId) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dtoList", dataList);
		paramMap.put("fkReportId", fkReportId);
		dao.insertExtJxlQrecordList(paramMap);
	}

}

