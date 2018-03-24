package com.jy.modules.externalplatform.interfacerepository.zzc.extwlzzcblackresult.service;
import java.io.Serializable;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import com.alibaba.fastjson.JSONObject;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.JYLoggerUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.zzc.extwlzzcblackresult.dto.ExtWlZzcBlackResultDTO;
import com.jy.modules.externalplatform.interfacerepository.zzc.extwlzzcblackresult.dao.ExtWlZzcBlackResultDao;

/**
 * @classname: ExtWlZzcBlackResultService
 * @description: 定义  中智诚_黑名单查询表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.zzc.extwlzzcblackresult.service.ExtWlZzcBlackResultService")
public class ExtWlZzcBlackResultService implements Serializable, ExtSaveMessageDao {

	private static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

	@Autowired
	private ExtInterfaceLogService extInterfaceLogService;

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlZzcBlackResultDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 中智诚_黑名单查询表列表
     * @date 2017-12-18 11:09:25
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlZzcBlackResultDTO> searchExtWlZzcBlackResultByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlZzcBlackResultDTO> dataList =  dao.searchExtWlZzcBlackResultByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询中智诚_黑名单查询表列表
     * @date 2017-12-18 11:09:25
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlZzcBlackResultDTO> searchExtWlZzcBlackResult(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlZzcBlackResultDTO> dataList = dao.searchExtWlZzcBlackResult(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询中智诚_黑名单查询表对象
     * @date 2017-12-18 11:09:25
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlZzcBlackResultDTO queryExtWlZzcBlackResultByPrimaryKey(String id) throws Exception {
		
		ExtWlZzcBlackResultDTO dto = dao.findExtWlZzcBlackResultByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlZzcBlackResultDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlZzcBlackResult
     * @author Administrator
     * @description: 新增 中智诚_黑名单查询表对象
     * @date 2017-12-18 11:09:25
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlZzcBlackResult(ExtWlZzcBlackResultDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlZzcBlackResult(paramMap);
		
		ExtWlZzcBlackResultDTO resultDto = (ExtWlZzcBlackResultDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlZzcBlackResult
     * @author Administrator
     * @description: 修改 中智诚_黑名单查询表对象
     * @date 2017-12-18 11:09:25
     * @param dto
     * @return
     * @throws
     */
	public void updateExtWlZzcBlackResult(ExtWlZzcBlackResultDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlZzcBlackResult(paramMap);
	}
	/**
     * @title: deleteExtWlZzcBlackResultByPrimaryKey
     * @author Administrator
     * @description: 删除 中智诚_黑名单查询表,按主键
     * @date 2017-12-18 11:09:25
     * @param baseDto, ids
     * @throws
     */ 
	public void deleteExtWlZzcBlackResultByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlZzcBlackResultByPrimaryKey(paramMap);
	}

	/**
	 * @methodName: saveMessage
	 * @param: [map]
	 * @describe: 中智诚_黑名单查询数据落地
	 * @auther: huangxianchao
	 * @date: 2017/12/18 0018
	 * @time: 上午 11:16
	 **/
	@Override
	public void saveMessage(Map<String, Object> map) {
		String isSuccess = "0";
		String retCode = "";
		String retMsg = "";
		String fkBizId = "";

		//日志信息
		ExtInterfaceLogDTO interfaceLogDto = (ExtInterfaceLogDTO) map.get("interfaceLogDto");
		String results = (String)map.get("result");
		try{
			if(null == map.get("intoCustomerRefId")){
				map.put("intoCustomerRefId", "");//非贷款系统调用，这个没有值
			}
			if (StringUtils.isNotEmpty(results)){//有报文返回
				ExtWlZzcBlackResultDTO dto = new ExtWlZzcBlackResultDTO();
				if (null == map.get("intoCustomerRefId")){
					dto.setIntoCustRefId(Long.parseLong(map.get("intoCustomerRefId").toString()));
				}


				JSONObject ob = JSONObject.parseObject(results);
				 if (null != ob.getJSONObject("blacklist")){
					 interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
					 interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_1.getValue());
				 	isSuccess = "1";
				 	JSONObject bl = ob.getJSONObject("blacklist");
				 	if (null != bl.getJSONObject("pid")){

				 		dto.setPidBlacklevel(bl.getJSONObject("pid").getString("blackLevel"));
					}
					if (null != bl.getJSONObject("mobile")){
				 		dto.setMobileBlacklevel(bl.getJSONObject("mobile").getString("blackLevel"));

					}
					if (null != bl.getJSONObject("home_phone")){
						dto.setHomePhoneBlacklevel(bl.getJSONObject("home_phone").getString("blackLevel"));

					}
					if (null != bl.getJSONObject("home_address")){

						dto.setHomeAddressBlacklevel(bl.getJSONObject("home_address").getString("blackLevel"));
					}
					if (null != bl.getJSONObject("deviceId")){

						dto.setDeviceidBlacklevel(bl.getJSONObject("deviceId").getString("blackLevel"));
					}

				 }else if (null != ob.get("errorCode")){

				 	if (null != ob.get("errorMessage")){
						dto.setErrormsg(ob.getString("errorMessage"));
						retMsg = ob.getString("errorMessage");
					}

				 	retCode = ob.getString("errorCode");
				 	interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_5.getKey());
					interfaceLogDto.setRetMsg("调用中智诚_黑名单查询返回错误信息");
				 }

				 Long keyId = this.insertExtWlZzcBlackResult(dto);
				 if (null != keyId){
				 	fkBizId = String.valueOf(keyId);
				 }


			}else{//无报文返回

				interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				interfaceLogDto.setRetMsg("调用中智诚_黑名单查询查无");
			}

		}catch (Exception e){
			JYLoggerUtil.error(this.getClass(), "===保存中智诚_黑名单查询日志异常===接口日志ID:"+String.valueOf(map.get("interfaceId")), e);
			interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4.getKey());//解析回参出错
			interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_4.getValue());

		}finally {
			try {

				interfaceLogDto.setRetBody(results);
				interfaceLogDto.setExt2(isSuccess);
				interfaceLogDto.setExt3(retCode);
				interfaceLogDto.setExt4(retMsg);
				interfaceLogDto.setExt5(fkBizId);//管理主表ID
				extInterfaceLogService.insertExtInterfaceLog(interfaceLogDto);

			} catch (Exception e) {
				JYLoggerUtil.error(this.getClass(), "===保存中智诚_黑名单查询日志异常===接口日志ID:"+String.valueOf(map.get("interfaceId")), e);
			}

		}

	}
}

