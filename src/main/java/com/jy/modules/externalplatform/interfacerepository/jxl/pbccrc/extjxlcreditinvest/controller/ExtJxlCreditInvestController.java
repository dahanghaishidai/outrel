package com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlcreditinvest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlcreditinvest.service.ExtJxlCreditInvestService;
import com.jy.platform.restservice.web.base.BaseController;

/**
 * @classname: ExtJxlCreditInvestController
 * @description: 定义  聚信立央行征信采集申请表 控制层
 * @author:  dell
 */
@Controller
@Scope("prototype")
@RequestMapping("/extJxlCreditInvest")
public class ExtJxlCreditInvestController extends BaseController{
    @Autowired
    @Qualifier("com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlcreditinvest.service.ExtJxlCreditInvestService")
    private ExtJxlCreditInvestService service;
    
    /**
     * 通过 Controller 请求 跳转 进入至相关 页面
     * @throws Exception 
     */
    @RequestMapping(value = "/prepareExecute/{operate}")
    public ModelAndView execute(@PathVariable("operate") String operate) throws Exception {
        ModelAndView model = new ModelAndView();
        if("toView".equals(operate)){//跳转至 人行征信简版（聚信立）展示页面
        	//进件编号
            String intoId = this.getParameterString("intoId");
            //查询聚信立央行征信报告信息
			model = service.inquireJxlCreditReportInfo(intoId);
			if (model.isEmpty()) {
				//跳转到暂无数据提示页面
			    model.setViewName("extbiz/in/junxinli/noShow");
        	}else{
        		//跳转到聚信立央行征信展示页面
		    	model.setViewName("extbiz/in/junxinli/pbccrc/extjxlcreditreport/viewExtJxlCreditReport");
        	}
        }
        return model;
    }
    
}
