package homework.inheritance;

import homework.inheritance.product.Product;

public class ConvenienceStore extends Mart {
	private float point;

	public ConvenienceStore(Product[] products, float point) {
		super(products);
		this.point = point;
	}

	public float getPoint() {
		return point;
	}

	public void setPoint(float point) {
		this.point = point;
	}
	
	public void savePoint(Consumer cons, int productPrice) {
		float accuPoint = productPrice * 0.001f;
		cons.setPoint(cons.getPoint() + accuPoint);
		System.out.println("적립된 포인트 : " + accuPoint + " | 총 누적 포인트 : " + cons.getPoint() );
	}
	
	public int conStorePayment(Consumer cons, int productNum) {
		if(!canSell(cons, productNum)) {
			return 0;
		}
		int productPrice = this.getProducts()[productNum].getPrice();
		int usePoint = 0;
		
		if(cons.getPoint() >= 100) {
			usePoint = (int) cons.getPoint();
			cons.setPoint(cons.getPoint() - usePoint);
			System.out.println("사용한 포인트 : " + usePoint + "원");
		}else {
			System.out.println("포인트를 사용할 수 없습니다.");
		}
		
		int discountPrice = productPrice - usePoint;
		
		if(cons.getWallet() < discountPrice) {
			System.out.println("잔액이 부족합니다.");
			cons.setPoint(cons.getPoint() + usePoint);
			return 0;
		}
		this.printReceipts(discountPrice, cons.getWallet());
		savePoint(cons, productPrice);
		
		return discountPrice;
	}
}

//+ 포인트 혜택