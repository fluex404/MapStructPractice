package com.fluex404.mapstructpractice.nedtedmaping05;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class StudentMapper {
    public static StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    @Mapping(target = "className", source = "entity.classVal")
    @Mapping(target = "subject", source = "entity.subject.name")
    public abstract Student toDTO(StudentEntity entity);

    @Mapping(target = "classVal", source = "dto.className")
    @Mapping(target = "subject.name", source = "dto.subject")
    public abstract StudentEntity toEntity(Student dto);
}
