package com.kr.vikash.springbootpostgrescrud.repository;

import org.springframework.stereotype.Repository;

import com.kr.vikash.springbootpostgrescrud.entity.Product;

@Repository
public class ProductRepository extends JpaRepository<Product, Long> {

}
