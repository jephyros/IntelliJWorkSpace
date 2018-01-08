<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
<head>
    <title>KrChisBootStrap</title>
    <%@include file="include/header.jsp"%>

</head>
<body >
    <%@include file="include/navimenu.jsp"%>


    <div class="container">
    <c:forEach var="m" items="${boardList}">
        <div class="col-sm-6 col-md-4">
            <div class="thumbnail">
                <h4>${m.title}</h4>
                <span class="label label-default">${m.createDate}</span> <span class="label label-info">>${m.createUserName}</span>
                <a href ="/boards/${m.id}"><p><span class="label label-primary">내용보기</span><span class="badge">${m.answercount}</span></p></a>

            </div>
        </div>
    </c:forEach>

    </div>
    <%@include file="include/footer.jsp"%>

</body>
</html>
