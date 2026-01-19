package exam;

public class Q2753 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2000;
		int fourMultiple = year % 4;
		int oneHundMultiple = year % 100;
		int fourHundMultiple = year % 400;
		
		if(fourMultiple == 0 && 
		(oneHundMultiple != 0 || fourHundMultiple == 0)) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}

}
//https://www.acmicpc.net/problem/2753
