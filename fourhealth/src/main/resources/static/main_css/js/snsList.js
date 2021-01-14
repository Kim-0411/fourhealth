var currentPosition = parseInt($("#sidebox").css("top")); 
$(window).scroll(function() { 
  var position = $(window).scrollTop(); 
  $("#sidebox").stop().animate({"top":position+currentPosition+"px"},1000); 
});
$(function(){
	$('#commentsInsertBtn').click(function(){
		var userSnsCommentContents = $('#insertSnsComments').val();
		var request = $.ajax({
			url:"/commentsInsertBtn",
			method:"post",
			data:{'userSnsCommentContents':userSnsCommentContents},
			contentType: "application/json; charset=UTF-8",
			dataType:"json"
				
		});
	});
});