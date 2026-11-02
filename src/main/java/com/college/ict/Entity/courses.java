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

        private String course___Name;
        private String courseeeeeeeeeeeeeeeeeeeeeeeCode;
        private int durationnnnnnnnnnnnnn_duration;
        private double fee;
    }
}
