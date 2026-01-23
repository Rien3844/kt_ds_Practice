package com.ktdsuniversity.edu.market;

import com.ktdsuniversity.edu.market.consumer.Consumer;
import com.ktdsuniversity.edu.market.seller.Seller;

public class Market {

	public static void main(String[] args) {
		
		Consumer consumer = new Consumer(5000, 3000);
		Seller seller = new Seller(30);
		
		// 구매자가 판매자에게 제품을 5개 구매한다.
		consumer.buyFrom(seller, 5);
		
		System.out.println("구매개수: " + consumer.getItemCount() );
		System.out.println("중량: " + consumer.getNowCartWeight() );
		System.out.println("지갑: " + consumer.getWallet() );
		
		System.out.println("재고: " + seller.getStock() );
		System.out.println("자본금: " + seller.getAccount() );
		
		// 구매자가 상품을 구매하려면 판매자가 판매를 먼저 해야한다.
		
//		int stock = seller.getStock();
//		int price = seller.getPRICE();
//		int weight = seller.getPRODUCT_WEIGHT();
//		
//		if (stock >= 5 
//				&& buyer.isEnoughMoney(price * 5) 
//				&& buyer.isEnoughWeight(weight * 5)) {
//			seller.sell(5);
//			buyer.buy(price * 5, weight * 5, 5);
//		}
		
		
		
	}
	
}