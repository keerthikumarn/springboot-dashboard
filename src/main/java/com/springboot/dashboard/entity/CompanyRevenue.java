package com.springboot.dashboard.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "company_revenue")
public class CompanyRevenue  extends KeyEntity {

    @Column(nullable = false)
    private String revenueMonth;

    @Column(nullable = false)
    private double revenue;

    @Column
    private double expense;

    @Column
    private double margins;

    public String getRevenueMonth() {
		return revenueMonth;
	}

	public void setRevenueMonth(String revenueMonth) {
		this.revenueMonth = revenueMonth;
	}

	public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public double getExpense() {
        return expense;
    }

    public void setExpense(double expense) {
        this.expense = expense;
    }

    public double getMargins() {
        return margins;
    }

    public void setMargins(double margins) {
        this.margins = margins;
    }
}
