package com.jy.modules.externalplatform.application.extinterfaceinfo.service;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import oracle.sql.BLOB;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;

import com.jy.modules.externalplatform.application.extinterfaceinfo.dao.ExtInterfaceInfoDao;
import com.jy.modules.externalplatform.application.extinterfaceinfo.dto.ExtInterfaceInfoDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtInterfaceInfoService
 * @description: 定义  接口配置表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.application.extinterfaceinfo.service.ExtInterfaceInfoService")
public class ExtInterfaceInfoService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtInterfaceInfoDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 接口配置表列表
     * @date 2017-05-11 14:04:24
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtInterfaceInfoDTO> searchExtInterfaceInfoByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtInterfaceInfoDTO> dataList =  dao.searchExtInterfaceInfoByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询接口配置表列表
     * @date 2017-05-11 14:04:24
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtInterfaceInfoDTO> searchExtInterfaceInfo(Map<String,Object> searchParams) throws Exception {
	    List<ExtInterfaceInfoDTO> dataList = dao.searchExtInterfaceInfo(searchParams);
        return dataList;
    }
	
	/**
	* @title: queryExtInferfaceTemplateContent
	* @author:陈东栋
	* @description: 按接口编码查询（请求报文）模板内容
	* @date 2017年5月25日 下午4:41:56
	* @param interfaceNo
	* @return
	* @throws 
	*/ 
	public ExtInterfaceInfoDTO queryExtInferfaceTemplateContent(String interfaceNo) throws Exception {
	    ExtInterfaceInfoDTO dto = dao.queryExtInferfaceTemplateContent(interfaceNo);
	    if(dto == null) dto = new ExtInterfaceInfoDTO();
	    return dto;
    }
	
	
	
	
	/**
     * @author Administrator
     * @description: 查询接口配置表对象
     * @date 2017-05-11 14:04:24
     * @param id
     * @return
     * @throws
     */ 
	public ExtInterfaceInfoDTO queryExtInterfaceInfoByPrimaryKey(String id) throws Exception {
		
		ExtInterfaceInfoDTO dto = dao.findExtInterfaceInfoByPrimaryKey(id);
		
		if(dto == null) dto = new ExtInterfaceInfoDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtInterfaceInfo
     * @author Administrator
     * @description: 新增 接口配置表对象
     * @date 2017-05-11 14:04:24
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtInterfaceInfo(ExtInterfaceInfoDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		dto.setCreateBy(dto.getOpUserId().toString());
		paramMap.put("dto", dto);
		
		int count = dao.insertExtInterfaceInfo(paramMap);
		
		ExtInterfaceInfoDTO resultDto = (ExtInterfaceInfoDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtInterfaceInfo
     * @author Administrator
     * @description: 修改 接口配置表对象
     * @date 2017-05-11 14:04:24
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtInterfaceInfo(ExtInterfaceInfoDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		dto.setModifyBy(dto.getOpUserId().toString());
		paramMap.put("dto", dto);
		
		dao.updateExtInterfaceInfo(paramMap);
	}
	
	
	/**
	* @title: insertExtInterfaceInfo
	* @author:陈东栋
	* @description:
	* @date 2017年5月24日 上午10:02:02
	* @param dto   接口配置表对象
	* @param fileIn 模板文件输入流（接口请求报文）
	* @return
	* @throws 
	*/ 
	public Long insertExtInterfaceInfo(ExtInterfaceInfoDTO dto,InputStream fileIn) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		dto.setCreateBy(dto.getOpUserId().toString());
		paramMap.put("dto", dto);
		dao.insertExtInterfaceInfo(paramMap);
		ExtInterfaceInfoDTO resultDto = (ExtInterfaceInfoDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		if(fileIn!=null){
			//锁定一行数据
			ExtInterfaceInfoDTO prsitDto = dao.findExtInterfaceInfoByPrimaryKeyForUpdate(String.valueOf(keyId));
			BLOB content = (BLOB)prsitDto.getTemplateContent();
			OutputStream ops = null;  
			try {  
				ops = content.setBinaryStream(0);//ojdbc14支持,ojdbc6,5都不支持 
				byte[] data = null;  
				data = FileCopyUtils.copyToByteArray(fileIn);  
				ops.write(data);  
			} catch (Exception e) {  
				e.printStackTrace();  
			} finally {  
				try {  
					if(fileIn!=null){  
						fileIn.close();  
					}  
					if(ops!=null){  
						ops.close();  
					}  
				} catch (IOException e) {  
					e.printStackTrace();  
				}  
			} 
		}
		return keyId;
	}
	
	/**
	* @title: updateExtInterfaceInfo
	* @author:陈东栋
	* @description:
	* @date 2017年5月24日 上午10:02:42
	* @param dto 接口配置表对象
	* @param fileIn 模板文件输入流（接口请求报文）
	* @throws 
	*/ 
	public void updateExtInterfaceInfo(ExtInterfaceInfoDTO dto,InputStream fileIn) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		dto.setModifyBy(dto.getOpUserId().toString());
		paramMap.put("dto", dto);
		dao.updateExtInterfaceInfo(paramMap);
		Long keyId = dto.getId();
		if(fileIn!=null){
		    dao.updateTemplateContent(paramMap);//清空模板数据
			//锁定一行数据
			ExtInterfaceInfoDTO prsitDto = dao.findExtInterfaceInfoByPrimaryKeyForUpdate(String.valueOf(keyId));
			BLOB content = (BLOB)prsitDto.getTemplateContent();
			OutputStream ops = null;  
			try {  
				ops = content.setBinaryStream(0);//ojdbc14支持,ojdbc6,5都不支持  
				byte[] data = null;  
				data = FileCopyUtils.copyToByteArray(fileIn);  
				ops.write(data);  
			} catch (Exception e) {  
				e.printStackTrace();  
			} finally {  
				try {  
					if(fileIn!=null){  
						fileIn.close();  
					}  
					if(ops!=null){  
						ops.close();  
					}  
				} catch (IOException e) {  
					e.printStackTrace();  
				}  
			} 
		}
	}

	/**
     * @title: deleteExtInterfaceInfoByID
     * @author Administrator
     * @description: 删除 接口配置表,按主键
     * @date 2017-05-11 14:04:24
     * @param paramMap
     * @throws
     */ 
	public void deleteExtInterfaceInfoByID(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtInterfaceInfoByID(paramMap);
	}	
}