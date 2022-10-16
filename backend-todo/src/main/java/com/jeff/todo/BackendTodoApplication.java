package com.jeff.todo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.jeff.todo.domain.Todo;
import com.jeff.todo.repositories.TodoRepository;

@SpringBootApplication
public class BackendTodoApplication implements CommandLineRunner {

	@Autowired
	private TodoRepository todoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(BackendTodoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		Todo t1 = new Todo(null, "Estudar", "Estudar spring boot 2", LocalDateTime.parse("25/03/2022 22:00", formatter) , false);
		
		todoRepository.saveAll(Arrays.asList(t1));
		
	}

}
