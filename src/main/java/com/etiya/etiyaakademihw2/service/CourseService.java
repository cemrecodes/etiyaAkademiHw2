package com.etiya.etiyaakademihw2.service;

import com.etiya.etiyaakademihw2.entity.Course;
import com.etiya.etiyaakademihw2.entity.Student;
import com.etiya.etiyaakademihw2.entity.User;
import com.etiya.etiyaakademihw2.repository.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;
    private static Long idStart = 0L;

    public Course saveCourse(Course course){
        course.setId(idStart + 1);
        idStart = idStart + 1;
        return courseRepository.save(course);
    }

    public void deleteCourse(Long courseId){
        courseRepository.delete(courseId);
    }

    public Optional<Course> updateCourse(Course course){
        // todo olmalı mı emin degilim ama completionRate en az 0 en cok 100 olabilir
        return courseRepository.update(course);
    }

    public Optional<Course> getCourse(Long id){
        return courseRepository.getCourseById(id);
    }

    public List<Course> getAllCourses(){
        return courseRepository.getAll();
    }




}
