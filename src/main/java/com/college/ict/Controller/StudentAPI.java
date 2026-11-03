package com.college.ict.Controller;

import com.college.ict.Entity.students;
import com.college.ict.Service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class StudentAPI {
    private final StudentService studentService;

    @PostMapping
    public students addStudent(@RequestBody students student) {
        return studentService.saveStudent(student);
    }

}
