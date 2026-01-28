package com.ktdsuniversity.edu.inheritance.vehicle;

public class EV extends Vehicle {

	private int batteryAmount;

	public EV(String modelName, int batteryAmount) {
		super(modelName);

		this.batteryAmount = batteryAmount;
	}

	public void checkingBattery() {
		String modelName = super.getModelName();

		System.out.println(modelName + "차량의 현재 남은 배터리 양은 " + batteryAmount + "입니다.");
	}

}
