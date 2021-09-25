package com.biswaljava.web.common.tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import com.biswaljava.web.common.util.TodoListUtils;

import java.io.IOException;



public class StatusStyleTag extends SimpleTagSupport {

	
	private boolean status;

	@Override
	public void doTag() throws JspException, IOException {

		JspWriter out = getJspContext().getOut();
		String statusStyle = TodoListUtils.getStatusStyle(status);
		out.print(statusStyle);

	}

	

	public void setStatus(boolean status) {
		this.status = status;
	}

}
