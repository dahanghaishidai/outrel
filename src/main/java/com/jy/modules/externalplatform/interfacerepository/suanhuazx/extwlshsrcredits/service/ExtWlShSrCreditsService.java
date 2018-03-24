package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrcredits.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrcredits.dto.ExtWlShSrCreditsDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrcredits.dao.ExtWlShSrCreditsDao;

/**
 * @classname: ExtWlShSrCreditsService
 * @description: 定义  算话人行结构化版(信用卡表) 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrcredits.service.ExtWlShSrCreditsService")
public class ExtWlShSrCreditsService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlShSrCreditsDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 算话人行结构化版(信用卡表)列表
     * @date 2017-12-21 19:53:50
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlShSrCreditsDTO> searchExtWlShSrCreditsByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlShSrCreditsDTO> dataList =  dao.searchExtWlShSrCreditsByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话人行结构化版(信用卡表)列表
     * @date 2017-12-21 19:53:50
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlShSrCreditsDTO> searchExtWlShSrCredits(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlShSrCreditsDTO> dataList = dao.searchExtWlShSrCredits(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话人行结构化版(信用卡表)对象
     * @date 2017-12-21 19:53:50
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlShSrCreditsDTO queryExtWlShSrCreditsByPrimaryKey(String id) throws Exception {
		
		ExtWlShSrCreditsDTO dto = dao.findExtWlShSrCreditsByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlShSrCreditsDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlShSrCredits
     * @author Administrator
     * @description: 新增 算话人行结构化版(信用卡表)对象
     * @date 2017-12-21 19:53:50
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlShSrCredits(ExtWlShSrCreditsDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlShSrCredits(paramMap);
		
		ExtWlShSrCreditsDTO resultDto = (ExtWlShSrCreditsDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlShSrCredits
     * @author Administrator
     * @description: 修改 算话人行结构化版(信用卡表)对象
     * @date 2017-12-21 19:53:50
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlShSrCredits(ExtWlShSrCreditsDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlShSrCredits(paramMap);
	}
	/**
     * @title: deleteExtWlShSrCreditsByPrimaryKey
     * @author Administrator
     * @description: 删除 算话人行结构化版(信用卡表),按主键
     * @date 2017-12-21 19:53:50
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlShSrCreditsByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlShSrCreditsByPrimaryKey(paramMap);
	}

	/**
	 * @methodName: insertExtWlShSrCreditsList
	 * @param: [creditsList, fkReportId]
	 * @describe: 批量新增 算话人行结构化版(信用卡表)列表
	 * @auther: huangxianchao
	 * @date: 2017/12/25 0025
	 * @time: 上午 10:54
	 **/
    public void insertExtWlShSrCreditsList(List<ExtWlShSrCreditsDTO> creditsList, Long fkReportId) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dtoList", creditsList);
		paramMap.put("fkReportId", fkReportId);
		dao.insertExtWlShSrCreditsList(paramMap);

    }
}

