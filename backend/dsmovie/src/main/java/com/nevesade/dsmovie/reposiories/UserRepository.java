package com.nevesade.dsmovie.reposiories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nevesade.dsmovie.entities.User;

public interface UserRepository extends JpaRepository< User, Long> {
	
	User findByEmail(String email);
	

}


