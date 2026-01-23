package com.ktdsuniversity.edu.coffee;

public class CoffeeShopArray {

	Coffee[] drinks;
	
	public CoffeeShopArray(Coffee hot, Coffee ice, Coffee tea) {
		this.drinks = new Coffee[3];
		this.drinks[0] = hot;
		this.drinks[1] = ice;
		this.drinks[2] = tea;
	}
	
	/**
	 * <pre>
	 * 커피숍에서 커피를 판매한다.
	 * 
	 * @param menu 메뉴들의 번호 0: hot 1: ice 2: tea
	 * @param quantity 주문 수량
	 * @return 주문 가격
	 * </pre>
	 */
	public int orderCoffee(int menu, int quantity) {
		if(menu < 0 || menu >= this.drinks.length) {
			System.out.println("존재하지 않는 메뉴입니다.");
			return 0;
		}
		
		Coffee drink = this.drinks[menu];
		
		System.out.println(drink.getName() + "음료를 " + quantity + "개 주문했습니다.");
		
		if(drink.getStock() >= quantity) {
			System.out.println(drink.getName() + "음료가 " + (drink.getStock() - quantity) + "개 남았습니다.");
			int stock = drink.getStock();
			stock -= quantity;
			drink.setStock(stock);
		}else {
			System.out.println(drink.getName() + "음료가 품절상태입니다.");
			return 0;
		}
		
		return drink.getPrice() * quantity;
	}
}
