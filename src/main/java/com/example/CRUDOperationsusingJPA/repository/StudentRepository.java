package com.example.CRUDOperationsusingJPA.repository;

import com.example.CRUDOperationsusingJPA.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
