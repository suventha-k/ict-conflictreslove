package com.college.ict.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Courses {

    @Entity
    @Data
    @NoArgsConstructor
    @Table(name = "courses")
    public class Course {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long Course_ID;
        private int Duration;
        private String Course_Name;
        private int Fee;
    }
}
