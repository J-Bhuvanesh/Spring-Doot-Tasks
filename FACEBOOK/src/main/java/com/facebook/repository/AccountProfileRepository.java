package com.facebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.facebook.model.AccountProfile;

public interface AccountProfileRepository extends JpaRepository<AccountProfile,Integer>{

}
