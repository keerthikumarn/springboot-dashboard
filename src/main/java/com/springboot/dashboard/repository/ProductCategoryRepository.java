package com.springboot.dashboard.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.dashboard.entity.ProductCategory;

@Repository
@Qualifier(value = "ProductCategoryRepository")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {

	List<ProductCategory> findByBestCategory(boolean bestCategory);
}
