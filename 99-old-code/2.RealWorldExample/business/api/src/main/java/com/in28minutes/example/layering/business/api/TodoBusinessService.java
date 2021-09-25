package com.biswaljava.example.layering.business.api;

import java.util.List;

import com.biswaljava.example.layering.model.api.client.Todo;

public interface TodoBusinessService {
	List<Todo> retrieveTodosRelatedToSpring(String user);
}
