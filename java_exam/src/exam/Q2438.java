package exam;

public class Q2438 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 0;
		int n = 5;
		while(a < n) {
			b = 0;
			while(b <= a) {
				System.out.print("*");
				b++;
			}
			System.out.println();
			a++;
		}
	}

}
//https://www.acmicpc.net/problem/2438