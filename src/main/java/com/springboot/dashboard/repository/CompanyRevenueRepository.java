package com.springboot.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.dashboard.entity.CompanyRevenue;

@Repository
public interface CompanyRevenueRepository extends JpaRepository<CompanyRevenue, Long> {

}
