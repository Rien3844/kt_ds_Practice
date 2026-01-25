package com.ktdsuniversity.edu.restaurment.menu;

public class Drink {
	private String name;
	private double alcohol;
	
	public Drink(String name, double alcohol) {
		this.name = name;
		this.alcohol = alcohol;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getAlcohol() {
		return this.alcohol;
	}
	public void setAlcohol(double alcohol) {
		this.alcohol = alcohol;
	}
}
