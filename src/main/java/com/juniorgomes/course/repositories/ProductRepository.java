package com.juniorgomes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juniorgomes.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
