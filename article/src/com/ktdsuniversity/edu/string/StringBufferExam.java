package com.ktdsuniversity.edu.string;

public class StringBufferExam {
	public static void main(String[]args) {
		StringBuffer sb = new StringBuffer();
		sb.append("asdfasdfasfadsf");
		sb.append("hulhuilhuilhuil");
		sb.append("vbnmnvbmnbvmnbm");
		sb.append("werqerqwerwqrwq");
		sb.append("yuioyuioyuiouio");
		sb.append("fkgjkglghlhjgkj");
		sb.append("rtuyrtutruytruy");
		
		String str = sb.toString();
		System.out.println(str);
		
		StringBuffer longString = new StringBuffer();
		for(int i = 0; i < 100; i++) {
			longString.append("asdfasdfasd");
		}
		
		String resultString = longString.toString();
		System.out.println(resultString);
	}
	
	public static void appendString(StringBuffer buffer) {
		buffer.append("1323134");
	}
}
