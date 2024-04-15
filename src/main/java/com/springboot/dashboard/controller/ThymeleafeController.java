package com.springboot.dashboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dashboard.service.DashboardService;

/**
 * 
 */
@RestController
public class ThymeleafeController {

	@Autowired
	private DashboardService dashboardService;

	@GetMapping("/dashboard")
	public String getDashboardDetails(Model model) {
		model.addAttribute("cr", dashboardService.getTodayRevenueDash());
		model.addAttribute("ei", dashboardService.getAllEmployee());
		model.addAttribute("bc", dashboardService.getBestCategory());
		model.addAttribute("or", dashboardService.getAllOrderReceived());
		model.addAttribute("os", dashboardService.getOrderCollection());
		return "/dashboard";
	}
}
