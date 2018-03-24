package com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaiduequityfreeze.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaiduequityfreeze.dto.ExtWlBaiduEquityFreezeDTO;
import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaiduequityfreeze.dao.ExtWlBaiduEquityFreezeDao;

/**
 * @classname: ExtWlBaiduEquityFreezeService
 * @description: 定义  百度金融股权冻结表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaiduequityfreeze.service.ExtWlBaiduEquityFreezeService")
public class ExtWlBaiduEquityFreezeService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlBaiduEquityFreezeDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 百度金融股权冻结表列表
     * @date 2017-12-13 16:42:09
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlBaiduEquityFreezeDTO> searchExtWlBaiduEquityFreezeByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlBaiduEquityFreezeDTO> dataList =  dao.searchExtWlBaiduEquityFreezeByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询百度金融股权冻结表列表
     * @date 2017-12-13 16:42:09
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlBaiduEquityFreezeDTO> searchExtWlBaiduEquityFreeze(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlBaiduEquityFreezeDTO> dataList = dao.searchExtWlBaiduEquityFreeze(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询百度金融股权冻结表对象
     * @date 2017-12-13 16:42:09
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlBaiduEquityFreezeDTO queryExtWlBaiduEquityFreezeByPrimaryKey(String id) throws Exception {
		
		ExtWlBaiduEquityFreezeDTO dto = dao.findExtWlBaiduEquityFreezeByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlBaiduEquityFreezeDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlBaiduEquityFreeze
     * @author Administrator
     * @description: 新增 百度金融股权冻结表对象
     * @date 2017-12-13 16:42:09
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlBaiduEquityFreeze(ExtWlBaiduEquityFreezeDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlBaiduEquityFreeze(paramMap);
		
		ExtWlBaiduEquityFreezeDTO resultDto = (ExtWlBaiduEquityFreezeDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlBaiduEquityFreeze
     * @author Administrator
     * @description: 修改 百度金融股权冻结表对象
     * @date 2017-12-13 16:42:09
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlBaiduEquityFreeze(ExtWlBaiduEquityFreezeDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlBaiduEquityFreeze(paramMap);
	}
	/**
     * @title: deleteExtWlBaiduEquityFreezeByPrimaryKey
     * @author Administrator
     * @description: 删除 百度金融股权冻结表,按主键
     * @date 2017-12-13 16:42:09
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlBaiduEquityFreezeByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlBaiduEquityFreezeByPrimaryKey(paramMap);
	}

	/**
	 * @methodName: insertBatchEquityFreeze
	 * @param: equityFreezeList
	 * @describe: 批量添加 百度金融股权冻结
	 * @auther: huangxianchao
	 * @date: 2017/12/15 0015
	 * @time: 上午 10:17
	 **/
	public void insertBatchEquityFreeze(List<ExtWlBaiduEquityFreezeDTO> equityFreezeList) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("equityFreezeList", equityFreezeList);
		dao.insertBatchEquityFreeze(paramMap);
	}

}

