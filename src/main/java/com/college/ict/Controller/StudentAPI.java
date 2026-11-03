package com.college.ict.Controller;

import com.college.ict.Entity.students;
import com.college.ict.Service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/  @DeleteMapping(\"/{id}\")\n" +
        "    public String deletestudent(@PathVariable Long id){\n" +
        "        service.deletestudent(id);\n" +
        "        return \"student delete successfully\";\n" +
        "    }")
public class StudentAPI {
    private final StudentService studentService;

    @PostMapping
    public students addStudent(@RequestBody students student) {
        return studentService.saveStudent(student);
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

    public StudentAPI(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping
    public List<students> getAllStudent() {
        return  studentService.getAllStudents();
    }

    @DeleteMapping("/{id}")
    public String deletestudent(@PathVariable Long id){
        studentService.deletestudent(id);
        return "student delete successfully";
    }
}
