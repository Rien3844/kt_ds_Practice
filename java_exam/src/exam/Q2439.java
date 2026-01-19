package exam;

public class Q2439 {
	public static void main(String[]args) {
		int a = 0;
		int b = 4;
		int c = 0;
		int n = 5;
		
		while(a < n) {
			b = 3;
			c = 0;
			while(b >= a) {
				System.out.print(" ");
				b--;
			}while(c <= a) {
				System.out.print("*");
				c++;
			}
			System.out.println("");
			a++;
		}
	}
	
}
//https://www.acmicpc.net/problem/2439
