package com.example.cicd.controller;

import com.example.cicd.controller.StudentController;
import com.example.cicd.model.Student;
import com.example.cicd.service.StudentService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StudentControllerTest {

    @Mock
    private StudentService studentService;

    @Test
    void getAllStudents() {
        List<Student> mockStudents = Arrays.asList(
                new Student(1,"John Doe"),
                new Student(2,"Jane Doe"),
                new Student(3,"Bob Smith")
        );
        when(studentService.getStudents()).thenReturn(mockStudents);
        assertEquals(3, studentService.getStudents().size());
    }
}
