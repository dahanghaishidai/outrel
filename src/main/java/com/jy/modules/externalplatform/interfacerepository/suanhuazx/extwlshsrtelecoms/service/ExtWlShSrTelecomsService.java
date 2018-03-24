package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrtelecoms.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrtelecoms.dto.ExtWlShSrTelecomsDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrtelecoms.dao.ExtWlShSrTelecomsDao;

/**
 * @classname: ExtWlShSrTelecomsService
 * @description: 定义  算话人行结构化版(电信欠费信息表) 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrtelecoms.service.ExtWlShSrTelecomsService")
public class ExtWlShSrTelecomsService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlShSrTelecomsDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 算话人行结构化版(电信欠费信息表)列表
     * @date 2017-12-21 19:56:52
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlShSrTelecomsDTO> searchExtWlShSrTelecomsByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlShSrTelecomsDTO> dataList =  dao.searchExtWlShSrTelecomsByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话人行结构化版(电信欠费信息表)列表
     * @date 2017-12-21 19:56:52
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlShSrTelecomsDTO> searchExtWlShSrTelecoms(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlShSrTelecomsDTO> dataList = dao.searchExtWlShSrTelecoms(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话人行结构化版(电信欠费信息表)对象
     * @date 2017-12-21 19:56:52
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlShSrTelecomsDTO queryExtWlShSrTelecomsByPrimaryKey(String id) throws Exception {
		
		ExtWlShSrTelecomsDTO dto = dao.findExtWlShSrTelecomsByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlShSrTelecomsDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlShSrTelecoms
     * @author Administrator
     * @description: 新增 算话人行结构化版(电信欠费信息表)对象
     * @date 2017-12-21 19:56:52
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlShSrTelecoms(ExtWlShSrTelecomsDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlShSrTelecoms(paramMap);
		
		ExtWlShSrTelecomsDTO resultDto = (ExtWlShSrTelecomsDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlShSrTelecoms
     * @author Administrator
     * @description: 修改 算话人行结构化版(电信欠费信息表)对象
     * @date 2017-12-21 19:56:52
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlShSrTelecoms(ExtWlShSrTelecomsDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlShSrTelecoms(paramMap);
	}
	/**
     * @title: deleteExtWlShSrTelecomsByPrimaryKey
     * @author Administrator
     * @description: 删除 算话人行结构化版(电信欠费信息表),按主键
     * @date 2017-12-21 19:56:52
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlShSrTelecomsByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlShSrTelecomsByPrimaryKey(paramMap);
	}

	/**
	 * @methodName: insertExtWlShSrTelecomsList
	 * @param: [telecomsList, fkReportId]
	 * @describe: 批量新增 算话人行结构化版(电信欠费信息表)列表
	 * @auther: huangxianchao
	 * @date: 2017/12/25 0025
	 * @time: 上午 11:23
	 **/
    public void insertExtWlShSrTelecomsList(List<ExtWlShSrTelecomsDTO> telecomsList, Long fkReportId) {

		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dtoList", telecomsList);
		paramMap.put("fkReportId", fkReportId);
		dao.insertExtWlShSrTelecomsList(paramMap);
    }
}

