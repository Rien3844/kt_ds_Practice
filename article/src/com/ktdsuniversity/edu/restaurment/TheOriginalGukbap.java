package com.ktdsuniversity.edu.restaurment;

import com.ktdsuniversity.edu.restaurment.menu.Drink;
import com.ktdsuniversity.edu.restaurment.menu.Gukbap;

//식당 클래스
//사장의 배부름, 취함 기준
// 사장의 기준을 먼저 상수로 잡아둔다.
//필요한 변수? 음식 무게, 술 알콜정도

public class TheOriginalGukbap {
	Gukbap[] gukbaps;
	Drink[] drinks;
	
	private int fullnessStd; //식당 사장의 배부름 기준
	private double drunkStd; //식당 사장의 취함 기준
	
	public TheOriginalGukbap(int fullnessStd, double drunkStd, Gukbap[] gukbaps, Drink[] drinks) {
		this.fullnessStd = fullnessStd;
		this.drunkStd = drunkStd;
		this.gukbaps = new Gukbap[gukbaps.length];
		for(int i = 0; i < gukbaps.length; i++) {
			this.gukbaps[i] = gukbaps[i];
		}
		this.drinks = new Drink[drinks.length];
		for(int i = 0; i < drinks.length; i++) {
			this.drinks[i] = drinks[i];
		}
	}
	
	
	public boolean isFullness(int cusFullness) {// 배부른지 확인하는 boolean
		return cusFullness >= getFullnessStd();
	}
	
	public boolean isDrunk(double cusDrunk) {
		return cusDrunk >= getDrunkStd();
	}
	//====
	public int getFullnessStd() {
		return this.fullnessStd;
	}
	public void setFullnessStd(int fullnessStd) {
		this.fullnessStd = fullnessStd;
	}
	//====
	public double getDrunkStd() {
		return this.drunkStd;
	}
	public void setDrunkStd(double drunkStd) {
		this.drunkStd = drunkStd;
	}
}
