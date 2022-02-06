package com.fluex404.mapstructpractice.multiplemapping04;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface DeliveryAddressMapper {

    @Mapping(target = "houseNumber", source = "addressEntity.houseNo")
    DeliveryAddress toDto(StudentEntity studentEntity, AddressEntity addressEntity);
}
