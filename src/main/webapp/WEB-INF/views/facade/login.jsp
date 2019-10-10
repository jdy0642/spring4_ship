<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<form id="login_form">
	<div class="login_tab">
		<div id="login_tab_item4">
			부서명
		</div>
		<div id="login_tab_item5">
			<input id="login_userdept" class="input_text" type="text" name="dName"/>
		</div>
		<div id="login_tab_item1">
			아이디
		</div>
		<div id="login_tab_item6">
			<input id="login_username" class="input_text" type="text" name="empNo"/>
		</div>
		<div id ="login_tab_item3">
			비밀번호
		</div>
		<div id ="login_tab_item7">
			<input id="login_userpass" class="input_text" type="text" name="eName">
		</div>
		<div id="login_tab_item2">
			<input type="hidden" name="action" value="login"/>
			<input type="hidden" name="page" value="main"/>
			<input id="login_btn" type="button" value="로그인"/>
		</div>
			<div>
			<h3 id="join_a"><a id="a_join"href="#">회원가입</a></h3>
			
			</div>
	</div>
</form>