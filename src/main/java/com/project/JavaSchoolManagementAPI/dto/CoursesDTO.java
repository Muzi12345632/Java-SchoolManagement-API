package com.project.JavaSchoolManagementAPI.dto;


import com.project.JavaSchoolManagementAPI.models.Department;
import com.project.JavaSchoolManagementAPI.models.Student;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CoursesDTO {
    private Long course_id;

    private String name;

    private String course_description;

    private String course_requirements;
    private StudentDTO student;
    private Department department;
}
