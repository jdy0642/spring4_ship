package com.company.web.services;

import java.util.List;

import com.company.web.domains.CompanyBean;

public interface CompanyService {

	public boolean join(CompanyBean param);
	public CompanyBean login(CompanyBean param);
	public List<CompanyBean> search(CompanyBean param);
}
