package com.courseapp.util;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.courseapp.model.Course;
import com.courseapp.model.CourseType;

@Component
public class CourseUtil {
	public List<Course> getAllCourses(){
		return Arrays.asList(
				new Course("Java", 1, CourseType.BACKEND.name(), 2000, 2),
				new Course("Spring", 2, CourseType.BACKEND.name(), 4000, 4),
				new Course("Microservices", 3, CourseType.BACKEND.name(), 6000, 6),
				new Course("HTML", 4, CourseType.FRONTEND.name(), 5000, 5),
				new Course("React", 5, CourseType.FRONTEND.name(), 3000, 3),
				new Course("CSS", 6, CourseType.FRONTEND.name(), 1000, 1),
				new Course("Azure", 7, CourseType.CLOUDCOMPUTING.name(), 10000, 10),
				new Course("AWS", 8, CourseType.CLOUDCOMPUTING.name(), 11000, 11),
				new Course("GCP", 9, CourseType.CLOUDCOMPUTING.name(), 12000, 12),
				new Course("Python", 10, CourseType.AI.name(), 7000, 7)
				);
	}
}
