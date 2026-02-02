package com.ktdsuniversity.edu.generics.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListExam {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("ksw1");
		names.add("ksw2");
		names.add("ksw3");
		names.add("ksw4");
		names.add("ksw5");
		
		System.out.println(names);
		String name = null;
		for(int i = 0; i < names.size(); i++) {
			name = names.get(i);
			System.out.println(name);
		}
		System.out.println("-------------------------------");
		for(String name2 : names) {
			System.out.println(name2);
		}
		System.out.println("-------------------------------");
		
		int[] arr = new int[] {1, 2, 3};
		for(int value : arr) {
			System.out.println(value);
		}//for-each문
		// ==> for(int i = 0; i < arr.length; i++)와 같은 반복문
	}
}
