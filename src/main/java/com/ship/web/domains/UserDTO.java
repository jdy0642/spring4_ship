package com.ship.web.domains;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import lombok.Data;
@Data @Component
public class UserDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private String uId, uName, uPw, age, gender, loc, tel, email, 
	uPoint, score, mvp, win, hitmap, km, heart, author, lolName;
}
