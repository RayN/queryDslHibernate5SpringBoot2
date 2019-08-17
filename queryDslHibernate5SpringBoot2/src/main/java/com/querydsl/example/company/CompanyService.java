package com.querydsl.example.company;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {
	
	@Autowired
	CompanyRepository companyRepository;
	
	public List<Company> findAll(){
		return companyRepository.findAll();
	}

	public List<Company> findByName(String name) {
		return companyRepository.findByName(name);
	}
	
}

