package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrtraces.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrtraces.dto.ExtWlShSrTracesDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrtraces.dao.ExtWlShSrTracesDao;

/**
 * @classname: ExtWlShSrTracesService
 * @description: 定义  算话人行结构化版(查询记录表) 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrtraces.service.ExtWlShSrTracesService")
public class ExtWlShSrTracesService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlShSrTracesDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 算话人行结构化版(查询记录表)列表
     * @date 2017-12-21 19:57:13
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlShSrTracesDTO> searchExtWlShSrTracesByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlShSrTracesDTO> dataList =  dao.searchExtWlShSrTracesByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话人行结构化版(查询记录表)列表
     * @date 2017-12-21 19:57:13
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlShSrTracesDTO> searchExtWlShSrTraces(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlShSrTracesDTO> dataList = dao.searchExtWlShSrTraces(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话人行结构化版(查询记录表)对象
     * @date 2017-12-21 19:57:13
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlShSrTracesDTO queryExtWlShSrTracesByPrimaryKey(String id) throws Exception {
		
		ExtWlShSrTracesDTO dto = dao.findExtWlShSrTracesByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlShSrTracesDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlShSrTraces
     * @author Administrator
     * @description: 新增 算话人行结构化版(查询记录表)对象
     * @date 2017-12-21 19:57:13
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlShSrTraces(ExtWlShSrTracesDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlShSrTraces(paramMap);
		
		ExtWlShSrTracesDTO resultDto = (ExtWlShSrTracesDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlShSrTraces
     * @author Administrator
     * @description: 修改 算话人行结构化版(查询记录表)对象
     * @date 2017-12-21 19:57:13
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlShSrTraces(ExtWlShSrTracesDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlShSrTraces(paramMap);
	}
	/**
     * @title: deleteExtWlShSrTracesByPrimaryKey
     * @author Administrator
     * @description: 删除 算话人行结构化版(查询记录表),按主键
     * @date 2017-12-21 19:57:13
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlShSrTracesByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlShSrTracesByPrimaryKey(paramMap);
	}

	/**
	 * @methodName: insertExtWlShSrTracesList
	 * @param: [tracesList, fkReportId]
	 * @describe: 批量新增 算话人行结构化版(查询记录表)列表
	 * @auther: huangxianchao
	 * @date: 2017/12/25 0025
	 * @time: 上午 11:30
	 **/
    public void insertExtWlShSrTracesList(List<ExtWlShSrTracesDTO> tracesList, Long fkReportId) {

		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dtoList", tracesList);
		paramMap.put("fkReportId", fkReportId);
		dao.insertExtWlShSrTracesList(paramMap);
    }
}

