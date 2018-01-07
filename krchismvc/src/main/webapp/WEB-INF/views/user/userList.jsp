<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>


<html>
<head>
    <title>회원목록</title>
    <%@include file="../include/header.jsp"%>

</head>
<body>
<%@include file="../include/navimenu.jsp"%>



<div class="container">

    <div class="alert alert-success" role="alert">회원수 : 총 ${fn:length(userList)} 명</div>
    <table class="table table-hover">
        <thead>
            <tr>
                <th>ID</th>
                <th>아이디</th>
                <th>Name</th>
                <th>Email</th>
            </tr>

        </thead>
        <tbody>
        <c:forEach var="m" items="${userList}">
            <tr>
                <td>${m.id}</td>
                <td>${m.userId}</td>
                <td>${m.name}</td>
                <td>${m.email}</td>
            </tr>
        </c:forEach>
        </tbody>

    </table>
</div>


<%@include file="../include/footer.jsp"%>

</body>
</html>
