package com.example.demo.controller;

import com.example.demo.model.Courses;
import com.example.demo.service.CoursesService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/courses")
@AllArgsConstructor
public class CoursesController {
    private CoursesService coursesService;

    @GetMapping()
    public List<Courses> getCourses(){ return coursesService.getCourses();}

    @GetMapping("/{id}")
    public Courses getCoursesById(@PathVariable Long id){
        return coursesService.getCoursesById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        coursesService.deleteCourses(id);
    }


}
