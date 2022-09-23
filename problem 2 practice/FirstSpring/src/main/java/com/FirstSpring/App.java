package com.FirstSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        //ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
        
    	ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
        Car c=(Car) ctx.getBean("car");
        c.drive();
        c.setCarname("BMW");
        System.out.println(c.getCarname());
    }
}
