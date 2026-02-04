package homework.mart;

public class ExpireTest {

	public static void main(String[] args) {
		Store fresh = new Store();

		fresh.add(new Item("햇반", "2025-12-11"));// 유통기한 지남
		fresh.add(new Item("신라면", "2026-01-11"));// 유통기한 지남
		fresh.add(new Item("우유", "2026-02-01"));// 유통기한 지남

		fresh.add(new Item("계란", "2026-02-04"));// 오늘까지

		fresh.add(new Item("냉동 대패 삼겹살", "2026-02-05"));// 유통기한 임박
		fresh.add(new Item("쿠크다스", "2026-02-06"));// 유통기한 임박
		fresh.add(new Item("초콜릿", "2026-02-07"));// 유통기한 임박
		fresh.add(new Item("간장", "2026-02-08"));

		for (int i = 0; i < 8; i++) {
			fresh.sell(i);
		}

	}
}
//결과
/*	
 * 햇반 : 소비 기한이 지나 판매하지않습니다.
 * 신라면 : 소비 기한이 지나 판매하지않습니다.
 * 우유 : 소비 기한이 지나 판매하지않습니다.
 * 계란 : 오늘까지 드세요.
 * 냉동 대패 삼겹살 : 가능한 빨리 드세요.
 * 쿠크다스 : 가능한 빨리 드세요.
 * 초콜릿 : 가능한 빨리 드세요.
*/