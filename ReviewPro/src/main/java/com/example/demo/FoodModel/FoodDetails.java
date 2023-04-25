package com.example.demo.FoodModel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity


public class FoodDetails {
	@Id
	 
	private int id;
	private String Type;
	private String Name;
	private int Ratings;
	@Override
	public String toString() {
		return "FoodDetails [id=" + id + ", Type=" + Type + ", Name=" + Name + ", Ratings=" + Ratings + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRatings() {
		return Ratings;
	}
	public void setRatings(int ratings) {
		Ratings = ratings;
	}
}
	