package com.jy.modules.externalplatform.interfacerepository.common;
import java.text.SimpleDateFormat;
import java.util.Map;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;

/**
 * @classname: ExtCommonExecDataService
 * @description: 定义 接口数据落地空类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.common.ExtCommonExecDataService")
public class ExtCommonExecDataService implements ExtSaveMessageDao {

	private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	
	/**
	 * 接收数据保存
	 * @param map
	 */
	public void saveMessage(Map<String,Object> map){
	    
	}
	
}

