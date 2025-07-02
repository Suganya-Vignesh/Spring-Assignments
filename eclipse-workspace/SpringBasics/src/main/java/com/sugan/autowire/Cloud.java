package com.sugan.autowire;
import org.springframework.stereotype.Component;

@Component
public class Cloud implements Icourse {

	@Override
	public void showCourses() {
		System.out.println("Cloud");
	}

}
