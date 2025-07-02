package com.sugan.setter;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class EmpMain {

	public static void main(String[] args) {
		//create the IOCContainer
		ApplicationContext context = new  AnnotationConfigApplicationContext("com.sugan");
		//get all the beans 
		Arrays.stream(context.getBeanDefinitionNames()).forEach(n->System.out.println(n));
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee);
	}

}
