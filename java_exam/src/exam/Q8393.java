package exam;

public class Q8393 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int a = 1;
		int answer = 0;
		while(a <= n) {
			answer += a;
			a++;
		}
		System.out.println(answer);

		System.out.println();
		
		answer = 0;
		for(int i = 1; i < n + 1; i++) {
			answer += i;
		}System.out.println(answer);

	}

}
//https://www.acmicpc.net/problem/8393