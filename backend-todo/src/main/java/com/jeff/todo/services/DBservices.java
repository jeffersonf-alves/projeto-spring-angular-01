package com.jeff.todo.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeff.todo.domain.Todo;
import com.jeff.todo.repositories.TodoRepository;

@Service
public class DBservices {
	
	
	@Autowired
	private TodoRepository todoRepository;
	
	public void instanciaBaseDeDados() {
		
		
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		Todo t1 = new Todo(null, "Estudar", "Estudar spring boot 2", LocalDateTime.parse("25/03/2022 22:00", formatter) , false);
		
		todoRepository.saveAll(Arrays.asList(t1));
	}
	
}
