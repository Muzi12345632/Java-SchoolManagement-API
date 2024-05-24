package com.project.JavaSchoolManagementAPI.repository;

import com.project.JavaSchoolManagementAPI.dto.StudentDTO;
import com.project.JavaSchoolManagementAPI.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {
    Student findByFirstname(String firstname);

    Student findByStudentId(Long id);
}
