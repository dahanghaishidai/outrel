package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpersonloanbala.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpersonloanbala.dto.ExtWlShPersonLoanBalaDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpersonloanbala.dao.ExtWlShPersonLoanBalaDao;

/**
 * @classname: ExtWlShPersonLoanBalaService
 * @description: 定义  人行征信贷款余额信息详列 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpersonloanbala.service.ExtWlShPersonLoanBalaService")
public class ExtWlShPersonLoanBalaService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlShPersonLoanBalaDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 人行征信贷款余额信息详列列表
     * @date 2017-12-21 19:48:25
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlShPersonLoanBalaDTO> searchExtWlShPersonLoanBalaByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlShPersonLoanBalaDTO> dataList =  dao.searchExtWlShPersonLoanBalaByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询人行征信贷款余额信息详列列表
     * @date 2017-12-21 19:48:25
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlShPersonLoanBalaDTO> searchExtWlShPersonLoanBala(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlShPersonLoanBalaDTO> dataList = dao.searchExtWlShPersonLoanBala(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询人行征信贷款余额信息详列对象
     * @date 2017-12-21 19:48:25
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlShPersonLoanBalaDTO queryExtWlShPersonLoanBalaByPrimaryKey(String id) throws Exception {
		
		ExtWlShPersonLoanBalaDTO dto = dao.findExtWlShPersonLoanBalaByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlShPersonLoanBalaDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlShPersonLoanBala
     * @author Administrator
     * @description: 新增 人行征信贷款余额信息详列对象
     * @date 2017-12-21 19:48:25
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlShPersonLoanBala(ExtWlShPersonLoanBalaDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlShPersonLoanBala(paramMap);
		
		ExtWlShPersonLoanBalaDTO resultDto = (ExtWlShPersonLoanBalaDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlShPersonLoanBala
     * @author Administrator
     * @description: 修改 人行征信贷款余额信息详列对象
     * @date 2017-12-21 19:48:25
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlShPersonLoanBala(ExtWlShPersonLoanBalaDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlShPersonLoanBala(paramMap);
	}
	/**
     * @title: deleteExtWlShPersonLoanBalaByPrimaryKey
     * @author Administrator
     * @description: 删除 人行征信贷款余额信息详列,按主键
     * @date 2017-12-21 19:48:25
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlShPersonLoanBalaByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlShPersonLoanBalaByPrimaryKey(paramMap);
	}

	/**
	 * @methodName: insertExtWlShPersonLoanBalancesList
	 * @param: [dtoList, fkPersonDebtsId]
	 * @describe: 新增 人行征信贷款余额信息详列
	 * @auther: huangxianchao
	 * @date: 2017/12/22 0022
	 * @time: 上午 11:28
	 **/
	public Long insertExtWlShPersonLoanBalancesList(List<ExtWlShPersonLoanBalaDTO> dtoList, Long fkPersonDebtsId){


		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dtoList", dtoList);
		paramMap.put("fkPersonDebtsId", fkPersonDebtsId);
		int count = dao.insertExtWlShPersonLoanBalancesList(paramMap);
		return (long) count;
	}

}

