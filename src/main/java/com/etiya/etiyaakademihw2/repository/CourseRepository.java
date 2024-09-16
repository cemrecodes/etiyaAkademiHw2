package com.etiya.etiyaakademihw2.repository;

import com.etiya.etiyaakademihw2.entity.Course;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@NoArgsConstructor
@Repository
public class CourseRepository {

    ArrayList<Course> courseList = new ArrayList<>();
    public Course save(Course course) {
        courseList.add(course);
        return course;
    }

    public void delete(Long courseId) {
        int index = 0;

        for (; index < courseList.size(); index++ ){
            if(courseList.get(index).getId().equals(courseId)){
                courseList.remove(index);
                break;
            }
        }

    }

    // todo olmayan bir nesne ise mesaj basmalı mı? ( su an duzgun calisiyor)
    public Optional<Course> update(Course course) {
        int index = 0;

        for (; index < courseList.size(); index++ ){
            if(courseList.get(index).getId().equals(course.getId())){
                courseList.remove(index);
                courseList.add(course);
                return Optional.of(course);
            }
        }

        return Optional.empty();
    }

    public Optional<Course> getCourseById(Long id) {
        Course course = courseList.stream()
                .filter(t -> id.equals(t.getId()))
                .findFirst()
                .orElse(null);

        return Optional.ofNullable(course);
    }

    public List<Course> getAll() {
        // todo fiyatı 0 ise FREE mi yazmalı? ama o zaman String tutmak gerek
        return courseList;
    }
}
