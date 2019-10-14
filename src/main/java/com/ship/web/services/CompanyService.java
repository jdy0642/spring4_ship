package com.ship.web.services;
import java.util.List;
import org.springframework.stereotype.Component;
import com.ship.web.domains.CompanyDTO;
@Component
public interface CompanyService {

	public boolean join(CompanyDTO param);
	public CompanyDTO login(CompanyDTO param);
	public List<CompanyDTO> search(CompanyDTO param);
}
