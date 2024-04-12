package com.springboot.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.dashboard.entity.OrderReceived;

@Repository
public interface OrderReceivedRepository extends JpaRepository<OrderReceived, Long> {

}
