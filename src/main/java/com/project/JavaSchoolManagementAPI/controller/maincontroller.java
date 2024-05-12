package com.project.JavaSchoolManagementAPI.controller;


import com.project.JavaSchoolManagementAPI.service.Businesslogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class maincontroller {

    @Autowired
    Businesslogic businesslogic;


}
