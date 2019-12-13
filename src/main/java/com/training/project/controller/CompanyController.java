package com.training.project.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.project.data.Company;
import com.training.project.repositories.CompanyRepository;
import com.training.project.services.CompanyService;
@Controller
public class CompanyController {
	
	@Autowired
	CompanyService companyService;
	
	@Autowired
	CompanyRepository companyRep;
	
	@RequestMapping(value = "/company", method = RequestMethod.GET)
	  public ModelAndView company(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("company");
	   Company company = new Company();
	   mav.addObject("company", company);
	    return mav;
	  }
	
	@RequestMapping(value = "/companies", method = RequestMethod.GET)
	  public ModelAndView companies(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("companies");
	  List<Company> companies = companyRep.findAll();
	   mav.addObject("companies", companies);
	    return mav;
	  }
	
	
	@RequestMapping(value = "/saveCompany", method = RequestMethod.POST)
	public ModelAndView saveCompany(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("company") Company company) throws Exception {
		
		companyService.saveOrUpdate(company);
		return companies(request, response);
		
	}
	

}
