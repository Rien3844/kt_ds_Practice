package com.ktdsuniversity.edu.singleton;

public class Me {

	// 전역 => static
	private static Me me;
	// 생성자가 존재하는데 생성자가 공개되어있지 않다.
	private String name;

	private Me() {
		this.name = "김선우";
	}
	
	public static Me getInstance() {
		
		if(Me.me == null) {
			Me.me = new Me();
		}
		return Me.me;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
