package com.project.JavaSchoolManagementAPI.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Table(name = "student",uniqueConstraints = @UniqueConstraint(name = "email_address", columnNames = "email_address"))
public class Student {

    @Id
    @SequenceGenerator(name = "student_sequence",sequenceName = "student_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    @Column(name = "student_id")
    private Long studentId;
    private String firstname;
    private String lastname;
    private int age;
    @Column(nullable = false)
    private String email_address;
    private String address;
    @Column(name = "password_hash")
    private String password;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="student_id", referencedColumnName = "student_id")
    private List<Courses> courses;
    /*@Embedded
    private Department depart;*/


}
