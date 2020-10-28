package com.serik.services;

import com.serik.intefaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Selenium hours: 15");
    }
}
