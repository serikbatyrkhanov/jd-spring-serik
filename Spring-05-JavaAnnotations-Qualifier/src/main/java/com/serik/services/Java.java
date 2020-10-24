package com.serik.services;

import com.serik.interfaces.Course;
import com.serik.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    //@Autowired
    //@Qualifier("officeHours")
    ExtraSessions extraSessions;


    public Java(@Qualifier("officeHours") ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Java: " + (20 + extraSessions.getHours()));
    }
}
