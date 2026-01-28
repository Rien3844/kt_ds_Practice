package homework.inheritance;

public class Mart {
	private String productName;
	private int productPrice; // 이후 편의점~에서 포인트 계산을 위해 전체 물건 가격 알아야함 -set
	private int safe; // 금고 - 손님에게 받은돈을 보관, 자본금
	private int inputMoney; // 받은돈, -상품가격해서 돌려줌(거스름돈)

	public Mart(String productName, int productPrice) {
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	public String getProductName() {
		return this.productName;
	}
	
	public int getProductPrice() {
		return this.productPrice;
	}
	
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	
	// 기능 : 물건 판매
	public void productSell() {
		
	}
	// 거스름돈 돌려줌
	public void giveChange() {
		this.inputMoney -= getProductPrice();
	}
}
