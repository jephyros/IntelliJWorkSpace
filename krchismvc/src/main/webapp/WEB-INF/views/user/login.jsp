<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <title>로그인</title>
    <%@include file="../include/header.jsp"%>

</head>
<body>
<%@include file="../include/navimenu.jsp"%>


<div class="container"  >
    <form class="form-horizontal" method="post" id ="formlogin" action="${myContextPath}/users/login/">
        <div class="form-group">
            <label for="userId" class="col-sm-2 control-label">아이디</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="userId" name="userId" placeholder="아이디">
            </div>
        </div>
        <div class="form-group">
            <label for="password" class="col-sm-2 control-label">비밀번호</label>
            <div class="col-sm-10">
                <input type="password" class="form-control" id="password" name ="password" placeholder="비밀번호">
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <div class="checkbox">
                    <label>
                        <input type="checkbox"> Remember me
                    </label>
                </div>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-success" id ="loginbtn">로그인</button>
            </div>
        </div>
    </form>
</div>

<%@include file="../include/footer.jsp"%>


<script>
$("#loginbtn").click(logininputchk);

function logininputchk(e){
    e.preventDefault();   // 이벤트 맊기
    if ($("#userId").val()==="")
    {
        alert("아이디를 입력하세요!!");
        $("#userId").focus();
        return false;

    }
    if ($("#password").val()==="")
    {
        alert("비밀번호을 입력하세요!!");
        $("#password").focus();
        return false;
    }
    $('#formlogin')
        .attr('method','post')
        .attr('action','${myContextPath}/users/login/')
        .submit();

}

</script>

</body>
</html>
