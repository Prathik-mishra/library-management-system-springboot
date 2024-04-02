package com.acciojob.librarymanagementsystem.Services;

import com.acciojob.librarymanagementsystem.Entities.Students;
import com.acciojob.librarymanagementsystem.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public String addStudent(Students student){
        Students savedStudent = studentRepository.save(student);
        return "The student has been saved toDb with studentId " +savedStudent.getStudentId();
    }

    public Students findStudentById(Integer studentId) throws Exception{

        Optional<Students> optionalStudent = studentRepository.findById(studentId);
        //validate if the studentId entered is correct or not
        if(optionalStudent.isEmpty()){
            throw new Exception("student Id entered is incorrect");
        }
        Students student = optionalStudent.get();
        return student;
    }
}
