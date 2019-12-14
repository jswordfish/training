package com.training.project.services;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.training.project.data.Company;

public class TestUtil {

	
	@Test
	public void testCreateJson() throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		Company company = new Company();
		company.setCompanyId("Abm");
		company.setCompanyName("Abmware");
		company.setCompanyLocation("aaabbbaaqqqqqqqqqqq");
		company.setCompanyDescription("nananachange");
		company.setSinglePointOfContactEmail("aacontact@thev2technologies.com");
		String str = mapper.writeValueAsString(company);
		System.out.println(str);

	}
}
