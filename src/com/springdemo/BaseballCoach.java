package com.springdemo;

public class BaseballCoach implements Coach {

    //definindo o private field para dependencia
    private FortuneService fortuneService;

    //definindo o constructor para a injecao da dependencia
    public BaseballCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
