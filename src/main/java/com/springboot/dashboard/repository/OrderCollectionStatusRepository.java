package com.springboot.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.dashboard.entity.OrderCollectionStatus;

@Repository
public interface OrderCollectionStatusRepository extends JpaRepository<OrderCollectionStatus, Long> {

}
