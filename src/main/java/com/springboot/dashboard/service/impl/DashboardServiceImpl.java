package com.springboot.dashboard.service.impl;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

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

@Service
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
		Map<String, Object> bestProductMap = new HashMap<>();
		List<ProductCategory> bestCategoryList = productCategoryRepo.findByBestCategory(true);
		List<String> label = new ArrayList<>();
		List<String> percent = new ArrayList<>();
		bestCategoryList.stream().forEach(prodCategory -> {
			label.add(prodCategory.getCategoryName());
			percent.add(String.valueOf(prodCategory.getPercentage()));
		});
		bestProductMap.put("bcLabels", label.toString());
		bestProductMap.put("bcPercents", percent.toString());
		return bestProductMap;
	}

	@Override
	public Map<String, Object> getAllOrderReceived() {
		List<OrderReceived> orderReceivedList = orderReceivedRepo.findAll(Sort.by("pk"));
		Map<String, Object> orderReceivedMap = new HashMap<>();

		List<String> label = new ArrayList<>();
		List<String> order = new ArrayList<>();

		orderReceivedList.stream().forEach(orderReceived -> {
			label.add(orderReceived.getDateReceived());
			order.add(String.valueOf(orderReceived.getOrderReceived()));
		});
		orderReceivedMap.put("orLabels", label.toString());
		orderReceivedMap.put("orOrders", order.toString());
		return orderReceivedMap;
	}

	@Override
	public Map<String, Object> getOrderCollection() {
		List<OrderCollectionStatus> orderStatusList = orderCollectionStatusRepo.findAll();
		Map<String, Object> orderStatusMap = new HashMap<>();
		Locale locale = new Locale("en", "US");
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);

		int totalNewOrders = 0;
		double totalRevenue = 0;
		int totalShippedOrders = 0;
		int totalReturnInitiatedOrders = 0;

		for (OrderCollectionStatus orderCollectionStatus : orderStatusList) {
			totalNewOrders += orderCollectionStatus.getNewOrders();
			totalRevenue += orderCollectionStatus.getRevenue();
			totalShippedOrders += orderCollectionStatus.getShipped();
			totalReturnInitiatedOrders += orderCollectionStatus.getReturned();
		}

		orderStatusMap.put("totalNewOrders", totalNewOrders);
		orderStatusMap.put("totalRevenue", currencyFormat.format(totalRevenue));
		orderStatusMap.put("totalShippedOrders", totalShippedOrders);
		orderStatusMap.put("totalReturnInitiatedOrders", totalReturnInitiatedOrders);
		return null;
	}

	@Override
	public EmployeeInfo addEmployee(EmployeeInfo employeeInfo) {
		return employeeInfoRepo.save(employeeInfo);
	}

	@Override
	public EmployeeInfo getEmployee(String pk) {
		return employeeInfoRepo.findByPk(pk);
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
