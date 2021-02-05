//메세지 발송 취소 함수

$(document).on('click','.msg_del', function(){
    var msgCode = $(this).parents('tr').children('#msg_val').val();
    var msgChange = $(this).parents('tr').find('.msg_del');
    console.log(msgChange);
    console.log(msgCode);
    if(confirm('발송 취소하시겠습니까?') == true){
        var request = $.ajax({
            method : "GET",
            url : "/cancelMsg",
            data : {msgCode : msgCode},
            dataType : 'json'
        });
        
        request.done(function(data) {
            alert('성공적으로 취소하였습니다.');
            var html ='<span>취소성공</span>';
            msgChange.replaceWith(html);
            locaton.reload();
            
        });
        request.fail(function(jqXHR, textStatus){
            alert("Request failed" + textStatus);
        });
        };
    
}); 