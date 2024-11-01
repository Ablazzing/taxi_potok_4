package com.javaacademy.taxi.config;

import com.javaacademy.taxi.Car;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(value = CarProperty.class)
public class TaxiConfiguration {
    private CarProperty carProperty;

    public TaxiConfiguration(CarProperty carProperty) {
        this.carProperty = carProperty;
    }

    @Bean
    public Car car1() {
        return new Car(carProperty.getCarNumber1());
    }

    @Bean
    public Car car2() {
        return new Car(carProperty.getCarNumber2());
    }

    @Bean
    public Car car3() {
        return new Car(carProperty.getCarNumber3());
    }


}
