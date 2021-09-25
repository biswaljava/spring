package com.biswaljava.example.layering.data.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.biswaljava.example.layering.data.api.TodoDataService;
import com.biswaljava.example.layering.data.database.Database;
import com.biswaljava.example.layering.model.api.client.Todo;

@Component
public class TodoDataServiceRealImpl implements TodoDataService {

	@Autowired
	private Database database;

	@Override
	public List<Todo> retrieveTodos(String userName) {
		return database.retrieveTodos(userName);
	}
}
