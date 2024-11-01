package com.javaacademy.taxi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TaxiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(TaxiApplication.class, args);
		TaxiPark taxiPark = context.getBean(TaxiPark.class);
		taxiPark.takeCar1(3);
		taxiPark.takeCar2(2);
		taxiPark.takeCar3(1);
		taxiPark.printStatistics();
	}

}
