package com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidutax.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidutax.dto.ExtWlBaiduTaxDTO;
import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidutax.dao.ExtWlBaiduTaxDao;

/**
 * @classname: ExtWlBaiduTaxService
 * @description: 定义  百度金融偷税漏税表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidutax.service.ExtWlBaiduTaxService")
public class ExtWlBaiduTaxService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlBaiduTaxDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 百度金融偷税漏税表列表
     * @date 2017-12-13 16:41:52
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlBaiduTaxDTO> searchExtWlBaiduTaxByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlBaiduTaxDTO> dataList =  dao.searchExtWlBaiduTaxByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询百度金融偷税漏税表列表
     * @date 2017-12-13 16:41:52
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlBaiduTaxDTO> searchExtWlBaiduTax(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlBaiduTaxDTO> dataList = dao.searchExtWlBaiduTax(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询百度金融偷税漏税表对象
     * @date 2017-12-13 16:41:52
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlBaiduTaxDTO queryExtWlBaiduTaxByPrimaryKey(String id) throws Exception {
		
		ExtWlBaiduTaxDTO dto = dao.findExtWlBaiduTaxByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlBaiduTaxDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlBaiduTax
     * @author Administrator
     * @description: 新增 百度金融偷税漏税表对象
     * @date 2017-12-13 16:41:52
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlBaiduTax(ExtWlBaiduTaxDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlBaiduTax(paramMap);
		
		ExtWlBaiduTaxDTO resultDto = (ExtWlBaiduTaxDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlBaiduTax
     * @author Administrator
     * @description: 修改 百度金融偷税漏税表对象
     * @date 2017-12-13 16:41:52
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlBaiduTax(ExtWlBaiduTaxDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlBaiduTax(paramMap);
	}
	/**
     * @title: deleteExtWlBaiduTaxByPrimaryKey
     * @author Administrator
     * @description: 删除 百度金融偷税漏税表,按主键
     * @date 2017-12-13 16:41:52
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlBaiduTaxByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlBaiduTaxByPrimaryKey(paramMap);
	}


	/**
	 * @methodName: insertBatchTax
	 * @param: taxList
	 * @describe: 批量添加 百度金融偷税漏税
	 * @auther: huangxianchao
	 * @date: 2017/12/15 0015
	 * @time: 上午 10:15
	 **/
	public void insertBatchTax(List<ExtWlBaiduTaxDTO> taxList) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("taxList", taxList);
		dao.insertBatchTax(paramMap);
	}

}

