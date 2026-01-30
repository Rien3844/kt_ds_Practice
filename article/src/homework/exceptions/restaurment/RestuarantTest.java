package homework.exceptions.restaurment;

import homework.exceptions.restaurment.custom.DrunkenException;
import homework.exceptions.restaurment.custom.FullException;
import homework.exceptions.restaurment.custom.NotEnoughMoney;
import homework.exceptions.restaurment.custom.SoldOutException;
import homework.exceptions.restaurment.custom.WithoutMenuException;

public class RestuarantTest {

	public static void main(String[] args) {

		Menu[] vipsMenus = new Menu[5];
		vipsMenus[0] = new Menu(true, 0, 19, 5000, 100, "포트와인"); // 주류
		vipsMenus[1] = new Menu(true, 0, 6, 30, 1, "호로요이"); // 주류
		vipsMenus[2] = new Menu(true, 0, 40, 5000, 15, "추사"); // 주류
		vipsMenus[3] = new Menu(false, 1000, 0, 42000, 200, "스테이크 플래터"); // 식사류
		vipsMenus[4] = new Menu(false, 300, 0, 8000, 70, "크림스파게티"); // 식사류

		Menu[] outbackMenus = new Menu[5];
		outbackMenus[0] = new Menu(true, 0, 19, 1000, 60, "포트와인"); // 주류
		outbackMenus[1] = new Menu(true, 0, 6, 2000, 80, "호로요이"); // 주류
		outbackMenus[2] = new Menu(true, 0, 30, 5000, 15, "블랙조커"); // 주류
		outbackMenus[3] = new Menu(false, 500, 0, 18000, 200, "토마호크 스테이크"); // 식사류
		outbackMenus[4] = new Menu(false, 300, 0, 8000, 70, "토마토 스파게티"); // 식사류

		Restuarant vips = new Restuarant("VIPS", vipsMenus, 1000, 10);
		Restuarant outback = new Restuarant("OUTBACK", outbackMenus, 300, 3);

		Customer customer1 = new Customer("고객1", 100000);
		Customer customer2 = new Customer("고객2", 30000);
		Customer customer3 = new Customer("고객3", 10000);

		try {
			customer1.order(vips, 7);
		} catch (DrunkenException de) {
			System.out.println(de.getMessage());
		} catch (FullException fe) {
			System.out.println(fe.getMessage());
		} catch (NotEnoughMoney nem) {
			System.out.println(nem.getMessage());
		} catch (SoldOutException soe) {
			System.out.println(soe.getMessage());
		} catch (WithoutMenuException wme) {
			System.out.println(wme.getMessage());
		} // 존재하지않는메뉴
		try {
			customer1.order(vips, 3);
		} catch (DrunkenException de) {
			System.out.println(de.getMessage());
		} catch (FullException fe) {
			System.out.println(fe.getMessage());
		} catch (NotEnoughMoney nem) {
			System.out.println(nem.getMessage());
		} catch (SoldOutException soe) {
			System.out.println(soe.getMessage());
		} catch (WithoutMenuException wme) {
			System.out.println(wme.getMessage());
		}
		try {
			customer1.order(vips, 3);
		} catch (DrunkenException de) {
			System.out.println(de.getMessage());
		} catch (FullException fe) {
			System.out.println(fe.getMessage());
		} catch (NotEnoughMoney nem) {
			System.out.println(nem.getMessage());
		} catch (SoldOutException soe) {
			System.out.println(soe.getMessage());
		} catch (WithoutMenuException wme) {
			System.out.println(wme.getMessage());
		} // 배부름

		try {
			customer2.order(outback, 2);
		} catch (DrunkenException de) {
			System.out.println(de.getMessage());
		} catch (FullException fe) {
			System.out.println(fe.getMessage());
		} catch (NotEnoughMoney nem) {
			System.out.println(nem.getMessage());
		} catch (SoldOutException soe) {
			System.out.println(soe.getMessage());
		} catch (WithoutMenuException wme) {
			System.out.println(wme.getMessage());
		}
		try {
			customer2.order(outback, 2);
		} catch (DrunkenException de) {
			System.out.println(de.getMessage());
		} catch (FullException fe) {
			System.out.println(fe.getMessage());
		} catch (NotEnoughMoney nem) {
			System.out.println(nem.getMessage());
		} catch (SoldOutException soe) {
			System.out.println(soe.getMessage());
		} catch (WithoutMenuException wme) {
			System.out.println(wme.getMessage());
		} // 너무 취함

		try {
			customer3.order(vips, 1);
		} catch (DrunkenException de) {
			System.out.println(de.getMessage());
		} catch (FullException fe) {
			System.out.println(fe.getMessage());
		} catch (NotEnoughMoney nem) {
			System.out.println(nem.getMessage());
		} catch (SoldOutException soe) {
			System.out.println(soe.getMessage());
		} catch (WithoutMenuException wme) {
			System.out.println(wme.getMessage());
		}
		try {
			customer3.order(vips, 1);
		} catch (DrunkenException de) {
			System.out.println(de.getMessage());
		} catch (FullException fe) {
			System.out.println(fe.getMessage());
		} catch (NotEnoughMoney nem) {
			System.out.println(nem.getMessage());
		} catch (SoldOutException soe) {
			System.out.println(soe.getMessage());
		} catch (WithoutMenuException wme) {
			System.out.println(wme.getMessage());// 재고부족
		}
//		customer1.order(vips, 2);
//		customer1.order(vips, 1);
//		customer1.order(vips, 4);
//		customer1.order(outback, 3);
//		customer1.order(vips, 3);
//
//		customer2.order(outback, 4);
//		customer2.order(vips, 1);
//		customer2.order(vips, 2);
//		customer2.order(outback, 3);
//		customer2.order(vips, 2);
//
//		customer3.order(vips, 2);
//		customer3.order(outback, 3);
//		customer3.order(vips, 4);
//		customer3.order(vips, 4);
//		customer3.order(vips, 3);

		vips.printStatus();
		outback.printStatus();
	}

}