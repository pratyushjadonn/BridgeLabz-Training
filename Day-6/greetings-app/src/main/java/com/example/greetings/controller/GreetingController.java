package com.example.greetings.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalTime;

@Controller
public class GreetingController {

    /**
     * Home page with a simple form to type a name.
     */
    @GetMapping("/")
    public String home() {
        return "home";
    }

    /**
     * Greeting page.
     * Example: /greeting?name=Alice
     * If no name is given, defaults to "World".
     */
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
                            Model model) {
        String salutation = timeBasedSalutation();
        model.addAttribute("name", name);
        model.addAttribute("salutation", salutation);
        return "greeting";
    }

    private String timeBasedSalutation() {
        int hour = LocalTime.now().getHour();
        if (hour < 12) {
            return "Good morning";
        } else if (hour < 18) {
            return "Good afternoon";
        } else {
            return "Good evening";
        }
    }
}
