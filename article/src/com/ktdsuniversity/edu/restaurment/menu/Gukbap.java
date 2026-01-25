package com.ktdsuniversity.edu.restaurment.menu;

public class Gukbap {
	private String name;
	private int weight;
	private int price;
	
	public Gukbap(String name, int weight, int price) {
		this.name = name;
		this.weight = weight;
		this.price = price;
		
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getWeight() {
		return this.weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
