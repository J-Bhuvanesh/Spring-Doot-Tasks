package com.example.O2O.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.O2O.entity.Car;

public interface CarRepository  extends JpaRepository<Car,Integer>{

}
