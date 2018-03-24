package com.jy.modules.externalplatform.interfacerepository.sh.extwlsharemainreport.utils;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

import net.sf.json.JSONObject;


/**
* @description: 算话共享报告接口 - 工具类
*/ 
public class ExtShShareUtil {
	
	/**
	* @title: lowJSONKey
	* @author:陈东栋
	* @description: 将JSONObject中的key变为小写
	* @date 2017年7月12日 下午9:08:35
	* @param jsonObj
	* @return
	* @throws 
	*/ 
	@SuppressWarnings("unchecked")
	public static JSONObject  lowJSONKey(JSONObject jsonObj){
		JSONObject retJsonObj = new JSONObject();
		for(Iterator<String> iter = jsonObj.keySet().iterator();iter.hasNext();){
			String key = iter.next();
			Object value = jsonObj.get(key);
			retJsonObj.put(key.toLowerCase(), value);
		}
	   return retJsonObj;
   }
	
	public static String getSeq() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date today = new Date();
        return sdf.format(today) + today.getTime();
    }
	

	/**
	* @title: getFormatDate
	* @author:陈东栋
	* @description: 根据时间间隔数，获取格式化日期
	* @date 2017年7月12日 下午5:31:20
	* @param calendarType  参见 Calendar类中的静态变量
	* @param variablesNum  间隔数
	* @return
	* @throws 
	*/ 
	public static String getFormatDate(int calendarType,int variablesNum) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
		Calendar calendar = Calendar.getInstance();  
		calendar.setTime(new Date());
		calendar.add(calendarType, variablesNum);
        return sdf.format(calendar.getTime());
    }
	
	@SuppressWarnings("rawtypes")
	public static Object jsonToBean(Class type, JSONObject json) throws Exception { 
        BeanInfo beanInfo = Introspector.getBeanInfo(type); // 获取类属性 
        Object obj = type.newInstance(); // 创建 JavaBean 对象 
        //给 JavaBean对象的属性赋值 
        PropertyDescriptor[] propertyDescriptors =  beanInfo.getPropertyDescriptors(); 
        for (int i = 0; i< propertyDescriptors.length; i++) { 
            PropertyDescriptor descriptor = propertyDescriptors[i]; 
            String propertyName = descriptor.getName(); 
            if (json.containsKey(propertyName)) { 
                //下面一句可以 try 起来，这样当一个属性赋值失败的时候就不会影响其他属性赋值。 
                try {
					Object value = json.get(propertyName); 
					Object[] args = new Object[1]; 
					args[0] = value; 
					descriptor.getWriteMethod().invoke(obj, args);
				} catch (Exception e) {
					
				} 
            } 
        } 
        return obj; 
    } 
}
