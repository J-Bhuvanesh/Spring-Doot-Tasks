package com.example.Validation.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Validation.user.entity.User;



public interface UserRepository extends JpaRepository<User,Integer>{


}
