package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refConfig.xml");
		A temp  = (A)context.getBean("aref");
		System.out.println(temp.getX());
		System.out.println(temp.getObj().getY());
		System.out.println(temp);
		System.out.println("This is the main things of the solution");
		System.out.println("MAIN THIS SOLn");
		((AbstractApplicationContext) context).close();
	}

}
