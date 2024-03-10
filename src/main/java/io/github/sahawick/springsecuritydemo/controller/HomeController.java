package io.github.sahawick.springsecuritydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("")
    public String getHome() {
        return "<h1>Welcome!</h1>";
    }
}
