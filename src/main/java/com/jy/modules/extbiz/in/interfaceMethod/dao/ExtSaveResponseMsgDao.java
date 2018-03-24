package com.jy.modules.extbiz.in.interfaceMethod.dao;

import java.util.Map;

import com.jy.platform.core.mybatis.MyBatisRepository;
@MyBatisRepository
public interface ExtSaveResponseMsgDao {

	public void saveMessage(Map<String,Object> map);
}
