package com.ktdsuniversity.edu.abstracts;

public class MartTest {

	public static void main(String[] args) {
		Guest guest = new Guest(12000, 0);
		
		Guest guest2 = new VIP(10000, 12000);
		Guest guest3 = new VVIP(10000, 30000);

//		AbstractMart mart = new Mart(2500);
//		AbstractMart mart1 = new ConvenienceStore(2500);
		AbstractMart mart2 = new DepartmentStore(2500);
		
		System.out.println("백화점 결제");
		mart2.sell(guest, 5, 12000);
		System.out.println();
		mart2.sell(guest2, 5, 10000);
		System.out.println();
		mart2.sell(guest3, 5, 10000);
		System.out.println();
			
//		System.out.println("편의점 결제");
//		mart1.sell(guest, 5, 12000);
//		System.out.println();
//		mart1.sell(vipguest2, 5, 14000);
//		System.out.println();
//		mart1.sell(vvipguest3, 10, 30000);
//		System.out.println();
		
//		System.out.println("마트 결제");
//		mart.sell(guest, 5, 12000);
//		System.out.println();
//		mart.sell(vipguest2, 5, 30000);
//		System.out.println();
//		mart.sell(vvipguest3, 12, 40000);
//		System.out.println();
	
		
	}
}
