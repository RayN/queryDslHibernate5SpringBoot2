package com.querydsl.example.company;

import java.util.List;

public interface CompanyRepositoryCustom {

	public List<Company> findByName(String name);
	
}
