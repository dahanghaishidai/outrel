package com.jy.modules.externalplatform.interfacerest.dao;

import java.util.Map;

import com.jy.platform.core.mybatis.MyBatisRepository;
@MyBatisRepository
public interface ExtSaveMessageDao {

	public void saveMessage(Map<String,Object> map);
}
