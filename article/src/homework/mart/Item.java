package homework.mart;

import java.time.LocalDate;

public class Item {
	
	private String name;
	private LocalDate expireDate;
	
	//생성자
	public Item(String name, String expireDate) {
		this.name = name;
		this.expireDate = LocalDate.parse(expireDate);
	}
	//get,seter
	public LocalDate getExpireDate() {
		return this.expireDate;
	}
	
	//tostring
	@Override
	public String toString() {
		return "이름 : " + this.name + ", 유통기한 : " + this.expireDate ;
	}
}
