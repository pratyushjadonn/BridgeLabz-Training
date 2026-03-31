package com.bridgelabz.employeewage.repository;

import com.bridgelabz.employeewage.model.CompanyEmpWage;
import java.util.ArrayList;
import java.util.List;

public class CompanyEmpWageRepository implements ICompanyEmpWageRepository {

	private List<CompanyEmpWage> companyList = new ArrayList<>();

	@Override
	public void save(CompanyEmpWage company) {
		companyList.add(company);
	}

	@Override
	public List<CompanyEmpWage> findAll() {
		return companyList;
	}

	@Override
	public CompanyEmpWage findByCompanyName(String companyName) {

		for (CompanyEmpWage company : companyList) {
			if (company.getCompanyName().equalsIgnoreCase(companyName)) {
				return company;
			}
		}
		return null;
	}
}
