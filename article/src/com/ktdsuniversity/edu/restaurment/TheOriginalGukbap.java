package com.ktdsuniversity.edu.restaurment;
//식당 클래스
//사장의 배부름, 취함 기준
// 사장의 기준을 먼저 상수로 잡아둔다.
//필요한 변수? 음식 무게, 술 알콜정도
public class TheOriginalGukbap {
	private final int FULLNESSSTD = 90; //식당 사장의 배부름 기준
	private final double DRUNKSTD = 8.0; //식당 사장의 취함 기준
	
	private int weight; // 음식의 무게
	private double alcohol; // 술의 알콜농도
	
	public int getFULLNESSSTD() {
		return this.FULLNESSSTD;
	}
	//====
	public double getDRUNKSTD() {
		return this.DRUNKSTD;
	}
	//====
	public int getWeight() {
		return this.weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	//====
	public double getAlcohol() {
		return this.alcohol;
	}
	public void setAlcohol(double alcohol) {
		this.alcohol = alcohol;
	}
	//====
	public boolean isFullness(int cusFullness) {
		//임마 배부름?
		return FULLNESSSTD >= cusFullness;
	}
	
	public void sellFood(int cusFullness) {
		boolean isFullness = this.isFullness(cusFullness);
		if(isFullness) {
			//안팜.
			System.out.println("배부른 손님에게 음식은 안팝니다.");
		}else {
			//음식팜
			//음식의 무게만큼 손님 배부름 증가
			this.weight += cusFullness;
		}
	}
	
	public boolean isDrunk(double cusDrunk) {
		return DRUNKSTD >= cusDrunk;
	}
	
	public void sellDrink(double cusDrunk) {
		boolean isDrunk = this.isDrunk(cusDrunk);
		double alcoholConcentration = this.alcohol * 0.1;
		
		if(isDrunk) {
			System.out.println("술 취한 손님에게 술 안팝니다.");
		}else {
			//술팜
			//술의 알콜정도 *0.1만큼 손님 취함수치 증가
			alcoholConcentration += cusDrunk;
		}
	}
}
