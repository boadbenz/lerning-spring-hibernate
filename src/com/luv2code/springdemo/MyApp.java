package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args){
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = ctx.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getWorkoutDaily());

        System.out.println(theCoach.getFortune());
    }
}
