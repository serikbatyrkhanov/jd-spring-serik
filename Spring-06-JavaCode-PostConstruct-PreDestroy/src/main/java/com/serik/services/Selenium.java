package com.serik.services;

import com.serik.interfaces.Course;
import org.springframework.stereotype.Component;

//@Component
public class Selenium implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Selenium: 22 hours");
    }
}
