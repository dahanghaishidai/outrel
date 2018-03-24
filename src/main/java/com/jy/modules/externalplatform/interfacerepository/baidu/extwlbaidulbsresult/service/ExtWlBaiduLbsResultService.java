package com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidulbsresult.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;
import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidulbsresult.dto.ExtWlBaiduLbsResultDTO;
import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidulbsresult.dao.ExtWlBaiduLbsResultDao;

/**
 * @classname: ExtWlBaiduLbsResultService
 * @description: 定义  百度金融LBS地址校验结果表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidulbsresult.service.ExtWlBaiduLbsResultService")
public class ExtWlBaiduLbsResultService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlBaiduLbsResultDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 百度金融LBS地址校验结果表列表
     * @date 2017-12-08 15:27:42
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlBaiduLbsResultDTO> searchExtWlBaiduLbsResultByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlBaiduLbsResultDTO> dataList =  dao.searchExtWlBaiduLbsResultByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询百度金融LBS地址校验结果表列表
     * @date 2017-12-08 15:27:42
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlBaiduLbsResultDTO> searchExtWlBaiduLbsResult(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlBaiduLbsResultDTO> dataList = dao.searchExtWlBaiduLbsResult(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询百度金融LBS地址校验结果表对象
     * @date 2017-12-08 15:27:42
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlBaiduLbsResultDTO queryExtWlBaiduLbsResultByPrimaryKey(String id) throws Exception {
		
		ExtWlBaiduLbsResultDTO dto = dao.findExtWlBaiduLbsResultByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlBaiduLbsResultDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlBaiduLbsResult
     * @author Administrator
     * @description: 新增 百度金融LBS地址校验结果表对象
     * @date 2017-12-08 15:27:42
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlBaiduLbsResult(ExtWlBaiduLbsResultDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlBaiduLbsResult(paramMap);
		
		ExtWlBaiduLbsResultDTO resultDto = (ExtWlBaiduLbsResultDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlBaiduLbsResult
     * @author Administrator
     * @description: 修改 百度金融LBS地址校验结果表对象
     * @date 2017-12-08 15:27:42
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlBaiduLbsResult(ExtWlBaiduLbsResultDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlBaiduLbsResult(paramMap);
	}
	/**
     * @title: deleteExtWlBaiduLbsResultByPrimaryKey
     * @author Administrator
     * @description: 删除 百度金融LBS地址校验结果表,按主键
     * @date 2017-12-08 15:27:42
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlBaiduLbsResultByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlBaiduLbsResultByPrimaryKey(paramMap);
	}
	/**
	 * @Description: 批量插入LBS地址校验结果数据
	 * @param @param lbsList   
	 * @return void  
	 * @throws
	 * @author huangxianchao
	 * @date 2017年12月12日 下午8:18:19
	 */
	public void insertBatchWlExtBaiduLbsResult(List<ExtWlBaiduLbsResultDTO> lbsList) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("lbsList", lbsList);
        dao.insertBatchExtWlBaiduLbsResult(paramMap);
		
	}

}

