package com.biswaljava.spring.example1.dataservice.stub;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.biswaljava.spring.example1.dataservice.api.TodoDataService;

@Component
class TodoDataServiceStub implements TodoDataService {
	public List<String> retrieveTodos(String user) {
		return Arrays.asList("Learn Spring", "Learn Struts", "Learn to Dance");
	}
}
