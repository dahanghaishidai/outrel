package com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaiduinfo.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jy.modules.befloan.interfacelog.lbttransferlog.dto.LbTTransferLogDTO;
import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidubusilicense.dto.ExtWlBaiduBusiLicenseDTO;
import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidubusilicense.service.ExtWlBaiduBusiLicenseService;
import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaiducourtdishonesty.dto.ExtWlBaiduCourtDishonestyDTO;
import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaiducourtdishonesty.service.ExtWlBaiduCourtDishonestyService;
import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaiducourtexecutor.dto.ExtWlBaiduCourtExecutorDTO;
import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaiducourtexecutor.service.ExtWlBaiduCourtExecutorService;
import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaiduequityfreeze.dto.ExtWlBaiduEquityFreezeDTO;
import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaiduequityfreeze.service.ExtWlBaiduEquityFreezeService;
import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaiduinfo.dao.ExtWlBaiduInfoDao;
import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaiduinfo.dto.BlackDetailsDto;
import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaiduinfo.dto.ExtWlBaiduInfoDTO;
import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaiduinfo.dto.RequestBaiDuDto;
import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidupenalty.dto.ExtWlBaiduPenaltyDTO;
import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidupenalty.service.ExtWlBaiduPenaltyService;
import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidutax.dto.ExtWlBaiduTaxDTO;
import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidutax.service.ExtWlBaiduTaxService;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.BaseDTO;
import com.jy.platform.core.common.JYLoggerUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @classname: ExtWlBaiduInfoService
 * @description: 定义  百度金融风险查询主表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaiduinfo.service.ExtWlBaiduInfoService")
public class ExtWlBaiduInfoService implements ExtSaveMessageDao {

	private static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    private static final long serialVersionUID = 1L;
    @Autowired
    private ExtInterfaceLogService extInterfaceLogService;
    
	@Autowired
	private ExtWlBaiduInfoDao dao;
	@Autowired
	private ExtWlBaiduCourtDishonestyService extWlBaiduCourtDishonestyService;
	@Autowired
	private ExtWlBaiduTaxService extWlBaiduTaxService;
	@Autowired
	private ExtWlBaiduEquityFreezeService extWlBaiduEquityFreezeService;
	@Autowired
	private ExtWlBaiduBusiLicenseService extWlBaiduBusiLicenseService;
	@Autowired
	private ExtWlBaiduCourtExecutorService extWlBaiduCourtExecutorService;
	@Autowired
	private ExtWlBaiduPenaltyService extWlBaiduPenaltyService;

	/**
     * @author Administrator
     * @description: 分页查询 百度金融风险查询主表列表
     * @date 2017-12-13 16:40:42
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlBaiduInfoDTO> searchExtWlBaiduInfoByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlBaiduInfoDTO> dataList =  dao.searchExtWlBaiduInfoByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询百度金融风险查询主表列表
     * @date 2017-12-13 16:40:42
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlBaiduInfoDTO> searchExtWlBaiduInfo(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlBaiduInfoDTO> dataList = dao.searchExtWlBaiduInfo(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询百度金融风险查询主表对象
	 *
     * @date 2017-12-13 16:40:42
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlBaiduInfoDTO queryExtWlBaiduInfoByPrimaryKey(String id) throws Exception {
		
		ExtWlBaiduInfoDTO dto = dao.findExtWlBaiduInfoByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlBaiduInfoDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlBaiduInfo
     * @author Administrator
     * @description: 新增 百度金融风险查询主表对象
     * @date 2017-12-13 16:40:42
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlBaiduInfo(ExtWlBaiduInfoDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlBaiduInfo(paramMap);
		
		ExtWlBaiduInfoDTO resultDto = (ExtWlBaiduInfoDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlBaiduInfo
     * @author Administrator
     * @description: 修改 百度金融风险查询主表对象
     * @date 2017-12-13 16:40:42
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlBaiduInfo(ExtWlBaiduInfoDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlBaiduInfo(paramMap);
	}
	/**
     * @title: deleteExtWlBaiduInfoByPrimaryKey
     * @author Administrator
     * @description: 删除 百度金融风险查询主表,按主键
     * @date 2017-12-13 16:40:42
     * @param paramMap
     * @throws
     */
	public void deleteExtWlBaiduInfoByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlBaiduInfoByPrimaryKey(paramMap);
	}


	/**
	 * @methodName: saveMessage
	 * @param: map
	 * @describe: 百度金融风险查询接口数据落地
	 * @auther: huangxianchao
	 * @date: 2017/12/14 0014
	 * @time: 上午 9:29
	 **/
	@Override
	public void saveMessage(Map<String, Object> map) {

		String isSuccess = "0";
		String retCode = "";
		String retMsg = "";
		String fkBizId = "";
		String intoId = "";
		String errorCode = "";  // 错误代码
		String errMessage = ""; // 错误信息
		//日志信息
		ExtInterfaceLogDTO interfaceLogDto = (ExtInterfaceLogDTO)map.get("interfaceLogDto");
		String results = (String) map.get("result");
		if(null != map.get("intoId")){
			intoId = map.get("intoId").toString();
		}
		RequestBaiDuDto requestMes = new RequestBaiDuDto();

			try {
				if (StringUtils.isNotEmpty(results)) {

					requestMes = JSON.parseObject(results, RequestBaiDuDto.class);
					if(null != requestMes.getRetCode()){
						errorCode = requestMes.getRetCode().toString();
						retCode = requestMes.getRetCode().toString();
					}
					if(null != requestMes.getRetMsg()){
						errMessage = requestMes.getRetMsg();
						retMsg = requestMes.getRetMsg();
					}
					if ("0".equals(errorCode)) {
						isSuccess = "1";
						interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
						interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_1.getValue());
						ExtWlBaiduInfoDTO ExtWlBaiduInfoDTO=requestMes.getResult();
						ExtWlBaiduInfoDTO.setRetCode(errorCode);
						ExtWlBaiduInfoDTO.setRetMsg(errMessage);
						ExtWlBaiduInfoDTO.setIntoId(intoId);
						//1、保存主表数据
						Long keyId=this.insertExtWlBaiduInfo(ExtWlBaiduInfoDTO);
						if(null != keyId){
							fkBizId = String.valueOf(keyId);
						}
						JSONObject allJson=(JSONObject) JSONObject.parse(results);
						JSONObject resultJson=(JSONObject) JSONObject.parse(String.valueOf(allJson.get("result")));
						BlackDetailsDto blackDetails=JSON.parseObject(String.valueOf(resultJson.get("blackDetails")), BlackDetailsDto.class);
						if(null!=blackDetails){
							//2、保存法院失信数据
							List<ExtWlBaiduCourtDishonestyDTO> courtDishonestyList = new ArrayList<ExtWlBaiduCourtDishonestyDTO>();
							ExtWlBaiduCourtDishonestyDTO[] C06BT020=blackDetails.getC06BT020();
							if (C06BT020 != null && C06BT020.length > 0) {
								for (ExtWlBaiduCourtDishonestyDTO ExtWlBaiduCourtDishonestyDTO : C06BT020) {
									ExtWlBaiduCourtDishonestyDTO.setKeyId(keyId.toString());
									courtDishonestyList.add(ExtWlBaiduCourtDishonestyDTO);
								}
								extWlBaiduCourtDishonestyService.insertBatchCourtDishonesty(courtDishonestyList);
							}
							//3、保存偷税漏税数据
							List<ExtWlBaiduTaxDTO> taxList = new ArrayList<ExtWlBaiduTaxDTO>();
							ExtWlBaiduTaxDTO[] C06BT021=blackDetails.getC06BT021();
							if (C06BT021 != null && C06BT021.length > 0) {
								for (ExtWlBaiduTaxDTO ExtWlBaiduTaxDTO : C06BT021) {
									ExtWlBaiduTaxDTO.setKeyId(keyId.toString());
									taxList.add(ExtWlBaiduTaxDTO);
								}
								extWlBaiduTaxService.insertBatchTax(taxList);
							}
							//4、保存股权冻结数据
							List<ExtWlBaiduEquityFreezeDTO> equityFreezeList = new ArrayList<ExtWlBaiduEquityFreezeDTO>();
							ExtWlBaiduEquityFreezeDTO[] C06BT022=blackDetails.getC06BT022();
							if (C06BT022 != null && C06BT022.length > 0) {
								for (ExtWlBaiduEquityFreezeDTO ExtWlBaiduEquityFreezeDTO : C06BT022) {
									ExtWlBaiduEquityFreezeDTO.setKeyId(keyId.toString());
									equityFreezeList.add(ExtWlBaiduEquityFreezeDTO);
								}
								extWlBaiduEquityFreezeService.insertBatchEquityFreeze(equityFreezeList);
							}
							//5、保存工商无照数据
							List<ExtWlBaiduBusiLicenseDTO> busiLicenseList = new ArrayList<ExtWlBaiduBusiLicenseDTO>();
							ExtWlBaiduBusiLicenseDTO[] C06BT023=blackDetails.getC06BT023();
							if (C06BT023 != null && C06BT023.length > 0) {
								for (ExtWlBaiduBusiLicenseDTO ExtWlBaiduBusiLicenseDTO : C06BT023) {
									ExtWlBaiduBusiLicenseDTO.setKeyId(keyId.toString());
									busiLicenseList.add(ExtWlBaiduBusiLicenseDTO);
								}
								extWlBaiduBusiLicenseService.insertBatchBusiLicense(busiLicenseList);
							}
							//6、保存法院执行人数据
							List<ExtWlBaiduCourtExecutorDTO> courtExecutorList = new ArrayList<ExtWlBaiduCourtExecutorDTO>();
							ExtWlBaiduCourtExecutorDTO[] C06BT024=blackDetails.getC06BT024();
							if (C06BT024 != null && C06BT024.length > 0) {
								for (ExtWlBaiduCourtExecutorDTO ExtWlBaiduCourtExecutorDTO : C06BT024) {
									ExtWlBaiduCourtExecutorDTO.setKeyId(keyId.toString());
									courtExecutorList.add(ExtWlBaiduCourtExecutorDTO);
								}
								extWlBaiduCourtExecutorService.insertBatchCourtExecutor(courtExecutorList);
							}
							//7、保存行政处罚数据
							List<ExtWlBaiduPenaltyDTO> penaltyList = new ArrayList<ExtWlBaiduPenaltyDTO>();
							ExtWlBaiduPenaltyDTO[] C06BT025=blackDetails.getC06BT025();
							if (C06BT025 != null && C06BT025.length > 0) {
								for (ExtWlBaiduPenaltyDTO ExtWlBaiduPenaltyDTO : C06BT025) {
									ExtWlBaiduPenaltyDTO.setKeyId(keyId.toString());
									penaltyList.add(ExtWlBaiduPenaltyDTO);
								}
								extWlBaiduPenaltyService.insertBatchPenalty(penaltyList);
							}
						}

					}else{//失败
						ExtWlBaiduInfoDTO ExtWlBaiduInfoDTO=new ExtWlBaiduInfoDTO();
						ExtWlBaiduInfoDTO.setRetCode(errorCode);
						ExtWlBaiduInfoDTO.setRetMsg(errMessage);
						ExtWlBaiduInfoDTO.setIntoId(intoId);
						this.insertExtWlBaiduInfo(ExtWlBaiduInfoDTO);
						interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_5.getKey());
						interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_5.getValue());
					}
				} else {
					errorCode = "false";
					errMessage = "调用百度金融风险信息查询返回信息为空";
					ExtWlBaiduInfoDTO ExtWlBaiduInfoDTO=new ExtWlBaiduInfoDTO();
					ExtWlBaiduInfoDTO.setRetCode(errorCode);
					ExtWlBaiduInfoDTO.setRetMsg(errMessage);
					ExtWlBaiduInfoDTO.setIntoId(intoId);
					this.insertExtWlBaiduInfo(ExtWlBaiduInfoDTO);
					interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
					interfaceLogDto.setRetMsg("调用百度金融风险信息查询查无");
				}

			}catch (Exception e) {
				e.printStackTrace();
				errorCode = "false";
				errMessage = "调用百度金融风险信息查询接口异常:" + e.getMessage();
				JYLoggerUtil.error(this.getClass(), "===保存百度金融风险信息查询日志异常===接口日志ID:"+String.valueOf(map.get("interfaceId")), e);
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
					JYLoggerUtil.error(this.getClass(), "===保存百度金融风险信息查询日志异常===接口日志ID:"+String.valueOf(map.get("interfaceId")), e);
				}

			}
	}
}

