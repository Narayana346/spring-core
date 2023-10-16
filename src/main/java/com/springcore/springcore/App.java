package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class App 
{
    public static void main( String[] args )
    {
System.out.println("My app");
        
        // Load the Spring configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springcore/config.xml");

        // Retrieve the "student1" bean from the context
        Student st1 = (Student) context.getBean("student1");
        Student st2 = (Student) context.getBean("student2");
        Student st3 = (Student) context.getBean("student3");

        // Print the information of the "student1" bean
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        ((AbstractApplicationContext) context).close();
    	
    }
}
