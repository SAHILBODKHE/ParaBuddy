package com.luv2code.springboot.thymeleafdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.springboot.thymeleafdemo.dao.CompanyRepository;
import com.luv2code.springboot.thymeleafdemo.entity.Company;
import com.luv2code.springboot.thymeleafdemo.entity.Employee;
import com.luv2code.springboot.thymeleafdemo.service.CompanyService;

@Controller
@RequestMapping("/company")
public class CompanyController {
@Autowired
private CompanyService creCompanyService;

	public CompanyController(CompanyService theCompanyService ) {
		creCompanyService=theCompanyService;
	}
	

	@GetMapping("/showAll")
	public String listCompanies(Model theModel) {
		List <Company> theCompanies=creCompanyService.findAll();
		theModel.addAttribute("companies",theCompanies);
		System.out.println(theCompanies);
		return "companies/hellocompany";
		
	}
}
