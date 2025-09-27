package com.example.multi_container.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.multi_container.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
