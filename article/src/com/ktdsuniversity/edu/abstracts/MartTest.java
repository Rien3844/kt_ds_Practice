package com.ktdsuniversity.edu.abstracts;

public class MartTest {

	public static void main(String[] args) {

		int point = 1000000;
		int usePoint = (int) (Math.random() * point + 1);
		// 1~1,000,000까지의 랜덤 숫자
		System.out.println(usePoint);

		Guest guest = new Guest(200000, 0);
		Guest guest2 = new Guest(7000, 300);
		Guest guest3 = new Guest(0, 12000);

		AbstractMart mart = new DepartmentStore(1500);
		mart.sell(guest, 5, 10000);
		mart.sell(guest2, 5, 7000);
		mart.sell(guest3, 5, 0);
	}
}
