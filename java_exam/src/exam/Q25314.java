package exam;

public class Q25314 {

	public static void main(String[] args) {
		int N = 20;
		int a = N / 4;
		int answer = 0;
		
		while(answer < a) {
			System.out.print("long ");
			answer++;
		}
		System.out.println("int");
		
		System.out.println();
		
		for(int i = 0; i < a; i++) {
			System.out.print("long ");
		}System.out.println("int");
	}

}
//https://www.acmicpc.net/problem/25314