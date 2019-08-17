package com.querydsl.example.employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.querydsl.example.company.Company;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Builder @Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class Employee {
	
	@Id
	private Long id;
	
	private String name;
	
	@Column(name =  "last_name")
	private String lastName;
	
	@ManyToOne
	@JsonIgnore
	private Company company;

}
