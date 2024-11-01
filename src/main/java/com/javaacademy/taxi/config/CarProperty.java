package com.javaacademy.taxi.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "car")
@Data
public class CarProperty {
    private String carNumber1;
    private String carNumber2;
    private String carNumber3;
}
