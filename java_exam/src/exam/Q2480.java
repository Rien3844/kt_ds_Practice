package exam;

public class Q2480 {

	public static void main(String[] args) {
		int a = 6;
		int b = 2;
		int c = 5;
		
		if(a == b && b == c) {
			int same = a;
			System.out.println(10000 + (same * 1000));
		}else if(a == b || a == c) {
			int same = a;
			System.out.println(1000 + (same * 100));
		}else if(b == c) {
			int same = b;
			System.out.println(1000 + (same * 100));
		}else {
			if(a > b && a > c) {
				System.out.println(a * 100);
			}else if(b > a && b > c) {
				System.out.println(b * 100);
			}else {
				System.out.println(c * 100);
			}
		}
	}

}
//https://www.acmicpc.net/problem/2480