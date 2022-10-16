package com.jeff.todo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jeff.todo.domain.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer>{

	
	
}
