package com.serik.services;

import com.serik.interfaces.Course;

public class Java implements Course {
    OfficeHours officeHours = new OfficeHours();
    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: " + (20 + officeHours.getHours()));
    }
}
