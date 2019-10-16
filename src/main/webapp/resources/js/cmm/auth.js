"use strict";
var auth = auth || {};
auth = (()=>{
	let _,js;
	
	let init =()=>{
		_=$.ctx();
		js=$.js();
	}
	let onCreate =()=>{
		init();
		$('#a_go_join').on('click',()=>{
			alert('회원가입');
		});
	}
	return{onCreate : onCreate}
})();


