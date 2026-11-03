package com.college.ict.Service;

import com.college.ict.Controller.StudentAPI;
import com.college.ict.Entity.students;
import com.college.ict.Repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public List<students> getAllStudents(){
        return studentRepository.findAll();
    }

    public students saveStudent(students student) {
        return studentRepository.save(student);
    }

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
