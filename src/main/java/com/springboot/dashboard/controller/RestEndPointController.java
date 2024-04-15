package com.springboot.dashboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dashboard.entity.EmployeeInfo;
import com.springboot.dashboard.service.DashboardService;

@RestController
public class RestEndPointController {

	@Autowired
	private DashboardService dashboardService;

	@RequestMapping("/employee")
	public List<EmployeeInfo> getAllEmployee() {
		return dashboardService.getAllEmployee();
	}

	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public String employeeAdd(@RequestBody EmployeeInfo employeeInfo) {
		if (dashboardService.addEmployee(employeeInfo) != null) {
			return "Employee data saved successfully";
		} else {
			return "Error in saving employee data";
		}
	}

}
