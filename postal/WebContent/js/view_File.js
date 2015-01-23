$(document).ready(function() {
	$(window).load(function() {
		var auto=setInterval(function() {
			var value="";
			var username=$('#un').val();
			$.ajax({
				url:"resultsucess.jsp?un="+username,
				data: value,
				cache: false,
				sucess: function(data){
					$('#msg').html(data);
				
				}
			});
			}, 5000);
					
		});
		

	
});