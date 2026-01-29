package com.ktdsuniversity.edu.implement;

public class Test {
	public static void main(String[] args) {
		LgSmartTV lgTV = new LgTV();
		SamsungSmartTV samsungTV = new SamsungTV();

		LgRemoteController lgRemoteCon = new LgSmartRemoteController();
		SamsungRemoteController samsungRemoteCon = new SamsungSmartRemoteController();

		lgTV.turnOn();
		lgTV.changeVolume(13);
		lgTV.runNetflix();
		lgTV.turnOn();

		System.out.println();

		samsungTV.turnOn();
		samsungTV.runCoupangPlay();
		samsungTV.changechannel(20);
		samsungTV.turnOff();

		lgRemoteCon.turnOn(lgTV);
		lgRemoteCon.runYoutube(lgTV);

		lgRemoteCon.turnOn(samsungTV);
//		lgRemoteCon.runNetflix(samsungTv);
		// 다형성으로 인해 TV interface안의 내용을 SamsungTV에서도 사용할 수 있다.
		// but, SamsungSmartTV의 기능은 사용할 수 없다.

		samsungRemoteCon.runCoupangPlay(samsungTV);
//		samsungRemoteCon.runNetflix(lgTV);

	}
}
// implement패키지 안에서 클래스를 사용하는 것은 Test뿐이다. 
// ==> 결합도 하락 - 코드 유연성 상승.