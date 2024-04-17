package com.springboot.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.dashboard.entity.EmployeeInformation;

@Repository
public interface EmployeeInfoRepository extends JpaRepository<EmployeeInformation, Long> {

	public EmployeeInformation findByPk(final Long pk);

}
