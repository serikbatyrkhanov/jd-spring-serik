package com.serik;

import com.serik.intefaces.Course;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring07SpringBootDemoApplication {

	public static void main(String[] args) {
		//Creates container and all beans
		ApplicationContext container = SpringApplication.run(Spring07SpringBootDemoApplication.class, args);
		Course course = container.getBean("java", Course.class);
		course.getTeachingHours();
	}

}
