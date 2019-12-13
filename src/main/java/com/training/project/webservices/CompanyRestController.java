package com.training.project.webservices;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.training.project.data.Company;
import com.training.project.repositories.CompanyRepository;

@Controller
public class CompanyRestController {
	@Autowired
	CompanyRepository compRep;
	
	@RequestMapping(value = "/companiesData", method = RequestMethod.GET, produces = "application/json")
	 public @ResponseBody List<Company>  companiesData( HttpServletRequest request, HttpServletResponse response) {
		return compRep.findAll();
		
	}

}
