package com.biswaljava.service.api;

import com.biswaljava.domain.TodoItem;
import com.biswaljava.domain.TodoItemList;

public interface TodoService {

	TodoItem getTodoById(final long id);

	TodoItemList getTodoListByUser(final long userId);

	TodoItemList searchTodoListByTitle(final long userId, final String title);

	TodoItem update(TodoItem todoItem);

	TodoItem create(final TodoItem todoItem);

	void remove(final TodoItem todoItem);

}
