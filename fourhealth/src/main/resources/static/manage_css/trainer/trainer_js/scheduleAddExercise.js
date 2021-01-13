		var time = 60;
		$('#exercise').click(function() {
			console.log('gd');
			var exerciseName = $('#exercise_name').val();
			var exerciseHow = $('#serach_how').val();
			//시간 기본값
			
			
			var height = parseFloat($('#select_user_id').text());
			var weight = parseFloat($('#select_user_weight').text());
			
			console.log(height,weight);
			console.log(exerciseName,exerciseHow);
			var request = $.ajax({
				method : "POST",
				url : "/serachTrainerExercise",
				data : {exerciseName : exerciseName, exerciseHow : exerciseHow},
				dataType : 'json'
			});
			request.done(function(data) {
				console.log(JSON.stringify(data));
				var html = '';
				for(var i = 0; i<data.length; i++){
					html+= '<tr>';
					html+= "<td id = 'change_time'>";
					html+="<input type= 'checkbox' class ='add_exerise' value="+data[i].exerciseName+">"
					html+= data[i].exerciseName;
					html+= "<span class = 'met' style = 'float : right;'>"+data[i].exerciseMetCoeffcient+'</span>'
					html+="<div class = 'smallText'>"
					html+= "<a href ='#' class ='time'>"+time+"분</a>" 
					html+="<span id ='kal' style='float: right;'>"+Math.floor(data[i].exerciseMetCoeffcient *(3.5*weight*time/1000)*5)+"kal</span>";
					html+="<div class = 'on_off' style='display: none;'><input type = 'text' id = 'num'><button type = 'button' class = 'change_btn'>바꾸기</button><div>";
					html+= '</td>';
					html+= '</div></tr>';
				/* 	 html+= data[i].exerciseMetCoeffcient; //회원아이디값에서 칼로리별계산해줘야하나 고민중 
					html+= '</td>';
					html+= '<td>';												//시간별로 계산해주려면 변수로 빼멸 될듯?
					html+= Math.floor(data[i].exerciseMetCoeffcient *(3.5*weight*60/1000)*5);
					html+= '</td>';
				 	html+= '<button type = button' 
					html+= '</tr>'; */
					
				}
				$('#data').html(html);
			});
			request.fail(function(jqXHR, textStatus){
				alert("Request failed" + testStatus)
			});
		});
		

	/* $(document).on('change','input[class = add_exerise]',function(){
		   if($(".add_exerise").is(":checked")){
			   var html1 = "<p>운동명 :<input type ='text' value= "+$(this).val()+" readonly='readonly'> 넣어줄시간(분) :<input type ='text' value= ''></p>";
				$('#insert_exercise').after(html1);
		   }
		   
	}); */
	 $(document).on('click','.time', function(){
		 $(this).parent().find('.on_off').css('display','block');
		 
		
	}); 
	
	
	
	 $(document).on('click','.change_btn',function(){
		 
		var exerciseMetCoeffcient = parseFloat($(this).parents('#change_time').find('.met').text());
		var inputTime = parseInt($(this).parents('#change_time').find('#num').val());
		var weight = parseFloat($('#select_user_weight').text());
		
		console.log(exerciseMetCoeffcient,inputTime,weight);
		
		var timeKal = Math.floor(exerciseMetCoeffcient *(3.5*weight*inputTime/1000)*5);
		
		console.log(timeKal);
		
		
		$(this).parents('#change_time').find('#kal').text(timeKal+'kal');
		$(this).parents('#change_time').find('.time').text(inputTime+'분');
		$(this).parents('.on_off').css('display','none');
		
	}) 
	
