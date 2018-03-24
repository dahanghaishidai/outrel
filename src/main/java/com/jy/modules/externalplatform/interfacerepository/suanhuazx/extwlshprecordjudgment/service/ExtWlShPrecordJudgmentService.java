package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshprecordjudgment.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshprecordjudgment.dto.ExtWlShPrecordJudgmentDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshprecordjudgment.dao.ExtWlShPrecordJudgmentDao;

/**
 * @classname: ExtWlShPrecordJudgmentService
 * @description: 定义  算话人行原版(公共记录_民事判决记录表) 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshprecordjudgment.service.ExtWlShPrecordJudgmentService")
public class ExtWlShPrecordJudgmentService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlShPrecordJudgmentDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 算话人行原版(公共记录_民事判决记录表)列表
     * @date 2017-12-21 19:49:39
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlShPrecordJudgmentDTO> searchExtWlShPrecordJudgmentByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlShPrecordJudgmentDTO> dataList =  dao.searchExtWlShPrecordJudgmentByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话人行原版(公共记录_民事判决记录表)列表
     * @date 2017-12-21 19:49:39
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlShPrecordJudgmentDTO> searchExtWlShPrecordJudgment(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlShPrecordJudgmentDTO> dataList = dao.searchExtWlShPrecordJudgment(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话人行原版(公共记录_民事判决记录表)对象
     * @date 2017-12-21 19:49:39
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlShPrecordJudgmentDTO queryExtWlShPrecordJudgmentByPrimaryKey(String id) throws Exception {
		
		ExtWlShPrecordJudgmentDTO dto = dao.findExtWlShPrecordJudgmentByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlShPrecordJudgmentDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlShPrecordJudgment
     * @author Administrator
     * @description: 新增 算话人行原版(公共记录_民事判决记录表)对象
     * @date 2017-12-21 19:49:39
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlShPrecordJudgment(ExtWlShPrecordJudgmentDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlShPrecordJudgment(paramMap);
		
		ExtWlShPrecordJudgmentDTO resultDto = (ExtWlShPrecordJudgmentDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlShPrecordJudgment
     * @author Administrator
     * @description: 修改 算话人行原版(公共记录_民事判决记录表)对象
     * @date 2017-12-21 19:49:39
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlShPrecordJudgment(ExtWlShPrecordJudgmentDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlShPrecordJudgment(paramMap);
	}
	/**
     * @title: deleteExtWlShPrecordJudgmentByPrimaryKey
     * @author Administrator
     * @description: 删除 算话人行原版(公共记录_民事判决记录表),按主键
     * @date 2017-12-21 19:49:39
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlShPrecordJudgmentByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlShPrecordJudgmentByPrimaryKey(paramMap);
	}

	/**
	 * @methodName: insertExtWlShPrecordJudgmentList
	 * @param: [precordJudgmentList, fkReportId]
	 * @describe: 批量新增对象算话人行原版(公共记录_民事判决记录表)列表
	 * @auther: huangxianchao
	 * @date: 2017/12/25 0025
	 * @time: 上午 9:38
	 **/
    public void insertExtWlShPrecordJudgmentList(List<ExtWlShPrecordJudgmentDTO> precordJudgmentList, Long fkReportId) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dtoList", precordJudgmentList);
		paramMap.put("fkReportId", fkReportId);
		dao.insertExtWlShPrecordJudgmentList(paramMap);

    }
}

