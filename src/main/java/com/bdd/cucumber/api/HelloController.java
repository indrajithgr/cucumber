package com.bdd.cucumber.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/cucumber")
public class HelloController {

    @GetMapping
    public String hello() {
        return "Hi I'm here.";
    }
}
