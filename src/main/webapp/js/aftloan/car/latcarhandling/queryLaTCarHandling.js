//utf-8
//点击新增按钮 事件跳转至 新增页面
var threePage;
var dialogUpdate;


var addDlg1;//添加第一个界面：查询贷前
var addDlg2;//添加第二个界面：添加详情
function toAddData(){
	var dialogStruct={
			'display':contextRootPath+'/queryLoanInfoDate/prepareExecute/toQueryBefloanForLoanInfo?function=Transfer&statusName=carHandling',
			'width':1100,
			'height':750,
			'title':'查询贷款信息',
			'buttons':[
			  {'name':'nextBtn','text':'下一步','action':openNextPage},
			  {'text':'关闭','isClose':true}
			]
		};
	addDlg1=jyDialog(dialogStruct);
	addDlg1.open();
}
//下一步
function openNextPage(){
	var selectIds = addDlg1.getIframe().getSelectedIds().join(",");
	//如果没有选中 数据则
	if(selectIds == ""){
		jyDialog({"type":"warn"}).alert("请先选择一条数据！");
		return;
	}
	//如果选择多个 择提示
	if(selectIds.indexOf(",") > -1){
		jyDialog({"type":"warn"}).alert("只能选择一条数据！");
		return;
	}
	var claimKind = addDlg1.getIframe().getClaimKind();
	var selectObj = addDlg1.getIframe().getSelectedObjs();
	//关闭查询界面
	addDlg1.close();
	//打开新增界面
	var url=contextRootPath+'/laTCarHandling/prepareExecute/toAddNext?'+selectObj+'&claimKind='+claimKind;
	var dialogStruct={
			'display':url,
			'width':1100,
			'height':750,
			'title':'新增车辆处置信息',
			'buttons':[
             {'text':'上一步','action':openPrevPage},
	         {'text':'保存','action':doAddFrom},
			 {'text':'关闭','isClose':true}
			]
		};
		
	 addDlg2 =jyDialog(dialogStruct);
	 addDlg2.open();
}
//上一步
function openPrevPage() {
	addDlg2.close();
	toAddData();
}
//新增页面的保存操作
function doAddFrom(){
	var formObj=addDlg2.iframe.contentDocument.getElementById("addNewsFormData");
//	var guarNos = addDlg2.getIframe().getSelectedId();
//	if(guarNos==""){
//		jyDialog({"type":"warn"}).alert("请选择要处置车辆！");
//		return;
//	} 
 	//序列化 新增页面的form表单数据
	var checkTrueCount = addDlg2.getIframe().checkData();
	if(checkTrueCount && checkInto(formObj)) {
 	var params=addDlg2.getIframe().getSerialize();
 	var url=contextRootPath+'/laTCarHandling/insertLaTCarHandling'
	//通过ajax保存
	jyAjax(
		url,
		params,
		function(msg){
			//新增成功后，
			$("").newMsg({"waitTime":3000,"title":"操作提示"}).show(msg.msg);
			var v_status = msg.status;
        	if(v_status.indexOf('ok') >-1){
        		addDlg2.close();
        		//新增成功后 刷新页面 或 只查询 id为msg.data['id'] 的  数据
        		queryData();
        	}
  	  });
	}
}
//修改 事件
function toUpdateData(){
	var v_ids = iframe.iframeObj["table"].getSelectedIds().join(",");
	var objs = iframe.iframeObj["table"].getSelectedObjs();
	//如果没有选中 数据则
	if(v_ids == ""){
		jyDialog({"type":"warn"}).alert("请选择待修改的数据！");
		return;
	}
	//如果选择多个 择提示
	if(v_ids.indexOf(",") > -1){
		jyDialog({"type":"warn"}).alert("请选择一条数据！");
		return;
	}
	if(objs[0]["listStat"] != "01"){
		jyDialog({"type":"warn"}).alert("只能对单据状态为初始录入的数据进行修改！");
		return;
	}

	var dialogStruct={
			'display':contextRootPath+'/laTCarHandling/prepareExecute/toUpdate?id='+v_ids,
			'width':1100,
			'height':750,
			'title':'修改车辆处置信息',
			'buttons':[
             {'text':'保存','action':doUpdateFrom},
			 {'text':'关闭','isClose':true}
			]
		};
		
	dialogUpdate = jyDialog(dialogStruct);
	dialogUpdate.open();
}
//修改页面 的 保存操作
function doUpdateFrom(){
  var formObj=dialogUpdate.iframe.contentDocument.getElementById("updateNewsFormData");
 	//序列化 新增页面的form表单数据
  if(checkInto(formObj)) {
 	var params=dialogUpdate.getIframe().getSerialize();
	var url=contextRootPath+'/laTCarHandling/updateLaTCarHandling'
	//通过ajax保存
	jyAjax(
		url,
		params,
		function(msg){
			//保存成功后，执行查询页面查询方法
			$("").newMsg({"waitTime":3000,"title":"操作提示"}).show(msg.msg);
        	var v_status = msg.status;
        	if(v_status.indexOf('ok') >-1){
        		//新增成功后 刷新页面 或 只查询 id为msg.data['id'] 的  数据
        		dialogUpdate.close();
        		queryData();
        	}
  	 });
  }else{
	   return;
  }
}
//删除 事件
function deleteData(){
	var v_ids = iframe.iframeObj["table"].getSelectedIds().join(",");
	var objs = iframe.iframeObj["table"].getSelectedObjs();
	//如果没有选中 数据则
	if(v_ids == ""){
		jyDialog({"type":"warn"}).alert("请选择待删除的数据！");
		return;
	}
	
	if(v_ids.indexOf(",") > -1){
		jyDialog({"type":"warn"}).alert("请选择一条数据！");
		return;
	}
	if(objs[0]["listStat"] != "01"){
		jyDialog({"type":"warn"}).alert("只能对单据状态为初始录入的数据删除！");
		return;
	}
	
	jyDialog({"type":"question"}).confirm("您确认要删除选择的数据吗？",function(){
		$.ajax({
            type:"POST",
            dataType:"JSON",
            url:contextRootPath+"/laTCarHandling/deleteLaTCarHandling?ids="+v_ids,
            success:function(msg){
            	$("").newMsg({"waitTime":3000,"title":"操作提示"}).show(msg.msg);
            	var v_status = msg.status;
            	//删除成功后
            	if(v_status.indexOf('ok') >-1){
            		iframe.iframeObj["table"].removeSelectedRow();
            	}
            	
            	
            }
        });
	   },"确认提示");
}
//查看明细
function viewData(vId){
	var dialogStruct={
			'display':contextRootPath+'/laTCarHandling/prepareExecute/toView?id='+vId,
			'width':1100,
			'height':750,
			'title':'查看明细',
			'buttons':[
			 {'text':'关闭','isClose':true}
			]
	};
		
	var dialogView = jyDialog(dialogStruct).open();
}
//提交
function submitData1(){
	var v_ids = iframe.iframeObj["table"].getSelectedIds().join(",");
	var objs = iframe.iframeObj["table"].getSelectedObjs();
 	var url = contextRootPath+"/carHandlingjbpm/jbpmCarHandling/startCarHandlingWorkflow?nextPartnerId="+$("#dtoparamUserId").val()+"&id="+v_ids+"&loginUserId="+$("#loginUserId").val();
 	$.ajax({
	     type:"POST",
	     dataType:"JSON",
	     url:url,
	     success:function(msg){
	            var v_status = msg.status;
	            if(v_status.indexOf('ok') >-1){
	            	$("").newMsg({"waitTime":3000,"title":"操作提示"}).show("提交数据成功！");
	            	queryData();
	            }
	        }
	     });
}
function toPrint(){
	var v_ids = iframe.iframeObj["table"].getSelectedIds().join(",");
	//如果没有选中 数据则
	if(v_ids == ""){
		jyDialog({"type":"warn"}).alert("请选择待打印的数据！");
		return;
	}
	//如果选择多个 择提示
	if(v_ids.indexOf(",") > -1){
		jyDialog({"type":"warn"}).alert("请选择一条数据进行打印操作！");
		return;
	}

	var dialogStruct={
			'display':contextRootPath+'/laTCarHandling/prepareExecute/toPrint?id='+v_ids,
			'width':800,
			'height':600,
			'title':'打印车辆处置申请单',
			'buttons':[
             {'text':'打印预览','action':printpreview,'isClose':true},
			 {'text':'关闭','isClose':true}
			]
		};
		
	dialogUpdate = jyDialog(dialogStruct);
	dialogUpdate.open();
}
function printpreview() {
 	dialogUpdate.getIframe().window.print();
}
//上传文件
function toUploadFile(){
	//getValueForIndex("listStat",);
	var v_ids = iframe.iframeObj["table"].getSelectedIds().join(",");
	var objs = iframe.iframeObj["table"].getSelectedObjs();
	//如果没有选中 数据则
	if(v_ids == ""){
		jyDialog({"type":"warn"}).alert("请选择数据！");
		return;
	}
	//如果选择多个 择提示
	if(v_ids.indexOf(",") > -1){
		jyDialog({"type":"warn"}).alert("请选择一条数据！");
		return;
	}
	if(objs[0]["listStat"] != "01"){
		jyDialog({"type":"warn"}).alert("只能对单据状态为初始录入的数据添加附件！");
		return;
	}
	var dialogStruct={
			'display':contextRootPath+'/laTImageBizAss/prepareExecute/toViewUpload?id='+v_ids+"&type=24",
			'width':1000,
			'height':800,
			'title':'上传车辆处置申请附件',
			'buttons':[
			 {'text':'关闭','isClose':true}
			]
		};
  	dialogUpdate =jyDialog(dialogStruct);
	dialogUpdate.open();
}
/**
 * 保存退还保证金时, 校验
 */
function checkInto(formObj) {
	var nullErrors=[];
    submitCheckIsNull(formObj,null,nullErrors);
 	if(nullErrors.length) {
		var checkTip="校验未通过!";
		$("").newMsg({}).show(checkTip);
		return false;
	}
	return true;
} 