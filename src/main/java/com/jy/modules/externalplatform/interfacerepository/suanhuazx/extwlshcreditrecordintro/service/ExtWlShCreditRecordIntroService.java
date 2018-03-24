package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshcreditrecordintro.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshcreditrecordintro.dto.ExtWlShCreditRecordIntroDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshcreditrecordintro.dao.ExtWlShCreditRecordIntroDao;

/**
 * @classname: ExtWlShCreditRecordIntroService
 * @description: 定义  算话人行原版(信贷记录解释文字与资产相关汇总信息) 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshcreditrecordintro.service.ExtWlShCreditRecordIntroService")
public class ExtWlShCreditRecordIntroService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlShCreditRecordIntroDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 算话人行原版(信贷记录解释文字与资产相关汇总信息)列表
     * @date 2017-12-21 19:46:39
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlShCreditRecordIntroDTO> searchExtWlShCreditRecordIntroByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlShCreditRecordIntroDTO> dataList =  dao.searchExtWlShCreditRecordIntroByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话人行原版(信贷记录解释文字与资产相关汇总信息)列表
     * @date 2017-12-21 19:46:39
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlShCreditRecordIntroDTO> searchExtWlShCreditRecordIntro(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlShCreditRecordIntroDTO> dataList = dao.searchExtWlShCreditRecordIntro(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话人行原版(信贷记录解释文字与资产相关汇总信息)对象
     * @date 2017-12-21 19:46:39
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlShCreditRecordIntroDTO queryExtWlShCreditRecordIntroByPrimaryKey(String id) throws Exception {
		
		ExtWlShCreditRecordIntroDTO dto = dao.findExtWlShCreditRecordIntroByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlShCreditRecordIntroDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlShCreditRecordIntro
     * @author Administrator
     * @description: 新增 算话人行原版(信贷记录解释文字与资产相关汇总信息)对象
     * @date 2017-12-21 19:46:39
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlShCreditRecordIntro(ExtWlShCreditRecordIntroDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlShCreditRecordIntro(paramMap);
		
		ExtWlShCreditRecordIntroDTO resultDto = (ExtWlShCreditRecordIntroDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlShCreditRecordIntro
     * @author Administrator
     * @description: 修改 算话人行原版(信贷记录解释文字与资产相关汇总信息)对象
     * @date 2017-12-21 19:46:39
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlShCreditRecordIntro(ExtWlShCreditRecordIntroDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlShCreditRecordIntro(paramMap);
	}
	/**
     * @title: deleteExtWlShCreditRecordIntroByPrimaryKey
     * @author Administrator
     * @description: 删除 算话人行原版(信贷记录解释文字与资产相关汇总信息),按主键
     * @date 2017-12-21 19:46:39
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlShCreditRecordIntroByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlShCreditRecordIntroByPrimaryKey(paramMap);
	}

}

