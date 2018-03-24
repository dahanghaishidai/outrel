package com.jy.modules.externalplatform.interfacerepository.yszx.extyszxhdinfo.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.yszx.extyszxhdinfo.dto.ExtHdCreditInfoDTO;
import com.jy.modules.externalplatform.interfacerepository.yszx.extyszxhdinfo.dto.ExtHdPhoneBckLisDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;

/**
 * @author: szm
 */
@MyBatisRepository
public interface ExtHdMgBaseInfoDao {

	public ExtHdCreditInfoDTO searchExtHdCreditInfo(Map<String, Object> maps);
	
	public List<ExtHdPhoneBckLisDTO> searchExtHdPhoneBckLisByPaging(Map<String, Object> maps);
	
	public void insertExtHdCreditInfo(Map<String, Object> searchParams);
	
	public void insertExtHdPhoneBckLis(Map<String, Object> searchParams);
	
	public void insertExtHdWLCreditInfo(Map<String, Object> searchParams);
	
	public void insertExtHdWLPhoneBckLis(Map<String, Object> searchParams);
}
