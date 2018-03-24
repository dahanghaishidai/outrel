package com.jy.modules.externalplatform.interfacerepository.xy.extwlxycreditradar.service;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.jy.modules.externalplatform.interfacerepository.xy.extwlxycreditradar.dao.ExtWlXyCreditRadarDao;
import com.jy.modules.externalplatform.interfacerepository.xy.extwlxycreditradar.dto.ExtWlXyCreditRadarDTO;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.BaseDTO;
import com.jy.platform.core.common.JYLoggerUtil;

/**
 * @classname: ExtWlXyCreditRadarService
 * @description: 定义  新颜征信雷达报告表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.xy.extwlxycreditradar.service.ExtWlXyCreditRadarService")
public class ExtWlXyCreditRadarService implements ExtSaveMessageDao {
	private static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	
	@Autowired
	ExtInterfaceLogService extInterfaceLogService;

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlXyCreditRadarDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 新颜征信雷达报告表列表
     * @date 2017-12-06 16:36:40
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlXyCreditRadarDTO> searchExtWlXyCreditRadarByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlXyCreditRadarDTO> dataList =  dao.searchExtWlXyCreditRadarByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询新颜征信雷达报告表列表
     * @date 2017-12-06 16:36:40
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlXyCreditRadarDTO> searchExtWlXyCreditRadar(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlXyCreditRadarDTO> dataList = dao.searchExtWlXyCreditRadar(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询新颜征信雷达报告表对象
     * @date 2017-12-06 16:36:40
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlXyCreditRadarDTO queryExtWlXyCreditRadarByPrimaryKey(String id) throws Exception {
		
		ExtWlXyCreditRadarDTO dto = dao.findExtWlXyCreditRadarByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlXyCreditRadarDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlXyCreditRadar
     * @author Administrator
     * @description: 新增 新颜征信雷达报告表对象
     * @date 2017-12-06 16:36:40
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlXyCreditRadar(ExtWlXyCreditRadarDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlXyCreditRadar(paramMap);
		
		ExtWlXyCreditRadarDTO resultDto = (ExtWlXyCreditRadarDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlXyCreditRadar
     * @author Administrator
     * @description: 修改 新颜征信雷达报告表对象
     * @date 2017-12-06 16:36:40
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlXyCreditRadar(ExtWlXyCreditRadarDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlXyCreditRadar(paramMap);
	}
	/**
     * @title: deleteExtWlXyCreditRadarByPrimaryKey
     * @author Administrator
     * @description: 删除 新颜征信雷达报告表,按主键
     * @date 2017-12-06 16:36:40
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlXyCreditRadarByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlXyCreditRadarByPrimaryKey(paramMap);
	}
	
	/**
	 * 
	 * @Description: 新颜征信雷达报告 数据 落地
	 * @param @param map   
	 * @throws
	 * @author huangxianchao
	 * @date 2017年12月13日 上午9:45:21
	 */
	@Override
	public void saveMessage(Map<String, Object> map) {

		String isSuccess = "0";
		String retCode = "";
		String retMsg = "";
		String fkBizId = "";//关联主表ID
		boolean success = false;//默认响应失败
		String errorMsg = "";
		//日志信息
		ExtInterfaceLogDTO interfaceLogDto = (ExtInterfaceLogDTO) map.get("interfaceLogDto");
		
		String results = (String) map.get("result");
		try {
			if(null == map.get("intoCustomerRefId")){
                map.put("intoCustomerRefId", "");//非贷款系统调用，这个没有值
            }
			if(StringUtils.isNotEmpty((CharSequence) map.get("result")) && !"null".equals(map.get("result"))){//有报文返回
				Map resultMap = JSON.parseObject(results);
				if(null != resultMap.get("success")){
					success = (Boolean) resultMap.get("success");
					retCode = resultMap.get("success").toString();
				}
				
				if(success){//成功 "data"有数据返回
					isSuccess = "1";
					interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
    				interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_1.getValue());
	                Map dataMap = (Map) resultMap.get("data");
	                String code = (String) dataMap.get("code");
	                
	                if(null != code && "0".equals(code)){//"0"表示查询成功
	                	if(null != dataMap.get("desc")){
	                		retMsg = dataMap.get("desc").toString();
	                	}
	                	Map rtMap = (Map) dataMap.get("map");//返回各个需求的结果
	                	ExtWlXyCreditRadarDTO dto = new ExtWlXyCreditRadarDTO();

	                	if(null != map.get("intoCustomerRefId") && !"".equals(map.get("intoCustomerRefId"))){
                            dto.setIntoCustRefId(Long.parseLong((String) map.get("intoCustomerRefId")));
                        }
	                	if(null != dataMap.get("id_card")){
	                		dto.setCardNo(dataMap.get("id_card").toString());
	                	}
	                    
	                	if (null != rtMap.get("21160001"))
	                        dto.setCol21160001(rtMap.get("21160001").toString());
	                    if (null != rtMap.get("21160002"))
	                        dto.setCol21160002(rtMap.get("21160002").toString());
	                    if (null != rtMap.get("21160003"))
	                        dto.setCol21160003(rtMap.get("21160003").toString());
	                    if (null != rtMap.get("21160004"))
	                        dto.setCol21160004(rtMap.get("21160004").toString());
	                    if (null != rtMap.get("21160005"))
	                        dto.setCol21160005(rtMap.get("21160005").toString());
	                    if (null != rtMap.get("21160006"))
	                        dto.setCol21160006(rtMap.get("21160006").toString());
	                    if (null != rtMap.get("21160007"))
	                        dto.setCol21160007(rtMap.get("21160007").toString());
	                    if (null != rtMap.get("21160008"))
	                        dto.setCol21160008(rtMap.get("21160008").toString());
	                    if (null != rtMap.get("21160009"))
	                        dto.setCol21160009(rtMap.get("21160009").toString());
	                    if (null != rtMap.get("21160010"))
	                        dto.setCol21160010(rtMap.get("21160010").toString());
	                    if (null != rtMap.get("21170001"))
	                        dto.setCol21170001(rtMap.get("21170001").toString());
	                    if (null != rtMap.get("21170002"))
	                        dto.setCol21170002(rtMap.get("21170002").toString());
	                    if (null != rtMap.get("21170003"))
	                        dto.setCol21170003(rtMap.get("21170003").toString());
	                    if (null != rtMap.get("21170004"))
	                        dto.setCol21170004(rtMap.get("21170004").toString());
	                    if (null != rtMap.get("21170005"))
	                        dto.setCol21170005(rtMap.get("21170005").toString());
	                    if (null != rtMap.get("21170006"))
	                        dto.setCol21170006(rtMap.get("21170006").toString());
	                    if (null != rtMap.get("21170007"))
	                        dto.setCol21170007(rtMap.get("21170007").toString());
	                    if (null != rtMap.get("21170008"))
	                        dto.setCol21170008(rtMap.get("21170008").toString());
	                    if (null != rtMap.get("21170009"))
	                        dto.setCol21170009(rtMap.get("21170009").toString());
	                    if (null != rtMap.get("21170010"))
	                        dto.setCol21170010(rtMap.get("21170010").toString());
	                    if (null != rtMap.get("21170011"))
	                        dto.setCol21170011(rtMap.get("21170011").toString());
	                    if (null != rtMap.get("21170012"))
	                        dto.setCol21170012(rtMap.get("21170012").toString());
	                    if (null != rtMap.get("21170013"))
	                        dto.setCol21170013(rtMap.get("21170013").toString());
	                    if (null != rtMap.get("21170014"))
	                        dto.setCol21170014(rtMap.get("21170014").toString());
	                    if (null != rtMap.get("21170015"))
	                        dto.setCol21170015(rtMap.get("21170015").toString());
	                    if (null != rtMap.get("21170016"))
	                        dto.setCol21170016(rtMap.get("21170016").toString());
	                    if (null != rtMap.get("21170017"))
	                        dto.setCol21170017(rtMap.get("21170017").toString());
	                    if (null != rtMap.get("21180001"))
	                        dto.setCol21180001(rtMap.get("21180001").toString());
	                    if (null != rtMap.get("21180002"))
	                        dto.setCol21180002(rtMap.get("21180002").toString());
	                    if (null != rtMap.get("21180003"))
	                        dto.setCol21180003(rtMap.get("21180003").toString());
	                    if (null != rtMap.get("21180004"))
	                        dto.setCol21180004(rtMap.get("21180004").toString());
	                    if (null != rtMap.get("21180005"))
	                        dto.setCol21180005(rtMap.get("21180005").toString());
	                    if (null != rtMap.get("21180006"))
	                        dto.setCol21180006(rtMap.get("21180006").toString());
	                    if (null != rtMap.get("21180007"))
	                        dto.setCol21180007(rtMap.get("21180007").toString());
	                    if (null != rtMap.get("21180008"))
	                        dto.setCol21180008(rtMap.get("21180008").toString());
	                    if (null != rtMap.get("21180009"))
	                        dto.setCol21180009(rtMap.get("21180009").toString());
	                    if (null != rtMap.get("21180010"))
	                        dto.setCol21180010(rtMap.get("21180010").toString());
	                    if (null != rtMap.get("21180011"))
	                        dto.setCol21180011(rtMap.get("21180011").toString());
	                    if (null != rtMap.get("21180012"))
	                        dto.setCol21180012(rtMap.get("21180012").toString());
	                	//插入数据
	                	Long id = this.insertExtWlXyCreditRadar(dto);
	                	if(null != id){
	                		fkBizId = String.valueOf(id);
	                	}
	                	
	                }else{
	                	interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_2.getKey());
	    				interfaceLogDto.setRetMsg("调用新颜征信雷达报告查无");
	                }
					
				}else{//false
					if(null != resultMap.get("errorMsg")){
	            		errorMsg = resultMap.get("errorMsg").toString();
	            		retMsg = resultMap.get("errorMsg").toString();//设置错误信息
	            	}
	            	interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_5.getKey());
					interfaceLogDto.setRetMsg("调用新颜征信雷达报告返回错误信息");
				}
			}else if(StringUtils.isEmpty((CharSequence) map.get("result"))){
				interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				interfaceLogDto.setRetMsg("调用新颜征信雷达报告接口报错");
			}
		} catch (Exception e) {
			JYLoggerUtil.error(this.getClass(), "===保存新颜征信雷达报告日志异常===接口日志ID:"+String.valueOf(map.get("interfaceId")), e);
			interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4.getKey());//解析回参出错
			interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_4.getValue());
		}finally{
			try {
		    	interfaceLogDto.setRetBody(results);
				interfaceLogDto.setExt2(isSuccess);
				interfaceLogDto.setExt3(retCode);
                interfaceLogDto.setExt4(retMsg);
                interfaceLogDto.setExt5(fkBizId);
				extInterfaceLogService.insertExtInterfaceLog(interfaceLogDto);
			} catch (Exception e) {
				JYLoggerUtil.error(this.getClass(), "===保存新颜征信雷达报告日志异常===接口日志ID:"+String.valueOf(map.get("interfaceId")), e);
			}
		}
		
	}

}

