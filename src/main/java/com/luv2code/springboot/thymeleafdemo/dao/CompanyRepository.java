package com.luv2code.springboot.thymeleafdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.springboot.thymeleafdemo.entity.Company;

public interface CompanyRepository extends JpaRepository<Company,Integer> {

//	public List<Company> findAllByOrderByCnameAsc();

}
