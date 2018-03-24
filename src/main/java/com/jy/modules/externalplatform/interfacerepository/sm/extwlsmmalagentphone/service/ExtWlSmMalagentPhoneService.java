package com.jy.modules.externalplatform.interfacerepository.sm.extwlsmmalagentphone.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.sm.extwlsmmalagentphone.dto.ExtWlSmMalagentPhoneDTO;
import com.jy.modules.externalplatform.interfacerepository.sm.extwlsmmalagentphone.dao.ExtWlSmMalagentPhoneDao;

/**
 * @classname: ExtWlSmMalagentPhoneService
 * @description: 定义  数美金融中介识别信息(外联平台表) 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.sm.extwlsmmalagentphone.service.ExtWlSmMalagentPhoneService")
public class ExtWlSmMalagentPhoneService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlSmMalagentPhoneDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 数美金融中介识别信息(外联平台表)列表
     * @date 2017-09-26 14:26:54
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlSmMalagentPhoneDTO> searchExtWlSmMalagentPhoneByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlSmMalagentPhoneDTO> dataList =  dao.searchExtWlSmMalagentPhoneByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询数美金融中介识别信息(外联平台表)列表
     * @date 2017-09-26 14:26:54
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlSmMalagentPhoneDTO> searchExtWlSmMalagentPhone(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlSmMalagentPhoneDTO> dataList = dao.searchExtWlSmMalagentPhone(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询数美金融中介识别信息(外联平台表)对象
     * @date 2017-09-26 14:26:54
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlSmMalagentPhoneDTO queryExtWlSmMalagentPhoneByPrimaryKey(String id) throws Exception {
		
		ExtWlSmMalagentPhoneDTO dto = dao.findExtWlSmMalagentPhoneByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlSmMalagentPhoneDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlSmMalagentPhone
     * @author Administrator
     * @description: 新增 数美金融中介识别信息(外联平台表)对象
     * @date 2017-09-26 14:26:54
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlSmMalagentPhone(ExtWlSmMalagentPhoneDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);

        if(null != dto.getIntoCustRefId() && StringUtils.isNotEmpty(dto.getIntoCustRefId().toString()) && StringUtils.isNotEmpty(dto.getPhone())){

            dao.updateExtWlSmMalagentPhoneByIntocustid(paramMap);
        }
        
		int count = dao.insertExtWlSmMalagentPhone(paramMap);
		
		ExtWlSmMalagentPhoneDTO resultDto = (ExtWlSmMalagentPhoneDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlSmMalagentPhone
     * @author Administrator
     * @description: 修改 数美金融中介识别信息(外联平台表)对象
     * @date 2017-09-26 14:26:54
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlSmMalagentPhone(ExtWlSmMalagentPhoneDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlSmMalagentPhone(paramMap);
	}
	/**
     * @title: deleteExtWlSmMalagentPhoneByPrimaryKey
     * @author Administrator
     * @description: 删除 数美金融中介识别信息(外联平台表),按主键
     * @date 2017-09-26 14:26:54
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlSmMalagentPhoneByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlSmMalagentPhoneByPrimaryKey(paramMap);
	}

}

