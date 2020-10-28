package com.serik.services;

import com.serik.intefaces.Course;
import com.serik.intefaces.ExtraSession;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    @Value("${instructor}")
    public String instructor;
    private ExtraSession extraSession;

    public Java(ExtraSession extraSession) {
        this.extraSession = extraSession;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Java hours: " + (30 + extraSession.getHour()));
        System.out.println("Instructor: "+instructor);
    }
}
