package com.springboot.dashboard.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

	@RequestMapping("/defaultfullcourse")
	public Map<String, String> getDefaultFullEndpoint() {
		Map<String, String> result = new HashMap<>();
		result.put("name", courseConfiguration.name());
		result.put("author", courseConfiguration.author());
		result.put("chapterCount", courseConfiguration.chapterCount() + "");
		result.put("rating", courseConfiguration.rating() + "");
		return result;
	}

	@RequestMapping("/course")
	public Course getEndpoint(@RequestParam(value = "name", defaultValue = "Spring Boot", required = false) String name,
			@RequestParam(value = "chapterCount", defaultValue = "2", required = false) int chapterCount) {
		return new Course(name, chapterCount);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/course")
	public String saveCourse(@RequestBody Course course) {
		return "your course " + course.name() + " with " + course.chapterCount() + " has saved successfully.";
	}

}
