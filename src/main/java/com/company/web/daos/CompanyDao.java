package com.company.web.daos;

import java.util.List;

import com.company.web.domains.CompanyBean;

public interface CompanyDao {
	public boolean insertEmp(CompanyBean param);
	public CompanyBean selectByEmpnoEname(CompanyBean param);
	public List<CompanyBean> findByTable(CompanyBean param);
}
