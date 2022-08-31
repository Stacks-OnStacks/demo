package com.revature.spring_intro;

import com.revature.spring_intro.models.BaseballCoach;
import com.revature.spring_intro.models.TrackCoach;
import com.revature.spring_intro.services.MotivationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.revature") // this scans the entire directory structure below for ANY stereotypical annotations for components
@PropertySource("app.properties")
public class AppConfig {

}
