package oop;

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
}
