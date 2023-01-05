package com.springdemo;

public class TrackCoach implements Coach {
    //definindo o private field para dependencia
    private FortuneService fortuneService;

    //correcao do MyApp (ainda nao explicado)
    public TrackCoach() {
    }

    //definindo o constructor para a injecao da dependencia
    public TrackCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It: " + fortuneService.getFortune();
    }
}
