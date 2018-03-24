package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrpunishments.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrpunishments.dto.ExtWlShSrPunishmentsDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrpunishments.dao.ExtWlShSrPunishmentsDao;

/**
 * @classname: ExtWlShSrPunishmentsService
 * @description: 定义  算话人行结构化版(行政处罚记录表) 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrpunishments.service.ExtWlShSrPunishmentsService")
public class ExtWlShSrPunishmentsService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlShSrPunishmentsDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 算话人行结构化版(行政处罚记录表)列表
     * @date 2017-12-21 19:56:07
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlShSrPunishmentsDTO> searchExtWlShSrPunishmentsByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlShSrPunishmentsDTO> dataList =  dao.searchExtWlShSrPunishmentsByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话人行结构化版(行政处罚记录表)列表
     * @date 2017-12-21 19:56:07
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlShSrPunishmentsDTO> searchExtWlShSrPunishments(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlShSrPunishmentsDTO> dataList = dao.searchExtWlShSrPunishments(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话人行结构化版(行政处罚记录表)对象
     * @date 2017-12-21 19:56:07
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlShSrPunishmentsDTO queryExtWlShSrPunishmentsByPrimaryKey(String id) throws Exception {
		
		ExtWlShSrPunishmentsDTO dto = dao.findExtWlShSrPunishmentsByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlShSrPunishmentsDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlShSrPunishments
     * @author Administrator
     * @description: 新增 算话人行结构化版(行政处罚记录表)对象
     * @date 2017-12-21 19:56:07
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlShSrPunishments(ExtWlShSrPunishmentsDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlShSrPunishments(paramMap);
		
		ExtWlShSrPunishmentsDTO resultDto = (ExtWlShSrPunishmentsDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlShSrPunishments
     * @author Administrator
     * @description: 修改 算话人行结构化版(行政处罚记录表)对象
     * @date 2017-12-21 19:56:07
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlShSrPunishments(ExtWlShSrPunishmentsDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlShSrPunishments(paramMap);
	}
	/**
     * @title: deleteExtWlShSrPunishmentsByPrimaryKey
     * @author Administrator
     * @description: 删除 算话人行结构化版(行政处罚记录表),按主键
     * @date 2017-12-21 19:56:07
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlShSrPunishmentsByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlShSrPunishmentsByPrimaryKey(paramMap);
	}

	/**
	 * @methodName: insertExtWlShSrPunishmentsList
	 * @param: [punishmentsList, fkReportId]
	 * @describe: 批量新增 算话人行结构化版(行政处罚记录表)列表
	 * @auther: huangxianchao
	 * @date: 2017/12/25 0025
	 * @time: 上午 11:18
	 **/
    public void insertExtWlShSrPunishmentsList(List<ExtWlShSrPunishmentsDTO> punishmentsList, Long fkReportId) {

		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dtoList", punishmentsList);
		paramMap.put("fkReportId", fkReportId);
		dao.insertExtWlShSrPunishmentsList(paramMap);
    }
}

