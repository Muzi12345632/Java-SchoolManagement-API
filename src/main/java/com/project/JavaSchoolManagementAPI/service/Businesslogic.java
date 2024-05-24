package com.project.JavaSchoolManagementAPI.service;


import com.project.JavaSchoolManagementAPI.dto.CoursesDTO;
import com.project.JavaSchoolManagementAPI.dto.StudentDTO;
import com.project.JavaSchoolManagementAPI.models.Courses;
import com.project.JavaSchoolManagementAPI.models.Student;
import com.project.JavaSchoolManagementAPI.repository.CoursesRepo;
import com.project.JavaSchoolManagementAPI.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class Businesslogic {

    @Autowired
    StudentRepo studentRepo;

    @Autowired
    CoursesRepo coursesRepo;
    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public  void register(String firstname, String course_name){
        Student student = studentRepo.findByFirstname(firstname);
        Courses course = new Courses();
        course.setName(course_name);
        course.setStudent(student);

        student.getCourses().add(course);

    }

    //create new student
    public Student createStudent(Student student){
        String encodedPassword = passwordEncoder.encode(student.getPassword());
        Student newstudent = Student.builder()
                .studentId(student.getStudentId())
                .firstname(student.getFirstname())
                .lastname(student.getLastname())
                .age(student.getAge())
                .email_address(student.getEmail_address())
                .password(encodedPassword)
                .build();

        //save student
        studentRepo.save(newstudent);

        return newstudent;

    }

    public StudentDTO findStudentByName(String name){
        Student student = studentRepo.findByFirstname(name);
        return convertToDTO(student);
    }

    public StudentDTO findStudentById(Long id){
        Student student = studentRepo.findByStudentId(id);
        return convertToDTO(student);
    }

    public List<StudentDTO> getAllStudents(){
        return  studentRepo.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }


    private StudentDTO convertToDTO(Student student) {
        return StudentDTO.builder()
                .studentId(student.getStudentId())
                .firstname(student.getFirstname())
                .lastname(student.getLastname())
                .age(student.getAge())
                .email_address(student.getEmail_address())
                .build();
    }

    private Student convertToEntity(StudentDTO studentDTO){
        return Student.builder()
                .studentId(studentDTO.getStudentId())
                .firstname(studentDTO.getFirstname())
                .lastname(studentDTO.getLastname())
                .age(studentDTO.getAge())
                .email_address(studentDTO.getEmail_address())
                .build();
    }


}
