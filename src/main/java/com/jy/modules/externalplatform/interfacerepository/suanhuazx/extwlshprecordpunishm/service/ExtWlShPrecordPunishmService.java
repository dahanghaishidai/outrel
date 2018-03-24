package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshprecordpunishm.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshprecordpunishm.dto.ExtWlShPrecordPunishmDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshprecordpunishm.dao.ExtWlShPrecordPunishmDao;

/**
 * @classname: ExtWlShPrecordPunishmService
 * @description: 定义  算话人行原版(公共记录_行政处罚记录表) 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshprecordpunishm.service.ExtWlShPrecordPunishmService")
public class ExtWlShPrecordPunishmService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlShPrecordPunishmDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 算话人行原版(公共记录_行政处罚记录表)列表
     * @date 2017-12-21 19:50:05
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlShPrecordPunishmDTO> searchExtWlShPrecordPunishmByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlShPrecordPunishmDTO> dataList =  dao.searchExtWlShPrecordPunishmByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话人行原版(公共记录_行政处罚记录表)列表
     * @date 2017-12-21 19:50:05
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlShPrecordPunishmDTO> searchExtWlShPrecordPunishm(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlShPrecordPunishmDTO> dataList = dao.searchExtWlShPrecordPunishm(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话人行原版(公共记录_行政处罚记录表)对象
     * @date 2017-12-21 19:50:05
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlShPrecordPunishmDTO queryExtWlShPrecordPunishmByPrimaryKey(String id) throws Exception {
		
		ExtWlShPrecordPunishmDTO dto = dao.findExtWlShPrecordPunishmByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlShPrecordPunishmDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlShPrecordPunishm
     * @author Administrator
     * @description: 新增 算话人行原版(公共记录_行政处罚记录表)对象
     * @date 2017-12-21 19:50:05
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlShPrecordPunishm(ExtWlShPrecordPunishmDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlShPrecordPunishm(paramMap);
		
		ExtWlShPrecordPunishmDTO resultDto = (ExtWlShPrecordPunishmDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlShPrecordPunishm
     * @author Administrator
     * @description: 修改 算话人行原版(公共记录_行政处罚记录表)对象
     * @date 2017-12-21 19:50:05
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlShPrecordPunishm(ExtWlShPrecordPunishmDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlShPrecordPunishm(paramMap);
	}
	/**
     * @title: deleteExtWlShPrecordPunishmByPrimaryKey
     * @author Administrator
     * @description: 删除 算话人行原版(公共记录_行政处罚记录表),按主键
     * @date 2017-12-21 19:50:05
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlShPrecordPunishmByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlShPrecordPunishmByPrimaryKey(paramMap);
	}

	/**
	 * @methodName: insertExtWlShPrecordPunishmentList
	 * @param: [precordPunishmentList, fkReportId]
	 * @describe: 批量新增 算话人行原版(公共记录_行政处罚记录表)列表
	 * @auther: huangxianchao
	 * @date: 2017/12/25 0025
	 * @time: 上午 9:51
	 **/
    public void insertExtWlShPrecordPunishmentList(List<ExtWlShPrecordPunishmDTO> precordPunishmentList, Long fkReportId) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dtoList",precordPunishmentList);
		paramMap.put("fkReportId",fkReportId);
		dao.insertExtWlShPrecordPunishmentList(paramMap);

    }
}

