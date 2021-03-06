package com.training.project.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.training.project.data.Company;
import com.training.project.data.CompanyType;
import com.training.project.repositories.CompanyRepository;
import com.training.project.services.CompanyService;
@Controller
public class CompanyController {
	
	@Autowired
	CompanyService companyService;
	
	@Autowired
	CompanyRepository companyRep;
	
	@RequestMapping(value = "/company", method = RequestMethod.GET)
	  public ModelAndView company(@RequestParam(name= "cid", required = false) Long cid, HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("company");
	    Company company = null;
	    if(cid != null){
	    	company = companyRep.findById(cid).get();
	    }
	    else{
	    	company = new Company();
	    }
	    List<String> types = new ArrayList<String>();
	    for(CompanyType companyType : CompanyType.values()){
	    	types.add(companyType.name());
	    }
	   mav.addObject("companyTypes", types);
	   mav.addObject("company", company);
	    return mav;
	  }
	
	//deletecompany
	@RequestMapping(value = "/deletecompany", method = RequestMethod.GET)
	  public ModelAndView deletecompany(@RequestParam(name= "cid", required = true) Long cid,HttpServletRequest request, HttpServletResponse response) {
	   companyRep.deleteById(cid);
	    return companies(request, response);
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
