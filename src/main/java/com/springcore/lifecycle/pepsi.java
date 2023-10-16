package com.springcore.lifecycle;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class pepsi implements InitializingBean , DisposableBean {
    public double price;


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void afterPropertiesSet() throws Exception {
        // initialize methods
        System.out.println("taking pepsi : initial");
    }

    public void destroy() throws Exception {
        System.out.println("Going to put pepsi in to dustbin ");
    }
    @Override
    public String toString() {
        return "pepsi [" +
                "price=" + price +
                ']';
    }
}
