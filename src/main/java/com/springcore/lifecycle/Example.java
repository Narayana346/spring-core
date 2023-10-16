package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
    @Override
	public String toString() {
		return "Example [subject = " + subject + "]";
	}

	private String subject;

    public Example() {
        super();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    @PostConstruct
    public void start(){
        System.out.println("Starting Example");
    }
    @PreDestroy
    public void stop(){
        System.out.println("Stopping Example");
    }
}
