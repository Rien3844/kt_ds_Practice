package homework.mart;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Store {
	private List<Item> items;

	public Store() {
		this.items = new ArrayList<>();
	}

	public void add(Item item) {
		// 추가
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
		LocalDate nowDate = LocalDate.now();
		LocalDate expirationDate = this.items.get(index).getExpireDate();

		if (expirationDate.equals(nowDate)) {// 유통기한 == 오늘날짜02.04)
			System.out.println(this.items.get(index).getName() + " : 오늘까지 드세요. 유통기한 : " + this.items.get(index).getExpireDate());
		} else if (expirationDate.isAfter(nowDate) // 유통기한이 오늘날짜 02.04 이후 &&
				&& expirationDate.isBefore(nowDate.plusDays(4))) { // 유통기한이 오늘날짜 02.04 + 4일 이전(02.08이전)
			System.out.println(this.items.get(index).getName() + " : 가능한 빨리 드세요. 유통기한 : " + this.items.get(index).getExpireDate());
		} else if (expirationDate.isBefore(nowDate)) {// 유통기한이 오늘 날짜 02.04 이전
			System.out.println(this.items.get(index).getName() + " : 소비 기한이 지나 판매하지않습니다. 유통기한 : " + this.items.get(index).getExpireDate());
		}else {
			System.out.println(this.items.get(index).getName() + " : 천~천히 드십셔~ 유통기한 : " + this.items.get(index).getExpireDate());
		}
	}
}
