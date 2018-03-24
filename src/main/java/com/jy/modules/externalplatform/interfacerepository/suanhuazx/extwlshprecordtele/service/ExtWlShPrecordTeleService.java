package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshprecordtele.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshprecordtele.dto.ExtWlShPrecordTeleDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshprecordtele.dao.ExtWlShPrecordTeleDao;

/**
 * @classname: ExtWlShPrecordTeleService
 * @description: 定义  算话人行原版(公共记录_电信欠费信息表) 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshprecordtele.service.ExtWlShPrecordTeleService")
public class ExtWlShPrecordTeleService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlShPrecordTeleDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 算话人行原版(公共记录_电信欠费信息表)列表
     * @date 2017-12-21 19:50:54
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlShPrecordTeleDTO> searchExtWlShPrecordTeleByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlShPrecordTeleDTO> dataList =  dao.searchExtWlShPrecordTeleByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话人行原版(公共记录_电信欠费信息表)列表
     * @date 2017-12-21 19:50:54
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlShPrecordTeleDTO> searchExtWlShPrecordTele(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlShPrecordTeleDTO> dataList = dao.searchExtWlShPrecordTele(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话人行原版(公共记录_电信欠费信息表)对象
     * @date 2017-12-21 19:50:54
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlShPrecordTeleDTO queryExtWlShPrecordTeleByPrimaryKey(String id) throws Exception {
		
		ExtWlShPrecordTeleDTO dto = dao.findExtWlShPrecordTeleByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlShPrecordTeleDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlShPrecordTele
     * @author Administrator
     * @description: 新增 算话人行原版(公共记录_电信欠费信息表)对象
     * @date 2017-12-21 19:50:54
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlShPrecordTele(ExtWlShPrecordTeleDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlShPrecordTele(paramMap);
		
		ExtWlShPrecordTeleDTO resultDto = (ExtWlShPrecordTeleDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlShPrecordTele
     * @author Administrator
     * @description: 修改 算话人行原版(公共记录_电信欠费信息表)对象
     * @date 2017-12-21 19:50:54
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlShPrecordTele(ExtWlShPrecordTeleDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlShPrecordTele(paramMap);
	}
	/**
     * @title: deleteExtWlShPrecordTeleByPrimaryKey
     * @author Administrator
     * @description: 删除 算话人行原版(公共记录_电信欠费信息表),按主键
     * @date 2017-12-21 19:50:54
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlShPrecordTeleByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlShPrecordTeleByPrimaryKey(paramMap);
	}

	/**
	 * @methodName: insertExtWlShPrecordTelecomList
	 * @param: [precordTelecomList, fkReportId]
	 * @describe: 批量新增 算话人行原版(公共记录_电信欠费信息表)列表
	 * @auther: huangxianchao
	 * @date: 2017/12/25 0025
	 * @time: 上午 9:59
	 **/
    public void insertExtWlShPrecordTelecomList(List<ExtWlShPrecordTeleDTO> precordTelecomList, Long fkReportId) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dtoList", precordTelecomList);
		paramMap.put("fkReportId", fkReportId);
		dao.insertExtWlShPrecordTelecomList(paramMap);
    }
}

