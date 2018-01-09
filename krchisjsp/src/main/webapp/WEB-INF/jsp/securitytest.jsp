<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page session="false"%>

<html>
<head>

    <title>SpringSecurity</title>
</head>
<body>
<h2> securitytest.jsp </h2>
<hr>
<div>message : ${message}</div>
<c:if test = "${pageContext.request.userPrincipal.name != null}">
    welcome ${pageContext.request.userPrincipal.name}! <br>

    <form:form action ="${pageContext.request.contextPath}/logout" method="post">
        <input type ="submit" value="logout"/>
    </form:form>
</c:if>

<hr>
<c:if test = "${pageContext.request.userPrincipal.name == null}">
    <a href="<c:url value="/login"/>"> login </a> <br>
</c:if>



</body>
</html>