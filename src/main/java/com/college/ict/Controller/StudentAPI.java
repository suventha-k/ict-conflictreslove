package com.college.ict.Controller;


import com.college.ict.Entity.students;
import com.college.ict.Service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class StudentAPI {
    private final StudentService studentService;

    // POST - ADD STUDENT
    @PostMapping
    public students addStudent(@RequestBody students student) {
        return studentService.saveStudent(student);
    }

    // GET - ALL STUDENTS
    @GetMapping
    public List<students> getAllStudents() {
        return studentService.getAllStudents();
    }

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

    // DELETE - STUDENT
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {

        studentService.deleteStudent(id);

        return "Student Deleted Successfully";
    }
}
