package com.project.JavaSchoolManagementAPI.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Embeddable
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "department")
public class Department {

    @Id
    private Long department_id;
    private  String department_name;
    private String overview;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="department_id", referencedColumnName = "department_id")
    private List<Courses> courses;

}
