package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args){

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        CricketCoach cricketCoach = context.getBean("myCricketCoach" , CricketCoach.class);

        System.out.println(cricketCoach.getWorkoutDaily());

        System.out.println(cricketCoach.getFortune());

        System.out.println(cricketCoach.getTeam());

        System.out.println(cricketCoach.getEmail());

        context.close();
    }
}
