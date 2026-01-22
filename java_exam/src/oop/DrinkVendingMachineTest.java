package oop;

public class DrinkVendingMachineTest {

	public static void main(String[] args) {
		Drink bak = new Drink("박카스", 900, 15);
		Drink mon = new Drink("몬스터", 1500, 20);
		Drink hot = new Drink("핫식스", 1300, 10);
		Drink mil = new Drink("밀키스", 1400, 5);
		
		DrinkVendingMachineArray dvm = new DrinkVendingMachineArray(bak, mon, hot, mil);
		
		int price = dvm.orderDrink(1, 10);
		System.out.println(price);
		price = dvm.orderDrink(2, 5);
		System.out.println(price);
		price = dvm.orderDrink(3, 5);
		System.out.println(price);
		price = dvm.orderDrink(4, 5);
		System.out.println(price);
		
		dvm.stockUpDrink(3, 5);
		
		dvm.stockUpDrink(5, 5);
		
		dvm.goodsStockOutput();
		
		
	}
}
