package com.luv2code.springboot.thymeleafdemo.service;

import java.util.List;

import com.luv2code.springboot.thymeleafdemo.entity.Company;


public interface CompanyService {
	public List<Company> findAll();

	public Company findById(int cid);

	public void save(Company theCompany);

	public void deleteById(int cid);
}
