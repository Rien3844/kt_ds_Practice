package com.ktdsuniversity.edu.file;

//탐색기 만들기 전 재귀호출 연습
public class Recursive {

	public void print(int number) {
		System.out.println("출력합니다. - " + number);
		if (number < 3) {
			print(number + 1);
			System.out.println((number) + "스택 실행을 완료했습니다.");
		}
	}

	public void printNumber(int n) {
		System.out.println(n);
		if (n > 0) {
			printNumber(n - 1);
		}
	}

	public int sumToZero(int start) {

		if (start == 1) {
			return 1;
		}
		return start +  sumToZero(start - 1);
	}

	public static void main(String[] args) {
		Recursive r = new Recursive();
		// r.print(1);
		r.printNumber(2000); // 2000 ~ 0
		int result = r.sumToZero(5);
		System.out.println(result);
	}

}
