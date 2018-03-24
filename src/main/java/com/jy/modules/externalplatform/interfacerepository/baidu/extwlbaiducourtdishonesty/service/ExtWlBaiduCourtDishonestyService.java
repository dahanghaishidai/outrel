package com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaiducourtdishonesty.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaiducourtdishonesty.dto.ExtWlBaiduCourtDishonestyDTO;
import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaiducourtdishonesty.dao.ExtWlBaiduCourtDishonestyDao;

/**
 * @classname: ExtWlBaiduCourtDishonestyService
 * @description: 定义  百度金融法院失信表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaiducourtdishonesty.service.ExtWlBaiduCourtDishonestyService")
public class ExtWlBaiduCourtDishonestyService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlBaiduCourtDishonestyDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 百度金融法院失信表列表
     * @date 2017-12-13 16:41:00
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlBaiduCourtDishonestyDTO> searchExtWlBaiduCourtDishonestyByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlBaiduCourtDishonestyDTO> dataList =  dao.searchExtWlBaiduCourtDishonestyByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询百度金融法院失信表列表
     * @date 2017-12-13 16:41:00
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlBaiduCourtDishonestyDTO> searchExtWlBaiduCourtDishonesty(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlBaiduCourtDishonestyDTO> dataList = dao.searchExtWlBaiduCourtDishonesty(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询百度金融法院失信表对象
     * @date 2017-12-13 16:41:00
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlBaiduCourtDishonestyDTO queryExtWlBaiduCourtDishonestyByPrimaryKey(String id) throws Exception {
		
		ExtWlBaiduCourtDishonestyDTO dto = dao.findExtWlBaiduCourtDishonestyByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlBaiduCourtDishonestyDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlBaiduCourtDishonesty
     * @author Administrator
     * @description: 新增 百度金融法院失信表对象
     * @date 2017-12-13 16:41:00
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlBaiduCourtDishonesty(ExtWlBaiduCourtDishonestyDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlBaiduCourtDishonesty(paramMap);
		
		ExtWlBaiduCourtDishonestyDTO resultDto = (ExtWlBaiduCourtDishonestyDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlBaiduCourtDishonesty
     * @author Administrator
     * @description: 修改 百度金融法院失信表对象
     * @date 2017-12-13 16:41:00
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlBaiduCourtDishonesty(ExtWlBaiduCourtDishonestyDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlBaiduCourtDishonesty(paramMap);
	}
	/**
     * @title: deleteExtWlBaiduCourtDishonestyByPrimaryKey
     * @author Administrator
     * @description: 删除 百度金融法院失信表,按主键
     * @date 2017-12-13 16:41:00
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlBaiduCourtDishonestyByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlBaiduCourtDishonestyByPrimaryKey(paramMap);
	}

	/**
	 * @methodName: insertBatchCourtDishonesty
	 * @param: courtDishonestyList
	 * @describe: 批量添加 百度金融法院失信
	 * @auther: huangxianchao
	 * @date: 2017/12/15 0015
	 * @time: 上午 10:19
	 **/
	public void insertBatchCourtDishonesty(List<ExtWlBaiduCourtDishonestyDTO> courtDishonestyList) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("courtDishonestyList", courtDishonestyList);
		dao.insertBatchCourtDishonesty(paramMap);
	}

}

