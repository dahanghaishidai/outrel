package com.jy.modules.externalplatform.interfacerepository.yszx.extyszxhdinfo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jy.modules.externalplatform.interfacerepository.yszx.extyszxhdinfo.dto.ExtHdCreditInfoDTO;
import com.jy.modules.externalplatform.interfacerepository.yszx.extyszxhdinfo.dto.ExtHdPhoneBckLisDTO;
import com.jy.modules.externalplatform.interfacerepository.yszx.extyszxhdinfo.service.ExtHdMgBaseInfoService;
import com.jy.platform.core.message.DataMsg;
import com.jy.platform.core.message.PageParameter;
import com.jy.platform.core.message.PageUtil;
import com.jy.platform.core.message.QueryReqBean;
import com.jy.platform.restservice.exception.AbaboonException;
import com.jy.platform.restservice.web.base.BaseController;

/**
 * @description 华道
 * @author: sun
 */

@Scope("prototype")
@Controller
@RequestMapping("/extHdMgBaseInfo")
public class ExtHdMgBaseInfoController extends BaseController {

	@Autowired
	private ExtHdMgBaseInfoService extHdMgBaseInfoService;

	/**
	 * 通过 Controller 请求 跳转 进入至相关 页面
	 */
	@RequestMapping(value = "/prepareExecute/{operate}")
	public ModelAndView execute(@PathVariable("operate") String operate) throws AbaboonException {
		ModelAndView model = new ModelAndView();
		String intoCustRefId = this.getParameterString("intoCustRefId");
		String intoId = this.getParameterString("intoId");
		model.addObject("intoCustRefId", intoCustRefId);
		model.addObject("intoId", intoId);

		if ("querCreditHdDetail".equals(operate)) { // 手机黑名单信息
			model.addObject("hdDTO", queryExtHdCreditInfo(intoId));
		}

		model.setViewName("extbiz/in/hd/exthdmgbaseinfo/" + operate);
		return model;
	}

	private ExtHdCreditInfoDTO queryExtHdCreditInfo(String intoId) throws AbaboonException {
		Map<String, Object> searchParams = new HashMap<String, Object>();
		searchParams.put("intoId", intoId);
		return extHdMgBaseInfoService.searchExtHdCreditInfo(searchParams);
	}

	@RequestMapping(value = "/queryExtHdphoneBckLisInfo")
	@ResponseBody
	public DataMsg queryExtHdphoneBckLisInfo(HttpServletRequest request, @ModelAttribute DataMsg dataMsg) throws AbaboonException {
		String intoCustRefId = this.getParameterString("intoCustRefId");

		Map<String, Object> searchParams = new HashMap<String, Object>();
		searchParams.put("intoCustRefId", intoCustRefId);

		QueryReqBean params = new QueryReqBean();
		params.setSearchParams(searchParams);
		PageParameter pageInfo = PageUtil.toPageParameter(dataMsg);
		params.setPageParameter(pageInfo);

		List<ExtHdPhoneBckLisDTO> extHdPhoneBckLis = extHdMgBaseInfoService.searchExtHdPhoneBckLisByPaging(params.getSearchParams());
		dataMsg.setData(extHdPhoneBckLis);
		dataMsg.setTotalRows(pageInfo.getTotalCount());

		return dataMsg;
	}

}
