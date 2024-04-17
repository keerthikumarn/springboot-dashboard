package com.springboot.dashboard.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.dashboard.entity.EmployeeInformation;


@Repository
@Qualifier(value = "EmployeeInformationRepository")
public interface EmployeeInformationRepository extends JpaRepository<EmployeeInformation, Long> {

    public EmployeeInformation findByPk(final String pk);
}
