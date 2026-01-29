package com.ktdsuniversity.edu.implement;

public class LgTV implements LgSmartTV {

	@Override
	public void turnOn() {
		System.out.println("엘지 티비를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("엘지 티비를 끕니다.");
	}

	@Override
	public void changechannel(int channelNumber) {
		System.out.println("엘지 티비의 채널을 바꿉니다." + channelNumber);
	}

	@Override
	public void changeVolume(int volume) {
		System.out.println("엘지 티비의 볼륨을 조절합니다." + volume);
	}

	@Override
	public void runNetflix() {
		System.out.println("엘지 티비의 넷플릭스를 켭니다.");
	}

	@Override
	public void runInternet() {
		System.out.println("엘지 티비의 인터넷을 켭니다.");
	}

	@Override
	public void runYoutube() {
		System.out.println("엘지 티비의 유튜브를 켭니다.");
	}

}
