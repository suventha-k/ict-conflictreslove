package com.college.ict.Service;

import com.college.ict.Entity.Courses;
import com.college.ict.Entity.Students;
import com.college.ict.Repository.CourseRepository;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    public final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Courses saveCourse(Courses courses) {
        return courseRepository.save(courses);
    }

}
