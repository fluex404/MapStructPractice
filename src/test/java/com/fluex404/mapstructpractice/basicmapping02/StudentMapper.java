package com.fluex404.mapstructpractice.basicmapping02;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface StudentMapper {

    @Mapping(target = "className", source = "entity.classVal")
    Student toDTO(StudentEntity entity);

    @Mapping(target = "classVal", source = "student.className")
    StudentEntity toEntity(Student student);
}
