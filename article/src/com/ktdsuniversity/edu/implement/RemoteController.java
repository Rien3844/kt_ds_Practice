package com.ktdsuniversity.edu.implement;

public interface RemoteController {

	public abstract void turnOn(TV tv);

	void turnOff(TV tv);// 앞의 public abstract 생략 가능.

	void changechannel(TV tv, int channelNumber);

	void changeVolume(TV tv, int volume);
}
