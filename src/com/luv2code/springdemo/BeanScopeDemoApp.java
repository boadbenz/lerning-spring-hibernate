package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args){

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        Coach theCoach = context.getBean("myCoach" , Coach.class);

        Coach myCoach = context.getBean("myCoach" , Coach.class);

        boolean isSameBeans = (theCoach == myCoach);

        System.out.println("is same beans : " + isSameBeans);

        System.out.println("position bean theCoach : " + theCoach);

        System.out.println("position bean myCoach : " + myCoach);

        context.close();
    }
}
