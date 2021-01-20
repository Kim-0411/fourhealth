  $("#login").click(function () {
        if ($("#userId").val() == "") {
          alert("아이디를 입력해주세요.");
          $("#userId").focus();
          return false;
        }
        if ($("#userPassword").val() == "") {
          alert("비밀번호를 입력해주세요.");
          $("#userPassword").focus();
          return false;
        } else {
          $("#memberlogin").submit();
          console.log("로그인성공");
        }
      });