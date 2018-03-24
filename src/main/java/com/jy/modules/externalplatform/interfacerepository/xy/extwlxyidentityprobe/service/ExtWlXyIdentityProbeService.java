package com.jy.modules.externalplatform.interfacerepository.xy.extwlxyidentityprobe.service;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.jy.modules.common.util.DateUtil;
import com.jy.modules.externalplatform.interfacerepository.xy.extwlxyidentityprobe.dao.ExtWlXyIdentityProbeDao;
import com.jy.modules.externalplatform.interfacerepository.xy.extwlxyidentityprobe.dto.ExtWlXyIdentityProbeDTO;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.BaseDTO;
import com.jy.platform.core.common.JYLoggerUtil;

/**
 * @classname: ExtWlXyIdentityProbeService
 * @description: 定义  新颜身份探针信息表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.xy.extwlxyidentityprobe.service.ExtWlXyIdentityProbeService")
public class ExtWlXyIdentityProbeService implements ExtSaveMessageDao {
	
	private static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	
	@Autowired
	ExtInterfaceLogService extInterfaceLogService;

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlXyIdentityProbeDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 新颜身份探针信息表列表
     * @date 2017-12-06 10:47:37
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlXyIdentityProbeDTO> searchExtWlXyIdentityProbeByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlXyIdentityProbeDTO> dataList =  dao.searchExtWlXyIdentityProbeByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询新颜身份探针信息表列表
     * @date 2017-12-06 10:47:37
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlXyIdentityProbeDTO> searchExtWlXyIdentityProbe(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlXyIdentityProbeDTO> dataList = dao.searchExtWlXyIdentityProbe(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询新颜身份探针信息表对象
     * @date 2017-12-06 10:47:37
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlXyIdentityProbeDTO queryExtWlXyIdentityProbeByPrimaryKey(String id) throws Exception {
		
		ExtWlXyIdentityProbeDTO dto = dao.findExtWlXyIdentityProbeByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlXyIdentityProbeDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlXyIdentityProbe
     * @author Administrator
     * @description: 新增 新颜身份探针信息表对象
     * @date 2017-12-06 10:47:37
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlXyIdentityProbe(ExtWlXyIdentityProbeDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlXyIdentityProbe(paramMap);
		
		ExtWlXyIdentityProbeDTO resultDto = (ExtWlXyIdentityProbeDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlXyIdentityProbe
     * @author Administrator
     * @description: 修改 新颜身份探针信息表对象
     * @date 2017-12-06 10:47:37
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlXyIdentityProbe(ExtWlXyIdentityProbeDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlXyIdentityProbe(paramMap);
	}
	/**
     * @title: deleteExtWlXyIdentityProbeByPrimaryKey
     * @author Administrator
     * @description: 删除 新颜身份探针信息表,按主键
     * @date 2017-12-06 10:47:37
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlXyIdentityProbeByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlXyIdentityProbeByPrimaryKey(paramMap);
	}
	
	/**
	 * 
	 * @Description: 新颜身份探针接口数据落地
	 * @param map
	 * @throws
	 * @author huangxianchao
	 * @date 2017年12月13日 上午10:00:08
	 */
	@Override
	public void saveMessage(Map<String, Object> map) {
		
		String isSuccess = "0";//接口调用是否成功
		String retCode = "";//返回接口码
		String retMsg = "";//返回接口信息
		String fkBizId = "";//接口落地数据主表ID
		
		boolean success = false;//默认响应失败
		String errorMsg = "";//错误信息
		
		//日志信息
		ExtInterfaceLogDTO interfaceLogDto = (ExtInterfaceLogDTO) map.get("interfaceLogDto");
		
		//获取返回的报文
		String results = (String) map.get("result");
		try {
			 if(null == map.get("intoCustomerRefId")){
	                map.put("intoCustomerRefId", "");//非贷款系统调用，这个没有值
	            }
			 //判断返回的报文是否为空
			 if(StringUtils.isNotEmpty((CharSequence) map.get("result")) && !"null".equals(map.get("result"))){
				Map resultMap = JSON.parseObject(results); 
				if(null != resultMap.get("success")){
					success = (Boolean) resultMap.get("success");
					retCode = String.valueOf(resultMap.get("success"));
				}
	           
	            if(success){//成功
	            	isSuccess = "1";
	            	interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
    				interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_1.getValue());
	                Map dataMap = (Map) resultMap.get("data");
	                String code = (String) dataMap.get("code");
	                if(null != code && "0".equals(code)){//查询成功，有结果
	                    List result = (List) dataMap.get("result");
	                    Iterator it1 = result.iterator();
	                    while(it1.hasNext()){
	                        Map tmpMap1 = (Map) it1.next();
	                        String productCode = (String) tmpMap1.get("productCode");//功能码
	                        String blackType = (String) tmpMap1.get("blackType");//功能码子类
	                        String subBlackType = (String) tmpMap1.get("subBlackType");//功能码子类细项
	                        
	                        if(StringUtils.isNotEmpty(blackType)){

	                        	List blackDetails = null;
	                        	if(null != tmpMap1.get("blackDetails")){
	                        		 blackDetails = (List) tmpMap1.get("blackDetails");//功能码查询详情
	                        	}
	                           
	                            if(null != blackDetails && blackDetails.size() > 0){
	                            Iterator it2 = blackDetails.iterator();
	                            //循环保存接口数据
	                            while(it2.hasNext()){
	                                Map tmpMap2 = (Map) it2.next();
	                                ExtWlXyIdentityProbeDTO dto = new ExtWlXyIdentityProbeDTO();
	                                if(null != map.get("intoCustomerRefId") && !"".equals(map.get("intoCustomerRefId"))){
		                                dto.setIntoCustRefId(Long.parseLong((String) map.get("intoCustomerRefId")));
	                                }
	                                dto.setCreateBy(Long.parseLong("-1"));
	                                dto.setProductCode(productCode);//功能码
	                                dto.setBlackType(blackType);//功能码子类
	                                dto.setSubBlackType(subBlackType);//功能码子类细项
	                                
	                                //区分类型，保存不同数据
	                                if(null != productCode && "21240001".equals(productCode)){//21240001:公共失信
	                                    if(null != tmpMap2.get("caseNo")){
	                                    	dto.setCaseNo(tmpMap2.get("caseNo").toString());//案件编号
	                                    }
	                                    if(null != tmpMap2.get("court")){
	                                    	dto.setCourt(tmpMap2.get("court").toString());//判决法院
	                                    }
	                                    if(null != tmpMap2.get("disruptTypeName")){
	                                    	dto.setDisruptTypeName(tmpMap2.get("disruptTypeName").toString());//违反条例
	                                    }
	                                    
	                                    if(null != subBlackType && "A01".equals(subBlackType)){//A01 失信被执行人
	                                        if(null != tmpMap2.get("publishDate")){
	                                        	dto.setPublishDate( tmpMap2.get("publishDate").toString());//公开日期  
	                                        }
	                                        String publishDate = "";
	                                        if(null != tmpMap2.get("publishDate")){
	                                        	//公开日期  yyyyMMdd 转换为 yyyy-MM-dd
		                                        publishDate = tmpMap2.get("publishDate").toString();
	                                        }
	                                        
	                                        if(StringUtils.isNotEmpty(publishDate)){
	                                            try {
	                                                dto.setPublishDate(DateUtil.getStringDateFromDate(DateUtil.getDateFromString((String) tmpMap2.get("publishDate"))));
	                                            }
	                                            catch (Exception e) {
	                                                System.err.println(e.getMessage() + "日期转换异常！");
	                                            }
	                                        }
	                                        if(null != tmpMap2.get("performance")){
	                                        	dto.setPerformance(tmpMap2.get("performance").toString());//执行情况
	                                        }
	                                        
	                                        if(null != tmpMap2.get("province")){
	                                        	dto.setProvince(tmpMap2.get("province").toString());//省份
	                                        }
	                                        if(null != tmpMap2.get("duty")){
	                                        	dto.setDuty(tmpMap2.get("duty").toString());
	                                        }
	                                        
	                                    }else if("A02".equals(subBlackType)){//A02 被执行人

	                                    	if(null != tmpMap2.get("regDate")){
	                                    		dto.setRegDate((String) tmpMap2.get("regDate"));//注册时间
	                                    	}
	                                        if(null != tmpMap2.get("execMoney")){
	                                        	dto.setExecMoney((String) tmpMap2.get("execMoney"));//执行金额(元)
	                                        }
	                                    }
	                                }else{
	                                    if(null != tmpMap2.get("blackType")){
	                                    	dto.setBlackTypeName((String) tmpMap2.get("blackType"));//黑名单类型
	                                    }
	                                    if(null != tmpMap2.get("intoBlackReason")){
	                                    	dto.setIntoBlackReason(tmpMap2.get("intoBlackReason").toString());//不良原因
	                                    }
	                                    if(null != tmpMap2.get("intoBlackTime")){
	                                    	dto.setIntoBlackTime((String) tmpMap2.get("intoBlackTime"));//不良时间
	                                    }
	                                    
	                                    if(null != tmpMap2.get("overdueAmount")){
	                                    	dto.setOverdueAmount((String) tmpMap2.get("overdueAmount"));//逾期金额
	                                    }
	                                    
	                                    if(null != tmpMap2.get("overdueLong")){
	                                    	dto.setOverdueLong((String) tmpMap2.get("overdueLong"));//逾期时长 
	                                    }
	                                    if(null != tmpMap2.get("remarks")){
	                                    	dto.setRemarks(tmpMap2.get("remarks").toString());//备注
	                                    }
	                                }
	                                //插入数据
	                                Long id = this.insertExtWlXyIdentityProbe(dto);
	                                if(null != id){
	                                	fkBizId = String.valueOf(id);
	                                }
	                            }
	                          }
	                        }
	                    }
	                    
	                }else{
	                	interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_2.getKey());
	    				interfaceLogDto.setRetMsg("调用新颜身份探针查无");
	                }
	                
	            }else{//success值为false
	            	if(null != resultMap.get("errorMsg")){
	            		errorMsg = resultMap.get("errorMsg").toString();
	            		retMsg = resultMap.get("errorMsg").toString();//设置错误信息
	            	}
	            	interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_5.getKey());
					interfaceLogDto.setRetMsg("调用新颜身份探针返回错误信息");
	            }
			}else{//调用接口返回空
				interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				interfaceLogDto.setRetMsg("调用新颜身份探针接口报错");
				
			}
		} catch (Exception e) {
			JYLoggerUtil.error(this.getClass(), "===保存新颜身份探针日志异常===接口日志ID:"+String.valueOf(map.get("interfaceId")), e);
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
				JYLoggerUtil.error(this.getClass(), "===保存新颜身份探针日志异常===接口日志ID:"+String.valueOf(map.get("interfaceId")), e);
			}
		}
		
	}

}

