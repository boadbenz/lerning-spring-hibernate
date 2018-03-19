package com.luv2code.springdemo;

public class TrackingCoach implements Coach {

    private FortuneService fortuneService;

    public TrackingCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getWorkoutDaily() {
        return "Run 5k";
    }

    @Override
    public String getFortune() {
        return "Today is " + fortuneService.getFortune();
    }

    public void  doMyStartupStuff(){
        System.out.println("TrackCoach: inside method doMyStartupStuff");
    }

    public void doMyCleanupStuffYoYo(){
        System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo");
    }
}
