package com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlcreditcard.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlcreditcard.dao.ExtJxlCreditCardDao;
import com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlcreditcard.dto.ExtJxlCreditCardDTO;

/**
 * @classname: ExtJxlCreditCardService
 * @description: 定义  聚信立央行征信报告（信用卡信息表） 实现类
 * @author:  dell
 */
@Service("com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlcreditcard.service.ExtJxlCreditCardService")
public class ExtJxlCreditCardService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtJxlCreditCardDao dao;

	/**
     * @author dell
     * @description: 按条件查询聚信立央行征信报告（信用卡信息表）列表
     * @date 2017-08-24 20:59:58
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtJxlCreditCardDTO> searchExtJxlCreditCard(Map<String,Object> searchParams) throws Exception {
	    List<ExtJxlCreditCardDTO> dataList = dao.searchExtJxlCreditCard(searchParams);
        return dataList;
    }

	/**
	* @title: insertExtJxlCreditCardList
	* @author:陈东栋
	* @description:批量新增 聚信立央行征信报告（信用卡信息表）对象
	* @date 2017年8月30日 下午6:06:09
	* @param dataList
	* @param fkReportId
	* @throws Exception
	* @throws 
	*/ 
	@SuppressWarnings("all")
	public void insertExtJxlCreditCardList(List<ExtJxlCreditCardDTO> dataList ,Long fkReportId) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dtoList", dataList);
		paramMap.put("fkReportId", fkReportId);
		dao.insertExtJxlCreditCardList(paramMap);
	}

}

