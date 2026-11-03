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

    public Optional<students> getStudentById(Long id){
        return studentRepository.findById(id);
    }
}
