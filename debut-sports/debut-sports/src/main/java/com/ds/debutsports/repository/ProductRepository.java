package com.ds.debutsports.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ds.debutsports.entity.Product;

@CrossOrigin("*")
public interface ProductRepository extends JpaRepository<Product, Long>{
	
	@RestResource(path = "categoryid")
	Page<Product> findByProductCategoryId(@Param("id") Long id, Pageable pageable);
	
	@RestResource(path = "searchbykeyword")
	Page<Product> findByNameContaining(@Param("name") String keyword, Pageable pageable);

}
