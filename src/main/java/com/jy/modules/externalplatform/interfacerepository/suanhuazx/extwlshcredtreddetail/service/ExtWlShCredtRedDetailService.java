package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshcredtreddetail.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshcredtreddetail.dto.ExtWlShCredtRedDetailDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshcredtreddetail.dao.ExtWlShCredtRedDetailDao;

/**
 * @classname: ExtWlShCredtRedDetailService
 * @description: 定义  算话人行原版(信贷记录详情) 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshcredtreddetail.service.ExtWlShCredtRedDetailService")
public class ExtWlShCredtRedDetailService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlShCredtRedDetailDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 算话人行原版(信贷记录详情)列表
     * @date 2017-12-21 19:47:07
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlShCredtRedDetailDTO> searchExtWlShCredtRedDetailByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlShCredtRedDetailDTO> dataList =  dao.searchExtWlShCredtRedDetailByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话人行原版(信贷记录详情)列表
     * @date 2017-12-21 19:47:07
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlShCredtRedDetailDTO> searchExtWlShCredtRedDetail(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlShCredtRedDetailDTO> dataList = dao.searchExtWlShCredtRedDetail(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话人行原版(信贷记录详情)对象
     * @date 2017-12-21 19:47:07
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlShCredtRedDetailDTO queryExtWlShCredtRedDetailByPrimaryKey(String id) throws Exception {
		
		ExtWlShCredtRedDetailDTO dto = dao.findExtWlShCredtRedDetailByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlShCredtRedDetailDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlShCredtRedDetail
     * @author Administrator
     * @description: 新增 算话人行原版(信贷记录详情)对象
     * @date 2017-12-21 19:47:07
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlShCredtRedDetail(ExtWlShCredtRedDetailDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlShCredtRedDetail(paramMap);
		
		ExtWlShCredtRedDetailDTO resultDto = (ExtWlShCredtRedDetailDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlShCredtRedDetail
     * @author Administrator
     * @description: 修改 算话人行原版(信贷记录详情)对象
     * @date 2017-12-21 19:47:07
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlShCredtRedDetail(ExtWlShCredtRedDetailDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlShCredtRedDetail(paramMap);
	}
	/**
     * @title: deleteExtWlShCredtRedDetailByPrimaryKey
     * @author Administrator
     * @description: 删除 算话人行原版(信贷记录详情),按主键
     * @date 2017-12-21 19:47:07
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlShCredtRedDetailByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlShCredtRedDetailByPrimaryKey(paramMap);
	}

	/**
	 * @methodName: insertExtShCreditRecordDetailList
	 * @param: [dtoList, fkReportId]
	 * @describe: 批量新增 算话人行原版(信贷记录详情)列表
	 * @auther: huangxianchao
	 * @date: 2017/12/25 0025
	 * @time: 上午 9:24
	 **/
	public void insertExtWlShCreditRecordDetailList(List<ExtWlShCredtRedDetailDTO> dtoList ,Long fkReportId) throws Exception{
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dtoList", dtoList);
		paramMap.put("fkReportId", fkReportId);
		dao.insertExtWlShCreditRecordDetailList(paramMap);
	}
}

