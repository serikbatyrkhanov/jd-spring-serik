package com.serik;

import com.serik.interfaces.Course;
import com.serik.services.Java;
import com.serik.services.Selenium;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Course course1 = container.getBean("java", Course.class);
        course1.getTeachingHours();

        Course course2 = container.getBean("selenium", Course.class);
        course2.getTeachingHours();
    }
}
