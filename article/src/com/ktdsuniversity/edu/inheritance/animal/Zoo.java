package com.ktdsuniversity.edu.inheritance.animal;

public class Zoo {

	public static void main(String[] args) {
		
		Animal duck = new Bird("오리", "꽥", 15f, 20f, 50f);
		duck.howling();
		duck.move();
		
		if(duck instanceof Bird) {// duck의 껍데기는 Animal이지만 Bird의 instance인가?
			Bird bird = (Bird)duck;
			bird.fly();
			bird.land();
		}
		if(duck instanceof Bird bird) {//위와 똑같은 코드
			bird.fly();
			bird.move();
			
			bird.land();
			bird.move();
		}
		
		
		Animal lion = new Animal("사자", "크아앙", 80f, 60f, 200f);
		Animal tiger = new Animal("호랑이", "어흥", 50f, 55f, 200f);

		tiger.attack(duck);
		duck.attack(tiger);
		
		lion.howling();
		tiger.howling();

		lion.move();
		tiger.move();
		lion.attack(tiger);
	}
}
