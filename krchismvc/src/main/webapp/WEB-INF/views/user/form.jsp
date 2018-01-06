<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <title>회원가입</title>
    <%@include file="../include/header.jsp"%>

</head>
<body>
<%@include file="../include/navimenu.jsp"%>



<div class="container">
    <form>
        <div class="form-group">
            <label for="exampleInputEmail1">이메일주소</label>
            <input type="email" class="form-control" id="exampleInputEmail1" placeholder="이메일을 입력하세요">
        </div>
        <div class="form-group">
            <label for="exampleInputPassword1">암호</label>
            <input type="password" class="form-control" id="exampleInputPassword1" placeholder="암호">
        </div>
        <div class="form-group">
            <label for="exampleInputFile">파일 업로드</label>
            <input type="file" id="exampleInputFile">
            <p class="help-block">여기에 블록레벨 도움말 예제</p>
        </div>
        <div class="checkbox">
            <label>
                <input type="checkbox"> 입력을 기억합니다
            </label>
        </div>
        <button type="submit" class="btn btn-default">제출</button>
    </form>
</div>


<%@include file="../include/footer.jsp"%>

</body>
</html>
