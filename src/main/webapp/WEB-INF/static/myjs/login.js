$(function() {
	$('input').iCheck({
		checkboxClass : 'icheckbox_square-blue',
		radioClass : 'iradio_square-blue',
		increaseArea : '20%' /* optional */
	});

	$.get("login/getOption", function(json) {
		 console.log(json);
		var option = '';
		$.each(json, function(i, v) {
			option += "<option value='" + i + "'>" + v + "</option>";
		});
		$("#select").append(option);
	})

});