package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrtaxs.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrtaxs.dto.ExtWlShSrTaxsDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrtaxs.dao.ExtWlShSrTaxsDao;

/**
 * @classname: ExtWlShSrTaxsService
 * @description: 定义  算话人行结构化版(欠税记录表) 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrtaxs.service.ExtWlShSrTaxsService")
public class ExtWlShSrTaxsService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlShSrTaxsDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 算话人行结构化版(欠税记录表)列表
     * @date 2017-12-21 19:56:25
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlShSrTaxsDTO> searchExtWlShSrTaxsByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlShSrTaxsDTO> dataList =  dao.searchExtWlShSrTaxsByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话人行结构化版(欠税记录表)列表
     * @date 2017-12-21 19:56:25
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlShSrTaxsDTO> searchExtWlShSrTaxs(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlShSrTaxsDTO> dataList = dao.searchExtWlShSrTaxs(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话人行结构化版(欠税记录表)对象
     * @date 2017-12-21 19:56:25
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlShSrTaxsDTO queryExtWlShSrTaxsByPrimaryKey(String id) throws Exception {
		
		ExtWlShSrTaxsDTO dto = dao.findExtWlShSrTaxsByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlShSrTaxsDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlShSrTaxs
     * @author Administrator
     * @description: 新增 算话人行结构化版(欠税记录表)对象
     * @date 2017-12-21 19:56:25
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlShSrTaxs(ExtWlShSrTaxsDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlShSrTaxs(paramMap);
		
		ExtWlShSrTaxsDTO resultDto = (ExtWlShSrTaxsDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlShSrTaxs
     * @author Administrator
     * @description: 修改 算话人行结构化版(欠税记录表)对象
     * @date 2017-12-21 19:56:25
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlShSrTaxs(ExtWlShSrTaxsDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlShSrTaxs(paramMap);
	}
	/**
     * @title: deleteExtWlShSrTaxsByPrimaryKey
     * @author Administrator
     * @description: 删除 算话人行结构化版(欠税记录表),按主键
     * @date 2017-12-21 19:56:25
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlShSrTaxsByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlShSrTaxsByPrimaryKey(paramMap);
	}

	/**
	 * @methodName: insertExtWlShSrTaxsList
	 * @param: [taxsList, fkReportId]
	 * @describe: 批量新增 算话人行结构化版(欠税记录表)列表
	 * @auther: huangxianchao
	 * @date: 2017/12/25 0025
	 * @time: 上午 11:02
	 **/
    public void insertExtWlShSrTaxsList(List<ExtWlShSrTaxsDTO> taxsList, Long fkReportId) {

		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dtoList", taxsList);
		paramMap.put("fkReportId",fkReportId);
		dao.insertExtWlShSrTaxsList(paramMap);
    }
}

