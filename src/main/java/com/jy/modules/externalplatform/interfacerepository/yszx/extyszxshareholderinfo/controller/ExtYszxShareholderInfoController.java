package com.jy.modules.externalplatform.interfacerepository.yszx.extyszxshareholderinfo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jy.modules.externalplatform.interfacerepository.yszx.extyszxshareholderinfo.dto.ExtYszxShareholderInfoDTO;
import com.jy.modules.externalplatform.interfacerepository.yszx.extyszxshareholderinfo.service.ExtYszxShareholderInfoService;
import com.jy.platform.core.common.BaseDTO;
import com.jy.platform.core.message.DataMsg;
import com.jy.platform.core.message.PageParameter;
import com.jy.platform.core.message.PageUtil;
import com.jy.platform.core.message.QueryReqBean;
import com.jy.platform.restservice.exception.AbaboonException;
import com.jy.platform.restservice.web.base.BaseController;

/**
 * @classname: ExtYszxShareholderInfoController
 * @description: 定义  元素征信-企业股东信息 控制层
 * @author:  dell
 */
@Controller
@Scope("prototype")
@RequestMapping("/extYszxShareholderInfo")
public class ExtYszxShareholderInfoController extends BaseController{
    private static final Logger logger =  LoggerFactory.getLogger(ExtYszxShareholderInfoController.class);

    @Autowired
    @Qualifier("com.jy.modules.externalplatform.interfacerepository.yszx.extyszxshareholderinfo.service.ExtYszxShareholderInfoService")
    private ExtYszxShareholderInfoService service;
    
    /**
     * 通过 Controller 请求 跳转 进入至相关 页面
     */
    @RequestMapping(value = "/prepareExecute/{operate}")
    public ModelAndView execute(@PathVariable("operate") String operate) throws AbaboonException {
        ModelAndView model = new ModelAndView();
        
        if("toQueryPage".equals(operate)){//跳转至 查询页面
        	model.setViewName("externalplatform/interfacerepository/yszx/extyszxshareholderinfo/queryExtYszxShareholderInfo");
        }else if("toAdd".equals(operate)){ //跳转至 新增页面
        	model.setViewName("externalplatform/interfacerepository/yszx/extyszxshareholderinfo/addExtYszxShareholderInfo");
        }else if("toUpdate".equals(operate)){//跳转至 修改页面
        	String id = this.getParameterString("id");
        	model = this.queryOneDTO(id);
        	model.setViewName("externalplatform/interfacerepository/yszx/extyszxshareholderinfo/updateExtYszxShareholderInfo");
        }else if("toView".equals(operate)){//跳转至 查看页面
        	String id = this.getParameterString("id");
        	model = this.queryOneDTO(id);
        	model.setViewName("externalplatform/interfacerepository/yszx/extyszxshareholderinfo/viewExtYszxShareholderInfo");
        }
        
        return model;
    }
    
    /**
     * @author dell
     * @description:查询分页列表
     * @date 2017-06-01 18:01:47
     * @param request
     * @param dto
     * @param dataMsg
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/queryListExtYszxShareholderInfo")
    @ResponseBody
    public DataMsg queryListExtYszxShareholderInfo(HttpServletRequest request, ExtYszxShareholderInfoDTO dto, @ModelAttribute DataMsg dataMsg) throws Exception {
        
    	Map<String, Object> searchParams = new HashMap<String, Object>();
    	searchParams.put("dto", dto);
        QueryReqBean params = new QueryReqBean();
        params.setSearchParams(searchParams);
    	PageParameter pageInfo = PageUtil.toPageParameter(dataMsg);
		params.setPageParameter(pageInfo);
		
        List<ExtYszxShareholderInfoDTO> list = service.searchExtYszxShareholderInfoByPaging(params.getSearchParams());
        
        dataMsg.setData(list);
        dataMsg.setTotalRows(pageInfo.getTotalCount());
        return dataMsg;
    }
    

    /**
     * @author dell
     * @description:新增
     * @date 2017-06-01 18:01:47
     * @param request
     * @param dto
     * @param dataMsg
     * @return
     * @throws
     */
    @RequestMapping(value = "/insertExtYszxShareholderInfo")
    @ResponseBody
    public DataMsg insertExtYszxShareholderInfo(HttpServletRequest request, ExtYszxShareholderInfoDTO dto, @ModelAttribute DataMsg dataMsg){
        try {
        	dto = (ExtYszxShareholderInfoDTO)super.initDto(dto);

            service.insertExtYszxShareholderInfo(dto);
            
            dataMsg = super.initDataMsg(dataMsg);
            dataMsg.setMsg("新增成功");
            dataMsg.setData(this.makeJSONData(dto.getId()));
        }catch (Exception e) {
        	dataMsg.failed(e.getMessage());
        	logger.error("执行方法insertExtYszxShareholderInfo异常：", e);
        }
        return dataMsg;
    }

    /**
     * @author dell
     * @description:编辑
     * @date 2017-06-01 18:01:47
     * @param request
     * @param dto
     * @param pageData
     * @return
     * @throws
     */
    @RequestMapping(value = "/updateExtYszxShareholderInfo")
    @ResponseBody
    public DataMsg updateExtYszxShareholderInfo(HttpServletRequest request, ExtYszxShareholderInfoDTO dto, @ModelAttribute DataMsg dataMsg){
        try {
        	dto = (ExtYszxShareholderInfoDTO)super.initDto(dto);
           
            service.updateExtYszxShareholderInfo(dto);
            
            dataMsg = super.initDataMsg(dataMsg);
            dataMsg.setMsg("修改成功");
            dataMsg.setData(this.makeJSONData(dto.getId()));
        }catch (Exception e) {
        	dataMsg.failed(e.getMessage());
            logger.error("执行方法updateExtYszxShareholderInfo异常：", e);
        }
        return dataMsg;
    }

    /**
     * @author dell
     * @description:删除
     * @date 2017-06-01 18:01:47
     * @param request
     * @param pageData
     * @return
     * @throws
     */
    @RequestMapping(value = "/deleteExtYszxShareholderInfo")
    @ResponseBody
    public DataMsg deleteExtYszxShareholderInfo(HttpServletRequest request, @ModelAttribute DataMsg dataMsg){
    	
    	BaseDTO dto = super.initDto(null);
   	 	String ids = (String) this.getParameter("ids");//格式: 1,2,3
   	 	dataMsg = super.initDataMsg(dataMsg);
		try {
			 service.deleteExtYszxShareholderInfoByPrimaryKey(dto,ids);
			 dataMsg.setMsg("删除成功");
		} catch (Exception e) {
			dataMsg.failed(e.getMessage());
			logger.error("执行方法deleteExtYszxShareholderInfo异常：", e);

		}
        
        return dataMsg;
    }
    /**
     * @author dell
     * @description:通过主键查询 其明细信息
     * @date 2017-06-01 18:01:47
     * @param id
     * @return
     */
    private ModelAndView queryOneDTO(String id) throws AbaboonException {
        ModelAndView model = new ModelAndView();
        try{
        	ExtYszxShareholderInfoDTO dto = service.queryExtYszxShareholderInfoByPrimaryKey(id);
            //将信息放入 model 以便于传至页面 使用
            model.addObject("dto", dto);
        }catch(Exception e){
        	logger.error("执行方法queryOneDTO异常：", e);
        	throw new AbaboonException("执行queryOneDTO异常：",e);
        }
        return model;
    }
}
