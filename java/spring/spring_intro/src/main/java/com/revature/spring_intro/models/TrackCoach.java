package com.revature.spring_intro.models;

import com.revature.spring_intro.services.MotivationService;

public class TrackCoach implements Coachable{

    private final MotivationService motivationService;

    public TrackCoach(MotivationService motivationService) {
        this.motivationService = motivationService;
    }

    @Override
    public String getDailyWorkout() {
        // TODO Auto-generated method stub
        return "Today's workout is to run a 30-min 5K";
    }

    @Override
    public String getMotivation() {
        // TODO Auto-generated method stub
        return "Track coach says" + motivationService.provideMotivationalQuote();
    }
}
