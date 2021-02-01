var currentPosition = parseInt($("#sidebox").css("top")); 
$(window).scroll(function() { 
  var position = $(window).scrollTop(); 
  $("#sidebox").stop().animate({"top":position+currentPosition+"px"},1000); 
});

