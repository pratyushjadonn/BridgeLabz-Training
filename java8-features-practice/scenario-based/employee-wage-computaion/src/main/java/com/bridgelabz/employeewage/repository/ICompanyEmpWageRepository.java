package com.bridgelabz.employeewage.repository;

import com.bridgelabz.employeewage.model.CompanyEmpWage;
import java.util.List;

public interface ICompanyEmpWageRepository {

	void save(CompanyEmpWage company);

	List<CompanyEmpWage> findAll();

	CompanyEmpWage findByCompanyName(String companyName);

}
