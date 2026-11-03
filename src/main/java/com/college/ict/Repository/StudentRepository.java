package com.college.ict.Repository;

import com.college.ict.Entity.students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<students, Long> {
}
