package com.etiya.etiyaakademihw2.controller;

import com.etiya.etiyaakademihw2.entity.Course;
import com.etiya.etiyaakademihw2.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController()
@RequestMapping("/courses")
@AllArgsConstructor
public class CourseController {
    private final CourseService courseService;

    @PostMapping
    public ResponseEntity<Course> saveCourse(Course course){
        return ResponseEntity.status(HttpStatus.CREATED).body(courseService.saveCourse(course));
    }

    @DeleteMapping
    public ResponseEntity<String> deleteCourse(Long courseId){
        courseService.deleteCourse(courseId);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Successfully deleted.");
    }

    @PutMapping
    public ResponseEntity<?> updateCourse(Course course){
        Optional<Course> updatedCourse = courseService.updateCourse(course);
        if(updatedCourse.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(updatedCourse.get());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Course doesn't exist.");
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> getCourse(@PathVariable Long id){
        Optional<Course> foundCourse = courseService.getCourse(id);
        if(foundCourse.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(foundCourse.get());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Course doesn't exist.");
    }

    @GetMapping
    public ResponseEntity<List<Course>> getAllCourses(){
        return ResponseEntity.status(HttpStatus.OK).body(courseService.getAllCourses());
    }
}
