package com.ktdsuniversity.edu.fp.basic.calc;

public class Test {

	public static void main(String[] args) {
		Calculator calc = new Calculator();

		// num1과 num2를 더해 반환한다.
		int result = calc.calc(1, 2, (num1, num2) -> num1 + num2);
		System.out.println(result);

		// num1의 num2를 제곱한 수를 반환
//		int result1 = calc.calc(2, 4, (num1, num2) -> (int)Math.pow(num1, num2));

		int result1 = calc.calc(2, 4, Math::powExact);
		System.out.println("num1의 num2를 제곱한 수를 반환 : " + result1);

		// num1, num2중 큰 수를 반환
//		int result2 = calc.calc(3, 6, (num1, num2) -> {
//			int i = 0;
//			if (num1 > num2) {
//				i = num1;
//			} else if (num1 < num2) {
//				i = num2;
//			}
//			return i;
//		});

//		int result2 = calc.calc(284, 273, (num1, num2) -> Math.max(num1, num2));

		int result2 = calc.calc(284, 273, Math::max);
		System.out.println("num1, num2중 큰 수를 반환 : " + result2);

		// num1, num2중 작은 수를 반환
//		int result3 = calc.calc(284, 273, (num1, num2) -> {
//			int i = 0;
//			if (num1 < num2) {
//				i = num1;
//			} else if (num1 > num2) {
//				i = num2;
//			}
//			return i;
//		});

//		int result3 = calc.calc(284, 273, (num1, num2) -> Math.min(num1, num2));

		int result3 = calc.calc(284, 273, Math::min);
		System.out.println("num1, num2중 작은 수를 반환 : " + result3);

		// num1이 num2의 배수라면 0을 반환, 아니면 1을 반환
//		int result4 = calc.calc(7, 49, (num1, num2) -> {
//			int i = 0;
//			if (num2 % num1 == 0) {
//				i = 0;
//			} else {
//				i = 1;
//			}
//			return i;
//		});
		
		int result4 = calc.calc(12, 5, (num1, num2) -> num1 % num2 == 0 ? 0 : 1);
		System.out.println("num1이 num2의 배수라면 0을 반환, 아니면 1을 반환 : " + result4);
	}
}
