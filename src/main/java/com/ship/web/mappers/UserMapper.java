package com.ship.web.mappers;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.ship.web.domains.UserDTO;
@Repository
public interface UserMapper {
	public int countUser();
	public boolean insertEmp(UserDTO param);
	public UserDTO selectByEmpnoEname(UserDTO param);
	public List<UserDTO> findByTable(UserDTO param);
}
