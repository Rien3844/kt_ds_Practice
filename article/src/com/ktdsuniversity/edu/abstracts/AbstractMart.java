package com.ktdsuniversity.edu.abstracts;

public abstract class AbstractMart {
	private int safe;
	private int productPrice;
	private int remainMoney; // 거스름돈
	
	private int amount;

	public AbstractMart(int productPrice) {
		this.productPrice = productPrice;

	}

	public void sell(Guest guest, int sellCount, int money) {
		this.remainMoney = money;

		int guestPoint = this.usePoint(guest);

		// 판매가격
		int amount = sellCount * this.productPrice;

		if (money + guestPoint < amount) {
			System.out.println("돈이 모자랍니다. 구매가격 : " + amount + ", 손님이 낸 돈 : " + money);
			return;
		}
		// 손님이 마트에 돈을 지불.
		guest.pay(money);
		if (amount <= guestPoint) {
			guestPoint -= amount - this.discount(guest, amount);
			this.amount = 0;
		} else if (amount > guestPoint) {
			remainMoney -= (amount - guestPoint - this.discount(guest, amount));
			guestPoint = 0;		
		}
		
		this.safe += money - this.remainMoney;
		
		System.out.println();
		System.out.println("상품 금액 : " + amount);
		System.out.println("할인액 : " + this.discount(guest, amount));
		System.out.println("매출액 : " + safe);
		System.out.println("거슬러 줄 돈 : " + remainMoney);
		System.out.println("남은 포인트 : " + (guestPoint));

		// 마트가 손님에게 거슬러 준다.
		guest.giveMoney(this.remainMoney);
		this.remainMoney = 0;
		this.safe = 0;

	}

	public abstract int usePoint(Guest guest);

	public abstract void givePoint(Guest guest, int amount);

	public abstract int discount(Guest guest, int amount);
}