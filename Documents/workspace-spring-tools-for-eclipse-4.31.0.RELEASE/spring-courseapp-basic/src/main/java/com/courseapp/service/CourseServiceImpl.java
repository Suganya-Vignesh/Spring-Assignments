package com.courseapp.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courseapp.exception.CourseNotFoundException;
import com.courseapp.model.Course;
import com.courseapp.util.CourseUtil;

@Service
public class CourseServiceImpl implements ICourseService{
	
	private CourseUtil courseutil;

	@Autowired
	public void setCourseutil(CourseUtil courseutil) {
		this.courseutil = courseutil;
	}

	@Override
	public List<Course> getAll() {
		return courseutil.getAllCourses();
	}

	@Override
	public Course getById(int courseId) {
		List<Course> courses = courseutil.getAllCourses();
		return courses
				.stream().filter(c->c.getCourseId()==courseId)
				.findFirst().orElseThrow(()->{
					throw new CourseNotFoundException("invalid id");
				});
	}

	@Override
	public List<Course> getByType(String type) {
		List<Course> courses = courseutil.getAllCourses();
		List<Course> ncourse = courses.stream()
				.filter(c->c.getType().equals(type))
				.toList();
		if(ncourse.isEmpty())
			throw new CourseNotFoundException("invalid type");
		return ncourse;
	}

	@Override
	public List<Course> getByLessDurationAndCost(int duration, double cost) {
		List<Course> courses = courseutil.getAllCourses();
		return courses.stream()
		.filter((c->c.getDurationInWeeks()<duration && c.getCost()<cost))
		.collect(Collectors.toList());
	}

	@Override
	public List<String> getCourseNames() {
		List<Course> courses= courseutil.getAllCourses();
		return courses.stream()
				.map(n->n.getCourseName()).toList();
		
	}

}
