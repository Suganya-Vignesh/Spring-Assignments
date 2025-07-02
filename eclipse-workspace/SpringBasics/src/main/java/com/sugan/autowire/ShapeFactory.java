package com.sugan.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShapeFactory {
	@Autowired
	@Qualifier("backend")
	private Icourse course;
	
	void printCourses() {
		course.showCourses();
	}
}
