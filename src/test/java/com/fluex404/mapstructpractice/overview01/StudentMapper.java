package com.fluex404.mapstructpractice.overview01;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class StudentMapper {
    public static StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    public abstract StudentEntity toEntity(Student student);
}
