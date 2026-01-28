package com.ktdsuniversity.edu.inheritance.vehicle;

public class BatMobile extends SportsCar {

	private boolean isDetachBatPod;

	public BatMobile(String modelName) {
		super(modelName, "부아아아ㅏ아아아아앙!");
	}

	public void detachBatPod() {
		this.isDetachBatPod = !this.isDetachBatPod;

		String modelName = super.getModelName();
		if (this.isDetachBatPod) {
			System.out.println(modelName + "차량의 배트포드 분리됐습니다.");
		} else {
			System.out.println(modelName + "차량의 배트포드 결합됐습니다.");
		}
	}

}
