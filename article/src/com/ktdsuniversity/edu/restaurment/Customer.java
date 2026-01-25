package com.ktdsuniversity.edu.restaurment;
// 손님 클래스
// 손님의 취함, 배부름정도

public class Customer {
	
	private int cusFullness;
	private double cusDrunk;
	private int cusMoney;
	
	public Customer(int cusFullness, double cusDrunk, int cusMoney) {
		this.cusFullness = cusFullness;
		this.cusDrunk = cusDrunk;
		this.cusMoney = cusMoney;
	}
	
	public int getCusFullness() {
		return this.cusFullness;
	}
	public void setCusFullness(int cusFullness) {
		this.cusFullness = cusFullness;
	}
	
	public double getCusDrunk() {
		return this.cusDrunk;
	}
	public void setCusDrunk(double cusDrunk) {
		this.cusDrunk = cusDrunk;
	}
	
	public int getCusMoney() {
		return this.cusMoney;
	}
	public void setCusMoney(int cusMoney) {
		this.cusMoney = cusMoney;
	}
	
	public void gukbapOrder(TheOriginalGukbap theOriginalGukbap, int gukbapIndex) {
		if(gukbapIndex < 0 || gukbapIndex >= theOriginalGukbap.gukbaps.length) {
			System.out.println("존재하지 않는 메뉴입니다.");
			
			return;
		}
		
		if(!theOriginalGukbap.isFullness(this.cusFullness)) {
			this.setCusFullness(this.getCusFullness() + 
					theOriginalGukbap.gukbaps[gukbapIndex].getWeight());
			System.out.println("손님이 음식을 먹습니다. 포만감이 " + 
					theOriginalGukbap.gukbaps[gukbapIndex].getWeight() + 
					"만큼 차오릅니다.");
		}else {
			System.out.println("배부른 손님에게 음식은 안팝니다.");
			
			return;
		}

		System.out.println("손님 배부름 정도 : " + this.cusFullness + 
				" / 식당의 배부름 기준 : " + theOriginalGukbap.getFullnessStd());
		System.out.println();
	}
	
	public void drinkOrder(TheOriginalGukbap theOriginalGukbap, int drinkIndex) {
		if(drinkIndex < 0 || drinkIndex >= theOriginalGukbap.drinks.length) {
			System.out.println("존재하지 않는 메뉴입니다.");
			
			return;
		}
		
		if(!theOriginalGukbap.isDrunk(this.cusDrunk)) {
			this.setCusDrunk(this.getCusDrunk() + 
					theOriginalGukbap.drinks[drinkIndex].getAlcohol());
			System.out.println("손님이 술을 마십니다. 취함정도가 " + 
					theOriginalGukbap.drinks[drinkIndex].getAlcohol() +
					"만큼 차오릅니다.");
		}else {
			System.out.println("취한 손님에게 술은 안팝니다.");
			
			return;
		}
		
		System.out.println("손님 취함 정도 : " + this.cusDrunk + 
				" / 식당의 취함 기준 : " + theOriginalGukbap.getDrunkStd());
		System.out.println();
	}
}