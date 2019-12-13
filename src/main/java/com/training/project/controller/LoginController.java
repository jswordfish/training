package com.training.project.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.java8.Employee;
import com.training.project.common.ProjectException;
import com.training.project.data.Company;
import com.training.project.dto.Login;


@Controller
public class LoginController {
	
	private final String prefixURL = "views";

  @RequestMapping(value = "/login", method = RequestMethod.GET)
  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView mav = new ModelAndView("login");
    mav.addObject("login", new Login());
    return mav;
  }
  
  @RequestMapping(value = "/exceptionhandling", method = RequestMethod.GET)
  public ModelAndView exceptionhandling(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView mav = new ModelAndView("error");
    mav.addObject("login", new Login());
    	if(true){
    		throw new ProjectException("System is down as of now! Try later!");
    	}
    return mav;
  }
  
  
  @RequestMapping(value = "/showtable", method = RequestMethod.GET)
  public ModelAndView showtable(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView mav = new ModelAndView("show_table");
   List<Employee> emps = new ArrayList<Employee>();
   Employee employee1 = new Employee("Jatin", "Director", 10000l);
   Employee employee2 = new Employee("Amit", "Director", 10000l);
   Employee employee3 = new Employee("Afzal", "Developer", 10000l);
   Employee employee4 = new Employee("Suresh", "Admin", 20000l);
   emps.add(employee1);
   emps.add(employee2);
   emps.add(employee3);
   emps.add(employee4);
   mav.addObject("list", emps);
    return mav;
  }
  
  
  @ExceptionHandler(ProjectException.class)
  public ModelAndView handleException(ProjectException ex)
  {
      //Do something additional if required
      ModelAndView modelAndView = new ModelAndView();
      modelAndView.setViewName("general_error");
      modelAndView.addObject("message", ex.getMessage());
      return modelAndView;
  }
  
  
  
  
  
  @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
  @ModelAttribute("login") Login login) {
    ModelAndView mav = null;
    //User user = userService.validateUser(login);
    if (login.getUsername().equalsIgnoreCase("john.doe") && login.getPassword().equalsIgnoreCase("secret")) {
    	String url = "dashboard";
    mav = new ModelAndView(url);
    mav.addObject("firstname", "John");
    } else {
    	String url = "error";
    mav = new ModelAndView(url);
    mav.addObject("message", "Username or Password is wrong!!");
    }
    return mav;
  }
}