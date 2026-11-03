package com.college.ict.Controller;

import com.college.ict.Entity.students;
import com.college.ict.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentAPI {
    @Autowired
    private StudentService studentService;


    // GET - STUDENT BY ID
    @GetMapping("/{id}")
    public students getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }


    // PUT - UPDATE STUDENT
    @PutMapping("/{id}")
    public students updateStudent(
            @PathVariable Long id,
            @RequestBody students student) {

        return studentService.updateStudent(id, student);
    }

}
