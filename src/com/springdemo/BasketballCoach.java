package com.springdemo;

public class BasketballCoach implements Coach {
    private FortuneService fortuneService;

    private String emailAdress;
    private String team;

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        System.out.println("BasketballCoach: Dentro do metodo setter - setEmailAdress");
        this.emailAdress = emailAdress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("BasketballCoach: Dentro do metodo setter - setTeam");
        this.team = team;
    }

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
