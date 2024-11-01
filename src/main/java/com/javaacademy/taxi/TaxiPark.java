package com.javaacademy.taxi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

import static java.math.BigDecimal.ZERO;
import static java.math.BigDecimal.valueOf;

@Component
@Slf4j
public class TaxiPark {
    @Value("${taxi.rate}")
    private BigDecimal rate;
    private List<Car> cars;
    private BigDecimal profit = ZERO;

    public TaxiPark(List<Car> cars) {
        this.cars = cars;
    }

    public void takeCar1(int hours) {
        takeCar(hours, cars.get(0));
    }

    public void takeCar2(int hours) {
        takeCar(hours, cars.get(1));
    }

    public void takeCar3(int hours) {
        takeCar(hours, cars.get(2));
    }

    private void takeCar(int hours, Car car) {
        log.info("Машина {} выехала на заказ", car.getNumber());
        profit = profit.add(rate.multiply(valueOf(hours)));
    };

    public void printStatistics() {
        log.info("Заработал таксопарк: {}", profit);
    }
}
