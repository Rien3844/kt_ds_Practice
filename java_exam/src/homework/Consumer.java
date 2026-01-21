package homework;

//소비자는 판매자로 부터 상품을 구매할 수 있으며, 한번에 n개 만큼의 상품을 구매할 수 있습니다.
//
//구매(5); 라고 한다면 소비자의 장바구니의 상품 개수에서 5개가 늘어나야 합니다.
//
//또한 5개를 구매한 금액 만큼을 소비자의 지갑에서 빼야 합니다.
//
// 
//
//소비자가 구매한 상품의 무게는 1개당 500g 입니다.
//
//만약, 소비자가 들 수 있는 무게에 도달했다면 더이상 상품을 구매할 수 없습니다.
//
//또 소비자의 지갑의 돈이 구매하려는 상품의 개수보다 충분하지 않다면 더이상 상품을 구매할 수 없습니다.
//
// 
//
//소비자가 상품을 구매할 수 없다면, 그 사유에 따라 "더 이상 장바구니를 들 수 없습니다" 혹은 "돈이 부족합니다" 를 출력합니다.
//
// 
//
//상품의 구매 프로세스가 종료되었다면, 구매자의 상품 수, 장바구니의 무게, 지갑의 돈을 출력합니다.
public class Consumer {
	int consumersGoods = 0;
	int weightOfShoppingCart = 0;
	int maxWeightOfShoppingCart; //최대 들 수 있는 무게
	int walletMoney;
	boolean canBuy = true;
	
	public void purchase(int buyGoods) {

		weightOfShoppingCart += buyGoods * 500;
		
		maxWeightOfShoppingCart -= weightOfShoppingCart;
		
		//소비자가 들 수 있는 최대 무게 도달 ==> 최대 무게만큼 물건을 구매하고 이후 결과.
		if(maxWeightOfShoppingCart <= 0) {
			weightOfShoppingCart += maxWeightOfShoppingCart;
			consumersGoods += weightOfShoppingCart / 500;
			walletMoney -= weightOfShoppingCart / 500 * 1000;
			
			System.out.println("더 이상 장바구니를 들 수 없습니다.");
			
			canBuy = false;
		}
		// ==> 돈이 구매하려는 상품 개수보다 적은경우 - 돈이 0원이 될때까지 구매 이후 결과.
		else if(walletMoney / 1000 < buyGoods) {
			consumersGoods += walletMoney / 1000;
			weightOfShoppingCart = consumersGoods * 500;
			walletMoney = 0;
			
			System.out.println("돈이 부족합니다. 더 구매할 수 없습니다.");
			
			canBuy = false;
		}
		// 아무문제없음.
		else {
			consumersGoods += buyGoods;
			walletMoney -= buyGoods * 1000;
		}
		
		System.out.println("구매자의 상품 수 : " + consumersGoods);
		System.out.println("구매자의 장바구니 무게 : " + weightOfShoppingCart + "g");
		System.out.println("구매자의 지갑의 돈 : " + walletMoney);
	}
}