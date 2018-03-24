package com.jy.modules.externalplatform.interfacerepository.pa.extwlpainfo.service;

import com.alibaba.fastjson.JSON;
import com.jy.modules.externalplatform.interfacerepository.pa.extwlpacreditinfo.dto.ExtWlPaCreditInfoDTO;
import com.jy.modules.externalplatform.interfacerepository.pa.extwlpacreditinfo.service.ExtWlPaCreditInfoService;
import com.jy.modules.externalplatform.interfacerepository.pa.extwlpacreditinfo.service.RequestPaDto;
import com.jy.modules.externalplatform.interfacerepository.pa.extwlpainfo.dao.ExtWlPaInfoDao;
import com.jy.modules.externalplatform.interfacerepository.pa.extwlpainfo.dto.ExtWlPaInfoDTO;
import com.jy.modules.externalplatform.interfacerepository.xy.extwlxyoverdue.dto.ExtWlXyOverdueDTO;
import com.jy.modules.externalplatform.interfacerepository.xy.extwlxyoverduedetail.dto.ExtWlXyOverdueDetailDTO;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcqueryinfo.dto.RequestMesDto;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.JYLoggerUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @className: ExtWlPaInfoService
 * @package: com.jy.modules.externalplatform.interfacerepository.pa.extwlpainfo.service
 * @describe: 定义  凭安信用主表 实现类
 * @auther: 董康宁
 * @date: 2018/1/8
 * @time: 11:00
 */
@Service("com.jy.modules.externalplatform.interfacerepository.pa.extwlpainfo.service.ExtWlPaInfoService")
public class ExtWlPaInfoService implements Serializable, ExtSaveMessageDao {

    private static final long serialVersionUID = 1L;
	private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	static Logger logger = LoggerFactory.getLogger(ExtWlPaInfoService.class);

	@Autowired
	ExtInterfaceLogService extInterfaceLogService;

	@Autowired
	ExtWlPaCreditInfoService extWlPaCreditInfoService;

	@Autowired
	private ExtWlPaInfoDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 凭安信用主表列表
     * @date 2018-01-08 10:55:15
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlPaInfoDTO> searchExtWlPaInfoByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlPaInfoDTO> dataList =  dao.searchExtWlPaInfoByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询凭安信用主表列表
     * @date 2018-01-08 10:55:15
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlPaInfoDTO> searchExtWlPaInfo(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlPaInfoDTO> dataList = dao.searchExtWlPaInfo(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询凭安信用主表对象
     * @date 2018-01-08 10:55:15
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlPaInfoDTO queryExtWlPaInfoByPrimaryKey(String id) throws Exception {
		
		ExtWlPaInfoDTO dto = dao.findExtWlPaInfoByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlPaInfoDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlPaInfo
     * @author Administrator
     * @description: 新增 凭安信用主表对象
     * @date 2018-01-08 10:55:15
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlPaInfo(ExtWlPaInfoDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlPaInfo(paramMap);
		
		ExtWlPaInfoDTO resultDto = (ExtWlPaInfoDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlPaInfo
     * @author Administrator
     * @description: 修改 凭安信用主表对象
     * @date 2018-01-08 10:55:15
     * @param dto
     * @return
     * @throws
     */
	public void updateExtWlPaInfo(ExtWlPaInfoDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlPaInfo(paramMap);
	}

	/**
	 * @methodName: saveMessage
	 * @param: [map]
	 * @describe: 凭安催收 外联平台数据落地
	 * @auther: 董康宁
	 * @date: 2018/1/8
	 * @time: 11:00
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
            RequestPaDto requestMes = new RequestPaDto();

            String intoId  = "";
            if(null != map.get("intoId"))
                intoId = String.valueOf(map.get("intoId"));

            if(StringUtils.isEmpty(result)){
                interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
                interfaceLogDto.setRetMsg("凭安催收接口业务接口返回报文为空！");
            }else if(result.contains("Read timed out")){
                interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
                interfaceLogDto.setRetMsg("凭安催收接口业务接口 访问超时！");
            }else{
                requestMes = JSON.parseObject(result, RequestPaDto.class);
                retCode = requestMes.getResult();
                retMsg = requestMes.getMessage();
                if ("200".equals(retCode)) {
                    isSuccess = "1";//设置成功

                    ExtWlPaCreditInfoDTO[] pas = requestMes.getData();
                    List<ExtWlPaCreditInfoDTO> paList = new ArrayList<ExtWlPaCreditInfoDTO>();
                    if (pas != null && pas.length > 0) {
                        ExtWlPaInfoDTO dto = new ExtWlPaInfoDTO();
                        dto.setIntoId(intoId);
                        dto.setResult(retCode);
                        dto.setMessage(retMsg);
                        dto.setCreateBy(-1L);
                        Long keyId = this.insertExtWlPaInfo(dto);
                        if(null != keyId)
                            fkBizId = keyId.toString();

                        for (ExtWlPaCreditInfoDTO extWlPaCreditInfoDTO : pas) {
                            extWlPaCreditInfoDTO.setKeyId(String.valueOf(keyId));
                            extWlPaCreditInfoDTO.setMobile(extWlPaCreditInfoDTO.getNumber());
                            extWlPaCreditInfoDTO.setCreateBy(-1L);
                            extWlPaCreditInfoService.insertExtWlPaCreditInfo(extWlPaCreditInfoDTO);
                        }
                    }

                    interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
                    interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_1.getValue());

                }else{
                    ExtWlPaInfoDTO dto=new ExtWlPaInfoDTO();
                    dto.setIntoId(intoId);
                    dto.setResult(retCode);
                    dto.setMessage(retMsg);
                    dto.setCreateBy(-1L);
                    this.insertExtWlPaInfo(dto);

                    interfaceLogDto.setRetCode(retCode);
                    interfaceLogDto.setRetMsg(retMsg);
                    logger.info("凭安催收查询失败：" + retMsg);
                }


            }

        } catch (Exception ex) {
            JYLoggerUtil.error(this.getClass(), "===凭安催收接口业务接口异常===接口交易流水号:"+interfaceLogDto.getReqTransNo(), ex);
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
                JYLoggerUtil.error(this.getClass(), "===保存凭安催收信息日志异常===接口交易流水号:"+interfaceLogDto.getReqTransNo(), e);
            }
        }
    }
}

