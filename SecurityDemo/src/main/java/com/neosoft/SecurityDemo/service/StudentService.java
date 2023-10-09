package com.neosoft.SecurityDemo.service;

import com.neosoft.SecurityDemo.entity.Student;
import com.neosoft.SecurityDemo.exception.StudentNotFoundException;
import com.neosoft.SecurityDemo.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public Student addNewStudent(Student student){
       return repository.save(student);
    }

    public Student getSpecificStudent(long id){
        return repository.findById(id).orElseThrow(()-> new StudentNotFoundException(id, "Student Not Found With This Studnet Id : "+id));
    }

    public List<Student> getAllStudents(){
        return repository.findAll();
    }
}
