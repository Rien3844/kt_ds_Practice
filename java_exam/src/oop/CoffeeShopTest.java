package oop;

public class CoffeeShopTest {

	public static void main(String[] args) {
		
		Coffee hotCoffee = new Coffee("아메리카노 (Hot) " , 4500);
		Coffee iceCoffee = new Coffee("아이스 티 " , 4000);
		Coffee tea = new Coffee("캐모마일 티 ", 5000);
		
		CoffeeShopArray starbucks = new CoffeeShopArray(hotCoffee, iceCoffee, tea);

		int price = starbucks.orderCoffee(0,  3);
		System.out.println(price);
		
		price = starbucks.orderCoffee(1,  6);
		System.out.println(price);
		
		price = starbucks.orderCoffee(2,  8);
		System.out.println(price);
		
		price = starbucks.orderCoffee(3,  5);
		System.out.println(price);
	}
}
