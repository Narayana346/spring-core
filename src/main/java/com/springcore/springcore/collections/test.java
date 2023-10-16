package com.springcore.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springcore/collections/collection.xml");
		
		Emp emp1 = (Emp)context.getBean("emp1");
		System.out.println(emp1);
		((AbstractApplicationContext) context).close();
	}

}
