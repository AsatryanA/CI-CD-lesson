package com.example.cicd.service;

import com.example.cicd.model.Student;
import com.example.cicd.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;


    public List<Student> getStudents() {
       return studentRepository.findAll();
    }
}
