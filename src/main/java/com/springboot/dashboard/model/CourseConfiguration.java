package com.springboot.dashboard.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("course")
public record CourseConfiguration(String name, int chapterCount, int rating, String author) {

}
