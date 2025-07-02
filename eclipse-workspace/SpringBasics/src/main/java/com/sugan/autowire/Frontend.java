package com.sugan.autowire;
import org.springframework.stereotype.Component;

@Component
public class Frontend implements Icourse {

	@Override
	public void showCourses() {
		System.out.println("FrontEnd");
	}

}
