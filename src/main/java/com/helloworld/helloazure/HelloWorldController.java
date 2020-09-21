package com.helloworld.helloazure;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String test(){
        return "Hello world from azure latest";
    }
}
