package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrloans.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrloans.dto.ExtWlShSrLoansDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrloans.dao.ExtWlShSrLoansDao;

/**
 * @classname: ExtWlShSrLoansService
 * @description: 定义  算话人行结构化版(贷款表) 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrloans.service.ExtWlShSrLoansService")
public class ExtWlShSrLoansService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlShSrLoansDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 算话人行结构化版(贷款表)列表
     * @date 2017-12-21 19:55:43
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlShSrLoansDTO> searchExtWlShSrLoansByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlShSrLoansDTO> dataList =  dao.searchExtWlShSrLoansByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话人行结构化版(贷款表)列表
     * @date 2017-12-21 19:55:43
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlShSrLoansDTO> searchExtWlShSrLoans(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlShSrLoansDTO> dataList = dao.searchExtWlShSrLoans(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话人行结构化版(贷款表)对象
     * @date 2017-12-21 19:55:43
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlShSrLoansDTO queryExtWlShSrLoansByPrimaryKey(String id) throws Exception {
		
		ExtWlShSrLoansDTO dto = dao.findExtWlShSrLoansByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlShSrLoansDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlShSrLoans
     * @author Administrator
     * @description: 新增 算话人行结构化版(贷款表)对象
     * @date 2017-12-21 19:55:43
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlShSrLoans(ExtWlShSrLoansDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlShSrLoans(paramMap);
		
		ExtWlShSrLoansDTO resultDto = (ExtWlShSrLoansDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlShSrLoans
     * @author Administrator
     * @description: 修改 算话人行结构化版(贷款表)对象
     * @date 2017-12-21 19:55:43
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlShSrLoans(ExtWlShSrLoansDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlShSrLoans(paramMap);
	}
	/**
     * @title: deleteExtWlShSrLoansByPrimaryKey
     * @author Administrator
     * @description: 删除 算话人行结构化版(贷款表),按主键
     * @date 2017-12-21 19:55:43
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlShSrLoansByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlShSrLoansByPrimaryKey(paramMap);
	}

	/**
	 * @methodName: insertExtWlShSrLoansList
	 * @param: [loansList, fkReportId]
	 * @describe: 批量新增 算话人行结构化版(贷款表)列表
	 * @auther: huangxianchao
	 * @date: 2017/12/25 0025
	 * @time: 上午 10:59
	 **/
    public void insertExtWlShSrLoansList(List<ExtWlShSrLoansDTO> loansList, Long fkReportId) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dtoList", loansList);
		paramMap.put("fkReportId", fkReportId);
		dao.insertExtWlShSrLoansList(paramMap);

    }
}

