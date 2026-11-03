package com.college.ict.Service;

import com.college.ict.Entity.students;
import com.college.ict.Repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public students saveStudent(students student) {
        return studentRepository.save(student);
    }

}
