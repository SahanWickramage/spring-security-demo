package io.github.sahawick.springsecuritydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("resource")
public class ResourceController {

    @GetMapping("")
    public String getResource() {
        return "<h1>This is resource page!</h1>";
    }
}
