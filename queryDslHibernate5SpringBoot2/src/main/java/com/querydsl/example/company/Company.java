package com.querydsl.example.company;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.querydsl.example.employee.Employee;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Builder @Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class Company {
	
	@Id
	private Long id;
	
	private String name;
	
	@OneToMany(mappedBy = "company")
	private List<Employee> employees;

}
