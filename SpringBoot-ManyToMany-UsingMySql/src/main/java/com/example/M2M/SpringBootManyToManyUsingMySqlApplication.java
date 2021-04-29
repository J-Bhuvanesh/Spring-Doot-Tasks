package com.example.M2M;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.M2M.entity.Post;
import com.example.M2M.entity.Tags;
import com.example.M2M.repository.PostRepository;
import com.example.M2M.repository.TagRepository;

@SpringBootApplication
public class SpringBootManyToManyUsingMySqlApplication implements CommandLineRunner{
	
	@Autowired
	private PostRepository postRepository;
	@Autowired
	private TagRepository tagRepository;
	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootManyToManyUsingMySqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Post post=new Post("many to many",
				"this is the example of many to many relation",
				"m2m");
		Post post1=new Post("one to many",
				"this is the example of one to many relation",
				"m2m");
		Tags springboot=new Tags("spring boot m2m");
		Tags hibernate=new Tags("example m2m with hibernate");
		
		post.getTags().add(springboot);
		post.getTags().add(hibernate);
		springboot.getPosts().add(post);
		hibernate.getPosts().add(post);
		
		post1.getTags().add(hibernate);
		post1.getTags().add(springboot);
		springboot.getPosts().add(post1);
		hibernate.getPosts().add(post1);
		
		this.postRepository.save(post);
		
		this.postRepository.save(post1);

		
	}

}
