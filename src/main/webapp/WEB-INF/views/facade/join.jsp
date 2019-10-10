<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	
		<form id="join_form">
		<div class="join_tab">
			<div>사원번호	: </div>
			<div><input type="text" name="empNo" id="join_username" /></div>
			<div>사원이름 	: </div>
			<div><input type="text" name="eName" id="join_userpass" /></div>
			<div>job 	: </div>
			<div><input type="text" name="job"/></div>
			<div>mgr 	: </div>
			<div><input type="text" name="mgr"/></div>
			<div>hiredate: </div>
			<div><input type="text" name="hireDate"/></div>
			<div>sal 	: </div>
			<div><input type="text" name="sal"/></div>
			<div>comm 	: </div>
			<div><input type="text" name="comm"/> </div>
			<div>deptno 	: </div>
			<div><input type="text" name="deptNo"/></div>
			<div>dname 	: </div>
			<div><input type="text" name="dName"/></div>
			<input type="hidden" name="action" value="create" />
			<input type="hidden" name="page" value="main" />
			<input type="button" id="join_form_button" value="회원가입"/>
		</div>
		</form>
