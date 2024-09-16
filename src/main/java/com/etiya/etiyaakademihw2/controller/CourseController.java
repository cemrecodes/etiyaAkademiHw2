package com.etiya.etiyaakademihw2.controller;

import com.etiya.etiyaakademihw2.entity.Course;
import com.etiya.etiyaakademihw2.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController()
@RequestMapping("/courses")
@AllArgsConstructor
public class CourseController {
    private final CourseService courseService;

    @PostMapping
    public Course saveCourse(Course course){
        return courseService.saveCourse(course);
    }

    @DeleteMapping
    public void deleteCourse(Long courseId){
        courseService.deleteCourse(courseId);
    }

    @PutMapping
    public Optional<Course> updateCourse(Course course){
        return courseService.updateCourse(course);
    }

    @GetMapping(value = "/{id}")
    public Optional<Course> getCourse(@PathVariable Long id){
        return courseService.getCourse(id);
    }

    @GetMapping
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }
}
