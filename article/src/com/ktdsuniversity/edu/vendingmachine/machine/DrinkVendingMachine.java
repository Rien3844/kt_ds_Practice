package com.ktdsuniversity.edu.vendingmachine.machine;

import com.ktdsuniversity.edu.vendingmachine.item.Drink;

public class DrinkVendingMachine {

	/* 2026-01-28 : 환불 기능 추가를 위한 수정 시작 */
	private int safe;
	private int inputMoney;
	/* 2026-01-28 : 환불 기능 추가를 위한 수정 끝 */
	
	private Drink[] drinks;
	
	public DrinkVendingMachine( Drink drink1, Drink drink2, Drink drink3, Drink drink4 ) {
		this.drinks = new Drink[4];
		this.drinks[0] = drink1;
		this.drinks[1] = drink2;
		this.drinks[2] = drink3;
		this.drinks[3] = drink4;
	}
	
	/* 2026-01-28 : 환불 기능 추가를 위한 수정 시작 */
	public int getInputMoney() {
		return this.inputMoney;
	}
	/* 2026-01-28 : 환불 기능 추가를 위한 수정 끝 */
	
	public Drink[] getDrinks() {
		return this.drinks;
	}
	
	public int pressDrinkButton(int drinkNumber, int pressCount, int inputMoney) {
		/* 2026-01-28 : 환불 기능 추가를 위한 수정 시작 */
		this.inputMoney = inputMoney;
		/* 2026-01-28 : 환불 기능 추가를 위한 수정 끝 */
		
		if (drinkNumber < 0 || drinkNumber >= this.drinks.length) {
			return 0;
		}
		
		// 0 1 2 3
		Drink pressedDrink = this.drinks[drinkNumber];
		
		if (pressedDrink.getStock() == 0) {
			System.out.println("품절 되었습니다!");
			return 0;
		}
		else if (pressedDrink.getStock() < pressCount) {
			pressCount = pressedDrink.getStock();
		}
		
		int stock = pressedDrink.getStock();
		stock -= pressCount;
		
		/* 2026-01-28 : 환불 기능 추가를 위한 수정 시작 */
		this.safe += pressCount * pressedDrink.getPrice();
		this.inputMoney -= pressCount * pressedDrink.getPrice();;
		/* 2026-01-28 : 환불 기능 추가를 위한 수정 끝 */
		
		pressedDrink.setStock(stock);
//		pressedDrink.stock -= pressCount;
		return pressedDrink.getPrice() * pressCount;
	}
	
	public void fillDrink(int drinkNumber, int quantity) {
		if (drinkNumber < 0 || drinkNumber >= this.drinks.length) {
			return;
		}
		
		// 0 1 2 3
		Drink pressedDrink = this.drinks[drinkNumber];
		
		int stock = pressedDrink.getStock();
		stock += quantity;
		pressedDrink.setStock(stock);
	}
	
	public void printAllDrinkInfo() {
		for (int i = 0; i < this.drinks.length; i++) {
			System.out.println(this.drinks[i].getName() + " " + this.drinks[i].getStock() + "개 남았습니다.");
		}
	}
	
	
}