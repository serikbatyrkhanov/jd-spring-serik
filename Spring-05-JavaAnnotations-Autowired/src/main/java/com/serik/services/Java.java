package com.serik.services;

import com.serik.interfaces.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {
   //Field Injection
    @Autowired
    private OfficeHours officeHours;

    //Constrcutor Injection
    @Autowired
    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    public OfficeHours getOfficeHours() {
        return officeHours;
    }
    //Setter Injection
    @Autowired
    public void setOfficeHours(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }



    @Override
    public void getTeachingHours() {
        System.out.println("Java: "+ (30 + officeHours.getHours()));
    }
}
