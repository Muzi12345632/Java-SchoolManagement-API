package com.project.JavaSchoolManagementAPI.controller;


import com.project.JavaSchoolManagementAPI.dto.StudentDTO;
import com.project.JavaSchoolManagementAPI.models.Student;
import com.project.JavaSchoolManagementAPI.service.Businesslogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Controller
public class maincontroller {

    @Autowired
    Businesslogic businesslogic;

    @GetMapping("/students")
    public List<StudentDTO> getAllStudents(){
        return businesslogic.getAllStudents();
    }

    @PostMapping("/createStudent")
    public StudentDTO createStudent(@RequestBody Student student){
        return businesslogic.createStudent(student);
    }


}
