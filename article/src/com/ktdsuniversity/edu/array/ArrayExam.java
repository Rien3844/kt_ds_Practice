package com.ktdsuniversity.edu.array;

public class ArrayExam {

	public static void main(String[] args) {
		int[] numArray = new int[10];
		//배열의 길이가 바로 정해지는 케이스.
		numArray[0] = 10;
		
		String[] strArray = new String[] {"A", "B", "C", "D", "E"};
		// == String[] strArray = new String[0];
		// 쓰고 싶은 값을 {}안에 넣어서 바로 값을 할당 ==> 길이가 나중에 정해지는 케이스.
		System.out.println(strArray[0]);
		
		String[] strArray2 = {"A", "B", "C", "D", "E"};//위와 같음.
		
		
	}
}
