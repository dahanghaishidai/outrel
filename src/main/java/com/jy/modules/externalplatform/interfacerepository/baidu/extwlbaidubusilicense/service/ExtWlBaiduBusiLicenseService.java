package com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidubusilicense.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidubusilicense.dto.ExtWlBaiduBusiLicenseDTO;
import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidubusilicense.dao.ExtWlBaiduBusiLicenseDao;

/**
 * @classname: ExtWlBaiduBusiLicenseService
 * @description: 定义  百度金融工商执照表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidubusilicense.service.ExtWlBaiduBusiLicenseService")
public class ExtWlBaiduBusiLicenseService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlBaiduBusiLicenseDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 百度金融工商执照表列表
     * @date 2017-12-13 16:42:46
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlBaiduBusiLicenseDTO> searchExtWlBaiduBusiLicenseByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlBaiduBusiLicenseDTO> dataList =  dao.searchExtWlBaiduBusiLicenseByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询百度金融工商执照表列表
     * @date 2017-12-13 16:42:46
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlBaiduBusiLicenseDTO> searchExtWlBaiduBusiLicense(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlBaiduBusiLicenseDTO> dataList = dao.searchExtWlBaiduBusiLicense(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询百度金融工商执照表对象
     * @date 2017-12-13 16:42:46
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlBaiduBusiLicenseDTO queryExtWlBaiduBusiLicenseByPrimaryKey(String id) throws Exception {
		
		ExtWlBaiduBusiLicenseDTO dto = dao.findExtWlBaiduBusiLicenseByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlBaiduBusiLicenseDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlBaiduBusiLicense
     * @author Administrator
     * @description: 新增 百度金融工商执照表对象
     * @date 2017-12-13 16:42:46
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlBaiduBusiLicense(ExtWlBaiduBusiLicenseDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlBaiduBusiLicense(paramMap);
		
		ExtWlBaiduBusiLicenseDTO resultDto = (ExtWlBaiduBusiLicenseDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlBaiduBusiLicense
     * @author Administrator
     * @description: 修改 百度金融工商执照表对象
     * @date 2017-12-13 16:42:46
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlBaiduBusiLicense(ExtWlBaiduBusiLicenseDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlBaiduBusiLicense(paramMap);
	}
	/**
     * @title: deleteExtWlBaiduBusiLicenseByPrimaryKey
     * @author Administrator
     * @description: 删除 百度金融工商执照表,按主键
     * @date 2017-12-13 16:42:46
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlBaiduBusiLicenseByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlBaiduBusiLicenseByPrimaryKey(paramMap);
	}

	/**
	 * @methodName: insertBatchBusiLicense
	 * @param: busiLicenseList
	 * @describe: 批量保存百度金融工商执照表数据
	 * @auther: huangxianchao
	 * @date: 2017/12/14 0014
	 * @time: 上午 9:32
	 **/
	public void insertBatchBusiLicense(List<ExtWlBaiduBusiLicenseDTO> busiLicenseList) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("busiLicenseList", busiLicenseList);
		dao.insertBatchBusiLicense(paramMap);
	}

}

