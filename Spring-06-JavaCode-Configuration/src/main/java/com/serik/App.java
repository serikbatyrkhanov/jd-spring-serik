package com.serik;

import com.serik.configs.AppConfig;
import com.serik.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

    ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);

        Course course = container.getBean("java", Course.class);
        course.getTeachingHours();
        System.out.println(course.toString());
    }
}
