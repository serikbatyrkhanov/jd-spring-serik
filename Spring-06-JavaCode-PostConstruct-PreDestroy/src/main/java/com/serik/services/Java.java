package com.serik.services;

import com.serik.interfaces.Course;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;

public class Java implements Course {

    @Value("JD1")
    private String batch;
    @Value("${instructor}")
    private String instructor;
    @Value("${days}")
    private String[] days;

    @Override
    public String toString() {
        return "Java{" +
                "batch='" + batch + '\'' +
                ", instructor='" + instructor + '\'' +
                ", days=" + Arrays.toString(days) +
                '}';
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Java: " + (30));
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Executing Post Construct");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Executing Pre Destroy");
    }
}
