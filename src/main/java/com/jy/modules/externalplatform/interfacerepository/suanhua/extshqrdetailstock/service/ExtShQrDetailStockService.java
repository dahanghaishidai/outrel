package com.jy.modules.externalplatform.interfacerepository.suanhua.extshqrdetailstock.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.suanhua.extshqrdetailstock.dao.ExtShQrDetailStockDao;
import com.jy.modules.externalplatform.interfacerepository.suanhua.extshqrdetailstock.dto.ExtShQrDetailStockDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtShQrDetailStockService
 * @description: 定义  算话征信查询记录查询详细 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhua.extshqrdetailstock.service.ExtShQrDetailStockService")
public class ExtShQrDetailStockService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtShQrDetailStockDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 算话征信查询记录查询详细列表
     * @date 2017-06-08 18:05:13
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtShQrDetailStockDTO> searchExtShQrDetailStockByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtShQrDetailStockDTO> dataList =  dao.searchExtShQrDetailStockByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话征信查询记录查询详细列表
     * @date 2017-06-08 18:05:13
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtShQrDetailStockDTO> searchExtShQrDetailStock(Map<String,Object> searchParams) throws Exception {
	    List<ExtShQrDetailStockDTO> dataList = dao.searchExtShQrDetailStock(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话征信查询记录查询详细对象
     * @date 2017-06-08 18:05:13
     * @param id
     * @return
     * @throws
     */ 
	public ExtShQrDetailStockDTO queryExtShQrDetailStockByPrimaryKey(String id) throws Exception {
		
		ExtShQrDetailStockDTO dto = dao.findExtShQrDetailStockByPrimaryKey(id);
		
		if(dto == null) dto = new ExtShQrDetailStockDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtShQrDetailStock
     * @author Administrator
     * @description: 新增 算话征信查询记录查询详细对象
     * @date 2017-06-08 18:05:13
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtShQrDetailStock(ExtShQrDetailStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtShQrDetailStock(paramMap);
		
		ExtShQrDetailStockDTO resultDto = (ExtShQrDetailStockDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	
	
	/**
	* @title: insertExtShQrDetailStockList
	* @author:陈东栋
	* @description: 批量新增 算话征信查询记录查询详细对象
	* @date 2017年8月3日 下午10:44:00
	* @param dataList
	* @param fkReportId
	* @throws Exception
	* @throws 
	*/ 
	public int insertExtShQrDetailStockList(List<ExtShQrDetailStockDTO> dataList,Long fkReportId) throws Exception{
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dtoList", dataList);
		paramMap.put("fkReportId", fkReportId);
		int count = dao.insertExtShQrDetailStockList(paramMap);
		return count;
	}
	
	/**
     * @title: updateExtShQrDetailStock
     * @author Administrator
     * @description: 修改 算话征信查询记录查询详细对象
     * @date 2017-06-08 18:05:13
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtShQrDetailStock(ExtShQrDetailStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtShQrDetailStock(paramMap);
	}
	/**
     * @title: deleteExtShQrDetailStockByPrimaryKey
     * @author Administrator
     * @description: 删除 算话征信查询记录查询详细,按主键
     * @date 2017-06-08 18:05:13
     * @param paramMap
     * @throws
     */ 
	public void deleteExtShQrDetailStockByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtShQrDetailStockByPrimaryKey(paramMap);
	}

}

