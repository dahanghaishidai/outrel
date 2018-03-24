<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page language="java" import="com.jy.platform.api.org.UserInfo,com.jy.platform.api.org.SessionAPI,org.springframework.web.context.support.WebApplicationContextUtils,org.springframework.web.context.WebApplicationContext,org.springframework.web.context.ContextLoader,org.springframework.context.ApplicationContext" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="syscolumn" uri="/syscolumn" %>
<%@taglib prefix="sysrole" uri="/sysrole" %>
<%@ taglib uri="/WEB-INF/tlds/productConf.tld" prefix="pc"%>
<%@ taglib uri="/WEB-INF/tlds/intoAuditStateConf.tld" prefix="iastate"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" >
  <head>
  <%@ include file="/component/jbpm/jbpmCommon.jsp" %>
  <%@ include file="/common/StaticJavascript.jsp"  %>
  <!-- 导入获取当前登录人角色信息 -->
  <%@ include file="obtainUserRoles.jsp"  %>
   <title>已办任务监控</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<script type="text/javascript" src="${basePath1}component/jbpm/dialog/lhgdialog.js?skin=iblue"></script>
	<script src="${basePath1}js/plat/JBPM.biz.js"></script>
	<script src="${basePath1}component/jbpm/bizmonitor/js/monitorPro.js"></script>
	<script type="text/javascript">
		//页面加载完后 
		$(document).ready(function(){
			initFn();
			selectTree();
		});
	</script>
</head>

<body style="background-color:#FFFFFF">
<sysuser:search var="curUser" />

<!-- 列表按钮操作 start -->
	<div id="userTableToolbar" class="tableToolbar" style="display:none;">
	 </div>
<!-- 列表按钮操作 end -->


	
	<!-- 页面初始化 需要的 div -->
	<div id="content"></div>
	
</body>
<script>
	/*
	 * 选择组织机构树
	 */
	function selectTree(){
		var _orgurl='${basePath}/sysOrg/queryTreeSysOrg?openParentId=${curUser.orgId}';
		$("[name='intoSource2']").next(".custom-combobox").find("a").treeMenu(
	   			{"treeUrl":_orgurl
	   			,"treeType":"","disabledLink":"true"
		   		,"treeIdObj":$("[name='intoSource']")
		   		,"treeNameObj":$("[name='intoSource2']").next(".custom-combobox").find("input")
		   		,"width":"200"
		   		,"height":"300"});
	
	}
	var iframe;
	//定义form表单 查询 方法
	function queryData(){
		setStartEndDate();
		setProStartEndDate();
		iframe.iframeObj["table"].query();
	}
	//定义 form表单 重置方法
	function resetData(){
		iframe.iframeObj["form"].reset();
		selectTree();
		$("select[name='intoSource2'] + span >input").blur(function(){
			$("input[name='intoSource']").val($("select[name='intoSource2'] ").val());
		});
	}
	//初始化 查询页面元素
	function initFn(){
		//获取 流程监控的 隐藏字段信息
		<syscolumn:column codeType="JBPM_MONITOR_HIDDEN" var="monitorHiddenColumn" />
		//定义 form表单查询 信息
		 var formStructure={
			// 定义form表单 字段信息
			columns : [
			 {display : ' 任务状态 ', code : 'processState', width : 200,  type:'select',
				 value:[{value:'COMPLETED_TASK',text:'已办任务'}]}
		    ,{display : ' 异步统计总数', code : 'bizTotalFlag',value:'Y', width : 200, type:'hidden'}
	        ,{display : '业务类型', code : 'bizType', width : 200,  type:'select',value:<syscode:dictionary codeType="WORKFLOW_BIZ_TYPE" type="json" used="${setbizType}" hasBlank="false" />}
	        ,{display : '客户姓名', code : 'custName', width : 200,  type:'text'}
	        ,{display : '姓名ID', code : 'processParticipationName', width : 200,  type:'hidden'}
	        ,{display : '任务名称', code : 'busInfoName', width : 200, align : 'left', type:'text'}
	        ,{display : '任务归属人 ', code : 'processParticipationNameDis', width : 200,  type:'text',value:'',clickFun:function(){selectUser('${curUser.orgId}');}}
	        ,{display : '节点名称', code : 'acitityName', width : 200,  type:'text'}
	        <c:if test="${!fn:contains(monitorHiddenColumn,'#CUR_EXE_ID#') }">
	        ,{display : '流程实例', code : 'processInsId', width : 200,  type:'text'}
	        </c:if>
	        ,{display : '申请产品', code : 'appProductType', width : 200,  type:'autocomplete', value:<pc:productTag type="json"></pc:productTag>}
	        ,{display : '所属门店', code : 'intoSource2',width : 200,  type:'autocomplete', value:<syscommon:commonTag type="json" codeType="HR" beanID="com.jy.modules.platform.sysdict.impl.SysCommonTagAPImpl"></syscommon:commonTag>}
			,{display : ' 所属门店 ', code : 'intoSource', width : 200,  type:'hidden', value:''}
	        ,{display : '流程发起时间', code : 'protime', width : 100, align : 'left',type: 'dbDateTime',isCompare:true}
	        ,{display : '开始', code : 'proStartTime', width : 200,  type:'hidden'}
	        ,{display : '结束', code : 'proEndTime', width : 200,  type:'hidden'}
	        ,{display : '任务完成时间', code : 'time', width : 100, align : 'left',type: 'dbDateTime',isCompare:true}
	        ,{display : '开始', code : 'startTime', width : 200,  type:'hidden'}
	        ,{display : '结束', code : 'endTime', width : 200,  type:'hidden'}
	        ,{display : '当前用户拥有的角色信息', code : 'roles', width : 200,  type:'hidden',value:'${roles}'}
	        ,{display : '是否是管理监控', code : 'isMonitor', width : 200,  type:'hidden',value:'1'}
			],
			//定义form 表单 按钮信息
			buttons:[
			 {"text":"查询","fun":queryData,icon:"ui-icon-search"}
			,{"text":"重置","fun":resetData,icon:"ui-icon-extlink"}
			]
		}
		//定义 table 列表信息	
		var tableStructure = {
				columns : [
				{display : '任务名称', code : 'BIZ_INF_NAME', width : 130, align : 'left', type:'fun',
					value:function (obj){
						var v_aInfo = "<a href='javascript:void(0)' onclick='viewHistBizInfo(\""+obj.TASKID+"\",\""+obj.BIZ_TYPE
						+"\",\""+obj.CUR_EXE_ID+"\",\""+obj.CUR_ACT_NAME+"\",\""+obj.BIZ_INF_ID+"\",\""+obj.BIZ_TAB_NAME+"\",\""+obj.BIZ_TAB_ID+"\",\""+obj.BIZ_TYPE+"\")'>";
						if(obj.BIZ_INF_NAME)	v_aInfo = v_aInfo + obj.BIZ_INF_NAME ;
						
						v_aInfo = v_aInfo+"</a>";
						return v_aInfo;
				    }
				},
				{display : ' 任务当前状态 ', code : 'AUDITESTATE', width : 120, align : 'center', type:'select', value:<iastate:intoAuditStateTag type="json"></iastate:intoAuditStateTag>},
				{display : ' 客户姓名', code : 'CUSTNAME', width : 100, align : 'center', type:'text'},
				{display : ' 产品类型 ', code : 'APPRPRODUCTTYPE', width : 120, align : 'center', type:'select', value:<pc:productTag type="json"></pc:productTag>},
				<c:if test="${!fn:contains(monitorHiddenColumn,'#BIZ_INF_NO#') }">
				{display : '业务编号', code : 'BIZ_INF_NO', width : 160, align : 'left', type:'text'},
				</c:if>
				{display : '当前归属人', code : 'CUR_OWNER_NAME', width : 100, align : 'center', type:'text', isOrder : true},
				{display : '当前节点', code : 'CUR_ACT_NAME', width : 100, align : 'center', type:'text'},
				{display : '上一环节处理人', code : 'UP_USER_NAME', width : 100, align : 'center', type:'text'},
				{display : '任务类型', code : 'BIZ_TYPE', width : 100, align : 'center', type:'select',
					value:<syscode:dictionary codeType="WORKFLOW_BIZ_TYPE" type="json"/>},
				/* {display : ' 紧急状态 ', code : 'TASK_STATE', width : 100, align : 'left', type:'text'}, */
				<c:if test="${!fn:contains(monitorHiddenColumn,'#CUR_EXE_ID#') }">
				{display : ' 进件门店', code : 'INTOSOURCENAME', width : 100, align : 'center', type:'text'},
				{display : '流程实例', code : 'CUR_EXE_ID', width : 200, align : 'center', type:'text'},
				</c:if>
				{display : '流程发起时间', code : 'START_INS_TIME', width : 120, align : 'center', type:'text', isOrder : true},
				{display : '任务完成时间', code : 'END_TIME', width : 120, align : 'center', type:'text', isOrder : true},
				{display : '处理轨迹', code : 'viewPhone', width : 100, align : 'center', type:'link'
					, value:[{"text":"查看轨迹","action":viewHisData}
					         /* ,{"text":"流程图","action":showCurrentPhoto} */
                            ]}
		   ],
			url : "${basePath1}dojbpm/monitorjbpmbiz/findTaskInfo.do",
			pageSize : 30,
			toolbar:"userTableToolbar",
			selectType : 'checkbox',
			isCheck : true,
			rownumbers : true,
			isNewPage : true,
			pages : [ 30, 50, 100 ],
			trHeight : 30,
			primaryKey:"TASKID"
		};
		//组装 searchIframe 的相关参数		
		var searchIframe={"toolbar":"","form":formStructure,"table":tableStructure,"isNotQuery":true};	
		//初始化 form 表单 table 列表 及工具条 
		iframe=$("#content").newSearchIframe(searchIframe);
		iframe.show();
		$("select[name='intoSource2'] + span >input").blur(function(){
			$("input[name='intoSource']").val($("select[name='intoSource2'] ").val());
		});
	}
</script> 
</html>
