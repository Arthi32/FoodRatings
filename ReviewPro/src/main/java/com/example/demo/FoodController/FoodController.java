package com.example.demo.FoodController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.FoodModel.FoodDetails;
import com.example.demo.FoodService.FoodService;

@RestController
@RequestMapping("/Food")
public class FoodController {
	@Autowired
	FoodService foservice;
	@PostMapping("")
	public String create(@RequestBody FoodDetails food)
	{
		return foservice.addFood(food);
	}
	@GetMapping("")
	public List<FoodDetails> read()
	{
		return foservice.getFood();
	}
	@GetMapping("/{id}")
	public Optional<FoodDetails>readById(@PathVariable int id)
	{
		return foservice.getFoodById(id);
	}
	@PutMapping("/put")
	public String update(@RequestBody FoodDetails food)
	{
		return foservice.updateFood(food);
	}
	@DeleteMapping("/delete")
	public String delete(@RequestParam("fid") int id)
	{
		foservice.deleteByRequestParam(id);
		return "deleted";
		
	}

}
