package vn.edu.stu.banthucan.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class Hello {
    @GetMapping("/hello")
    public String hello(){
        return "Hello Word";
    }
    @GetMapping("/")
    public String hello2(){
        return "Hello Word";
    }
}
