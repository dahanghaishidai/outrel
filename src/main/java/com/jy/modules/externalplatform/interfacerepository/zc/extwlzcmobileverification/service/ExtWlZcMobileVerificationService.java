package com.jy.modules.externalplatform.interfacerepository.zc.extwlzcmobileverification.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcmobileverification.dto.ExtWlZcMobileVerificationDTO;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcmobileverification.dao.ExtWlZcMobileVerificationDao;

/**
 * @classname: ExtWlZcMobileVerificationService
 * @description: 定义  致诚手机验证结果表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.zc.extwlzcmobileverification.service.ExtWlZcMobileVerificationService")
public class ExtWlZcMobileVerificationService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlZcMobileVerificationDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 致诚手机验证结果表列表
     * @date 2017-12-07 13:39:50
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlZcMobileVerificationDTO> searchExtWlZcMobileVerificationByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlZcMobileVerificationDTO> dataList =  dao.searchExtWlZcMobileVerificationByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询致诚手机验证结果表列表
     * @date 2017-12-07 13:39:50
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlZcMobileVerificationDTO> searchExtWlZcMobileVerification(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlZcMobileVerificationDTO> dataList = dao.searchExtWlZcMobileVerification(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询致诚手机验证结果表对象
     * @date 2017-12-07 13:39:50
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlZcMobileVerificationDTO queryExtWlZcMobileVerificationByPrimaryKey(String id) throws Exception {
		
		ExtWlZcMobileVerificationDTO dto = dao.findExtWlZcMobileVerificationByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlZcMobileVerificationDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlZcMobileVerification
     * @author Administrator
     * @description: 新增 致诚手机验证结果表对象
     * @date 2017-12-07 13:39:50
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlZcMobileVerification(ExtWlZcMobileVerificationDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlZcMobileVerification(paramMap);
		
		ExtWlZcMobileVerificationDTO resultDto = (ExtWlZcMobileVerificationDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlZcMobileVerification
     * @author Administrator
     * @description: 修改 致诚手机验证结果表对象
     * @date 2017-12-07 13:39:50
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlZcMobileVerification(ExtWlZcMobileVerificationDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlZcMobileVerification(paramMap);
	}
	/**
     * @title: deleteExtWlZcMobileVerificationByPrimaryKey
     * @author Administrator
     * @description: 删除 致诚手机验证结果表,按主键
     * @date 2017-12-07 13:39:50
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlZcMobileVerificationByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlZcMobileVerificationByPrimaryKey(paramMap);
	}

    /**
     * 
     * @title: batchInsertVerification
     * @author: dongkangning
     * @description:批量保存手机验证信息
     * @date 2017年12月7日 下午4:18:27
     * @param mobileVerificationList
     * @throws
     */
    public void batchInsertVerification(List<ExtWlZcMobileVerificationDTO> mobileVerificationList) {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("mobileVerificationList", mobileVerificationList);     
        dao.batchInsertVerification(paramMap);
    }

}

