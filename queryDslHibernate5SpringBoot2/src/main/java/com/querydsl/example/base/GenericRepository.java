package com.querydsl.example.base;

import org.springframework.beans.factory.annotation.Autowired;

import com.holonplatform.datastore.jpa.JpaDatastore;
import com.holonplatform.datastore.jpa.querydsl.JpaQuery;
import com.holonplatform.datastore.jpa.querydsl.QueryDsl;

public class GenericRepository {
	
	@Autowired
	private JpaDatastore jpaDatastore;
	
	protected JpaQuery<?> query() {
		QueryDsl queryDslCommodity = jpaDatastore.create(QueryDsl.class);
		JpaQuery<?> query = queryDslCommodity.query();

		return query; 
	}

}
