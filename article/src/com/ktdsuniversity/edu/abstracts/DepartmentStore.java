package com.ktdsuniversity.edu.abstracts;


public class DepartmentStore extends AbstractMart {

	private int discountPrice;

	public DepartmentStore(int productPrice) {
		super(productPrice);
	}

	@Override
	public int usePoint(Guest guest) {
		int point = guest.getPoint();
		int wallet = guest.getMoney();
		if(point >= 10000) {
			guest.usePoint(point);
		}
		
		return point;
	}

	@Override
	public void givePoint(Guest guest, int amount) {
		if (guest instanceof VVIP) {
			guest.addPoint((int) (amount * 0.3f));

		} else if (guest instanceof VIP) {

		} else if (guest instanceof Guest) {
			guest.addPoint((int) (amount * 0.05f));
		}
	}

	@Override
	public int discount(Guest guest, int amount) {
		discountPrice = 0;
		
		if (guest instanceof VVIP) {
			discountPrice += (int) (amount * 0.1f);
		} else if (guest instanceof VIP) {
			discountPrice += (int) (amount * 0.03f);
		} else if (guest instanceof Guest) {

		}
		return discountPrice;
	}

}
