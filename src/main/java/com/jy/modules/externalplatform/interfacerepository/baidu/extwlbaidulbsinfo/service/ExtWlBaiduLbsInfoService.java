package com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidulbsinfo.service;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidulbsinfo.dao.ExtWlBaiduLbsInfoDao;
import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidulbsinfo.dto.ExtWlBaiduLbsInfoDTO;
import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidulbsinfo.dto.FixAddressDTO;
import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidulbsresult.dto.ExtWlBaiduLbsResultDTO;
import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidulbsresult.service.ExtWlBaiduLbsResultService;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.BaseDTO;
import com.jy.platform.core.common.JYLoggerUtil;

/**
 * @classname: ExtWlBaiduLbsInfoService
 * @description: 定义  百度金融LBS地址校验主表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidulbsinfo.service.ExtWlBaiduLbsInfoService")
public class ExtWlBaiduLbsInfoService implements ExtSaveMessageDao {
	
	private static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	
	@Autowired
	ExtInterfaceLogService extInterfaceLogService;
	@Autowired
	ExtWlBaiduLbsResultService extWlBaiduLbsResultService;

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlBaiduLbsInfoDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 百度金融LBS地址校验主表列表
     * @date 2017-12-08 15:26:55
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlBaiduLbsInfoDTO> searchExtWlBaiduLbsInfoByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlBaiduLbsInfoDTO> dataList =  dao.searchExtWlBaiduLbsInfoByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询百度金融LBS地址校验主表列表
     * @date 2017-12-08 15:26:55
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlBaiduLbsInfoDTO> searchExtWlBaiduLbsInfo(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlBaiduLbsInfoDTO> dataList = dao.searchExtWlBaiduLbsInfo(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询百度金融LBS地址校验主表对象
     * @date 2017-12-08 15:26:55
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlBaiduLbsInfoDTO queryExtWlBaiduLbsInfoByPrimaryKey(String id) throws Exception {
		
		ExtWlBaiduLbsInfoDTO dto = dao.findExtWlBaiduLbsInfoByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlBaiduLbsInfoDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlBaiduLbsInfo
     * @author Administrator
     * @description: 新增 百度金融LBS地址校验主表对象
     * @date 2017-12-08 15:26:55
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlBaiduLbsInfo(ExtWlBaiduLbsInfoDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlBaiduLbsInfo(paramMap);
		
		ExtWlBaiduLbsInfoDTO resultDto = (ExtWlBaiduLbsInfoDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlBaiduLbsInfo
     * @author Administrator
     * @description: 修改 百度金融LBS地址校验主表对象
     * @date 2017-12-08 15:26:55
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlBaiduLbsInfo(ExtWlBaiduLbsInfoDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlBaiduLbsInfo(paramMap);
	}
	/**
     * @title: deleteExtWlBaiduLbsInfoByPrimaryKey
     * @author Administrator
     * @description: 删除 百度金融LBS地址校验主表,按主键
     * @date 2017-12-08 15:26:55
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlBaiduLbsInfoByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlBaiduLbsInfoByPrimaryKey(paramMap);
	}
	
	/**
	 * 
	 * @Description: 百度金融LBS地址校验 数据落地
	 * @param  map
	 * @throws
	 * @author huangxianchao
	 * @date 2017年12月12日 下午6:58:06
	 */
	@Override
	public void saveMessage(Map<String, Object> map) {

		String isSuccess = "0";
		String retCode = "";
		String retMsg = "";
		String fkBizId = "";
		String errorCode = "";  // 错误代码
        String errMessage = ""; // 错误信息
        String intoId = "";
		//日志信息
		ExtInterfaceLogDTO  interfaceLogDto = (ExtInterfaceLogDTO) map.get("interfaceLogDto");
		//获取返回的报文
		String result = (String) map.get("result");
		try {
			if (StringUtils.isNotEmpty((CharSequence) map.get("result"))) {
                Map retMap = JSON.parseObject(result);
                if(null != map.get("intoId")){
                	intoId = map.get("intoId").toString();
                }
                if(null != retMap.get("retCode")){
                	retCode = retMap.get("retCode").toString();
                }
                if(null != retMap.get("retMsg")){
                	retMsg = retMap.get("retMsg").toString();
                }
                
                if ("0".equals(retCode)) {//调用成功
                    isSuccess = "1";
                    interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
                    interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_1.getValue());
                	ExtWlBaiduLbsInfoDTO extWlBaiduLbsInfoDTO = null;
                	if(null != retMap.get("result")){
                		extWlBaiduLbsInfoDTO = JSON.parseObject(retMap.get("result").toString(), ExtWlBaiduLbsInfoDTO.class);
                	}
                    extWlBaiduLbsInfoDTO.setStatus(retCode);
                    extWlBaiduLbsInfoDTO.setMessage(retMsg);
                    extWlBaiduLbsInfoDTO.setIntoId(intoId);
                    if(null != retMap.get("request_Id"))
                        extWlBaiduLbsInfoDTO.setRequestId(retMap.get("request_Id").toString());
                    
                    FixAddressDTO[] fix_address_list=extWlBaiduLbsInfoDTO.getFix_address_list();
                    
                    if (fix_address_list != null && fix_address_list.length > 0) {
                        for (FixAddressDTO fixAddressDTO : fix_address_list) {
                            extWlBaiduLbsInfoDTO.setVisitFrequencyLevel(fixAddressDTO.getVisit_frequency_level());
                        }
                    }
                    //1、保存主表数据
                    Long keyId=this.insertExtWlBaiduLbsInfo(extWlBaiduLbsInfoDTO);
                    if(null != keyId){
                    	fkBizId = String.valueOf(keyId);
                    }
                    //2、保存详细数据
                    List<ExtWlBaiduLbsResultDTO> lbsList = new ArrayList<ExtWlBaiduLbsResultDTO>();
                    ExtWlBaiduLbsResultDTO[] home_address_list=extWlBaiduLbsInfoDTO.getHome_address_list();
                    if (home_address_list != null && home_address_list.length > 0) {
                        for (ExtWlBaiduLbsResultDTO extWlBaiduLbsResultDTO : home_address_list) {
                            extWlBaiduLbsResultDTO.setKeyId(keyId.toString());
                            extWlBaiduLbsResultDTO.setResultType("1");
                            lbsList.add(extWlBaiduLbsResultDTO);
                        }
                    }
                    ExtWlBaiduLbsResultDTO[] home_bdcom_address_list=extWlBaiduLbsInfoDTO.getHome_bdcom_address_list();
                    if (home_bdcom_address_list != null && home_bdcom_address_list.length > 0) {
                        for (ExtWlBaiduLbsResultDTO extWlBaiduLbsResultDTO : home_bdcom_address_list) {
                            extWlBaiduLbsResultDTO.setKeyId(keyId.toString());
                            extWlBaiduLbsResultDTO.setResultType("2");
                            lbsList.add(extWlBaiduLbsResultDTO);
                        }
                    }
                    ExtWlBaiduLbsResultDTO[] company_address_list=extWlBaiduLbsInfoDTO.getCompany_address_list();
                    if (company_address_list != null && company_address_list.length > 0) {
                        for (ExtWlBaiduLbsResultDTO extWlBaiduLbsResultDTO : company_address_list) {
                            extWlBaiduLbsResultDTO.setKeyId(keyId.toString());
                            extWlBaiduLbsResultDTO.setResultType("3");
                            lbsList.add(extWlBaiduLbsResultDTO);
                        }
                    }
                    ExtWlBaiduLbsResultDTO[] company_bdhome_address_list=extWlBaiduLbsInfoDTO.getCompany_bdhome_address_list();
                    if (company_bdhome_address_list != null && company_bdhome_address_list.length > 0) {
                        for (ExtWlBaiduLbsResultDTO extWlBaiduLbsResultDTO : company_bdhome_address_list) {
                            extWlBaiduLbsResultDTO.setKeyId(keyId.toString());
                            extWlBaiduLbsResultDTO.setResultType("4");
                            lbsList.add(extWlBaiduLbsResultDTO);
                        }
                    }
                    ExtWlBaiduLbsResultDTO[] receiver_address_list=extWlBaiduLbsInfoDTO.getReceiver_address_list();
                    if (receiver_address_list != null && receiver_address_list.length > 0) {
                        for (ExtWlBaiduLbsResultDTO extWlBaiduLbsResultDTO : receiver_address_list) {
                            extWlBaiduLbsResultDTO.setKeyId(keyId.toString());
                            extWlBaiduLbsResultDTO.setResultType("5");
                            lbsList.add(extWlBaiduLbsResultDTO);
                        }
                    }
                    ExtWlBaiduLbsResultDTO[] home_company_address_list=extWlBaiduLbsInfoDTO.getHome_company_address_list();
                    if (home_company_address_list != null && home_company_address_list.length > 0) {
                        for (ExtWlBaiduLbsResultDTO extWlBaiduLbsResultDTO : home_company_address_list) {
                            extWlBaiduLbsResultDTO.setKeyId(keyId.toString());
                            extWlBaiduLbsResultDTO.setResultType("6");
                            lbsList.add(extWlBaiduLbsResultDTO);
                        }
                    }
                    ExtWlBaiduLbsResultDTO[] home_busShop_address_list=extWlBaiduLbsInfoDTO.getHome_busShop_address_list();
                    if (home_busShop_address_list != null && home_busShop_address_list.length > 0) {
                        for (ExtWlBaiduLbsResultDTO extWlBaiduLbsResultDTO : home_busShop_address_list) {
                            extWlBaiduLbsResultDTO.setKeyId(keyId.toString());
                            extWlBaiduLbsResultDTO.setResultType("7");
                            lbsList.add(extWlBaiduLbsResultDTO);
                        }
                    }
                    ExtWlBaiduLbsResultDTO[] com_busShop_address_list=extWlBaiduLbsInfoDTO.getCom_busShop_address_list();
                    if (com_busShop_address_list != null && com_busShop_address_list.length > 0) {
                        for (ExtWlBaiduLbsResultDTO extWlBaiduLbsResultDTO : com_busShop_address_list) {
                            extWlBaiduLbsResultDTO.setKeyId(keyId.toString());
                            extWlBaiduLbsResultDTO.setResultType("8");
                            lbsList.add(extWlBaiduLbsResultDTO);
                        }
                    }
                    extWlBaiduLbsResultService.insertBatchWlExtBaiduLbsResult(lbsList);
                }else{//调用失败
                    ExtWlBaiduLbsInfoDTO extWlBaiduLbsInfoDTO=new ExtWlBaiduLbsInfoDTO();
                    extWlBaiduLbsInfoDTO.setStatus(retCode);
                    extWlBaiduLbsInfoDTO.setMessage(retMsg);
                    extWlBaiduLbsInfoDTO.setIntoId(intoId);
                    this.insertExtWlBaiduLbsInfo(extWlBaiduLbsInfoDTO);
                    interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_5.getKey());
					interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_5.getValue());
                }
            } else {
                errorCode = "false";
                errMessage = "调用百度金融LBS地址校验返回信息为空";
                ExtWlBaiduLbsInfoDTO extWlBaiduLbsInfoDTO=new ExtWlBaiduLbsInfoDTO();
                extWlBaiduLbsInfoDTO.setStatus(errorCode);
                extWlBaiduLbsInfoDTO.setMessage(errMessage);
                extWlBaiduLbsInfoDTO.setIntoId(intoId);
                this.insertExtWlBaiduLbsInfo(extWlBaiduLbsInfoDTO);
                interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				interfaceLogDto.setRetMsg("调用百度金融LBS地址校验查无");
            }

        }catch (Exception e) {
            errorCode = "false";
            errMessage = "调用百度金融LBS地址校验接口异常:" + e.getMessage();
            
            JYLoggerUtil.error(this.getClass(), "===保存百度金融LBS地址校验日志异常===接口日志ID:"+String.valueOf(map.get("interfaceId")), e);
			interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4.getKey());//解析回参出错
			interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_4.getValue());
        }finally {
        	try {
		    	interfaceLogDto.setRetBody(result);
                interfaceLogDto.setExt2(isSuccess);
                interfaceLogDto.setExt3(retCode);
                interfaceLogDto.setExt4(retMsg);
                interfaceLogDto.setExt5(fkBizId);//管理主表ID
				extInterfaceLogService.insertExtInterfaceLog(interfaceLogDto);
                
			} catch (Exception e) {
				JYLoggerUtil.error(this.getClass(), "===保存百度金融LBS地址校验日志异常===接口日志ID:"+String.valueOf(map.get("interfaceId")), e);
			}
        }
		
	}

}

