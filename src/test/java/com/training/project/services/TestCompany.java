package com.training.project.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.training.project.data.Company;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:appContext.xml"})
@Transactional
public class TestCompany {
	@Autowired
	CompanyService companyService;
	
	@Test
	@Rollback(value=false)
	public void testCreateCompany() {
		Company company = new Company();
		company.setCompanyId("Abm");
		company.setCompanyName("Abmware");
		company.setCompanyLocation("aaa");
		company.setCompanyDescription("nanana");
		company.setSinglePointOfContactEmail("contact@thev2technologies.com");
		companyService.saveOrUpdate(company);
	}
	

}
