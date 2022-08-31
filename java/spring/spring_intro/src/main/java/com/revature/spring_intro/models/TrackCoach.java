package com.revature.spring_intro.models;

import com.revature.spring_intro.services.MotivationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("trackCoach") // the content inside () is redundant as it takes the class name and marks the bean's id as trackCoach regardless
public class TrackCoach implements Coachable{

    private final MotivationService motivationService;

    @Autowired // by default adding the @Component annotation adds this to the constructor
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
        return "Track coach says " + motivationService.provideMotivationalQuote();
    }
}
