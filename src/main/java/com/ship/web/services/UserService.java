package com.ship.web.services;
import java.util.List;
import org.springframework.stereotype.Component;
import com.ship.web.domains.UserDTO;
@Component
public interface UserService {

	public void join(UserDTO param);
	public UserDTO login(UserDTO param);
	public List<UserDTO> search(UserDTO param);
	public int countUser();
}
