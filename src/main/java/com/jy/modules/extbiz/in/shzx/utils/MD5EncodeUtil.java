package com.jy.modules.extbiz.in.shzx.utils;

import java.security.MessageDigest;
import java.util.Iterator;
import java.util.Map;

public class MD5EncodeUtil {

	/**
	 * MD5摘要加密
	 * @param msg
	 * @param charset
	 * @return
	 */
	 public static  String md5(String msg, String charset) {
	        try {
	            System.out.println("md5Src:" + msg);
	            MessageDigest digest = MessageDigest.getInstance("md5");
	            byte[] hashedBytes = digest.digest(msg.getBytes(charset));
	            String rst = byts2hexstr(hashedBytes);
	            System.out.println("md5:" + rst.toUpperCase());
	            return rst;
	        } catch (Exception ex) {
	        }
	        return "";
	    }

	  public static String byts2hexstr(byte[] arrayBytes) {
	        StringBuilder sb = new StringBuilder();
	        String tmp = null;
	        for (int i = 0; i < arrayBytes.length; i++) {
	            tmp = Integer.toHexString(arrayBytes[i] & 0xff);
	            sb.append(tmp.length() == 1 ? "0" + tmp : tmp);
	        }
	        return sb.toString();
	   }
	  
	  public static  void hash(Map<String, String> param,String orgSecretKey) {
	        StringBuilder sb = new StringBuilder();
	        Iterator iterator = param.keySet().iterator();
	        while (iterator.hasNext()) {
	            sb.append(param.get(iterator.next()));
	        }
	        param.put("hash", md5(sb.toString() + orgSecretKey, "UTF-8").toUpperCase());
	   }
	/**
	 * @methodName: hashObj
	 * @param: [param, orgSecretKey]
	 * @describe: 获取哈希值
	 * @auther: 董康宁
	 * @date: 2017/12/25
	 * @time: 16:30
	 */
	public static  void hashObj(Map<String, Object> param,String orgSecretKey) {
		StringBuilder sb = new StringBuilder();
		Iterator iterator = param.keySet().iterator();
		while (iterator.hasNext()) {
			sb.append(param.get(iterator.next()));
		}
		param.put("hash", md5(sb.toString() + orgSecretKey, "UTF-8").toUpperCase());
	}
}
