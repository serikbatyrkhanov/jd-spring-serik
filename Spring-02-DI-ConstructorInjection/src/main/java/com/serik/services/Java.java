package com.serik.services;

import com.serik.interfaces.Course;
import com.serik.interfaces.ExtraSessions;

public class Java implements Course {
    //OfficeHours officeHours;
    ExtraSessions extraSessions;

//    public Java(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }
    public Java(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: " + (20 + extraSessions.getHours()));
    }
}
