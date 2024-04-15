package com.springboot.dashboard.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("course")
public record CourseConfiguration(@Value("${course.name}") String name,
		@Value("${course.chapterCount}") int chapterCount, @Value("${course.rating}") int rating,
		@Value("${course.author}") String author) {

}
