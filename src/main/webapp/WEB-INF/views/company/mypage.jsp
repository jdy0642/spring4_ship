<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<div class="join_tab" style="width: 100%;height: 100%">
	<div></div>
	<div>사원번호	: ${user.getEmpno()} </div>
	<div>사원이름 	: ${user.getEname()} </div>
	<div>job 	: ${user.getJob()} </div>
	<div>mgr 	: ${user.getMgr()} </div>
	<div>hiredate: ${user.getHireDate()} </div>
	<div>sal 	: ${user.getSal()} </div>
	<div>comm 	: ${user.getComm()} </div>
	<div>deptno 	: ${user.getDeptno()} </div>
	<div>dname 	: ${user.getDname()} </div>
	<div></div>
	<c:forEach items="${company}" var="var">
	${var.getDeptno()} ${var.getDname()} ${var.getLoc()}</br>
	</c:forEach>
	</div>
	<br> <a id="back_login" href="#">돌아가기</a>
