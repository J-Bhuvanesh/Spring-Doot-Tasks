package com.facebook.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.facebook.model.Group;
@Repository
public interface GroupRepository  extends JpaRepository<Group,Long>{

	Group findByGroupName(String name);

     boolean existsByGroupName(String name);

	Object deleteByGroupName(String name);

}
