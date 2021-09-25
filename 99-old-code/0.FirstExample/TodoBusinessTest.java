package com.biswaljava.spring.example1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@Configuration
@ComponentScan(basePackages = { "com.biswaljava" })
class SpringContext {
}

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringContext.class)
public class TodoBusinessTest {
	@Test
	public void testGetTodosAboutSpring() {
	}
}