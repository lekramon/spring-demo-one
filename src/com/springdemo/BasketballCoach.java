package com.springdemo;

public class BasketballCoach implements Coach {

    //definindo o private field para dependencia
    private FortuneService fortuneService;

    //definindo o constructor para a injecao da dependencia
    public BasketballCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Try to shoot mid-range";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
