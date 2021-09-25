package com.biswaljava.springmvc.web.util;

import java.beans.PropertyEditorSupport;

import com.biswaljava.domain.Priority;

public class TodoPriorityPropertyEditor extends PropertyEditorSupport {

	@Override
	public String getAsText() {
		Priority value = (Priority) getValue();
		return value.toString();
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		setValue(Priority.valueOf(text));
	}
}
