package com.ktdsuniversity.edu.anonymous;

import com.ktdsuniversity.edu.abstracts.AbstractMart;
import com.ktdsuniversity.edu.abstracts.Guest;
import com.ktdsuniversity.edu.implement.TV;

public class AnonymousClass {
	public static void main(String[] args) {
		AbstractMart mart = new AbstractMart(1500) {

			@Override
			public int usePoint(Guest guest) {
				return 0;
			}

			@Override
			public void givePoint(Guest guest, int amount) {
				guest.addPoint(10000000);
			}

			@Override
			public int discount(Guest guest, int amount) {
				return amount;
			}
		};
		Guest guest = new Guest(0, 0);
		mart.sell(guest, 10000, 0);
		System.out.println(guest);

		System.out.println();

		TV emartTV = new TV() {

			@Override
			public void turnOn() {
				System.out.println("emt");
			}

			@Override
			public void turnOff() {
				System.out.println("emtoff");
			}

			@Override
			public void changechannel(int channelNumber) {
				System.out.println("emtcc");
			}

			@Override
			public void changeVolume(int volume) {
				System.out.println("emtvc");
			}
		};

		emartTV.turnOn();
		emartTV.turnOff();
		emartTV.changechannel(3);
		emartTV.changeVolume(7);

		System.out.println();

		System.out.println(mart);
		System.out.println(emartTV);
	}
}
