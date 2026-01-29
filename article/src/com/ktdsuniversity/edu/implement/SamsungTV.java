package com.ktdsuniversity.edu.implement;

public class SamsungTV implements SamsungSmartTV {

	@Override
	public void turnOn() {
		System.out.println("삼성 티비를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("삼성 티비를 끕니다.");
	}

	@Override
	public void changechannel(int channelNumber) {
		System.out.println("삼성 티비의 채널을 바꿉니다." + channelNumber);
	}

	@Override
	public void changeVolume(int volume) {
		System.out.println("삼서 티비의 볼륩을 조절합니다." + volume);
	}

	@Override
	public void runNetflix() {
		System.out.println("삼성 티비의 넷플릭스를 켭니다.");
	}

	@Override
	public void runMenu() {
		System.out.println("삼성 티비의 메뉴를 켭니다.");
	}

	@Override
	public void runCoupangPlay() {
		System.out.println("삼성 티비의 쿠팡 플레이를 켭니다.");
	}

}
