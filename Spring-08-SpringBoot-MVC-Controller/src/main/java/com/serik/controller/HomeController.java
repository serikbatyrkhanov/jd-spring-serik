package com.serik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.sql.SQLOutput;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getRequestMapping(){
        return "home";
    }

    @RequestMapping(method = RequestMethod.GET, value= "/serik")
    public String getRequestMapping2(){
        return "home";
    }

//    @GetMapping("/spring")
//    public String getMappingEx(){
//        return "home";
//    }
    @PostMapping("/spring")
    public String postMappingEx(){
        return "home";
    }

    @GetMapping("/home/{name}")
    public String pathVariableEx(@PathVariable("name") String name){
        System.out.println("name: " + name);
        return "home";
    }
    @GetMapping("/home/{name}/{email}")
    public String pathVariableEx2(@PathVariable("name") String name, @PathVariable("email") String email){
        System.out.println("name: " + name);
        System.out.println("email: " + email);
        return "home";
    }
    @GetMapping("/home/course")
    public String requestParamEx(@RequestParam("course") String course){
        System.out.println("course: " + course);
        return "home";
    }

    @GetMapping(value="/course")
    public String requestParamEx2(@RequestParam(value="course", required = false, defaultValue = "springBoot") String course){
        System.out.println("course: " + course);
        return "home";
    }
}
