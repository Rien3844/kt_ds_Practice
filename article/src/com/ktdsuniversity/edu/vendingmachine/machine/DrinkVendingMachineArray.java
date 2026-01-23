package com.ktdsuniversity.edu.vendingmachine.machine;

import com.ktdsuniversity.edu.vendingmachine.item.Drink;

public class DrinkVendingMachineArray {
	
	private Drink[] drinks;
	
	public DrinkVendingMachineArray(Drink bak, Drink mon, Drink hot, Drink mil) {
		this.drinks = new Drink[4];
		this.drinks[0] = bak;
		this.drinks[1] = mon;
		this.drinks[2] = hot;
		this.drinks[3] = mil;
	}
	
//	주문하기(제품 번호, 주문수량): 구매금액(int)
//	몬스터를 5개 주문한다면 7500을 반환한다.
//	주문을 하면 주문 수량만큼 자판기 음료수의 재고가 감소된다.
//	재고가 없다면 “상품이 품절되었습니다“를 출력하고 0을 반환한다.
	public int orderDrink(int menu, int quantity) {
		if(menu < 0 || menu >= this.drinks.length) {
			return 0;
		}

		
		Drink drink = this.drinks[menu];

		int stock = drink.getStock();
		stock -= quantity;
		
		System.out.println(drink.getName() + "를 " + quantity + "개 주문했습니다.");
		
		if(drink.getStock() == 0) {
			System.out.println("상품이 품절되었습니다.");
			drink.setStock(stock);
			return 0;
		}else if(drink.getStock() < quantity){
			quantity = drink.getStock();
		}
		
		
		return drink.getPrice() * quantity;
	}
	
	public Drink[] getDrinks() {
		return this.drinks;
	}
//	입고하기(제품 번호, 입고수량): void
//	입고를 하면 입고 수량만큼 재고가 증가된다.
//	밀키스 3개를 입고하면, 밀키스의 재고가 3개 증가된다.
//	자판기에 없는 음료수는 입고할 수 없다. (제로콜라, 3)  아무 변화가 없다!
	public void stockUpDrink(int menu, int stockUp) {
		if(menu < 0 || menu > this.drinks.length) {
			return;
		}
		
		Drink drink = this.drinks[menu];

		System.out.println(drink.getName() + "의 재고가 " + drink.getStock()
				+ "개로 " + stockUp + "개 증가하였습니다.");
	}
	
//	모든 상품 재고 출력() : void
//	출력형식  “박카스 15개 남았습니다.”
	public void goodsStockOutput() {
		for(int i = 0; i < this.drinks.length; i++) {
			System.out.println(this.drinks[i].getName() + " " + this.drinks[i].getStock() + "개 남았습니다.");
		}
	}
}
