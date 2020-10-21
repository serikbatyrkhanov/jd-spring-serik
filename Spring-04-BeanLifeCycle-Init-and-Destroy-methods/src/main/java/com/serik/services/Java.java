package com.serik.services;

import com.serik.interfaces.Course;

public class Java implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours: 20 hours");
    }
    public void myInitMethod(){
        System.out.println("Executing init method");
    }
    public void myDestroyMethod(){
        System.out.println("Executing destroy method");
    }
}