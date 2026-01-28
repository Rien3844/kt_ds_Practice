package com.ktdsuniversity.edu.vendingmachine;

import com.ktdsuniversity.edu.vendingmachine.item.Drink;
import com.ktdsuniversity.edu.vendingmachine.machine.DrinkVendingMachine;

public class DrinkVendingMachineTest {

	public static void main(String[] args) {
		
		Drink 박카스 = new Drink("박카스", 900, 15);
		Drink 몬스터 = new Drink("몬스터", 1500, 20);
		Drink 핫식스 = new Drink("핫식스", 1300, 10);
		Drink 밀키스 = new Drink("밀키스", 1400, 5);
		
		DrinkVendingMachine lotte = new DrinkVendingMachine(박카스, 몬스터, 핫식스, 밀키스);
		
		lotte.printAllDrinkInfo();
		
		int price = lotte.pressDrinkButton(0, 3, 3000);
		System.out.println(price);
		
		price = lotte.pressDrinkButton(1, 5, 3000);
		System.out.println(price);
		
		price = lotte.pressDrinkButton(2, 15, 3000);
		System.out.println(price);
		
		price = lotte.pressDrinkButton(3, 55, 3000);
		System.out.println(price);
		
		price = lotte.pressDrinkButton(4, 1, 3000);
		System.out.println(price);
		
		lotte.printAllDrinkInfo();
		
		lotte.fillDrink(0, 10);
		lotte.fillDrink(1, 10);
		lotte.fillDrink(2, 10);
		lotte.fillDrink(3, 10);
		lotte.fillDrink(9, 10);
		
		lotte.printAllDrinkInfo();
		
		lotte.fillDrink(0, 0);
		
	}
}