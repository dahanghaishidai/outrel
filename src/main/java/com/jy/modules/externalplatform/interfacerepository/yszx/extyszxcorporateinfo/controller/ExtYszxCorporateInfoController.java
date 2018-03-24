package com.jy.modules.externalplatform.interfacerepository.yszx.extyszxcorporateinfo.controller;

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

import com.jy.modules.externalplatform.interfacerepository.yszx.extyszxcorporateinfo.dto.ExtYszxCorporateInfoDTO;
import com.jy.modules.externalplatform.interfacerepository.yszx.extyszxcorporateinfo.service.ExtYszxCorporateInfoService;
import com.jy.platform.core.common.BaseDTO;
import com.jy.platform.core.message.DataMsg;
import com.jy.platform.core.message.PageParameter;
import com.jy.platform.core.message.PageUtil;
import com.jy.platform.core.message.QueryReqBean;
import com.jy.platform.restservice.exception.AbaboonException;
import com.jy.platform.restservice.web.base.BaseController;

/**
 * @classname: ExtYszxCorporateInfoController
 * @description: 定义  元素征信-企业法人信息 控制层
 * @author:  dell
 */
@Controller
@Scope("prototype")
@RequestMapping("/extYszxCorporateInfo")
public class ExtYszxCorporateInfoController extends BaseController{
    private static final Logger logger =  LoggerFactory.getLogger(ExtYszxCorporateInfoController.class);

    @Autowired
    @Qualifier("com.jy.modules.externalplatform.interfacerepository.yszx.extyszxcorporateinfo.service.ExtYszxCorporateInfoService")
    private ExtYszxCorporateInfoService service;
    
    /**
     * 通过 Controller 请求 跳转 进入至相关 页面
     */
    @RequestMapping(value = "/prepareExecute/{operate}")
    public ModelAndView execute(@PathVariable("operate") String operate) throws AbaboonException {
        ModelAndView model = new ModelAndView();
        
        if("toQueryPage".equals(operate)){//跳转至 查询页面
        	model.setViewName("externalplatform/interfacerepository/yszx/extyszxcorporateinfo/queryExtYszxCorporateInfo");
        }else if("toAdd".equals(operate)){ //跳转至 新增页面
        	model.setViewName("externalplatform/interfacerepository/yszx/extyszxcorporateinfo/addExtYszxCorporateInfo");
        }else if("toUpdate".equals(operate)){//跳转至 修改页面
        	String id = this.getParameterString("id");
        	model = this.queryOneDTO(id);
        	model.setViewName("externalplatform/interfacerepository/yszx/extyszxcorporateinfo/updateExtYszxCorporateInfo");
        }else if("toView".equals(operate)){//跳转至 查看页面
        	String id = this.getParameterString("id");
        	model = this.queryOneDTO(id);
        	model.setViewName("externalplatform/interfacerepository/yszx/extyszxcorporateinfo/viewExtYszxCorporateInfo");
        }
        
        return model;
    }
    
    /**
     * @author dell
     * @description:查询分页列表
     * @date 2017-06-01 18:02:16
     * @param request
     * @param dto
     * @param dataMsg
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/queryListExtYszxCorporateInfo")
    @ResponseBody
    public DataMsg queryListExtYszxCorporateInfo(HttpServletRequest request, ExtYszxCorporateInfoDTO dto, @ModelAttribute DataMsg dataMsg) throws Exception {
        
    	Map<String, Object> searchParams = new HashMap<String, Object>();
    	searchParams.put("dto", dto);
        QueryReqBean params = new QueryReqBean();
        params.setSearchParams(searchParams);
    	PageParameter pageInfo = PageUtil.toPageParameter(dataMsg);
		params.setPageParameter(pageInfo);
		
        List<ExtYszxCorporateInfoDTO> list = service.searchExtYszxCorporateInfoByPaging(params.getSearchParams());
        
        dataMsg.setData(list);
        dataMsg.setTotalRows(pageInfo.getTotalCount());
        return dataMsg;
    }
    

    /**
     * @author dell
     * @description:新增
     * @date 2017-06-01 18:02:16
     * @param request
     * @param dto
     * @param dataMsg
     * @return
     * @throws
     */
    @RequestMapping(value = "/insertExtYszxCorporateInfo")
    @ResponseBody
    public DataMsg insertExtYszxCorporateInfo(HttpServletRequest request, ExtYszxCorporateInfoDTO dto, @ModelAttribute DataMsg dataMsg){
        try {
        	dto = (ExtYszxCorporateInfoDTO)super.initDto(dto);

            service.insertExtYszxCorporateInfo(dto);
            
            dataMsg = super.initDataMsg(dataMsg);
            dataMsg.setMsg("新增成功");
            dataMsg.setData(this.makeJSONData(dto.getId()));
        }catch (Exception e) {
        	dataMsg.failed(e.getMessage());
        	logger.error("执行方法insertExtYszxCorporateInfo异常：", e);
        }
        return dataMsg;
    }

    /**
     * @author dell
     * @description:编辑
     * @date 2017-06-01 18:02:16
     * @param request
     * @param dto
     * @param pageData
     * @return
     * @throws
     */
    @RequestMapping(value = "/updateExtYszxCorporateInfo")
    @ResponseBody
    public DataMsg updateExtYszxCorporateInfo(HttpServletRequest request, ExtYszxCorporateInfoDTO dto, @ModelAttribute DataMsg dataMsg){
        try {
        	dto = (ExtYszxCorporateInfoDTO)super.initDto(dto);
           
            service.updateExtYszxCorporateInfo(dto);
            
            dataMsg = super.initDataMsg(dataMsg);
            dataMsg.setMsg("修改成功");
            dataMsg.setData(this.makeJSONData(dto.getId()));
        }catch (Exception e) {
        	dataMsg.failed(e.getMessage());
            logger.error("执行方法updateExtYszxCorporateInfo异常：", e);
        }
        return dataMsg;
    }

    /**
     * @author dell
     * @description:删除
     * @date 2017-06-01 18:02:16
     * @param request
     * @param pageData
     * @return
     * @throws
     */
    @RequestMapping(value = "/deleteExtYszxCorporateInfo")
    @ResponseBody
    public DataMsg deleteExtYszxCorporateInfo(HttpServletRequest request, @ModelAttribute DataMsg dataMsg){
    	
    	BaseDTO dto = super.initDto(null);
   	 	String ids = (String) this.getParameter("ids");//格式: 1,2,3
   	 	dataMsg = super.initDataMsg(dataMsg);
		try {
			 service.deleteExtYszxCorporateInfoByPrimaryKey(dto,ids);
			 dataMsg.setMsg("删除成功");
		} catch (Exception e) {
			dataMsg.failed(e.getMessage());
			logger.error("执行方法deleteExtYszxCorporateInfo异常：", e);

		}
        
        return dataMsg;
    }
    /**
     * @author dell
     * @description:通过主键查询 其明细信息
     * @date 2017-06-01 18:02:16
     * @param id
     * @return
     */
    private ModelAndView queryOneDTO(String id) throws AbaboonException {
        ModelAndView model = new ModelAndView();
        try{
        	ExtYszxCorporateInfoDTO dto = service.queryExtYszxCorporateInfoByPrimaryKey(id);
            //将信息放入 model 以便于传至页面 使用
            model.addObject("dto", dto);
        }catch(Exception e){
        	logger.error("执行方法queryOneDTO异常：", e);
        	throw new AbaboonException("执行queryOneDTO异常：",e);
        }
        return model;
    }
}
