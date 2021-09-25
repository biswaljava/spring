package com.biswaljava.example.spring.data.api;

import java.util.List;

import com.biswaljava.example.spring.model.Todo;

public interface TodoDataService {
	List<Todo> retrieveTodos(String userName);
}
