package com.querydsl.example;

import javax.persistence.EntityManagerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.holonplatform.datastore.jpa.JpaDatastore;

@SpringBootApplication
public class QueryDslHibernate5SpringBoot2Application {

	public static void main(String[] args) {
		SpringApplication.run(QueryDslHibernate5SpringBoot2Application.class, args);
	}
	
	@Bean
	public JpaDatastore jpaDatastore(EntityManagerFactory entityManagerFactory) {
		return JpaDatastore.builder()
						.entityManagerFactory(entityManagerFactory)
						.build();
	}

}
