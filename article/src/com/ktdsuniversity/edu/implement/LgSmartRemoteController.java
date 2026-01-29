package com.ktdsuniversity.edu.implement;

public class LgSmartRemoteController implements LgRemoteController {

	@Override
	public void turnOn(TV tv) {
		tv.turnOn();
	}

	@Override
	public void turnOff(TV tv) {
		tv.turnOff();
	}

	@Override
	public void changechannel(TV tv, int channelNumber) {
		tv.changechannel(channelNumber);
	}

	@Override
	public void changeVolume(TV tv, int volume) {
		tv.changeVolume(volume);
	}

	@Override
	public void runNetflix(LgSmartTV tv) {
		tv.runNetflix();
	}

	@Override
	public void runInternet(LgSmartTV tv) {
		tv.runInternet();
	}

	@Override
	public void runYoutube(LgSmartTV tv) {
		tv.runYoutube();
	}

}
