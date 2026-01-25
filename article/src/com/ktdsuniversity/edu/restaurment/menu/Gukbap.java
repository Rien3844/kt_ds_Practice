package com.ktdsuniversity.edu.restaurment.menu;

public class Gukbap {
	private String name;
	private double weight;
	
	public Gukbap(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getWeight() {
		return this.weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
}
