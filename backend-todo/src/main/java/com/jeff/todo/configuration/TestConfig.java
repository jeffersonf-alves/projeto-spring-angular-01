package com.jeff.todo.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.jeff.todo.services.DBservices;

@Configuration
@Profile("test")
public class TestConfig {

	@Autowired
	private DBservices dbservice;
	
	@Bean
	public boolean instancia() {
		this.dbservice.instanciaBaseDeDados();
		return true;
	}
	
	
	
}
