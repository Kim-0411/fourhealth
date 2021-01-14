var currentPosition = parseInt($("#sidebox").css("top")); 
$(window).scroll(function() { 
  var position = $(window).scrollTop(); 
  $("#sidebox").stop().animate({"top":position+currentPosition+"px"},1000); 
});
$(function(){
	$('#commentInsertBtn').click(function(){
		var userSnsCommentContents = $('#insertSnsComment1').val();
		var request = $.ajax({
			url:"/commentInsertBtn",
			method:"post",
			data:{userSnsCommentContents:userSnsCommentContents},
			contentType: "application/json; charset=UTF-8",
			dataType:"json"
				
		});
	});
});