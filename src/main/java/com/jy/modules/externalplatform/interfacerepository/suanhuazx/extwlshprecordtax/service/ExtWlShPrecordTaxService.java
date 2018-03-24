package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshprecordtax.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshprecordtax.dto.ExtWlShPrecordTaxDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshprecordtax.dao.ExtWlShPrecordTaxDao;

/**
 * @classname: ExtWlShPrecordTaxService
 * @description: 定义  算话人行原版(公共记录_欠税记录表) 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshprecordtax.service.ExtWlShPrecordTaxService")
public class ExtWlShPrecordTaxService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlShPrecordTaxDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 算话人行原版(公共记录_欠税记录表)列表
     * @date 2017-12-21 19:50:26
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlShPrecordTaxDTO> searchExtWlShPrecordTaxByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlShPrecordTaxDTO> dataList =  dao.searchExtWlShPrecordTaxByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话人行原版(公共记录_欠税记录表)列表
     * @date 2017-12-21 19:50:26
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlShPrecordTaxDTO> searchExtWlShPrecordTax(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlShPrecordTaxDTO> dataList = dao.searchExtWlShPrecordTax(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话人行原版(公共记录_欠税记录表)对象
     * @date 2017-12-21 19:50:26
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlShPrecordTaxDTO queryExtWlShPrecordTaxByPrimaryKey(String id) throws Exception {
		
		ExtWlShPrecordTaxDTO dto = dao.findExtWlShPrecordTaxByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlShPrecordTaxDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlShPrecordTax
     * @author Administrator
     * @description: 新增 算话人行原版(公共记录_欠税记录表)对象
     * @date 2017-12-21 19:50:26
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlShPrecordTax(ExtWlShPrecordTaxDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlShPrecordTax(paramMap);
		
		ExtWlShPrecordTaxDTO resultDto = (ExtWlShPrecordTaxDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlShPrecordTax
     * @author Administrator
     * @description: 修改 算话人行原版(公共记录_欠税记录表)对象
     * @date 2017-12-21 19:50:26
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlShPrecordTax(ExtWlShPrecordTaxDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlShPrecordTax(paramMap);
	}
	/**
     * @title: deleteExtWlShPrecordTaxByPrimaryKey
     * @author Administrator
     * @description: 删除 算话人行原版(公共记录_欠税记录表),按主键
     * @date 2017-12-21 19:50:26
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlShPrecordTaxByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlShPrecordTaxByPrimaryKey(paramMap);
	}

	/**
	 * @methodName: insertExtWlShPrecordTaxList
	 * @param: [dtoList, fkReportId]
	 * @describe: 批量新增 算话人行原版(公共记录_欠税记录表)列表
	 * @auther: huangxianchao
	 * @date: 2017/12/25 0025
	 * @time: 上午 9:32
	 **/
    public void insertExtWlShPrecordTaxList(List<ExtWlShPrecordTaxDTO> dtoList, Long fkReportId) {

		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dtoList", dtoList);
		paramMap.put("fkReportId", fkReportId);
		dao.insertExtWlShPrecordTaxList(paramMap);
    }
}

