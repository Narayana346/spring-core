package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
        context.registerShutdownHook();
        // xml configured
        Samosa s1 = (Samosa) context.getBean("s1");
        System.out.println(s1);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        // interface configuration
        pepsi p1 = (pepsi) context.getBean("pep1");
        System.out.println(p1);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        // annotation configuration
        Example example = (Example) context.getBean("example");
        System.out.println(example);
        ((AbstractApplicationContext) context).close();
    }

}
