$(function() {
	$('input').iCheck({
		checkboxClass : 'icheckbox_square-blue',
		radioClass : 'iradio_square-blue',
		increaseArea : '20%' /* optional */
	});
	
	
	 $('#accept').click(function(){
         if($("#accept").prop('checked')){
        	 $('#btn').attr("disabled","disabled");
         }else{
        	 $('#btn').removeAttr("disabled"); 
        	
         }
     });

	 $.get("getOption", function(json) {
			 console.log(json);
			var option = '';
			$.each(json, function(i, v) {
				option += "<option value='" + i + "'>" + v + "</option>";
			});
			$("#select").append(option);
		})

});