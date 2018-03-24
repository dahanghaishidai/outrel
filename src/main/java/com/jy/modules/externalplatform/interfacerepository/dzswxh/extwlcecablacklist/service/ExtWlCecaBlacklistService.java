package com.jy.modules.externalplatform.interfacerepository.dzswxh.extwlcecablacklist.service;
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
import com.alibaba.fastjson.JSONArray;
import com.jy.modules.externalplatform.interfacerepository.dzswxh.extwlcecablacklist.dao.ExtWlCecaBlacklistDao;
import com.jy.modules.externalplatform.interfacerepository.dzswxh.extwlcecablacklist.dto.ExtWlCecaBlacklistDTO;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.BaseDTO;
import com.jy.platform.core.common.JYLoggerUtil;

/**
 * @classname: ExtWlCecaBlacklistService
 * @description: 定义  电子商务协会反欺诈黑名单表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.dzswxh.extwlcecablacklist.service.ExtWlCecaBlacklistService")
public class ExtWlCecaBlacklistService implements ExtSaveMessageDao {
	
	private static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	
	@Autowired
	ExtInterfaceLogService extInterfaceLogService;

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlCecaBlacklistDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 电子商务协会反欺诈黑名单表列表
     * @date 2017-12-07 10:00:02
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlCecaBlacklistDTO> searchExtWlCecaBlacklistByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlCecaBlacklistDTO> dataList =  dao.searchExtWlCecaBlacklistByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询电子商务协会反欺诈黑名单表列表
     * @date 2017-12-07 10:00:02
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlCecaBlacklistDTO> searchExtWlCecaBlacklist(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlCecaBlacklistDTO> dataList = dao.searchExtWlCecaBlacklist(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询电子商务协会反欺诈黑名单表对象
     * @date 2017-12-07 10:00:02
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlCecaBlacklistDTO queryExtWlCecaBlacklistByPrimaryKey(String id) throws Exception {
		
		ExtWlCecaBlacklistDTO dto = dao.findExtWlCecaBlacklistByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlCecaBlacklistDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlCecaBlacklist
     * @author Administrator
     * @description: 新增 电子商务协会反欺诈黑名单表对象
     * @date 2017-12-07 10:00:02
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlCecaBlacklist(ExtWlCecaBlacklistDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlCecaBlacklist(paramMap);
		
		ExtWlCecaBlacklistDTO resultDto = (ExtWlCecaBlacklistDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlCecaBlacklist
     * @author Administrator
     * @description: 修改 电子商务协会反欺诈黑名单表对象
     * @date 2017-12-07 10:00:02
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlCecaBlacklist(ExtWlCecaBlacklistDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlCecaBlacklist(paramMap);
	}
	/**
     * @title: deleteExtWlCecaBlacklistByPrimaryKey
     * @author Administrator
     * @description: 删除 电子商务协会反欺诈黑名单表,按主键
     * @date 2017-12-07 10:00:02
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlCecaBlacklistByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlCecaBlacklistByPrimaryKey(paramMap);
	}
	

	/**
	 * @methodName: saveMessage
	 * @param: map 接口返回报文
	 * @describe: 电子商务反欺诈黑名单 数据落地
	 * @auther: huangxianchao
	 * @date: 2017/12/15 0015
	 * @time: 上午 10:27
	 **/
	@Override
	public void saveMessage(Map<String, Object> map) {

		String isSuccess = "0";//1:成功  2:失败
		String retCode = "";
		String retMsg =  "";
		String fkBizId = "";//关联主表ID
		
		JSONArray jArray=new JSONArray();
		//日志信息
		ExtInterfaceLogDTO interfaceLogDto = (ExtInterfaceLogDTO) map.get("interfaceLogDto");
		//用来存储主表ID集合
		List<String> idList = new ArrayList<String>();
		//接收返回的报文
		String results = (String) map.get("result");
		try {
			if(StringUtils.isNotEmpty((CharSequence) map.get("result"))){//有报文
				isSuccess = "1";
				interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
				interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_1.getValue());
				//返回的是数数字
				jArray = JSON.parseArray(results);
				for(int i = 0; i < jArray.size(); i++){
					Map rtMap = (Map) jArray.get(i);
					ExtWlCecaBlacklistDTO dto = new ExtWlCecaBlacklistDTO();
					if(null != map.get("intoId"))
					    dto.setIntoId(map.get("intoId").toString());
					if(null != map.get("mobile"))
					    dto.setMobile(map.get("mobile").toString());
					if(null != rtMap.get("zjHaoMa"))
					    dto.setIdNo(rtMap.get("zjHaoMa").toString());
					if(null != rtMap.get("xingMing"))
						dto.setName(rtMap.get("xingMing").toString());
					if(null != rtMap.get("anHao"))
					    dto.setDescription(rtMap.get("anHao").toString());
					if(null != rtMap.get("xiangXi"))
						dto.setDetail(rtMap.get("xiangXi").toString());
					
					//插入数据返回
					Long id = this.insertExtWlCecaBlacklist(dto);
					idList.add(String.valueOf(id));
					
				}
				
			}else{//没有报文
				interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				interfaceLogDto.setRetMsg("调用电子商务协会反欺诈黑名单查无");
				
			}
		} catch (Exception e) {
			JYLoggerUtil.error(this.getClass(), "===保存电子商务协会反欺诈黑名单日志异常===接口日志ID:"+String.valueOf(map.get("interfaceId")), e);
			interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4.getKey());//解析回参出错
			interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_4.getValue());
		}finally{
			try {
		    	interfaceLogDto.setRetBody(results);
                interfaceLogDto.setExt2(isSuccess);
                interfaceLogDto.setExt3(retCode);
                interfaceLogDto.setExt4(retMsg);
                StringBuffer sb = new StringBuffer();
                if(null != idList && idList.size() > 0){
                	for(int i = 0; i < idList.size(); i++){
                		if (StringUtils.isNotEmpty(sb)){
							sb.append(","+idList.get(i).toString());
						}else {
							sb.append(idList.get(i).toString());
						}
                	}
                }
                if (sb.length()>500){
                	sb.substring(1,500);
				}
                if (StringUtils.isNotEmpty(sb)){
					interfaceLogDto.setExt5(sb.toString());
				}

				extInterfaceLogService.insertExtInterfaceLog(interfaceLogDto);
                
			} catch (Exception e) {
				JYLoggerUtil.error(this.getClass(), "===保存电子商务协会反欺诈黑名单日志异常===接口日志ID:"+String.valueOf(map.get("interfaceId")), e);
			}
			
		}
		
	}

}

