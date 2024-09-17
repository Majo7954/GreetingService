package com.ucb.franky;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetingController {

    @Autowired
    GreetingService greetingService;

    // Saludo genérico con idioma
    @GetMapping("/{language}")
    public String greeting(@PathVariable String language) {
        return greetingService.getGreeting(language);
    }

    // Saludo personalizado con idioma
    @GetMapping("/{language}/{name}")
    public String personalizedGreeting(@PathVariable String language, @PathVariable String name) {
        return greetingService.getPersonalizedGreeting(name, language);
    }
}

