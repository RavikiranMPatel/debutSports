package com.ds.debutsports.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ds.debutsports.entity.ProductCategory;

@RepositoryRestResource(collectionResourceRel="productCateogry", path="product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long>{

}
