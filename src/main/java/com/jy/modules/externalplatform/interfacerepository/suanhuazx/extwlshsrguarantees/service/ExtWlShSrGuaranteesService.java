package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrguarantees.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrguarantees.dto.ExtWlShSrGuaranteesDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrguarantees.dao.ExtWlShSrGuaranteesDao;

/**
 * @classname: ExtWlShSrGuaranteesService
 * @description: 定义  算话人行结构化版(为他人担保信息表) 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrguarantees.service.ExtWlShSrGuaranteesService")
public class ExtWlShSrGuaranteesService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlShSrGuaranteesDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 算话人行结构化版(为他人担保信息表)列表
     * @date 2017-12-21 19:54:56
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlShSrGuaranteesDTO> searchExtWlShSrGuaranteesByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlShSrGuaranteesDTO> dataList =  dao.searchExtWlShSrGuaranteesByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话人行结构化版(为他人担保信息表)列表
     * @date 2017-12-21 19:54:56
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlShSrGuaranteesDTO> searchExtWlShSrGuarantees(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlShSrGuaranteesDTO> dataList = dao.searchExtWlShSrGuarantees(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话人行结构化版(为他人担保信息表)对象
     * @date 2017-12-21 19:54:56
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlShSrGuaranteesDTO queryExtWlShSrGuaranteesByPrimaryKey(String id) throws Exception {
		
		ExtWlShSrGuaranteesDTO dto = dao.findExtWlShSrGuaranteesByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlShSrGuaranteesDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlShSrGuarantees
     * @author Administrator
     * @description: 新增 算话人行结构化版(为他人担保信息表)对象
     * @date 2017-12-21 19:54:56
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlShSrGuarantees(ExtWlShSrGuaranteesDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlShSrGuarantees(paramMap);
		
		ExtWlShSrGuaranteesDTO resultDto = (ExtWlShSrGuaranteesDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlShSrGuarantees
     * @author Administrator
     * @description: 修改 算话人行结构化版(为他人担保信息表)对象
     * @date 2017-12-21 19:54:56
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlShSrGuarantees(ExtWlShSrGuaranteesDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlShSrGuarantees(paramMap);
	}
	/**
     * @title: deleteExtWlShSrGuaranteesByPrimaryKey
     * @author Administrator
     * @description: 删除 算话人行结构化版(为他人担保信息表),按主键
     * @date 2017-12-21 19:54:56
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlShSrGuaranteesByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlShSrGuaranteesByPrimaryKey(paramMap);
	}

	/**
	 * @methodName: insertExtWlShSrGuaranteesList
	 * @param: [guaranteesList, fkReportId]
	 * @describe: 批量新增 算话人行结构化版(为他人担保信息表)列表
	 * @auther: huangxianchao
	 * @date: 2017/12/25 0025
	 * @time: 上午 10:44
	 **/
    public void insertExtWlShSrGuaranteesList(List<ExtWlShSrGuaranteesDTO> guaranteesList, Long fkReportId) {

		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dtoList", guaranteesList);
		paramMap.put("fkReportId", fkReportId);
		dao.insertExtWlShSrGuaranteesList(paramMap);
    }
}

