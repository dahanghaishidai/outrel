<%@ page language="java" import="java.util.*,com.jy.modules.common.util.ObtainPropertiesInfo" pageEncoding="UTF-8"%>
<%@ page language="java" import="com.jy.platform.api.sysconfig.SysConfigAPI,org.springframework.web.context.support.WebApplicationContextUtils,org.springframework.web.context.WebApplicationContext,org.springframework.web.context.ContextLoader,org.springframework.context.ApplicationContext" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@taglib prefix="syscode" uri="/syscode" %>
<%@taglib prefix="sysrole" uri="/sysrole" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib uri="/app" prefix="app"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>
<%
	String acceptFenQu ="NO";
	WebApplicationContext webApplicationContext = ContextLoader.getCurrentWebApplicationContext();    
	ServletContext servletContext = webApplicationContext.getServletContext();
	ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(servletContext);
	SysConfigAPI sysConfig = (SysConfigAPI) context.getBean("sysConfigAPI");
	acceptFenQu = sysConfig.getValue("ACCEPT_FENQU");//获取配置是否开启分区数据权限开关
%>
<!DOCTYPE>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title><%=ObtainPropertiesInfo.getValByKey("app.name") %></title>
<jsp:include page="/common/StaticJavascript.jsp" />
<script src="<%=basePath%>component/jbpm/persontask/js/personaltask.js"></script>
	<style type="text/css">
		.winSwarp{
			border:1px solid #aed0ea;
			-moz-border-radius: 5px;
			-webkit-border-radius: 5px;
			border-radius: 5px;
			float:left;
			margin:10px 10px;
		}
		.oneOfThree{
			width:32%;
		}
		.oneOfTwo{
			width:48%;
		}
		.oneOfOne{
			width:98%;
		}
		.winSwarp .titleSwarp{
			
		}
		.titleContent a{
			float:right;
			display:none;
			font-size:12px;
			font-weight:normal;
			color:#416484;
			dispaly:block;
			text-decoration:none;
		}
		.titleContent a:hover{
			font-weight:bold;
		}
		.winSwarp .titleContent{
			background:#ddeefa;
			padding:6px 10px;
			color:#333333;
			font-size:14px;
			border-bottom:1px solid #aed0ea;
			font-weight: bold;
		}
		.winSwarp .winContent{
			padding:5px;
			overflow:auto;
			height:140px;
		}
		.winSwarp .winContent li{
			list-style-type: square;
			color:#336699;
		}
		.winSwarp .winContent a{
			text-decoration:none;
			font-size:12px;
			color:#336699;
			margin-left: -3px;
		}
		.winSwarp .winContent A:active,.winSwarp .winContent A:visited{
			color:#333333;
			text-decoration:underline;
		}
		 
	</style>
</head>

<body>
<!-- 获取当前登录人的角色列表信息 -->
<sysrole:role var="roles" />

	<div style="position: absolute;top:0px; bottom:0px; left:0px;right:0px;overflow:auto;padding:10px;" id="${roles }">
		<input type="hidden" value="" id="partnerRuleJsonId"/>
		<div class="winSwarp oneOfTwo">
		<!-- 含有门店角色 则是补充资料 -->
		<c:if test="${fn:contains(roles, 'md_')}">
			<div class="titleContent">我的任务<a href="javascript:void(0)" class="moreTitle" moreUrl="<%=basePath %>workfile/toApprovalWrokFile?index=1" moreTitle="补充资料 " id="myTask_more">更多></a></div>
	     </c:if>
	     <!-- 不含有门店角色 则是我的待办 -->
	     <c:if test="${!fn:contains(roles, 'md_')}">
	        <div class="titleContent">我的任务<a href="javascript:void(0)" class="moreTitle" moreUrl="<%=basePath %>component/jbpm/persontask/queryMyTaskInfo.jsp" moreTitle="我的任务 " id="myTask_more">更多></a></div>
		 </c:if>
			<div class="winContent" id="myTask">
			</div>
		</div>
		<div class="winSwarp oneOfTwo">
			<div class="titleContent">最新消息</div>
			<div class="winContent" id="my_msg_div_id"></div>
		</div>
		<div class="winSwarp oneOfTwo">
			<div class="titleContent">通知通告</div>
			<div class="winContent" id="sys_msg_div_id"></div>
		</div>
		<div class="winSwarp oneOfTwo">
			<div class="titleContent">关于系统<a href="javascript:void(0)" class="moreTitle" moreUrl="<%=basePath %>sysVersion/toSysVersion" moreTitle="版本信息 " id="sysVersion_more">更多></a></div>
			<div class="winContent" id="sysVersion">
			
			</div>
		</div>
	</div>
	 
</body>
</html>
<script type="text/javascript">
var JS_CUR_LOGIN_USER_ID = "<shiro:principal property="id"/>";
	//执行待办任务
	/**
	 * v_taskId 任务ID
	 * v_proInsId 流程实例ID
	 * v_actNa 当前节点名称
	 * v_infId 业务表主键ID
	 * v_tabName 业务表名
	 */
	function doTask(v_taskId,v_url,v_proInsId,v_actNa,v_infId,v_tabName,v_bizTabId,_bizType,v_curOwner,v_formId){
// 	 	$.dialog({
// 		id:	'executeTaskId',
// 	    lock: true,
// 	    width:850,
// 	    height:300,
// 	    title:'执行任务',
// 	    content: 'url:<%=basePath%>'+encodeURI(v_url)
// 		}).max(); 
		//todo 验证 待流程实例是否是挂起 状态
		var v_lock = JBPM.common.getProInsState(v_bizTabId);
		if(!v_lock){
			jyDialog({"type":"warn"}).alert("该待办任务的流程实例已经挂起，暂时不能处理该任务！");
			return ;
		}
		//todo 验证待办任务是否可以执行
		var v_msg = JBPM.common.getOperateTaskStateInfo(v_taskId,'<shiro:principal property="id"/>');
		if(v_msg != null && "" != v_msg){
			jyDialog({"type":"warn"}).alert(v_msg);
			return;
		}
		v_url = '<%=basePath%>'+encodeURI(v_url);
		v_url = v_url +"?taskId="+encodeURI(v_taskId)+"&processInsId="+encodeURI(v_proInsId)+"&acitityName="+encodeURI(v_actNa);
		v_url = v_url +"&bizInfId="+encodeURI(v_infId)+"&bizTabName="+encodeURI(v_tabName)+"&bizTabId="+encodeURI(v_bizTabId);
		v_url = v_url +"&bizType="+encodeURI(_bizType);
		//通过ajax 来锁定数据，页面局部刷新 2014-10-31 17:33:47 chj
		dataLockImp(v_taskId,"1","N");
		
		//签收和撤销签收处理
		JBPM.common.acceptTask(v_taskId,v_formId,'1',JS_CUR_LOGIN_USER_ID,v_curOwner);	//alert("v_url:"+v_url);

		window.open(v_url,'newwindow'+v_infId);
	}

	function openVersion(vId){
		var dialogStruct={
				'display':'<%=basePath%>/sysVersion/prepareExecute/toView?id='+vId,
				'width':800,
				'height':500,
				'title':'查看版本明细',
				'buttons':[
				 {'text':'关闭','isClose':true}
				]
		};
		var dialogView = jyDialog(dialogStruct).open();
	}
	function viewMyData(vId){
		var dialogStruct={
				'display':'<%=basePath%>/sysMessage/prepareExecute/toView?id='+vId,
				'width':800,
				'height':500,
				'title':'查看明细',
				'buttons':[
				 {'text':'关闭','isClose':true}
				]
		};
			
		var dialogView = jyDialog(dialogStruct);
		dialogView.open();
	}
	function callTaskFun(obj,linkStr){
		var v_aInfo="";
		try{
			v_aInfo = "<li><a href='javascript:void(0)' onclick='doTask(\""+obj.TASKID+"\",\""+obj.PRO_ACTIVITY_FORM
			+"\",\""+obj.CUR_EXE_ID+"\",\""+obj.CUR_ACT_NAME+"\",\""+obj.BIZ_INF_ID+"\",\""+obj.BIZ_TAB_NAME+"\",\""+obj.BIZ_TAB_ID+"\",\""+obj.BIZ_TYPE+"\",\""+obj.CUR_OWNER+"\",\""+obj.FORM_ID+"\")'>";
			var _font='<font' ;
			if("1" == obj.BIZ_TASK_TYPE || "2" == obj.BIZ_TASK_TYPE  || "3" == obj.BIZ_TASK_TYPE){//如果是补件回来的待办则标黄  转信审、退回信审专员补充调查
				_font +=' color=green ' ;
			}
			if("1" == obj.TASK_STATE){//提醒则标蓝
				_font +=' color=#8ECBFF ' ;
			}
			if("2" == obj.TASK_STATE){//超时标红
				_font +=' color=red ' ;
			}
			_font +=' > ';
			v_aInfo = v_aInfo + _font+ obj.BIZ_INF_NAME +'</font>';
			
			var _map=<syscode:dictionary codeType="WORKFLOW_BIZ_TYPE" type="json" />;
			var _bizType="";
			for (var key in _map) {
				var a = _map[key];
				if(a.value == obj.BIZ_TYPE){
					_bizType = a.text;
					break;
				}
			}
			/* 工作台我的任务列表添加重复件标识 
				v_aInfo = v_aInfo+"["+_bizType+"]"+linkStr+" </a></li>";
			*/
			v_aInfo = v_aInfo+"["+_bizType+"]"+linkStr;
			if(flag!=true){
				if(""!=obj.EXT2 && typeof(obj.EXT2) != "undefined"&&flag!="true"){
					console.log(flag);
					v_aInfo = v_aInfo + obj.EXT2 ;
				}
			}
			
			if(""!=obj.EXT3 && typeof(obj.EXT3) != "undefined"){
				var mutls = "["+obj.EXT3;
				if(obj.EXT2.indexOf("重")>-1&& flag==true){
					mutls = '重' + mutls;
				}
				mutls = mutls +"]";
				v_aInfo = v_aInfo+"<a class='repeat' title='' onMouseOver='repeatView(\""+obj.BIZ_INF_NAME+"\",\""+obj.EXT3+"\")' onclick='doRepeatView(\""+obj.BIZ_INF_NAME+"\",\""+obj.EXT3+"\",\""+obj.BIZ_INF_NAME+"\")' id=\""+obj.BIZ_INF_NAME+"\" href='javascript:void(0)'>"+mutls+"</a>";
			}		
			v_aInfo = v_aInfo + " </a></li>";
// 			$.ajax({
// 				type:"POST",
// 				url:contextRootPath+'/workfile/getRepeatList?intoId='+obj.BIZ_INF_NAME,
// 				async: false,
// 				dataType:"json",
// 				success:function(msg){
// 				 if(parseInt(msg.length)>0){
// 					 var mult = "重";
// 					 if(""!=obj.CARD_ID_MULTIPLE && typeof(obj.CARD_ID_MULTIPLE) != "undefined"){
// 						 mult = "";
// 					 }
// 					 v_aInfo = v_aInfo+"["+_bizType+"]"+linkStr+" <a class='repeat' title='' onMouseOver='repeatView(\""+obj.BIZ_INF_NAME+"\",\""+msg.length+"\")' onclick='doRepeatView(\""+obj.BIZ_INF_NAME+"\",\""+msg.length+"\",\""+msg[0]["ID"]+"\")' id=\""+obj.BIZ_INF_NAME+"\"  href='javascript:void(0)'>"+mult+"</a></li>";
// 				 }/*else{
// 					 v_aInfo = v_aInfo+"["+_bizType+"]"+linkStr+" </a></li>";
// 				 }*/
// 				}
// 			});

			
			/* var params="intoId="+obj.BIZ_INF_NAME; */
		/* 	url=contextRootPath+'/workfile/getCountByIntoId?intoId='+obj.BIZ_INF_NAME,
			//通过ajax保存
			jyAjax(url,"",function(msg){
				alert(msg);
				debugger;
				if(parseInt(msg)>0){
					 v_aInfo = v_aInfo+"["+_bizType+"]"+linkStr+" </a> <a class='repeat' title='' onMouseOver='repeatView(\""+obj.BIZ_INF_NAME+"\")' id='repeatViewid'  href='javascript:void(0)'>重</a></li>";
				 }else{
					 v_aInfo = v_aInfo+"["+_bizType+"]"+linkStr+" </a></li>";
				 }
		  	}); */
			
			
			
		}catch(e){}
		
		return v_aInfo;
	}	

	
	function createTable(objs,totalRows,k,v,contentId,opFun){
		if(totalRows == 0) return ;
		var MIN_COUNT=5;
		var tableStr=['<table style="width:100%;font-size:14px;">'];
		debugger;
		var moreBtn=$("#"+contentId+"_more");
		if(totalRows > MIN_COUNT){
			moreBtn.html('<label color="#FF0000">共计：'+totalRows+'</label>&nbsp;更多>>');
			totalRows=MIN_COUNT;
			moreBtn.show();
			moreBtn.bind("click",function(){
				var url=$(this).attr("moreUrl");
				var title=$(this).attr("moreTitle");
				parent.showObj({"url":url,"text":title});
			});
			
		}else{
			moreBtn.hide();
		}
		try{
			for(var i=0;i<MIN_COUNT;i++){
				var _obj = objs[i];
				var _vval = _obj[v];
				var _date;
				if(!isNaN(_vval)){//判断是否为数字类型
	               _date = new Date(_vval);
				} else {
				   _date = new Date(_vval.jyReplaceAll("-", "/"));
				}
				_vval = _date.format("yyyy-MM-dd");
				//_vval = _vval.format();
				//tableStr.push('');
				tableStr.push(setTrStyle(_obj));
				tableStr.push('<td style="text-align:left;white-space: nowrap; word-wrap: normal; overflow: hidden;"><div style="width:200px;white-space: nowrap;word-wrap: normal;">');
				tableStr.push(opFun(_obj,"&nbsp;&nbsp;"));
				tableStr.push('</div></td>');
				tableStr.push('<td style="width:120px; text-align:right;"><div>');
				tableStr.push(_vval);
				tableStr.push('</div></td>');
				tableStr.push('</tr>');
			}
		}catch(e){}
			tableStr.push('</table>');
			$("#"+contentId).html(tableStr.join(""));
	}
	/*
	* 设置待办任务颜色
	*/
	function setTrStyle(obj){
			var _tr ='<tr style="height:25px;font-size:12px;';
			var _trcolor="" ;
			/* if("1" == obj.BIZ_TASK_TYPE){//如果是补件回来的待办则标黄
				_trcolor=" background-color:yellow " ;
			}
			if("1" == obj.TASK_STATE){//提醒则标蓝
				_trcolor=" background-color:#8ECBFF " ;
			}
			if("2" == obj.TASK_STATE){//超时标红
				_trcolor=" background-color:red " ;
			} */
			 _tr =_tr + _trcolor +' "> ';//
			return _tr;
	}
	(function(){
		var url='<%=basePath%>workFlowProvider/findTaskInfo.do?processState=PROCESS_TASK&customSQL=Y&extSort=ext1,&paramUserId=<shiro:principal property="id"/>&pageSize=5';
		jyAjax(url,"",function(msg){
			var str=createTable(msg.data,msg.totalRows,"BIZ_INF_NAME","START_PRO_TIME","myTask",callTaskFun);
		});
	})();
	(function(){
		var url='<%=basePath%>sysVersion/queryListSysVersion';
		jyAjax(url,"",function(msg){
			var str=createTable(msg.data,msg.totalRows,"BIZ_INF_NAME","versionTime","sysVersion",function(obj,linkStr){
				return '<li><a href="javascript:void(0)" onclick="openVersion('+obj["id"]+')">'+obj["versionNum"]+'&nbsp;&nbsp;'+obj["versionContent"]+'</a></li>';
			});
		});
	})();
	var flag = false;
	$(document).ready(function(){
		
		var url='<%=basePath%>sysMessagecenter/queryListSysMessage?pageIndex=1&pageSize=5&readFlag=&type=0';
		jyAjax(url,"",function(msg){
			var str=createTable(msg.data,msg.totalRows,"msgId","createDate","my_msg_div_id",function(obj,linkStr){
				return '<li><a href="javascript:void(0)" onclick="viewMyData('+obj["msgId"]+')">'+obj["title"]+'&nbsp;&nbsp;'+obj["body"]+'</a></li>';
			});
		});
		
		var url2='<%=basePath%>sysMessagecenter/queryListSysMessage?pageIndex=1&pageSize=5&readFlag=&type=1';
		jyAjax(url2,"",function(msg){
			var str=createTable(msg.data,msg.totalRows,"msgId","createDate","sys_msg_div_id",function(obj,linkStr){
				return '<li><a href="javascript:void(0)" onclick="viewMyData('+obj["msgId"]+')">'+obj["title"]+'&nbsp;&nbsp;'+obj["body"]+'</a></li>';
			});
		});
		
		$.ajax({
				type:"POST",
				url:contextRootPath+'/workfile/getLoginRoleList',
				async: false,
				dataType:"json",
				success:function(msg){
					flag = msg.flag;
				}
			});
		
	});
	
$(document).ready(function(){
	//更新登录用户的数据权限
	try{
		if("YES" =="<%=acceptFenQu%>"){
			$.ajax({
				type:"POST",
				dataType:"JSON",
				url:contextRootPath+'/vmdataController/makeupLastVmdataPrivPart?curUserId=<shiro:principal property="id"/>&orgType=LOAN&trunType=Y',		
				success:function(msg){
					//$.dialog.alert(msg.msg);
				}
			});
	 	}
		
		/* $.ajax({
			type:"POST",
			dataType:"JSON",
			url:contextRootPath+'/vmdataController/makeupLastVmdataPrivPart?curUserId=<shiro:principal property="id"/>&orgType=CS&trunType=N',		
			success:function(msg){
				//$.dialog.alert(msg.msg);
			}
		}); */
	}catch(e){
		
	}
});
</script>

