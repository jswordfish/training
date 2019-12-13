package com.training.project.services;

import org.apache.log4j.spi.LoggerFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.training.project.data.Company;
import com.training.project.interceptors.TempService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:appContext.xml"})
@Transactional
public class TestCompany {
	@Autowired
	CompanyService companyService;
	
	Logger logger = org.slf4j.LoggerFactory.getLogger(TestCompany.class);
	
	
	@Test
	@Rollback(value=false)
	public void testCreateCompany() {
		logger.info("Helloe world111111111");
		logger.debug("Helloeqqq world1111111111111111111111");
		Company company = new Company();
		company.setCompanyId("Abm");
		company.setCompanyName("Abmware");
		company.setCompanyLocation("aaabbbaaqqqqqqqqqqq");
		company.setCompanyDescription("nananachange");
		company.setSinglePointOfContactEmail("aacontact@thev2technologies.com");
		companyService.saveOrUpdate(company);
	}
	
	
	

}
