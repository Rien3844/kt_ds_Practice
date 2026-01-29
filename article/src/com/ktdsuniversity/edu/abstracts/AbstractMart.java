package com.ktdsuniversity.edu.abstracts;

public abstract class AbstractMart {
	private int safe;
	private int productPrice;
	private int remainMoney; // 거스름돈

	public AbstractMart(int productPrice) {
		this.productPrice = productPrice;

	}

	public void sell(Guest guest, int sellCount, int money) {
		this.remainMoney = money;

		int guestPoint = this.usePoint(guest);

		// 판매가격
		int amount = sellCount * this.productPrice;
		amount -= this.discount(guest, amount);

		if (money + guestPoint < amount) {
			System.out.println("돈이 모자랍니다. 구매가격 : " + amount + ", 손님이 낼 돈)");
			return;
		}
		// 손님이 마트에 돈을 지불.
		guest.pay(money);
		this.givePoint(guest, amount);

		if (amount > guestPoint) {
			this.remainMoney -= amount - guestPoint;
		}

		this.remainMoney -= amount - guestPoint;
		this.safe += money - this.remainMoney;
		System.out.println("매출액 : " + this.safe);
		System.out.println("거슬러 줄 돈 : " + this.remainMoney);

		// 마트가 손님에게 거슬러 준다.
		guest.giveMoney(this.remainMoney);
		this.remainMoney = 0;

	}

	public abstract int usePoint(Guest guest);

	public abstract void givePoint(Guest guest, int amount);

	public abstract int discount(Guest guest, int amount);
}