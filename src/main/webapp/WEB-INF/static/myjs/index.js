  
//树形结构菜单
$(function(){

	$.get("treeright",function(jsonTree){
		console.log(jsonTree);
		$('#treeRight').treeview({data: jsonTree});
	});
	
	
	$.get("userslist",function(json){
		console.log(json);
	})
	
	$("#tableUser").DataTable({	
		serverSide:true,
		ajax:{
			type:"get",
			url:"userslist"
		},
		columns:[
			{data:'tuId'},
			{data:'toId'},
			{data:'loginName'},
			{data:'vsername'},
			{data:'password'},
			{data:'mobile'},
			{data:'email'},
			{data:'genTime'},
			{data:'loginTime'},
			{data:'lastLoginTime'},
			{data:'count'}
		]
	});

});








