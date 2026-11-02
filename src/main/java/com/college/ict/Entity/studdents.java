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
    private Long Student_IDdd;
    private String Student_Nameeeeeee;
    private int Addresss;
}
