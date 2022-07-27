package com.example.CRUDOperationsusingJPA.entity;


import lombok.*;

import javax.persistence.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "StudentDetails")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentId;

    private String firstName;
    private String lastName;
    private String gender;
    private String department;
}
