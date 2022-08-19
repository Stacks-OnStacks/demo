package com.revature.spring_intro;

import com.revature.spring_intro.models.BaseballCoach;
import com.revature.spring_intro.models.FootballCoach;
import com.revature.spring_intro.models.TrackCoach;
import com.revature.spring_intro.services.MotivationService;

public class SpringDriver {

    public static void main(String[] args) {

        MotivationService motivationService = new MotivationService();

        //
        TrackCoach trackCoach = new TrackCoach(motivationService);
        BaseballCoach baseballCoach = new BaseballCoach(motivationService);

        // Construct a new football coach and set the service made above
        FootballCoach footballCoach = new FootballCoach();
        footballCoach.setMotivationService(motivationService);


        // can now run the commands for each coach
        System.out.println("***Begin look at our information in memory: Track****");
        System.out.println();

        System.out.println(trackCoach);
        System.out.println(trackCoach.getMotivation());
        System.out.println(trackCoach.getDailyWorkout());

        System.out.println("********************************************************");
        System.out.println();

        System.out.println("***Begin look at our information in memory: Baseball****");
        System.out.println();

        System.out.println(baseballCoach);
        System.out.println(baseballCoach.getMotivation());
        System.out.println(baseballCoach.getDailyWorkout());
        System.out.println("********************************************************");
        System.out.println();

        System.out.println("***Begin look at our information in memory: Football****");
        System.out.println();

        System.out.println(footballCoach);
        System.out.println(footballCoach.getMotivation());
        System.out.println(footballCoach.getDailyWorkout());
        System.out.println("Team name: " + footballCoach.getTeamName());
        System.out.println("Email: " + footballCoach.getEmail());

        System.out.println("********************************************************");
        System.out.println();



    }

}
