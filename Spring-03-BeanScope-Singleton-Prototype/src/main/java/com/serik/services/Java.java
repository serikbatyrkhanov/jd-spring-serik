package com.serik.services;

import com.serik.interfaces.Course;
import com.serik.interfaces.ExtraSessions;
public class Java implements Course {
    private ExtraSessions extraSessions;

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: " + (20 + extraSessions.getHours()));
    }
}