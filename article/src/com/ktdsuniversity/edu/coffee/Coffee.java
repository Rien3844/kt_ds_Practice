package com.ktdsuniversity.edu.coffee;

/**
 * <pre>
 *  커피 메뉴를 나타내는 데이터 클래스.
 *</pre>
 */
public class Coffee {
	
	private String name; // 커피 메뉴의 이름
	private int price; //커피 메뉴의 가격
	
	private int stock;//하루에 판매할 수 있는 커피의 수량
	
	public Coffee(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	// getter : Coffee 클래스 외부로 멤버변수의 값을 노출시키는 코드. ==> 값을 노출시키기에 반환타입 필요.
	// setter : 외부에서 Coffee 클래스 내부로 멤버변수의 값을 변경시키는 코드. ==> 단순히 변경만 하기에 반환타입 필요 x
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getStock() {
		return this.stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}

	
}
