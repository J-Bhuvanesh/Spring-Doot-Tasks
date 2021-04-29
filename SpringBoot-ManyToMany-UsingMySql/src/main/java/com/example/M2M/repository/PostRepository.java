package com.example.M2M.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.M2M.entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{

}
