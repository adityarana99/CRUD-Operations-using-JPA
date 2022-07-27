package com.example.CRUDOperationsusingJPA.service;

import com.example.CRUDOperationsusingJPA.entity.Student;

import java.util.List;

public interface StudentService {

    public List<Student> getStudents();

    public Student addStudent(Student student);

    public Student updateStudent(Student stud);

    public void deleteStudent(int studentId);

}
