package com.springboot.dashboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dashboard.model.Course;
import com.springboot.dashboard.model.CourseConfiguration;

@RestController
public class RestEndPoints {

	@Value("${default.course.name}")
	private String name;

	@Value("${default.course.chapterCount}")
	private int chapterCount;

	@Autowired
	private CourseConfiguration courseConfiguration;

	@RequestMapping("/defaultcourse")
	public Course getDefaultEndpoint() {
		return new Course(this.name, this.chapterCount);
	}

}
