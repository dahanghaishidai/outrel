package com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlloaninfo.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlloaninfo.dao.ExtJxlLoanInfoDao;
import com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlloaninfo.dto.ExtJxlLoanInfoDTO;

/**
 * @classname: ExtJxlLoanInfoService
 * @description: 定义  聚信立央行征信报告（贷款信息表） 实现类
 * @author:  dell
 */
@Service("com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlloaninfo.service.ExtJxlLoanInfoService")
public class ExtJxlLoanInfoService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtJxlLoanInfoDao dao;

	/**
     * @author dell
     * @description: 按条件查询聚信立央行征信报告（贷款信息表）列表
     * @date 2017-08-24 20:59:39
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtJxlLoanInfoDTO> searchExtJxlLoanInfo(Map<String,Object> searchParams) throws Exception {
	    List<ExtJxlLoanInfoDTO> dataList = dao.searchExtJxlLoanInfo(searchParams);
        return dataList;
    }


	/**
	* @title: insertExtJxlLoanInfoList
	* @description:批量新增 聚信立央行征信报告（贷款信息表）对象
	* @date 2017年8月30日 下午4:13:15
	* @param dataList
	* @param fkReportId
	* @throws Exception
	* @throws 
	*/ 
	@SuppressWarnings("all")
	public void insertExtJxlLoanInfoList(List<ExtJxlLoanInfoDTO> dataList,Long fkReportId) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dtoList", dataList);
		paramMap.put("fkReportId", fkReportId);
		dao.insertExtJxlLoanInfoList(paramMap);
	}

}

