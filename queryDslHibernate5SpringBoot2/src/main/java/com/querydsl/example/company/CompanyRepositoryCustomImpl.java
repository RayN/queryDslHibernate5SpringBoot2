package com.querydsl.example.company;

import java.util.List;

import com.querydsl.example.base.GenericRepository;
import com.querydsl.example.employee.QEmployee;

public class CompanyRepositoryCustomImpl extends GenericRepository implements CompanyRepositoryCustom  {

	QCompany qCompany = QCompany.company;
	QEmployee qEmployee = QEmployee.employee;
	
	@Override
	public List<Company> findByName(String name) {
		return query().
				select(qCompany)
				.from(qCompany)
				.innerJoin(qCompany.employees).fetchJoin()
				.where(qCompany.name.like("%" + name + "%"))
				.fetch();
		
	}

}
