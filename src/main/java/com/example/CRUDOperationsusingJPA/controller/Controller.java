package com.example.CRUDOperationsusingJPA.controller;

import com.example.CRUDOperationsusingJPA.entity.Student;
import com.example.CRUDOperationsusingJPA.service.StudentService;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class Controller {

    @Autowired
    private StudentService studentService;


    @GetMapping(value = "/getStudent")
    public List<Student> getAllStudentDetails(){
        return this.studentService.getStudents();
    }

    
    @PostMapping(value = "/addStudent")
    @ResponseBody
    public ResponseEntity<Student> addStudentDetails(@RequestBody Student student){
        try{
            Student stud = this.studentService.addStudent(student);
            return ResponseEntity.ok(stud);
//            return new ResponseEntity(Response.success(this.studentService.addStudent(student)), HttpStatus.OK);
        } catch (Exception ex){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PutMapping(value = "/updateStudent")
    public ResponseEntity<HttpStatus> updateStudentDetails(@RequestBody Student student){
        try{
            this.studentService.updateStudent(student);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception ex){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @DeleteMapping(value = "/deleteStudent")
    public ResponseEntity<HttpStatus> deleteStudentDetails(@PathVariable String studId){
        try{
            this.studentService.deleteStudent(Integer.parseInt(studId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception ex){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
