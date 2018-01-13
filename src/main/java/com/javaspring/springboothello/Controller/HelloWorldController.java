package com.javaspring.springboothello.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String sayHelloEveryBody(@RequestParam(value="message") String message){
        return "Hello" + message;
    }
}
