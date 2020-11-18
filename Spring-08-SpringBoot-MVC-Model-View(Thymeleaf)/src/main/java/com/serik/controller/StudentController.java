package com.serik.controller;

import com.serik.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/welcome")
    public String homePage(Model model){

        model.addAttribute("name", "Welcome Student");
        model.addAttribute("course", "Course: MVC");

        String subject = "Thymeleaf";
        model.addAttribute("subject", subject);

        int randomId = new Random().nextInt(1000);
        model.addAttribute("id", randomId);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(7);
        model.addAttribute("numbers", numbers);

        LocalDate birthDate = LocalDate.now().minusYears(29);
        //LocalDate bd = LocalDate.of(year, month, day);
        model.addAttribute("birthDate", birthDate);

        Student student = new Student(1, "Mike", "Smith");
        model.addAttribute("student", student);


        return "student/welcome";
    }
    @GetMapping("register")
    public String homePage2(){
        return "student/register";
    }
}
