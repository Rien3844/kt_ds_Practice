package com.ktdsuniversity.edu.restaurment.menu;

public class Drink {
	private String name;
	private double alcohol;
	private int price;
	
	public Drink(String name, double alcohol, int price) {
		this.name = name;
		this.alcohol = alcohol;
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getAlcohol() {
		return this.alcohol * 0.1;
	}
	public void setAlcohol(double alcohol) {
		this.alcohol = alcohol;
	}
	
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
