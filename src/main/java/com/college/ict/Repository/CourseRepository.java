package com.college.ict.Repository;

import com.college.ict.Entity.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Courses, Long> {
}
