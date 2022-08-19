package com.revature.spring_intro;

import com.revature.spring_intro.models.BaseballCoach;
import com.revature.spring_intro.models.TrackCoach;
import com.revature.spring_intro.services.MotivationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.revature") // this scans the entire directory structure below for ANY stereotypical annotations for components
public class AppConfig {
    // wiring beans together manually
//    @Bean
//    public MotivationService motivationService(){
//        return new MotivationService();
//    }
//
//    @Bean("baseballCoach")
//    public BaseballCoach baseballCoach(){
//        return new BaseballCoach(motivationService());
//    }
//
//    @Bean("trackCoach")
//    public TrackCoach trackCoach(){
//        return new TrackCoach(motivationService());
//    }
}
