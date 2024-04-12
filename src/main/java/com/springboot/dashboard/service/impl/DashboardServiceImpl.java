package com.springboot.dashboard.service.impl;

import java.util.List;
import java.util.Map;

import com.springboot.dashboard.entity.CompanyRevenue;
import com.springboot.dashboard.entity.EmployeeInfo;
import com.springboot.dashboard.entity.OrderCollectionStatus;
import com.springboot.dashboard.entity.OrderReceived;
import com.springboot.dashboard.entity.ProductCategory;
import com.springboot.dashboard.service.DashboardService;

public class DashboardServiceImpl implements DashboardService {

	@Override
	public List<CompanyRevenue> getTodayRevenueDashSimple() {
		return null;
	}

	@Override
	public List<ProductCategory> getBestCategorySimple() {
		return null;
	}

	@Override
	public List<OrderReceived> getAllOrderReceivedSimple() {
		return null;
	}

	@Override
	public List<OrderCollectionStatus> getOrderCollectionSimple() {
		return null;
	}

	@Override
	public List<EmployeeInfo> getAllEmployee() {
		return null;
	}

	@Override
	public Map<String, Object> getTodayRevenueDash() {
		return null;
	}

	@Override
	public Map<String, Object> getBestCategory() {
		return null;
	}

	@Override
	public Map<String, Object> getAllOrderReceived() {
		return null;
	}

	@Override
	public Map<String, Object> getOrderCollection() {
		return null;
	}

	@Override
	public EmployeeInfo addEmployee(EmployeeInfo employeeInfo) {
		return null;
	}

	@Override
	public EmployeeInfo getEmployee(String pk) {
		return null;
	}

	@Override
	public EmployeeInfo updateEmployee(EmployeeInfo employeeInfo) {
		return null;
	}

	@Override
	public void deleteEmployee(EmployeeInfo employeeInfo) {

	}

}
