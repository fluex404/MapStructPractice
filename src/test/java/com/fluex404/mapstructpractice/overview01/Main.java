package com.fluex404.mapstructpractice.overview01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Main {

    @Test
    void contextLoads() {
        Student student = new Student();
        student.setId("101");
        student.setName("Isa");

        StudentEntity studentEntity = StudentMapper.INSTANCE.toEntity(student);
        Assertions.assertEquals(student.getId(), studentEntity.getId());
        Assertions.assertEquals(student.getName(), studentEntity.getName());
    }

}
