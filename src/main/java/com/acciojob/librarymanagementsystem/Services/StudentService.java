package com.acciojob.librarymanagementsystem.Services;

import com.acciojob.librarymanagementsystem.Entities.Students;
import com.acciojob.librarymanagementsystem.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public String addStudent(Students student){
        studentRepository.save(student);
        return "The student has been saved toDb";
    }
}
