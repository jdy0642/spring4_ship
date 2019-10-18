"use strict";
var auth = auth || {};
auth = (()=>{
	const WHEN_ERR = '호출하는 JS 파일을 찾지 못했습니다.'
	let _,js, auth_vue_js;
	
	let init =()=>{
		_=$.ctx()
		js=$.js()
		auth_vue_js= js+'/vue/auth_vue.js'
	}
	 let onCreate =()=>{
         init()
         	$.getScript(auth_vue_js).done(()=>{
         		setContentView()
         		$('#a_go_join').click(e=>{
         			e.preventDefault()
         			join()
         		})
         	})
     		.fail(()=>{alert(WHEN_ERR)})
         	
           }
	 let setContentView =()=>{
		login()
	 }
	 
	 
	 let join=()=>{
		 $('head').html(auth_vue.join_head())
         $('body').html(auth_vue.join_body())
         $('<button>',{
                text: '회원가입 완료하기',
                href: '#',
                click: e=>{
                   e.preventDefault();
                  let data = {uId : $('#uId').val(), uPw : $('#uPw').val()}
                  $.ajax({
                     url : _+'/user/join',
                     type : 'POST',
                     dataType : 'json',
                     data : JSON.stringify(data),
                     contentType : 'application/json',
                     success : d => {
                        alert('ajax 성공 아이디: '+d.uId+', 성공비번: '+d.uPw)
                        login()
                        
                     },
                     error : e => {
                        alert('ajax 실패')
                     }
                  })
                }
             })
             .addClass('btn btn-primary btn-lg btn-block')
             .appendTo('#btn_join')     

	 }
	 
	 
	 let login=()=>{
		 let x = {css:$.css(), img: $.img()}
         $('head').html(auth_vue.login_head(x))
         $('body')
         .addClass('text-center')
         .html(auth_vue.login_body(x))
		  $('<button>',{
              type : "submit",
              text : "login",
              click : e=>{
                 e.preventDefault()
                 alert('로그인 ');
                 let data = {uId : $('#uId').val(), uPw : $('#uPw').val()}
                 $.ajax({
                    url : _+'/user/login',
                    type : 'POST',
                    dataType : 'json',
                    data : JSON.stringify(data),
                    contentType : 'application/json',
                    success : d =>{
                       alert('로그인 성공!!')
                    }
                 })
                 
              }
           }).addClass("btn btn-primary btn-lg btn-block")
           .appendTo('#btn_login')
         }
	 
           return{onCreate, join, login}
        })();

