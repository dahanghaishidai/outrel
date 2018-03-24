package com.jy.modules.externalplatform.interfacerepository.baidu.extwlbdcreditscore.service;

import com.alibaba.fastjson.JSONObject;
import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbdcreditscore.dao.ExtWlBdCreditScoreDao;
import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbdcreditscore.dto.ExtWlBdCreditScoreDTO;
import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtsearch.service.ExtWlZxtSearchService;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.BaseDTO;
import com.jy.platform.core.common.JYLoggerUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @className: ExtWlBdCreditScoreService
 * @package: com.jy.modules.externalplatform.interfacerepository.baidu.extwlbdcreditscore.service
 * @describe: 定义  百度_PREA信用分 实现类
 * @auther: 董康宁
 * @date: 2017/12/19
 * @time: 20:25
 */
@Service("com.jy.modules.externalplatform.interfacerepository.baidu.extwlbdcreditscore.service.ExtWlBdCreditScoreService")
public class ExtWlBdCreditScoreService implements Serializable, ExtSaveMessageDao {

    private static final long serialVersionUID = 1L;
	private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	static Logger logger = LoggerFactory.getLogger(ExtWlZxtSearchService.class);

	@Autowired
	ExtInterfaceLogService extInterfaceLogService;

	@Autowired
	private ExtWlBdCreditScoreDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 百度_PREA信用分列表
     * @date 2017-12-19 20:13:38
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlBdCreditScoreDTO> searchExtWlBdCreditScoreByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlBdCreditScoreDTO> dataList =  dao.searchExtWlBdCreditScoreByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询百度_PREA信用分列表
     * @date 2017-12-19 20:13:38
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlBdCreditScoreDTO> searchExtWlBdCreditScore(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlBdCreditScoreDTO> dataList = dao.searchExtWlBdCreditScore(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询百度_PREA信用分对象
     * @date 2017-12-19 20:13:38
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlBdCreditScoreDTO queryExtWlBdCreditScoreByPrimaryKey(String id) throws Exception {
		
		ExtWlBdCreditScoreDTO dto = dao.findExtWlBdCreditScoreByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlBdCreditScoreDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlBdCreditScore
     * @author Administrator
     * @description: 新增 百度_PREA信用分对象
     * @date 2017-12-19 20:13:38
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlBdCreditScore(ExtWlBdCreditScoreDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlBdCreditScore(paramMap);
		
		ExtWlBdCreditScoreDTO resultDto = (ExtWlBdCreditScoreDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlBdCreditScore
     * @author Administrator
     * @description: 修改 百度_PREA信用分对象
     * @date 2017-12-19 20:13:38
     * @param dto
     * @return
     * @throws
     */
	public void updateExtWlBdCreditScore(ExtWlBdCreditScoreDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlBdCreditScore(paramMap);
	}
	/**
     * @title: deleteExtWlBdCreditScoreByPrimaryKey
     * @author Administrator
     * @description: 删除 百度_PREA信用分,按主键
     * @date 2017-12-19 20:13:38
     * @param baseDto, ids
     * @throws
     */ 
	public void deleteExtWlBdCreditScoreByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlBdCreditScoreByPrimaryKey(paramMap);
	}

	/**
	 * @methodName: saveMessage
	 * @param: map
	 * @describe: 百度_PREA信用分查询API 数据落地
	 * @auther: 董康宁
	 * @date: 2017/12/19
	 * @time: 20:28
	 */
	@Override
	public void saveMessage(Map<String, Object> map) {
		String isSuccess = "0";//是否调用成功  1：成功 0：失败
		String retCode = "";//接口返回码
		String retMsg = "";//接口返回信息
		String fkBizId = "";//接口落地数据主表ID
		//日志信息
		ExtInterfaceLogDTO interfaceLogDto=(ExtInterfaceLogDTO) map.get("interfaceLogDto");
		String result = String.valueOf(map.get("result"));

		try {

			if(StringUtils.isEmpty(result)){
				interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				interfaceLogDto.setRetMsg("查询百度_PREA信用分查询获取接口返回报文为空！");
			}else if(result.contains("Read timed out")){
				interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				interfaceLogDto.setRetMsg("查询百度_PREA信用分查询获取接口 访问超时！");
			}else{

				//将返回报文转换为jsonObject 对象
				JSONObject resultJson = JSONObject.parseObject(result);

				//设置 返回码
				retCode = resultJson.getString("retCode");//返回码
				retMsg = resultJson.getString("retMsg");//错误描述

				//0 查询成功
				if("0".equals(retCode)){
					isSuccess = "1";

					//保存 百度_PREA信用分
					ExtWlBdCreditScoreDTO scoreDTO = new ExtWlBdCreditScoreDTO();
					scoreDTO.setRetCode(retCode);
					scoreDTO.setRetMsg(retMsg);
					if(null != resultJson.get("result")){
						JSONObject resultObj = resultJson.getJSONObject("result");
						if(null != resultObj.get("scoreInfo")){
							JSONObject scoreInfoObj = resultObj.getJSONObject("scoreInfo");

							scoreDTO.setModels(scoreInfoObj.getString("models"));
							scoreDTO.setScore(scoreInfoObj.getString("score"));
						}
					}
					scoreDTO.setCreateBy(-1L);

					//插入 百度_PREA信用分表
					Long keyId  = this.insertExtWlBdCreditScore(scoreDTO);
					if(null != keyId)
						fkBizId = keyId.toString();

					interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
					interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_1.getValue());

				}else{

					interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_5.getKey());
					interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_5.getValue());
				}
			}

		} catch (Exception ex) {
			JYLoggerUtil.error(this.getClass(), "===查询百度_PREA信用分查询获取接口异常===接口交易流水号:"+interfaceLogDto.getReqTransNo(), ex);
			interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4.getKey());
			interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_4.getValue());

		} finally{
			try {
				interfaceLogDto.setRetBody(result);
				interfaceLogDto.setExt2(isSuccess);
				interfaceLogDto.setExt3(retCode);
				interfaceLogDto.setExt4(retMsg);
				interfaceLogDto.setExt5(fkBizId);
				Long keyId = extInterfaceLogService.insertExtInterfaceLog(interfaceLogDto);
			} catch (Exception e) {
				JYLoggerUtil.error(this.getClass(), "===保存百度_PREA信用分查询获取日志异常===接口交易流水号:"+interfaceLogDto.getReqTransNo(), e);
			}
		}
	}
}

