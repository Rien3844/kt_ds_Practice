package homework.mart;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Store {
	private List<Item> items;
	
	public Store() {
		this.items = new ArrayList<>();
	}
	
	public void add(Item item) {
		//추가
		this.items.add(item);
	}
	
	public void sell(int index) {
		/*
		 * index에 할당되어있는 제품의 소비 기한이 당일이라면 "오늘까지 드세요"를 출력.
		 * 
		 * 소비 기한이 3일 내에 도래한다면 "가능한 빨리 드세요."를 출력.
		 * 
		 * 소비 기한이 지났다면 "소비기한이 지나 판매하지 않습니다."를 출력.
		 */
		Item tempItem = this.items.get(index - 1);
		LocalDate nowDate = LocalDate.now();
		LocalDate expireDate = tempItem.getExpireDate();
		
		Period period = Period.between(nowDate, expireDate);
		
		if (nowDate.getYear() == expireDate.getYear() && (period.getDays() <= 3 && period.getDays() > 0 )) {
			System.out.println(tempItem + "가능한 빨리 드세요.");
		} else if (nowDate.isAfter(expireDate)) {
			System.out.println(tempItem + "소비기한이 지나 판매하지 않습니다.");
		} else if (nowDate.isEqual(expireDate)) {
			System.out.println(tempItem + "오늘 까지 드세요.");
		}
	}
}
