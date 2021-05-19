package com.facebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.facebook.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

}
