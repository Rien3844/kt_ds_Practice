package homework.inheritance;

import homework.inheritance.product.Product;

public class DepartmentStore extends ConvenienceStore {
	private float bargain;
	
	public DepartmentStore(Product[] products, float point) {
		super(products, point);
	}
	
	public void discountBenefit(Consumer cons) {//일반
		if(cons.getConsRating() == "일반") {
			bargain = 1.0f;
		}else if(cons.getConsRating() == "VIP") {//vip
			bargain = 0.03f;
		}else if(cons.getConsRating() == "VVIP") {//vvip
			bargain = 0.1f;
		}
	}
}
/**
 * 포인트 0.5퍼 적립 만들어야함. -> 편의점 참고하면될듯?
 * 편의점 << 상속관계니까 이거 가져올수있지않나?
 * 
 * consrating번호에 따라 일반/vip/vvip를 나눠 할인율 적용 완료.
 * 할인가격 = 상품가격 * bargain;
 * 최종 상품가격 = 상품가격 - 할인가격 << 만들어야함.
 * 
 * 포인트 사용 = 1만점이 넘을때, 현금처럼 사용가능(현금+포인트 = 내돈)
 * 포인트 일부사용 - 내돈 + 포인트 - 상품가격 이후 남은돈 - 내돈 = 남은 포인트
 * 위에 내용도 편의점 거래 참고하면될듯?
 * 
 */