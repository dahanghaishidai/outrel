package com.jy.modules.externalplatform.interfacerepository.sm.extwlsmpackidentify.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jy.modules.externalplatform.interfacerepository.sm.extwlsmpackidentify.dao.ExtWlSmPackIdentifyDao;
import com.jy.modules.externalplatform.interfacerepository.sm.extwlsmpackidentify.dto.ExtWlSmPackIdentifyDTO;
import com.jy.modules.externalplatform.interfacerepository.sm.extwlsmpackmonthide.dto.ExtWlSmPackMonthIdeDTO;
import com.jy.modules.externalplatform.interfacerepository.sm.extwlsmpackmonthide.service.ExtWlSmPackMonthIdeService;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.BaseDTO;
import com.jy.platform.core.common.JYLoggerUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @classname: ExtWlSmPackIdentifyService
 * @description: 定义  数美中介包装风险识别服务（主表） 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.sm.extwlsmpackidentify.service.ExtWlSmPackIdentifyService")
public class ExtWlSmPackIdentifyService implements Serializable, ExtSaveMessageDao {

	private static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

	@Autowired
	private ExtInterfaceLogService extInterfaceLogService;

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlSmPackIdentifyDao dao;

	@Autowired
	private ExtWlSmPackMonthIdeService extWlSmPackMonthIdeService;

	/**
     * @author Administrator
     * @description: 分页查询 数美中介包装风险识别服务（主表）列表
     * @date 2017-12-19 10:36:10
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlSmPackIdentifyDTO> searchExtWlSmPackIdentifyByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlSmPackIdentifyDTO> dataList =  dao.searchExtWlSmPackIdentifyByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询数美中介包装风险识别服务（主表）列表
     * @date 2017-12-19 10:36:10
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlSmPackIdentifyDTO> searchExtWlSmPackIdentify(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlSmPackIdentifyDTO> dataList = dao.searchExtWlSmPackIdentify(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询数美中介包装风险识别服务（主表）对象
     * @date 2017-12-19 10:36:10
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlSmPackIdentifyDTO queryExtWlSmPackIdentifyByPrimaryKey(String id) throws Exception {
		
		ExtWlSmPackIdentifyDTO dto = dao.findExtWlSmPackIdentifyByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlSmPackIdentifyDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlSmPackIdentify
     * @author Administrator
     * @description: 新增 数美中介包装风险识别服务（主表）对象
     * @date 2017-12-19 10:36:10
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlSmPackIdentify(ExtWlSmPackIdentifyDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlSmPackIdentify(paramMap);
		
		ExtWlSmPackIdentifyDTO resultDto = (ExtWlSmPackIdentifyDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlSmPackIdentify
     * @author Administrator
     * @description: 修改 数美中介包装风险识别服务（主表）对象
     * @date 2017-12-19 10:36:10
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlSmPackIdentify(ExtWlSmPackIdentifyDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlSmPackIdentify(paramMap);
	}
	/**
     * @title: deleteExtWlSmPackIdentifyByPrimaryKey
     * @author Administrator
     * @description: 删除 数美中介包装风险识别服务（主表）,按主键
     * @date 2017-12-19 10:36:10
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlSmPackIdentifyByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlSmPackIdentifyByPrimaryKey(paramMap);
	}

	/**
	 * @methodName: saveMessage
	 * @param: [map]
	 * @describe: 数美中介包装风险识别服务 接口数据落地
	 * @auther: huangxianchao
	 * @date: 2017/12/19 0019
	 * @time: 上午 10:42
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
			//有报文返回
			if (StringUtils.isNotEmpty(results)){
				JSONObject monthOb = null;
				JSONObject ob = JSONObject.parseObject(results);
				ExtWlSmPackIdentifyDTO dto = new ExtWlSmPackIdentifyDTO();
				if (null != map.get("intoCustomerRefId") && !"".equals(map.get("intoCustomerRefId"))){
					dto.setIntoCustRefId(Long.parseLong(map.get("intoCustomerRefId").toString()));
				}

				if(null != ob.get("code")){
					retCode = ob.get("code").toString();
				}
				if(null != ob.get("message")){
					retMsg = ob.get("message").toString();
				}
				dto.setCode(retCode);
				dto.setMessage(retMsg);
				//成功
				if ("1100".equals(retCode)){
					isSuccess = "1";
					interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
					interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_1.getValue());

					JSONObject detail = ob.getJSONObject("detail");

					if(null != detail){
						monthOb = detail.getJSONObject("month");
						if (null != detail.get("incomingCallTimes")){
							dto.setIncomingCallTimes(detail.get("incomingCallTimes").toString());

						}
						if (null != detail.get("incomingCallDuration")){
							dto.setIncomingCallDuration(detail.get("incomingCallDuration").toString());

						}
						if (null != detail.get("outgoingCallTimes")){
							dto.setOutgoingCallTimes(detail.get("outgoingCallTimes").toString());

						}
						if (null != detail.get("outgoingCallDuration")){
							dto.setOutgoingCallDuration(detail.get("outgoingCallDuration").toString());

						}
						if (null != detail.get("contactMatch")){
							dto.setContactMatch(detail.get("contactMatch").toString());

						}
					}

				}else {
					interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_5.getKey());
					interfaceLogDto.setRetMsg("调用数美中介包装风险识别服务返回错误信息");

				}

				//主表插入数据
				Long keyId = this.insertExtWlSmPackIdentify(dto);
				if (null != keyId){
					fkBizId = String.valueOf(keyId);
				}
				if (null != monthOb){

					Set<String> keyString = monthOb.keySet();
					Iterator<String> keys = keyString.iterator();
					while (keys.hasNext()){
						String key = keys.next();
						ExtWlSmPackMonthIdeDTO monthIdeDto = JSONObject.parseObject(monthOb.get(key).toString(), ExtWlSmPackMonthIdeDTO.class);
						monthIdeDto.setSmPackId(keyId);
						monthIdeDto.setMonthTime(key);
						extWlSmPackMonthIdeService.insertExtWlSmPackMonthIde(monthIdeDto);
					}

				}

			}else{//无报文返回

				interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				interfaceLogDto.setRetMsg("调用数美中介包装风险识别服务查无");
			}

		}catch (Exception e){
			JYLoggerUtil.error(this.getClass(), "===保存数美中介包装风险识别服务日志异常===接口日志ID:"+String.valueOf(map.get("interfaceId")), e);
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
				JYLoggerUtil.error(this.getClass(), "===保存数美中介包装风险识别服务日志异常===接口日志ID:"+String.valueOf(map.get("interfaceId")), e);
			}

		}

	}
}

