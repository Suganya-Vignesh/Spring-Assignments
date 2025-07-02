package com.sugan.autowire;

import org.springframework.stereotype.Component;

@Component
public class Backend implements Icourse {

	@Override
	public void showCourses() {
		System.out.println("Backend");
	}

}
