package com.serik.services;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import com.serik.interfaces.Course;
import com.serik.interfaces.ExtraSessions;
import lombok.Data;

@Data
public class Java implements Course {
   private ExtraSessions extraSessions;

//    public OfficeHours getOfficeHours() {
//        return officeHours;
//    }
//
//    public void setOfficeHours(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: " + (20 + extraSessions.getHours()));
    }
}