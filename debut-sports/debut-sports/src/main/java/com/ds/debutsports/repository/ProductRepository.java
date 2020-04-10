package com.ds.debutsports.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ds.debutsports.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
