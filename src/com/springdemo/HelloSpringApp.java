package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {

        //carregar o arquivo de configuracao
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retirar o objeto(bean) do Spring Container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        //chamar os metodos no objeto(bean)
        System.out.println(theCoach.getDailyWorkout());

        //fechar o contexto aberto
        context.close();
    }
}
