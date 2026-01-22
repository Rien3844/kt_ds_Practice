package homework;

public class SellerConsumerTest {

	public static void main(String[]args) {
		Seller seller = new Seller();
		Consumer consumer = new Consumer();
		
		seller.sellersGoods = 10;
		seller.selling(3);
		System.out.println();
		
		seller.selling(11);
		
		System.out.println("-----------------------");
		
		consumer.maxWeightOfShoppingCart = 5000;
		consumer.walletMoney = 15000;
		consumer.purchase(5);
		System.out.println();

//		consumer.maxWeightOfShoppingCart = 5000;
//		consumer.walletMoney = 15000;
//		consumer.purchase(13); // 무게 초과(6500)
//		System.out.println();

//		consumer.maxWeightOfShoppingCart = 100000;
//		consumer.walletMoney = 20000;
		consumer.purchase(21); // 금액 초과(21000)
	}
}
