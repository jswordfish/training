package com.training.project.services;

import com.training.project.data.Company;

public interface CompanyService {
	
	public void saveOrUpdate(Company company);
	
	public Company findByPrimaryKey(String companyName, String companyId);
	
	public Company findByCompanyName(String companyName);
	
	public Company findByCompanyId(String companyId);

}
