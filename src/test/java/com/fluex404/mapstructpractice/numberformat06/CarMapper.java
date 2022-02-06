package com.fluex404.mapstructpractice.numberformat06;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class CarMapper {
    public static CarMapper INSTATNCE = Mappers.getMapper(CarMapper.class);

    @Mapping(target = "price", source = "price", numberFormat = "$#.00")
    abstract Car toDTO(CarEntity entity);
}
