package com.example.demo.service;

import com.example.demo.model.Courses;
import com.example.demo.repository.CoursesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor


public class CoursesService {
    private CoursesRepository coursesRepository;

    public List<Courses> getCourses() { return coursesRepository.findAll();}

    public Courses getCoursesById(Long id) {
        return coursesRepository.findById(id).get();
    }

    public void deleteCourses(Long id){
        Optional<Courses> courses = coursesRepository.findById(id);
        if (courses.isPresent()){
            coursesRepository.delete(courses.get());
        }
    }
}
