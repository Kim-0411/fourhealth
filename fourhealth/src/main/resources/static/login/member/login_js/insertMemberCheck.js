     $("#sign_up").click(function () {
        if ($("#userPassword").val() == "") {
          alert("비밀번호를 입력해주세요.");
          $("#userPass").focus();
          return false;
        }
        if ($("#userPassword").val() != $("#userPwCheck").val()) {
          alert("비밀번호가 일치하지 않습니다.");
          $("#userPwCheck").val("").focus();
          return false;
        }
        if ($("#userName").val() == "") {
          alert("이름을 입력해주세요.");
          $("#userName").focus();
          return false;
        }
        if ($("#userBirth").val() == "") {
          alert("생년원일을 입력해주세요.");
          $("#userBirth").focus();
          return false;
        }
        if ($("#userNickName").val() == "") {
          alert("닉네임을 입력해주세요.");
          $("#userNickName").focus();
          return false;
        }
        if ($("#userPhone").val() == "") {
          alert("핸드폰번호를 입력해주세요.");
          $("#userPhone").focus();
          return false;
        }
        if ($("#userEmail").val() == "") {
          alert("이메일을 입력해주세요.");
          $("#userEmail").focus();
          return false;
        } else {
          $("#sign_form").submit();
        }
      });

      $("#userIdCheck").click(function () {
        var userId = $("#userId").val();
        console.log(userId);
        var request = $.ajax({
          url: "/userIdCheck",
          method: "POST",
          data: { userId: userId },
          dataType: "json",
        });

        request.done(function (msg) {
          if (msg == 0) {
            if (userId == "") {
              alert("아이디를 입력해주세요");
            } else {
              alert("사용 가능한 아이디 입니다.");
              $("#sign_up").attr("disabled", false);
            }
          } else {
            alert("중복 되는 아이디가 있습니다.");
            $("#sign_up").attr("disabled", true);
          }
        });

        request.fail(function (jqXHR, textStatus) {
          alert("Request failed: " + textStatus);
        });
      });