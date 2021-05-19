package com.facebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.facebook.model.Account;

public interface AccountRepository extends JpaRepository<Account,Integer>{

}
