package com.college.ict.Controller;


import com.college.ict.Entity.students;
import com.college.ict.Service.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentAPI {
    private final StudentService studentService;

    public StudentAPI(StudentService studentService){
        this.studentService = studentService;
    }

    @RequestMapping
    public List<students> getAllStudent() {
        return  studentService.getAllStudent();
    }
}
