package com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtquestions.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtquestions.dto.ExtWlZxtQuestionsDTO;
import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtquestions.dao.ExtWlZxtQuestionsDao;

/**
 * @classname: ExtWlZxtQuestionsService
 * @description: 定义  核身问答信息表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtquestions.service.ExtWlZxtQuestionsService")
public class ExtWlZxtQuestionsService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlZxtQuestionsDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 核身问答信息表列表
     * @date 2017-12-13 10:20:17
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlZxtQuestionsDTO> searchExtWlZxtQuestionsByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlZxtQuestionsDTO> dataList =  dao.searchExtWlZxtQuestionsByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询核身问答信息表列表
     * @date 2017-12-13 10:20:17
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlZxtQuestionsDTO> searchExtWlZxtQuestions(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlZxtQuestionsDTO> dataList = dao.searchExtWlZxtQuestions(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询核身问答信息表对象
     * @date 2017-12-13 10:20:17
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlZxtQuestionsDTO queryExtWlZxtQuestionsByPrimaryKey(String id) throws Exception {
		
		ExtWlZxtQuestionsDTO dto = dao.findExtWlZxtQuestionsByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlZxtQuestionsDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlZxtQuestions
     * @author Administrator
     * @description: 新增 核身问答信息表对象
     * @date 2017-12-13 10:20:17
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlZxtQuestions(ExtWlZxtQuestionsDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlZxtQuestions(paramMap);
		
		ExtWlZxtQuestionsDTO resultDto = (ExtWlZxtQuestionsDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlZxtQuestions
     * @author Administrator
     * @description: 修改 核身问答信息表对象
     * @date 2017-12-13 10:20:17
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlZxtQuestions(ExtWlZxtQuestionsDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlZxtQuestions(paramMap);
	}
	/**
     * @title: deleteExtWlZxtQuestionsByPrimaryKey
     * @author Administrator
     * @description: 删除 核身问答信息表,按主键
     * @date 2017-12-13 10:20:17
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlZxtQuestionsByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlZxtQuestionsByPrimaryKey(paramMap);
	}

}

