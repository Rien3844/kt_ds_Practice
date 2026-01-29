package homework.inheritance;

import homework.inheritance.product.Product;

public class Mart {
	Product[] products;
	
	private int inputMoney; // 받은 돈
	private int safe; // 가게 금고

	public Mart(Product[] products) {
		this.products = products;
	}
	
	public Product[] getProducts() {
		return this.products;
	}
	
	public void setProducts(Product[] products) {
		this.products = products;
	}
	
	public int getInputMoney() {
		return this.inputMoney;
	}
	
	public void setInputMoney(int inputMoney) {
		this.inputMoney = inputMoney;
	}

	public boolean canSell(Consumer cons, int productNum) {
		if (productNum < 0 || productNum >= this.products.length) {
			System.out.println("존재하지 않는 상품입니다.");
			return false;
		}
		return true;
	}

	public void printReceipts(int price, int inputMoney) {
		this.safe += price; // 직접 필드에 더하거나 setter 이용
		System.out.println("결제 금액: " + price + "원");
		System.out.println("거스름돈: " + (inputMoney - price) + "원");
		System.out.println("가게 누적 판매 금액: " + this.safe + "원");
	}

	public int sell(Consumer cons, int productNum) {
		if (!canSell(cons, productNum))
			return 0;

		int price = this.products[productNum].getPrice();
		if (cons.getWallet() < price) {
			System.out.println("금액 부족");
			return 0;
		}

		printReceipts(price, cons.getWallet());
		return price;
	}

	public void printProduct(Product[] products) {
		System.out.println("----- 상품 목록 -----");
		for (int i = 0; i < products.length; i++) {
			System.out.println(this.products[i].getName() + ": " + this.products[i].getPrice() + "원");
		}
		System.out.println("-------------------");
	}

}