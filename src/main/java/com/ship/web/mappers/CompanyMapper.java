package com.ship.web.mappers;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.ship.web.domains.CompanyDTO;
@Repository
public interface CompanyMapper {
	public boolean insertEmp(CompanyDTO param);
	public CompanyDTO selectByEmpnoEname(CompanyDTO param);
	public List<CompanyDTO> findByTable(CompanyDTO param);
}
