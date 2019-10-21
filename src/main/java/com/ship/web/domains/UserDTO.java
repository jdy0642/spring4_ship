package com.ship.web.domains;
import java.io.Serializable;
import org.springframework.stereotype.Component;
import lombok.Data;
@Data @Component
public class UserDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private String uid, uname, upw, age, gender, loc, tel, email, 
	upoint, score, mvp, win, hitmap, km, heart, author, lolname;
}
