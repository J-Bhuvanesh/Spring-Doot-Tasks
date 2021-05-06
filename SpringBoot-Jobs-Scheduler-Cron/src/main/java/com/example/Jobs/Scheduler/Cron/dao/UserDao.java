package com.example.Jobs.Scheduler.Cron.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Jobs.Scheduler.Cron.model.User;


public interface UserDao extends JpaRepository<User,Integer>{

}
