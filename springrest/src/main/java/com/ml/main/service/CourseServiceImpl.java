package com.ml.main.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ml.main.entity.Course;

@Service
public class CourseServiceImpl implements CourseService 
{

	List<Course> list;
	public CourseServiceImpl()
	{
		list = new ArrayList<>();
		list.add(new Course(145,"Java", "This Course"));
		list.add(new Course(146, "C++","This Course"));
	}
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

}
