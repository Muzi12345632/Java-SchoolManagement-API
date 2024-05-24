package com.project.JavaSchoolManagementAPI.repository;

import com.project.JavaSchoolManagementAPI.dto.CoursesDTO;
import com.project.JavaSchoolManagementAPI.models.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursesRepo extends JpaRepository<CoursesDTO, Long> {
    CoursesDTO save(CoursesDTO courses);

    CoursesDTO findByName(String name);

}
