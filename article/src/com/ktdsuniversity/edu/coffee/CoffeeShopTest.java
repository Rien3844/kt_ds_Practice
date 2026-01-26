package com.ktdsuniversity.edu.coffee;

public class CoffeeShopTest {

	public static void main(String[] args) {
		
		Coffee hotCoffee = new Coffee("아메리카노 (Hot) " , 4500, 100);
		Coffee iceCoffee = new Coffee("아이스 티 " , 4000, 60);
		Coffee tea = new Coffee("캐모마일 티 ", 5000, 50);
		
		CoffeeShopArray starbucks1 = new CoffeeShopArray(hotCoffee, iceCoffee, tea);
		CoffeeShopArray starbucks = new CoffeeShopArray();

		int price = starbucks.orderCoffee(0); // hot을 한 개 주문하겠다.
		System.out.println(price);

		price = starbucks.orderCoffee(1);// ice를 한 개 주문하겠다.
		System.out.println(price);
		
		price = starbucks1.orderCoffee(1);// ice를 한 개 주문하겠다.
		System.out.println(price);
		
		price = starbucks1.orderCoffee(2,  55);
		System.out.println(price);
		
		price = starbucks1.orderCoffee(3,  5);
		System.out.println(price);
	}
}
