package com.juniorgomes.course.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.juniorgomes.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
