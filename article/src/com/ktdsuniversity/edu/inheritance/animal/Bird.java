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
	
	// Bird 클래스의 최종 Super Class 인 Object 클래스의 toString()메소드를 다시 정의한다.
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = "Bird [name: %s, isFly: %s]";
		return str.formatted(super.getName(), this.isFly);
	}
}
