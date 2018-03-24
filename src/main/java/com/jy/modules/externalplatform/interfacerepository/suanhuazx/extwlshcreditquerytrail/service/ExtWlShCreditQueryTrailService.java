package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshcreditquerytrail.service;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshcreditquerytrail.dao.ExtWlShCreditQueryTrailDao;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshcreditquerytrail.dto.ExtWlShCreditQueryTrailDTO;
import com.jy.platform.core.common.BaseDTO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @classname: ExtWlShCreditQueryTrailService
 * @description: 定义  算话人行信用报告查询轨迹表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshcreditquerytrail.service.ExtWlShCreditQueryTrailService")
public class ExtWlShCreditQueryTrailService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlShCreditQueryTrailDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 算话人行信用报告查询轨迹表列表
     * @date 2017-12-21 19:45:40
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlShCreditQueryTrailDTO> searchExtWlShCreditQueryTrailByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlShCreditQueryTrailDTO> dataList =  dao.searchExtWlShCreditQueryTrailByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话人行信用报告查询轨迹表列表
     * @date 2017-12-21 19:45:40
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlShCreditQueryTrailDTO> searchExtWlShCreditQueryTrail(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlShCreditQueryTrailDTO> dataList = dao.searchExtWlShCreditQueryTrail(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话人行信用报告查询轨迹表对象
     * @date 2017-12-21 19:45:40
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlShCreditQueryTrailDTO queryExtWlShCreditQueryTrailByPrimaryKey(String id) throws Exception {
		
		ExtWlShCreditQueryTrailDTO dto = dao.findExtWlShCreditQueryTrailByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlShCreditQueryTrailDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlShCreditQueryTrail
     * @author Administrator
     * @description: 新增 算话人行信用报告查询轨迹表对象
     * @date 2017-12-21 19:45:40
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlShCreditQueryTrail(ExtWlShCreditQueryTrailDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlShCreditQueryTrail(paramMap);
		
		ExtWlShCreditQueryTrailDTO resultDto = (ExtWlShCreditQueryTrailDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlShCreditQueryTrail
     * @author Administrator
     * @description: 修改 算话人行信用报告查询轨迹表对象
     * @date 2017-12-21 19:45:40
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlShCreditQueryTrail(ExtWlShCreditQueryTrailDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlShCreditQueryTrail(paramMap);
	}
	/**
     * @title: deleteExtWlShCreditQueryTrailByPrimaryKey
     * @author Administrator
     * @description: 删除 算话人行信用报告查询轨迹表,按主键
     * @date 2017-12-21 19:45:40
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlShCreditQueryTrailByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlShCreditQueryTrailByPrimaryKey(paramMap);
	}

}

