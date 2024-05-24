package com.project.JavaSchoolManagementAPI;

import com.project.JavaSchoolManagementAPI.dto.CoursesDTO;
import com.project.JavaSchoolManagementAPI.dto.StudentDTO;
import com.project.JavaSchoolManagementAPI.models.Courses;
import com.project.JavaSchoolManagementAPI.models.Department;
import com.project.JavaSchoolManagementAPI.models.Student;
import com.project.JavaSchoolManagementAPI.repository.CoursesRepo;
import com.project.JavaSchoolManagementAPI.repository.StudentRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class JavaSchoolManagementApiApplicationTests {

	@Autowired
	StudentRepo studentRepo;
	@Autowired
	CoursesRepo coursesRepo;



	@Test
	void contextLoads() {

		Department department = Department.builder()
				.department_id(222L)
				.department_name("Applied Sciences")
				//.courses((List<Courses>) courses)
				.build();

		Courses courses = Courses.builder()
				.course_id(12121L)
				.name("Mathmatics")
				.course_description("Addition,Subtraction")
				.course_requirements("5 O-levels")
				.department(department)
				.build();

		StudentDTO student = StudentDTO.builder()
				.student_id(3322L)
				.firstname("Muziwandile")
				.lastname("Nkomo")
				.age(26)
				.address("4308 Luveve")
				.courses(List.of())
				.build();

		//studentRepo.save(student);
		coursesRepo.save(courses);

	}

}
