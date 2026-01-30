package com.ktdsuniversity.edu.exceptions;

public class RandomExtractNumbers {
	private String[] numbers;

	public RandomExtractNumbers() {
		this.numbers = new String[100];

		int index = 0;
		for (int i = 0; i < 10; i++) {
			// 0 ~ 99 하나.
			index = (int) (Math.random() * this.numbers.length);
			this.numbers[index] = (int) (Math.random() * 1_000_000) + "";
		}

		for (int i = 0; i < 10; i++) {
			// 0 ~ 99 하나.
			index = (int) (Math.random() * this.numbers.length);
			this.numbers[index] = (char) ((int) (Math.random() * 26) + 97) + "";
		}
	}

	public void printNumber(int index) {
		// this.numbers의 index에 존재하는 값을 출력 System.out.println(this.numbers[index]);
		// 값이 숫자인 경우 그대로 출력
		// 숫자가 아닌 경우 0을 출력

		if (index < 0 || index >= this.numbers.length) {
			System.out.println("Index : " + index + " - Out of range. - Result : " + 0);
			return;
		} // 존재하는 값 출력

		String value = this.numbers[index];
		if (value == null) {
			System.out.println("Index : " + index + " - Null. - Result : " + 0);
			return;
		}

		if (value.matches("^[0-9]+$")) {
			int intValue = Integer.parseInt(value);
			System.out.println(intValue);
		} else {
			System.out.println("Index : " + index + " - " + value + " is worng number format. Result : " + 0);
		}

	}

	// 위와 같은 코드, 위는 하나하나의 사례마다 예외처리를 해준거고 밑에는 한번에 해준 것.
	public void printNumber2(int index) {
		if (index >= 0 && index < this.numbers.length) {
			String value = this.numbers[index];
			if (value != null && value.matches("^[0-9]+$")) {
				int intValue = Integer.parseInt(value);
				System.out.println(intValue);
				return;
			}
		}
	}

	public static void main(String[] args) {
		RandomExtractNumbers ren = new RandomExtractNumbers();
		int index = 0;
		for (int i = 0; i < 50; i++) {
			index = (int) (Math.random() * 200);
			ren.printNumber(index);
		}
	}
}
