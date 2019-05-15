$(function() {
	$('input').iCheck({
		checkboxClass : 'icheckbox_square-blue',
		radioClass : 'iradio_square-blue',
		increaseArea : '20%' /* optional */
	});

	/*
	 * $('#accept').click(function(){
	 * 
	 * if($("#accept").prop('checked')){ $('#btn').attr("class","btn btn-primary
	 * btn-block btn-flat disabled"); }else{ $('#btn').attr("class","btn
	 * btn-primary btn-block btn-flat"); // $('#btn').removeAttr("disabled");
	 *  } });
	 */

	$('#accept').on('ifChecked', function(event) {
		$('#btn').attr("class", "btn btn-primary btn-block btn-flat");
	});

	$('#accept').on('ifUnchecked', function(event) {
		$('#btn').attr("class", "btn btn-primary btn-block btn-flat disabled");
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