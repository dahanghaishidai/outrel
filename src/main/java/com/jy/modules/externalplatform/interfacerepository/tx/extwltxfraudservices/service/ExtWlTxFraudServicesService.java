package com.jy.modules.externalplatform.interfacerepository.tx.extwltxfraudservices.service;
import java.io.Serializable;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jy.modules.externalplatform.interfacerepository.tx.extwltxriskdetail.dto.ExtWlTxRiskDetailDTO;
import com.jy.modules.externalplatform.interfacerepository.tx.extwltxriskdetail.service.ExtWlTxRiskDetailService;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.JYLoggerUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.tx.extwltxfraudservices.dto.ExtWlTxFraudServicesDTO;
import com.jy.modules.externalplatform.interfacerepository.tx.extwltxfraudservices.dao.ExtWlTxFraudServicesDao;

/**
 * @classname: ExtWlTxFraudServicesService
 * @description: 定义  腾讯_反欺诈服务(主表) 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.tx.extwltxfraudservices.service.ExtWlTxFraudServicesService")
public class ExtWlTxFraudServicesService implements Serializable, ExtSaveMessageDao {

	private static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

	@Autowired
	private ExtInterfaceLogService extInterfaceLogService;

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlTxFraudServicesDao dao;
	@Autowired
	private ExtWlTxRiskDetailService extWlTxRiskDetailService;

	/**
     * @author Administrator
     * @description: 分页查询 腾讯_反欺诈服务(主表)列表
     * @date 2017-12-18 15:22:08
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlTxFraudServicesDTO> searchExtWlTxFraudServicesByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlTxFraudServicesDTO> dataList =  dao.searchExtWlTxFraudServicesByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询腾讯_反欺诈服务(主表)列表
     * @date 2017-12-18 15:22:08
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlTxFraudServicesDTO> searchExtWlTxFraudServices(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlTxFraudServicesDTO> dataList = dao.searchExtWlTxFraudServices(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询腾讯_反欺诈服务(主表)对象
     * @date 2017-12-18 15:22:08
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlTxFraudServicesDTO queryExtWlTxFraudServicesByPrimaryKey(String id) throws Exception {
		
		ExtWlTxFraudServicesDTO dto = dao.findExtWlTxFraudServicesByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlTxFraudServicesDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlTxFraudServices
     * @author Administrator
     * @description: 新增 腾讯_反欺诈服务(主表)对象
     * @date 2017-12-18 15:22:08
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlTxFraudServices(ExtWlTxFraudServicesDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlTxFraudServices(paramMap);
		
		ExtWlTxFraudServicesDTO resultDto = (ExtWlTxFraudServicesDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlTxFraudServices
     * @author Administrator
     * @description: 修改 腾讯_反欺诈服务(主表)对象
     * @date 2017-12-18 15:22:08
     * @param dto
     * @return
     * @throws
     */
	public void updateExtWlTxFraudServices(ExtWlTxFraudServicesDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlTxFraudServices(paramMap);
	}
	/**
     * @title: deleteExtWlTxFraudServicesByPrimaryKey
     * @author Administrator
     * @description: 删除 腾讯_反欺诈服务(主表),按主键
     * @date 2017-12-18 15:22:08
     * @param baseDto
     * @throws
     */ 
	public void deleteExtWlTxFraudServicesByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlTxFraudServicesByPrimaryKey(paramMap);
	}

	/**
	 * @methodName: saveMessage
	 * @param: [map]
	 * @describe: 腾讯反欺诈服务 接口数据落地
	 * @auther: huangxianchao
	 * @date: 2017/12/18 0018
	 * @time: 下午 3:34
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

				JSONObject ob = JSONObject.parseObject(results);
				if (null != ob.get("message")){
					retMsg = ob.get("message").toString();
				}
				if(null != ob.get("code")){
					retCode = ob.getString("code");
					if("0".equals(ob.get("code").toString())){
						interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
						interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_1.getValue());
						isSuccess = "1";
						ExtWlTxFraudServicesDTO dto = JSONObject.parseObject(results, ExtWlTxFraudServicesDTO.class);

						Long keyId = this.insertExtWlTxFraudServices(dto);
						if(null != keyId){
							fkBizId = String.valueOf(keyId);
						}

						if(null != ob.get("riskInfo")){
							//转成一个数组
							List<ExtWlTxRiskDetailDTO> riskDetails =   JSONObject.parseArray(ob.get("riskInfo").toString(), ExtWlTxRiskDetailDTO.class);
							for (ExtWlTxRiskDetailDTO riskDetailDto : riskDetails){
								riskDetailDto.setTxFraudId(keyId);
								extWlTxRiskDetailService.insertExtWlTxRiskDetail(riskDetailDto);

							}
						}

					}else{
						interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_5.getKey());
						interfaceLogDto.setRetMsg("调用腾讯反欺诈服务接口返回错误信息");
					}
				}


			}else {
				interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				interfaceLogDto.setRetMsg("调用腾讯反欺诈服务接口查无");
			}

		}catch (Exception e){
			JYLoggerUtil.error(this.getClass(), "===保存腾讯反欺诈服务接口日志异常===接口日志ID:"+String.valueOf(map.get("interfaceId")), e);
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
				JYLoggerUtil.error(this.getClass(), "===保存腾讯反欺诈服务接口日志异常===接口日志ID:"+String.valueOf(map.get("interfaceId")), e);
			}
		}


	}
}

