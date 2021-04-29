package com.example.O2O;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.O2O.entity.Car;
import com.example.O2O.entity.Owner;
import com.example.O2O.repository.CarRepository;
import com.example.O2O.repository.OwnerRepository;

@SpringBootApplication
public class SpringBootOneToOneUsingMySqlApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext r=
		SpringApplication.run(SpringBootOneToOneUsingMySqlApplication.class, args);
		CarRepository carRepository=r.getBean(CarRepository.class);
		OwnerRepository ownerRepository=r.getBean(OwnerRepository.class);
		
		Owner owner=new Owner("bhuvanesh",20);
		ownerRepository.save(owner);
		
		Car car=new Car ("renault",67);
		car.setOwner(owner);
		carRepository.save(car);
		
		
		
	}

}
