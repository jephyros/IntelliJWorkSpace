<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
<head>
    <title>로그인</title>
    <%@include file="../include/header.jsp"%>

</head>
<body>
<%@include file="../include/navimenu.jsp"%>


<div class="container"  >

    <c:if test="${not empty errorMsg }">
    <div class="alert alert-warning alert-dismissible" role="alert">
        <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <strong>${errorMsg}</strong>
    </div>
    </c:if>

        <form class="form-horizontal" method="post" id ="formlogin" action="${myContextPath}/loginProc">

            <div class="form-group">
                <label for="username" class="col-sm-2 control-label">아이디</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="username" name="username" placeholder="아이디">
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
                            <input type="checkbox" name="rememberChk" value="checked"> Remember me
                        </label>
                    </div>

                </div>
            </div>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-success" id ="loginbtn">로그인</button>
                </div>
            </div>
        </form>

</div>

<%@include file="../include/footer.jsp"%>

<%--

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
            .attr('action','${myContextPath}/login/')
            .submit();

    }

   /* var userInputId = getCookie("userInputId");
    $("#userId").val(userInputId);

    if($("#userId").val() != ""){ // 그 전에 ID를 저장해서 처음 페이지 로딩 시, 입력 칸에 저장된 ID가 표시된 상태라면,
        $("#rememberChk").attr("checked", true); // ID 저장하기를 체크 상태로 두기.
    }*/

</script>


--%>

</body>
</html>
