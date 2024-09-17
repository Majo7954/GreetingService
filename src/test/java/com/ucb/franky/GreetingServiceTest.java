package com.ucb.franky;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class GreetingServiceTest {

    @Autowired
    private GreetingService greetingService;

    @Test
    void getGreetingInEnglish() {
        String actualGreeting = greetingService.getGreeting("en");
        String expectedGreeting = "Ask yourself if what you're doing today is getting you closer to where you want to be tomorrow.";
        assertEquals(expectedGreeting, actualGreeting, "The greeting in English should match the expected message.");
    }

    @Test
    void getGreetingInSpanish() {
        String actualGreeting = greetingService.getGreeting("es");
        String expectedGreeting = "Pregúntate si lo que estás haciendo hoy te acerca al lugar en el que quieres estar mañana.";
        assertEquals(expectedGreeting, actualGreeting, "The greeting in Spanish should match the expected message.");
    }

    @Test
    void getPersonalizedGreetingInEnglish() {
        String name = "Emilia";
        String actualGreeting = greetingService.getPersonalizedGreeting(name, "en");
        String expectedGreeting = name + ". Ask yourself if what you're doing today is getting you closer to where you want to be tomorrow.";
        assertEquals(expectedGreeting, actualGreeting, "The personalized greeting in English should match the expected message.");
    }

    @Test
    void getPersonalizedGreetingInSpanish() {
        String name = "Emilia";
        String actualGreeting = greetingService.getPersonalizedGreeting(name, "es");
        String expectedGreeting = name + ". Pregúntate si lo que estás haciendo hoy te acerca al lugar en el que quieres estar mañana.";
        assertEquals(expectedGreeting, actualGreeting, "The personalized greeting in Spanish should match the expected message.");
    }
}
