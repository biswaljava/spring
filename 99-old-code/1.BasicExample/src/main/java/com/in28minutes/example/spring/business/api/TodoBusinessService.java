package com.biswaljava.example.spring.business.api;

import java.util.List;

import com.biswaljava.example.spring.model.Todo;

public interface TodoBusinessService {
	List<Todo> retrieveTodosForNextWeek(String user);
}
