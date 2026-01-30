package com.ktdsuniversity.edu.exceptions;

public class ExceptionExam {
	public static void nullExam(String str) {
		// 모든 인스턴스에서 .을 사용할 때 무조건 null체크를 해야 하는가?
		// .을 사용하려는 인스턴스가 null이 될 수 있는 가능성이 조금이라도 존재할 때만 null체크를 진행.
		// str이 비어있지 않으면 내용을 출력한다.
		if (str != null && !str.isEmpty()) {
			System.out.println(str);
		}
	}

	public static void arrayIndexExam(String[] arr, int index) {
		if (arr != null && index >= 0 && index < arr.length) {
			System.out.println(arr[index]);
		}
	}

	public static void numberFormatExam(String str) {

		str = str.replace("_", "");
		// 숫자를 정수로 변경한다.
		if (str.matches("^[0-9]+${1,10}")) {

			long tempNum = Long.parseLong(str);
			if (tempNum > Integer.MAX_VALUE) {
				tempNum = 0;
			}
			int num = (int) tempNum;
			System.out.println(num);
		} else {
			System.out.println(0);
		}
	}

	public static void main(String[] args) {
//		nullExam("asdf");
//		nullExam("    ");
//		nullExam("");
//		nullExam("418239bkldfa");
//		nullExam(null);

//		System.out.println();

//		arrayIndexExam(new String[] { "a", "b" }, 0);
//		arrayIndexExam(new String[] { "a", "b" }, 1);
//		arrayIndexExam(new String[] { "a", "b" }, 2);
//		arrayIndexExam(new String[] { "a", "b" }, -1);
//		arrayIndexExam(null, -1);
//		arrayIndexExam(null, 0);

		numberFormatExam("10");
		numberFormatExam("2000");
		numberFormatExam("3_000_000"); // 중간의 언더바는 숫자가아님 -> 언더바없애기(직접 지우기 or replace)
		numberFormatExam("3000000000");// int의 범위밖이므로 형변환 불가/
		numberFormatExam("1.231231");// int는 소수점을 가지지 않으므로 정수가 아니라 형변환 불가.
	}
}
