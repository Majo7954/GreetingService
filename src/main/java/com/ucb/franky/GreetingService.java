package com.ucb.franky;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    @Value("${greeting.message.en}")
    private String englishGreeting;

    @Value("${greeting.message.es}")
    private String spanishGreeting;

    public String getGreeting(String language) {
        if ("es".equals(language)) {
            return spanishGreeting;
        } else {
            return englishGreeting;
        }
    }

    public String getPersonalizedGreeting(String name, String language) {
        String greeting = getGreeting(language);
        return name + ". " + greeting;
    }
}
