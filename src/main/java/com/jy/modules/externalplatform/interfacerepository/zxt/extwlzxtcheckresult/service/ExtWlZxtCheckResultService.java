package com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtcheckresult.service;

import com.alibaba.fastjson.JSON;
import com.jy.modules.externalplatform.interfacerepository.qhzx.extwlqhzxriskdootip.service.ExtWlQhzxRiskdooTipService;
import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtcheckresult.dao.ExtWlZxtCheckResultDao;
import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtcheckresult.dto.ExtWlZxtCheckResultDTO;
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
 * @classname: ExtWlZxtCheckResultService
 * @description: 定义  核身问答信息验证结果表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtcheckresult.service.ExtWlZxtCheckResultService")
public class ExtWlZxtCheckResultService implements Serializable, ExtSaveMessageDao {

    private static final long serialVersionUID = 1L;
	private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	static Logger logger = LoggerFactory.getLogger(ExtWlQhzxRiskdooTipService.class);

	@Autowired
	ExtInterfaceLogService extInterfaceLogService;


	@Autowired
	private ExtWlZxtCheckResultDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 核身问答信息验证结果表列表
     * @date 2017-12-12 20:13:10
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlZxtCheckResultDTO> searchExtWlZxtCheckResultByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlZxtCheckResultDTO> dataList =  dao.searchExtWlZxtCheckResultByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询核身问答信息验证结果表列表
     * @date 2017-12-12 20:13:10
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlZxtCheckResultDTO> searchExtWlZxtCheckResult(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlZxtCheckResultDTO> dataList = dao.searchExtWlZxtCheckResult(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询核身问答信息验证结果表对象
     * @date 2017-12-12 20:13:10
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlZxtCheckResultDTO queryExtWlZxtCheckResultByPrimaryKey(String id) throws Exception {
		
		ExtWlZxtCheckResultDTO dto = dao.findExtWlZxtCheckResultByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlZxtCheckResultDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlZxtCheckResult
     * @author Administrator
     * @description: 新增 核身问答信息验证结果表对象
     * @date 2017-12-12 20:13:10
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlZxtCheckResult(ExtWlZxtCheckResultDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlZxtCheckResult(paramMap);
		
		ExtWlZxtCheckResultDTO resultDto = (ExtWlZxtCheckResultDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlZxtCheckResult
     * @author Administrator
     * @description: 修改 核身问答信息验证结果表对象
     * @date 2017-12-12 20:13:10
     * @param dto
     * @return
     * @throws
     */
	public void updateExtWlZxtCheckResult(ExtWlZxtCheckResultDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlZxtCheckResult(paramMap);
	}
	/**
     * @title: deleteExtWlZxtCheckResultByPrimaryKey
     * @author Administrator
     * @description: 删除 核身问答信息验证结果表,按主键
     * @date 2017-12-12 20:13:10
     * @param baseDto, ids
     * @throws
     */ 
	public void deleteExtWlZxtCheckResultByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlZxtCheckResultByPrimaryKey(paramMap);
	}
	/**
	 * @title: saveMessage
	 * @author dongkannging
	 * @description: 增信通闪电核 核身问答信息验证接口 数据落库
	 * @date 2017-12-13 20:13:53
	 * @param map
	 * @throws
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

			String verId = (String)map.get("verId");//必传参数 核身问题ID

			if(StringUtils.isEmpty(result)){
				interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				interfaceLogDto.setRetMsg("查询增信通_核身问答信息验证接口返回报文为空！");
			}else if(result.contains("Read timed out")){
				interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				interfaceLogDto.setRetMsg("查询增信通_核身问答信息验证接口 访问超时！");
			}else{

				Map resultMap = JSON.parseObject(result);

				//设置核身结果代码、核身结果信息
				retCode = (String)resultMap.get("status");//状态码
				retMsg = (String)resultMap.get("message");//说明

				//1 操作成功
				if("1".equals(retCode)){
					isSuccess = "1";

					//保存 核身问答信息验证结果表
					ExtWlZxtCheckResultDTO dto = new ExtWlZxtCheckResultDTO();
					dto.setVerId(verId);//核身问题ID号
					dto.setStatus(retCode);//状态码
					dto.setMessage(retMsg);//说明
					dto.setLenderResult((String)resultMap.get("lenderResult"));//核身借款人的结果代码
					dto.setLenderResultMsg((String)resultMap.get("lenderResultMsg"));//核身借款人的结果信息
					dto.setLenderAnserRight((String)resultMap.get("lenderAnserRight"));//核身借款人答对题数
					dto.setLenderAnserWorry((String)resultMap.get("lenderAnserWorry"));//核身借款人答错题数
					dto.setContactResult((String)resultMap.get("contactResult"));//核身联系人的结果代码
					dto.setContactResultMsg((String)resultMap.get("contactResultMsg"));//核身联系人的结果信息
					dto.setContactAnserRight((String)resultMap.get("contactAnserRight"));//核身联系人答对题数
					dto.setContactAnserWorry((String)resultMap.get("contactAnserWorry"));//核身联系人答错题数
					dto.setCreateBy(-1L);

					Long keyId = this.insertExtWlZxtCheckResult(dto);
					if(null != keyId)
						fkBizId = keyId.toString();


					interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
					interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_1.getValue());
				}else{
					if(StringUtils.isNotEmpty(retCode)){
						//保存 核身问答信息验证结果表
						ExtWlZxtCheckResultDTO dto = new ExtWlZxtCheckResultDTO();
						dto.setVerId(verId);//核身问题ID号
						dto.setStatus(retCode);//状态码
						dto.setMessage(retMsg);//说明
						dto.setCreateBy(-1L);

						Long keyId = this.insertExtWlZxtCheckResult(dto);
						if(null != keyId)
							fkBizId = keyId.toString();
					}
					interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_5.getKey());
					interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_5.getValue());
				}
			}

		} catch (Exception ex) {
			JYLoggerUtil.error(this.getClass(), "===查询增信通_核身问答信息验证接口异常===接口交易流水号:"+interfaceLogDto.getReqTransNo(), ex);
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
				JYLoggerUtil.error(this.getClass(), "===保存增信通_核身问答信息验证日志异常===接口交易流水号:"+interfaceLogDto.getReqTransNo(), e);
			}
		}
	}
}

