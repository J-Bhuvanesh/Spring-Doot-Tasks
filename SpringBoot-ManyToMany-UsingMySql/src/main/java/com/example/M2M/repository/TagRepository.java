package com.example.M2M.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.M2M.entity.Tags;
@Repository

public interface TagRepository extends JpaRepository<Tags, Long>{

}
