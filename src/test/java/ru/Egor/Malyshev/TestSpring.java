package ru.Egor.Malyshev;

import org.springframework.boot.SpringApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSpring {
@SuppressWarnings("resource")
public static void main(String[] args) throws Exception {
	SpringApplication.run(TestSpring.class, args);
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
			"applicationContext.xml");
	TestBean testBean = context.getBean("testBean", TestBean.class);
	System.out.println(testBean.getName());

}
	
}
