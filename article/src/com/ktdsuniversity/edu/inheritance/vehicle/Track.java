package com.ktdsuniversity.edu.inheritance.vehicle;

public class Track {
	
	public static void main(String[] args) {
		Vehicle car = new Vehicle("마티즈"); 
		Vehicle car1 = new SportsCar("포르쉐 911");
		Vehicle car2 = new EV("hummer EV", 6000000);
		Vehicle car3 = new BatMobile("배트카");
				
		car.startEngine();
		car1.startEngine();
		car2.startEngine();
		car3.startEngine();
	}
}
