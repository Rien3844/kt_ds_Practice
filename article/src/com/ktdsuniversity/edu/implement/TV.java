package com.ktdsuniversity.edu.implement;

public interface TV {

	public abstract void turnOn();

	void turnOff();// 앞의 public abstract 생략 가능.

	void changechannel(int channelNumber);

	void changeVolume(int volume);
}
