
package com.project.JavaSchoolManagementAPI.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "courses")
public class Courses {
    @Id
    private Long course_id;

    private String course_name;

    private String course_description;

    private String course_requirements;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "course_id", referencedColumnName = "course_id")
    private Student student;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="course_id", referencedColumnName = "course_id")
    private Department department;

}

