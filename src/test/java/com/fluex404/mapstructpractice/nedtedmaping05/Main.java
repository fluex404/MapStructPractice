package com.fluex404.mapstructpractice.nedtedmaping05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class Main {
    @Test
    public void test(){
        SubjectEntity subject = new SubjectEntity();
        subject.setName("Math");

        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setId(101);
        studentEntity.setName("Isa");
        studentEntity.setClassVal("S1A");
        studentEntity.setSubject(subject);

        Student student = StudentMapper.INSTANCE.toDTO(studentEntity);

        Assertions.assertEquals(student.getId(), studentEntity.getId());
        Assertions.assertEquals(student.getName(), studentEntity.getName());
        Assertions.assertEquals(student.getClassName(), studentEntity.getClassVal());
        Assertions.assertEquals(student.getSubject(), studentEntity.getSubject().getName());

        StudentEntity studentEntity2 = StudentMapper.INSTANCE.toEntity(student);
        Assertions.assertEquals(student.getId(), studentEntity2.getId());
        Assertions.assertEquals(student.getName(), studentEntity2.getName());
        Assertions.assertEquals(student.getClassName(), studentEntity2.getClassVal());
        Assertions.assertEquals(student.getSubject(), studentEntity2.getSubject().getName());

    }
}
