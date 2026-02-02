package com.ktdsuniversity.edu.generics;

import java.util.Arrays;

public class ScoreListTest {

	public static void main(String[] args) {

		ScoreList<Integer, Integer> list = new ScoreList<>();
		list.add(12352135);
		list.add(123135);
		list.add(1535235);
		list.add(1535235);
		list.add(15352353);
		list.add(15352351);
		list.add(15352352);
		list.add(15352355);
		list.add(15352357);
		list.add(15352359);
		list.add(15352350);
		list.add(1535234);
		list.add(1535231);
		list.add(1535232);
		list.add(1535233);
		list.add(1535237);
		list.add(1535239);
		list.add(1535535);
		list.add(1535435);
		list.add(1535335);

		Reducer<Integer, Integer> listReducer = new Reducer<>() {
			@Override
			public Integer reduce(Integer input, Integer output) {
				return input + output;
			}
		};

		int sum = list.sum(listReducer, 0);
		System.out.println(sum);

		int value = list.get(3);
		System.out.println(value);

		ScoreList<String, String> strList = new ScoreList<>();
		strList.add("asdf");
		strList.add("qwer");
		strList.add("zxcv");
		String strValue = strList.get(0);
		System.out.println(strValue);

		String concat = "";
		for (int i = 0; i < 3; i++) {
			concat += strList.get(i);
		}
		System.out.println(concat);

		ScoreList<String[], String[]> arrayList = new ScoreList<>();
		arrayList.add(new String[] { "asdf", "zxcv", "qwer" });
		arrayList.add(new String[] { "tyui", "ghjk", "bnm," });
		arrayList.add(new String[] { "op[]", "kl;'", "m,./" });
		String[] arrayValue = arrayList.get(1);
		System.out.println(Arrays.toString(arrayValue));

		Reducer<String[], String> arrayReducer = new Reducer<>() {

			@Override
			public String reduce(String[] input, String output) {
				for (int i = 0; i < input.length; i++) {
					output += input[i];
				}
				return output;
			}
		};
		String arrayResult = arrayList.sum(arrayReducer, "");
		System.out.println(arrayResult);
	}
}
