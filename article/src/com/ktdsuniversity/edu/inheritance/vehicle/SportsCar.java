package com.ktdsuniversity.edu.inheritance.vehicle;

public class SportsCar extends Vehicle {

	private boolean enabledTurbo;

	public SportsCar(String modelName) {
		super(modelName);
	}

	public void turboMode() {
		this.enabledTurbo = !this.enabledTurbo;

		String modelName = super.getModelName();
		if (this.enabledTurbo) {
			System.out.println(modelName + "차량의 터보모드를 실행합니다.");
		} else {
			System.out.println(modelName + "차량의 터보모드를 종료합니다.");
		}
	}

}
