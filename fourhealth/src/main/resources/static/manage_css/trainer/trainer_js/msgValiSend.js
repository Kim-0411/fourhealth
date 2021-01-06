$('#submit_btn').click(function () {
    var textArea = $('#text_area').val().length;
    console.log(textArea);
    if ($('#receiveId').val() == "") {
        alert('사용자아이디를 확인해주세요.');
    } else if (textArea < 10) {
        alert('전송하실 메시지의 길이를 10글자 이상적어주세요.');
    } else {
        message_send.submit();
    }


});
