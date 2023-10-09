package com.neosoft.SecurityDemo.controller;

import com.neosoft.SecurityDemo.entity.Student;
import com.neosoft.SecurityDemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/security")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/addNewStudent")
    public ResponseEntity<?> addNewStudent(@RequestBody Student student){
        Student addedStudent = service.addNewStudent(student);
        return new ResponseEntity<>(addedStudent, HttpStatus.CREATED);
    }

    @GetMapping("/getStudent/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable long id){
        Student student = service.getSpecificStudent(id);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    @GetMapping("/getAllStudent")
    public ResponseEntity<?> getAllStudent(){
        List<Student> students = service.getAllStudents();
        return new ResponseEntity<>(students, HttpStatus.CREATED);
    }

    @GetMapping("/current-user")
    public String getCurrentUserName(Principal principal){
        return principal.getName();
    }


}
