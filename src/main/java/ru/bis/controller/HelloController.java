package ru.bis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.bis.repository.DhtRepository;

@RestController
public class HelloController {
    @Autowired
    DhtRepository dhtRepository;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
