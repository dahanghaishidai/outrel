package com.jy.modules.externalplatform.interfacerepository.jiuyi.extwl91loaninfo.service;
import java.io.Serializable;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.alibaba.fastjson.JSONObject;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.JYLoggerUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.jiuyi.extwl91loaninfo.dto.ExtWl91loanInfoDTO;
import com.jy.modules.externalplatform.interfacerepository.jiuyi.extwl91loaninfo.dao.ExtWl91loanInfoDao;

/**
 * @classname: ExtWl91loanInfoService
 * @description: 定义  91征信贷款数据 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.jiuyi.extwl91loaninfo.service.ExtWl91loanInfoService")
public class ExtWl91loanInfoService implements Serializable, ExtSaveMessageDao {

	private static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

	@Autowired
	ExtInterfaceLogService extInterfaceLogService;

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWl91loanInfoDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 91征信贷款数据列表
     * @date 2017-12-15 16:12:51
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWl91loanInfoDTO> searchExtWl91loanInfoByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWl91loanInfoDTO> dataList =  dao.searchExtWl91loanInfoByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询91征信贷款数据列表
     * @date 2017-12-15 16:12:51
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWl91loanInfoDTO> searchExtWl91loanInfo(Map<String,Object> searchParams) throws Exception {
	    List<ExtWl91loanInfoDTO> dataList = dao.searchExtWl91loanInfo(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询91征信贷款数据对象
     * @date 2017-12-15 16:12:51
     * @param id
     * @return
     * @throws
     */ 
	public ExtWl91loanInfoDTO queryExtWl91loanInfoByPrimaryKey(String id) throws Exception {
		
		ExtWl91loanInfoDTO dto = dao.findExtWl91loanInfoByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWl91loanInfoDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWl91loanInfo
     * @author Administrator
     * @description: 新增 91征信贷款数据对象
     * @date 2017-12-15 16:12:51
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWl91loanInfo(ExtWl91loanInfoDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWl91loanInfo(paramMap);
		
		ExtWl91loanInfoDTO resultDto = (ExtWl91loanInfoDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWl91loanInfo
     * @author Administrator
     * @description: 修改 91征信贷款数据对象
     * @date 2017-12-15 16:12:51
     * @param dto
     * @return
     * @throws
     */
	public void updateExtWl91loanInfo(ExtWl91loanInfoDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWl91loanInfo(paramMap);
	}
	/**
     * @title: deleteExtWl91loanInfoByPrimaryKey
     * @author Administrator
     * @description: 删除 91征信贷款数据,按主键
     * @date 2017-12-15 16:12:51
     * @param baseDto
     * @throws
     */ 
	public void deleteExtWl91loanInfoByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWl91loanInfoByPrimaryKey(paramMap);
	}

	/**
	 * @methodName: saveMessage
	 * @param: [map]
	 * @describe: 91征信信息查询 数据落地
	 * @auther: huangxianchao
	 * @date: 2017/12/15 0015
	 * @time: 下午 4:16
	 **/
	@Override
	public void saveMessage(Map<String, Object> map) {
		
		String isSuccess = "0";
		String retCode = "";
		String retMsg = "";
		String fkBizId = "";
		String intoId = "";
		String idCard = "";
		String name = "";

		// 日志信息
		ExtInterfaceLogDTO interfaceLogDto = (ExtInterfaceLogDTO) map.get("interfaceLogDto");

		//获取返回报文
		String result = String.valueOf(map.get("result"));

		try {

			if(null == map.get("intoCustomerRefId")){
				map.put("intoCustomerRefId", "");//非贷款系统调用，这个没有值
			}
			if(null != map.get("intoId")){
				intoId = map.get("intoId").toString();
			}
			if(null != map.get("idCard")){
				idCard = map.get("idCard").toString();
			}
			if(null != map.get("realName")){
				name = map.get("realName").toString();
			}

			if (StringUtils.isNotEmpty(result)) {
				JSONObject object = (JSONObject) JSONObject.parse(result);
				if(null != object.get("retCode")){
					retCode = object.get("retCode").toString();
				}
				if(null != object.get("retMsg")){
					retMsg = object.get("retMsg").toString();
				}

				if ("0000".equals(retCode)) {
					isSuccess = "1";
					if (null != object.get("trxNo")) {
						interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
						interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_1.getValue());
						String trxNo = String.valueOf(object.get("trxNo"));
						ExtWl91loanInfoDTO dto = new ExtWl91loanInfoDTO();
						dto.setTrxNo(trxNo);
						dto.setIntoId(intoId);
						dto.setIdNo(idCard);
						dto.setName(name);
						Long keyId = this.insertExtWl91loanInfo(dto);
						fkBizId = String.valueOf(keyId);

					} else {
						interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_5.getKey());
						interfaceLogDto.setRetMsg("调用91征信数据接口返回交易码为空");
					}
				} else if ("9999".equals(retCode)) {
					interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4.getKey());
					interfaceLogDto.setRetMsg("调用91征信数据接口失败！");
				}
			} else {
				interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				interfaceLogDto.setRetMsg("调用91征信数据查无");
			}

		} catch (Exception e) {
			JYLoggerUtil.error(this.getClass(), "===保存91征信数据接口日志异常===接口日志ID:"+String.valueOf(map.get("interfaceId")), e);
			interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4.getKey());//解析回参出错
			interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_4.getValue());
		}finally{
			try {
				interfaceLogDto.setRetBody(result);
				interfaceLogDto.setExt2(isSuccess);
				interfaceLogDto.setExt3(retCode);
				interfaceLogDto.setExt4(retMsg);
				interfaceLogDto.setExt5(fkBizId);//管理主表ID
				extInterfaceLogService.insertExtInterfaceLog(interfaceLogDto);

			} catch (Exception e) {
				JYLoggerUtil.error(this.getClass(), "===保存91征信数据接口日志异常===接口日志ID:"+String.valueOf(map.get("interfaceId")), e);
			}
		}

	}
}

