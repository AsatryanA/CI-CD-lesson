package com.example.cicd.controller;

import com.example.cicd.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping(value = "/student/all")
    public Respo getTestData() {
        ent student = new Student();
        student.setName("Peter");
        student.setId(studentId);

        return student;
}
