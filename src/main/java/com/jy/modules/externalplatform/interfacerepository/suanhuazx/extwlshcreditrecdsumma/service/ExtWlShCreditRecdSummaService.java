package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshcreditrecdsumma.service;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshcreditrecdsumma.dao.ExtWlShCreditRecdSummaDao;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshcreditrecdsumma.dto.ExtWlShCreditRecdSummaDTO;
import com.jy.platform.core.common.BaseDTO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @classname: ExtWlShCreditRecdSummaService
 * @description: 定义  算话人行原版(信贷记录概要) 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshcreditrecdsumma.service.ExtWlShCreditRecdSummaService")
public class ExtWlShCreditRecdSummaService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlShCreditRecdSummaDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 算话人行原版(信贷记录概要)列表
     * @date 2017-12-21 19:46:19
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlShCreditRecdSummaDTO> searchExtWlShCreditRecdSummaByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlShCreditRecdSummaDTO> dataList =  dao.searchExtWlShCreditRecdSummaByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话人行原版(信贷记录概要)列表
     * @date 2017-12-21 19:46:19
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlShCreditRecdSummaDTO> searchExtWlShCreditRecdSumma(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlShCreditRecdSummaDTO> dataList = dao.searchExtWlShCreditRecdSumma(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话人行原版(信贷记录概要)对象
     * @date 2017-12-21 19:46:19
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlShCreditRecdSummaDTO queryExtWlShCreditRecdSummaByPrimaryKey(String id) throws Exception {
		
		ExtWlShCreditRecdSummaDTO dto = dao.findExtWlShCreditRecdSummaByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlShCreditRecdSummaDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlShCreditRecdSumma
     * @author Administrator
     * @description: 新增 算话人行原版(信贷记录概要)对象
     * @date 2017-12-21 19:46:19
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlShCreditRecdSumma(ExtWlShCreditRecdSummaDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlShCreditRecdSumma(paramMap);
		
		ExtWlShCreditRecdSummaDTO resultDto = (ExtWlShCreditRecdSummaDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlShCreditRecdSumma
     * @author Administrator
     * @description: 修改 算话人行原版(信贷记录概要)对象
     * @date 2017-12-21 19:46:19
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlShCreditRecdSumma(ExtWlShCreditRecdSummaDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlShCreditRecdSumma(paramMap);
	}
	/**
     * @title: deleteExtWlShCreditRecdSummaByPrimaryKey
     * @author Administrator
     * @description: 删除 算话人行原版(信贷记录概要),按主键
     * @date 2017-12-21 19:46:19
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlShCreditRecdSummaByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlShCreditRecdSummaByPrimaryKey(paramMap);
	}

	/**
	 * @methodName: insertExtWlShCreditRecordSummaryList
	 * @param: dtoList  fkReportId
	 * @describe: 批量新增 算话人行原版(信贷记录概要)列表
	 * @auther: huangxianchao
	 * @date: 2017/12/25 0025
	 * @time: 上午 9:10
	 **/
	public void insertExtWLShCreditRecordSummaryList(List<ExtWlShCreditRecdSummaDTO> dtoList ,Long fkReportId) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dtoList", dtoList);
		paramMap.put("fkReportId", fkReportId);
		dao.insertExtWlShCreditRecordSummaryList(paramMap);
	}
}

