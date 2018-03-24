package com.jy.modules.externalplatform.interfacerepository.sh.extwlsharespectrade.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharespectrade.dto.ExtWlShareSpectradeDTO;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharespectrade.dao.ExtWlShareSpectradeDao;

/**
 * @classname: ExtWlShareSpectradeService
 * @description: 定义  算话共享报告_异常交易信息列表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.sh.extwlsharespectrade.service.ExtWlShareSpectradeService")
public class ExtWlShareSpectradeService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlShareSpectradeDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 算话共享报告_异常交易信息列表列表
     * @date 2017-12-07 19:53:42
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlShareSpectradeDTO> searchExtWlShareSpectradeByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlShareSpectradeDTO> dataList =  dao.searchExtWlShareSpectradeByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话共享报告_异常交易信息列表列表
     * @date 2017-12-07 19:53:42
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlShareSpectradeDTO> searchExtWlShareSpectrade(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlShareSpectradeDTO> dataList = dao.searchExtWlShareSpectrade(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话共享报告_异常交易信息列表对象
     * @date 2017-12-07 19:53:42
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlShareSpectradeDTO queryExtWlShareSpectradeByPrimaryKey(String id) throws Exception {
		
		ExtWlShareSpectradeDTO dto = dao.findExtWlShareSpectradeByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlShareSpectradeDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlShareSpectrade
     * @author Administrator
     * @description: 新增 算话共享报告_异常交易信息列表对象
     * @date 2017-12-07 19:53:42
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlShareSpectrade(ExtWlShareSpectradeDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlShareSpectrade(paramMap);
		
		ExtWlShareSpectradeDTO resultDto = (ExtWlShareSpectradeDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlShareSpectrade
     * @author Administrator
     * @description: 修改 算话共享报告_异常交易信息列表对象
     * @date 2017-12-07 19:53:42
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlShareSpectrade(ExtWlShareSpectradeDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlShareSpectrade(paramMap);
	}
	/**
     * @title: deleteExtWlShareSpectradeByPrimaryKey
     * @author Administrator
     * @description: 删除 算话共享报告_异常交易信息列表,按主键
     * @date 2017-12-07 19:53:42
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlShareSpectradeByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlShareSpectradeByPrimaryKey(paramMap);
	}

    /**
     * @title: insertExtWlShareSpectradeList
     * @author: dongkangning
     * @description: 批量新增 算话共享报告_异常交易信息列表
     * @date 2017年12月8日 下午5:25:01
     * @param specTradeList
     * @param tradeType
     * @param fkReportId
     * @throws
     */
    public long insertExtWlShareSpectradeList(List<ExtWlShareSpectradeDTO> specTradeList, String tradeType,
            Long fkReportId) {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("dtoList", specTradeList);
        paramMap.put("tradeType", tradeType);
        paramMap.put("fkReportId", fkReportId);
        int count = dao.insertExtWlShareSpectradeList(paramMap);
        return (long) count;
    }

}

