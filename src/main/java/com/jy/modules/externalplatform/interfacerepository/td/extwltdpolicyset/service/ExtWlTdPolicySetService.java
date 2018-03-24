package com.jy.modules.externalplatform.interfacerepository.td.extwltdpolicyset.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.td.extwltdpolicyset.dto.ExtWlTdPolicySetDTO;
import com.jy.modules.externalplatform.interfacerepository.td.extwltdpolicyset.dao.ExtWlTdPolicySetDao;

/**
 * @className: ExtWlTdPolicySetService
 * @package: com.jy.modules.externalplatform.interfacerepository.td.extwltdpolicyset.service
 * @describe: 定义  同盾_TDRC决策引擎命中策略集表 实现类
 * @auther: 董康宁
 * @date: 2017/12/20
 * @time: 20:35
 */
@Service("com.jy.modules.externalplatform.interfacerepository.td.extwltdpolicyset.service.ExtWlTdPolicySetService")
public class ExtWlTdPolicySetService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlTdPolicySetDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 同盾_TDRC决策引擎命中策略集表列表
     * @date 2017-12-20 20:33:32
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlTdPolicySetDTO> searchExtWlTdPolicySetByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlTdPolicySetDTO> dataList =  dao.searchExtWlTdPolicySetByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询同盾_TDRC决策引擎命中策略集表列表
     * @date 2017-12-20 20:33:32
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlTdPolicySetDTO> searchExtWlTdPolicySet(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlTdPolicySetDTO> dataList = dao.searchExtWlTdPolicySet(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询同盾_TDRC决策引擎命中策略集表对象
     * @date 2017-12-20 20:33:32
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlTdPolicySetDTO queryExtWlTdPolicySetByPrimaryKey(String id) throws Exception {
		
		ExtWlTdPolicySetDTO dto = dao.findExtWlTdPolicySetByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlTdPolicySetDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlTdPolicySet
     * @author Administrator
     * @description: 新增 同盾_TDRC决策引擎命中策略集表对象
     * @date 2017-12-20 20:33:32
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlTdPolicySet(ExtWlTdPolicySetDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlTdPolicySet(paramMap);
		
		ExtWlTdPolicySetDTO resultDto = (ExtWlTdPolicySetDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlTdPolicySet
     * @author Administrator
     * @description: 修改 同盾_TDRC决策引擎命中策略集表对象
     * @date 2017-12-20 20:33:32
     * @param dto
     * @return
     * @throws
     */
	public void updateExtWlTdPolicySet(ExtWlTdPolicySetDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlTdPolicySet(paramMap);
	}
	/**
     * @title: deleteExtWlTdPolicySetByPrimaryKey
     * @author Administrator
     * @description: 删除 同盾_TDRC决策引擎命中策略集表,按主键
     * @date 2017-12-20 20:33:32
     * @param baseDto, ids
     * @throws
     */ 
	public void deleteExtWlTdPolicySetByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlTdPolicySetByPrimaryKey(paramMap);
	}

}

