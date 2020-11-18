package com.serik.controller;

import com.serik.enums.Gender;
import com.serik.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @GetMapping("/list")
    public String showTable(Model model){
        List<Mentor> mentorsList = new ArrayList<>();
        mentorsList.add( new Mentor("Mike", "Smith", Gender.MALE,45,  "MVC"));
        mentorsList.add( new Mentor("Tom", "Roy", Gender.MALE,65,  "JAVA"));
        mentorsList.add( new Mentor("Laura", "Adams", Gender.FEMALE,25,  "Office hours"));

        model.addAttribute("mentorsList", mentorsList);
        return "mentor/mentor-list";
    }
}
