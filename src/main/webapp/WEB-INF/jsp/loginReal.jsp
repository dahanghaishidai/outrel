<%@ page language="java" import="java.util.*,com.jy.modules.common.util.ObtainPropertiesInfo" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
    <meta charset="UTF-8">
    <title><%=ObtainPropertiesInfo.getValByKey("app.name") %>用户登录</title>
    <link rel="stylesheet" href="<%=basePath%>css/login/login.css">
    <script type="text/javascript" src="<%=basePath%>js/threeJs/jquery/jquery.js"></script>
	<style>.error{color:red;}</style>
</head>
<body>

<div class="mailLoginBox">
<div class="mainLogin">
<div class="top">
	<div class="title">
		<div class="logo"></div>
		<div class="info">
			<span>捷越联合信息咨询有限公司</span>
			<span style="margin-left:20px;">www.jieyuechina.com</span>
		</div>
	</div>
</div>
<div class="mainBox">
<div class="main">
    <div class="center clearfix">
        <div class="login">
        	<h2 class="login-tit"><%=ObtainPropertiesInfo.getValByKey("app.name") %></h2>
        	<form id="loginForm" action="<%=request.getContextPath() %>/user/login" method="post">
	            <ul>
	                <li><input input type="text" id="username" name="username" class="txt"  placeholder="用户名"></li>
	                <li><input input type="password" id="pwd" name="password" class="txt"  placeholder="密码" ></li>
	                <!-- <li style="text-align:right; margin-top:10px;">  <a href="#" class="link" >忘记密码</a></li> -->
	                <li style="text-align:center;">
		                <div class="btn-side" >
		                    <input class="btn" type="button" value="登录" onclick="javascript:submitForm()" />
		                </div>
                   </li>
                </ul>
                <div class="note"  id="msgBox">
					<span class="triangle-right"></span>
					<span class="msg-txt"  id="msg"></span>
				</div>
			</form>
			<div class="loginMobile">
			 	<p>欢迎扫码登录</p>
				<a class="Dbarcode"></a>
			</div>
    	</div>
    </div>
</div>
</div>
<!--  mainEND-->
<div class="foot">
	<div class="foot-con clearfix">
		<p>电话： 010-6517 5580转7119或1820 1198 040</p>
		<p>邮箱： itsupport@jieyuechina.com</p>
		<p>工作时间：工作日9:00-18:00</p>
	</div>

    <!-- <table  class="foot-table" cellpadding="0" cellspacing="0"><tr><td style="   border-right: 1px solid #fff;">
        <ul><li style="font-size: 14px; font-weight: bold">
        系统信息：
    </li>
        <li>
            当前浏览器：<span id="browser"></span>  建议IE9+、Chrome、Firefox
        </li>
        <li>
            当前分辨率：<span id="screen"></span>  建议1920
        </li>
        <li>
            <a href="#" style="color: #5c6d7e">版本信息更新记录</a>

        </li>
        </ul>
    </td>
        <td class="foot-center">捷越联合信息咨询有限公司
            <br>
         &nbsp;&nbsp;&nbsp;&nbsp;www.jieyuechina.com</td>
        <td style="border-left: 1px solid #cacaca; padding-left: 80px">  <ul><li style="font-size: 14px; font-weight: bold">
            技术支持：
        </li>
            <li>
                电话:010-52327119
            </li>
            <li>
                邮箱：itsupport@jieyuechina.com
            </li>
            <li>
                工作时间：工作日(9:00-18:00)
            </li>
        </ul></td>
    </tr></table> -->

</div>
</div>
</div>

 
</body>

<script >
    var user=document.getElementById("username");
    user.onfocus=function(){if(this.value==this.defaultValue)this.value=''};
    user.onblur=function (){if(/^\s*$/.test(this.value)){this.value=this.defaultValue;this.style.color='#b3b3b3'}}
    user.onkeydown=function(){this.style.color='#000'}
    var pwd=document.getElementById("pwd");
    pwd.onfocus=function(){if(this.value==this.defaultValue)this.value=''};
    pwd.onblur=function (){if(/^\s*$/.test(this.value)){this.value=this.defaultValue;this.style.color='#b3b3b3'}}
    pwd.onkeydown=function(){this.style.color='#000'}
    
	    function get_os() {  
	        var sUserAgent =navigator.userAgent;  
	        var isWin = (navigator.platform =="Win32") || (navigator.platform == "Windows");  
	        var isMac = (navigator.platform =="Mac68K") || (navigator.platform == "MacPPC") ||(navigator.platform == "Macintosh") || (navigator.platform =="MacIntel");
	        if (isMac) return "Mac";  
	        var isUnix = (navigator.platform =="X11") && !isWin && !isMac;  
	        if (isUnix) return "Unix";  
	        var isLinux =(String(navigator.platform).indexOf("Linux") > -1);  
	        if (isLinux) return"Linux";  
	        if (isWin) {  
	               var isWin2K =sUserAgent.indexOf("Windows NT 5.0") > -1 ||sUserAgent.indexOf("Windows 2000") > -1;  
	               if (isWin2K) return"Win2000";  
	               var isWinXP =sUserAgent.indexOf("Windows NT 5.1") > -1 ||sUserAgent.indexOf("Windows XP") > -1;  
	               if (isWinXP) return"WinXP";  
	               var isWin2003 =sUserAgent.indexOf("Windows NT 5.2") > -1 ||sUserAgent.indexOf("Windows 2003") > -1;  
	               if (isWin2003) return"Win2003";
	               var isWinVista=sUserAgent.indexOf("Windows NT 6.0") > -1 ||sUserAgent.indexOf("Windows Vista") > -1;  
	               if (isWinVista) return"WinVista";
	               var isWin7 =sUserAgent.indexOf("Windows NT 6.1") > -1 || sUserAgent.indexOf("Windows7") > -1;  
	               if (isWin7) return"Win7";
	        }  
	        return "other";  
	  }  
	    
	    function getServerIp(){
	    	<%
	    		 
	    		String ip = request.getHeader("x-forwarded-for"); 
	    		if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
	    		ip = request.getHeader("Proxy-Client-IP"); 
	    		} 
	    		if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
	    		ip = request.getHeader("WL-Proxy-Client-IP"); 
	    		} 
	    		if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
	    		ip = request.getRemoteAddr(); 
	    		} 
	    		 
	    	%>
	    	return "<%=ip%>";
	    }
	    /*
	    *获得浏览器信息
	    */
	    /* function getBrowser()  
	    {  
	        var Sys = {};
	        var ua = navigator.userAgent.toLowerCase();
	        var s;
	        (s = ua.match(/msie ([\d.]+)/)) ? Sys.ie = s[1] :
	        (s = ua.match(/firefox\/([\d.]+)/)) ? Sys.firefox = s[1] :
	        (s = ua.match(/chrome\/([\d.]+)/)) ? Sys.chrome = s[1] :
	        (s = ua.match(/opera.([\d.]+)/)) ? Sys.opera = s[1] :
	        (s = ua.match(/version\/([\d.]+).*safari/)) ? Sys.safari = s[1] : 0;
	        if (Sys.ie) {
	           return "ie-"+Sys.ie;
	        }
	        else if (Sys.firefox) {
	           return "firefox-"+Sys.firefox;
	        }
	        else if (Sys.chrome) {
	           return "chrome-"+Sys.chrome;
	        }
	        else if (Sys.opera) {
	           return "opera-"+Sys.opera;
	        }
	        else if (Sys.safari) {
	           return "safari-"+Sys.safari;
	        }
	        else {
	           return "无法检测浏览器信息"
	        }
	    }  
    (function(){
    	var screenXY= window.screen.height+ "&nbsp;*&nbsp;"+window.screen.width ; 
    	var os=get_os();
    	var browser=getBrowser();
    	var serverIp=getServerIp();
    	//alert(screenXY+"---"+os+"----"+browser+"----"+serverIp);
    })();*/ 
    //表单提交
    function submitForm(){
	    //对用户名空格进行处理
	    var username = $.trim($("#username").val());
	    $("#username").val(username);
	    var pwd = $.trim($("#pwd").val());
	    $("#pwd").val(pwd);

   		if($("#username").val() == ''){
	   		if($("#msg") != undefined && $("#msg").length > 0){
	   			$("#msg").text("用户名必须填写");
	   			$("#msgBox").show();
	   		}else{
    			$("#msgbox").text("用户名必须填写");
    		}
    		return;
    	}

   		if($("#pwd").val() == '' || $("#pwd").val() == '密码'){
			if($("#msg") != undefined && $("#msg").length > 0){
				$("#msg").text("密码必须填写");
				$("#msgBox").show();
    		}else{
    			$("#msgbox").text("密码必须填写");
    		}
    		return;
    	}
    /* 	var msg = checkPass($("#pwd").val());
    	if(msg !=""){
    		if($("#msg") != undefined && $("#msg").length > 0){
				// $("#msg").html(msg + ACCESS_MODIFY_PWD);
				 $("#msg").html(msg);
				 //var _vHREF= $("#modifyPWDA").attr("href");
				 //_vHREF=_vHREF+'?username='+$("#username").val();
				 //$("#modifyPWDA").attr("href",_vHREF);
    		}else{
    			$("#msgbox").html(msg);
    			//$("#msgbox").html(msg + ACCESS_MODIFY_PWD);
    			//var _vHREF= $("#modifyPWDA").attr("href");
				// _vHREF=_vHREF+'?username='+$("#username").val();
				// $("#modifyPWDA").attr("href",_vHREF);
    		}
    		$("#msgBox").show();
    		return;
    	}  */


    	//var key = "${jypwdtoken}";//服务端端提供key
    	//var testPwdString = "${testPwd}";//供测试使用
    	//var pwdInput = $("#pwd").val();
    	//对密码进行加密处理
    	//var encryptPwd = encryptAes(pwdInput,key);
    	//console.log("key:"+key);
    	//console.log("encryptPwd:"+encryptPwd);
    	//$("#password").val(encryptPwd);
    	//$("#password").val(pwdInput);
    	//重置处理输入框值
    	//var timestamp1 = new Date().getTime(); 
    	//$("#pwd").val(timestamp1);
    	$("#msg").text('');
    	$("#msgBox").hide();

    	$("#loginForm").submit();
    }


    function keyLogin(){
    	if (event.keyCode==13)  {
    		//回车键的键值为13
    		submitForm();
    	    //调用登录按钮的登录事件

    	}
   }
    $(document).keyup(function(event){
    	 keyLogin();
    	});
   //进行用户密码必须修改处理,添加密码修改访问链接
  /*  $(document).ready(function(){
	   var tip = "密码已过期,请修改密码";
	   var tipModifyPwd = "初始密码必须修改";
	   var u = "${credentials.username}";
	   var suffix = u != "" ? "?username="+u : "";
	   if($("#msg").text() == tip){
		   $("#msg").html(tip + ACCESS_MODIFY_PWD);
		   var _vHREF= $("#modifyPWDA").attr("href");
			 _vHREF=_vHREF+'?username='+$("#username").val();
			 $("#modifyPWDA").attr("href",_vHREF);
			 $("#msgBox").show();
	   }
	   if($("#msg").text() == tipModifyPwd){
		   $("#msg").html(tipModifyPwd + ACCESS_MODIFY_PWD);
		   var _vHREF= $("#modifyPWDA").attr("href");
			 _vHREF=_vHREF+'?username='+$("#username").val();
			 $("#modifyPWDA").attr("href",_vHREF);
			 $("#msgBox").show();
	   }
   }); */
	//校验密码复杂度
   function checkPass(s){
	  var _warnMsg = "密码不少于8位且应包含字母数字大小写";
	  var cun = 0;
      if(s.length >= 8) cun++;

      if(s.match(/([a-z])+/)) cun++;
      if(s.match(/([0-9])+/)) cun++;
      if(s.match(/([A-Z])+/)) cun++;

      //特殊字符控制
      //if(s.match(/[^a-zA-Z0-9]+/)) cun++;
      if(cun != 4){
    	  return _warnMsg;
      }else{
    	  return "";
      }
  }
    
</script>
</html>