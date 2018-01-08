<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<nav class="navbar navbar-default">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="${myContextPath}/">KrChis</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li class="active"><a href="${myContextPath}/">Post <span class="sr-only">(current)</span></a></li>
            </ul>
            <form class="navbar-form navbar-left" role="search">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Search">
                </div>
                <button type="submit" class="btn btn-default">검색</button>
            </form>
            <ul class="nav navbar-nav navbar-right">
                <c:if test="${empty sessionScope.krchissessionuser }">
                <li><a href="${myContextPath}/users/loginform">로그인</a></li>
                <li><a href="${myContextPath}/users/form">회원가입</a></li>
                </c:if>
                <c:if test="${not empty sessionScope.krchissessionuser }">
                <li><a href="${myContextPath}/users/logout">로그아웃</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">${sessionScope.krchissessionuser.name}님 마이페이지 <span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="${myContextPath}/users/updateForm">개인정보수정</a></li>
                        <li><a href="#">내활동내역</a></li>
                        <li class="divider"></li>
                        <li><a href="${myContextPath}/users/">회원목록조회</a></li>
                    </ul>
                </li>
                </c:if>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
