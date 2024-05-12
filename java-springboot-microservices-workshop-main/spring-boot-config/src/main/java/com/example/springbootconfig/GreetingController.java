package com.example.springbootconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Value("${my.greeting}")
    private String greet;

    @Autowired
    private DBConfig dbConfig;

    @Autowired
    private Environment env;

    @RequestMapping("/greeting")
    public String greeting(){
        return dbConfig.getConnection() + dbConfig.getHost() + dbConfig.getPort();
    }

    @GetMapping("/envdetails")
    public String envDetails(){
        return env.toString();
    }
}
