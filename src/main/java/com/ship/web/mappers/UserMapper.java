package com.ship.web.mappers;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.ship.web.domains.UserDTO;
@Repository
public interface UserMapper {
	public int getUser();
	public void insertUser(UserDTO param);
	public UserDTO selectByEmpnoEname(UserDTO param);
	public List<UserDTO> findByTable(UserDTO param);
	public UserDTO selectUserById(UserDTO param);
}
