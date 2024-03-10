package com.first.gradleproject.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "akj_usermaster")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userid")
    private int userId;
    
    @Column(name = "username")
    private String userName;

    @Column(name = "department")
    private String department;

    @Column(name = "age")
    private int age;

    @Column(name = "salary")
    private float salary;
}
