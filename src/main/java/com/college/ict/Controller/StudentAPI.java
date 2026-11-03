package com.college.ict.Controller;

import com.college.ict.Entity.Students;
import com.college.ict.Service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentAPI {
    private final StudentService studentService;

    public StudentAPI(StudentService studentService){
        this.studentService = studentService;
    }


    //add student
    @PostMapping
    public Students addStudent(@RequestBody Students student) {
        return studentService.saveStudent(student);
    }

    //get all student
    @GetMapping
    public List<Students> getAllStudent() {
        return  studentService.getAllStudents();
    }


    // GET - STUDENT BY ID
    @GetMapping("/{id}")
    public Students getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    // PUT - UPDATE STUDENT
    @PutMapping("/{id}")
    public Students updateStudent(
            @PathVariable Long id,
            @RequestBody Students student) {
        return studentService.updateStudent(id, student);
    }

    @DeleteMapping("/{id}")
    public String deletestudent(@PathVariable Long id){
        studentService.deleteStudent(id);
        return "student delete successfully";
    }
}
