package com.college.ict.Service;

import com.college.ict.Entity.students;
import com.college.ict.Repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    // ADD STUDENT
    public students saveStudent(students student) {
        return studentRepository.save(student);
    }

    // GET ALL STUDENTS
    public List<students> getAllStudents() {
        return studentRepository.findAll();
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

    // DELETE STUDENT
    public void deleteStudent(Long id) {

        students student = getStudentById(id);

        studentRepository.delete(student);
    }
}
