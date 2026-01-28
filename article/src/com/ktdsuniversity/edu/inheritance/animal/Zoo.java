package com.ktdsuniversity.edu.inheritance.animal;

public class Zoo {

	public static void main(String[] args) {
		
		Animal duck = new Bird("오리", "꽥", 15f, 20f, 50f);
		Animal duck2 = new Bird("오리", "꽥", 15f, 20f, 50f);
		
		System.out.println(duck.getName().equals(duck2.getName()));
		System.out.println(" == 비교 : " + (duck == duck2));// 메모리가 다름 => false
		System.out.println("equal 비교 : " + duck.equals(duck2));// 이름만 같으면 같은거 ==> true
		
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
