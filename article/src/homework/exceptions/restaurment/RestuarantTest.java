package homework.exceptions.restaurment;

import java.util.ArrayList;
import java.util.List;

import homework.exceptions.restaurment.custom.DrunkenException;
import homework.exceptions.restaurment.custom.FullException;
import homework.exceptions.restaurment.custom.NotEnoughMoneyException;
import homework.exceptions.restaurment.custom.SoldOutException;

public class RestuarantTest {

	public static void main(String[] args) {

		List<Menu> vipsMenus = new ArrayList<>();
		vipsMenus.add(new Menu(Item.ALCOHOL, 0, 19, 5000, 100, "포트와인"));
		vipsMenus.add(new Menu(Item.ALCOHOL, 0, 6, 30, 1, "호로요이"));
		vipsMenus.add(new Menu(Item.ALCOHOL, 0, 40, 5000, 15, "추사"));
		vipsMenus.add(new Menu(Item.FOOD, 1000, 0, 42000, 200, "스테이크 플래터"));
		vipsMenus.add(new Menu(Item.FOOD, 300, 0, 8000, 70, "크림스파게티"));
		
		List<Menu> outbackMenus = new ArrayList<>();
		outbackMenus.add(new Menu(Item.ALCOHOL, 0, 19, 1000, 60, "포트와인"));
		outbackMenus.add(new Menu(Item.ALCOHOL, 0, 6, 2000, 80, "호로요이"));
		outbackMenus.add(new Menu(Item.ALCOHOL, 0, 30, 5000, 15, "블랙조커"));
		outbackMenus.add(new Menu(Item.FOOD, 500, 0, 18000, 200, "토마호크 스테이크"));
		outbackMenus.add(new Menu(Item.FOOD, 300, 0, 8000, 70, "토마토 스파게티"));
		// 정한 크기 넘어서 배열 만들때 - ArrayIndexOutOfBoundsException

		Restuarant vips = new Restuarant("VIPS", vipsMenus, 1000, 10);
		Restuarant outback = new Restuarant("OUTBACK", outbackMenus, 300, 3);

		Customer customer1 = new Customer("고객1", 100000);
		Customer customer2 = new Customer("고객2", 30000);
		Customer customer3 = new Customer("고객3", 10000);

		try {
			customer1.order(vips, 3);
		} catch (DrunkenException | FullException | NotEnoughMoneyException | SoldOutException e) {
			System.out.println(e.getMessage());
		}
		try {
			customer1.order(vips, 3);
		} catch (DrunkenException de) {
			System.out.println(de.getMessage());
		} catch (FullException fe) {
			System.out.println(fe.getMessage());
		} catch (NotEnoughMoneyException nem) {
			System.out.println(nem.getMessage());
		} catch (SoldOutException soe) {
			System.out.println(soe.getMessage());
		} // 배부름

		try {
			customer2.order(outback, 2);
		} catch (DrunkenException de) {
			System.out.println(de.getMessage());
		} catch (FullException fe) {
			System.out.println(fe.getMessage());
		} catch (NotEnoughMoneyException nem) {
			System.out.println(nem.getMessage());
		} catch (SoldOutException soe) {
			System.out.println(soe.getMessage());
		}
		try {
			customer2.order(outback, 2);
		} catch (DrunkenException de) {
			System.out.println(de.getMessage());
		} catch (FullException fe) {
			System.out.println(fe.getMessage());
		} catch (NotEnoughMoneyException nem) {
			System.out.println(nem.getMessage());
		} catch (SoldOutException soe) {
			System.out.println(soe.getMessage());
		} // 너무 취함

		try {
			customer3.order(vips, 1);
		} catch (DrunkenException de) {
			System.out.println(de.getMessage());
		} catch (FullException fe) {
			System.out.println(fe.getMessage());
		} catch (NotEnoughMoneyException nem) {
			System.out.println(nem.getMessage());
		} catch (SoldOutException soe) {
			System.out.println(soe.getMessage());
		}
		try {
			customer3.order(vips, 1);
		} catch (DrunkenException de) {
			System.out.println(de.getMessage());
		} catch (FullException fe) {
			System.out.println(fe.getMessage());
		} catch (NotEnoughMoneyException nem) {
			System.out.println(nem.getMessage());
		} catch (SoldOutException soe) {
			System.out.println(soe.getMessage());
		} // 품절

		customer1.order(vips, 7);// 존재하지 않는 메뉴 >> 입력된 menuIndex의 값이 menu.length보다 긴경우.

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