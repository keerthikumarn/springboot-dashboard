package com.springboot.dashboard.service;

import java.util.List;
import java.util.Map;

import com.springboot.dashboard.entity.CompanyRevenue;
import com.springboot.dashboard.entity.EmployeeInformation;
import com.springboot.dashboard.entity.OrderCollectionStatus;
import com.springboot.dashboard.entity.OrderReceived;
import com.springboot.dashboard.entity.ProductCategory;

public interface DashboardService {

	List<CompanyRevenue> getTodayRevenueDashSimple();

	List<ProductCategory> getBestCategorySimple();

	List<OrderReceived> getAllOrderReceivedSimple();

	List<OrderCollectionStatus> getOrderCollectionSimple();

	List<EmployeeInformation> getAllEmployee();

	Map<String, Object> getTodayRevenueDash();

	Map<String, Object> getBestCategory();

	Map<String, Object> getAllOrderReceived();

	Map<String, Object> getOrderCollection();

	EmployeeInformation addEmployee(EmployeeInformation employeeInfo);

	EmployeeInformation getEmployee(final String pk);

	EmployeeInformation updateEmployee(EmployeeInformation employeeInfo);

	void deleteEmployee(EmployeeInformation employeeInfo);

}
