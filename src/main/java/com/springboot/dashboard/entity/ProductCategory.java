package com.springboot.dashboard.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "product_category")
public class ProductCategory extends KeyEntity {

	@Column
	private String categoryName;

	@Column
	private int percentage;

	@Column
	private boolean bestCategory;

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	public boolean isBestCategory() {
		return bestCategory;
	}

	public void setBestCategory(boolean bestCategory) {
		this.bestCategory = bestCategory;
	}

}
