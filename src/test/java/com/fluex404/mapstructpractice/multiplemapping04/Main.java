package com.fluex404.mapstructpractice.multiplemapping04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Main {

    DeliveryAddressMapper deliveryAddressMapper = Mappers.getMapper(DeliveryAddressMapper.class);

    @Test
    public void test(){
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setId(101);
        studentEntity.setName("Isa");
        studentEntity.setClassVal("S1A");

        AddressEntity addressEntity = new AddressEntity();
        addressEntity.setCity("Jakarta");
        addressEntity.setHouseNo(90);
        addressEntity.setState("X");

        DeliveryAddress deliveryAddress = deliveryAddressMapper.toDto(studentEntity, addressEntity);

        Assertions.assertEquals(deliveryAddress.getName(), studentEntity.getName());
        Assertions.assertEquals(deliveryAddress.getCity(), addressEntity.getCity());
        Assertions.assertEquals(deliveryAddress.getHouseNumber(), addressEntity.getHouseNo());
        Assertions.assertEquals(deliveryAddress.getState(), addressEntity.getState());
    }
}
