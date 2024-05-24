package com.project.JavaSchoolManagementAPI.dto;


import com.project.JavaSchoolManagementAPI.models.Courses;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class StudentDTO {
    private  Long studentId;
    private String firstname;
    private String lastname;
    private int age;
    //leave out password
    private String email_address;
    private String address;
    private List<CoursesDTO> courses;
}
