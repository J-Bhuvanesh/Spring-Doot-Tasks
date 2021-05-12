package com.SpringBoot.Middlewares.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.Middlewares.entity.User;
@Repository
public interface UserRepository  extends JpaRepository<User,Integer>{

}
