package com.springboot.dashboard.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_received")
public class OrderReceived extends KeyEntity{

	@Column
	private int orderReceived;

	@Column
	private String dateReceived;

	public int getOrderReceived() {
		return orderReceived;
	}

	public void setOrderReceived(int orderReceived) {
		this.orderReceived = orderReceived;
	}

	public String getDateReceived() {
		return dateReceived;
	}

	public void setDateReceived(String dateReceived) {
		this.dateReceived = dateReceived;
	}

}
