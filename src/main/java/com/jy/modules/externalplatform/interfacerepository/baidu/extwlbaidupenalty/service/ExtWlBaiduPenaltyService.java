package com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidupenalty.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidupenalty.dto.ExtWlBaiduPenaltyDTO;
import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidupenalty.dao.ExtWlBaiduPenaltyDao;

/**
 * @classname: ExtWlBaiduPenaltyService
 * @description: 定义  百度金融行政处罚表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidupenalty.service.ExtWlBaiduPenaltyService")
public class ExtWlBaiduPenaltyService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlBaiduPenaltyDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 百度金融行政处罚表列表
     * @date 2017-12-13 16:42:29
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlBaiduPenaltyDTO> searchExtWlBaiduPenaltyByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlBaiduPenaltyDTO> dataList =  dao.searchExtWlBaiduPenaltyByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询百度金融行政处罚表列表
     * @date 2017-12-13 16:42:29
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlBaiduPenaltyDTO> searchExtWlBaiduPenalty(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlBaiduPenaltyDTO> dataList = dao.searchExtWlBaiduPenalty(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询百度金融行政处罚表对象
     * @date 2017-12-13 16:42:29
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlBaiduPenaltyDTO queryExtWlBaiduPenaltyByPrimaryKey(String id) throws Exception {
		
		ExtWlBaiduPenaltyDTO dto = dao.findExtWlBaiduPenaltyByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlBaiduPenaltyDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlBaiduPenalty
     * @author Administrator
     * @description: 新增 百度金融行政处罚表对象
     * @date 2017-12-13 16:42:29
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlBaiduPenalty(ExtWlBaiduPenaltyDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlBaiduPenalty(paramMap);
		
		ExtWlBaiduPenaltyDTO resultDto = (ExtWlBaiduPenaltyDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlBaiduPenalty
     * @author Administrator
     * @description: 修改 百度金融行政处罚表对象
     * @date 2017-12-13 16:42:29
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlBaiduPenalty(ExtWlBaiduPenaltyDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlBaiduPenalty(paramMap);
	}
	/**
     * @title: deleteExtWlBaiduPenaltyByPrimaryKey
     * @author Administrator
     * @description: 删除 百度金融行政处罚表,按主键
     * @date 2017-12-13 16:42:29
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlBaiduPenaltyByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlBaiduPenaltyByPrimaryKey(paramMap);
	}

	/**
	 * @methodName: insertBatchPenalty
	 * @param: penaltyList
	 * @describe: 批量 添加 百度金融行政处罚
	 * @auther: huangxianchao
	 * @date: 2017/12/15 0015
	 * @time: 上午 10:16
	 **/
	public void insertBatchPenalty(List<ExtWlBaiduPenaltyDTO> penaltyList) throws Exception{
		// TODO Auto-generated method stub
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("penaltyList", penaltyList);
		dao.insertBatchPenalty(paramMap);
	}

}

