package com.ktdsuniversity.edu.abstracts;

public class MartTest {

	public static void main(String[] args) {
		Guest guest = new Guest(13000, 0);
		Guest guest_2 = new Guest(10000, 12000);
		Guest guest_3 = new Guest(10000, 30000);
		
		Guest guest2 = new VIP(10000, 12000);
		Guest guest3 = new VVIP(10000, 30000);

		AbstractMart mart = new Mart(2000);
		AbstractMart mart1 = new ConvenienceStore(1500);
		AbstractMart mart2 = new DepartmentStore(2500);
		
//		System.out.println("백화점 결제");
//		mart2.sell(guest, 5, guest.getMoney()); // 물건 금액 12500 > 가진돈 12000 => 결제 실패
//		System.out.println();
//		mart2.sell(guest2, 5, guest2.getMoney()); // 물건 금액 12500, 3%할인 375 => 12125 - 12000(포인트) - 10000 => -9875(남은돈)
//		System.out.println();
//		mart2.sell(guest3, 5, guest3.getMoney()); // 물건 금액 12500, 10%할인 1250 => 11250 - 30000(포인트) => 남은 포인트 18750
//		System.out.println();
			
		System.out.println("편의점 결제");
		mart1.sell(guest, 5, guest.getMoney());
		System.out.println();
		mart1.sell(guest_2, 5, guest_2.getMoney());
		System.out.println();
		mart1.sell(guest_3, 10, guest_3.getMoney());
		System.out.println();
		
//		System.out.println("마트 결제");
//		mart.sell(guest, 5, guest.getMoney());
//		System.out.println();
//		mart.sell(guest2, 5, guest2.getMoney());
//		System.out.println();
//		mart.sell(guest3, 12, guest3.getMoney());
//		System.out.println();
	
		
	}
}
