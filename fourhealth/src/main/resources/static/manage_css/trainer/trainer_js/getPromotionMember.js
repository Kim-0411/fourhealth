
// 트레이너 로그인 후, 자기 프로모션 선택 시 회원 목록 가져오기
// 1.트레이너 프로모션 등록한 회원 가져오기

$('#promotion_select').change(function(){
    var promotionCode = $(this).val();
    var request = $.ajax({
          url: "/getTrainerMyPromotionMemberList",
          method: "GET",
          data: { promotionCode : promotionCode },
          dataType: "json"
    });
     
    request.done(function( data ) {
        var html ='';
        console.log(data);
         for(var i =0; i<data.length; i++){
             html += '<option class ="select_user">'+data[i].userId+'</option>';
        }
        $('#matching_user').html(html);
    });
     
    request.fail(function( jqXHR, textStatus ) {
      alert( "Request failed: " + textStatus );
    }); 
});

// 회원 선택시, 회원정보(프로모션 가입자) 상세 표시
// 2. 등록된 회원의 상세 정보 가져오기
$(document).on('click','.select_user',function(){	
    var userId = $(this).val();
    console.log(userId);
     var request = $.ajax({
          url: "/getTrainerMyPromotionMemberInfo",
          method: "GET",
          data: { userId : userId },
          dataType: "json"
        });
         
        request.done(function(data ) {
            console.log(data);
            $('#select_user_id').html('<span id="select_user_id">'+data.userId+'</span>');
            $('#select_user_weight').html('<span id="select_user_weight">'+data.userFirstWeight+'</span>');
            $('#select_user_hieght').html('<span id="select_user_hieght">'+data.userFirstHeight+'</span>');
            
        });
         
        request.fail(function( jqXHR, textStatus ) {
          alert( "Request failed: " + textStatus );
        });  
});
