package com.ktdsuniversity.edu.inheritance.animal;

public class Bird extends Animal {

	private boolean isFly;
	private float walkingSpeed;

	public Bird(String name, String voice, float speed, float damage, float hitPoint) {
		super(name, voice, speed, damage, hitPoint);
		this.walkingSpeed = speed;
	}
	
	public boolean getIsFly() {
		return this.isFly;
	}
	
	public void setIsFly(boolean isFly) {
		this.isFly = isFly;
	}

	public void fly() {
		this.isFly = true;
		super.setSpeed(70f);
	}

	public void land() {
		this.isFly = false;
		super.setSpeed(walkingSpeed);
	}
}
