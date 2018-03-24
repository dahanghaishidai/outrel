package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrcompensates.service;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrcompensates.dao.ExtWlShSrCompensatesDao;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrcompensates.dto.ExtWlShSrCompensatesDTO;
import com.jy.platform.core.common.BaseDTO;
import net.sf.json.JSONArray;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @classname: ExtWlShSrCompensatesService
 * @description: 定义  算话人行结构化版(保证人代偿信息表) 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrcompensates.service.ExtWlShSrCompensatesService")
public class ExtWlShSrCompensatesService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlShSrCompensatesDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 算话人行结构化版(保证人代偿信息表)列表
     * @date 2017-12-21 19:53:29
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlShSrCompensatesDTO> searchExtWlShSrCompensatesByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlShSrCompensatesDTO> dataList =  dao.searchExtWlShSrCompensatesByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话人行结构化版(保证人代偿信息表)列表
     * @date 2017-12-21 19:53:29
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlShSrCompensatesDTO> searchExtWlShSrCompensates(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlShSrCompensatesDTO> dataList = dao.searchExtWlShSrCompensates(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话人行结构化版(保证人代偿信息表)对象
     * @date 2017-12-21 19:53:29
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlShSrCompensatesDTO queryExtWlShSrCompensatesByPrimaryKey(String id) throws Exception {
		
		ExtWlShSrCompensatesDTO dto = dao.findExtWlShSrCompensatesByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlShSrCompensatesDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlShSrCompensates
     * @author Administrator
     * @description: 新增 算话人行结构化版(保证人代偿信息表)对象
     * @date 2017-12-21 19:53:29
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlShSrCompensates(ExtWlShSrCompensatesDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlShSrCompensates(paramMap);
		
		ExtWlShSrCompensatesDTO resultDto = (ExtWlShSrCompensatesDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlShSrCompensates
     * @author Administrator
     * @description: 修改 算话人行结构化版(保证人代偿信息表)对象
     * @date 2017-12-21 19:53:29
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlShSrCompensates(ExtWlShSrCompensatesDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlShSrCompensates(paramMap);
	}
	/**
     * @title: deleteExtWlShSrCompensatesByPrimaryKey
     * @author Administrator
     * @description: 删除 算话人行结构化版(保证人代偿信息表),按主键
     * @date 2017-12-21 19:53:29
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlShSrCompensatesByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlShSrCompensatesByPrimaryKey(paramMap);
	}

	/**
	 * @methodName: insertExtWlShSrCompensatesList
	 * @param: [compensatesJsonArr, fkReportId]
	 * @describe: 批量新增 算话人行结构化版(保证人代偿信息表)列表
	 * @auther: huangxianchao
	 * @date: 2017/12/25 0025
	 * @time: 上午 10:37
	 **/
    public void insertExtWlShSrCompensatesList(List<ExtWlShSrCompensatesDTO> dataList, Long fkReportId) {

		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dtoList", dataList);
		paramMap.put("fkReportId", fkReportId);
		dao.insertExtWlShSrCompensatesList(paramMap);
    }
}

