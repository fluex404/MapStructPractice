package com.fluex404.mapstructpractice.customemapping03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Main {

    private StudentMapper studentMapper = Mappers.getMapper(StudentMapper.class);

    @Test
    public void test(){
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setId(101);
        studentEntity.setName("Isa");
        studentEntity.setClassVal("S1A");

        Student student = studentMapper.toDTO(studentEntity);
        Assertions.assertEquals(student.getId(), studentEntity.getId());
        Assertions.assertEquals(student.getName(), studentEntity.getName());
        Assertions.assertEquals(student.getClassName(), studentEntity.getClassVal());

        StudentEntity studentEntity2 = studentMapper.toEntity(student);
        Assertions.assertEquals(student.getId(), studentEntity2.getId());
        Assertions.assertEquals(student.getName(), studentEntity2.getName());
        Assertions.assertEquals(student.getClassName(), studentEntity2.getClassVal());
    }
}
