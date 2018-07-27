package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		Coach tennisCoach = context.getBean("swimCoach", Coach.class);
		
		System.out.println(tennisCoach.getDailyWorkout());
		
		System.out.println(tennisCoach.getDailyfortune());
		context.close();
	}

}