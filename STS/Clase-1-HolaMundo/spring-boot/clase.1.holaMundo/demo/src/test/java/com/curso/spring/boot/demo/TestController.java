package com.curso.spring.boot.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/test")
public class TestController {
    
    @GetMapping
    public String holaMundo(){
        return "Hola Mundo";
    }
}
