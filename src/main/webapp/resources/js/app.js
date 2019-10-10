var app = (()=>{
	return {
		init : (ctx)=>{
			empService.login(ctx);
			empService.join(ctx);
			empService.move_join(ctx);
			
		}
	};
})();
var empService = (()=>{
	return {
		login: (ctx)=>{
			$('#login_btn').click(()=>{
				if($('#login_userdept').val()==='' || 
						$('#login_username').val()===''|| 
						 	$('#login_userpass').val()==='' ){
					alert('필수값이 없습니다.');
				}else{
					alert('입력한 아이디 값: '+$('#login_username').val());
					$('#login_form').attr('action', '/jee-company/company.do' );
					$('#login_form').submit();	
				}
				
			});
		},
		join: (ctx)=>{
			$('#join_form_button').click(()=>{
		            if($('#join_username').val()==='' ||
		                  $('#join_userpass').val()===''){
		               alert('필수값이 없습니다.');
		            }else{
		               alert('입력한 아이디 값: '+$('#join_username').val());
		               $('#join_form').attr('action', ctx+'/company.do');
		               $('#join_form').attr('method','POST')
		               $('#join_form').submit();
		            }
			});
		},
		move_join: (ctx)=>{
		$('#a_join').click(()=>{
			alert('회원가입 이동');
			location.assign(ctx+'/facade.do?action=move&page=join');
		});
		}
		};
})();