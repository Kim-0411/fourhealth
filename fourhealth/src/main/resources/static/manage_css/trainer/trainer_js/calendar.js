// 켈린더(Plugin)

let test = 0;

$(function () {
  /* initialize the external events
     -----------------------------------------------------------------*/
  function ini_events(ele) {
    ele.each(function () {
      // create an Event Object (https://fullcalendar.io/docs/event-object)
      // it doesn't need to have a start or end
      var eventObject = {
        title: $.trim($(this).text()), // use the element's text as the event title
      };

      // store the Event Object in the DOM element so we can get to it later
      $(this).data("eventObject", eventObject);

      // make the event draggable using jQuery UI
      // $(this).draggable({
      //   zIndex: 1070,
      //   revert: true, // will cause the event to go back to its
      //   revertDuration: 0, //  original position after the drag
      // });
    });
  }

  ini_events($("#external-events div.external-event"));

  /* initialize the calendar
     -----------------------------------------------------------------*/
  //Date for the calendar events (dummy data)
  var date = new Date();
  var d = date.getDate(),
    m = date.getMonth(),
    y = date.getFullYear();

  var Calendar = FullCalendar.Calendar;
  var Draggable = FullCalendar.Draggable;

  var containerEl = document.getElementById("external-events");
  var checkbox = document.getElementById("drop-remove");
  var calendarEl = document.getElementById("calendar");

  // initialize the external events
  // -----------------------------------------------------------------

 /* new Draggable(containerEl, {
    itemSelector: ".external-event",
    eventData: function (eventEl) {
      return {
        title: eventEl.innerText,
        backgroundColor: window
          .getComputedStyle(eventEl, null)
          .getPropertyValue("background-color"),
        borderColor: window
          .getComputedStyle(eventEl, null)
          .getPropertyValue("background-color"),
        textColor: window
          .getComputedStyle(eventEl, null)
          .getPropertyValue("color"),
      };
    }
  });*/

  var calendar = new Calendar(calendarEl, {
  
    headerToolbar: {
      left: "prev,next today",
      center: "title addEventButton",
      right: "dayGridMonth,timeGridWeek,timeGridDay",
    },
    locale : 'ko', 
    themeSystem: "bootstrap",
    defaultView: 'agendaWeek',
    editable:true,
    navLinks:true,
    busindessHours:true,
    selectable:true,

    dateClick: function(day) {
      


    	var user_id = $("#select_user_id").text(); //스케쥴 아이디 유무
    	if(user_id == ''){
    		alert('프로모션 및 회원을 선택해주세요.');
    	}else{
         $("#myModal").modal();          
      }
    
      
      console.log('add btn test', d);
      calendar.addEvent({
        title:'test',
        start:date,
        allDay:true
      })
    },


    customButtons: {
      //title 쪽 addEventButton 일정 이벤트 추가
      addEventButton:{
        text:'일정추가',
        click: function(){
          console.log('test');
          var dateStr = prompt('Enter a date in YYYY-MM-DD format');
          var date = new Date(dateStr + 'T00:00:00'); // will be in local time

          if (!isNaN(date.valueOf())) { // valid?
            $("#myModal").modal(function(){
              calendar.addEvent({
                title: '일정추가됨',
                start: date,
                allDay: true
              });

            }); 
            
            alert('Great. Now, update your database...');
          } else {
            alert('Invalid date.');
          }
        }
      }
    },
    //Random default events
  /*  events: [
      {
        title: "All Day Event",
        start: new Date(y, m, 1),
        backgroundColor: "#f56954", //red
        borderColor: "#f56954", //red
        allDay: true,
      },
      {
        title: "Long Event",
        start: new Date(y, m, d - 5),
        end: new Date(y, m, d - 2),
        backgroundColor: "#f39c12", //yellow
        borderColor: "#f39c12", //yellow
      },
      {
        title: "Meeting",
        start: new Date(y, m, d, 10, 30),
        allDay: false,
        backgroundColor: "#0073b7", //Blue
        borderColor: "#0073b7", //Blue
      },
      {
        title: "Lunch",
        start: new Date(y, m, d, 12, 0),
        end: new Date(y, m, d, 14, 0),
        allDay: false,
        backgroundColor: "#00c0ef", //Info (aqua)
        borderColor: "#00c0ef", //Info (aqua)
      },
      {
        title: "Birthday Party",
        start: new Date(y, m, d + 1, 19, 0),
        end: new Date(y, m, d + 1, 22, 30),
        allDay: false,
        backgroundColor: "#00a65a", //Success (green)
        borderColor: "#00a65a", //Success (green)
      },
      {
        title: "Click for Google",
        start: new Date(y, m, 28),
        end: new Date(y, m, 29),
        url: "https://www.google.com/",
        backgroundColor: "#3c8dbc", //Primary (light-blue)
        borderColor: "#3c8dbc", //Primary (light-blue)
      },
    ],*/
 /*   editable: true,
    droppable: true, // this allows things to be dropped onto the calendar !!!
    drop: function (info) {
      // is the "remove after drop" checkbox checked?
      if (checkbox.checked) {
        // if so, remove the element from the "Draggable Events" list
        info.draggedEl.parentNode.removeChild(info.draggedEl);
      }
    },*/
  //클릭시 동작 이벤트 
  //################################################################
  //################################################################
    
    

    

  });
  $("#schedule-modal-add-btn").click(function(day){

    var dataStr = prompt("");

    var date = new Date();
    var d = date.getDate(),
      m = date.getMonth(),
      y = date.getFullYear();
    console.log('add btn test', d);
    console.log(m);
    console.log(y);
    
  })
  //켈린더 뿌려주는 로직
  calendar.render();
  // $('#calendar').fullCalendar()

  /* ADDING EVENTS */
  var currColor = "#3c8dbc"; //Red by default
  // Color chooser button
  $("#color-chooser > li > a").click(function (e) {
    e.preventDefault();
    // Save color
    currColor = $(this).css("color");
    // Add color effect to button
    $("#add-new-event").css({
      "background-color": currColor,
      "border-color": currColor,
    });
  });

  //////////////////////////////////////////

  // 스케쥴 모달페이지

  $("#add-new-event").click(function () {    
    var firstScheduleTitle = $("#new-event").val(); //스케쥴 타이틀
    var user_id = $("#select_user_id").text(); //스케쥴 아이디 유무

    if (firstScheduleTitle == "") {
      alert("스케쥴 타이틀을 정해주세요!");
    } else {
      if (user_id == "") {
        alert("해당 프로모션 회원을 선택해주세요.");
      } else {
        $("#myModal").modal();

        $("#schedule-modal-add-btn").click(function () {
          var secondScheduleTitle = $("#new-event").val();
          
          $("#myModal").modal("hide");
       
          if (secondScheduleTitle.length == 0) {
            return;
          }
          var event = $("<div>");

          event
            .css({
              "background-color": currColor,
              "border-color": currColor,
              color: "#fff",
            })
            // .addClass("external-event"+test+" external-event ui-draggable ui-draggable-handle");
            .addClass("external-event")
            .attr("id", "external-event" + test);
          event.text(secondScheduleTitle);
          $("#external-events").prepend(event);
          test++;

          ini_events(event);

          $("#new-event").val("");

  

        });
      }
    }
  });
});


$(document).on('click','.external-event', function () {
	  console.log($(this).text());
	  $("#myCardModal").modal();
});

$(document).on('external-event','click', function () {
 
  console.log($(this).text());
});
