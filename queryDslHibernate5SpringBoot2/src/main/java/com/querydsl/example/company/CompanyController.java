package com.querydsl.example.company;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/companies")
public class CompanyController {

	@Autowired
	CompanyService companyService;
	
	@GetMapping
	public List<Company> listAll() {
		return companyService.findAll();
	}
	
	@GetMapping("/name/{name}")
	public List<Company> findByName(@PathVariable String name) {
		return companyService.findByName(name);
	}
	
}
