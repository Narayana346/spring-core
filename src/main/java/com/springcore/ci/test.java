package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ci/CI_config.xml");
			Persion p  =(Persion)context.getBean("persion"); 
			System.out.println(p);
			Addition add = (Addition)context.getBean("add");
			add.doSum();
			((AbstractApplicationContext) context).close();
	}

}
