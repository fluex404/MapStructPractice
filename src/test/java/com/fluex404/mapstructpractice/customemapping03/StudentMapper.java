package com.fluex404.mapstructpractice.customemapping03;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface StudentMapper {

    default Student toDTO(StudentEntity entity) {
        Student student = new Student();
        student.setId(entity.getId());
        student.setName(entity.getName());
        student.setClassName(entity.getClassVal());

        return student;
    }

    @Mapping(target = "classVal", source = "student.className")
    StudentEntity toEntity(Student student);
}
