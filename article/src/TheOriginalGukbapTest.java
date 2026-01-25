package com.ktdsuniversity.edu.restaurment;

import com.ktdsuniversity.edu.restaurment.menu.Drink;
import com.ktdsuniversity.edu.restaurment.menu.Gukbap;

public class TheOriginalGukbapTest {
	public static void main(String[] args) {
		Gukbap[] gukbapMenu = {
			new Gukbap("순대 국밥", 50, 9000),
			new Gukbap("돼지 국밥", 60, 8000),
			new Gukbap("내장탕", 60, 11000),
			new Gukbap("설렁탕", 60, 12_000),
			new Gukbap("\"특\"갈비탕", 80, 14_000),
			new Gukbap("수육", 40, 32000),
			new Gukbap("순대", 30, 8000),
			new Gukbap("만두", 20, 4000),
			new Gukbap("편육", 35, 10000),
		};
		
		Drink[] drinkMenu = {
			new Drink("소주", 14, 3000),
			new Drink("맥주", 6, 4000),
			new Drink("막걸리", 13, 4000),
			new Drink("콜라", 0, 2000),
			new Drink("사이다", 0, 2000)
		};
		
		TheOriginalGukbap gukbapZip = new TheOriginalGukbap(250, 10.0, gukbapMenu, drinkMenu);
		Customer cus1 = new Customer(40, 0, 100000);
		Customer cus2 = new Customer(100, 9.5, 50000);
		Customer cus3 = new Customer(200, 5, 80000);
		
		cus1.gukbapOrder(gukbapZip, 3);
		cus1.drinkOrder(gukbapZip, 2);

		cus2.gukbapOrder(gukbapZip, 4);
		cus2.drinkOrder(gukbapZip, 2);
		cus2.drinkOrder(gukbapZip, 2);
		
		cus3.gukbapOrder(gukbapZip, 4);
		cus3.drinkOrder(gukbapZip, 0);
	}
}
