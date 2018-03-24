package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpercreditloan.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpercreditloan.dto.ExtWlShPerCreditLoanDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpercreditloan.dao.ExtWlShPerCreditLoanDao;

/**
 * @classname: ExtWlShPerCreditLoanService
 * @description: 定义  人行征信信贷信息 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpercreditloan.service.ExtWlShPerCreditLoanService")
public class ExtWlShPerCreditLoanService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlShPerCreditLoanDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 人行征信信贷信息列表
     * @date 2017-12-22 12:31:13
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlShPerCreditLoanDTO> searchExtWlShPerCreditLoanByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlShPerCreditLoanDTO> dataList =  dao.searchExtWlShPerCreditLoanByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询人行征信信贷信息列表
     * @date 2017-12-22 12:31:13
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlShPerCreditLoanDTO> searchExtWlShPerCreditLoan(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlShPerCreditLoanDTO> dataList = dao.searchExtWlShPerCreditLoan(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询人行征信信贷信息对象
     * @date 2017-12-22 12:31:13
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlShPerCreditLoanDTO queryExtWlShPerCreditLoanByPrimaryKey(String id) throws Exception {
		
		ExtWlShPerCreditLoanDTO dto = dao.findExtWlShPerCreditLoanByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlShPerCreditLoanDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlShPerCreditLoan
     * @author Administrator
     * @description: 新增 人行征信信贷信息对象
     * @date 2017-12-22 12:31:13
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlShPerCreditLoan(ExtWlShPerCreditLoanDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlShPerCreditLoan(paramMap);
		
		ExtWlShPerCreditLoanDTO resultDto = (ExtWlShPerCreditLoanDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlShPerCreditLoan
     * @author Administrator
     * @description: 修改 人行征信信贷信息对象
     * @date 2017-12-22 12:31:13
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlShPerCreditLoan(ExtWlShPerCreditLoanDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlShPerCreditLoan(paramMap);
	}
	/**
     * @title: deleteExtWlShPerCreditLoanByPrimaryKey
     * @author Administrator
     * @description: 删除 人行征信信贷信息,按主键
     * @date 2017-12-22 12:31:13
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlShPerCreditLoanByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlShPerCreditLoanByPrimaryKey(paramMap);
	}

	/**
	 * @methodName: insertExtWlShPersonCreditLoan
	 * @param: [extWlShPerCreditLoanDTO]
	 * @describe: TODO
	 * @auther: huangxianchao
	 * @date: 2017/12/25 0025
	 * @time: 上午 10:16
	 **/
    public Long insertExtWlShPersonCreditLoan(ExtWlShPerCreditLoanDTO extWlShPerCreditLoanDTO) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", extWlShPerCreditLoanDTO);

		int count = dao.insertExtWlShPerCreditLoan(paramMap);

		ExtWlShPerCreditLoanDTO resultDto = (ExtWlShPerCreditLoanDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;

    }
}

