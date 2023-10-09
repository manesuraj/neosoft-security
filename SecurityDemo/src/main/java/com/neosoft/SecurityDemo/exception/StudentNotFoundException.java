package com.neosoft.SecurityDemo.exception;

public class StudentNotFoundException extends RuntimeException{

    private long studentId;
    private String message;

    public StudentNotFoundException(){
        super("Student Not Found With Given Student Id");
    }
    public StudentNotFoundException(long id, String message){
        this.studentId = id;
        this.message=message;
    }

}
