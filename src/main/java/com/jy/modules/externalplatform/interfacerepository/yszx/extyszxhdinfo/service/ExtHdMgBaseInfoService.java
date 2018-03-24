package com.jy.modules.externalplatform.interfacerepository.yszx.extyszxhdinfo.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.yszx.extyszxhdinfo.dao.ExtHdMgBaseInfoDao;
import com.jy.modules.externalplatform.interfacerepository.yszx.extyszxhdinfo.dto.ExtHdCreditInfoDTO;
import com.jy.modules.externalplatform.interfacerepository.yszx.extyszxhdinfo.dto.ExtHdPhoneBckLisDTO;

@Service
public class ExtHdMgBaseInfoService  implements Serializable{

	@Autowired
	private ExtHdMgBaseInfoDao extHdMgBaseInfoDao;

	public ExtHdCreditInfoDTO searchExtHdCreditInfo(Map<String, Object> maps) {
		return extHdMgBaseInfoDao.searchExtHdCreditInfo(maps);
	}
	public List<ExtHdPhoneBckLisDTO> searchExtHdPhoneBckLisByPaging(Map<String, Object> maps) {
		return extHdMgBaseInfoDao.searchExtHdPhoneBckLisByPaging(maps);
	}

}
