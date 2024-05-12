package com.project.JavaSchoolManagementAPI.repository;

import com.project.JavaSchoolManagementAPI.models.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursesRepo extends JpaRepository<Courses, Long> {
    Courses save(Courses courses);

    Courses findByName(String name);

}
