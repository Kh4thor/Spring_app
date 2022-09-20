package ru.Egor.Malyshev;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext (
				"applicationContext.xml");

		Computer cpu = context.getBean("computer", Computer.class);
		System.out.println(cpu);
	}
		
}
