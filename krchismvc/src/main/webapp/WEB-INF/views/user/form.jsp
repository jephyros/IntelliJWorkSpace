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
    <form method="post" action="${myContextPath}/users/">
        <div class="form-group">
            <label for="userId">아이디</label>
            <input type="text" class="form-control" id="userId" name="userId" placeholder="아이디를입력하세요">
        </div>
        <div class="form-group">
            <label for="name">이름</label>
            <input type="text" class="form-control" id="name" name="name" placeholder="이름를입력하세요">
        </div>
        <div class="form-group">
            <label for="exampleInputPassword1">암호</label>
            <input type="password" class="form-control" id="exampleInputPassword1" name ="password" placeholder="암호">
        </div>

        <div class="form-group">
            <label for="exampleInputEmail1">이메일주소</label>
            <input type="email" class="form-control" id="exampleInputEmail1" name ="email" placeholder="이메일을 입력하세요">
        </div>

        <button type="submit" class="btn btn-success">회원가입하기</button>
    </form>
</div>


<%@include file="../include/footer.jsp"%>

</body>
</html>
