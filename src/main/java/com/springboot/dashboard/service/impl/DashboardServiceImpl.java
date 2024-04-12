package com.springboot.dashboard.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.dashboard.entity.CompanyRevenue;
import com.springboot.dashboard.entity.EmployeeInfo;
import com.springboot.dashboard.entity.OrderCollectionStatus;
import com.springboot.dashboard.entity.OrderReceived;
import com.springboot.dashboard.entity.ProductCategory;
import com.springboot.dashboard.repository.CompanyRevenueRepository;
import com.springboot.dashboard.repository.EmployeeInfoRepository;
import com.springboot.dashboard.repository.OrderCollectionStatusRepository;
import com.springboot.dashboard.repository.OrderReceivedRepository;
import com.springboot.dashboard.repository.ProductCategoryRepository;
import com.springboot.dashboard.service.DashboardService;

public class DashboardServiceImpl implements DashboardService {

	@Autowired
	private CompanyRevenueRepository companyReveneueRepo;

	@Autowired
	private ProductCategoryRepository productCategoryRepo;

	@Autowired
	private OrderReceivedRepository orderReceivedRepo;

	@Autowired
	private OrderCollectionStatusRepository orderCollectionStatusRepo;

	@Autowired
	private EmployeeInfoRepository employeeInfoRepo;

	@Override
	public List<CompanyRevenue> getTodayRevenueDashSimple() {
		return companyReveneueRepo.findAll();
	}

	@Override
	public List<ProductCategory> getBestCategorySimple() {
		return productCategoryRepo.findAll();
	}

	@Override
	public List<OrderReceived> getAllOrderReceivedSimple() {
		return orderReceivedRepo.findAll();
	}

	@Override
	public List<OrderCollectionStatus> getOrderCollectionSimple() {
		return orderCollectionStatusRepo.findAll();
	}

	@Override
	public List<EmployeeInfo> getAllEmployee() {
		return employeeInfoRepo.findAll();
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
		return employeeInfoRepo.save(employeeInfo);
	}

	@Override
	public EmployeeInfo getEmployee(String pk) {
		return null;
	}

	@Override
	public EmployeeInfo updateEmployee(EmployeeInfo employeeInfo) {
		return employeeInfoRepo.save(employeeInfo);
	}

	@Override
	public void deleteEmployee(EmployeeInfo employeeInfo) {
		employeeInfoRepo.delete(employeeInfo);
	}

}
