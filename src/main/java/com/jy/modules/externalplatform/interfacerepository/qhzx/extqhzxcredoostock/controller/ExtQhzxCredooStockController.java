package com.jy.modules.externalplatform.interfacerepository.qhzx.extqhzxcredoostock.controller;

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

import com.jy.modules.externalplatform.interfacerepository.qhzx.extqhzxcredoostock.dto.ExtQhzxCredooStockDTO;
import com.jy.modules.externalplatform.interfacerepository.qhzx.extqhzxcredoostock.service.ExtQhzxCredooStockService;
import com.jy.platform.core.message.DataMsg;
import com.jy.platform.core.message.PageParameter;
import com.jy.platform.core.message.PageUtil;
import com.jy.platform.core.message.QueryReqBean;
import com.jy.platform.restservice.exception.AbaboonException;
import com.jy.platform.restservice.web.base.BaseController;

/**
 * @classname: ExtQhzxCredooStockController
 * @description: 定义  好信度数据表 控制层
 * @author:  dell
 */
@Controller
@Scope("prototype")
@RequestMapping("/extQhzxCredooStock")
public class ExtQhzxCredooStockController extends BaseController{
    private static final Logger logger =  LoggerFactory.getLogger(ExtQhzxCredooStockController.class);

    @Autowired
    @Qualifier("com.jy.modules.externalplatform.interfacerepository.qhzx.extqhzxcredoostock.service.ExtQhzxCredooStockService")
    private ExtQhzxCredooStockService service;
    
    /**
     * 通过 Controller 请求 跳转 进入至相关 页面
     */
    @RequestMapping(value = "/prepareExecute/{operate}")
    public ModelAndView execute(@PathVariable("operate") String operate) throws AbaboonException {
        ModelAndView model = new ModelAndView();
        
        if("toQueryPage".equals(operate)){//跳转至 查询页面
        	model.setViewName("externalplatform/interfacerepository/qhzx/extqhzxcredoostock/queryExtQhzxCredooStock");
        }else if("toView".equals(operate)){//跳转至 查看页面
        	String id = this.getParameterString("id");
        	model = this.queryOneDTO(id);
        	model.setViewName("externalplatform/interfacerepository/qhzx/extqhzxcredoostock/viewExtQhzxCredooStock");
        }
        
        return model;
    }
    
    /**
     * @author dell
     * @description:查询分页列表
     * @date 2017-06-05 10:36:40
     * @param request
     * @param dto
     * @param dataMsg
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/queryListExtQhzxCredooStock")
    @ResponseBody
    public DataMsg queryListExtQhzxCredooStock(HttpServletRequest request, ExtQhzxCredooStockDTO dto, @ModelAttribute DataMsg dataMsg) throws Exception {
        
    	Map<String, Object> searchParams = new HashMap<String, Object>();
    	searchParams.put("dto", dto);
        QueryReqBean params = new QueryReqBean();
        params.setSearchParams(searchParams);
    	PageParameter pageInfo = PageUtil.toPageParameter(dataMsg);
		params.setPageParameter(pageInfo);
		
        List<ExtQhzxCredooStockDTO> list = service.searchExtQhzxCredooStockByPaging(params.getSearchParams());
        
        dataMsg.setData(list);
        dataMsg.setTotalRows(pageInfo.getTotalCount());
        return dataMsg;
    }
    

    /**
     * @author dell
     * @description:新增
     * @date 2017-06-05 10:36:40
     * @param request
     * @param dto
     * @param dataMsg
     * @return
     * @throws
     */
    @RequestMapping(value = "/insertExtQhzxCredooStock")
    @ResponseBody
    public DataMsg insertExtQhzxCredooStock(HttpServletRequest request, ExtQhzxCredooStockDTO dto, @ModelAttribute DataMsg dataMsg){
        try {
        	dto = (ExtQhzxCredooStockDTO)super.initDto(dto);

            service.insertExtQhzxCredooStock(dto);
            
            dataMsg = super.initDataMsg(dataMsg);
            dataMsg.setMsg("新增成功");
            dataMsg.setData(this.makeJSONData(dto.getId()));
        }catch (Exception e) {
        	dataMsg.failed(e.getMessage());
        	logger.error("执行方法insertExtQhzxCredooStock异常：", e);
        }
        return dataMsg;
    }
    
    /**
     * @author dell
     * @description:通过主键查询 其明细信息
     * @date 2017-06-05 10:36:40
     * @param id
     * @return
     */
    private ModelAndView queryOneDTO(String id) throws AbaboonException {
        ModelAndView model = new ModelAndView();
        try{
        	ExtQhzxCredooStockDTO dto = service.queryExtQhzxCredooStockByPrimaryKey(id);
            //将信息放入 model 以便于传至页面 使用
            model.addObject("dto", dto);
        }catch(Exception e){
        	logger.error("执行方法queryOneDTO异常：", e);
        	throw new AbaboonException("执行queryOneDTO异常：",e);
        }
        return model;
    }
}
