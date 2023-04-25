package com.example.demo.FoodRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.FoodModel.FoodDetails;

@Repository

public interface FoodRepo extends JpaRepository<FoodDetails,Integer> {

}
