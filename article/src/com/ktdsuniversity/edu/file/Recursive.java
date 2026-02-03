package com.ktdsuniversity.edu.file;

public class Recursive {

	public void print(int number) {
		System.out.println("출력합니다." + number);
		print(number + 1);
	}

	public static void main(String[] args) {
		Recursive r = new Recursive();
		r.print(1);
	}
}
