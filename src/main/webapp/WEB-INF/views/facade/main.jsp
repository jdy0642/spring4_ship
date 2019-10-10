<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<jsp:include page="../common/head.jsp"/>
	<div>
		<h1>회원관리</h1>
		<c:choose>
			<c:when test="${page eq 'login'}">
				<jsp:include page="login.jsp"/>
			</c:when>
			<c:when test="${page eq 'join'}">
				<jsp:include page="join.jsp"/>
			</c:when>
		</c:choose>
		</div>		
<jsp:include page="../common/foot.jsp"/>
