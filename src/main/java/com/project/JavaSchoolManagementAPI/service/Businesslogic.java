package com.project.JavaSchoolManagementAPI.service;


import com.project.JavaSchoolManagementAPI.dto.CoursesDTO;
import com.project.JavaSchoolManagementAPI.dto.StudentDTO;
import com.project.JavaSchoolManagementAPI.models.Courses;
import com.project.JavaSchoolManagementAPI.models.Student;
import com.project.JavaSchoolManagementAPI.repository.CoursesRepo;
import com.project.JavaSchoolManagementAPI.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Businesslogic {

    @Autowired
    StudentRepo studentRepo;

    @Autowired
    CoursesRepo coursesRepo;


    public  void register(StudentDTO firstname, String course_name){
        StudentDTO student = studentRepo.findByFirstname(firstname);
        CoursesDTO course = new CoursesDTO();
        course.setName(course_name);
        course.setStudent(firstname);

        student.getCourses().add(course);

    }


}
