package com.juniorgomes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juniorgomes.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
