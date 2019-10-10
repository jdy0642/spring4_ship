package com.company.web.domains;
import java.io.Serializable;

import lombok.Data;
@Data
public class CompanyBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private String empno, ename, job, 
	mgr, hireDate, sal, comm, deptno, dname, loc;
}
