package com.example.demo.FoodService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.FoodModel.FoodDetails;
import com.example.demo.FoodRepository.FoodRepo;

@Service

public class FoodService {
	@Autowired
	FoodRepo repository;
	public String addFood(FoodDetails food)
	{
		repository.save(food);
		return "Added";
	}
	public List<FoodDetails> getFood()
	{
		return repository.findAll();
	}
	public Optional<FoodDetails> getFoodById(int id)
	{
		return repository.findById(id);
	}
	public String updateFood(FoodDetails food)
	{
		repository.save(food);
		return "Updated";
	}
	public void deleteByRequestParam(int id)
	{
		repository.deleteById(id);
}
}
