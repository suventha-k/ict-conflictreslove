package com.college.ict.Service;

import com.college.ict.Entity.students;
import com.college.ict.Repository.StudentRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class StudentService {
    private StudentRepository studentRepository;

    // GET STUDENT BY ID
    public students getStudentById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found: " + id));
    }

    // UPDATE STUDENT
    public students updateStudent(Long id, students student) {

        students existingStudent = getStudentById(id);

        existingStudent.setName(student.getName());
        existingStudent.setAddress(student.getAddress());

        return studentRepository.save(existingStudent);
    }

}
