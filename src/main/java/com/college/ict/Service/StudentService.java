package com.college.ict.Service;

import com.college.ict.Entity.Students;
import com.college.ict.Repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }


    //save students
    public Students saveStudent(Students student) {
        return studentRepository.save(student);
    }


    //get all students
    public List<Students> getAllStudents(){
        return studentRepository.findAll();
    }


    // GET STUDENT BY ID
    public Students getStudentById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found: " + id));
    }

    // UPDATE STUDENT
    public Students updateStudent(Long id, Students student) {
        Students existingStudent = getStudentById(id);
        existingStudent.setName(student.getName());
        existingStudent.setAddress(student.getAddress());
        return studentRepository.save(existingStudent);
    }

}
