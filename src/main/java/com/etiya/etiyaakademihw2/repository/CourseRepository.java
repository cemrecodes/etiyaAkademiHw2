package com.etiya.etiyaakademihw2.repository;

import com.etiya.etiyaakademihw2.entity.Course;

import java.util.List;
import java.util.Optional;

public interface CourseRepository {
    Course save(Course course);
    void delete(Long courseId);
    Optional<Course> update(Course course);
    Optional<Course> getCourseById(Long id);
    List<Course> getAll();
}
