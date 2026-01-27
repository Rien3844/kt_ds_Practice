package com.ktdsuniversity.edu.string;

public class StringConcat {
	
	public static void main(String[] args) {
		String abcd = "Asdfasdfasdfasdffdsf";
		int i = 0;
		while(true) {
			abcd += abcd;
			i++;
			if(i>100) {
				break;
			}
		}
		System.out.println("완료되었습니다.");
	}
	
}
