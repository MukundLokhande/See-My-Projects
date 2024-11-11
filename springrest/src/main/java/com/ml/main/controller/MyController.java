package com.ml.main.controller;

import org.springframework.web.bind.annotation.RestController;

import com.ml.main.entity.Course;
import com.ml.main.service.CourseService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class MyController 
{
	@Autowired
	private CourseService courseService;
	@GetMapping("/home")
	public String home()
	{
		return "This is Home Page";
	}
	
	//Get Courses
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
		return this.courseService.getCourses();
	}
}
