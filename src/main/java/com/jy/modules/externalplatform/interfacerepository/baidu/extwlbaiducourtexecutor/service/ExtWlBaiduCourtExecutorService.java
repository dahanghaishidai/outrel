package com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaiducourtexecutor.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaiducourtexecutor.dto.ExtWlBaiduCourtExecutorDTO;
import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaiducourtexecutor.dao.ExtWlBaiduCourtExecutorDao;

/**
 * @classname: ExtWlBaiduCourtExecutorService
 * @description: 定义  百度金融法院执行人表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaiducourtexecutor.service.ExtWlBaiduCourtExecutorService")
public class ExtWlBaiduCourtExecutorService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlBaiduCourtExecutorDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 百度金融法院执行人表列表
     * @date 2017-12-13 16:41:37
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlBaiduCourtExecutorDTO> searchExtWlBaiduCourtExecutorByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlBaiduCourtExecutorDTO> dataList =  dao.searchExtWlBaiduCourtExecutorByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询百度金融法院执行人表列表
     * @date 2017-12-13 16:41:37
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlBaiduCourtExecutorDTO> searchExtWlBaiduCourtExecutor(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlBaiduCourtExecutorDTO> dataList = dao.searchExtWlBaiduCourtExecutor(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询百度金融法院执行人表对象
     * @date 2017-12-13 16:41:37
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlBaiduCourtExecutorDTO queryExtWlBaiduCourtExecutorByPrimaryKey(String id) throws Exception {
		
		ExtWlBaiduCourtExecutorDTO dto = dao.findExtWlBaiduCourtExecutorByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlBaiduCourtExecutorDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlBaiduCourtExecutor
     * @author Administrator
     * @description: 新增 百度金融法院执行人表对象
     * @date 2017-12-13 16:41:37
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlBaiduCourtExecutor(ExtWlBaiduCourtExecutorDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlBaiduCourtExecutor(paramMap);
		
		ExtWlBaiduCourtExecutorDTO resultDto = (ExtWlBaiduCourtExecutorDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlBaiduCourtExecutor
     * @author Administrator
     * @description: 修改 百度金融法院执行人表对象
     * @date 2017-12-13 16:41:37
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlBaiduCourtExecutor(ExtWlBaiduCourtExecutorDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlBaiduCourtExecutor(paramMap);
	}
	/**
     * @title: deleteExtWlBaiduCourtExecutorByPrimaryKey
     * @author Administrator
     * @description: 删除 百度金融法院执行人表,按主键
     * @date 2017-12-13 16:41:37
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlBaiduCourtExecutorByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlBaiduCourtExecutorByPrimaryKey(paramMap);
	}

	/**
	 * @methodName: insertBatchCourtExecutor
	 * @param: courtExecutorList
	 * @describe:  批量添加 百度金融法院执行人
	 * @auther: huangxianchao
	 * @date: 2017/12/15 0015
	 * @time: 上午 10:18
	 **/
	public void insertBatchCourtExecutor(List<ExtWlBaiduCourtExecutorDTO> courtExecutorList) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("courtExecutorList", courtExecutorList);
		dao.insertBatchCourtExecutor(paramMap);
	}

}

