package com.serik.services;

import com.serik.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    private OfficeHours officeHours;
    @Override
    public void getTeachingHours() {
        System.out.println("Java: "+ (30 + officeHours.getHours()));
    }
}
