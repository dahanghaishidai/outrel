package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshcreditinvest.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.utils.SuanhuaConstant;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshcreditinvest.dto.ExtWlShCreditInvestDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshcreditinvest.dao.ExtWlShCreditInvestDao;

/**
 * @classname: ExtWlShCreditInvestService
 * @description: 定义  算话央行征信采集申请表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshcreditinvest.service.ExtWlShCreditInvestService")
public class ExtWlShCreditInvestService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlShCreditInvestDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 算话央行征信采集申请表列表
     * @date 2017-12-21 19:45:18
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlShCreditInvestDTO> searchExtWlShCreditInvestByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlShCreditInvestDTO> dataList =  dao.searchExtWlShCreditInvestByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话央行征信采集申请表列表
     * @date 2017-12-21 19:45:18
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlShCreditInvestDTO> searchExtWlShCreditInvest(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlShCreditInvestDTO> dataList = dao.searchExtWlShCreditInvest(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话央行征信采集申请表对象
     * @date 2017-12-21 19:45:18
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlShCreditInvestDTO queryExtWlShCreditInvestByPrimaryKey(String id) throws Exception {
		
		ExtWlShCreditInvestDTO dto = dao.findExtWlShCreditInvestByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlShCreditInvestDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlShCreditInvest
     * @author Administrator
     * @description: 新增 算话央行征信采集申请表对象
     * @date 2017-12-21 19:45:18
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlShCreditInvest(ExtWlShCreditInvestDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlShCreditInvest(paramMap);
		
		ExtWlShCreditInvestDTO resultDto = (ExtWlShCreditInvestDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlShCreditInvest
     * @author Administrator
     * @description: 修改 算话央行征信采集申请表对象
     * @date 2017-12-21 19:45:18
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlShCreditInvest(ExtWlShCreditInvestDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlShCreditInvest(paramMap);
	}
	/**
     * @title: deleteExtWlShCreditInvestByPrimaryKey
     * @author Administrator
     * @description: 删除 算话央行征信采集申请表,按主键
     * @date 2017-12-21 19:45:18
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlShCreditInvestByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlShCreditInvestByPrimaryKey(paramMap);
	}

	/**
	 * @methodName: updateExtShCreditInvestState
	 * @param: [dto, state]
	 * @describe: 更新 算话央行征信采集申请表对象[调用状态]
	 * @auther: huangxianchao
	 * @date: 2017/12/22 0022
	 * @time: 上午 10:54
	 **/
	public void updateExtWlShCreditInvestState(ExtWlShCreditInvestDTO dto,String state) throws Exception {

		Map<String, Object> paramMap = new HashMap<String, Object>();
		dto.setState(state);
		if(SuanhuaConstant.INVOKE_FAILED_STATE.equals(state)){//调用状态为失败时，调用次数累计加1
			long invokeTimes = dto.getInvokeTimes() != null ? dto.getInvokeTimes() + 1:1L;
			dto.setInvokeTimes(invokeTimes);
		}
		paramMap.put("dto", dto);
		dao.updateExtWlShCreditInvestState(paramMap);
	}

}

