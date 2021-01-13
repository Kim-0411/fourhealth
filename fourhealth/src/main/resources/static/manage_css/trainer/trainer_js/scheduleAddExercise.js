//시간 기본값
var time = 60;
/* 트레이너가 자신의 프로모션에 선택되어있는 회원 선택후 운동 스케줄 넣어줄때 검색 버튼 클릭시 작동하는 메서드*/ 
$('#exercise_serach').click(function () {
	var exerciseName = $('#exercise_name').val(); //운동이름	
	var exerciseHow = $('#serach_how').val(); //운동난이도(가벼움,보통 등)

	var height = parseFloat($('#select_user_id').text()); //선택한 사용자의 키
	var weight = parseFloat($('#select_user_weight').text()); //선택한 사용자의 몸무게

	console.log(height, weight);
	console.log(exerciseName, exerciseHow);
	var request = $.ajax({
		method: "POST",
		url: "/serachTrainerExercise",
		data: { exerciseName: exerciseName, exerciseHow: exerciseHow },
		dataType: 'json'
	});
	request.done(function (data) {
		console.log(JSON.stringify(data));
		var html = '';
		/*db에서 가져온 met계수 및 운동 명을 바탕으로 사용자별 몸무게에 대한 시간 별 칼로리 리스트*/
		for (var i = 0; i < data.length; i++) {
			html += '<tr>';
			html += "<td id = 'change_time'>";
			html += "<input type= 'checkbox' class ='add_exerise' value=" + data[i].exerciseName + ">"
			html += data[i].exerciseName;
			html += "<span class = 'met' style = 'float : right;'>" + data[i].exerciseMetCoeffcient + '</span>'
			html += "<div class = 'smallText'>"
			html += "<a href ='#' class ='time'>" + time + "분</a>"
			html += "<span id ='kal' style='float: right;'>" + Math.floor(data[i].exerciseMetCoeffcient * (3.5 * weight * time / 1000) * 5) + "kal</span>";
			html += "<div class = 'on_off' style='display: none;'><input type = 'text' id = 'num'><button type = 'button' class = 'change_btn'>바꾸기</button><div>";
			html += '</td>';
			html += '</div></tr>';
		}
		$('#exercise_info').html(html);
	});
	request.fail(function (jqXHR, textStatus) {
		alert("Request failed" + testStatus)
	});
});

/*운동 검색 처리시 시간변경 하기위해  클릭시의 동작*/
$(document).on('click', '.time', function () {
	$(this).parent().find('.on_off').css('display', 'block');
});
/*위의 동작을 통해 나온 화면에 내가 적은 시간 값에 따른 결과 시간에 따른 칼로리량 변경*/
$(document).on('click', '.change_btn', function () {
	var exerciseMetCoeffcient = parseFloat($(this).parents('#change_time').find('.met').text());
	var inputTime = parseInt($(this).parents('#change_time').find('#num').val());
	var weight = parseFloat($('#select_user_weight').text());

	console.log(exerciseMetCoeffcient, inputTime, weight);

	var timeKal = Math.floor(exerciseMetCoeffcient * (3.5 * weight * inputTime / 1000) * 5);

	console.log(timeKal);
	$(this).parents('#change_time').find('#kal').text(timeKal + 'kal');
	$(this).parents('#change_time').find('.time').text(inputTime + '분');
	$(this).parents('.on_off').css('display', 'none');

});

