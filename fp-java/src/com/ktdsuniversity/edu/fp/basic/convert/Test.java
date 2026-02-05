package com.ktdsuniversity.edu.fp.basic.convert;

public class Test {
	public static void main(String[] args) {
		Converter converter = new Converter();

		// 숫자로 변환한 결과를 반환.
		converter.printConvertResult("10", str -> Integer.parseInt(str));
		converter.printConvertResult("10", Integer::parseInt);

		converter.printConvertResult("asdfqeh", str -> str.length());
		converter.printConvertResult("asdfqeh", String::length);

	}
}
