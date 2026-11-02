package com.college.ict.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

public class courses {

    @Entity
    @Data
    @NoArgsConstructor
    @Table(name = "courses")
    public class Course {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long courseId;

        private String courseName;
        private String courseCode;
        private int duration;
        private double fee;
    }
}
