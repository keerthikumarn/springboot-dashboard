package com.springboot.dashboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.dashboard.entity.EmployeeInformation;
import com.springboot.dashboard.service.DashboardService;

@RestController
public class RestEndPointController {

	@Autowired
	private DashboardService dashboardService;

	@RequestMapping("/employee")
	public List<EmployeeInformation> getAllEmployee() {
		return dashboardService.getAllEmployee();
	}

	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public String employeeAdd(@RequestBody EmployeeInformation employeeInfo) {
		if (dashboardService.addEmployee(employeeInfo) != null) {
			return "Employee data saved successfully";
		} else {
			return "Error in saving employee data";
		}
	}

	@RequestMapping(value = "/employee", method = RequestMethod.DELETE)
	public String employeeAdd(@RequestParam(name = "empId", required = true) String pk) {
		try {
			dashboardService.deleteEmployee(dashboardService.getEmployee(pk));
			return "Deleting employee successfully";

		} catch (Exception e) {
			return "Error in deleting employee";
		}
	}

}
