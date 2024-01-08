package com.sutanu.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sutanu.main.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, String>{

}
