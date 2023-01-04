package com.springdemo;

public class BasketballCoach implements Coach {
    private FortuneService fortuneService;

    //defininindo um constructor vazio
    public BasketballCoach() {
        System.out.println("BasketballCoach: Dentro do constructor vazio");
    }
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("BasketballCoach: Dentro do metodo setter - setFortuneService");
        this.fortuneService = fortuneService;
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
