package com.ktdsuniversity.edu.vendingmachine.item;

/**
 * <pre>
 *  자판기 메뉴를 나타내는 데이터 클래스.
 *</pre>
 */
public class Drink {
	String name; // 음료수 이름
	int price; // 음료수 가격
	int stock; // 음료수 재고
	
	public Drink(String name, int price, int stock){
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public int getStock() {
		return this.stock;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
}
