package homework;

//판매자가 판매하는 모든 상품의 금액은 1,000원 입니다.
//
//판매자는 한번에 n개 만큼의 상품을 판매할 수 있습니다.
//
//판매(5); 라고 한다면 판매자의 상품 재고에서 5개를 빼야 합니다.
//
//또한 5개를 판매한 금액을 판매자의 자본금에 더해야 합니다.
//
// 
//
//판매자가 소지한 상품의 개수보다 더 많은 개수의 상품을 판매하려 할 경우, 남은 모든 재고를 판매해야 하며
//
//남은 재고를 판매한 금액만큼을 판매자의 자본금에 더해야 합니다.
//
// 
//
//판매자의 재고가 없다면, "품절되었습니다" 를 출력해야 합니다.
//
// 
//
//상품의 판매 프로세스가 종료되었다면 판매자의 재고 수, 판매자의 자본금을 출력합니다.
public class Seller {
	int price = 1000; // 상품 금액
	int capital = 0; //자본금
	int sellersGoods; //판매자가 소지한 상품의 개수
	public void selling(int buyGoods) {
	    
		if(sellersGoods > buyGoods) {// 상품의 갯수가 산 상품보다 많으면 <== 상품이 남으면
			sellersGoods -= buyGoods;
			capital += buyGoods * price;
		}else {//남은 상품을 모두 사거나 더 사려고한다면
			capital += sellersGoods * price;
			sellersGoods = 0;
			System.out.println("품절되었습니다.");
		}
		System.out.println("판매자의 재고 수 : " + sellersGoods);
		System.out.println("판매자의 자본금 : " + capital);
	}
}
