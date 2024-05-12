package com.project.JavaSchoolManagementAPI.service;


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


    public  void register(Student student_name, String course_name){
        Student student = studentRepo.findByName(student_name);
        Courses course = new Courses();
        course.setCourse_name(course_name);
        course.setStudent(student_name);

        student.getCourses().add(course);

    }


}
