package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshqrecordlist.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshqrecordlist.dto.ExtWlShQrecordListDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshqrecordlist.dao.ExtWlShQrecordListDao;

/**
 * @classname: ExtWlShQrecordListService
 * @description: 定义  算话人行原版(查询记录详单) 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshqrecordlist.service.ExtWlShQrecordListService")
public class ExtWlShQrecordListService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlShQrecordListDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 算话人行原版(查询记录详单)列表
     * @date 2017-12-21 19:51:38
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlShQrecordListDTO> searchExtWlShQrecordListByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlShQrecordListDTO> dataList =  dao.searchExtWlShQrecordListByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话人行原版(查询记录详单)列表
     * @date 2017-12-21 19:51:38
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlShQrecordListDTO> searchExtWlShQrecordList(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlShQrecordListDTO> dataList = dao.searchExtWlShQrecordList(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话人行原版(查询记录详单)对象
     * @date 2017-12-21 19:51:38
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlShQrecordListDTO queryExtWlShQrecordListByPrimaryKey(String id) throws Exception {
		
		ExtWlShQrecordListDTO dto = dao.findExtWlShQrecordListByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlShQrecordListDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlShQrecordList
     * @author Administrator
     * @description: 新增 算话人行原版(查询记录详单)对象
     * @date 2017-12-21 19:51:38
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlShQrecordList(ExtWlShQrecordListDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlShQrecordList(paramMap);
		
		ExtWlShQrecordListDTO resultDto = (ExtWlShQrecordListDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlShQrecordList
     * @author Administrator
     * @description: 修改 算话人行原版(查询记录详单)对象
     * @date 2017-12-21 19:51:38
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlShQrecordList(ExtWlShQrecordListDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlShQrecordList(paramMap);
	}
	/**
     * @title: deleteExtWlShQrecordListByPrimaryKey
     * @author Administrator
     * @description: 删除 算话人行原版(查询记录详单),按主键
     * @date 2017-12-21 19:51:38
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlShQrecordListByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlShQrecordListByPrimaryKey(paramMap);
	}

	/**
	 * @methodName: insertExtWlShQrecordList1
	 * @param: [qrecordList, fkReportId]
	 * @describe: 批量新增 算话人行原版(查询记录详单)列表
	 * @auther: huangxianchao
	 * @date: 2017/12/25 0025
	 * @time: 上午 10:09
	 **/
    public void insertExtWlShQrecordList1(List<ExtWlShQrecordListDTO> qrecordList, Long fkReportId) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dtoList", qrecordList);
		paramMap.put("fkReportId", fkReportId);
		dao.insertExtWlShQrecordList1(paramMap);

    }
}

