package com.courseapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Course {
	
private String courseName;
private Integer courseId;
private String type;
private double cost;
private int durationInWeeks;

}
