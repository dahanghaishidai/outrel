package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrjudgments.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrjudgments.dto.ExtWlShSrJudgmentsDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrjudgments.dao.ExtWlShSrJudgmentsDao;

/**
 * @classname: ExtWlShSrJudgmentsService
 * @description: 定义  算话人行结构化版(民事判决记录表) 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrjudgments.service.ExtWlShSrJudgmentsService")
public class ExtWlShSrJudgmentsService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlShSrJudgmentsDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 算话人行结构化版(民事判决记录表)列表
     * @date 2017-12-21 19:55:22
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlShSrJudgmentsDTO> searchExtWlShSrJudgmentsByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlShSrJudgmentsDTO> dataList =  dao.searchExtWlShSrJudgmentsByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话人行结构化版(民事判决记录表)列表
     * @date 2017-12-21 19:55:22
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlShSrJudgmentsDTO> searchExtWlShSrJudgments(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlShSrJudgmentsDTO> dataList = dao.searchExtWlShSrJudgments(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话人行结构化版(民事判决记录表)对象
     * @date 2017-12-21 19:55:22
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlShSrJudgmentsDTO queryExtWlShSrJudgmentsByPrimaryKey(String id) throws Exception {
		
		ExtWlShSrJudgmentsDTO dto = dao.findExtWlShSrJudgmentsByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlShSrJudgmentsDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlShSrJudgments
     * @author Administrator
     * @description: 新增 算话人行结构化版(民事判决记录表)对象
     * @date 2017-12-21 19:55:22
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlShSrJudgments(ExtWlShSrJudgmentsDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlShSrJudgments(paramMap);
		
		ExtWlShSrJudgmentsDTO resultDto = (ExtWlShSrJudgmentsDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlShSrJudgments
     * @author Administrator
     * @description: 修改 算话人行结构化版(民事判决记录表)对象
     * @date 2017-12-21 19:55:22
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlShSrJudgments(ExtWlShSrJudgmentsDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlShSrJudgments(paramMap);
	}
	/**
     * @title: deleteExtWlShSrJudgmentsByPrimaryKey
     * @author Administrator
     * @description: 删除 算话人行结构化版(民事判决记录表),按主键
     * @date 2017-12-21 19:55:22
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlShSrJudgmentsByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlShSrJudgmentsByPrimaryKey(paramMap);
	}

	/**
	 * @methodName: insertExtWlShSrJudgmentsList
	 * @param: [judgmentsList, fkReportId]
	 * @describe: 批量新增 算话人行结构化版(民事判决记录表)列表
	 * @auther: huangxianchao
	 * @date: 2017/12/25 0025
	 * @time: 上午 11:10
	 **/
    public void insertExtWlShSrJudgmentsList(List<ExtWlShSrJudgmentsDTO> judgmentsList, Long fkReportId) {

		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dtoList", judgmentsList);
		paramMap.put("fkReportId", fkReportId);
		dao.insertExtWlShSrJudgmentsList(paramMap);
    }
}

