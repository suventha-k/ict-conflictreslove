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
        private Long Course_ID;
        private int Duration;
        private double Fees;
    }
}
