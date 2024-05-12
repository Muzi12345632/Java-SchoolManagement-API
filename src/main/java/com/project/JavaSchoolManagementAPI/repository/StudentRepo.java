package com.project.JavaSchoolManagementAPI.repository;

import com.project.JavaSchoolManagementAPI.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {
    Student save(Student student);

    Student findByName(Student student);
}
