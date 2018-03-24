package com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanydishonesty.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanydishonesty.dao.ExtLawCompanyDishonestyDao;
import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanydishonesty.dto.ExtLawCompanyDishonestyDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtLawCompanyDishonestyService
 * @description: 定义  汇法网企业失信信息表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanydishonesty.service.ExtLawCompanyDishonestyService")
public class ExtLawCompanyDishonestyService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtLawCompanyDishonestyDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 汇法网企业失信信息表列表
     * @date 2017-06-01 10:11:03
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtLawCompanyDishonestyDTO> searchExtLawCompanyDishonestyByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtLawCompanyDishonestyDTO> dataList =  dao.searchExtLawCompanyDishonestyByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询汇法网企业失信信息表列表
     * @date 2017-06-01 10:11:03
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtLawCompanyDishonestyDTO> searchExtLawCompanyDishonesty(Map<String,Object> searchParams) throws Exception {
	    List<ExtLawCompanyDishonestyDTO> dataList = dao.searchExtLawCompanyDishonesty(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询汇法网企业失信信息表对象
     * @date 2017-06-01 10:11:03
     * @param id
     * @return
     * @throws
     */ 
	public ExtLawCompanyDishonestyDTO queryExtLawCompanyDishonestyByPrimaryKey(String id) throws Exception {
		
		ExtLawCompanyDishonestyDTO dto = dao.findExtLawCompanyDishonestyByPrimaryKey(id);
		
		if(dto == null) dto = new ExtLawCompanyDishonestyDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtLawCompanyDishonesty
     * @author Administrator
     * @description: 新增 汇法网企业失信信息表对象
     * @date 2017-06-01 10:11:03
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtLawCompanyDishonesty(ExtLawCompanyDishonestyDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtLawCompanyDishonesty(paramMap);
		
		ExtLawCompanyDishonestyDTO resultDto = (ExtLawCompanyDishonestyDTO) paramMap.get("dto");
		Long keyId = resultDto.getKeyid();
		return keyId;
	}
	/**
     * @title: updateExtLawCompanyDishonesty
     * @author Administrator
     * @description: 修改 汇法网企业失信信息表对象
     * @date 2017-06-01 10:11:03
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtLawCompanyDishonesty(ExtLawCompanyDishonestyDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtLawCompanyDishonesty(paramMap);
	}
	/**
     * @title: deleteExtLawCompanyDishonestyByPrimaryKey
     * @author Administrator
     * @description: 删除 汇法网企业失信信息表,按主键
     * @date 2017-06-01 10:11:03
     * @param paramMap
     * @throws
     */ 
	public void deleteExtLawCompanyDishonestyByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtLawCompanyDishonestyByPrimaryKey(paramMap);
	}

}

