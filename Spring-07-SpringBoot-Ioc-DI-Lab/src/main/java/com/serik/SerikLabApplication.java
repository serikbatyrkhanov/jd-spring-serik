package com.serik;

import com.serik.calculator.Calculator;
import com.serik.enums.City;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SerikLabApplication {

	public static void main(String[] args) throws Exception {
		ApplicationContext container = SpringApplication.run(SerikLabApplication.class, args);

	    Calculator calculator = container.getBean("calculator", Calculator.class);
		System.out.println(calculator.getTotalCarpetCost(City.DULLES));
	}

}
