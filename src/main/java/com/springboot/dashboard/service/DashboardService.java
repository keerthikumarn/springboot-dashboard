package com.springboot.dashboard.service;

import java.util.List;
import java.util.Map;

import com.springboot.dashboard.entity.CompanyRevenue;
import com.springboot.dashboard.entity.EmployeeInfo;
import com.springboot.dashboard.entity.OrderCollectionStatus;
import com.springboot.dashboard.entity.OrderReceived;
import com.springboot.dashboard.entity.ProductCategory;

public interface DashboardService {

	List<CompanyRevenue> getTodayRevenueDashSimple();

	List<ProductCategory> getBestCategorySimple();

	List<OrderReceived> getAllOrderReceivedSimple();

	List<OrderCollectionStatus> getOrderCollectionSimple();

	List<EmployeeInfo> getAllEmployee();

	Map<String, Object> getTodayRevenueDash();

	Map<String, Object> getBestCategory();

	Map<String, Object> getAllOrderReceived();

	Map<String, Object> getOrderCollection();

	EmployeeInfo addEmployee(EmployeeInfo employeeInfo);

	EmployeeInfo getEmployee(final String pk);

	EmployeeInfo updateEmployee(EmployeeInfo employeeInfo);

	void deleteEmployee(EmployeeInfo employeeInfo);

}
