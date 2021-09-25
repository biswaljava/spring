package com.biswaljava.spring.example1.dataservice.api;

import java.util.List;

public interface TodoDataService {
	List<String> retrieveTodos(String user);
}
