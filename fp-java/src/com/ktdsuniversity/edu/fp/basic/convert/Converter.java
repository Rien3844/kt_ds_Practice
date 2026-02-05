package com.ktdsuniversity.edu.fp.basic.convert;

public class Converter {

	public void printConvertResult(String str, Changer changer) {
		int result = changer.changeToInt(str);
		System.out.println(result);
	}
}
