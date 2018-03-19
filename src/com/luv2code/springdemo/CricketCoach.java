package com.luv2code.springdemo;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String team;
    private String email;

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("This is in : CricketCoach setTeam");
        this.team = team;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        System.out.println("This is in : CricketCoach setEmail");
        this.email = email;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("This is in : CricketCoach setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getWorkoutDaily() {
        return "Spend Bowling 50 minutes";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}
