package com.college.ict.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
public class studdents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Student_ID;
    private String Student_Name;
    private int Addresss;
    private int Age;
}
