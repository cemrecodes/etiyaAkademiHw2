package com.etiya.etiyaakademihw2.service;

import com.etiya.etiyaakademihw2.entity.Course;
import com.etiya.etiyaakademihw2.repository.CourseRepository;
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;
    private static Long idStart = 0L;
    @PostConstruct
    public void init() {
        Course course1 = new Course();
        course1.setCourseName("Java İleri Seviye");
        course1.setDescription("Java programlama bilginizi ilerletmek için bu kursa katılın!");
        course1.setCategory("Programlama");
        course1.setInstructor("Cemre Şenyuva");
        this.saveCourse(course1);

        Course course2 = new Course();
        course2.setCourseName("Angular ile Frontend Programlamaya Giriş");
        course2.setDescription("Bu kursta Angular framework, Javascript, HTML ve CSS öğreneceksiniz.");
        course2.setCategory("Programlama");
        course2.setInstructor("Şevval Bulut");
        this.saveCourse(course2);

        Course course3 = new Course();
        course3.setCourseName("Docker Temelleri");
        course3.setDescription("Devops ve çoğu backendçi için olmazsa olmaz olan containerlaştırma teknolojisi Docker'a giriş.");
        course3.setCategory("Devops");
        course3.setInstructor("Ezgi Yılmaz");
        this.saveCourse(course3);

        System.out.println("Courses added: " + this.getAllCourses());
    }
    public Course saveCourse(Course course){
        course.setId(idStart + 1);
        idStart = idStart + 1;
        return courseRepository.save(course);
    }

    public void deleteCourse(Long courseId){
        courseRepository.delete(courseId);
    }

    public Optional<Course> updateCourse(Course course){

        return courseRepository.update(course);
    }

    public Optional<Course> getCourse(Long id){
        return courseRepository.getCourseById(id);
    }

    public List<Course> getAllCourses(){
        return courseRepository.getAll();
    }




}
