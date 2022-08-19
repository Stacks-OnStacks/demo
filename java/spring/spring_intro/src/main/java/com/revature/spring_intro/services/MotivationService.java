package com.revature.spring_intro.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MotivationService {

    public MotivationService() {
        System.out.println("Movtivation init");
    }

    public String provideMotivationalQuote() {

        return "Don't quit, suffer now and live the rest of your life like a champion";
    }

}
