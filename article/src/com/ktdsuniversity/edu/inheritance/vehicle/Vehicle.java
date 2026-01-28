package com.ktdsuniversity.edu.inheritance.vehicle;

public class Vehicle {
	private String modelName;
	private boolean isStart;
	private String engineSound;

	public Vehicle(String modelName) {
		this.modelName = modelName;
		this.engineSound = "부릉";
	}
	
	public Vehicle(String modelName, String engineSound) {
		this.modelName = modelName;
		this.engineSound = engineSound;
	}

	public void startEngine() {
		this.isStart = !isStart;
		if (this.isStart) {
			System.out.println(modelName + "의 시동을 겁니다.");
			System.out.println((engineSound));
		} else {
			System.out.println(modelName + "의 시동이 꺼졋습니다.");
		}
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public boolean isStart() {
		return isStart;
	}

	public void setStart(boolean isStart) {
		this.isStart = isStart;
	}
}
