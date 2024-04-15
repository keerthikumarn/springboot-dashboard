package com.springboot.dashboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppErrorController implements ErrorController {

	private final static String ERROR_PATH = "/error";
	
	@Autowired
	private ErrorAttributes errorAttributes;
	
	

}
