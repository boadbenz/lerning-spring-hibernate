package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getWorkoutDaily() {
        return "spend 30 minute";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}
