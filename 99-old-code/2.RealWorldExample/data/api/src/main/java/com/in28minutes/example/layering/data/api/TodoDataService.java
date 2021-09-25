package com.biswaljava.example.layering.data.api;

import java.util.List;

import com.biswaljava.example.layering.model.api.client.Todo;

public interface TodoDataService {
	List<Todo> retrieveTodos(String userName);
}
