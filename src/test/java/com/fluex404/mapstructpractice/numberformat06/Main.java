package com.fluex404.mapstructpractice.numberformat06;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Main {
    @Test
    public void test(){
        CarEntity carEntity = new CarEntity();
        carEntity.setId(101);
        carEntity.setPrice(120.891);

        Car car = CarMapper.INSTATNCE.toDTO(carEntity);
        System.out.println(car.getId());
        System.out.println(car.getPrice());
    }
}
