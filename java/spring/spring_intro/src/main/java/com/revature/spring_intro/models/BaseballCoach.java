package com.revature.spring_intro.models;

import com.revature.spring_intro.services.MotivationService;

public class BaseballCoach implements Coachable{

    private final MotivationService motivationService;

    public BaseballCoach(MotivationService motivationService) {
        System.out.println("BaseballCoach<init>");
        this.motivationService = motivationService;
    }

    @Override
    public String getDailyWorkout() {
        return "Today's workout is to spend an hour on batting practice";
    }

    @Override
    public String getMotivation() {
        return "baseball coach says " + motivationService.provideMotivationalQuote();
    }

}
