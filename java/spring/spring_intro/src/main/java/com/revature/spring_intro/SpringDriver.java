package com.revature.spring_intro;

import com.revature.spring_intro.models.BaseballCoach;
import com.revature.spring_intro.models.FootballCoach;
import com.revature.spring_intro.models.TrackCoach;
import com.revature.spring_intro.services.MotivationService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDriver {

    public static void main(String[] args) {

        try(AnnotationConfigApplicationContext beanContainer = new AnnotationConfigApplicationContext(AppConfig.class)) {

            System.out.println("Bean container created.....");

            TrackCoach trackCoach = beanContainer.getBean("trackCoach", TrackCoach.class);
            BaseballCoach baseballCoach = beanContainer.getBean("baseballCoach", BaseballCoach.class);
            FootballCoach footballCoach = beanContainer.getBean("footballCoach", FootballCoach.class);

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

            System.out.println("***Begin look at our information in memory: Football(tbd)****");
            System.out.println();

            System.out.println(footballCoach);
            System.out.println("Heyy look here ist he motivation before .getMotivation()" + footballCoach.getMotivationService());
            System.out.println(footballCoach.getMotivation());
            System.out.println(footballCoach.getDailyWorkout());
            System.out.println("Team name: " + footballCoach.getTeamName());
            System.out.println("Email: " + footballCoach.getEmail());

            System.out.println("********************************************************");
            System.out.println();

        } catch (Exception e){
            e.printStackTrace();
        }

    }

}
