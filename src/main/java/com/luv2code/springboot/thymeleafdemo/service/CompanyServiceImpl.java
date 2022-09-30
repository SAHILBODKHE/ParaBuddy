package com.luv2code.springboot.thymeleafdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luv2code.springboot.thymeleafdemo.dao.CompanyRepository;
import com.luv2code.springboot.thymeleafdemo.entity.Company;
@Service
public class CompanyServiceImpl implements CompanyService  {

@Autowired
private CompanyRepository theRepository;

public CompanyServiceImpl(CompanyRepository theCompanyRepository) {
	theRepository=theCompanyRepository;
}
	@Override
	public List<Company> findAll() {
		return theRepository.findAll();
	}

	@Override
	public Company findById(int cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Company theCompany) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(int cid) {
		// TODO Auto-generated method stub

	}

}
