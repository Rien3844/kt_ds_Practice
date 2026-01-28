package com.ktdsuniversity.edu.inheritance.vendingmachine;

import com.ktdsuniversity.edu.vendingmachine.item.Drink;
import com.ktdsuniversity.edu.vendingmachine.machine.DrinkVendingMachine;

public class RefundableDrinkVendingMachineTest {

	public static void main(String[] args) {
		
		Drink 박카스 = new Drink("박카스", 900, 15);
		Drink 몬스터 = new Drink("몬스터", 1500, 20);
		Drink 핫식스 = new Drink("핫식스", 1300, 10);
		Drink 밀키스 = new Drink("밀키스", 1400, 5);
		DrinkVendingMachine machine = new RefundableDrinkVendingMachine(박카스, 몬스터, 핫식스, 밀키스);
		
		int orderMoney = machine.pressDrinkButton(1, 3, 10000);
		System.out.println("주문금액: " + orderMoney);
		
		if (machine instanceof RefundableDrinkVendingMachine rfMachine) {
			rfMachine.refund();
		}
		
		orderMoney = machine.pressDrinkButton(6, 3, 10000);
		System.out.println("주문금액: " + orderMoney);
		
		if (machine instanceof RefundableDrinkVendingMachine rfMachine) {
			rfMachine.refund();
		}
		
		
//		DrinkVendingMachine machine2 = new RefundableDrinkVendingMachineUseOverride(박카스, 몬스터, 핫식스, 밀키스);
//		orderMoney = machine2.pressDrinkButton(3, 3, 5000);
//		System.out.println("주문금액: " + orderMoney);
	}
	
}