package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

    public static void main(String[] args) {
        //carregar o arquivo de configuracao
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //retirar o objeto(bean) do Spring Container
        BasketballCoach theCoach = context.getBean("myBasketballCoach", BasketballCoach.class);
        //chamar os metodos no objeto(bean)
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        //valores passados no applicationcontext (literal values)
        System.out.println(theCoach.getEmailAdress());
        System.out.println(theCoach.getTeam());
        //fechar o contexto aberto
        context.close();
    }
}
