package com.juniorgomes.course.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.juniorgomes.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
}
