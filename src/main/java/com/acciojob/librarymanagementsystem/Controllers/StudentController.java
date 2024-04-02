package com.acciojob.librarymanagementsystem.Controllers;

import com.acciojob.librarymanagementsystem.Entities.Students;
import com.acciojob.librarymanagementsystem.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")

public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/addStudent")
    public ResponseEntity<String> addStudent(@RequestBody Students student){

        String result = studentService.addStudent(student);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    @GetMapping("/findById")
    public ResponseEntity<Students> findStudentId(@RequestParam("studentId")Integer studentId){

        try{
            Students student = studentService.findStudentById(studentId);
            return new ResponseEntity(student,HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/associateCardAndStudent")
    public ResponseEntity associateCardAndStudent(@RequestParam("studentId")Integer studentId,@RequestParam("cardId")Integer cardId){

    }

}
